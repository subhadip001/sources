package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcpt implements zzdxg {
    private final zzcrb zza;
    private final zzcpz zzb;
    private Long zzc;
    private String zzd;

    public /* synthetic */ zzcpt(zzcrb zzcrbVar, zzcpz zzcpzVar, zzcps zzcpsVar) {
        this.zza = zzcrbVar;
        this.zzb = zzcpzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdxg
    public final /* synthetic */ zzdxg zza(String str) {
        Objects.requireNonNull(str);
        this.zzd = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdxg
    public final /* bridge */ /* synthetic */ zzdxg zzb(long j2) {
        this.zzc = Long.valueOf(j2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdxg
    public final zzdxh zzc() {
        zzgqc.zzc(this.zzc, Long.class);
        zzgqc.zzc(this.zzd, String.class);
        return new zzcpv(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
