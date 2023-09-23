package okhttp3.internal.publicsuffix;

import java.io.InputStream;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import k.c0.c;
import l.m;
import l.o;
import l.t;

/* loaded from: classes2.dex */
public final class PublicSuffixDatabase {

    /* renamed from: e  reason: collision with root package name */
    public static final byte[] f9334e = {42};

    /* renamed from: f  reason: collision with root package name */
    public static final String[] f9335f = new String[0];

    /* renamed from: g  reason: collision with root package name */
    public static final String[] f9336g = {"*"};

    /* renamed from: h  reason: collision with root package name */
    public static final PublicSuffixDatabase f9337h = new PublicSuffixDatabase();
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final CountDownLatch b = new CountDownLatch(1);
    public byte[] c;

    /* renamed from: d  reason: collision with root package name */
    public byte[] f9338d;

    public static String a(byte[] bArr, byte[][] bArr2, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        int length = bArr.length;
        int i6 = 0;
        while (i6 < length) {
            int i7 = (i6 + length) / 2;
            while (i7 > -1 && bArr[i7] != 10) {
                i7--;
            }
            int i8 = i7 + 1;
            int i9 = 1;
            while (true) {
                i3 = i8 + i9;
                if (bArr[i3] == 10) {
                    break;
                }
                i9++;
            }
            int i10 = i3 - i8;
            int i11 = i2;
            boolean z2 = false;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                if (z2) {
                    i4 = 46;
                    z = false;
                } else {
                    z = z2;
                    i4 = bArr2[i11][i12] & 255;
                }
                i5 = i4 - (bArr[i8 + i13] & 255);
                if (i5 == 0) {
                    i13++;
                    i12++;
                    if (i13 == i10) {
                        break;
                    } else if (bArr2[i11].length != i12) {
                        z2 = z;
                    } else if (i11 == bArr2.length - 1) {
                        break;
                    } else {
                        i11++;
                        z2 = true;
                        i12 = -1;
                    }
                } else {
                    break;
                }
            }
            if (i5 >= 0) {
                if (i5 <= 0) {
                    int i14 = i10 - i13;
                    int length2 = bArr2[i11].length - i12;
                    while (true) {
                        i11++;
                        if (i11 >= bArr2.length) {
                            break;
                        }
                        length2 += bArr2[i11].length;
                    }
                    if (length2 >= i14) {
                        if (length2 <= i14) {
                            return new String(bArr, i8, i10, c.f8879d);
                        }
                    }
                }
                i6 = i3 + 1;
            }
            length = i8 - 1;
        }
        return null;
    }

    public final void b() {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
        if (resourceAsStream == null) {
            return;
        }
        t tVar = new t(new m(o.f(resourceAsStream)));
        try {
            byte[] bArr = new byte[tVar.readInt()];
            tVar.g(bArr);
            byte[] bArr2 = new byte[tVar.readInt()];
            tVar.g(bArr2);
            synchronized (this) {
                this.c = bArr;
                this.f9338d = bArr2;
            }
            this.b.countDown();
        } finally {
            c.d(tVar);
        }
    }
}
