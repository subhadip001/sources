package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcqv implements com.google.android.gms.ads.nonagon.signalgeneration.zzg {
    private final zzcrb zza;
    private zzdbe zzb;
    private com.google.android.gms.ads.nonagon.signalgeneration.zzad zzc;

    public /* synthetic */ zzcqv(zzcrb zzcrbVar, zzcqu zzcquVar) {
        this.zza = zzcrbVar;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzg
    public final /* synthetic */ com.google.android.gms.ads.nonagon.signalgeneration.zzg zza(zzdbe zzdbeVar) {
        this.zzb = zzdbeVar;
        return this;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzg
    public final /* synthetic */ com.google.android.gms.ads.nonagon.signalgeneration.zzg zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzad zzadVar) {
        this.zzc = zzadVar;
        return this;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzg
    public final com.google.android.gms.ads.nonagon.signalgeneration.zzh zzc() {
        zzgqc.zzc(this.zzb, zzdbe.class);
        zzgqc.zzc(this.zzc, com.google.android.gms.ads.nonagon.signalgeneration.zzad.class);
        return new zzcqx(this.zza, this.zzc, new zzczb(), new zzdwt(), this.zzb, new zzfdf(), null, null, null);
    }
}
