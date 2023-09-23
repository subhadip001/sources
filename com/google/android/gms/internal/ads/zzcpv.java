package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcpv implements zzdxh {
    private final Long zza;
    private final String zzb;
    private final zzcrb zzc;
    private final zzcpz zzd;
    private final zzcpv zze = this;

    public /* synthetic */ zzcpv(zzcrb zzcrbVar, zzcpz zzcpzVar, Long l2, String str, zzcpu zzcpuVar) {
        this.zzc = zzcrbVar;
        this.zzd = zzcpzVar;
        this.zza = l2;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdxh
    public final zzdxr zza() {
        Context context;
        zzdxk zzc;
        long longValue = this.zza.longValue();
        zzcpz zzcpzVar = this.zzd;
        context = zzcpzVar.zza;
        zzc = zzdxl.zzc(zzcpzVar.zzb);
        return zzdxs.zza(longValue, context, zzc, this.zzc, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzdxh
    public final zzdxv zzb() {
        Context context;
        zzdxk zzc;
        long longValue = this.zza.longValue();
        zzcpz zzcpzVar = this.zzd;
        context = zzcpzVar.zza;
        zzc = zzdxl.zzc(zzcpzVar.zzb);
        return zzdxw.zza(longValue, context, zzc, this.zzc, this.zzb);
    }
}
