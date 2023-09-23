package f.h.b.b.y1.j0;

import com.google.android.exoplayer2.Format;
import f.h.b.b.u1.k;
import f.h.b.b.y1.j0.i0;

/* compiled from: LatmReader.java */
/* loaded from: classes.dex */
public final class u implements o {
    public final String a;
    public final f.h.b.b.g2.t b;
    public final f.h.b.b.g2.s c;

    /* renamed from: d  reason: collision with root package name */
    public f.h.b.b.y1.w f5048d;

    /* renamed from: e  reason: collision with root package name */
    public String f5049e;

    /* renamed from: f  reason: collision with root package name */
    public Format f5050f;

    /* renamed from: g  reason: collision with root package name */
    public int f5051g;

    /* renamed from: h  reason: collision with root package name */
    public int f5052h;

    /* renamed from: i  reason: collision with root package name */
    public int f5053i;

    /* renamed from: j  reason: collision with root package name */
    public int f5054j;

    /* renamed from: k  reason: collision with root package name */
    public long f5055k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f5056l;

    /* renamed from: m  reason: collision with root package name */
    public int f5057m;
    public int n;
    public int o;
    public boolean p;
    public long q;
    public int r;
    public long s;
    public int t;
    public String u;

    public u(String str) {
        this.a = str;
        f.h.b.b.g2.t tVar = new f.h.b.b.g2.t(1024);
        this.b = tVar;
        this.c = new f.h.b.b.g2.s(tVar.a);
    }

    public static long a(f.h.b.b.g2.s sVar) {
        return sVar.g((sVar.g(2) + 1) * 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x014e, code lost:
        if (r13.f5056l == false) goto L106;
     */
    @Override // f.h.b.b.y1.j0.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(f.h.b.b.g2.t r14) {
        /*
            Method dump skipped, instructions count: 538
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.y1.j0.u.b(f.h.b.b.g2.t):void");
    }

    @Override // f.h.b.b.y1.j0.o
    public void c() {
        this.f5051g = 0;
        this.f5056l = false;
    }

    @Override // f.h.b.b.y1.j0.o
    public void d() {
    }

    @Override // f.h.b.b.y1.j0.o
    public void e(f.h.b.b.y1.j jVar, i0.d dVar) {
        dVar.a();
        this.f5048d = jVar.p(dVar.c(), 1);
        this.f5049e = dVar.b();
    }

    @Override // f.h.b.b.y1.j0.o
    public void f(long j2, int i2) {
        this.f5055k = j2;
    }

    public final int g(f.h.b.b.g2.s sVar) {
        int b = sVar.b();
        k.b c = f.h.b.b.u1.k.c(sVar, true);
        this.u = c.c;
        this.r = c.a;
        this.t = c.b;
        return b - sVar.b();
    }
}
