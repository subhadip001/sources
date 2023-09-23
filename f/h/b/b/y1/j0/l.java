package f.h.b.b.y1.j0;

import android.util.SparseArray;
import com.google.android.exoplayer2.Format;
import f.h.b.b.y1.j0.i0;
import f.h.c.b.m0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: DefaultTsPayloadReaderFactory.java */
/* loaded from: classes.dex */
public final class l implements i0.c {
    public final int a;
    public final List<Format> b;

    public l(int i2) {
        f.h.c.b.a<Object> aVar = f.h.c.b.q.f5981g;
        f.h.c.b.q<Object> qVar = m0.f5954j;
        this.a = i2;
        this.b = qVar;
    }

    @Override // f.h.b.b.y1.j0.i0.c
    public i0 a(int i2, i0.b bVar) {
        if (i2 != 2) {
            if (i2 == 3 || i2 == 4) {
                return new y(new v(bVar.b));
            }
            if (i2 != 21) {
                if (i2 == 27) {
                    if (d(4)) {
                        return null;
                    }
                    return new y(new r(new e0(c(bVar)), d(1), d(8)));
                } else if (i2 != 36) {
                    if (i2 != 89) {
                        if (i2 != 138) {
                            if (i2 != 172) {
                                if (i2 != 257) {
                                    if (i2 != 129) {
                                        if (i2 != 130) {
                                            if (i2 == 134) {
                                                if (d(16)) {
                                                    return null;
                                                }
                                                return new d0(new x("application/x-scte35"));
                                            } else if (i2 != 135) {
                                                switch (i2) {
                                                    case 15:
                                                        if (d(2)) {
                                                            return null;
                                                        }
                                                        return new y(new k(false, bVar.b));
                                                    case 16:
                                                        return new y(new q(new j0(c(bVar))));
                                                    case 17:
                                                        if (d(2)) {
                                                            return null;
                                                        }
                                                        return new y(new u(bVar.b));
                                                    default:
                                                        return null;
                                                }
                                            }
                                        } else if (!d(64)) {
                                            return null;
                                        }
                                    }
                                    return new y(new g(bVar.b));
                                }
                                return new d0(new x("application/vnd.dvb.ait"));
                            }
                            return new y(new i(bVar.b));
                        }
                        return new y(new m(bVar.b));
                    }
                    return new y(new n(bVar.c));
                } else {
                    return new y(new s(new e0(c(bVar))));
                }
            }
            return new y(new t());
        }
        return new y(new p(new j0(c(bVar))));
    }

    public SparseArray<i0> b() {
        return new SparseArray<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    public final List<Format> c(i0.b bVar) {
        String str;
        int i2;
        if (d(32)) {
            return this.b;
        }
        byte[] bArr = bVar.f4935d;
        int length = bArr.length;
        int i3 = 0;
        ArrayList arrayList = this.b;
        while (length - i3 > 0) {
            int i4 = i3 + 1;
            int i5 = bArr[i3] & 255;
            int i6 = i4 + 1;
            int i7 = (bArr[i4] & 255) + i6;
            boolean z = true;
            if (i5 == 134) {
                arrayList = new ArrayList();
                int i8 = i6 + 1;
                int i9 = bArr[i6] & 255 & 31;
                int i10 = 0;
                while (i10 < i9) {
                    String str2 = new String(bArr, i8, 3, f.h.c.a.c.c);
                    int i11 = i8 + 3;
                    int i12 = i11 + 1;
                    int i13 = bArr[i11] & 255;
                    boolean z2 = (i13 & 128) != 0;
                    if (z2) {
                        i2 = i13 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i2 = 1;
                    }
                    int i14 = i12 + 1;
                    byte b = (byte) (bArr[i12] & 255);
                    int i15 = i14 + 1;
                    f.h.b.b.e2.j.c(i15 >= 0 && i15 <= length);
                    List<byte[]> list = null;
                    if (z2) {
                        list = Collections.singletonList((b & 64) != 0 ? new byte[]{1} : new byte[]{0});
                    }
                    Format.b bVar2 = new Format.b();
                    bVar2.f722k = str;
                    bVar2.c = str2;
                    bVar2.C = i2;
                    bVar2.f724m = list;
                    arrayList.add(bVar2.a());
                    i10++;
                    i8 = i15;
                }
            }
            if (i7 < 0 || i7 > length) {
                z = false;
            }
            f.h.b.b.e2.j.c(z);
            i3 = i7;
            arrayList = arrayList;
        }
        return arrayList;
    }

    public final boolean d(int i2) {
        return (i2 & this.a) != 0;
    }
}
