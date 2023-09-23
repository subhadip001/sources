package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzqw implements zzqt {
    private final int zza;
    private MediaCodecInfo[] zzb;

    public zzqw(boolean z, boolean z2) {
        int i2 = 1;
        if (!z && !z2) {
            i2 = 0;
        }
        this.zza = i2;
    }

    private final void zzf() {
        if (this.zzb == null) {
            this.zzb = new MediaCodecList(this.zza).getCodecInfos();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqt
    public final int zza() {
        zzf();
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.ads.zzqt
    public final MediaCodecInfo zzb(int i2) {
        zzf();
        return this.zzb[i2];
    }

    @Override // com.google.android.gms.internal.ads.zzqt
    public final boolean zzc(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // com.google.android.gms.internal.ads.zzqt
    public final boolean zzd(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // com.google.android.gms.internal.ads.zzqt
    public final boolean zze() {
        return true;
    }
}
