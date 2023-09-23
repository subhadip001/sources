package f.h.b.b.y1.j0;

import f.h.b.b.y1.j0.i0;
import java.util.Arrays;

/* compiled from: H263Reader.java */
/* loaded from: classes.dex */
public final class q implements o {

    /* renamed from: l  reason: collision with root package name */
    public static final float[] f4978l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final j0 a;

    /* renamed from: f  reason: collision with root package name */
    public b f4981f;

    /* renamed from: g  reason: collision with root package name */
    public long f4982g;

    /* renamed from: h  reason: collision with root package name */
    public String f4983h;

    /* renamed from: i  reason: collision with root package name */
    public f.h.b.b.y1.w f4984i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f4985j;

    /* renamed from: k  reason: collision with root package name */
    public long f4986k;
    public final boolean[] c = new boolean[4];

    /* renamed from: d  reason: collision with root package name */
    public final a f4979d = new a(128);

    /* renamed from: e  reason: collision with root package name */
    public final w f4980e = new w(178, 128);
    public final f.h.b.b.g2.t b = new f.h.b.b.g2.t();

    /* compiled from: H263Reader.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: f  reason: collision with root package name */
        public static final byte[] f4987f = {0, 0, 1};
        public boolean a;
        public int b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int f4988d;

        /* renamed from: e  reason: collision with root package name */
        public byte[] f4989e;

        public a(int i2) {
            this.f4989e = new byte[i2];
        }

        public void a(byte[] bArr, int i2, int i3) {
            if (this.a) {
                int i4 = i3 - i2;
                byte[] bArr2 = this.f4989e;
                int length = bArr2.length;
                int i5 = this.c;
                if (length < i5 + i4) {
                    this.f4989e = Arrays.copyOf(bArr2, (i5 + i4) * 2);
                }
                System.arraycopy(bArr, i2, this.f4989e, this.c, i4);
                this.c += i4;
            }
        }

        public void b() {
            this.a = false;
            this.c = 0;
            this.b = 0;
        }
    }

    /* compiled from: H263Reader.java */
    /* loaded from: classes.dex */
    public static final class b {
        public final f.h.b.b.y1.w a;
        public boolean b;
        public boolean c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f4990d;

        /* renamed from: e  reason: collision with root package name */
        public int f4991e;

        /* renamed from: f  reason: collision with root package name */
        public int f4992f;

        /* renamed from: g  reason: collision with root package name */
        public long f4993g;

        /* renamed from: h  reason: collision with root package name */
        public long f4994h;

        public b(f.h.b.b.y1.w wVar) {
            this.a = wVar;
        }

        public void a(byte[] bArr, int i2, int i3) {
            if (this.c) {
                int i4 = this.f4992f;
                int i5 = (i2 + 1) - i4;
                if (i5 < i3) {
                    this.f4990d = ((bArr[i5] & 192) >> 6) == 0;
                    this.c = false;
                    return;
                }
                this.f4992f = (i3 - i2) + i4;
            }
        }
    }

    public q(j0 j0Var) {
        this.a = j0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x023e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ec  */
    @Override // f.h.b.b.y1.j0.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(f.h.b.b.g2.t r26) {
        /*
            Method dump skipped, instructions count: 653
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.y1.j0.q.b(f.h.b.b.g2.t):void");
    }

    @Override // f.h.b.b.y1.j0.o
    public void c() {
        f.h.b.b.g2.r.a(this.c);
        this.f4979d.b();
        b bVar = this.f4981f;
        if (bVar != null) {
            bVar.b = false;
            bVar.c = false;
            bVar.f4990d = false;
            bVar.f4991e = -1;
        }
        w wVar = this.f4980e;
        if (wVar != null) {
            wVar.c();
        }
        this.f4982g = 0L;
    }

    @Override // f.h.b.b.y1.j0.o
    public void d() {
    }

    @Override // f.h.b.b.y1.j0.o
    public void e(f.h.b.b.y1.j jVar, i0.d dVar) {
        dVar.a();
        this.f4983h = dVar.b();
        f.h.b.b.y1.w p = jVar.p(dVar.c(), 2);
        this.f4984i = p;
        this.f4981f = new b(p);
        j0 j0Var = this.a;
        if (j0Var != null) {
            j0Var.b(jVar, dVar);
        }
    }

    @Override // f.h.b.b.y1.j0.o
    public void f(long j2, int i2) {
        this.f4986k = j2;
    }
}
