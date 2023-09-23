package f.h.b.b.y1.i0;

import android.util.Log;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import f.h.b.b.g2.t;
import f.h.b.b.y1.a0;
import f.h.b.b.y1.i0.i;
import f.h.b.b.y1.x;
import f.h.b.b.y1.y;
import f.h.b.b.y1.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: VorbisReader.java */
/* loaded from: classes.dex */
public final class j extends i {
    public a n;
    public int o;
    public boolean p;
    public a0 q;
    public y r;

    /* compiled from: VorbisReader.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final a0 a;
        public final byte[] b;
        public final z[] c;

        /* renamed from: d  reason: collision with root package name */
        public final int f4875d;

        public a(a0 a0Var, y yVar, byte[] bArr, z[] zVarArr, int i2) {
            this.a = a0Var;
            this.b = bArr;
            this.c = zVarArr;
            this.f4875d = i2;
        }
    }

    @Override // f.h.b.b.y1.i0.i
    public void b(long j2) {
        this.f4868g = j2;
        this.p = j2 != 0;
        a0 a0Var = this.q;
        this.o = a0Var != null ? a0Var.f4682e : 0;
    }

    @Override // f.h.b.b.y1.i0.i
    public long c(t tVar) {
        int i2;
        byte[] bArr = tVar.a;
        if ((bArr[0] & 1) == 1) {
            return -1L;
        }
        byte b = bArr[0];
        a aVar = this.n;
        f.h.b.b.e2.j.i(aVar);
        a aVar2 = aVar;
        if (!aVar2.c[(b >> 1) & (255 >>> (8 - aVar2.f4875d))].a) {
            i2 = aVar2.a.f4682e;
        } else {
            i2 = aVar2.a.f4683f;
        }
        long j2 = this.p ? (this.o + i2) / 4 : 0;
        byte[] bArr2 = tVar.a;
        int length = bArr2.length;
        int i3 = tVar.c + 4;
        if (length < i3) {
            tVar.z(Arrays.copyOf(bArr2, i3));
        } else {
            tVar.B(i3);
        }
        byte[] bArr3 = tVar.a;
        int i4 = tVar.c;
        bArr3[i4 - 4] = (byte) (j2 & 255);
        bArr3[i4 - 3] = (byte) ((j2 >>> 8) & 255);
        bArr3[i4 - 2] = (byte) ((j2 >>> 16) & 255);
        bArr3[i4 - 1] = (byte) ((j2 >>> 24) & 255);
        this.p = true;
        this.o = i2;
        return j2;
    }

    @Override // f.h.b.b.y1.i0.i
    public boolean d(t tVar, long j2, i.b bVar) {
        a aVar;
        int i2;
        int i3;
        byte[] bArr;
        long j3;
        byte[] bArr2;
        int i4;
        if (this.n != null) {
            Objects.requireNonNull(bVar.a);
            return false;
        }
        a0 a0Var = this.q;
        if (a0Var == null) {
            f.c.a.a.i.L(1, tVar, false);
            int j4 = tVar.j();
            int r = tVar.r();
            int j5 = tVar.j();
            int h2 = tVar.h();
            int i5 = h2 <= 0 ? -1 : h2;
            int h3 = tVar.h();
            int i6 = h3 <= 0 ? -1 : h3;
            int h4 = tVar.h();
            int i7 = h4 <= 0 ? -1 : h4;
            int r2 = tVar.r();
            this.q = new a0(j4, r, j5, i5, i6, i7, (int) Math.pow(2.0d, r2 & 15), (int) Math.pow(2.0d, (r2 & 240) >> 4), (1 & tVar.r()) > 0, Arrays.copyOf(tVar.a, tVar.c));
        } else {
            y yVar = this.r;
            if (yVar == null) {
                this.r = f.c.a.a.i.E(tVar, true, true);
            } else {
                int i8 = tVar.c;
                byte[] bArr3 = new byte[i8];
                System.arraycopy(tVar.a, 0, bArr3, 0, i8);
                int i9 = a0Var.a;
                int i10 = 5;
                f.c.a.a.i.L(5, tVar, false);
                int r3 = tVar.r() + 1;
                x xVar = new x(tVar.a);
                xVar.c(tVar.b * 8);
                int i11 = 0;
                while (true) {
                    int i12 = 16;
                    if (i11 < r3) {
                        if (xVar.b(24) == 5653314) {
                            int b = xVar.b(16);
                            int b2 = xVar.b(24);
                            long[] jArr = new long[b2];
                            if (!xVar.a()) {
                                boolean a2 = xVar.a();
                                int i13 = 0;
                                while (i13 < b2) {
                                    if (a2) {
                                        if (xVar.a()) {
                                            bArr2 = bArr3;
                                            i4 = r3;
                                            jArr[i13] = xVar.b(i10) + 1;
                                        } else {
                                            bArr2 = bArr3;
                                            i4 = r3;
                                            jArr[i13] = 0;
                                        }
                                    } else {
                                        bArr2 = bArr3;
                                        i4 = r3;
                                        jArr[i13] = xVar.b(i10) + 1;
                                    }
                                    i13++;
                                    i10 = 5;
                                    r3 = i4;
                                    bArr3 = bArr2;
                                }
                                i3 = r3;
                                bArr = bArr3;
                            } else {
                                byte[] bArr4 = bArr3;
                                i3 = r3;
                                int b3 = xVar.b(5) + 1;
                                int i14 = 0;
                                while (i14 < b2) {
                                    int b4 = xVar.b(f.c.a.a.i.s(b2 - i14));
                                    int i15 = 0;
                                    while (i15 < b4 && i14 < b2) {
                                        jArr[i14] = b3;
                                        i14++;
                                        i15++;
                                        bArr4 = bArr4;
                                    }
                                    b3++;
                                    bArr4 = bArr4;
                                }
                                bArr = bArr4;
                            }
                            int b5 = xVar.b(4);
                            if (b5 > 2) {
                                throw new ParserException(f.a.b.a.a.d(53, "lookup type greater than 2 not decodable: ", b5));
                            }
                            if (b5 == 1 || b5 == 2) {
                                xVar.c(32);
                                xVar.c(32);
                                int b6 = xVar.b(4) + 1;
                                xVar.c(1);
                                if (b5 == 1) {
                                    j3 = b != 0 ? (long) Math.floor(Math.pow(b2, 1.0d / b)) : 0L;
                                } else {
                                    j3 = b2 * b;
                                }
                                xVar.c((int) (b6 * j3));
                            }
                            i11++;
                            i10 = 5;
                            r3 = i3;
                            bArr3 = bArr;
                        } else {
                            throw new ParserException(f.a.b.a.a.d(66, "expected code book to start with [0x56, 0x43, 0x42] at ", (xVar.c * 8) + xVar.f5111d));
                        }
                    } else {
                        byte[] bArr5 = bArr3;
                        int i16 = 6;
                        int b7 = xVar.b(6) + 1;
                        for (int i17 = 0; i17 < b7; i17++) {
                            if (xVar.b(16) != 0) {
                                throw new ParserException("placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int i18 = 1;
                        int b8 = xVar.b(6) + 1;
                        int i19 = 0;
                        while (true) {
                            int i20 = 3;
                            if (i19 < b8) {
                                int b9 = xVar.b(i12);
                                if (b9 == 0) {
                                    i2 = b8;
                                    int i21 = 8;
                                    xVar.c(8);
                                    xVar.c(16);
                                    xVar.c(16);
                                    xVar.c(6);
                                    xVar.c(8);
                                    int b10 = xVar.b(4) + 1;
                                    int i22 = 0;
                                    while (i22 < b10) {
                                        xVar.c(i21);
                                        i22++;
                                        i21 = 8;
                                    }
                                } else if (b9 == i18) {
                                    int b11 = xVar.b(5);
                                    int[] iArr = new int[b11];
                                    int i23 = -1;
                                    for (int i24 = 0; i24 < b11; i24++) {
                                        iArr[i24] = xVar.b(4);
                                        if (iArr[i24] > i23) {
                                            i23 = iArr[i24];
                                        }
                                    }
                                    int i25 = i23 + 1;
                                    int[] iArr2 = new int[i25];
                                    int i26 = 0;
                                    while (i26 < i25) {
                                        iArr2[i26] = xVar.b(i20) + 1;
                                        int b12 = xVar.b(2);
                                        if (b12 > 0) {
                                            xVar.c(8);
                                        }
                                        int i27 = b8;
                                        for (int i28 = 0; i28 < (1 << b12); i28++) {
                                            xVar.c(8);
                                        }
                                        i26++;
                                        i20 = 3;
                                        b8 = i27;
                                    }
                                    i2 = b8;
                                    xVar.c(2);
                                    int b13 = xVar.b(4);
                                    int i29 = 0;
                                    int i30 = 0;
                                    for (int i31 = 0; i31 < b11; i31++) {
                                        i29 += iArr2[iArr[i31]];
                                        while (i30 < i29) {
                                            xVar.c(b13);
                                            i30++;
                                        }
                                    }
                                } else {
                                    throw new ParserException(f.a.b.a.a.d(52, "floor type greater than 1 not decodable: ", b9));
                                }
                                i19++;
                                i16 = 6;
                                i18 = 1;
                                b8 = i2;
                                i12 = 16;
                            } else {
                                int i32 = 1;
                                int b14 = xVar.b(i16) + 1;
                                int i33 = 0;
                                while (i33 < b14) {
                                    if (xVar.b(16) <= 2) {
                                        xVar.c(24);
                                        xVar.c(24);
                                        xVar.c(24);
                                        int b15 = xVar.b(i16) + i32;
                                        int i34 = 8;
                                        xVar.c(8);
                                        int[] iArr3 = new int[b15];
                                        for (int i35 = 0; i35 < b15; i35++) {
                                            iArr3[i35] = ((xVar.a() ? xVar.b(5) : 0) * 8) + xVar.b(3);
                                        }
                                        int i36 = 0;
                                        while (i36 < b15) {
                                            int i37 = 0;
                                            while (i37 < i34) {
                                                if ((iArr3[i36] & (1 << i37)) != 0) {
                                                    xVar.c(i34);
                                                }
                                                i37++;
                                                i34 = 8;
                                            }
                                            i36++;
                                            i34 = 8;
                                        }
                                        i33++;
                                        i16 = 6;
                                        i32 = 1;
                                    } else {
                                        throw new ParserException("residueType greater than 2 is not decodable");
                                    }
                                }
                                int b16 = xVar.b(i16) + 1;
                                for (int i38 = 0; i38 < b16; i38++) {
                                    int b17 = xVar.b(16);
                                    if (b17 != 0) {
                                        StringBuilder sb = new StringBuilder(52);
                                        sb.append("mapping type other than 0 not supported: ");
                                        sb.append(b17);
                                        Log.e("VorbisUtil", sb.toString());
                                    } else {
                                        int b18 = xVar.a() ? xVar.b(4) + 1 : 1;
                                        if (xVar.a()) {
                                            int b19 = xVar.b(8) + 1;
                                            for (int i39 = 0; i39 < b19; i39++) {
                                                int i40 = i9 - 1;
                                                xVar.c(f.c.a.a.i.s(i40));
                                                xVar.c(f.c.a.a.i.s(i40));
                                            }
                                        }
                                        if (xVar.b(2) != 0) {
                                            throw new ParserException("to reserved bits must be zero after mapping coupling steps");
                                        }
                                        if (b18 > 1) {
                                            for (int i41 = 0; i41 < i9; i41++) {
                                                xVar.c(4);
                                            }
                                        }
                                        for (int i42 = 0; i42 < b18; i42++) {
                                            xVar.c(8);
                                            xVar.c(8);
                                            xVar.c(8);
                                        }
                                    }
                                }
                                int b20 = xVar.b(6) + 1;
                                z[] zVarArr = new z[b20];
                                for (int i43 = 0; i43 < b20; i43++) {
                                    zVarArr[i43] = new z(xVar.a(), xVar.b(16), xVar.b(16), xVar.b(8));
                                }
                                if (xVar.a()) {
                                    aVar = new a(a0Var, yVar, bArr5, zVarArr, f.c.a.a.i.s(b20 - 1));
                                } else {
                                    throw new ParserException("framing bit after modes not set as expected");
                                }
                            }
                        }
                    }
                }
            }
        }
        aVar = null;
        this.n = aVar;
        if (aVar == null) {
            return true;
        }
        a0 a0Var2 = aVar.a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(a0Var2.f4684g);
        arrayList.add(aVar.b);
        Format.b bVar2 = new Format.b();
        bVar2.f722k = "audio/vorbis";
        bVar2.f717f = a0Var2.f4681d;
        bVar2.f718g = a0Var2.c;
        bVar2.x = a0Var2.a;
        bVar2.y = a0Var2.b;
        bVar2.f724m = arrayList;
        bVar.a = bVar2.a();
        return true;
    }

    @Override // f.h.b.b.y1.i0.i
    public void e(boolean z) {
        super.e(z);
        if (z) {
            this.n = null;
            this.q = null;
            this.r = null;
        }
        this.o = 0;
        this.p = false;
    }
}
