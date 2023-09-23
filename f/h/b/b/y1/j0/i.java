package f.h.b.b.y1.j0;

import com.google.android.exoplayer2.Format;
import f.h.b.b.u1.m;
import f.h.b.b.y1.j0.i0;

/* compiled from: Ac4Reader.java */
/* loaded from: classes.dex */
public final class i implements o {
    public final f.h.b.b.g2.s a;
    public final f.h.b.b.g2.t b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public String f4925d;

    /* renamed from: e  reason: collision with root package name */
    public f.h.b.b.y1.w f4926e;

    /* renamed from: f  reason: collision with root package name */
    public int f4927f;

    /* renamed from: g  reason: collision with root package name */
    public int f4928g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f4929h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f4930i;

    /* renamed from: j  reason: collision with root package name */
    public long f4931j;

    /* renamed from: k  reason: collision with root package name */
    public Format f4932k;

    /* renamed from: l  reason: collision with root package name */
    public int f4933l;

    /* renamed from: m  reason: collision with root package name */
    public long f4934m;

    public i(String str) {
        f.h.b.b.g2.s sVar = new f.h.b.b.g2.s(new byte[16]);
        this.a = sVar;
        this.b = new f.h.b.b.g2.t(sVar.a);
        this.f4927f = 0;
        this.f4928g = 0;
        this.f4929h = false;
        this.f4930i = false;
        this.c = str;
    }

    @Override // f.h.b.b.y1.j0.o
    public void b(f.h.b.b.g2.t tVar) {
        boolean z;
        int r;
        f.h.b.b.e2.j.i(this.f4926e);
        while (tVar.a() > 0) {
            int i2 = this.f4927f;
            if (i2 == 0) {
                while (true) {
                    if (tVar.a() <= 0) {
                        z = false;
                        break;
                    } else if (!this.f4929h) {
                        this.f4929h = tVar.r() == 172;
                    } else {
                        r = tVar.r();
                        this.f4929h = r == 172;
                        if (r == 64 || r == 65) {
                            break;
                        }
                    }
                }
                this.f4930i = r == 65;
                z = true;
                if (z) {
                    this.f4927f = 1;
                    byte[] bArr = this.b.a;
                    bArr[0] = -84;
                    bArr[1] = (byte) (this.f4930i ? 65 : 64);
                    this.f4928g = 2;
                }
            } else if (i2 == 1) {
                byte[] bArr2 = this.b.a;
                int min = Math.min(tVar.a(), 16 - this.f4928g);
                System.arraycopy(tVar.a, tVar.b, bArr2, this.f4928g, min);
                tVar.b += min;
                int i3 = this.f4928g + min;
                this.f4928g = i3;
                if (i3 == 16) {
                    this.a.k(0);
                    m.b b = f.h.b.b.u1.m.b(this.a);
                    Format format = this.f4932k;
                    if (format == null || 2 != format.D || b.a != format.E || !"audio/ac4".equals(format.q)) {
                        Format.b bVar = new Format.b();
                        bVar.a = this.f4925d;
                        bVar.f722k = "audio/ac4";
                        bVar.x = 2;
                        bVar.y = b.a;
                        bVar.c = this.c;
                        Format a = bVar.a();
                        this.f4932k = a;
                        this.f4926e.e(a);
                    }
                    this.f4933l = b.b;
                    this.f4931j = (b.c * 1000000) / this.f4932k.E;
                    this.b.C(0);
                    this.f4926e.c(this.b, 16);
                    this.f4927f = 2;
                }
            } else if (i2 == 2) {
                int min2 = Math.min(tVar.a(), this.f4933l - this.f4928g);
                this.f4926e.c(tVar, min2);
                int i4 = this.f4928g + min2;
                this.f4928g = i4;
                int i5 = this.f4933l;
                if (i4 == i5) {
                    this.f4926e.d(this.f4934m, 1, i5, 0, null);
                    this.f4934m += this.f4931j;
                    this.f4927f = 0;
                }
            }
        }
    }

    @Override // f.h.b.b.y1.j0.o
    public void c() {
        this.f4927f = 0;
        this.f4928g = 0;
        this.f4929h = false;
        this.f4930i = false;
    }

    @Override // f.h.b.b.y1.j0.o
    public void d() {
    }

    @Override // f.h.b.b.y1.j0.o
    public void e(f.h.b.b.y1.j jVar, i0.d dVar) {
        dVar.a();
        this.f4925d = dVar.b();
        this.f4926e = jVar.p(dVar.c(), 1);
    }

    @Override // f.h.b.b.y1.j0.o
    public void f(long j2, int i2) {
        this.f4934m = j2;
    }
}
