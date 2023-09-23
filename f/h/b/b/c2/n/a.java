package f.h.b.b.c2.n;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.util.Log;
import android.util.SparseArray;
import f.h.b.b.c2.d;
import f.h.b.b.c2.f;
import f.h.b.b.c2.n.b;
import f.h.b.b.g2.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: DvbDecoder.java */
/* loaded from: classes.dex */
public final class a extends d {
    public final b n;

    public a(List<byte[]> list) {
        super("DvbDecoder");
        byte[] bArr = list.get(0);
        int length = bArr.length;
        int i2 = 0 + 1;
        int i3 = i2 + 1;
        this.n = new b(((bArr[0] & 255) << 8) | (bArr[i2] & 255), (bArr[i3 + 1] & 255) | ((bArr[i3] & 255) << 8));
    }

    @Override // f.h.b.b.c2.d
    public f j(byte[] bArr, int i2, boolean z) {
        c cVar;
        c cVar2;
        List unmodifiableList;
        int i3;
        c cVar3;
        SparseArray<b.e> sparseArray;
        int i4;
        SparseArray<b.g> sparseArray2;
        int[] iArr;
        b.f fVar;
        int g2;
        int g3;
        int i5;
        int i6;
        int i7;
        int i8;
        if (z) {
            b.h hVar = this.n.f3986f;
            hVar.c.clear();
            hVar.f4000d.clear();
            hVar.f4001e.clear();
            hVar.f4002f.clear();
            hVar.f4003g.clear();
            hVar.f4004h = null;
            hVar.f4005i = null;
        }
        b bVar = this.n;
        Objects.requireNonNull(bVar);
        s sVar = new s(bArr, i2);
        while (sVar.b() >= 48 && sVar.g(8) == 15) {
            b.h hVar2 = bVar.f3986f;
            int g4 = sVar.g(8);
            int i9 = 16;
            int g5 = sVar.g(16);
            int g6 = sVar.g(16);
            int d2 = sVar.d() + g6;
            if (g6 * 8 > sVar.b()) {
                Log.w("DvbParser", "Data field length exceeds limit");
                sVar.m(sVar.b());
            } else {
                switch (g4) {
                    case 16:
                        if (g5 == hVar2.a) {
                            b.d dVar = hVar2.f4005i;
                            int i10 = 8;
                            int g7 = sVar.g(8);
                            int g8 = sVar.g(4);
                            int g9 = sVar.g(2);
                            sVar.m(2);
                            int i11 = g6 - 2;
                            SparseArray sparseArray3 = new SparseArray();
                            while (i11 > 0) {
                                int g10 = sVar.g(i10);
                                sVar.m(i10);
                                i11 -= 6;
                                sparseArray3.put(g10, new b.e(sVar.g(16), sVar.g(16)));
                                i10 = 8;
                            }
                            b.d dVar2 = new b.d(g7, g8, g9, sparseArray3);
                            if (g9 != 0) {
                                hVar2.f4005i = dVar2;
                                hVar2.c.clear();
                                hVar2.f4000d.clear();
                                hVar2.f4001e.clear();
                                break;
                            } else if (dVar != null && dVar.a != g8) {
                                hVar2.f4005i = dVar2;
                                break;
                            }
                        }
                        break;
                    case 17:
                        b.d dVar3 = hVar2.f4005i;
                        if (g5 == hVar2.a && dVar3 != null) {
                            int g11 = sVar.g(8);
                            sVar.m(4);
                            boolean f2 = sVar.f();
                            sVar.m(3);
                            int g12 = sVar.g(16);
                            int g13 = sVar.g(16);
                            int g14 = sVar.g(3);
                            int g15 = sVar.g(3);
                            sVar.m(2);
                            int g16 = sVar.g(8);
                            int g17 = sVar.g(8);
                            int g18 = sVar.g(4);
                            int g19 = sVar.g(2);
                            sVar.m(2);
                            int i12 = g6 - 10;
                            SparseArray sparseArray4 = new SparseArray();
                            while (i12 > 0) {
                                int g20 = sVar.g(i9);
                                int g21 = sVar.g(2);
                                int g22 = sVar.g(2);
                                int g23 = sVar.g(12);
                                sVar.m(4);
                                int g24 = sVar.g(12);
                                i12 -= 6;
                                if (g21 == 1 || g21 == 2) {
                                    i12 -= 2;
                                    g2 = sVar.g(8);
                                    g3 = sVar.g(8);
                                } else {
                                    g2 = 0;
                                    g3 = 0;
                                }
                                sparseArray4.put(g20, new b.g(g21, g22, g23, g24, g2, g3));
                                i9 = 16;
                            }
                            b.f fVar2 = new b.f(g11, f2, g12, g13, g14, g15, g16, g17, g18, g19, sparseArray4);
                            if (dVar3.b == 0 && (fVar = hVar2.c.get(g11)) != null) {
                                SparseArray<b.g> sparseArray5 = fVar.f3999j;
                                for (int i13 = 0; i13 < sparseArray5.size(); i13++) {
                                    fVar2.f3999j.put(sparseArray5.keyAt(i13), sparseArray5.valueAt(i13));
                                }
                            }
                            hVar2.c.put(fVar2.a, fVar2);
                            break;
                        }
                        break;
                    case 18:
                        if (g5 == hVar2.a) {
                            b.a f3 = b.f(sVar, g6);
                            hVar2.f4000d.put(f3.a, f3);
                            break;
                        } else if (g5 == hVar2.b) {
                            b.a f4 = b.f(sVar, g6);
                            hVar2.f4002f.put(f4.a, f4);
                            break;
                        }
                        break;
                    case 19:
                        if (g5 == hVar2.a) {
                            b.c g25 = b.g(sVar);
                            hVar2.f4001e.put(g25.a, g25);
                            break;
                        } else if (g5 == hVar2.b) {
                            b.c g26 = b.g(sVar);
                            hVar2.f4003g.put(g26.a, g26);
                            break;
                        }
                        break;
                    case 20:
                        if (g5 == hVar2.a) {
                            sVar.m(4);
                            boolean f5 = sVar.f();
                            sVar.m(3);
                            int g27 = sVar.g(16);
                            int g28 = sVar.g(16);
                            if (f5) {
                                int g29 = sVar.g(16);
                                i5 = sVar.g(16);
                                i8 = sVar.g(16);
                                i6 = sVar.g(16);
                                i7 = g29;
                            } else {
                                i5 = g27;
                                i6 = g28;
                                i7 = 0;
                                i8 = 0;
                            }
                            hVar2.f4004h = new b.C0104b(g27, g28, i7, i5, i8, i6);
                            break;
                        }
                        break;
                }
                sVar.n(d2 - sVar.d());
            }
        }
        b.h hVar3 = bVar.f3986f;
        b.d dVar4 = hVar3.f4005i;
        if (dVar4 == null) {
            unmodifiableList = Collections.emptyList();
            cVar2 = cVar;
        } else {
            b.C0104b c0104b = hVar3.f4004h;
            if (c0104b == null) {
                c0104b = bVar.f3984d;
            }
            Bitmap bitmap = bVar.f3987g;
            if (bitmap == null || c0104b.a + 1 != bitmap.getWidth() || c0104b.b + 1 != bVar.f3987g.getHeight()) {
                Bitmap createBitmap = Bitmap.createBitmap(c0104b.a + 1, c0104b.b + 1, Bitmap.Config.ARGB_8888);
                bVar.f3987g = createBitmap;
                bVar.c.setBitmap(createBitmap);
            }
            ArrayList arrayList = new ArrayList();
            SparseArray<b.e> sparseArray6 = dVar4.c;
            int i14 = 0;
            while (i14 < sparseArray6.size()) {
                bVar.c.save();
                b.e valueAt = sparseArray6.valueAt(i14);
                b.f fVar3 = bVar.f3986f.c.get(sparseArray6.keyAt(i14));
                int i15 = valueAt.a + c0104b.c;
                int i16 = valueAt.b + c0104b.f3990e;
                bVar.c.clipRect(i15, i16, Math.min(fVar3.c + i15, c0104b.f3989d), Math.min(fVar3.f3993d + i16, c0104b.f3991f));
                b.a aVar = bVar.f3986f.f4000d.get(fVar3.f3995f);
                if (aVar == null && (aVar = bVar.f3986f.f4002f.get(fVar3.f3995f)) == null) {
                    aVar = bVar.f3985e;
                }
                SparseArray<b.g> sparseArray7 = fVar3.f3999j;
                int i17 = 0;
                while (i17 < sparseArray7.size()) {
                    int keyAt = sparseArray7.keyAt(i17);
                    b.g valueAt2 = sparseArray7.valueAt(i17);
                    b.c cVar4 = bVar.f3986f.f4001e.get(keyAt);
                    if (cVar4 == null) {
                        cVar4 = bVar.f3986f.f4003g.get(keyAt);
                    }
                    if (cVar4 != null) {
                        Paint paint = cVar4.b ? null : bVar.a;
                        int i18 = fVar3.f3994e;
                        sparseArray = sparseArray6;
                        int i19 = valueAt2.a + i15;
                        int i20 = valueAt2.b + i16;
                        sparseArray2 = sparseArray7;
                        Canvas canvas = bVar.c;
                        cVar3 = cVar;
                        if (i18 == 3) {
                            iArr = aVar.f3988d;
                        } else if (i18 == 2) {
                            iArr = aVar.c;
                        } else {
                            iArr = aVar.b;
                        }
                        i4 = i14;
                        int[] iArr2 = iArr;
                        Paint paint2 = paint;
                        b.e(cVar4.c, iArr2, i18, i19, i20, paint2, canvas);
                        b.e(cVar4.f3992d, iArr2, i18, i19, i20 + 1, paint2, canvas);
                    } else {
                        cVar3 = cVar;
                        sparseArray = sparseArray6;
                        i4 = i14;
                        sparseArray2 = sparseArray7;
                    }
                    i17++;
                    sparseArray6 = sparseArray;
                    sparseArray7 = sparseArray2;
                    cVar = cVar3;
                    i14 = i4;
                }
                c cVar5 = cVar;
                SparseArray<b.e> sparseArray8 = sparseArray6;
                int i21 = i14;
                if (fVar3.b) {
                    int i22 = fVar3.f3994e;
                    if (i22 == 3) {
                        i3 = aVar.f3988d[fVar3.f3996g];
                    } else if (i22 == 2) {
                        i3 = aVar.c[fVar3.f3997h];
                    } else {
                        i3 = aVar.b[fVar3.f3998i];
                    }
                    bVar.b.setColor(i3);
                    bVar.c.drawRect(i15, i16, fVar3.c + i15, fVar3.f3993d + i16, bVar.b);
                }
                Bitmap createBitmap2 = Bitmap.createBitmap(bVar.f3987g, i15, i16, fVar3.c, fVar3.f3993d);
                float f6 = c0104b.a;
                float f7 = c0104b.b;
                arrayList.add(new f.h.b.b.c2.c(null, null, createBitmap2, i16 / f7, 0, 0, i15 / f6, 0, Integer.MIN_VALUE, -3.4028235E38f, fVar3.c / f6, fVar3.f3993d / f7, false, -16777216, Integer.MIN_VALUE, null));
                bVar.c.drawColor(0, PorterDuff.Mode.CLEAR);
                bVar.c.restore();
                i14 = i21 + 1;
                sparseArray6 = sparseArray8;
                cVar = cVar5;
            }
            cVar2 = cVar;
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        return new c(unmodifiableList);
    }
}
