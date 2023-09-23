package f.h.b.b.y1.j0;

import f.h.b.b.y1.j0.i0;

/* compiled from: SectionReader.java */
/* loaded from: classes.dex */
public final class d0 implements i0 {
    public final c0 a;
    public final f.h.b.b.g2.t b = new f.h.b.b.g2.t(32);
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public int f4894d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f4895e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f4896f;

    public d0(c0 c0Var) {
        this.a = c0Var;
    }

    @Override // f.h.b.b.y1.j0.i0
    public void a(f.h.b.b.g2.a0 a0Var, f.h.b.b.y1.j jVar, i0.d dVar) {
        this.a.a(a0Var, jVar, dVar);
        this.f4896f = true;
    }

    @Override // f.h.b.b.y1.j0.i0
    public void b(f.h.b.b.g2.t tVar, int i2) {
        boolean z = (i2 & 1) != 0;
        int r = z ? tVar.b + tVar.r() : -1;
        if (this.f4896f) {
            if (!z) {
                return;
            }
            this.f4896f = false;
            tVar.C(r);
            this.f4894d = 0;
        }
        while (tVar.a() > 0) {
            int i3 = this.f4894d;
            if (i3 < 3) {
                if (i3 == 0) {
                    int r2 = tVar.r();
                    tVar.C(tVar.b - 1);
                    if (r2 == 255) {
                        this.f4896f = true;
                        return;
                    }
                }
                int min = Math.min(tVar.a(), 3 - this.f4894d);
                tVar.e(this.b.a, this.f4894d, min);
                int i4 = this.f4894d + min;
                this.f4894d = i4;
                if (i4 == 3) {
                    this.b.C(0);
                    this.b.B(3);
                    this.b.D(1);
                    int r3 = this.b.r();
                    int r4 = this.b.r();
                    this.f4895e = (r3 & 128) != 0;
                    int i5 = (((r3 & 15) << 8) | r4) + 3;
                    this.c = i5;
                    byte[] bArr = this.b.a;
                    if (bArr.length < i5) {
                        this.b.b(Math.min(4098, Math.max(i5, bArr.length * 2)));
                    }
                }
            } else {
                int min2 = Math.min(tVar.a(), this.c - this.f4894d);
                tVar.e(this.b.a, this.f4894d, min2);
                int i6 = this.f4894d + min2;
                this.f4894d = i6;
                int i7 = this.c;
                if (i6 != i7) {
                    continue;
                } else {
                    if (this.f4895e) {
                        byte[] bArr2 = this.b.a;
                        int i8 = f.h.b.b.g2.b0.a;
                        int i9 = -1;
                        for (int i10 = 0; i10 < i7; i10++) {
                            i9 = f.h.b.b.g2.b0.f4275k[((i9 >>> 24) ^ (bArr2[i10] & 255)) & 255] ^ (i9 << 8);
                        }
                        if (i9 != 0) {
                            this.f4896f = true;
                            return;
                        }
                        this.b.B(this.c - 4);
                    } else {
                        this.b.B(i7);
                    }
                    this.b.C(0);
                    this.a.b(this.b);
                    this.f4894d = 0;
                }
            }
        }
    }

    @Override // f.h.b.b.y1.j0.i0
    public void c() {
        this.f4896f = true;
    }
}
