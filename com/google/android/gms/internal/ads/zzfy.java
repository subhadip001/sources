package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfy {
    private final MediaCodec.CryptoInfo zza;
    private final MediaCodec.CryptoInfo.Pattern zzb = new MediaCodec.CryptoInfo.Pattern(0, 0);

    public static /* bridge */ /* synthetic */ void zza(zzfy zzfyVar, int i2, int i3) {
        zzfyVar.zzb.set(i2, i3);
        zzfyVar.zza.setPattern(zzfyVar.zzb);
    }
}
