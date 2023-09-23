package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzavy implements zzavw {
    private zzavy() {
    }

    public /* synthetic */ zzavy(zzavx zzavxVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzavw
    public final int zza() {
        return MediaCodecList.getCodecCount();
    }

    @Override // com.google.android.gms.internal.ads.zzavw
    public final MediaCodecInfo zzb(int i2) {
        return MediaCodecList.getCodecInfoAt(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzavw
    public final boolean zzc(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "video/avc".equals(str);
    }

    @Override // com.google.android.gms.internal.ads.zzavw
    public final boolean zzd() {
        return false;
    }
}
