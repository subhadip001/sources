package f.h.b.a.h.e;

/* compiled from: AutoValue_LogResponse.java */
/* loaded from: classes.dex */
public final class h extends m {
    public final long a;

    public h(long j2) {
        this.a = j2;
    }

    @Override // f.h.b.a.h.e.m
    public long b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof m) && this.a == ((m) obj).b();
    }

    public int hashCode() {
        long j2 = this.a;
        return 1000003 ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        StringBuilder A = f.a.b.a.a.A("LogResponse{nextRequestWaitMillis=");
        A.append(this.a);
        A.append("}");
        return A.toString();
    }
}
