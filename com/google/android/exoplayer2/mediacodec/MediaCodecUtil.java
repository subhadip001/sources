package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import f.h.b.b.g2.b0;
import f.h.b.b.z1.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class MediaCodecUtil {
    public static final Pattern a = Pattern.compile("^\\D?(\\d+)$");
    public static final HashMap<b, List<s>> b = new HashMap<>();
    public static int c = -1;

    /* loaded from: classes.dex */
    public static class DecoderQueryException extends Exception {
        public DecoderQueryException(Throwable th, a aVar) {
            super("Failed to query underlying media codecs", th);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public final String a;
        public final boolean b;
        public final boolean c;

        public b(String str, boolean z, boolean z2) {
            this.a = str;
            this.b = z;
            this.c = z2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != b.class) {
                return false;
            }
            b bVar = (b) obj;
            return TextUtils.equals(this.a, bVar.a) && this.b == bVar.b && this.c == bVar.c;
        }

        public int hashCode() {
            return ((f.a.b.a.a.I(this.a, 31, 31) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237);
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        MediaCodecInfo a(int i2);

        boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        int d();

        boolean e();
    }

    /* loaded from: classes.dex */
    public static final class d implements c {
        public d(a aVar) {
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public MediaCodecInfo a(int i2) {
            return MediaCodecList.getCodecInfoAt(i2);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && "video/avc".equals(str2);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public int d() {
            return MediaCodecList.getCodecCount();
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public boolean e() {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static final class e implements c {
        public final int a;
        public MediaCodecInfo[] b;

        public e(boolean z, boolean z2) {
            this.a = (z || z2) ? 1 : 0;
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public MediaCodecInfo a(int i2) {
            if (this.b == null) {
                this.b = new MediaCodecList(this.a).getCodecInfos();
            }
            return this.b[i2];
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public int d() {
            if (this.b == null) {
                this.b = new MediaCodecList(this.a).getCodecInfos();
            }
            return this.b.length;
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public boolean e() {
            return true;
        }
    }

    /* loaded from: classes.dex */
    public interface f<T> {
        int a(T t);
    }

    public static void a(String str, List<s> list) {
        if ("audio/raw".equals(str)) {
            if (b0.a < 26 && b0.b.equals("R9") && list.size() == 1 && list.get(0).a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                list.add(s.i("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
            }
            j(list, new f() { // from class: f.h.b.b.z1.e
                @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.f
                public final int a(Object obj) {
                    Pattern pattern = MediaCodecUtil.a;
                    String str2 = ((s) obj).a;
                    if (str2.startsWith("OMX.google") || str2.startsWith("c2.android")) {
                        return 1;
                    }
                    return (b0.a >= 26 || !str2.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
                }
            });
        }
        int i2 = b0.a;
        if (i2 < 21 && list.size() > 1) {
            String str2 = list.get(0).a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                j(list, new f() { // from class: f.h.b.b.z1.f
                    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.f
                    public final int a(Object obj) {
                        Pattern pattern = MediaCodecUtil.a;
                        return ((s) obj).a.startsWith("OMX.google") ? 1 : 0;
                    }
                });
            }
        }
        if (i2 >= 30 || list.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(list.get(0).a)) {
            return;
        }
        list.add(list.remove(0));
    }

    public static String b(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        String[] supportedTypes;
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        } else if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        } else {
            if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
                return "audio/x-lg-flac";
            }
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x042f A[Catch: NumberFormatException -> 0x043f, TRY_LEAVE, TryCatch #3 {NumberFormatException -> 0x043f, blocks: (B:280:0x03c4, B:282:0x03d8, B:294:0x03f7, B:310:0x042f), top: B:637:0x03c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:479:0x06e0  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x06fb  */
    /* JADX WARN: Removed duplicated region for block: B:646:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> c(com.google.android.exoplayer2.Format r15) {
        /*
            Method dump skipped, instructions count: 2812
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c(com.google.android.exoplayer2.Format):android.util.Pair");
    }

    public static s d(String str, boolean z, boolean z2) {
        List<s> e2 = e(str, z, z2);
        if (e2.isEmpty()) {
            return null;
        }
        return e2.get(0);
    }

    public static synchronized List<s> e(String str, boolean z, boolean z2) {
        c dVar;
        synchronized (MediaCodecUtil.class) {
            b bVar = new b(str, z, z2);
            HashMap<b, List<s>> hashMap = b;
            List<s> list = hashMap.get(bVar);
            if (list != null) {
                return list;
            }
            int i2 = b0.a;
            if (i2 >= 21) {
                dVar = new e(z, z2);
            } else {
                dVar = new d(null);
            }
            ArrayList<s> f2 = f(bVar, dVar);
            if (z && f2.isEmpty() && 21 <= i2 && i2 <= 23) {
                f2 = f(bVar, new d(null));
                if (!f2.isEmpty()) {
                    String str2 = f2.get(0).a;
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 63 + String.valueOf(str2).length());
                    sb.append("MediaCodecList API didn't list secure decoder for: ");
                    sb.append(str);
                    sb.append(". Assuming: ");
                    sb.append(str2);
                    Log.w("MediaCodecUtil", sb.toString());
                }
            }
            a(str, f2);
            List<s> unmodifiableList = Collections.unmodifiableList(f2);
            hashMap.put(bVar, unmodifiableList);
            return unmodifiableList;
        }
    }

    public static ArrayList<s> f(b bVar, c cVar) {
        String b2;
        String str;
        String str2;
        int i2;
        boolean z;
        int i3;
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        boolean b3;
        boolean c2;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        try {
            ArrayList<s> arrayList = new ArrayList<>();
            String str3 = bVar.a;
            int d2 = cVar.d();
            boolean e2 = cVar.e();
            int i4 = 0;
            while (i4 < d2) {
                MediaCodecInfo a2 = cVar.a(i4);
                int i5 = b0.a;
                if (!(i5 >= 29 && a2.isAlias())) {
                    String name = a2.getName();
                    if (g(a2, name, e2, str3) && (b2 = b(a2, name, str3)) != null) {
                        try {
                            capabilitiesForType = a2.getCapabilitiesForType(b2);
                            b3 = cVar.b("tunneled-playback", b2, capabilitiesForType);
                            c2 = cVar.c("tunneled-playback", b2, capabilitiesForType);
                            z2 = bVar.c;
                        } catch (Exception e3) {
                            e = e3;
                            str = b2;
                            str2 = name;
                            i2 = i4;
                            z = e2;
                            i3 = d2;
                        }
                        if ((z2 || !c2) && (!z2 || b3)) {
                            boolean b4 = cVar.b("secure-playback", b2, capabilitiesForType);
                            boolean c3 = cVar.c("secure-playback", b2, capabilitiesForType);
                            boolean z6 = bVar.b;
                            if ((z6 || !c3) && (!z6 || b4)) {
                                if (i5 >= 29) {
                                    z4 = a2.isHardwareAccelerated();
                                    z3 = true;
                                } else {
                                    z3 = true;
                                    z4 = !h(a2);
                                }
                                boolean h2 = h(a2);
                                if (i5 >= 29) {
                                    z5 = a2.isVendor();
                                } else {
                                    String I = b0.I(a2.getName());
                                    if (I.startsWith("omx.google.") || I.startsWith("c2.android.") || I.startsWith("c2.google.")) {
                                        z3 = false;
                                    }
                                    z5 = z3;
                                }
                                if (!(e2 && bVar.b == b4) && (e2 || bVar.b)) {
                                    str = b2;
                                    str2 = name;
                                    i2 = i4;
                                    z = e2;
                                    i3 = d2;
                                    if (!z && b4) {
                                        arrayList.add(s.i(String.valueOf(str2).concat(".secure"), str3, str, capabilitiesForType, z4, h2, z5, false, true));
                                        return arrayList;
                                    }
                                    i4 = i2 + 1;
                                    d2 = i3;
                                    e2 = z;
                                } else {
                                    str = b2;
                                    str2 = name;
                                    i2 = i4;
                                    z = e2;
                                    i3 = d2;
                                    try {
                                        arrayList.add(s.i(name, str3, b2, capabilitiesForType, z4, h2, z5, false, false));
                                    } catch (Exception e4) {
                                        e = e4;
                                        if (b0.a <= 23 && !arrayList.isEmpty()) {
                                            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 46);
                                            sb.append("Skipping codec ");
                                            sb.append(str2);
                                            sb.append(" (failed to query capabilities)");
                                            Log.e("MediaCodecUtil", sb.toString());
                                            i4 = i2 + 1;
                                            d2 = i3;
                                            e2 = z;
                                        } else {
                                            String str4 = str2;
                                            StringBuilder sb2 = new StringBuilder(String.valueOf(str4).length() + 25 + str.length());
                                            sb2.append("Failed to query codec ");
                                            sb2.append(str4);
                                            sb2.append(" (");
                                            sb2.append(str);
                                            sb2.append(")");
                                            Log.e("MediaCodecUtil", sb2.toString());
                                            throw e;
                                        }
                                    }
                                    i4 = i2 + 1;
                                    d2 = i3;
                                    e2 = z;
                                }
                            }
                        }
                    }
                }
                i2 = i4;
                z = e2;
                i3 = d2;
                i4 = i2 + 1;
                d2 = i3;
                e2 = z;
            }
            return arrayList;
        } catch (Exception e5) {
            throw new DecoderQueryException(e5, null);
        }
    }

    public static boolean g(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z && str.endsWith(".secure"))) {
            return false;
        }
        int i2 = b0.a;
        if (i2 >= 21 || !("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            if (i2 < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
                String str3 = b0.b;
                if ("a70".equals(str3) || ("Xiaomi".equals(b0.c) && str3.startsWith("HM"))) {
                    return false;
                }
            }
            if (i2 == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
                String str4 = b0.b;
                if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                    return false;
                }
            }
            if (i2 == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
                String str5 = b0.b;
                if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                    return false;
                }
            }
            if (i2 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(b0.c))) {
                String str6 = b0.b;
                if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                    return false;
                }
            }
            if (i2 <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(b0.c)) {
                String str7 = b0.b;
                if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                    return false;
                }
            }
            if (i2 <= 19 && b0.b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
                return false;
            }
            return ("audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
        }
        return false;
    }

    public static boolean h(MediaCodecInfo mediaCodecInfo) {
        if (b0.a >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        String I = b0.I(mediaCodecInfo.getName());
        if (I.startsWith("arc.")) {
            return false;
        }
        return I.startsWith("omx.google.") || I.startsWith("omx.ffmpeg.") || (I.startsWith("omx.sec.") && I.contains(".sw.")) || I.equals("omx.qcom.video.decoder.hevcswvdec") || I.startsWith("c2.android.") || I.startsWith("c2.google.") || !(I.startsWith("omx.") || I.startsWith("c2."));
    }

    public static int i() {
        int i2;
        if (c == -1) {
            int i3 = 0;
            s d2 = d("video/avc", false, false);
            if (d2 != null) {
                MediaCodecInfo.CodecProfileLevel[] d3 = d2.d();
                int length = d3.length;
                int i4 = 0;
                while (i3 < length) {
                    int i5 = d3[i3].level;
                    if (i5 == 1 || i5 == 2) {
                        i2 = 25344;
                    } else {
                        switch (i5) {
                            case 8:
                            case 16:
                            case 32:
                                i2 = 101376;
                                continue;
                            case 64:
                                i2 = 202752;
                                continue;
                            case 128:
                            case 256:
                                i2 = 414720;
                                continue;
                            case 512:
                                i2 = 921600;
                                continue;
                            case 1024:
                                i2 = 1310720;
                                continue;
                            case RecyclerView.a0.FLAG_MOVED /* 2048 */:
                            case 4096:
                                i2 = 2097152;
                                continue;
                            case 8192:
                                i2 = 2228224;
                                continue;
                            case 16384:
                                i2 = 5652480;
                                continue;
                            case 32768:
                            case LogFileManager.MAX_LOG_SIZE /* 65536 */:
                                i2 = 9437184;
                                continue;
                            default:
                                i2 = -1;
                                continue;
                        }
                    }
                    i4 = Math.max(i2, i4);
                    i3++;
                }
                i3 = Math.max(i4, b0.a >= 21 ? 345600 : 172800);
            }
            c = i3;
        }
        return c;
    }

    public static <T> void j(List<T> list, final f<T> fVar) {
        Collections.sort(list, new Comparator() { // from class: f.h.b.b.z1.h
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                MediaCodecUtil.f fVar2 = MediaCodecUtil.f.this;
                return fVar2.a(obj2) - fVar2.a(obj);
            }
        });
    }
}
