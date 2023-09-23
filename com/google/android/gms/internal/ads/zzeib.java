package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzeib extends zzeid {
    private final zzcnf zza;
    private final zzdlo zzb;
    private final zzdbc zzc;
    private final zzdhe zzd;

    public zzeib(zzcnf zzcnfVar, zzdlo zzdloVar, zzdbc zzdbcVar, zzdhe zzdheVar) {
        this.zza = zzcnfVar;
        this.zzb = zzdloVar;
        this.zzc = zzdbcVar;
        this.zzd = zzdheVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeid
    public final zzfvj zzc(zzfby zzfbyVar, Bundle bundle) {
        zzdls zzh = this.zza.zzh();
        zzdbc zzdbcVar = this.zzc;
        zzdbcVar.zzf(zzfbyVar);
        zzdbcVar.zzd(bundle);
        zzh.zzf(zzdbcVar.zzg());
        zzh.zze(this.zzd);
        zzh.zzd(this.zzb);
        zzh.zzc(new zzcvr(null));
        zzcyz zza = zzh.zzg().zza();
        return zza.zzh(zza.zzi());
    }
}
