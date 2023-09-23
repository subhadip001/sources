package f.h.b.b;

/* compiled from: SeekParameters.java */
/* loaded from: classes.dex */
public final class n1 {
    public static final n1 c;

    /* renamed from: d  reason: collision with root package name */
    public static final n1 f4408d;
    public final long a;
    public final long b;

    static {
        n1 n1Var = new n1(0L, 0L);
        c = n1Var;
        f.h.b.b.e2.j.c(Long.MAX_VALUE >= 0);
        f.h.b.b.e2.j.c(Long.MAX_VALUE >= 0);
        f.h.b.b.e2.j.c(Long.MAX_VALUE >= 0);
        f.h.b.b.e2.j.c(0 >= 0);
        f.h.b.b.e2.j.c(0 >= 0);
        f.h.b.b.e2.j.c(Long.MAX_VALUE >= 0);
        f4408d = n1Var;
    }

    public n1(long j2, long j3) {
        f.h.b.b.e2.j.c(j2 >= 0);
        f.h.b.b.e2.j.c(j3 >= 0);
        this.a = j2;
        this.b = j3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n1.class != obj.getClass()) {
            return false;
        }
        n1 n1Var = (n1) obj;
        return this.a == n1Var.a && this.b == n1Var.b;
    }

    public int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
