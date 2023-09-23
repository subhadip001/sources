package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzavz implements zzavw {
    private final int zza;
    private MediaCodecInfo[] zzb;

    public zzavz(boolean z) {
        this.zza = z ? 1 : 0;
    }

    private final void zze() {
        if (this.zzb == null) {
            this.zzb = new MediaCodecList(this.zza).getCodecInfos();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavw
    public final int zza() {
        zze();
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.ads.zzavw
    public final MediaCodecInfo zzb(int i2) {
        zze();
        return this.zzb[i2];
    }

    @Override // com.google.android.gms.internal.ads.zzavw
    public final boolean zzc(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    @Override // com.google.android.gms.internal.ads.zzavw
    public final boolean zzd() {
        return true;
    }
}
