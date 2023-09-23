package com.google.firebase.database.core;

import f.a.b.a.a;

/* loaded from: classes2.dex */
public final class Tag {
    private final long tagNumber;

    public Tag(long j2) {
        this.tagNumber = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && Tag.class == obj.getClass() && this.tagNumber == ((Tag) obj).tagNumber;
    }

    public long getTagNumber() {
        return this.tagNumber;
    }

    public int hashCode() {
        long j2 = this.tagNumber;
        return (int) (j2 ^ (j2 >>> 32));
    }

    public String toString() {
        StringBuilder A = a.A("Tag{tagNumber=");
        A.append(this.tagNumber);
        A.append('}');
        return A.toString();
    }
}
