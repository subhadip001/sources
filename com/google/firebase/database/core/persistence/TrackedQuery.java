package com.google.firebase.database.core.persistence;

import com.google.firebase.database.core.view.QuerySpec;
import f.a.b.a.a;

/* loaded from: classes2.dex */
public final class TrackedQuery {
    public final boolean active;
    public final boolean complete;
    public final long id;
    public final long lastUse;
    public final QuerySpec querySpec;

    public TrackedQuery(long j2, QuerySpec querySpec, long j3, boolean z, boolean z2) {
        this.id = j2;
        if (querySpec.loadsAllData() && !querySpec.isDefault()) {
            throw new IllegalArgumentException("Can't create TrackedQuery for a non-default query that loads all data");
        }
        this.querySpec = querySpec;
        this.lastUse = j3;
        this.complete = z;
        this.active = z2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != TrackedQuery.class) {
            return false;
        }
        TrackedQuery trackedQuery = (TrackedQuery) obj;
        return this.id == trackedQuery.id && this.querySpec.equals(trackedQuery.querySpec) && this.lastUse == trackedQuery.lastUse && this.complete == trackedQuery.complete && this.active == trackedQuery.active;
    }

    public int hashCode() {
        int hashCode = this.querySpec.hashCode();
        int hashCode2 = Long.valueOf(this.lastUse).hashCode();
        int hashCode3 = Boolean.valueOf(this.complete).hashCode();
        return Boolean.valueOf(this.active).hashCode() + ((hashCode3 + ((hashCode2 + ((hashCode + (Long.valueOf(this.id).hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public TrackedQuery setActiveState(boolean z) {
        return new TrackedQuery(this.id, this.querySpec, this.lastUse, this.complete, z);
    }

    public TrackedQuery setComplete() {
        return new TrackedQuery(this.id, this.querySpec, this.lastUse, true, this.active);
    }

    public String toString() {
        StringBuilder A = a.A("TrackedQuery{id=");
        A.append(this.id);
        A.append(", querySpec=");
        A.append(this.querySpec);
        A.append(", lastUse=");
        A.append(this.lastUse);
        A.append(", complete=");
        A.append(this.complete);
        A.append(", active=");
        A.append(this.active);
        A.append("}");
        return A.toString();
    }

    public TrackedQuery updateLastUse(long j2) {
        return new TrackedQuery(this.id, this.querySpec, j2, this.complete, this.active);
    }
}
