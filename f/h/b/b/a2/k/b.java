package f.h.b.b.a2.k;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.BinaryFrame;
import com.google.android.exoplayer2.metadata.id3.ChapterFrame;
import com.google.android.exoplayer2.metadata.id3.ChapterTocFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.GeobFrame;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.google.android.exoplayer2.metadata.id3.UrlLinkFrame;
import f.h.b.b.a2.d;
import f.h.b.b.a2.g;
import f.h.b.b.g2.b0;
import f.h.b.b.g2.s;
import f.h.b.b.g2.t;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: Id3Decoder.java */
/* loaded from: classes.dex */
public final class b extends g {
    public static final /* synthetic */ int b = 0;
    public final a a;

    /* compiled from: Id3Decoder.java */
    /* loaded from: classes.dex */
    public interface a {
        boolean a(int i2, int i3, int i4, int i5, int i6);
    }

    /* compiled from: Id3Decoder.java */
    /* renamed from: f.h.b.b.a2.k.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0100b {
        public final int a;
        public final boolean b;
        public final int c;

        public C0100b(int i2, boolean z, int i3) {
            this.a = i2;
            this.b = z;
            this.c = i3;
        }
    }

    public b() {
        this.a = null;
    }

    public static byte[] c(byte[] bArr, int i2, int i3) {
        if (i3 <= i2) {
            return b0.f4270f;
        }
        return Arrays.copyOfRange(bArr, i2, i3);
    }

    public static ApicFrame e(t tVar, int i2, int i3) {
        int w;
        String str;
        int r = tVar.r();
        String t = t(r);
        int i4 = i2 - 1;
        byte[] bArr = new byte[i4];
        System.arraycopy(tVar.a, tVar.b, bArr, 0, i4);
        tVar.b += i4;
        if (i3 == 2) {
            String valueOf = String.valueOf(b0.I(new String(bArr, 0, 3, "ISO-8859-1")));
            String concat = valueOf.length() != 0 ? "image/".concat(valueOf) : new String("image/");
            if ("image/jpg".equals(concat)) {
                concat = "image/jpeg";
            }
            str = concat;
            w = 2;
        } else {
            w = w(bArr, 0);
            String I = b0.I(new String(bArr, 0, w, "ISO-8859-1"));
            if (I.indexOf(47) == -1) {
                str = I.length() != 0 ? "image/".concat(I) : new String("image/");
            } else {
                str = I;
            }
        }
        int i5 = w + 2;
        int v = v(bArr, i5, r);
        return new ApicFrame(str, new String(bArr, i5, v - i5, t), bArr[w + 1] & 255, c(bArr, s(r) + v, i4));
    }

    public static BinaryFrame f(t tVar, int i2, String str) {
        byte[] bArr = new byte[i2];
        System.arraycopy(tVar.a, tVar.b, bArr, 0, i2);
        tVar.b += i2;
        return new BinaryFrame(str, bArr);
    }

    public static ChapterFrame g(t tVar, int i2, int i3, boolean z, int i4, a aVar) {
        int i5 = tVar.b;
        int w = w(tVar.a, i5);
        String str = new String(tVar.a, i5, w - i5, "ISO-8859-1");
        tVar.C(w + 1);
        int f2 = tVar.f();
        int f3 = tVar.f();
        long s = tVar.s();
        long j2 = s == 4294967295L ? -1L : s;
        long s2 = tVar.s();
        long j3 = s2 == 4294967295L ? -1L : s2;
        ArrayList arrayList = new ArrayList();
        int i6 = i5 + i2;
        while (tVar.b < i6) {
            Id3Frame j4 = j(i3, tVar, z, i4, aVar);
            if (j4 != null) {
                arrayList.add(j4);
            }
        }
        return new ChapterFrame(str, f2, f3, j2, j3, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    public static ChapterTocFrame h(t tVar, int i2, int i3, boolean z, int i4, a aVar) {
        int i5 = tVar.b;
        int w = w(tVar.a, i5);
        String str = new String(tVar.a, i5, w - i5, "ISO-8859-1");
        tVar.C(w + 1);
        int r = tVar.r();
        boolean z2 = (r & 2) != 0;
        boolean z3 = (r & 1) != 0;
        int r2 = tVar.r();
        String[] strArr = new String[r2];
        for (int i6 = 0; i6 < r2; i6++) {
            int i7 = tVar.b;
            int w2 = w(tVar.a, i7);
            strArr[i6] = new String(tVar.a, i7, w2 - i7, "ISO-8859-1");
            tVar.C(w2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i8 = i5 + i2;
        while (tVar.b < i8) {
            Id3Frame j2 = j(i3, tVar, z, i4, aVar);
            if (j2 != null) {
                arrayList.add(j2);
            }
        }
        return new ChapterTocFrame(str, z2, z3, strArr, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    public static CommentFrame i(t tVar, int i2) {
        if (i2 < 4) {
            return null;
        }
        int r = tVar.r();
        String t = t(r);
        byte[] bArr = new byte[3];
        System.arraycopy(tVar.a, tVar.b, bArr, 0, 3);
        tVar.b += 3;
        String str = new String(bArr, 0, 3);
        int i3 = i2 - 4;
        byte[] bArr2 = new byte[i3];
        System.arraycopy(tVar.a, tVar.b, bArr2, 0, i3);
        tVar.b += i3;
        int v = v(bArr2, 0, r);
        String str2 = new String(bArr2, 0, v, t);
        int s = s(r) + v;
        return new CommentFrame(str, str2, n(bArr2, s, v(bArr2, s, r), t));
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x0188, code lost:
        if (r13 == 67) goto L98;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.exoplayer2.metadata.id3.Id3Frame j(int r19, f.h.b.b.g2.t r20, boolean r21, int r22, f.h.b.b.a2.k.b.a r23) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.a2.k.b.j(int, f.h.b.b.g2.t, boolean, int, f.h.b.b.a2.k.b$a):com.google.android.exoplayer2.metadata.id3.Id3Frame");
    }

    public static GeobFrame k(t tVar, int i2) {
        int r = tVar.r();
        String t = t(r);
        int i3 = i2 - 1;
        byte[] bArr = new byte[i3];
        System.arraycopy(tVar.a, tVar.b, bArr, 0, i3);
        tVar.b += i3;
        int w = w(bArr, 0);
        String str = new String(bArr, 0, w, "ISO-8859-1");
        int i4 = w + 1;
        int v = v(bArr, i4, r);
        String n = n(bArr, i4, v, t);
        int s = s(r) + v;
        int v2 = v(bArr, s, r);
        return new GeobFrame(str, n, n(bArr, s, v2, t), c(bArr, s(r) + v2, i3));
    }

    public static MlltFrame l(t tVar, int i2) {
        int w = tVar.w();
        int t = tVar.t();
        int t2 = tVar.t();
        int r = tVar.r();
        int r2 = tVar.r();
        s sVar = new s();
        sVar.j(tVar.a, tVar.c);
        sVar.k(tVar.b * 8);
        int i3 = ((i2 - 10) * 8) / (r + r2);
        int[] iArr = new int[i3];
        int[] iArr2 = new int[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            int g2 = sVar.g(r);
            int g3 = sVar.g(r2);
            iArr[i4] = g2;
            iArr2[i4] = g3;
        }
        return new MlltFrame(w, t, t2, iArr, iArr2);
    }

    public static PrivFrame m(t tVar, int i2) {
        byte[] bArr = new byte[i2];
        System.arraycopy(tVar.a, tVar.b, bArr, 0, i2);
        tVar.b += i2;
        int w = w(bArr, 0);
        return new PrivFrame(new String(bArr, 0, w, "ISO-8859-1"), c(bArr, w + 1, i2));
    }

    public static String n(byte[] bArr, int i2, int i3, String str) {
        return (i3 <= i2 || i3 > bArr.length) ? "" : new String(bArr, i2, i3 - i2, str);
    }

    public static TextInformationFrame o(t tVar, int i2, String str) {
        if (i2 < 1) {
            return null;
        }
        int r = tVar.r();
        String t = t(r);
        int i3 = i2 - 1;
        byte[] bArr = new byte[i3];
        System.arraycopy(tVar.a, tVar.b, bArr, 0, i3);
        tVar.b += i3;
        return new TextInformationFrame(str, null, new String(bArr, 0, v(bArr, 0, r), t));
    }

    public static TextInformationFrame p(t tVar, int i2) {
        if (i2 < 1) {
            return null;
        }
        int r = tVar.r();
        String t = t(r);
        int i3 = i2 - 1;
        byte[] bArr = new byte[i3];
        System.arraycopy(tVar.a, tVar.b, bArr, 0, i3);
        tVar.b += i3;
        int v = v(bArr, 0, r);
        String str = new String(bArr, 0, v, t);
        int s = s(r) + v;
        return new TextInformationFrame("TXXX", str, n(bArr, s, v(bArr, s, r), t));
    }

    public static UrlLinkFrame q(t tVar, int i2, String str) {
        byte[] bArr = new byte[i2];
        System.arraycopy(tVar.a, tVar.b, bArr, 0, i2);
        tVar.b += i2;
        return new UrlLinkFrame(str, null, new String(bArr, 0, w(bArr, 0), "ISO-8859-1"));
    }

    public static UrlLinkFrame r(t tVar, int i2) {
        if (i2 < 1) {
            return null;
        }
        int r = tVar.r();
        String t = t(r);
        int i3 = i2 - 1;
        byte[] bArr = new byte[i3];
        System.arraycopy(tVar.a, tVar.b, bArr, 0, i3);
        tVar.b += i3;
        int v = v(bArr, 0, r);
        String str = new String(bArr, 0, v, t);
        int s = s(r) + v;
        return new UrlLinkFrame("WXXX", str, n(bArr, s, w(bArr, s), "ISO-8859-1"));
    }

    public static int s(int i2) {
        return (i2 == 0 || i2 == 3) ? 1 : 2;
    }

    public static String t(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? "ISO-8859-1" : "UTF-8" : "UTF-16BE" : "UTF-16";
    }

    public static String u(int i2, int i3, int i4, int i5, int i6) {
        return i2 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6));
    }

    public static int v(byte[] bArr, int i2, int i3) {
        int w = w(bArr, i2);
        if (i3 == 0 || i3 == 3) {
            return w;
        }
        while (w < bArr.length - 1) {
            if (w % 2 == 0 && bArr[w + 1] == 0) {
                return w;
            }
            w = w(bArr, w + 1);
        }
        return bArr.length;
    }

    public static int w(byte[] bArr, int i2) {
        while (i2 < bArr.length) {
            if (bArr[i2] == 0) {
                return i2;
            }
            i2++;
        }
        return bArr.length;
    }

    public static int x(t tVar, int i2) {
        byte[] bArr = tVar.a;
        int i3 = tVar.b;
        int i4 = i3;
        while (true) {
            int i5 = i4 + 1;
            if (i5 >= i3 + i2) {
                return i2;
            }
            if ((bArr[i4] & 255) == 255 && bArr[i5] == 0) {
                System.arraycopy(bArr, i4 + 2, bArr, i5, (i2 - (i4 - i3)) - 2);
                i2--;
            }
            i4 = i5;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0074, code lost:
        if ((r10 & 1) != 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0082, code lost:
        if ((r10 & 128) != 0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean y(f.h.b.b.g2.t r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r1.b
        L6:
            int r3 = r18.a()     // Catch: java.lang.Throwable -> Lab
            r4 = 1
            r5 = r20
            if (r3 < r5) goto La7
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L20
            int r7 = r18.f()     // Catch: java.lang.Throwable -> Lab
            long r8 = r18.s()     // Catch: java.lang.Throwable -> Lab
            int r10 = r18.w()     // Catch: java.lang.Throwable -> Lab
            goto L2a
        L20:
            int r7 = r18.t()     // Catch: java.lang.Throwable -> Lab
            int r8 = r18.t()     // Catch: java.lang.Throwable -> Lab
            long r8 = (long) r8
            r10 = 0
        L2a:
            r11 = 0
            if (r7 != 0) goto L38
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L38
            if (r10 != 0) goto L38
            r1.C(r2)
            return r4
        L38:
            r7 = 4
            if (r0 != r7) goto L69
            if (r21 != 0) goto L69
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 == 0) goto L49
            r1.C(r2)
            return r6
        L49:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L69:
            if (r0 != r7) goto L77
            r3 = r10 & 64
            if (r3 == 0) goto L71
            r3 = 1
            goto L72
        L71:
            r3 = 0
        L72:
            r7 = r10 & 1
            if (r7 == 0) goto L86
            goto L87
        L77:
            if (r0 != r3) goto L85
            r3 = r10 & 32
            if (r3 == 0) goto L7f
            r3 = 1
            goto L80
        L7f:
            r3 = 0
        L80:
            r7 = r10 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L86
            goto L87
        L85:
            r3 = 0
        L86:
            r4 = 0
        L87:
            if (r4 == 0) goto L8b
            int r3 = r3 + 4
        L8b:
            long r3 = (long) r3
            int r7 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r7 >= 0) goto L94
            r1.C(r2)
            return r6
        L94:
            int r3 = r18.a()     // Catch: java.lang.Throwable -> Lab
            long r3 = (long) r3
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r7 >= 0) goto La1
            r1.C(r2)
            return r6
        La1:
            int r3 = (int) r8
            r1.D(r3)     // Catch: java.lang.Throwable -> Lab
            goto L6
        La7:
            r1.C(r2)
            return r4
        Lab:
            r0 = move-exception
            r1.C(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.a2.k.b.y(f.h.b.b.g2.t, int, int, boolean):boolean");
    }

    @Override // f.h.b.b.a2.g
    public Metadata b(d dVar, ByteBuffer byteBuffer) {
        return d(byteBuffer.array(), byteBuffer.limit());
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00c1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.exoplayer2.metadata.Metadata d(byte[] r13, int r14) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.a2.k.b.d(byte[], int):com.google.android.exoplayer2.metadata.Metadata");
    }

    public b(a aVar) {
        this.a = aVar;
    }
}
