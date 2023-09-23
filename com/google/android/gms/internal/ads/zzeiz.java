package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public class zzeiz extends zzeka {
    private final zzdjo zza;

    public zzeiz(zzdbq zzdbqVar, zzdjd zzdjdVar, zzdck zzdckVar, zzdcz zzdczVar, zzdde zzddeVar, zzdcf zzdcfVar, zzdgl zzdglVar, zzdjv zzdjvVar, zzddy zzddyVar, zzdjo zzdjoVar, zzdgh zzdghVar) {
        super(zzdbqVar, zzdjdVar, zzdckVar, zzdczVar, zzddeVar, zzdglVar, zzddyVar, zzdjvVar, zzdghVar, zzdcfVar);
        this.zza = zzdjoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeka, com.google.android.gms.internal.ads.zzbuf
    public final void zzs(zzcaw zzcawVar) {
        this.zza.zza(zzcawVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeka, com.google.android.gms.internal.ads.zzbuf
    public final void zzt(zzcba zzcbaVar) {
        this.zza.zza(new zzcaw(zzcbaVar.zzf(), zzcbaVar.zze()));
    }

    @Override // com.google.android.gms.internal.ads.zzeka, com.google.android.gms.internal.ads.zzbuf
    public final void zzu() {
        this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzeka, com.google.android.gms.internal.ads.zzbuf
    public final void zzv() {
        this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzeka, com.google.android.gms.internal.ads.zzbuf
    public final void zzy() {
        this.zza.zzc();
    }
}
