package f.h.b.b.y1.j0;

import com.google.android.exoplayer2.Format;
import f.h.b.b.u1.z;
import f.h.b.b.y1.j0.i0;

/* compiled from: MpegAudioReader.java */
/* loaded from: classes.dex */
public final class v implements o {
    public final f.h.b.b.g2.t a;
    public final z.a b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public f.h.b.b.y1.w f5058d;

    /* renamed from: e  reason: collision with root package name */
    public String f5059e;

    /* renamed from: f  reason: collision with root package name */
    public int f5060f = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f5061g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f5062h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f5063i;

    /* renamed from: j  reason: collision with root package name */
    public long f5064j;

    /* renamed from: k  reason: collision with root package name */
    public int f5065k;

    /* renamed from: l  reason: collision with root package name */
    public long f5066l;

    public v(String str) {
        f.h.b.b.g2.t tVar = new f.h.b.b.g2.t(4);
        this.a = tVar;
        tVar.a[0] = -1;
        this.b = new z.a();
        this.c = str;
    }

    @Override // f.h.b.b.y1.j0.o
    public void b(f.h.b.b.g2.t tVar) {
        f.h.b.b.e2.j.i(this.f5058d);
        while (tVar.a() > 0) {
            int i2 = this.f5060f;
            if (i2 == 0) {
                byte[] bArr = tVar.a;
                int i3 = tVar.b;
                int i4 = tVar.c;
                while (true) {
                    if (i3 < i4) {
                        boolean z = (bArr[i3] & 255) == 255;
                        boolean z2 = this.f5063i && (bArr[i3] & 224) == 224;
                        this.f5063i = z;
                        if (z2) {
                            tVar.C(i3 + 1);
                            this.f5063i = false;
                            this.a.a[1] = bArr[i3];
                            this.f5061g = 2;
                            this.f5060f = 1;
                            break;
                        }
                        i3++;
                    } else {
                        tVar.C(i4);
                        break;
                    }
                }
            } else if (i2 == 1) {
                int min = Math.min(tVar.a(), 4 - this.f5061g);
                tVar.e(this.a.a, this.f5061g, min);
                int i5 = this.f5061g + min;
                this.f5061g = i5;
                if (i5 >= 4) {
                    this.a.C(0);
                    if (!this.b.a(this.a.f())) {
                        this.f5061g = 0;
                        this.f5060f = 1;
                    } else {
                        z.a aVar = this.b;
                        this.f5065k = aVar.c;
                        if (!this.f5062h) {
                            int i6 = aVar.f4606d;
                            this.f5064j = (aVar.f4609g * 1000000) / i6;
                            Format.b bVar = new Format.b();
                            bVar.a = this.f5059e;
                            bVar.f722k = aVar.b;
                            bVar.f723l = 4096;
                            bVar.x = aVar.f4607e;
                            bVar.y = i6;
                            bVar.c = this.c;
                            this.f5058d.e(bVar.a());
                            this.f5062h = true;
                        }
                        this.a.C(0);
                        this.f5058d.c(this.a, 4);
                        this.f5060f = 2;
                    }
                }
            } else if (i2 == 2) {
                int min2 = Math.min(tVar.a(), this.f5065k - this.f5061g);
                this.f5058d.c(tVar, min2);
                int i7 = this.f5061g + min2;
                this.f5061g = i7;
                int i8 = this.f5065k;
                if (i7 >= i8) {
                    this.f5058d.d(this.f5066l, 1, i8, 0, null);
                    this.f5066l += this.f5064j;
                    this.f5061g = 0;
                    this.f5060f = 0;
                }
            } else {
                throw new IllegalStateException();
            }
        }
    }

    @Override // f.h.b.b.y1.j0.o
    public void c() {
        this.f5060f = 0;
        this.f5061g = 0;
        this.f5063i = false;
    }

    @Override // f.h.b.b.y1.j0.o
    public void d() {
    }

    @Override // f.h.b.b.y1.j0.o
    public void e(f.h.b.b.y1.j jVar, i0.d dVar) {
        dVar.a();
        this.f5059e = dVar.b();
        this.f5058d = jVar.p(dVar.c(), 1);
    }

    @Override // f.h.b.b.y1.j0.o
    public void f(long j2, int i2) {
        this.f5066l = j2;
    }
}
