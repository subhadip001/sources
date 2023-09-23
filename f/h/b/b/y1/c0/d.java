package f.h.b.b.y1.c0;

import android.net.Uri;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import f.h.b.b.g2.b0;
import f.h.b.b.g2.t;
import f.h.b.b.y1.h;
import f.h.b.b.y1.i;
import f.h.b.b.y1.j;
import f.h.b.b.y1.k;
import f.h.b.b.y1.l;
import f.h.b.b.y1.m;
import f.h.b.b.y1.n;
import f.h.b.b.y1.o;
import f.h.b.b.y1.s;
import f.h.b.b.y1.t;
import f.h.b.b.y1.w;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* compiled from: FlacExtractor.java */
/* loaded from: classes.dex */
public final class d implements h {
    public final byte[] a = new byte[42];
    public final t b = new t(new byte[32768], 0);
    public final boolean c;

    /* renamed from: d  reason: collision with root package name */
    public final m.a f4698d;

    /* renamed from: e  reason: collision with root package name */
    public j f4699e;

    /* renamed from: f  reason: collision with root package name */
    public w f4700f;

    /* renamed from: g  reason: collision with root package name */
    public int f4701g;

    /* renamed from: h  reason: collision with root package name */
    public Metadata f4702h;

    /* renamed from: i  reason: collision with root package name */
    public o f4703i;

    /* renamed from: j  reason: collision with root package name */
    public int f4704j;

    /* renamed from: k  reason: collision with root package name */
    public int f4705k;

    /* renamed from: l  reason: collision with root package name */
    public c f4706l;

    /* renamed from: m  reason: collision with root package name */
    public int f4707m;
    public long n;

    static {
        a aVar = new l() { // from class: f.h.b.b.y1.c0.a
            @Override // f.h.b.b.y1.l
            public final h[] a() {
                return new h[]{new d(0)};
            }

            @Override // f.h.b.b.y1.l
            public /* synthetic */ h[] b(Uri uri, Map map) {
                return k.a(this, uri, map);
            }
        };
    }

    public d(int i2) {
        this.c = (i2 & 1) != 0;
        this.f4698d = new m.a();
        this.f4701g = 0;
    }

    public final void a() {
        o oVar = this.f4703i;
        int i2 = b0.a;
        this.f4700f.d((this.n * 1000000) / oVar.f5101e, 1, this.f4707m, 0, null);
    }

