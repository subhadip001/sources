package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzctj implements zzdbv {
    private final zzfbj zza;
    private final zzfbs zzb;
    private final zzfic zzc;
    private final zzfig zzd;

    public zzctj(zzfbs zzfbsVar, zzfig zzfigVar, zzfic zzficVar) {
        this.zzb = zzfbsVar;
        this.zzd = zzfigVar;
        this.zzc = zzficVar;
        this.zza = zzfbsVar.zzb.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdbv
    public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zzd.zzd(this.zzc.zza(this.zzb, null, this.zza.zza));
    }
}
