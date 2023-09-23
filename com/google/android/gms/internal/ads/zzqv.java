package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzqv implements zzqt {
    private zzqv() {
    }

    public /* synthetic */ zzqv(zzqu zzquVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzqt
    public final int zza() {
        return MediaCodecList.getCodecCount();
    }

    @Override // com.google.android.gms.internal.ads.zzqt
    public final MediaCodecInfo zzb(int i2) {
        return MediaCodecList.getCodecInfoAt(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzqt
    public final boolean zzc(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzqt
    public final boolean zzd(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    @Override // com.google.android.gms.internal.ads.zzqt
    public final boolean zze() {
        return false;
    }
}
