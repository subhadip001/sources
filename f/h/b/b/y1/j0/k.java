package f.h.b.b.y1.j0;

import com.google.android.exoplayer2.Format;
import f.h.b.b.y1.j0.i0;
import java.util.Arrays;

/* compiled from: AdtsReader.java */
/* loaded from: classes.dex */
public final class k implements o {
    public static final byte[] v = {73, 68, 51};
    public final boolean a;
    public final f.h.b.b.g2.s b = new f.h.b.b.g2.s(new byte[7]);
    public final f.h.b.b.g2.t c = new f.h.b.b.g2.t(Arrays.copyOf(v, 10));

    /* renamed from: d  reason: collision with root package name */
    public final String f4945d;

    /* renamed from: e  reason: collision with root package name */
    public String f4946e;

    /* renamed from: f  reason: collision with root package name */
    public f.h.b.b.y1.w f4947f;

    /* renamed from: g  reason: collision with root package name */
    public f.h.b.b.y1.w f4948g;

    /* renamed from: h  reason: collision with root package name */
    public int f4949h;

    /* renamed from: i  reason: collision with root package name */
    public int f4950i;

    /* renamed from: j  reason: collision with root package name */
    public int f4951j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f4952k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f4953l;

    /* renamed from: m  reason: collision with root package name */
    public int f4954m;
    public int n;
    public int o;
    public boolean p;
    public long q;
    public int r;
    public long s;
    public f.h.b.b.y1.w t;
    public long u;

    public k(boolean z, String str) {
        h();
        this.f4954m = -1;
        this.n = -1;
        this.q = -9223372036854775807L;
        this.a = z;
        this.f4945d = str;
    }

    public static boolean g(int i2) {
        return (i2 & 65526) == 65520;
    }

    public final boolean a(f.h.b.b.g2.t tVar, byte[] bArr, int i2) {
        int min = Math.min(tVar.a(), i2 - this.f4950i);
        System.arraycopy(tVar.a, tVar.b, bArr, this.f4950i, min);
        tVar.b += min;
        int i3 = this.f4950i + min;
        this.f4950i = i3;
        return i3 == i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:157:0x026c A[EDGE_INSN: B:157:0x026c->B:108:0x026c ?: BREAK  , SYNTHETIC] */
    @Override // f.h.b.b.y1.j0.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(f.h.b.b.g2.t r18) {
        /*
            Method dump skipped, instructions count: 742
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.y1.j0.k.b(f.h.b.b.g2.t):void");
    }

    @Override // f.h.b.b.y1.j0.o
    public void c() {
        this.f4953l = false;
        h();
    }

    @Override // f.h.b.b.y1.j0.o
    public void d() {
    }

    @Override // f.h.b.b.y1.j0.o
    public void e(f.h.b.b.y1.j jVar, i0.d dVar) {
        dVar.a();
        this.f4946e = dVar.b();
        f.h.b.b.y1.w p = jVar.p(dVar.c(), 1);
        this.f4947f = p;
        this.t = p;
        if (this.a) {
            dVar.a();
            f.h.b.b.y1.w p2 = jVar.p(dVar.c(), 5);
            this.f4948g = p2;
            Format.b bVar = new Format.b();
            bVar.a = dVar.b();
            bVar.f722k = "application/id3";
            p2.e(bVar.a());
            return;
        }
        this.f4948g = new f.h.b.b.y1.g();
    }

    @Override // f.h.b.b.y1.j0.o
    public void f(long j2, int i2) {
        this.s = j2;
    }

    public final void h() {
        this.f4949h = 0;
        this.f4950i = 0;
        this.f4951j = 256;
    }

    public final boolean i(f.h.b.b.g2.t tVar, byte[] bArr, int i2) {
        if (tVar.a() < i2) {
            return false;
        }
        System.arraycopy(tVar.a, tVar.b, bArr, 0, i2);
        tVar.b += i2;
        return true;
    }
}
