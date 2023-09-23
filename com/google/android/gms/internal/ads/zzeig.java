package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzeig extends zzeid {
    private final zzcnf zza;
    private final zzdbc zzb;
    private final zzekm zzc;
    private final zzdhe zzd;

    public zzeig(zzcnf zzcnfVar, zzdbc zzdbcVar, zzekm zzekmVar, zzdhe zzdheVar) {
        this.zza = zzcnfVar;
        this.zzb = zzdbcVar;
        this.zzc = zzekmVar;
        this.zzd = zzdheVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeid
    public final zzfvj zzc(zzfby zzfbyVar, Bundle bundle) {
        zzdkw zzg = this.zza.zzg();
        zzdbc zzdbcVar = this.zzb;
        zzdbcVar.zzf(zzfbyVar);
        zzdbcVar.zzd(bundle);
        zzg.zze(zzdbcVar.zzg());
        zzg.zzd(this.zzd);
        zzg.zzc(this.zzc);
        zzcyz zza = zzg.zzf().zza();
        return zza.zzh(zza.zzi());
    }
}
