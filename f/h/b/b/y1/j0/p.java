package f.h.b.b.y1.j0;

import f.h.b.b.y1.j0.i0;
import java.util.Arrays;

/* compiled from: H262Reader.java */
/* loaded from: classes.dex */
public final class p implements o {
    public static final double[] q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String a;
    public f.h.b.b.y1.w b;
    public final j0 c;

    /* renamed from: d  reason: collision with root package name */
    public final f.h.b.b.g2.t f4966d;

    /* renamed from: e  reason: collision with root package name */
    public final w f4967e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean[] f4968f = new boolean[4];

    /* renamed from: g  reason: collision with root package name */
    public final a f4969g = new a(128);

    /* renamed from: h  reason: collision with root package name */
    public long f4970h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f4971i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f4972j;

    /* renamed from: k  reason: collision with root package name */
    public long f4973k;

    /* renamed from: l  reason: collision with root package name */
    public long f4974l;

    /* renamed from: m  reason: collision with root package name */
    public long f4975m;
    public long n;
    public boolean o;
    public boolean p;

    /* compiled from: H262Reader.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: e  reason: collision with root package name */
        public static final byte[] f4976e = {0, 0, 1};
        public boolean a;
        public int b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public byte[] f4977d;

        public a(int i2) {
            this.f4977d = new byte[i2];
        }

        public void a(byte[] bArr, int i2, int i3) {
            if (this.a) {
                int i4 = i3 - i2;
                byte[] bArr2 = this.f4977d;
                int length = bArr2.length;
                int i5 = this.b;
                if (length < i5 + i4) {
                    this.f4977d = Arrays.copyOf(bArr2, (i5 + i4) * 2);
                }
                System.arraycopy(bArr, i2, this.f4977d, this.b, i4);
                this.b += i4;
            }
        }
    }

    public p(j0 j0Var) {
        this.c = j0Var;
        if (j0Var != null) {
            this.f4967e = new w(178, 128);
            this.f4966d = new f.h.b.b.g2.t();
            return;
        }
        this.f4967e = null;
        this.f4966d = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0203  */
    @Override // f.h.b.b.y1.j0.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(f.h.b.b.g2.t r26) {
        /*
            Method dump skipped, instructions count: 521
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.y1.j0.p.b(f.h.b.b.g2.t):void");
    }

    @Override // f.h.b.b.y1.j0.o
    public void c() {
        f.h.b.b.g2.r.a(this.f4968f);
        a aVar = this.f4969g;
        aVar.a = false;
        aVar.b = 0;
        aVar.c = 0;
        w wVar = this.f4967e;
        if (wVar != null) {
            wVar.c();
        }
        this.f4970h = 0L;
        this.f4971i = false;
    }

    @Override // f.h.b.b.y1.j0.o
    public void d() {
    }

    @Override // f.h.b.b.y1.j0.o
    public void e(f.h.b.b.y1.j jVar, i0.d dVar) {
        dVar.a();
        this.a = dVar.b();
        this.b = jVar.p(dVar.c(), 2);
        j0 j0Var = this.c;
        if (j0Var != null) {
            j0Var.b(jVar, dVar);
        }
    }

    @Override // f.h.b.b.y1.j0.o
    public void f(long j2, int i2) {
        this.f4974l = j2;
    }
}
