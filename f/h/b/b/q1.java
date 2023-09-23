package f.h.b.b;

import android.net.Uri;
import android.util.Pair;
import f.h.b.b.b2.k0.a;
import f.h.b.b.u0;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: Timeline.java */
/* loaded from: classes.dex */
public abstract class q1 {
    public static final q1 a = new a();

    /* compiled from: Timeline.java */
    /* loaded from: classes.dex */
    public class a extends q1 {
        @Override // f.h.b.b.q1
        public int b(Object obj) {
            return -1;
        }

        @Override // f.h.b.b.q1
        public b g(int i2, b bVar, boolean z) {
            throw new IndexOutOfBoundsException();
        }

        @Override // f.h.b.b.q1
        public int i() {
            return 0;
        }

        @Override // f.h.b.b.q1
        public Object m(int i2) {
            throw new IndexOutOfBoundsException();
        }

        @Override // f.h.b.b.q1
        public c o(int i2, c cVar, long j2) {
            throw new IndexOutOfBoundsException();
        }

        @Override // f.h.b.b.q1
        public int p() {
            return 0;
        }
    }

    /* compiled from: Timeline.java */
    /* loaded from: classes.dex */
    public static final class b {
        public Object a;
        public Object b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public long f4465d;

        /* renamed from: e  reason: collision with root package name */
        public long f4466e;

        /* renamed from: f  reason: collision with root package name */
        public f.h.b.b.b2.k0.a f4467f = f.h.b.b.b2.k0.a.f3875g;

        public long a(int i2, int i3) {
            a.C0102a c0102a = this.f4467f.f3876d[i2];
            if (c0102a.a != -1) {
                return c0102a.f3879d[i3];
            }
            return -9223372036854775807L;
        }

        public int b(long j2) {
            f.h.b.b.b2.k0.a aVar = this.f4467f;
            long j3 = this.f4465d;
            Objects.requireNonNull(aVar);
            if (j2 != Long.MIN_VALUE) {
                if (j3 == -9223372036854775807L || j2 < j3) {
                    int i2 = 0;
                    while (true) {
                        long[] jArr = aVar.c;
                        if (i2 >= jArr.length || jArr[i2] == Long.MIN_VALUE || (j2 < jArr[i2] && aVar.f3876d[i2].b())) {
                            break;
                        }
                        i2++;
                    }
                    if (i2 < aVar.c.length) {
                        return i2;
                    }
                    return -1;
                }
                return -1;
            }
            return -1;
        }

        public int c(long j2) {
            f.h.b.b.b2.k0.a aVar = this.f4467f;
            long j3 = this.f4465d;
            int length = aVar.c.length - 1;
            while (length >= 0) {
                boolean z = false;
                if (j2 != Long.MIN_VALUE) {
                    long j4 = aVar.c[length];
                    if (j4 != Long.MIN_VALUE ? j2 < j4 : !(j3 != -9223372036854775807L && j2 >= j3)) {
                        z = true;
                    }
                }
                if (!z) {
                    break;
                }
                length--;
            }
            if (length < 0 || !aVar.f3876d[length].b()) {
                return -1;
            }
            return length;
        }

        public long d(int i2) {
            return this.f4467f.c[i2];
        }

        public int e(int i2) {
            return this.f4467f.f3876d[i2].a(-1);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !b.class.equals(obj.getClass())) {
                return false;
            }
            b bVar = (b) obj;
            return f.h.b.b.g2.b0.a(this.a, bVar.a) && f.h.b.b.g2.b0.a(this.b, bVar.b) && this.c == bVar.c && this.f4465d == bVar.f4465d && this.f4466e == bVar.f4466e && f.h.b.b.g2.b0.a(this.f4467f, bVar.f4467f);
        }

