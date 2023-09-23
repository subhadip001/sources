package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import f.a.b.a.a;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzavo {
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;
    public final boolean zzd;
    private final String zze;
    private final MediaCodecInfo.CodecCapabilities zzf;

    private zzavo(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2) {
        Objects.requireNonNull(str);
        this.zza = str;
        this.zze = str2;
        this.zzf = codecCapabilities;
        boolean z3 = true;
        this.zzb = !z && codecCapabilities != null && zzazn.zza >= 19 && codecCapabilities.isFeatureSupported("adaptive-playback");
        this.zzc = codecCapabilities != null && zzazn.zza >= 21 && codecCapabilities.isFeatureSupported("tunneled-playback");
        if (!z2 && (codecCapabilities == null || zzazn.zza < 21 || !codecCapabilities.isFeatureSupported("secure-playback"))) {
            z3 = false;
        }
        this.zzd = z3;
    }

    public static zzavo zza(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2) {
        return new zzavo(str, str2, codecCapabilities, z, z2);
    }

    public static zzavo zzb(String str) {
        return new zzavo("OMX.google.raw.decoder", null, null, false, false);
    }

    private final void zzh(String str) {
        String str2 = this.zza;
        Log.d("MediaCodecInfo", a.w(a.F("NoSupport [", str, "] [", str2, ", "), this.zze, "] [", zzazn.zze, "]"));
    }

    private static boolean zzi(MediaCodecInfo.VideoCapabilities videoCapabilities, int i2, int i3, double d2) {
        if (d2 != -1.0d && d2 > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return videoCapabilities.areSizeAndRateSupported(i2, i3, d2);
        }
        return videoCapabilities.isSizeSupported(i2, i3);
    }

    public final boolean zzc(int i2) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzf;
        if (codecCapabilities == null) {
            zzh("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            zzh("channelCount.aCaps");
            return false;
        } else if (audioCapabilities.getMaxInputChannelCount() < i2) {
            zzh(a.i("channelCount.support, ", i2));
            return false;
        } else {
            return true;
        }
    }

    public final boolean zzd(int i2) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzf;
        if (codecCapabilities == null) {
            zzh("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            zzh("sampleRate.aCaps");
            return false;
        } else if (audioCapabilities.isSampleRateSupported(i2)) {
            return true;
        } else {
            zzh(a.i("sampleRate.support, ", i2));
            return false;
        }
    }

    public final boolean zze(String str) {
        String str2;
        MediaCodecInfo.CodecProfileLevel[] zzg;
        if (str == null || this.zze == null) {
            return true;
        }
        String trim = str.trim();
        if (trim.startsWith("avc1") || trim.startsWith("avc3")) {
            str2 = "video/avc";
        } else if (trim.startsWith("hev1") || trim.startsWith("hvc1")) {
            str2 = "video/hevc";
        } else if (trim.startsWith("vp9")) {
            str2 = "video/x-vnd.on2.vp9";
        } else if (trim.startsWith("vp8")) {
            str2 = "video/x-vnd.on2.vp8";
        } else if (trim.startsWith("mp4a")) {
            str2 = "audio/mp4a-latm";
        } else if (trim.startsWith("ac-3") || trim.startsWith("dac3")) {
            str2 = "audio/ac3";
        } else if (trim.startsWith("ec-3") || trim.startsWith("dec3")) {
            str2 = "audio/eac3";
        } else if (trim.startsWith("dtsc") || trim.startsWith("dtse")) {
            str2 = "audio/vnd.dts";
        } else if (trim.startsWith("dtsh") || trim.startsWith("dtsl")) {
            str2 = "audio/vnd.dts.hd";
        } else if (trim.startsWith("opus")) {
            str2 = "audio/opus";
        } else {
            str2 = trim.startsWith("vorbis") ? "audio/vorbis" : null;
        }
        if (str2 == null) {
            return true;
        }
        if (!this.zze.equals(str2)) {
            zzh(a.r("codec.mime ", str, ", ", str2));
            return false;
        }
        Pair zzb = zzawa.zzb(str);
        if (zzb == null) {
            return true;
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : zzg()) {
            if (codecProfileLevel.profile == ((Integer) zzb.first).intValue() && codecProfileLevel.level >= ((Integer) zzb.second).intValue()) {
                return true;
            }
        }
        zzh(a.r("codec.profileLevel, ", str, ", ", str2));
        return false;
    }

    public final boolean zzf(int i2, int i3, double d2) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzf;
        if (codecCapabilities == null) {
            zzh("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            zzh("sizeAndRate.vCaps");
            return false;
        } else if (zzi(videoCapabilities, i2, i3, d2)) {
            return true;
        } else {
            if (i2 < i3 && zzi(videoCapabilities, i3, i2, d2)) {
                StringBuilder C = a.C("sizeAndRate.rotated, ", i2, "x", i3, "x");
                C.append(d2);
                String str = this.zza;
                String str2 = this.zze;
                String str3 = zzazn.zze;
                StringBuilder A = a.A("AssumedSupport [");
                A.append(C.toString());
                A.append("] [");
                A.append(str);
                A.append(", ");
                Log.d("MediaCodecInfo", a.w(A, str2, "] [", str3, "]"));
                return true;
            }
            StringBuilder C2 = a.C("sizeAndRate.support, ", i2, "x", i3, "x");
            C2.append(d2);
            zzh(C2.toString());
            return false;
        }
    }

    public final MediaCodecInfo.CodecProfileLevel[] zzg() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzf;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }
}
