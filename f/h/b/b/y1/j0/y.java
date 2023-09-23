package f.h.b.b.y1.j0;

import android.util.Log;
import f.h.b.b.y1.j0.i0;

/* compiled from: PesReader.java */
/* loaded from: classes.dex */
public final class y implements i0 {
    public final o a;
    public final f.h.b.b.g2.s b = new f.h.b.b.g2.s(new byte[10]);
    public int c = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f5069d;

    /* renamed from: e  reason: collision with root package name */
    public f.h.b.b.g2.a0 f5070e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f5071f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f5072g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f5073h;

    /* renamed from: i  reason: collision with root package name */
    public int f5074i;

    /* renamed from: j  reason: collision with root package name */
    public int f5075j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f5076k;

    /* renamed from: l  reason: collision with root package name */
    public long f5077l;

    public y(o oVar) {
        this.a = oVar;
    }

    @Override // f.h.b.b.y1.j0.i0
    public void a(f.h.b.b.g2.a0 a0Var, f.h.b.b.y1.j jVar, i0.d dVar) {
        this.f5070e = a0Var;
        this.a.e(jVar, dVar);
    }

    @Override // f.h.b.b.y1.j0.i0
    public final void b(f.h.b.b.g2.t tVar, int i2) {
        boolean z;
        f.h.b.b.e2.j.i(this.f5070e);
        int i3 = -1;
        int i4 = 3;
        if ((i2 & 1) != 0) {
            int i5 = this.c;
            if (i5 != 0 && i5 != 1) {
                if (i5 == 2) {
                    Log.w("PesReader", "Unexpected start indicator reading extended header");
                } else if (i5 == 3) {
                    int i6 = this.f5075j;
                    if (i6 != -1) {
                        StringBuilder sb = new StringBuilder(59);
                        sb.append("Unexpected start indicator: expected ");
                        sb.append(i6);
                        sb.append(" more bytes");
                        Log.w("PesReader", sb.toString());
                    }
                    this.a.d();
                } else {
                    throw new IllegalStateException();
                }
            }
            e(1);
        }
        while (tVar.a() > 0) {
            int i7 = this.c;
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 == 2) {
                        if (d(tVar, this.b.a, Math.min(10, this.f5074i)) && d(tVar, null, this.f5074i)) {
                            this.b.k(0);
                            this.f5077l = -9223372036854775807L;
                            if (this.f5071f) {
                                this.b.m(4);
                                this.b.m(1);
                                this.b.m(1);
                                long g2 = (this.b.g(i4) << 30) | (this.b.g(15) << 15) | this.b.g(15);
                                this.b.m(1);
                                if (!this.f5073h && this.f5072g) {
                                    this.b.m(4);
                                    this.b.m(1);
                                    this.b.m(1);
                                    this.b.m(1);
                                    this.f5070e.b((this.b.g(i4) << 30) | (this.b.g(15) << 15) | this.b.g(15));
                                    this.f5073h = true;
                                }
                                this.f5077l = this.f5070e.b(g2);
                            }
                            i2 |= this.f5076k ? 4 : 0;
                            this.a.f(this.f5077l, i2);
                            e(3);
                        }
                    } else if (i7 == i4) {
                        int a = tVar.a();
                        int i8 = this.f5075j;
                        int i9 = i8 != i3 ? a - i8 : 0;
                        if (i9 > 0) {
                            a -= i9;
                            tVar.B(tVar.b + a);
                        }
                        this.a.b(tVar);
                        int i10 = this.f5075j;
                        if (i10 != i3) {
                            int i11 = i10 - a;
                            this.f5075j = i11;
                            if (i11 == 0) {
                                this.a.d();
                                e(1);
                            }
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else if (d(tVar, this.b.a, 9)) {
                    this.b.k(0);
                    int g3 = this.b.g(24);
                    if (g3 != 1) {
                        f.a.b.a.a.G(41, "Unexpected start code prefix: ", g3, "PesReader");
                        this.f5075j = -1;
                        z = false;
                    } else {
                        this.b.m(8);
                        int g4 = this.b.g(16);
                        this.b.m(5);
                        this.f5076k = this.b.f();
                        this.b.m(2);
                        this.f5071f = this.b.f();
                        this.f5072g = this.b.f();
                        this.b.m(6);
                        int g5 = this.b.g(8);
                        this.f5074i = g5;
                        if (g4 == 0) {
                            this.f5075j = -1;
                        } else {
                            int i12 = ((g4 + 6) - 9) - g5;
                            this.f5075j = i12;
                            if (i12 < 0) {
                                f.a.b.a.a.G(47, "Found negative packet payload size: ", i12, "PesReader");
                                this.f5075j = -1;
                            }
                        }
                        z = true;
                    }
                    e(z ? 2 : 0);
                }
            } else {
                tVar.D(tVar.a());
            }
            i3 = -1;
            i4 = 3;
        }
    }

    @Override // f.h.b.b.y1.j0.i0
    public final void c() {
        this.c = 0;
        this.f5069d = 0;
        this.f5073h = false;
        this.a.c();
    }

    public final boolean d(f.h.b.b.g2.t tVar, byte[] bArr, int i2) {
        int min = Math.min(tVar.a(), i2 - this.f5069d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            tVar.D(min);
        } else {
            System.arraycopy(tVar.a, tVar.b, bArr, this.f5069d, min);
            tVar.b += min;
        }
        int i3 = this.f5069d + min;
        this.f5069d = i3;
        return i3 == i2;
    }

    public final void e(int i2) {
        this.c = i2;
        this.f5069d = 0;
    }
}