    @Override // f.h.b.b.y1.h
    public boolean b(i iVar) {
        f.c.a.a.i.z(iVar, false);
        byte[] bArr = new byte[4];
        iVar.o(bArr, 0, 4);
        return (((((((long) bArr[0]) & 255) << 24) | ((((long) bArr[1]) & 255) << 16)) | ((((long) bArr[2]) & 255) << 8)) | (255 & ((long) bArr[3]))) == 1716281667;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v9, types: [boolean, int] */
    @Override // f.h.b.b.y1.h
    public int e(i iVar, s sVar) {
        byte[] bArr;
        boolean z;
        o oVar;
        f.h.b.b.y1.t bVar;
        long j2;
        boolean z2;
        int i2 = this.f4701g;
        ?? r4 = 0;
        if (i2 == 0) {
            iVar.l();
            long f2 = iVar.f();
            Metadata z3 = f.c.a.a.i.z(iVar, !this.c);
            iVar.m((int) (iVar.f() - f2));
            this.f4702h = z3;
            this.f4701g = 1;
            return 0;
        } else if (i2 == 1) {
            byte[] bArr2 = this.a;
            iVar.o(bArr2, 0, bArr2.length);
            iVar.l();
            this.f4701g = 2;
            return 0;
        } else {
            int i3 = 24;
            int i4 = 4;
            int i5 = 3;
            if (i2 == 2) {
                iVar.readFully(new byte[4], 0, 4);
                if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) == 1716281667) {
                    this.f4701g = 3;
                    return 0;
                }
                throw new ParserException("Failed to read FLAC stream marker.");
            }
            if (i2 == 3) {
                o oVar2 = this.f4703i;
                boolean z4 = false;
                while (!z4) {
                    iVar.l();
                    f.h.b.b.g2.s sVar2 = new f.h.b.b.g2.s(new byte[i4]);
                    iVar.o(sVar2.a, r4, i4);
                    boolean f3 = sVar2.f();
                    int g2 = sVar2.g(r11);
                    int g3 = sVar2.g(i3) + i4;
                    if (g2 == 0) {
                        byte[] bArr3 = new byte[38];
                        iVar.readFully(bArr3, r4, 38);
                        oVar2 = new o(bArr3, i4);
                    } else if (oVar2 == null) {
                        throw new IllegalArgumentException();
                    } else {
                        if (g2 == i5) {
                            t tVar = new t(g3);
                            iVar.readFully(tVar.a, r4, g3);
                            oVar2 = oVar2.b(f.c.a.a.i.D(tVar));
                        } else {
                            if (g2 == i4) {
                                t tVar2 = new t(g3);
                                iVar.readFully(tVar2.a, r4, g3);
                                tVar2.D(i4);
                                oVar = new o(oVar2.a, oVar2.b, oVar2.c, oVar2.f5100d, oVar2.f5101e, oVar2.f5103g, oVar2.f5104h, oVar2.f5106j, oVar2.f5107k, oVar2.f(o.a(Arrays.asList(f.c.a.a.i.E(tVar2, r4, r4).a), Collections.emptyList())));
                                z = f3;
                            } else if (g2 == 6) {
                                t tVar3 = new t(g3);
                                iVar.readFully(tVar3.a, r4, g3);
                                tVar3.D(4);
                                int f4 = tVar3.f();
                                String p = tVar3.p(tVar3.f(), f.h.c.a.c.a);
                                String o = tVar3.o(tVar3.f());
                                int f5 = tVar3.f();
                                int f6 = tVar3.f();
                                int f7 = tVar3.f();
                                int f8 = tVar3.f();
                                int f9 = tVar3.f();
                                byte[] bArr4 = new byte[f9];
                                System.arraycopy(tVar3.a, tVar3.b, bArr4, r4, f9);
                                tVar3.b += f9;
                                z = f3;
                                oVar = new o(oVar2.a, oVar2.b, oVar2.c, oVar2.f5100d, oVar2.f5101e, oVar2.f5103g, oVar2.f5104h, oVar2.f5106j, oVar2.f5107k, oVar2.f(o.a(Collections.emptyList(), Collections.singletonList(new PictureFrame(f4, p, o, f5, f6, f7, f8, bArr4)))));
                            } else {
                                z = f3;
                                iVar.m(g3);
                                int i6 = b0.a;
                                this.f4703i = oVar2;
                                z4 = z;
                                r4 = 0;
                                i3 = 24;
                                i4 = 4;
                                i5 = 3;
                                r11 = 7;
                            }
                            oVar2 = oVar;
                            int i62 = b0.a;
                            this.f4703i = oVar2;
                            z4 = z;
                            r4 = 0;
                            i3 = 24;
                            i4 = 4;
                            i5 = 3;
                            r11 = 7;
                        }
                    }
                    z = f3;
                    int i622 = b0.a;
                    this.f4703i = oVar2;
                    z4 = z;
                    r4 = 0;
                    i3 = 24;
                    i4 = 4;
                    i5 = 3;
                    r11 = 7;
                }
                Objects.requireNonNull(this.f4703i);
                this.f4704j = Math.max(this.f4703i.c, 6);
                w wVar = this.f4700f;
                int i7 = b0.a;
                wVar.e(this.f4703i.e(this.a, this.f4702h));
                this.f4701g = 4;
                return 0;
            }
            long j3 = 0;
            if (i2 == 4) {
                iVar.l();
                byte[] bArr5 = new byte[2];
                iVar.o(bArr5, 0, 2);
                int i8 = (bArr5[1] & 255) | ((bArr5[0] & 255) << 8);
                if ((i8 >> 2) == 16382) {
                    iVar.l();
                    this.f4705k = i8;
                    j jVar = this.f4699e;
                    int i9 = b0.a;
                    long position = iVar.getPosition();
                    long a = iVar.a();
                    Objects.requireNonNull(this.f4703i);
                    o oVar3 = this.f4703i;
                    if (oVar3.f5107k != null) {
                        bVar = new n(oVar3, position);
                    } else if (a != -1 && oVar3.f5106j > 0) {
                        c cVar = new c(oVar3, this.f4705k, position, a);
                        this.f4706l = cVar;
                        bVar = cVar.a;
                    } else {
                        bVar = new t.b(oVar3.d(), 0L);
                    }
                    jVar.a(bVar);
                    this.f4701g = 5;
                    return 0;
                }
                iVar.l();
                throw new ParserException("First frame does not start with sync code.");
            } else if (i2 == 5) {
                Objects.requireNonNull(this.f4700f);
                Objects.requireNonNull(this.f4703i);
                c cVar2 = this.f4706l;
                if (cVar2 != null && cVar2.b()) {
                    return this.f4706l.a(iVar, sVar);
                }
                if (this.n == -1) {
                    o oVar4 = this.f4703i;
                    iVar.l();
                    iVar.g(1);
                    byte[] bArr6 = new byte[1];
                    iVar.o(bArr6, 0, 1);
                    boolean z5 = (bArr6[0] & 1) == 1;
                    iVar.g(2);
                    r11 = z5 ? 7 : 6;
                    f.h.b.b.g2.t tVar4 = new f.h.b.b.g2.t(r11);
                    tVar4.B(f.c.a.a.i.A(iVar, tVar4.a, 0, r11));
                    iVar.l();
                    try {
                        long x = tVar4.x();
                        if (!z5) {
                            x *= oVar4.b;
                        }
                        j3 = x;
                    } catch (NumberFormatException unused) {
                        r3 = false;
                    }
                    if (r3) {
                        this.n = j3;
                        return 0;
                    }
                    throw new ParserException();
                }
                f.h.b.b.g2.t tVar5 = this.b;
                int i10 = tVar5.c;
                if (i10 < 32768) {
                    int b = iVar.b(tVar5.a, i10, 32768 - i10);
                    r3 = b == -1;
                    if (!r3) {
                        this.b.B(i10 + b);
                    } else if (this.b.a() == 0) {
                        a();
                        return -1;
                    }
                } else {
                    r3 = false;
                }
                f.h.b.b.g2.t tVar6 = this.b;
                int i11 = tVar6.b;
                int i12 = this.f4707m;
                int i13 = this.f4704j;
                if (i12 < i13) {
                    tVar6.D(Math.min(i13 - i12, tVar6.a()));
                }
                f.h.b.b.g2.t tVar7 = this.b;
                Objects.requireNonNull(this.f4703i);
                int i14 = tVar7.b;
                while (true) {
                    if (i14 <= tVar7.c - 16) {
                        tVar7.C(i14);
                        if (m.b(tVar7, this.f4703i, this.f4705k, this.f4698d)) {
                            tVar7.C(i14);
                            j2 = this.f4698d.a;
                            break;
                        }
                        i14++;
                    } else {
                        if (r3) {
                            while (true) {
                                int i15 = tVar7.c;
                                if (i14 <= i15 - this.f4704j) {
                                    tVar7.C(i14);
                                    try {
                                        z2 = m.b(tVar7, this.f4703i, this.f4705k, this.f4698d);
                                    } catch (IndexOutOfBoundsException unused2) {
                                        z2 = false;
                                    }
                                    if (tVar7.b > tVar7.c) {
                                        z2 = false;
                                    }
                                    if (z2) {
                                        tVar7.C(i14);
                                        j2 = this.f4698d.a;
                                        break;
                                    }
                                    i14++;
                                } else {
                                    tVar7.C(i15);
                                    break;
                                }
                            }
                        } else {
                            tVar7.C(i14);
                        }
                        j2 = -1;
                    }
                }
                f.h.b.b.g2.t tVar8 = this.b;
                int i16 = tVar8.b - i11;
                tVar8.C(i11);
                this.f4700f.c(this.b, i16);
                this.f4707m += i16;
                if (j2 != -1) {
                    a();
                    this.f4707m = 0;
                    this.n = j2;
                }
                if (this.b.a() < 16) {
                    int a2 = this.b.a();
                    f.h.b.b.g2.t tVar9 = this.b;
                    byte[] bArr7 = tVar9.a;
                    System.arraycopy(bArr7, tVar9.b, bArr7, 0, a2);
                    this.b.C(0);
                    this.b.B(a2);
                    return 0;
                }
                return 0;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    @Override // f.h.b.b.y1.h
    public void f(j jVar) {
        this.f4699e = jVar;
        this.f4700f = jVar.p(0, 1);
        jVar.j();
    }

    @Override // f.h.b.b.y1.h
    public void g(long j2, long j3) {
        if (j2 == 0) {
            this.f4701g = 0;
        } else {
            c cVar = this.f4706l;
            if (cVar != null) {
                cVar.e(j3);
            }
        }
        this.n = j3 != 0 ? -1L : 0L;
        this.f4707m = 0;
        this.b.y(0);
    }

    @Override // f.h.b.b.y1.h
    public void release() {
    }
}
