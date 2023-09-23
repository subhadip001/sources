package f.h.b.b.z1;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import f.h.b.b.g2.b0;
import java.util.Objects;

/* compiled from: MediaCodecInfo.java */
/* loaded from: classes.dex */
public final class s {
    public final String a;
    public final String b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f5140d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f5141e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f5142f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f5143g;

    public s(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        Objects.requireNonNull(str);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.f5140d = codecCapabilities;
        this.f5141e = z4;
        this.f5142f = z6;
        this.f5143g = f.h.b.b.g2.p.j(str2);
    }

    public static Point a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i2, int i3) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(b0.f(i2, widthAlignment) * widthAlignment, b0.f(i3, heightAlignment) * heightAlignment);
    }

    public static boolean b(MediaCodecInfo.VideoCapabilities videoCapabilities, int i2, int i3, double d2) {
        Point a = a(videoCapabilities, i2, i3);
        int i4 = a.x;
        int i5 = a.y;
        if (d2 != -1.0d && d2 >= 1.0d) {
            return videoCapabilities.areSizeAndRateSupported(i4, i5, Math.floor(d2));
        }
        return videoCapabilities.isSizeSupported(i4, i5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0076, code lost:
        if ((f.h.b.b.g2.b0.a >= 21 && r15.isFeatureSupported("secure-playback")) != false) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static f.h.b.b.z1.s i(java.lang.String r12, java.lang.String r13, java.lang.String r14, android.media.MediaCodecInfo.CodecCapabilities r15, boolean r16, boolean r17, boolean r18, boolean r19, boolean r20) {
        /*
            r1 = r12
            r4 = r15
            f.h.b.b.z1.s r11 = new f.h.b.b.z1.s
            r0 = 1
            r2 = 0
            if (r19 != 0) goto L4a
            if (r4 == 0) goto L4a
            int r3 = f.h.b.b.g2.b0.a
            r5 = 19
            if (r3 < r5) goto L1a
            java.lang.String r5 = "adaptive-playback"
            boolean r5 = r15.isFeatureSupported(r5)
            if (r5 == 0) goto L1a
            r5 = 1
            goto L1b
        L1a:
            r5 = 0
        L1b:
            if (r5 == 0) goto L4a
            r5 = 22
            if (r3 > r5) goto L45
            java.lang.String r3 = f.h.b.b.g2.b0.f4268d
            java.lang.String r5 = "ODROID-XU3"
            boolean r5 = r5.equals(r3)
            if (r5 != 0) goto L33
            java.lang.String r5 = "Nexus 10"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L45
        L33:
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder"
            boolean r3 = r3.equals(r12)
            if (r3 != 0) goto L43
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r3 = r3.equals(r12)
            if (r3 == 0) goto L45
        L43:
            r3 = 1
            goto L46
        L45:
            r3 = 0
        L46:
            if (r3 != 0) goto L4a
            r8 = 1
            goto L4b
        L4a:
            r8 = 0
        L4b:
            r3 = 21
            if (r4 == 0) goto L62
            int r5 = f.h.b.b.g2.b0.a
            if (r5 < r3) goto L5d
            java.lang.String r5 = "tunneled-playback"
            boolean r5 = r15.isFeatureSupported(r5)
            if (r5 == 0) goto L5d
            r5 = 1
            goto L5e
        L5d:
            r5 = 0
        L5e:
            if (r5 == 0) goto L62
            r9 = 1
            goto L63
        L62:
            r9 = 0
        L63:
            if (r20 != 0) goto L7b
            if (r4 == 0) goto L79
            int r5 = f.h.b.b.g2.b0.a
            if (r5 < r3) goto L75
            java.lang.String r3 = "secure-playback"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L75
            r3 = 1
            goto L76
        L75:
            r3 = 0
        L76:
            if (r3 == 0) goto L79
            goto L7b
        L79:
            r10 = 0
            goto L7c
        L7b:
            r10 = 1
        L7c:
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.z1.s.i(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean, boolean):f.h.b.b.z1.s");
    }

    public f.h.b.b.v1.e c(Format format, Format format2) {
        boolean z = false;
        int i2 = !b0.a(format.q, format2.q) ? 8 : 0;
        if (this.f5143g) {
            if (format.y != format2.y) {
                i2 |= 1024;
            }
            if (!this.f5141e && (format.v != format2.v || format.w != format2.w)) {
                i2 |= 512;
            }
            if (!b0.a(format.C, format2.C)) {
                i2 |= RecyclerView.a0.FLAG_MOVED;
            }
            String str = this.a;
            if (b0.f4268d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str)) {
                z = true;
            }
            if (z && !format.c(format2)) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new f.h.b.b.v1.e(this.a, format, format2, format.c(format2) ? 3 : 2, 0);
            }
        } else {
            if (format.D != format2.D) {
                i2 |= 4096;
            }
            if (format.E != format2.E) {
                i2 |= 8192;
            }
            if (format.F != format2.F) {
                i2 |= 16384;
            }
            if (i2 == 0 && "audio/mp4a-latm".equals(this.b)) {
                Pair<Integer, Integer> c = MediaCodecUtil.c(format);
                Pair<Integer, Integer> c2 = MediaCodecUtil.c(format2);
                if (c != null && c2 != null) {
                    int intValue = ((Integer) c.first).intValue();
                    int intValue2 = ((Integer) c2.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new f.h.b.b.v1.e(this.a, format, format2, 3, 0);
                    }
                }
            }
            if (!format.c(format2)) {
                i2 |= 32;
            }
            if ("audio/opus".equals(this.b)) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new f.h.b.b.v1.e(this.a, format, format2, 1, 0);
            }
        }
        return new f.h.b.b.v1.e(this.a, format, format2, 0, i2);
    }

    public MediaCodecInfo.CodecProfileLevel[] d() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f5140d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:168:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:169:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0136 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean e(com.google.android.exoplayer2.Format r13) {
        /*
            Method dump skipped, instructions count: 669
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.z1.s.e(com.google.android.exoplayer2.Format):boolean");
    }

    public boolean f(Format format) {
        if (this.f5143g) {
            return this.f5141e;
        }
        Pair<Integer, Integer> c = MediaCodecUtil.c(format);
        return c != null && ((Integer) c.first).intValue() == 42;
    }

    public boolean g(int i2, int i3, double d2) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f5140d;
        if (codecCapabilities == null) {
            h("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            h("sizeAndRate.vCaps");
            return false;
        }
        if (!b(videoCapabilities, i2, i3, d2)) {
            if (i2 < i3) {
                if ((("OMX.MTK.VIDEO.DECODER.HEVC".equals(this.a) && "mcv5a".equals(b0.b)) ? false : true) && b(videoCapabilities, i3, i2, d2)) {
                    StringBuilder sb = new StringBuilder(69);
                    sb.append("sizeAndRate.rotated, ");
                    sb.append(i2);
                    sb.append("x");
                    sb.append(i3);
                    sb.append("x");
                    sb.append(d2);
                    String sb2 = sb.toString();
                    String str = this.a;
                    String str2 = this.b;
                    String str3 = b0.f4269e;
                    StringBuilder z = f.a.b.a.a.z(f.a.b.a.a.x(str3, f.a.b.a.a.x(str2, f.a.b.a.a.x(str, f.a.b.a.a.x(sb2, 25)))), "AssumedSupport [", sb2, "] [", str);
                    f.a.b.a.a.R(z, ", ", str2, "] [", str3);
                    z.append("]");
                    Log.d("MediaCodecInfo", z.toString());
                }
            }
            StringBuilder sb3 = new StringBuilder(69);
            sb3.append("sizeAndRate.support, ");
            sb3.append(i2);
            sb3.append("x");
            sb3.append(i3);
            sb3.append("x");
            sb3.append(d2);
            h(sb3.toString());
            return false;
        }
        return true;
    }

    public final void h(String str) {
        String str2 = this.a;
        String str3 = this.b;
        String str4 = b0.f4269e;
        StringBuilder z = f.a.b.a.a.z(f.a.b.a.a.x(str4, f.a.b.a.a.x(str3, f.a.b.a.a.x(str2, f.a.b.a.a.x(str, 20)))), "NoSupport [", str, "] [", str2);
        f.a.b.a.a.R(z, ", ", str3, "] [", str4);
        z.append("]");
        Log.d("MediaCodecInfo", z.toString());
    }

    public String toString() {
        return this.a;
    }
}
