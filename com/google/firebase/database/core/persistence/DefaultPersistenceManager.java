package com.google.firebase.database.core.persistence;

import com.google.firebase.database.core.CompoundWrite;
import com.google.firebase.database.core.Context;
import com.google.firebase.database.core.Path;
import com.google.firebase.database.core.UserWriteRecord;
import com.google.firebase.database.core.utilities.Clock;
import com.google.firebase.database.core.utilities.DefaultClock;
import com.google.firebase.database.core.utilities.Utilities;
import com.google.firebase.database.core.view.CacheNode;
import com.google.firebase.database.core.view.QuerySpec;
import com.google.firebase.database.logging.LogWrapper;
import com.google.firebase.database.snapshot.ChildKey;
import com.google.firebase.database.snapshot.EmptyNode;
import com.google.firebase.database.snapshot.IndexedNode;
import com.google.firebase.database.snapshot.Node;
import f.a.b.a.a;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public class DefaultPersistenceManager implements PersistenceManager {
    private final CachePolicy cachePolicy;
    private final LogWrapper logger;
    private long serverCacheUpdatesSinceLastPruneCheck;
    private final PersistenceStorageEngine storageLayer;
    private final TrackedQueryManager trackedQueryManager;

    public DefaultPersistenceManager(Context context, PersistenceStorageEngine persistenceStorageEngine, CachePolicy cachePolicy) {
        this(context, persistenceStorageEngine, cachePolicy, new DefaultClock());
    }

    private void doPruneCheckAfterServerUpdate() {
        long j2 = this.serverCacheUpdatesSinceLastPruneCheck + 1;
        this.serverCacheUpdatesSinceLastPruneCheck = j2;
        if (this.cachePolicy.shouldCheckCacheSize(j2)) {
            if (this.logger.logsDebug()) {
                this.logger.debug("Reached prune check threshold.", new Object[0]);
            }
            this.serverCacheUpdatesSinceLastPruneCheck = 0L;
            boolean z = true;
            long serverCacheEstimatedSizeInBytes = this.storageLayer.serverCacheEstimatedSizeInBytes();
            if (this.logger.logsDebug()) {
                this.logger.debug(a.l("Cache size: ", serverCacheEstimatedSizeInBytes), new Object[0]);
            }
            while (z && this.cachePolicy.shouldPrune(serverCacheEstimatedSizeInBytes, this.trackedQueryManager.countOfPrunableQueries())) {
                PruneForest pruneOldQueries = this.trackedQueryManager.pruneOldQueries(this.cachePolicy);
                if (pruneOldQueries.prunesAnything()) {
                    this.storageLayer.pruneCache(Path.getEmptyPath(), pruneOldQueries);
                } else {
                    z = false;
                }
                serverCacheEstimatedSizeInBytes = this.storageLayer.serverCacheEstimatedSizeInBytes();
                if (this.logger.logsDebug()) {
                    this.logger.debug(a.l("Cache size after prune: ", serverCacheEstimatedSizeInBytes), new Object[0]);
                }
            }
        }
    }

    @Override // com.google.firebase.database.core.persistence.PersistenceManager
    public void applyUserWriteToServerCache(Path path, Node node) {
        if (this.trackedQueryManager.hasActiveDefaultQuery(path)) {
            return;
        }
        this.storageLayer.overwriteServerCache(path, node);
        this.trackedQueryManager.ensureCompleteTrackedQuery(path);
    }

    @Override // com.google.firebase.database.core.persistence.PersistenceManager
    public List<UserWriteRecord> loadUserWrites() {
        return this.storageLayer.loadUserWrites();
    }

    @Override // com.google.firebase.database.core.persistence.PersistenceManager
    public void removeAllUserWrites() {
        this.storageLayer.removeAllUserWrites();
    }

    @Override // com.google.firebase.database.core.persistence.PersistenceManager
    public void removeUserWrite(long j2) {
        this.storageLayer.removeUserWrite(j2);
    }

    @Override // com.google.firebase.database.core.persistence.PersistenceManager
    public <T> T runInTransaction(Callable<T> callable) {
        this.storageLayer.beginTransaction();
        try {
            T call = callable.call();
            this.storageLayer.setTransactionSuccessful();
            return call;
        } finally {
        }
    }

    @Override // com.google.firebase.database.core.persistence.PersistenceManager
    public void saveUserMerge(Path path, CompoundWrite compoundWrite, long j2) {
        this.storageLayer.saveUserMerge(path, compoundWrite, j2);
    }

    @Override // com.google.firebase.database.core.persistence.PersistenceManager
    public void saveUserOverwrite(Path path, Node node, long j2) {
        this.storageLayer.saveUserOverwrite(path, node, j2);
    }

    @Override // com.google.firebase.database.core.persistence.PersistenceManager
    public CacheNode serverCache(QuerySpec querySpec) {
        Set<ChildKey> knownCompleteChildren;
        boolean z;
        if (this.trackedQueryManager.isQueryComplete(querySpec)) {
            TrackedQuery findTrackedQuery = this.trackedQueryManager.findTrackedQuery(querySpec);
            knownCompleteChildren = (querySpec.loadsAllData() || findTrackedQuery == null || !findTrackedQuery.complete) ? null : this.storageLayer.loadTrackedQueryKeys(findTrackedQuery.id);
            z = true;
        } else {
            knownCompleteChildren = this.trackedQueryManager.getKnownCompleteChildren(querySpec.getPath());
            z = false;
        }
        Node serverCache = this.storageLayer.serverCache(querySpec.getPath());
        if (knownCompleteChildren != null) {
            Node Empty = EmptyNode.Empty();
            for (ChildKey childKey : knownCompleteChildren) {
                Empty = Empty.updateImmediateChild(childKey, serverCache.getImmediateChild(childKey));
            }
            return new CacheNode(IndexedNode.from(Empty, querySpec.getIndex()), z, true);
        }
        return new CacheNode(IndexedNode.from(serverCache, querySpec.getIndex()), z, false);
    }

    @Override // com.google.firebase.database.core.persistence.PersistenceManager
    public void setQueryActive(QuerySpec querySpec) {
        this.trackedQueryManager.setQueryActive(querySpec);
    }

    @Override // com.google.firebase.database.core.persistence.PersistenceManager
    public void setQueryComplete(QuerySpec querySpec) {
        if (querySpec.loadsAllData()) {
            this.trackedQueryManager.setQueriesComplete(querySpec.getPath());
        } else {
            this.trackedQueryManager.setQueryCompleteIfExists(querySpec);
        }
    }

    @Override // com.google.firebase.database.core.persistence.PersistenceManager
    public void setQueryInactive(QuerySpec querySpec) {
        this.trackedQueryManager.setQueryInactive(querySpec);
    }

    @Override // com.google.firebase.database.core.persistence.PersistenceManager
    public void setTrackedQueryKeys(QuerySpec querySpec, Set<ChildKey> set) {
        boolean z = true;
        Utilities.hardAssert(!querySpec.loadsAllData(), "We should only track keys for filtered queries.");
        TrackedQuery findTrackedQuery = this.trackedQueryManager.findTrackedQuery(querySpec);
        Utilities.hardAssert((findTrackedQuery == null || !findTrackedQuery.active) ? false : false, "We only expect tracked keys for currently-active queries.");
        this.storageLayer.saveTrackedQueryKeys(findTrackedQuery.id, set);
    }

    @Override // com.google.firebase.database.core.persistence.PersistenceManager
    public void updateServerCache(QuerySpec querySpec, Node node) {
        if (querySpec.loadsAllData()) {
            this.storageLayer.overwriteServerCache(querySpec.getPath(), node);
        } else {
            this.storageLayer.mergeIntoServerCache(querySpec.getPath(), node);
        }
        setQueryComplete(querySpec);
        doPruneCheckAfterServerUpdate();
    }

    @Override // com.google.firebase.database.core.persistence.PersistenceManager
    public void updateTrackedQueryKeys(QuerySpec querySpec, Set<ChildKey> set, Set<ChildKey> set2) {
        boolean z = true;
        Utilities.hardAssert(!querySpec.loadsAllData(), "We should only track keys for filtered queries.");
        TrackedQuery findTrackedQuery = this.trackedQueryManager.findTrackedQuery(querySpec);
        Utilities.hardAssert((findTrackedQuery == null || !findTrackedQuery.active) ? false : false, "We only expect tracked keys for currently-active queries.");
        this.storageLayer.updateTrackedQueryKeys(findTrackedQuery.id, set, set2);
    }

    public DefaultPersistenceManager(Context context, PersistenceStorageEngine persistenceStorageEngine, CachePolicy cachePolicy, Clock clock) {
        this.serverCacheUpdatesSinceLastPruneCheck = 0L;
        this.storageLayer = persistenceStorageEngine;
        LogWrapper logger = context.getLogger("Persistence");
        this.logger = logger;
        this.trackedQueryManager = new TrackedQueryManager(persistenceStorageEngine, logger, clock);
        this.cachePolicy = cachePolicy;
    }

    @Override // com.google.firebase.database.core.persistence.PersistenceManager
    public void applyUserWriteToServerCache(Path path, CompoundWrite compoundWrite) {
        Iterator<Map.Entry<Path, Node>> it = compoundWrite.iterator();
        while (it.hasNext()) {
            Map.Entry<Path, Node> next = it.next();
            applyUserWriteToServerCache(path.child(next.getKey()), next.getValue());
        }
    }

    @Override // com.google.firebase.database.core.persistence.PersistenceManager
    public void updateServerCache(Path path, CompoundWrite compoundWrite) {
        this.storageLayer.mergeIntoServerCache(path, compoundWrite);
        doPruneCheckAfterServerUpdate();
    }
}
