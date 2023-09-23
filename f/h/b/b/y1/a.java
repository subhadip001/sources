package f.h.b.b.y1;

import f.h.b.b.g2.b0;
import f.h.b.b.y1.t;

/* compiled from: BinarySearchSeeker.java */
/* loaded from: classes.dex */
public abstract class a {
    public final C0112a a;
    public final f b;
    public c c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4670d;

    /* compiled from: BinarySearchSeeker.java */
    /* renamed from: f.h.b.b.y1.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0112a implements t {
        public final d a;
        public final long b;
        public final long c;

        /* renamed from: d  reason: collision with root package name */
        public final long f4671d;

        /* renamed from: e  reason: collision with root package name */
        public final long f4672e;

        /* renamed from: f  reason: collision with root package name */
        public final long f4673f;

        /* renamed from: g  reason: collision with root package name */
        public final long f4674g;

        public C0112a(d dVar, long j2, long j3, long j4, long j5, long j6, long j7) {
            this.a = dVar;
            this.b = j2;
            this.c = j3;
            this.f4671d = j4;
            this.f4672e = j5;
            this.f4673f = j6;
            this.f4674g = j7;
        }

        @Override // f.h.b.b.y1.t
        public boolean c() {
            return true;
        }

        @Override // f.h.b.b.y1.t
        public t.a h(long j2) {
            return new t.a(new u(j2, c.a(this.a.a(j2), this.c, this.f4671d, this.f4672e, this.f4673f, this.f4674g)));
        }

        @Override // f.h.b.b.y1.t
        public long i() {
            return this.b;
        }
    }

    /* compiled from: BinarySearchSeeker.java */
    /* loaded from: classes.dex */
    public static final class b implements d {
        @Override // f.h.b.b.y1.a.d
        public long a(long j2) {
            return j2;
        }
    }

    /* compiled from: BinarySearchSeeker.java */
    /* loaded from: classes.dex */
    public static class c {
        public final long a;
        public final long b;
        public final long c;

        /* renamed from: d  reason: collision with root package name */
        public long f4675d;

        /* renamed from: e  reason: collision with root package name */
        public long f4676e;

        /* renamed from: f  reason: collision with root package name */
        public long f4677f;

        /* renamed from: g  reason: collision with root package name */
        public long f4678g;

        /* renamed from: h  reason: collision with root package name */
        public long f4679h;

        public c(long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
            this.a = j2;
            this.b = j3;
            this.f4675d = j4;
            this.f4676e = j5;
            this.f4677f = j6;
            this.f4678g = j7;
            this.c = j8;
            this.f4679h = a(j3, j4, j5, j6, j7, j8);
        }

        public static long a(long j2, long j3, long j4, long j5, long j6, long j7) {
            if (j5 + 1 >= j6 || j3 + 1 >= j4) {
                return j5;
            }
            long j8 = ((float) (j2 - j3)) * (((float) (j6 - j5)) / ((float) (j4 - j3)));
            return b0.i(((j8 + j5) - j7) - (j8 / 20), j5, j6 - 1);
        }
    }

    /* compiled from: BinarySearchSeeker.java */
    /* loaded from: classes.dex */
    public interface d {
        long a(long j2);
    }

    /* compiled from: BinarySearchSeeker.java */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: d  reason: collision with root package name */
        public static final e f4680d = new e(-3, -9223372036854775807L, -1);
        public final int a;
        public final long b;
        public final long c;

        public e(int i2, long j2, long j3) {
            this.a = i2;
            this.b = j2;
            this.c = j3;
        }

        public static e a(long j2, long j3) {
            return new e(-1, j2, j3);
        }

        public static e b(long j2) {
            return new e(0, -9223372036854775807L, j2);
        }

        public static e c(long j2, long j3) {
            return new e(-2, j2, j3);
        }
    }

    /* compiled from: BinarySearchSeeker.java */
    /* loaded from: classes.dex */
    public interface f {
        void a();

        e b(i iVar, long j2);
    }

    public a(d dVar, f fVar, long j2, long j3, long j4, long j5, long j6, long j7, int i2) {
        this.b = fVar;
        this.f4670d = i2;
        this.a = new C0112a(dVar, j2, j3, j4, j5, j6, j7);
    }

    public int a(i iVar, s sVar) {
        while (true) {
            c cVar = this.c;
            f.h.b.b.e2.j.i(cVar);
            long j2 = cVar.f4677f;
            long j3 = cVar.f4678g;
            long j4 = cVar.f4679h;
            if (j3 - j2 <= this.f4670d) {
                c(false, j2);
                return d(iVar, j2, sVar);
            } else if (!f(iVar, j4)) {
                return d(iVar, j4, sVar);
            } else {
                iVar.l();
                e b2 = this.b.b(iVar, cVar.b);
                int i2 = b2.a;
                if (i2 == -3) {
                    c(false, j4);
                    return d(iVar, j4, sVar);
                } else if (i2 == -2) {
                    long j5 = b2.b;
                    long j6 = b2.c;
                    cVar.f4675d = j5;
                    cVar.f4677f = j6;
                    cVar.f4679h = c.a(cVar.b, j5, cVar.f4676e, j6, cVar.f4678g, cVar.c);
                } else if (i2 != -1) {
                    if (i2 == 0) {
                        f(iVar, b2.c);
                        c(true, b2.c);
                        return d(iVar, b2.c, sVar);
                    }
                    throw new IllegalStateException("Invalid case");
                } else {
                    long j7 = b2.b;
                    long j8 = b2.c;
                    cVar.f4676e = j7;
                    cVar.f4678g = j8;
                    cVar.f4679h = c.a(cVar.b, cVar.f4675d, j7, cVar.f4677f, j8, cVar.c);
                }
            }
        }
    }

    public final boolean b() {
        return this.c != null;
    }

    public final void c(boolean z, long j2) {
        this.c = null;
        this.b.a();
    }

    public final int d(i iVar, long j2, s sVar) {
        if (j2 == iVar.getPosition()) {
            return 0;
        }
        sVar.a = j2;
        return 1;
    }

    public final void e(long j2) {
        c cVar = this.c;
        if (cVar == null || cVar.a != j2) {
            long a = this.a.a.a(j2);
            C0112a c0112a = this.a;
            this.c = new c(j2, a, c0112a.c, c0112a.f4671d, c0112a.f4672e, c0112a.f4673f, c0112a.f4674g);
        }
    }

    public final boolean f(i iVar, long j2) {
        long position = j2 - iVar.getPosition();
        if (position < 0 || position > 262144) {
            return false;
        }
        iVar.m((int) position);
        return true;
    }
}
