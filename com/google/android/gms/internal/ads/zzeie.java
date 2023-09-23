package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzeie extends zzeid {
    private final zzcnf zza;
    private final zzdbc zzb;
    private final zzekm zzc;
    private final zzdhe zzd;
    private final zzdlo zze;
    private final zzdeh zzf;
    private final ViewGroup zzg;
    private final zzdgn zzh;

    public zzeie(zzcnf zzcnfVar, zzdbc zzdbcVar, zzekm zzekmVar, zzdhe zzdheVar, zzdlo zzdloVar, zzdeh zzdehVar, ViewGroup viewGroup, zzdgn zzdgnVar) {
        this.zza = zzcnfVar;
        this.zzb = zzdbcVar;
        this.zzc = zzekmVar;
        this.zzd = zzdheVar;
        this.zze = zzdloVar;
        this.zzf = zzdehVar;
        this.zzg = viewGroup;
        this.zzh = zzdgnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeid
    public final zzfvj zzc(zzfby zzfbyVar, Bundle bundle) {
        zzcwq zze = this.zza.zze();
        zzdbc zzdbcVar = this.zzb;
        zzdbcVar.zzf(zzfbyVar);
        zzdbcVar.zzd(bundle);
        zze.zzi(zzdbcVar.zzg());
        zze.zzf(this.zzd);
        zze.zze(this.zzc);
        zze.zzd(this.zze);
        zze.zzg(new zzcxo(this.zzf, this.zzh));
        zze.zzc(new zzcvr(this.zzg));
        zzcyz zzd = zze.zzj().zzd();
        return zzd.zzh(zzd.zzi());
    }
}
