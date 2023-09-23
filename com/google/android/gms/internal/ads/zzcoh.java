package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcoh implements zzdls {
    private final zzcrb zza;
    private zzezb zzb;
    private zzeyc zzc;
    private zzdhe zzd;
    private zzdbe zze;
    private zzdlo zzf;
    private zzcvr zzg;

    public /* synthetic */ zzcoh(zzcrb zzcrbVar, zzcog zzcogVar) {
        this.zza = zzcrbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdba
    public final /* synthetic */ zzdba zza(zzeyc zzeycVar) {
        this.zzc = zzeycVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdba
    public final /* synthetic */ zzdba zzb(zzezb zzezbVar) {
        this.zzb = zzezbVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdls
    public final /* synthetic */ zzdls zzc(zzcvr zzcvrVar) {
        this.zzg = zzcvrVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdls
    public final /* synthetic */ zzdls zzd(zzdlo zzdloVar) {
        this.zzf = zzdloVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdls
    public final /* synthetic */ zzdls zze(zzdhe zzdheVar) {
        this.zzd = zzdheVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdls
    public final /* synthetic */ zzdls zzf(zzdbe zzdbeVar) {
        this.zze = zzdbeVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdba
    /* renamed from: zzg */
    public final zzdlt zzh() {
        zzgqc.zzc(this.zzd, zzdhe.class);
        zzgqc.zzc(this.zze, zzdbe.class);
        zzgqc.zzc(this.zzf, zzdlo.class);
        zzgqc.zzc(this.zzg, zzcvr.class);
        return new zzcoj(this.zza, this.zzg, this.zzf, new zzczb(), new zzfdb(), new zzdam(), new zzdwt(), this.zzd, this.zze, new zzfdf(), null, this.zzb, this.zzc, null);
    }
}
