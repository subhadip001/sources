package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzqy {
    public static final /* synthetic */ int zza = 0;
    private static final Pattern zzb = Pattern.compile("^\\D?(\\d+)$");
    private static final HashMap zzc = new HashMap();
    private static int zzd = -1;

    public static int zza() {
        int i2;
        int i3 = zzd;
        if (i3 == -1) {
            zzqg zzc2 = zzc("video/avc", false, false);
            if (zzc2 != null) {
                int i4 = 0;
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : zzc2.zzg()) {
                    int i5 = codecProfileLevel.level;
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
                            case 131072:
                            case 262144:
                            case 524288:
                                i2 = 35651584;
                                continue;
                            default:
                                i2 = -1;
                                continue;
                        }
                    }
                    i4 = Math.max(i2, i4);
                }
                i3 = Math.max(i4, zzeg.zza >= 21 ? 345600 : 172800);
            } else {
                i3 = 0;
            }
            zzd = i3;
        }
        return i3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02ce A[Catch: NumberFormatException -> 0x02dd, TRY_LEAVE, TryCatch #1 {NumberFormatException -> 0x02dd, blocks: (B:149:0x0269, B:151:0x027b, B:162:0x0297, B:178:0x02ce), top: B:492:0x0269 }] */
    /* JADX WARN: Removed duplicated region for block: B:363:0x05eb  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x05f9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair zzb(com.google.android.gms.internal.ads.zzad r15) {
        /*
            Method dump skipped, instructions count: 2416
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqy.zzb(com.google.android.gms.internal.ads.zzad):android.util.Pair");
    }

    public static zzqg zzc(String str, boolean z, boolean z2) {
        List zzf = zzf(str, false, false);
        if (zzf.isEmpty()) {
            return null;
        }
        return (zzqg) zzf.get(0);
    }

    public static zzqg zzd() {
        return zzc("audio/raw", false, false);
    }

    public static String zze(zzad zzadVar) {
        Pair zzb2;
        if ("audio/eac3-joc".equals(zzadVar.zzm)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(zzadVar.zzm) || (zzb2 = zzb(zzadVar)) == null) {
            return null;
        }
        int intValue = ((Integer) zzb2.first).intValue();
        if (intValue == 16 || intValue == 256) {
            return "video/hevc";
        }
        if (intValue == 512) {
            return "video/avc";
        }
        return null;
    }

    public static synchronized List zzf(String str, boolean z, boolean z2) {
        zzqt zzqvVar;
        synchronized (zzqy.class) {
            zzqq zzqqVar = new zzqq(str, z, z2);
            HashMap hashMap = zzc;
            List list = (List) hashMap.get(zzqqVar);
            if (list != null) {
                return list;
            }
            int i2 = zzeg.zza;
            if (i2 >= 21) {
                zzqvVar = new zzqw(z, z2);
            } else {
                zzqvVar = new zzqv(null);
            }
            ArrayList zzh = zzh(zzqqVar, zzqvVar);
            if (z && zzh.isEmpty() && i2 >= 21 && i2 <= 23) {
                zzh = zzh(zzqqVar, new zzqv(null));
                if (!zzh.isEmpty()) {
                    String str2 = ((zzqg) zzh.get(0)).zza;
                    Log.w("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + str2);
                }
            }
            if ("audio/raw".equals(str)) {
                if (i2 < 26 && zzeg.zzb.equals("R9") && zzh.size() == 1 && ((zzqg) zzh.get(0)).zza.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                    zzh.add(zzqg.zzc("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
                }
                zzi(zzh, new zzqx() { // from class: com.google.android.gms.internal.ads.zzqo
                    @Override // com.google.android.gms.internal.ads.zzqx
                    public final int zza(Object obj) {
                        int i3 = zzqy.zza;
                        String str3 = ((zzqg) obj).zza;
                        if (str3.startsWith("OMX.google") || str3.startsWith("c2.android")) {
                            return 1;
                        }
                        return (zzeg.zza >= 26 || !str3.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
                    }
                });
            }
            if (i2 < 21 && zzh.size() > 1) {
                String str3 = ((zzqg) zzh.get(0)).zza;
                if ("OMX.SEC.mp3.dec".equals(str3) || "OMX.SEC.MP3.Decoder".equals(str3) || "OMX.brcm.audio.mp3.decoder".equals(str3)) {
                    zzi(zzh, new zzqx() { // from class: com.google.android.gms.internal.ads.zzqp
                        @Override // com.google.android.gms.internal.ads.zzqx
                        public final int zza(Object obj) {
                            int i3 = zzqy.zza;
                            return ((zzqg) obj).zza.startsWith("OMX.google") ? 1 : 0;
                        }
                    });
                }
            }
            if (i2 < 32 && zzh.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((zzqg) zzh.get(0)).zza)) {
                zzh.add((zzqg) zzh.remove(0));
            }
            zzfrh zzm = zzfrh.zzm(zzh);
            hashMap.put(zzqqVar, zzm);
            return zzm;
        }
    }

    public static List zzg(List list, final zzad zzadVar) {
        ArrayList arrayList = new ArrayList(list);
        zzi(arrayList, new zzqx() { // from class: com.google.android.gms.internal.ads.zzqm
            @Override // com.google.android.gms.internal.ads.zzqx
            public final int zza(Object obj) {
                zzad zzadVar2 = zzad.this;
                zzqg zzqgVar = (zzqg) obj;
                int i2 = zzqy.zza;
                try {
                    return !zzqgVar.zzd(zzadVar2) ? 0 : 1;
                } catch (zzqs unused) {
                    return -1;
                }
            }
        });
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:150:0x0233, code lost:
        if (r1.zzb == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00da, code lost:
        if ("SCV31".equals(r10) == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0118, code lost:
        if (r8.startsWith("t0") == false) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01e7 A[Catch: Exception -> 0x029e, TryCatch #1 {Exception -> 0x029e, blocks: (B:115:0x01b6, B:121:0x01cd, B:127:0x01e1, B:129:0x01e7, B:134:0x01f9, B:136:0x0201, B:146:0x022b, B:137:0x0206, B:139:0x0216, B:141:0x021e, B:130:0x01ee), top: B:187:0x01b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01ee A[Catch: Exception -> 0x029e, TryCatch #1 {Exception -> 0x029e, blocks: (B:115:0x01b6, B:121:0x01cd, B:127:0x01e1, B:129:0x01e7, B:134:0x01f9, B:136:0x0201, B:146:0x022b, B:137:0x0206, B:139:0x0216, B:141:0x021e, B:130:0x01ee), top: B:187:0x01b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0201 A[Catch: Exception -> 0x029e, TryCatch #1 {Exception -> 0x029e, blocks: (B:115:0x01b6, B:121:0x01cd, B:127:0x01e1, B:129:0x01e7, B:134:0x01f9, B:136:0x0201, B:146:0x022b, B:137:0x0206, B:139:0x0216, B:141:0x021e, B:130:0x01ee), top: B:187:0x01b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0206 A[Catch: Exception -> 0x029e, TryCatch #1 {Exception -> 0x029e, blocks: (B:115:0x01b6, B:121:0x01cd, B:127:0x01e1, B:129:0x01e7, B:134:0x01f9, B:136:0x0201, B:146:0x022b, B:137:0x0206, B:139:0x0216, B:141:0x021e, B:130:0x01ee), top: B:187:0x01b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02b0 A[Catch: Exception -> 0x02ff, TRY_ENTER, TryCatch #0 {Exception -> 0x02ff, blocks: (B:3:0x0008, B:5:0x001c, B:7:0x0026, B:10:0x0034, B:14:0x0042, B:18:0x004c, B:20:0x0054, B:22:0x005c, B:24:0x0064, B:26:0x006c, B:28:0x0074, B:32:0x0082, B:34:0x008a, B:36:0x0092, B:38:0x009a, B:40:0x00a4, B:42:0x00ac, B:44:0x00b4, B:46:0x00bc, B:48:0x00c4, B:50:0x00cc, B:52:0x00d4, B:56:0x00e2, B:58:0x00ea, B:60:0x00f2, B:62:0x00fc, B:64:0x0104, B:66:0x010a, B:68:0x0112, B:71:0x011c, B:73:0x0124, B:77:0x0130, B:79:0x0138, B:81:0x0140, B:83:0x0148, B:172:0x02a8, B:175:0x02b0, B:177:0x02b6, B:178:0x02d0, B:179:0x02f3, B:86:0x0151, B:87:0x0154, B:89:0x015c, B:92:0x0167, B:94:0x016f, B:97:0x017a, B:99:0x0182, B:102:0x018d, B:104:0x0195, B:107:0x01a0, B:109:0x01a8), top: B:185:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0231 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02d0 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.ArrayList zzh(com.google.android.gms.internal.ads.zzqq r27, com.google.android.gms.internal.ads.zzqt r28) {
        /*
            Method dump skipped, instructions count: 775
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqy.zzh(com.google.android.gms.internal.ads.zzqq, com.google.android.gms.internal.ads.zzqt):java.util.ArrayList");
    }

    private static void zzi(List list, final zzqx zzqxVar) {
        Collections.sort(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzqn
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                zzqx zzqxVar2 = zzqx.this;
                int i2 = zzqy.zza;
                return zzqxVar2.zza(obj2) - zzqxVar2.zza(obj);
            }
        });
    }

    private static boolean zzj(MediaCodecInfo mediaCodecInfo, String str) {
        if (zzeg.zza >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (zzbo.zzg(str)) {
            return true;
        }
        String zza2 = zzfoa.zza(mediaCodecInfo.getName());
        if (zza2.startsWith("arc.")) {
            return false;
        }
        if (zza2.startsWith("omx.google.") || zza2.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((zza2.startsWith("omx.sec.") && zza2.contains(".sw.")) || zza2.equals("omx.qcom.video.decoder.hevcswvdec") || zza2.startsWith("c2.android.") || zza2.startsWith("c2.google.")) {
            return true;
        }
        return (zza2.startsWith("omx.") || zza2.startsWith("c2.")) ? false : true;
    }
}
