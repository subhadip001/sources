package f.h.b.b.y1.j0;

import f.h.b.b.y1.j0.i0;

/* compiled from: H265Reader.java */
/* loaded from: classes.dex */
public final class s implements o {
    public final e0 a;
    public String b;
    public f.h.b.b.y1.w c;

    /* renamed from: d  reason: collision with root package name */
    public a f5025d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f5026e;

    /* renamed from: l  reason: collision with root package name */
    public long f5033l;

    /* renamed from: m  reason: collision with root package name */
    public long f5034m;

    /* renamed from: f  reason: collision with root package name */
    public final boolean[] f5027f = new boolean[3];

    /* renamed from: g  reason: collision with root package name */
    public final w f5028g = new w(32, 128);

    /* renamed from: h  reason: collision with root package name */
    public final w f5029h = new w(33, 128);

    /* renamed from: i  reason: collision with root package name */
    public final w f5030i = new w(34, 128);

    /* renamed from: j  reason: collision with root package name */
    public final w f5031j = new w(39, 128);

    /* renamed from: k  reason: collision with root package name */
    public final w f5032k = new w(40, 128);
    public final f.h.b.b.g2.t n = new f.h.b.b.g2.t();

    /* compiled from: H265Reader.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final f.h.b.b.y1.w a;
        public long b;
        public boolean c;

        /* renamed from: d  reason: collision with root package name */
        public int f5035d;

        /* renamed from: e  reason: collision with root package name */
        public long f5036e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f5037f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f5038g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f5039h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f5040i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f5041j;

        /* renamed from: k  reason: collision with root package name */
        public long f5042k;

        /* renamed from: l  reason: collision with root package name */
        public long f5043l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f5044m;

        public a(f.h.b.b.y1.w wVar) {
            this.a = wVar;
        }

        public final void a(int i2) {
            boolean z = this.f5044m;
            this.a.d(this.f5043l, z ? 1 : 0, (int) (this.b - this.f5042k), i2, null);
        }
    }

    public s(e0 e0Var) {
        this.a = e0Var;
    }

    public final void a(byte[] bArr, int i2, int i3) {
        a aVar = this.f5025d;
        if (aVar.f5037f) {
            int i4 = aVar.f5035d;
            int i5 = (i2 + 2) - i4;
            if (i5 < i3) {
                aVar.f5038g = (bArr[i5] & 128) != 0;
                aVar.f5037f = false;
            } else {
                aVar.f5035d = (i3 - i2) + i4;
            }
        }
        if (!this.f5026e) {
            this.f5028g.a(bArr, i2, i3);
            this.f5029h.a(bArr, i2, i3);
            this.f5030i.a(bArr, i2, i3);
        }
        this.f5031j.a(bArr, i2, i3);
        this.f5032k.a(bArr, i2, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:159:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03fe A[SYNTHETIC] */
    @Override // f.h.b.b.y1.j0.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(f.h.b.b.g2.t r28) {
        /*
            Method dump skipped, instructions count: 1047
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.y1.j0.s.b(f.h.b.b.g2.t):void");
    }

    @Override // f.h.b.b.y1.j0.o
    public void c() {
        this.f5033l = 0L;
        f.h.b.b.g2.r.a(this.f5027f);
        this.f5028g.c();
        this.f5029h.c();
        this.f5030i.c();
        this.f5031j.c();
        this.f5032k.c();
        a aVar = this.f5025d;
        if (aVar != null) {
            aVar.f5037f = false;
            aVar.f5038g = false;
            aVar.f5039h = false;
            aVar.f5040i = false;
            aVar.f5041j = false;
        }
    }

    @Override // f.h.b.b.y1.j0.o
    public void d() {
    }

    @Override // f.h.b.b.y1.j0.o
    public void e(f.h.b.b.y1.j jVar, i0.d dVar) {
        dVar.a();
        this.b = dVar.b();
        f.h.b.b.y1.w p = jVar.p(dVar.c(), 2);
        this.c = p;
        this.f5025d = new a(p);
        this.a.a(jVar, dVar);
    }

    @Override // f.h.b.b.y1.j0.o
    public void f(long j2, int i2) {
        this.f5034m = j2;
    }
}
