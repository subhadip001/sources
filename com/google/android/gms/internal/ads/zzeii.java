package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzeii extends zzeid {
    private final zzcnf zza;
    private final zzdbc zzb;
    private final zzdhe zzc;

    public zzeii(zzcnf zzcnfVar, zzdbc zzdbcVar, zzdhe zzdheVar) {
        this.zza = zzcnfVar;
        this.zzb = zzdbcVar;
        this.zzc = zzdheVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeid
    public final zzfvj zzc(zzfby zzfbyVar, Bundle bundle) {
        zzdsw zzi = this.zza.zzi();
        zzdbc zzdbcVar = this.zzb;
        zzdbcVar.zzf(zzfbyVar);
        zzdbcVar.zzd(bundle);
        zzi.zzd(zzdbcVar.zzg());
        zzi.zzc(this.zzc);
        zzcyz zzb = zzi.zze().zzb();
        return zzb.zzh(zzb.zzi());
    }
}
