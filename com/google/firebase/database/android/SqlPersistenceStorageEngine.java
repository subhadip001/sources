package com.google.firebase.database.android;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.arthenica.ffmpegkit.Chapter;
import com.google.firebase.database.DatabaseException;
import com.google.firebase.database.core.CompoundWrite;
import com.google.firebase.database.core.Path;
import com.google.firebase.database.core.UserWriteRecord;
import com.google.firebase.database.core.persistence.PersistenceStorageEngine;
import com.google.firebase.database.core.persistence.PruneForest;
import com.google.firebase.database.core.persistence.TrackedQuery;
import com.google.firebase.database.core.utilities.ImmutableTree;
import com.google.firebase.database.core.utilities.NodeSizeEstimator;
import com.google.firebase.database.core.utilities.Pair;
import com.google.firebase.database.core.utilities.Utilities;
import com.google.firebase.database.core.view.QuerySpec;
import com.google.firebase.database.logging.LogWrapper;
import com.google.firebase.database.snapshot.ChildKey;
import com.google.firebase.database.snapshot.ChildrenNode;
import com.google.firebase.database.snapshot.EmptyNode;
import com.google.firebase.database.snapshot.NamedNode;
import com.google.firebase.database.snapshot.Node;
import com.google.firebase.database.snapshot.NodeUtilities;
import com.google.firebase.database.util.JsonMapper;
import f.a.b.a.a;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class SqlPersistenceStorageEngine implements PersistenceStorageEngine {
    private static final int CHILDREN_NODE_SPLIT_SIZE_THRESHOLD = 16384;
    private static final String CREATE_SERVER_CACHE = "CREATE TABLE serverCache (path TEXT PRIMARY KEY, value BLOB);";
    private static final String CREATE_TRACKED_KEYS = "CREATE TABLE trackedKeys (id INTEGER, key TEXT);";
    private static final String CREATE_TRACKED_QUERIES = "CREATE TABLE trackedQueries (id INTEGER PRIMARY KEY, path TEXT, queryParams TEXT, lastUse INTEGER, complete INTEGER, active INTEGER);";
    private static final String CREATE_WRITES = "CREATE TABLE writes (id INTEGER, path TEXT, type TEXT, part INTEGER, node BLOB, UNIQUE (id, part));";
    private static final String FIRST_PART_KEY = ".part-0000";
    private static final String LOGGER_COMPONENT = "Persistence";
    private static final String PART_KEY_FORMAT = ".part-%04d";
    private static final String PART_KEY_PREFIX = ".part-";
    private static final String PATH_COLUMN_NAME = "path";
    private static final String ROW_ID_COLUMN_NAME = "rowid";
    private static final int ROW_SPLIT_SIZE = 262144;
    private static final String SERVER_CACHE_TABLE = "serverCache";
    private static final String TRACKED_KEYS_ID_COLUMN_NAME = "id";
    private static final String TRACKED_KEYS_KEY_COLUMN_NAME = "key";
    private static final String TRACKED_KEYS_TABLE = "trackedKeys";
    private static final String TRACKED_QUERY_ACTIVE_COLUMN_NAME = "active";
    private static final String TRACKED_QUERY_COMPLETE_COLUMN_NAME = "complete";
    private static final String TRACKED_QUERY_ID_COLUMN_NAME = "id";
    private static final String TRACKED_QUERY_LAST_USE_COLUMN_NAME = "lastUse";
    private static final String TRACKED_QUERY_PARAMS_COLUMN_NAME = "queryParams";
    private static final String TRACKED_QUERY_PATH_COLUMN_NAME = "path";
    private static final String TRACKED_QUERY_TABLE = "trackedQueries";
    private static final Charset UTF8_CHARSET = Charset.forName("UTF-8");
    private static final String VALUE_COLUMN_NAME = "value";
    private static final String WRITES_TABLE = "writes";
    private static final String WRITE_ID_COLUMN_NAME = "id";
    private static final String WRITE_NODE_COLUMN_NAME = "node";
    private static final String WRITE_PART_COLUMN_NAME = "part";
    private static final String WRITE_TYPE_COLUMN_NAME = "type";
    private static final String WRITE_TYPE_MERGE = "m";
    private static final String WRITE_TYPE_OVERWRITE = "o";
    private final SQLiteDatabase database;
    private boolean insideTransaction;
    private final LogWrapper logger;
    private long transactionStart = 0;

    /* loaded from: classes2.dex */
    public static class PersistentCacheOpenHelper extends SQLiteOpenHelper {
        private static final int DATABASE_VERSION = 2;

        public PersistentCacheOpenHelper(Context context, String str) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, 2);
        }

        private void dropTable(SQLiteDatabase sQLiteDatabase, String str) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(SqlPersistenceStorageEngine.CREATE_SERVER_CACHE);
            sQLiteDatabase.execSQL(SqlPersistenceStorageEngine.CREATE_WRITES);
            sQLiteDatabase.execSQL(SqlPersistenceStorageEngine.CREATE_TRACKED_QUERIES);
            sQLiteDatabase.execSQL(SqlPersistenceStorageEngine.CREATE_TRACKED_KEYS);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
            Utilities.hardAssert(i3 == 2, "Why is onUpgrade() called with a different version?");
            if (i2 <= 1) {
                dropTable(sQLiteDatabase, SqlPersistenceStorageEngine.SERVER_CACHE_TABLE);
                sQLiteDatabase.execSQL(SqlPersistenceStorageEngine.CREATE_SERVER_CACHE);
                dropTable(sQLiteDatabase, SqlPersistenceStorageEngine.TRACKED_QUERY_COMPLETE_COLUMN_NAME);
                sQLiteDatabase.execSQL(SqlPersistenceStorageEngine.CREATE_TRACKED_KEYS);
                sQLiteDatabase.execSQL(SqlPersistenceStorageEngine.CREATE_TRACKED_QUERIES);
                return;
            }
            throw new AssertionError(a.i("We don't handle upgrading to ", i3));
        }
    }

    public SqlPersistenceStorageEngine(Context context, com.google.firebase.database.core.Context context2, String str) {
        try {
            String encode = URLEncoder.encode(str, "utf-8");
            this.logger = context2.getLogger(LOGGER_COMPONENT);
            this.database = openDatabase(context, encode);
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static String buildAncestorWhereClause(Path path, String[] strArr) {
        int i2 = 0;
        Utilities.hardAssert(strArr.length >= path.size() + 1);
        StringBuilder sb = new StringBuilder("(");
        while (!path.isEmpty()) {
            sb.append("path");
            sb.append(" = ? OR ");
            strArr[i2] = pathToKey(path);
            path = path.getParent();
            i2++;
        }
        sb.append("path");
        sb.append(" = ?)");
        strArr[i2] = pathToKey(Path.getEmptyPath());
        return sb.toString();
    }

    private String commaSeparatedList(Collection<Long> collection) {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Long l2 : collection) {
            long longValue = l2.longValue();
            if (!z) {
                sb.append(",");
            }
            z = false;
            sb.append(longValue);
        }
        return sb.toString();
    }

    private Node deserializeNode(byte[] bArr) {
        try {
            return NodeUtilities.NodeFromJSON(JsonMapper.parseJsonValue(new String(bArr, UTF8_CHARSET)));
        } catch (IOException e2) {
            throw new RuntimeException(a.p("Could not deserialize node: ", new String(bArr, UTF8_CHARSET)), e2);
        }
    }

    private byte[] joinBytes(List<byte[]> list) {
        int i2 = 0;
        for (byte[] bArr : list) {
            i2 += bArr.length;
        }
        byte[] bArr2 = new byte[i2];
        int i3 = 0;
        for (byte[] bArr3 : list) {
            System.arraycopy(bArr3, 0, bArr2, i3, bArr3.length);
            i3 += bArr3.length;
        }
        return bArr2;
    }

    private Node loadNested(Path path) {
        long j2;
        Node deserializeNode;
        Path path2;
        int i2;
        String str;
        Path path3;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        long currentTimeMillis = System.currentTimeMillis();
        Cursor loadNestedQuery = loadNestedQuery(path, new String[]{"path", "value"});
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        long currentTimeMillis3 = System.currentTimeMillis();
        while (loadNestedQuery.moveToNext()) {
            try {
                arrayList.add(loadNestedQuery.getString(0));
                arrayList2.add(loadNestedQuery.getBlob(1));
            } catch (Throwable th) {
                loadNestedQuery.close();
                throw th;
            }
        }
        loadNestedQuery.close();
        long currentTimeMillis4 = System.currentTimeMillis() - currentTimeMillis3;
        long currentTimeMillis5 = System.currentTimeMillis();
        Node Empty = EmptyNode.Empty();
        HashMap hashMap = new HashMap();
        int i3 = 0;
        boolean z = false;
        while (i3 < arrayList2.size()) {
            if (((String) arrayList.get(i3)).endsWith(FIRST_PART_KEY)) {
                j2 = currentTimeMillis2;
                Path path4 = new Path(((String) arrayList.get(i3)).substring(0, str.length() - 10));
                int splitNodeRunLength = splitNodeRunLength(path4, arrayList, i3);
                if (this.logger.logsDebug()) {
                    path3 = path4;
                    this.logger.debug(a.j("Loading split node with ", splitNodeRunLength, " parts."), new Object[0]);
                } else {
                    path3 = path4;
                }
                int i4 = splitNodeRunLength + i3;
                deserializeNode = deserializeNode(joinBytes(arrayList2.subList(i3, i4)));
                i3 = i4 - 1;
                path2 = path3;
            } else {
                j2 = currentTimeMillis2;
                deserializeNode = deserializeNode((byte[]) arrayList2.get(i3));
                path2 = new Path((String) arrayList.get(i3));
            }
            if (path2.getBack() != null && path2.getBack().isPriorityChildName()) {
                hashMap.put(path2, deserializeNode);
            } else if (path2.contains(path)) {
                Utilities.hardAssert(!z, "Descendants of path must come after ancestors.");
                Empty = deserializeNode.getChild(Path.getRelative(path2, path));
            } else if (path.contains(path2)) {
                Empty = Empty.updateChild(Path.getRelative(path, path2), deserializeNode);
                i2 = 1;
                z = true;
                i3 += i2;
                currentTimeMillis2 = j2;
            } else {
                throw new IllegalStateException(String.format("Loading an unrelated row with path %s for %s", path2, path));
            }
            i2 = 1;
            i3 += i2;
            currentTimeMillis2 = j2;
        }
        long j3 = currentTimeMillis2;
        for (Map.Entry entry : hashMap.entrySet()) {
            Empty = Empty.updateChild(Path.getRelative(path, (Path) entry.getKey()), (Node) entry.getValue());
        }
        long currentTimeMillis6 = System.currentTimeMillis() - currentTimeMillis5;
        long currentTimeMillis7 = System.currentTimeMillis() - currentTimeMillis;
        if (this.logger.logsDebug()) {
            this.logger.debug(String.format(Locale.US, "Loaded a total of %d rows for a total of %d nodes at %s in %dms (Query: %dms, Loading: %dms, Serializing: %dms)", Integer.valueOf(arrayList2.size()), Integer.valueOf(NodeSizeEstimator.nodeCount(Empty)), path, Long.valueOf(currentTimeMillis7), Long.valueOf(j3), Long.valueOf(currentTimeMillis4), Long.valueOf(currentTimeMillis6)), new Object[0]);
        }
        return Empty;
    }

    private Cursor loadNestedQuery(Path path, String[] strArr) {
        String pathToKey = pathToKey(path);
        String pathPrefixStartToPrefixEnd = pathPrefixStartToPrefixEnd(pathToKey);
        String[] strArr2 = new String[path.size() + 3];
        String p = a.p(buildAncestorWhereClause(path, strArr2), " OR (path > ? AND path < ?)");
        strArr2[path.size() + 1] = pathToKey;
        strArr2[path.size() + 2] = pathPrefixStartToPrefixEnd;
        return this.database.query(SERVER_CACHE_TABLE, strArr, p, strArr2, null, null, "path");
    }

    private SQLiteDatabase openDatabase(Context context, String str) {
        try {
            SQLiteDatabase writableDatabase = new PersistentCacheOpenHelper(context, str).getWritableDatabase();
            writableDatabase.rawQuery("PRAGMA locking_mode = EXCLUSIVE", null).close();
            writableDatabase.beginTransaction();
            writableDatabase.endTransaction();
            return writableDatabase;
        } catch (SQLiteException e2) {
            if (e2 instanceof SQLiteDatabaseLockedException) {
                throw new DatabaseException("Failed to gain exclusive lock to Firebase Database's offline persistence. This generally means you are using Firebase Database from multiple processes in your app. Keep in mind that multi-process Android apps execute the code in your Application class in all processes, so you may need to avoid initializing FirebaseDatabase in your Application class. If you are intentionally using Firebase Database from multiple processes, you can only enable offline persistence (i.e. call setPersistenceEnabled(true)) in one of them.", e2);
            }
            throw e2;
        }
    }

    private String partKey(Path path, int i2) {
        return pathToKey(path) + String.format(Locale.US, PART_KEY_FORMAT, Integer.valueOf(i2));
    }

    private static String pathPrefixStartToPrefixEnd(String str) {
        Utilities.hardAssert(str.endsWith("/"), "Path keys must end with a '/'");
        return str.substring(0, str.length() - 1) + '0';
    }

    private static String pathToKey(Path path) {
        if (path.isEmpty()) {
            return "/";
        }
        return path.toString() + "/";
    }

    private void pruneTreeRecursive(Path path, final Path path2, ImmutableTree<Long> immutableTree, final ImmutableTree<Long> immutableTree2, PruneForest pruneForest, final List<Pair<Path, Node>> list) {
        if (immutableTree.getValue() != null) {
            int intValue = ((Integer) pruneForest.foldKeptNodes(0, new ImmutableTree.TreeVisitor<Void, Integer>() { // from class: com.google.firebase.database.android.SqlPersistenceStorageEngine.1
                @Override // com.google.firebase.database.core.utilities.ImmutableTree.TreeVisitor
                public Integer onNodeValue(Path path3, Void r2, Integer num) {
                    return Integer.valueOf(immutableTree2.get(path3) == null ? num.intValue() + 1 : num.intValue());
                }
            })).intValue();
            if (intValue > 0) {
                Path child = path.child(path2);
                if (this.logger.logsDebug()) {
                    this.logger.debug(String.format(Locale.US, "Need to rewrite %d nodes below path %s", Integer.valueOf(intValue), child), new Object[0]);
                }
                final Node loadNested = loadNested(child);
                pruneForest.foldKeptNodes(null, new ImmutableTree.TreeVisitor<Void, Void>() { // from class: com.google.firebase.database.android.SqlPersistenceStorageEngine.2
                    @Override // com.google.firebase.database.core.utilities.ImmutableTree.TreeVisitor
                    public Void onNodeValue(Path path3, Void r4, Void r5) {
                        if (immutableTree2.get(path3) == null) {
                            list.add(new Pair(path2.child(path3), loadNested.getChild(path3)));
                            return null;
                        }
                        return null;
                    }
                });
                return;
            }
            return;
        }
        Iterator<Map.Entry<ChildKey, ImmutableTree<Long>>> it = immutableTree.getChildren().iterator();
        while (it.hasNext()) {
            Map.Entry<ChildKey, ImmutableTree<Long>> next = it.next();
            ChildKey key = next.getKey();
            pruneTreeRecursive(path, path2.child(key), next.getValue(), immutableTree2.getChild(key), pruneForest.child(next.getKey()), list);
        }
    }

    private int removeNested(String str, Path path) {
        String pathToKey = pathToKey(path);
        return this.database.delete(str, "path >= ? AND path < ?", new String[]{pathToKey, pathPrefixStartToPrefixEnd(pathToKey)});
    }

    private int saveNested(Path path, Node node) {
        long estimateSerializedNodeSize = NodeSizeEstimator.estimateSerializedNodeSize(node);
        if ((node instanceof ChildrenNode) && estimateSerializedNodeSize > 16384) {
            int i2 = 0;
            if (this.logger.logsDebug()) {
                this.logger.debug(String.format(Locale.US, "Node estimated serialized size at path %s of %d bytes exceeds limit of %d bytes. Splitting up.", path, Long.valueOf(estimateSerializedNodeSize), Integer.valueOf((int) CHILDREN_NODE_SPLIT_SIZE_THRESHOLD)), new Object[0]);
            }
            for (NamedNode namedNode : node) {
                i2 += saveNested(path.child(namedNode.getName()), namedNode.getNode());
            }
            if (!node.getPriority().isEmpty()) {
                saveNode(path.child(ChildKey.getPriorityKey()), node.getPriority());
                i2++;
            }
            saveNode(path, EmptyNode.Empty());
            return i2 + 1;
        }
        saveNode(path, node);
        return 1;
    }

    private void saveNode(Path path, Node node) {
        byte[] serializeObject = serializeObject(node.getValue(true));
        if (serializeObject.length >= ROW_SPLIT_SIZE) {
            List<byte[]> splitBytes = splitBytes(serializeObject, ROW_SPLIT_SIZE);
            if (this.logger.logsDebug()) {
                LogWrapper logWrapper = this.logger;
                StringBuilder A = a.A("Saving huge leaf node with ");
                A.append(splitBytes.size());
                A.append(" parts.");
                logWrapper.debug(A.toString(), new Object[0]);
            }
            for (int i2 = 0; i2 < splitBytes.size(); i2++) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("path", partKey(path, i2));
                contentValues.put("value", splitBytes.get(i2));
                this.database.insertWithOnConflict(SERVER_CACHE_TABLE, null, contentValues, 5);
            }
            return;
        }
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("path", pathToKey(path));
        contentValues2.put("value", serializeObject);
        this.database.insertWithOnConflict(SERVER_CACHE_TABLE, null, contentValues2, 5);
    }

    private void saveWrite(Path path, long j2, String str, byte[] bArr) {
        verifyInsideTransaction();
        this.database.delete(WRITES_TABLE, "id = ?", new String[]{String.valueOf(j2)});
        if (bArr.length >= ROW_SPLIT_SIZE) {
            List<byte[]> splitBytes = splitBytes(bArr, ROW_SPLIT_SIZE);
            for (int i2 = 0; i2 < splitBytes.size(); i2++) {
                ContentValues contentValues = new ContentValues();
                contentValues.put(Chapter.KEY_ID, Long.valueOf(j2));
                contentValues.put("path", pathToKey(path));
                contentValues.put("type", str);
                contentValues.put(WRITE_PART_COLUMN_NAME, Integer.valueOf(i2));
                contentValues.put(WRITE_NODE_COLUMN_NAME, splitBytes.get(i2));
                this.database.insertWithOnConflict(WRITES_TABLE, null, contentValues, 5);
            }
            return;
        }
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put(Chapter.KEY_ID, Long.valueOf(j2));
        contentValues2.put("path", pathToKey(path));
        contentValues2.put("type", str);
        contentValues2.put(WRITE_PART_COLUMN_NAME, (Integer) null);
        contentValues2.put(WRITE_NODE_COLUMN_NAME, bArr);
        this.database.insertWithOnConflict(WRITES_TABLE, null, contentValues2, 5);
    }

    private byte[] serializeObject(Object obj) {
        try {
            return JsonMapper.serializeJsonValue(obj).getBytes(UTF8_CHARSET);
        } catch (IOException e2) {
            throw new RuntimeException("Could not serialize leaf node", e2);
        }
    }

    private static List<byte[]> splitBytes(byte[] bArr, int i2) {
        int length = ((bArr.length - 1) / i2) + 1;
        ArrayList arrayList = new ArrayList(length);
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = i3 * i2;
            int min = Math.min(i2, bArr.length - i4);
            byte[] bArr2 = new byte[min];
            System.arraycopy(bArr, i4, bArr2, 0, min);
            arrayList.add(bArr2);
        }
        return arrayList;
    }

    private int splitNodeRunLength(Path path, List<String> list, int i2) {
        int i3 = i2 + 1;
        String pathToKey = pathToKey(path);
        if (list.get(i2).startsWith(pathToKey)) {
            while (i3 < list.size() && list.get(i3).equals(partKey(path, i3 - i2))) {
                i3++;
            }
            if (i3 < list.size()) {
                if (list.get(i3).startsWith(pathToKey + PART_KEY_PREFIX)) {
                    throw new IllegalStateException("Run did not finish with all parts");
                }
            }
            return i3 - i2;
        }
        throw new IllegalStateException("Extracting split nodes needs to start with path prefix");
    }

    private void updateServerCache(Path path, Node node, boolean z) {
        int i2;
        int i3;
        long currentTimeMillis = System.currentTimeMillis();
        if (!z) {
            i3 = removeNested(SERVER_CACHE_TABLE, path);
            i2 = saveNested(path, node);
        } else {
            int i4 = 0;
            int i5 = 0;
            for (NamedNode namedNode : node) {
                i5 += removeNested(SERVER_CACHE_TABLE, path.child(namedNode.getName()));
                i4 += saveNested(path.child(namedNode.getName()), namedNode.getNode());
            }
            i2 = i4;
            i3 = i5;
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.logger.logsDebug()) {
            this.logger.debug(String.format(Locale.US, "Persisted a total of %d rows and deleted %d rows for a set at %s in %dms", Integer.valueOf(i2), Integer.valueOf(i3), path.toString(), Long.valueOf(currentTimeMillis2)), new Object[0]);
        }
    }

    private void verifyInsideTransaction() {
        Utilities.hardAssert(this.insideTransaction, "Transaction expected to already be in progress.");
    }

    @Override // com.google.firebase.database.core.persistence.PersistenceStorageEngine
    public void beginTransaction() {
        Utilities.hardAssert(!this.insideTransaction, "runInTransaction called when an existing transaction is already in progress.");
        if (this.logger.logsDebug()) {
            this.logger.debug("Starting transaction.", new Object[0]);
        }
        this.database.beginTransaction();
        this.insideTransaction = true;
        this.transactionStart = System.currentTimeMillis();
    }

    @Override // com.google.firebase.database.core.persistence.PersistenceStorageEngine
    public void close() {
        this.database.close();
    }

    @Override // com.google.firebase.database.core.persistence.PersistenceStorageEngine
    public void deleteTrackedQuery(long j2) {
        verifyInsideTransaction();
        String valueOf = String.valueOf(j2);
        this.database.delete(TRACKED_QUERY_TABLE, "id = ?", new String[]{valueOf});
        this.database.delete(TRACKED_KEYS_TABLE, "id = ?", new String[]{valueOf});
    }

    @Override // com.google.firebase.database.core.persistence.PersistenceStorageEngine
    public void endTransaction() {
        this.database.endTransaction();
        this.insideTransaction = false;
        long currentTimeMillis = System.currentTimeMillis() - this.transactionStart;
        if (this.logger.logsDebug()) {
            this.logger.debug(String.format(Locale.US, "Transaction completed. Elapsed: %dms", Long.valueOf(currentTimeMillis)), new Object[0]);
        }
    }

    @Override // com.google.firebase.database.core.persistence.PersistenceStorageEngine
    public List<TrackedQuery> loadTrackedQueries() {
        String[] strArr = {Chapter.KEY_ID, "path", TRACKED_QUERY_PARAMS_COLUMN_NAME, TRACKED_QUERY_LAST_USE_COLUMN_NAME, TRACKED_QUERY_COMPLETE_COLUMN_NAME, "active"};
        long currentTimeMillis = System.currentTimeMillis();
        Cursor query = this.database.query(TRACKED_QUERY_TABLE, strArr, null, null, null, null, Chapter.KEY_ID);
        ArrayList arrayList = new ArrayList();
        while (query.moveToNext()) {
            try {
                try {
                    arrayList.add(new TrackedQuery(query.getLong(0), QuerySpec.fromPathAndQueryObject(new Path(query.getString(1)), JsonMapper.parseJson(query.getString(2))), query.getLong(3), query.getInt(4) != 0, query.getInt(5) != 0));
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            } finally {
                query.close();
            }
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.logger.logsDebug()) {
            this.logger.debug(String.format(Locale.US, "Loaded %d tracked queries in %dms", Integer.valueOf(arrayList.size()), Long.valueOf(currentTimeMillis2)), new Object[0]);
        }
        return arrayList;
    }

    @Override // com.google.firebase.database.core.persistence.PersistenceStorageEngine
    public Set<ChildKey> loadTrackedQueryKeys(long j2) {
        return loadTrackedQueryKeys(Collections.singleton(Long.valueOf(j2)));
    }

    @Override // com.google.firebase.database.core.persistence.PersistenceStorageEngine
    public List<UserWriteRecord> loadUserWrites() {
        byte[] joinBytes;
        UserWriteRecord userWriteRecord;
        String[] strArr = {Chapter.KEY_ID, "path", "type", WRITE_PART_COLUMN_NAME, WRITE_NODE_COLUMN_NAME};
        long currentTimeMillis = System.currentTimeMillis();
        Cursor query = this.database.query(WRITES_TABLE, strArr, null, null, null, null, "id, part");
        ArrayList arrayList = new ArrayList();
        while (query.moveToNext()) {
            try {
                try {
                    long j2 = query.getLong(0);
                    Path path = new Path(query.getString(1));
                    String string = query.getString(2);
                    if (query.isNull(3)) {
                        joinBytes = query.getBlob(4);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        do {
                            arrayList2.add(query.getBlob(4));
                            if (!query.moveToNext()) {
                                break;
                            }
                        } while (query.getLong(0) == j2);
                        query.moveToPrevious();
                        joinBytes = joinBytes(arrayList2);
                    }
                    Object parseJsonValue = JsonMapper.parseJsonValue(new String(joinBytes, UTF8_CHARSET));
                    if (WRITE_TYPE_OVERWRITE.equals(string)) {
                        userWriteRecord = new UserWriteRecord(j2, path, NodeUtilities.NodeFromJSON(parseJsonValue), true);
                    } else if (WRITE_TYPE_MERGE.equals(string)) {
                        userWriteRecord = new UserWriteRecord(j2, path, CompoundWrite.fromValue((Map) parseJsonValue));
                    } else {
                        throw new IllegalStateException("Got invalid write type: " + string);
                    }
                    arrayList.add(userWriteRecord);
                } catch (IOException e2) {
                    throw new RuntimeException("Failed to load writes", e2);
                }
            } finally {
                query.close();
            }
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.logger.logsDebug()) {
            this.logger.debug(String.format(Locale.US, "Loaded %d writes in %dms", Integer.valueOf(arrayList.size()), Long.valueOf(currentTimeMillis2)), new Object[0]);
        }
        return arrayList;
    }

    @Override // com.google.firebase.database.core.persistence.PersistenceStorageEngine
    public void mergeIntoServerCache(Path path, Node node) {
        verifyInsideTransaction();
        updateServerCache(path, node, true);
    }

    @Override // com.google.firebase.database.core.persistence.PersistenceStorageEngine
    public void overwriteServerCache(Path path, Node node) {
        verifyInsideTransaction();
        updateServerCache(path, node, false);
    }

    @Override // com.google.firebase.database.core.persistence.PersistenceStorageEngine
    public void pruneCache(Path path, PruneForest pruneForest) {
        int i2;
        int i3;
        if (pruneForest.prunesAnything()) {
            verifyInsideTransaction();
            long currentTimeMillis = System.currentTimeMillis();
            Cursor loadNestedQuery = loadNestedQuery(path, new String[]{ROW_ID_COLUMN_NAME, "path"});
            ImmutableTree<Long> immutableTree = new ImmutableTree<>(null);
            ImmutableTree<Long> immutableTree2 = new ImmutableTree<>(null);
            while (loadNestedQuery.moveToNext()) {
                long j2 = loadNestedQuery.getLong(0);
                Path path2 = new Path(loadNestedQuery.getString(1));
                if (!path.contains(path2)) {
                    LogWrapper logWrapper = this.logger;
                    logWrapper.warn("We are pruning at " + path + " but we have data stored higher up at " + path2 + ". Ignoring.");
                } else {
                    Path relative = Path.getRelative(path, path2);
                    if (pruneForest.shouldPruneUnkeptDescendants(relative)) {
                        immutableTree = immutableTree.set(relative, Long.valueOf(j2));
                    } else if (pruneForest.shouldKeep(relative)) {
                        immutableTree2 = immutableTree2.set(relative, Long.valueOf(j2));
                    } else {
                        LogWrapper logWrapper2 = this.logger;
                        logWrapper2.warn("We are pruning at " + path + " and have data at " + path2 + " that isn't marked for pruning or keeping. Ignoring.");
                    }
                }
            }
            if (immutableTree.isEmpty()) {
                i2 = 0;
                i3 = 0;
            } else {
                ArrayList arrayList = new ArrayList();
                pruneTreeRecursive(path, Path.getEmptyPath(), immutableTree, immutableTree2, pruneForest, arrayList);
                Collection<Long> values = immutableTree.values();
                this.database.delete(SERVER_CACHE_TABLE, a.u(a.A("rowid IN ("), commaSeparatedList(values), ")"), null);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    saveNested(path.child((Path) pair.getFirst()), (Node) pair.getSecond());
                }
                i2 = values.size();
                i3 = arrayList.size();
            }
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            if (this.logger.logsDebug()) {
                this.logger.debug(String.format(Locale.US, "Pruned %d rows with %d nodes resaved in %dms", Integer.valueOf(i2), Integer.valueOf(i3), Long.valueOf(currentTimeMillis2)), new Object[0]);
            }
        }
    }

    public void purgeCache() {
        verifyInsideTransaction();
        this.database.delete(SERVER_CACHE_TABLE, null, null);
        this.database.delete(WRITES_TABLE, null, null);
        this.database.delete(TRACKED_QUERY_TABLE, null, null);
        this.database.delete(TRACKED_KEYS_TABLE, null, null);
    }

    @Override // com.google.firebase.database.core.persistence.PersistenceStorageEngine
    public void removeAllUserWrites() {
        verifyInsideTransaction();
        long currentTimeMillis = System.currentTimeMillis();
        int delete = this.database.delete(WRITES_TABLE, null, null);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.logger.logsDebug()) {
            this.logger.debug(String.format(Locale.US, "Deleted %d (all) write(s) in %dms", Integer.valueOf(delete), Long.valueOf(currentTimeMillis2)), new Object[0]);
        }
    }

    @Override // com.google.firebase.database.core.persistence.PersistenceStorageEngine
    public void removeUserWrite(long j2) {
        verifyInsideTransaction();
        long currentTimeMillis = System.currentTimeMillis();
        int delete = this.database.delete(WRITES_TABLE, "id = ?", new String[]{String.valueOf(j2)});
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.logger.logsDebug()) {
            this.logger.debug(String.format(Locale.US, "Deleted %d write(s) with writeId %d in %dms", Integer.valueOf(delete), Long.valueOf(j2), Long.valueOf(currentTimeMillis2)), new Object[0]);
        }
    }

    @Override // com.google.firebase.database.core.persistence.PersistenceStorageEngine
    public void resetPreviouslyActiveTrackedQueries(long j2) {
        verifyInsideTransaction();
        long currentTimeMillis = System.currentTimeMillis();
        ContentValues contentValues = new ContentValues();
        contentValues.put("active", Boolean.FALSE);
        contentValues.put(TRACKED_QUERY_LAST_USE_COLUMN_NAME, Long.valueOf(j2));
        this.database.updateWithOnConflict(TRACKED_QUERY_TABLE, contentValues, "active = 1", new String[0], 5);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.logger.logsDebug()) {
            this.logger.debug(String.format(Locale.US, "Reset active tracked queries in %dms", Long.valueOf(currentTimeMillis2)), new Object[0]);
        }
    }

    @Override // com.google.firebase.database.core.persistence.PersistenceStorageEngine
    public void saveTrackedQuery(TrackedQuery trackedQuery) {
        verifyInsideTransaction();
        long currentTimeMillis = System.currentTimeMillis();
        ContentValues contentValues = new ContentValues();
        contentValues.put(Chapter.KEY_ID, Long.valueOf(trackedQuery.id));
        contentValues.put("path", pathToKey(trackedQuery.querySpec.getPath()));
        contentValues.put(TRACKED_QUERY_PARAMS_COLUMN_NAME, trackedQuery.querySpec.getParams().toJSON());
        contentValues.put(TRACKED_QUERY_LAST_USE_COLUMN_NAME, Long.valueOf(trackedQuery.lastUse));
        contentValues.put(TRACKED_QUERY_COMPLETE_COLUMN_NAME, Boolean.valueOf(trackedQuery.complete));
        contentValues.put("active", Boolean.valueOf(trackedQuery.active));
        this.database.insertWithOnConflict(TRACKED_QUERY_TABLE, null, contentValues, 5);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.logger.logsDebug()) {
            this.logger.debug(String.format(Locale.US, "Saved new tracked query in %dms", Long.valueOf(currentTimeMillis2)), new Object[0]);
        }
    }

    @Override // com.google.firebase.database.core.persistence.PersistenceStorageEngine
    public void saveTrackedQueryKeys(long j2, Set<ChildKey> set) {
        verifyInsideTransaction();
        long currentTimeMillis = System.currentTimeMillis();
        this.database.delete(TRACKED_KEYS_TABLE, "id = ?", new String[]{String.valueOf(j2)});
        for (ChildKey childKey : set) {
            ContentValues contentValues = new ContentValues();
            contentValues.put(Chapter.KEY_ID, Long.valueOf(j2));
            contentValues.put(TRACKED_KEYS_KEY_COLUMN_NAME, childKey.asString());
            this.database.insertWithOnConflict(TRACKED_KEYS_TABLE, null, contentValues, 5);
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.logger.logsDebug()) {
            this.logger.debug(String.format(Locale.US, "Set %d tracked query keys for tracked query %d in %dms", Integer.valueOf(set.size()), Long.valueOf(j2), Long.valueOf(currentTimeMillis2)), new Object[0]);
        }
    }

    @Override // com.google.firebase.database.core.persistence.PersistenceStorageEngine
    public void saveUserMerge(Path path, CompoundWrite compoundWrite, long j2) {
        verifyInsideTransaction();
        long currentTimeMillis = System.currentTimeMillis();
        saveWrite(path, j2, WRITE_TYPE_MERGE, serializeObject(compoundWrite.getValue(true)));
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.logger.logsDebug()) {
            this.logger.debug(String.format(Locale.US, "Persisted user merge in %dms", Long.valueOf(currentTimeMillis2)), new Object[0]);
        }
    }

    @Override // com.google.firebase.database.core.persistence.PersistenceStorageEngine
    public void saveUserOverwrite(Path path, Node node, long j2) {
        verifyInsideTransaction();
        long currentTimeMillis = System.currentTimeMillis();
        saveWrite(path, j2, WRITE_TYPE_OVERWRITE, serializeObject(node.getValue(true)));
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.logger.logsDebug()) {
            this.logger.debug(String.format(Locale.US, "Persisted user overwrite in %dms", Long.valueOf(currentTimeMillis2)), new Object[0]);
        }
    }

    @Override // com.google.firebase.database.core.persistence.PersistenceStorageEngine
    public Node serverCache(Path path) {
        return loadNested(path);
    }

    @Override // com.google.firebase.database.core.persistence.PersistenceStorageEngine
    public long serverCacheEstimatedSizeInBytes() {
        Cursor rawQuery = this.database.rawQuery(String.format("SELECT sum(length(%s) + length(%s)) FROM %s", "value", "path", SERVER_CACHE_TABLE), null);
        try {
            if (rawQuery.moveToFirst()) {
                return rawQuery.getLong(0);
            }
            throw new IllegalStateException("Couldn't read database result!");
        } finally {
            rawQuery.close();
        }
    }

    @Override // com.google.firebase.database.core.persistence.PersistenceStorageEngine
    public void setTransactionSuccessful() {
        this.database.setTransactionSuccessful();
    }

    @Override // com.google.firebase.database.core.persistence.PersistenceStorageEngine
    public void updateTrackedQueryKeys(long j2, Set<ChildKey> set, Set<ChildKey> set2) {
        verifyInsideTransaction();
        long currentTimeMillis = System.currentTimeMillis();
        String valueOf = String.valueOf(j2);
        Iterator<ChildKey> it = set2.iterator();
        while (it.hasNext()) {
            this.database.delete(TRACKED_KEYS_TABLE, "id = ? AND key = ?", new String[]{valueOf, it.next().asString()});
        }
        for (ChildKey childKey : set) {
            ContentValues contentValues = new ContentValues();
            contentValues.put(Chapter.KEY_ID, Long.valueOf(j2));
            contentValues.put(TRACKED_KEYS_KEY_COLUMN_NAME, childKey.asString());
            this.database.insertWithOnConflict(TRACKED_KEYS_TABLE, null, contentValues, 5);
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.logger.logsDebug()) {
            this.logger.debug(String.format(Locale.US, "Updated tracked query keys (%d added, %d removed) for tracked query id %d in %dms", Integer.valueOf(set.size()), Integer.valueOf(set2.size()), Long.valueOf(j2), Long.valueOf(currentTimeMillis2)), new Object[0]);
        }
    }

    @Override // com.google.firebase.database.core.persistence.PersistenceStorageEngine
    public Set<ChildKey> loadTrackedQueryKeys(Set<Long> set) {
        String[] strArr = {TRACKED_KEYS_KEY_COLUMN_NAME};
        long currentTimeMillis = System.currentTimeMillis();
        Cursor query = this.database.query(true, TRACKED_KEYS_TABLE, strArr, a.u(a.A("id IN ("), commaSeparatedList(set), ")"), null, null, null, null, null);
        HashSet hashSet = new HashSet();
        while (query.moveToNext()) {
            try {
                hashSet.add(ChildKey.fromString(query.getString(0)));
            } finally {
                query.close();
            }
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.logger.logsDebug()) {
            this.logger.debug(String.format(Locale.US, "Loaded %d tracked queries keys for tracked queries %s in %dms", Integer.valueOf(hashSet.size()), set.toString(), Long.valueOf(currentTimeMillis2)), new Object[0]);
        }
        return hashSet;
    }

    @Override // com.google.firebase.database.core.persistence.PersistenceStorageEngine
    public void mergeIntoServerCache(Path path, CompoundWrite compoundWrite) {
        verifyInsideTransaction();
        long currentTimeMillis = System.currentTimeMillis();
        Iterator<Map.Entry<Path, Node>> it = compoundWrite.iterator();
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            Map.Entry<Path, Node> next = it.next();
            i2 += removeNested(SERVER_CACHE_TABLE, path.child(next.getKey()));
            i3 += saveNested(path.child(next.getKey()), next.getValue());
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.logger.logsDebug()) {
            this.logger.debug(String.format(Locale.US, "Persisted a total of %d rows and deleted %d rows for a merge at %s in %dms", Integer.valueOf(i3), Integer.valueOf(i2), path.toString(), Long.valueOf(currentTimeMillis2)), new Object[0]);
        }
    }
}