        public int hashCode() {
            Object obj = this.a;
            int hashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.b;
            int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
            long j2 = this.f4465d;
            long j3 = this.f4466e;
            return this.f4467f.hashCode() + ((((((((hashCode + hashCode2) * 31) + this.c) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31);
        }
    }

    /* compiled from: Timeline.java */
    /* loaded from: classes.dex */
    public static final class c {
        public static final Object r = new Object();
        public static final u0 s;
        @Deprecated
        public Object b;

        /* renamed from: d  reason: collision with root package name */
        public Object f4468d;

        /* renamed from: e  reason: collision with root package name */
        public long f4469e;

        /* renamed from: f  reason: collision with root package name */
        public long f4470f;

        /* renamed from: g  reason: collision with root package name */
        public long f4471g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f4472h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f4473i;
        @Deprecated

        /* renamed from: j  reason: collision with root package name */
        public boolean f4474j;

        /* renamed from: k  reason: collision with root package name */
        public u0.e f4475k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f4476l;

        /* renamed from: m  reason: collision with root package name */
        public int f4477m;
        public int n;
        public long o;
        public long p;
        public long q;
        public Object a = r;
        public u0 c = s;

        static {
            Collections.emptyList();
            Collections.emptyMap();
            List emptyList = Collections.emptyList();
            List emptyList2 = Collections.emptyList();
            Uri uri = Uri.EMPTY;
            f.h.b.b.e2.j.g(true);
            s = new u0("com.google.android.exoplayer2.Timeline", new u0.c(0L, Long.MIN_VALUE, false, false, false, null), uri != null ? new u0.f(uri, null, null, null, emptyList, null, emptyList2, null, null) : null, new u0.e(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), new v0(null, null), null);
        }

        public long a() {
            return h0.b(this.o);
        }

        public long b() {
            return h0.b(this.p);
        }

        public boolean c() {
            f.h.b.b.e2.j.g(this.f4474j == (this.f4475k != null));
            return this.f4475k != null;
        }

        public c d(Object obj, u0 u0Var, Object obj2, long j2, long j3, long j4, boolean z, boolean z2, u0.e eVar, long j5, long j6, int i2, int i3, long j7) {
            u0.f fVar;
            this.a = obj;
            this.c = u0Var != null ? u0Var : s;
            this.b = (u0Var == null || (fVar = u0Var.b) == null) ? null : fVar.f4517h;
            this.f4468d = obj2;
            this.f4469e = j2;
            this.f4470f = j3;
            this.f4471g = j4;
            this.f4472h = z;
            this.f4473i = z2;
            this.f4474j = eVar != null;
            this.f4475k = eVar;
            this.o = j5;
            this.p = j6;
            this.f4477m = i2;
            this.n = i3;
            this.q = j7;
            this.f4476l = false;
            return this;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !c.class.equals(obj.getClass())) {
                return false;
            }
            c cVar = (c) obj;
            return f.h.b.b.g2.b0.a(this.a, cVar.a) && f.h.b.b.g2.b0.a(this.c, cVar.c) && f.h.b.b.g2.b0.a(this.f4468d, cVar.f4468d) && f.h.b.b.g2.b0.a(this.f4475k, cVar.f4475k) && this.f4469e == cVar.f4469e && this.f4470f == cVar.f4470f && this.f4471g == cVar.f4471g && this.f4472h == cVar.f4472h && this.f4473i == cVar.f4473i && this.f4476l == cVar.f4476l && this.o == cVar.o && this.p == cVar.p && this.f4477m == cVar.f4477m && this.n == cVar.n && this.q == cVar.q;
        }

        public int hashCode() {
            int hashCode = (this.c.hashCode() + ((this.a.hashCode() + 217) * 31)) * 31;
            Object obj = this.f4468d;
            int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            u0.e eVar = this.f4475k;
            int hashCode3 = eVar != null ? eVar.hashCode() : 0;
            long j2 = this.f4469e;
            long j3 = this.f4470f;
            long j4 = this.f4471g;
            long j5 = this.o;
            long j6 = this.p;
            long j7 = this.q;
            return ((((((((((((((((((((((hashCode2 + hashCode3) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + (this.f4472h ? 1 : 0)) * 31) + (this.f4473i ? 1 : 0)) * 31) + (this.f4476l ? 1 : 0)) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + this.f4477m) * 31) + this.n) * 31) + ((int) (j7 ^ (j7 >>> 32)));
        }
    }

    public int a(boolean z) {
        return q() ? -1 : 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z) {
        if (q()) {
            return -1;
        }
        return p() - 1;
    }

    public final int d(int i2, b bVar, c cVar, int i3, boolean z) {
        int i4 = g(i2, bVar, false).c;
        if (n(i4, cVar).n == i2) {
            int e2 = e(i4, i3, z);
            if (e2 == -1) {
                return -1;
            }
            return n(e2, cVar).f4477m;
        }
        return i2 + 1;
    }

    public int e(int i2, int i3, boolean z) {
        if (i3 == 0) {
            if (i2 == c(z)) {
                return -1;
            }
            return i2 + 1;
        } else if (i3 != 1) {
            if (i3 == 2) {
                return i2 == c(z) ? a(z) : i2 + 1;
            }
            throw new IllegalStateException();
        } else {
            return i2;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q1) {
            q1 q1Var = (q1) obj;
            if (q1Var.p() == p() && q1Var.i() == i()) {
                c cVar = new c();
                b bVar = new b();
                c cVar2 = new c();
                b bVar2 = new b();
                for (int i2 = 0; i2 < p(); i2++) {
                    if (!n(i2, cVar).equals(q1Var.n(i2, cVar2))) {
                        return false;
                    }
                }
                for (int i3 = 0; i3 < i(); i3++) {
                    if (!g(i3, bVar, true).equals(q1Var.g(i3, bVar2, true))) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final b f(int i2, b bVar) {
        return g(i2, bVar, false);
    }

    public abstract b g(int i2, b bVar, boolean z);

    public b h(Object obj, b bVar) {
        return g(b(obj), bVar, true);
    }

    public int hashCode() {
        c cVar = new c();
        b bVar = new b();
        int p = p() + 217;
        for (int i2 = 0; i2 < p(); i2++) {
            p = (p * 31) + n(i2, cVar).hashCode();
        }
        int i3 = i() + (p * 31);
        for (int i4 = 0; i4 < i(); i4++) {
            i3 = (i3 * 31) + g(i4, bVar, true).hashCode();
        }
        return i3;
    }

    public abstract int i();

    public final Pair<Object, Long> j(c cVar, b bVar, int i2, long j2) {
        Pair<Object, Long> k2 = k(cVar, bVar, i2, j2, 0L);
        Objects.requireNonNull(k2);
        return k2;
    }

    public final Pair<Object, Long> k(c cVar, b bVar, int i2, long j2, long j3) {
        f.h.b.b.e2.j.f(i2, 0, p());
        o(i2, cVar, j3);
        if (j2 == -9223372036854775807L) {
            j2 = cVar.o;
            if (j2 == -9223372036854775807L) {
                return null;
            }
        }
        int i3 = cVar.f4477m;
        long j4 = cVar.q + j2;
        long j5 = g(i3, bVar, true).f4465d;
        while (j5 != -9223372036854775807L && j4 >= j5 && i3 < cVar.n) {
            j4 -= j5;
            i3++;
            j5 = g(i3, bVar, true).f4465d;
        }
        Object obj = bVar.b;
        Objects.requireNonNull(obj);
        return Pair.create(obj, Long.valueOf(j4));
    }

    public int l(int i2, int i3, boolean z) {
        if (i3 == 0) {
            if (i2 == a(z)) {
                return -1;
            }
            return i2 - 1;
        } else if (i3 != 1) {
            if (i3 == 2) {
                return i2 == a(z) ? c(z) : i2 - 1;
            }
            throw new IllegalStateException();
        } else {
            return i2;
        }
    }

    public abstract Object m(int i2);

    public final c n(int i2, c cVar) {
        return o(i2, cVar, 0L);
    }

    public abstract c o(int i2, c cVar, long j2);

    public abstract int p();

    public final boolean q() {
        return p() == 0;
    }
}
