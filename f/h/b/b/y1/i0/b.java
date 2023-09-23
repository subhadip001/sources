package f.h.b.b.y1.i0;

import f.h.b.b.g2.b0;
import f.h.b.b.y1.t;
import f.h.b.b.y1.u;

/* compiled from: DefaultOggSeeker.java */
/* loaded from: classes.dex */
public final class b implements g {
    public final f a;
    public final long b;
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final i f4848d;

    /* renamed from: e  reason: collision with root package name */
    public int f4849e;

    /* renamed from: f  reason: collision with root package name */
    public long f4850f;

    /* renamed from: g  reason: collision with root package name */
    public long f4851g;

    /* renamed from: h  reason: collision with root package name */
    public long f4852h;

    /* renamed from: i  reason: collision with root package name */
    public long f4853i;

    /* renamed from: j  reason: collision with root package name */
    public long f4854j;

    /* renamed from: k  reason: collision with root package name */
    public long f4855k;

    /* renamed from: l  reason: collision with root package name */
    public long f4856l;

    /* compiled from: DefaultOggSeeker.java */
    /* renamed from: f.h.b.b.y1.i0.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public final class C0114b implements t {
        public C0114b(a aVar) {
        }

        @Override // f.h.b.b.y1.t
        public boolean c() {
            return true;
        }

        @Override // f.h.b.b.y1.t
        public t.a h(long j2) {
            b bVar = b.this;
            long j3 = bVar.b;
            long j4 = bVar.c;
            return new t.a(new u(j2, b0.i(((((j4 - j3) * ((bVar.f4848d.f4870i * j2) / 1000000)) / bVar.f4850f) + j3) - 30000, j3, j4 - 1)));
        }

        @Override // f.h.b.b.y1.t
        public long i() {
            b bVar = b.this;
            return (bVar.f4850f * 1000000) / bVar.f4848d.f4870i;
        }
    }

    public b(i iVar, long j2, long j3, long j4, long j5, boolean z) {
        f.h.b.b.e2.j.c(j2 >= 0 && j3 > j2);
        this.f4848d = iVar;
        this.b = j2;
        this.c = j3;
        if (j4 != j3 - j2 && !z) {
            this.f4849e = 0;
        } else {
            this.f4850f = j5;
            this.f4849e = 4;
        }
        this.a = new f();
    }

    @Override // f.h.b.b.y1.i0.g
    public t a() {
        if (this.f4850f != 0) {
            return new C0114b(null);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00c2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c3  */
    @Override // f.h.b.b.y1.i0.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long b(f.h.b.b.y1.i r23) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.y1.i0.b.b(f.h.b.b.y1.i):long");
    }

    @Override // f.h.b.b.y1.i0.g
    public void c(long j2) {
        this.f4852h = b0.i(j2, 0L, this.f4850f - 1);
        this.f4849e = 2;
        this.f4853i = this.b;
        this.f4854j = this.c;
        this.f4855k = 0L;
        this.f4856l = this.f4850f;
    }
}
