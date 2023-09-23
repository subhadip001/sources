package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import android.util.SparseIntArray;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import f.a.b.a.a;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzawa {
    private static final SparseIntArray zzd;
    private static final SparseIntArray zze;
    private static final Map zzf;
    private static final zzavo zza = zzavo.zzb("OMX.google.raw.decoder");
    private static final Pattern zzb = Pattern.compile("^\\D?(\\d+)$");
    private static final HashMap zzc = new HashMap();
    private static int zzg = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        zzd = sparseIntArray;
        sparseIntArray.put(66, 1);
        sparseIntArray.put(77, 2);
        sparseIntArray.put(88, 4);
        sparseIntArray.put(100, 8);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        zze = sparseIntArray2;
        sparseIntArray2.put(10, 1);
        sparseIntArray2.put(11, 4);
        sparseIntArray2.put(12, 8);
        sparseIntArray2.put(13, 16);
        sparseIntArray2.put(20, 32);
        sparseIntArray2.put(21, 64);
        sparseIntArray2.put(22, 128);
        sparseIntArray2.put(30, 256);
        sparseIntArray2.put(31, 512);
        sparseIntArray2.put(32, 1024);
        sparseIntArray2.put(40, RecyclerView.a0.FLAG_MOVED);
        sparseIntArray2.put(41, 4096);
        sparseIntArray2.put(42, 8192);
        sparseIntArray2.put(50, 16384);
        sparseIntArray2.put(51, 32768);
        sparseIntArray2.put(52, LogFileManager.MAX_LOG_SIZE);
        HashMap hashMap = new HashMap();
        zzf = hashMap;
        a.H(1, hashMap, "L30", 4, "L60", 16, "L63", 64, "L90");
        a.H(256, hashMap, "L93", 1024, "L120", 4096, "L123", 16384, "L150");
        a.H(LogFileManager.MAX_LOG_SIZE, hashMap, "L153", 262144, "L156", CommonUtils.BYTES_IN_A_MEGABYTE, "L180", 4194304, "L183");
        a.H(16777216, hashMap, "L186", 2, "H30", 8, "H60", 32, "H63");
        a.H(128, hashMap, "H90", 512, "H93", RecyclerView.a0.FLAG_MOVED, "H120", 8192, "H123");
        a.H(32768, hashMap, "H150", 131072, "H153", 524288, "H156", 2097152, "H180");
        hashMap.put("H183", 8388608);
        hashMap.put("H186", 33554432);
    }

    public static int zza() {
        int i2 = zzg;
        if (i2 == -1) {
            zzavo zzc2 = zzc("video/avc", false);
            if (zzc2 != null) {
                int i3 = 0;
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : zzc2.zzg()) {
                    int i4 = codecProfileLevel.level;
                    int i5 = 9437184;
                    if (i4 == 1 || i4 == 2) {
                        i5 = 25344;
                    } else {
                        switch (i4) {
                            case 8:
                            case 16:
                            case 32:
                                i5 = 101376;
                                continue;
                            case 64:
                                i5 = 202752;
                                continue;
                            case 128:
                            case 256:
                                i5 = 414720;
                                continue;
                            case 512:
                                i5 = 921600;
                                continue;
                            case 1024:
                                i5 = 1310720;
                                continue;
                            case RecyclerView.a0.FLAG_MOVED /* 2048 */:
                            case 4096:
                                i5 = 2097152;
                                continue;
                            case 8192:
                                i5 = 2228224;
                                continue;
                            case 16384:
                                i5 = 5652480;
                                continue;
                            case 32768:
                            case LogFileManager.MAX_LOG_SIZE /* 65536 */:
                                break;
                            default:
                                i5 = -1;
                                continue;
                        }
                    }
                    i3 = Math.max(i5, i3);
                }
                i2 = Math.max(i3, zzazn.zza >= 21 ? 345600 : 172800);
            } else {
                i2 = 0;
            }
            zzg = i2;
        }
        return i2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Pair zzb(String str) {
        char c;
        Integer valueOf;
        Integer valueOf2;
        String[] split = str.split("\\.");
        String str2 = split[0];
        int i2 = 2;
        switch (str2.hashCode()) {
            case 3006243:
                if (str2.equals("avc1")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 3006244:
                if (str2.equals("avc2")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 3199032:
                if (str2.equals("hev1")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 3214780:
                if (str2.equals("hvc1")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0 || c == 1) {
            if (split.length < 4) {
                Log.w("MediaCodecUtil", "Ignoring malformed HEVC codec string: ".concat(str));
                return null;
            }
            Matcher matcher = zzb.matcher(split[1]);
            if (!matcher.matches()) {
                Log.w("MediaCodecUtil", "Ignoring malformed HEVC codec string: ".concat(str));
                return null;
            }
            String group = matcher.group(1);
            if ("1".equals(group)) {
                i2 = 1;
            } else if (!"2".equals(group)) {
                Log.w("MediaCodecUtil", "Unknown HEVC profile string: ".concat(String.valueOf(group)));
                return null;
            }
            Integer num = (Integer) zzf.get(split[3]);
            if (num == null) {
                Log.w("MediaCodecUtil", "Unknown HEVC level string: ".concat(String.valueOf(matcher.group(1))));
                return null;
            }
            return new Pair(Integer.valueOf(i2), num);
        } else if (c == 2 || c == 3) {
            int length = split.length;
            if (length < 2) {
                Log.w("MediaCodecUtil", "Ignoring malformed AVC codec string: ".concat(str));
                return null;
            }
            try {
                if (split[1].length() == 6) {
                    valueOf = Integer.valueOf(Integer.parseInt(split[1].substring(0, 2), 16));
                    valueOf2 = Integer.valueOf(Integer.parseInt(split[1].substring(4), 16));
                } else if (length >= 3) {
                    valueOf = Integer.valueOf(Integer.parseInt(split[1]));
                    valueOf2 = Integer.valueOf(Integer.parseInt(split[2]));
                } else {
                    Log.w("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
                    return null;
                }
                return new Pair(Integer.valueOf(zzd.get(valueOf.intValue())), Integer.valueOf(zze.get(valueOf2.intValue())));
            } catch (NumberFormatException unused) {
                Log.w("MediaCodecUtil", "Ignoring malformed AVC codec string: ".concat(str));
                return null;
            }
        } else {
            return null;
        }
    }

    public static zzavo zzc(String str, boolean z) {
        List zzd2 = zzd(str, z);
        if (zzd2.isEmpty()) {
            return null;
        }
        return (zzavo) zzd2.get(0);
    }

    public static synchronized List zzd(String str, boolean z) {
        zzavw zzavyVar;
        synchronized (zzawa.class) {
            zzavt zzavtVar = new zzavt(str, z);
            HashMap hashMap = zzc;
            List list = (List) hashMap.get(zzavtVar);
            if (list != null) {
                return list;
            }
            int i2 = zzazn.zza;
            if (i2 >= 21) {
                zzavyVar = new zzavz(z);
            } else {
                zzavyVar = new zzavy(null);
            }
            List zze2 = zze(zzavtVar, zzavyVar);
            if (z && zze2.isEmpty() && i2 >= 21 && i2 <= 23) {
                zze2 = zze(zzavtVar, new zzavy(null));
                if (!zze2.isEmpty()) {
                    String str2 = ((zzavo) zze2.get(0)).zza;
                    Log.w("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + str2);
                }
            }
            List unmodifiableList = Collections.unmodifiableList(zze2);
            hashMap.put(zzavtVar, unmodifiableList);
            return unmodifiableList;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x01be A[Catch: Exception -> 0x01b9, TryCatch #1 {Exception -> 0x01b9, blocks: (B:102:0x0195, B:104:0x019f, B:106:0x01a7, B:108:0x01af, B:115:0x01be, B:120:0x01c7), top: B:151:0x0195 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.List zze(com.google.android.gms.internal.ads.zzavt r18, com.google.android.gms.internal.ads.zzavw r19) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzawa.zze(com.google.android.gms.internal.ads.zzavt, com.google.android.gms.internal.ads.zzavw):java.util.List");
    }
}
