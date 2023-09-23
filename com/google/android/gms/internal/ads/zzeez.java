package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzeez implements zzeey {
    @VisibleForTesting
    public final zzeey zza;
    private final zzfoi zzb;

    public zzeez(zzeey zzeeyVar, zzfoi zzfoiVar) {
        this.zza = zzeeyVar;
        this.zzb = zzfoiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeey
    public final zzfvj zza(zzfbs zzfbsVar, zzfbg zzfbgVar) {
        return zzfva.zzm(this.zza.zza(zzfbsVar, zzfbgVar), this.zzb, zzcfv.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzeey
    public final boolean zzb(zzfbs zzfbsVar, zzfbg zzfbgVar) {
        return this.zza.zzb(zzfbsVar, zzfbgVar);
    }
}
