package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcqr implements zzdsw {
    private final zzcrb zza;
    private zzezb zzb;
    private zzeyc zzc;
    private zzdhe zzd;
    private zzdbe zze;

    public /* synthetic */ zzcqr(zzcrb zzcrbVar, zzcqq zzcqqVar) {
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

    @Override // com.google.android.gms.internal.ads.zzdsw
    public final /* synthetic */ zzdsw zzc(zzdhe zzdheVar) {
        this.zzd = zzdheVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdsw
    public final /* synthetic */ zzdsw zzd(zzdbe zzdbeVar) {
        this.zze = zzdbeVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdba
    /* renamed from: zze */
    public final zzdsx zzh() {
        zzgqc.zzc(this.zzd, zzdhe.class);
        zzgqc.zzc(this.zze, zzdbe.class);
        return new zzcqt(this.zza, new zzczb(), new zzfdb(), new zzdam(), new zzdwt(), this.zzd, this.zze, new zzfdf(), null, this.zzb, this.zzc, null);
    }
}
