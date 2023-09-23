package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcxo {
    private final zzdeh zza;
    private final zzdgn zzb;

    public zzcxo(zzdeh zzdehVar, zzdgn zzdgnVar) {
        this.zza = zzdehVar;
        this.zzb = zzdgnVar;
    }

    public final zzdeh zza() {
        return this.zza;
    }

    public final zzdgn zzb() {
        return this.zzb;
    }

    public final zzdiy zzc() {
        zzdgn zzdgnVar = this.zzb;
        return zzdgnVar != null ? new zzdiy(zzdgnVar, zzcfv.zzf) : new zzdiy(new zzcxn(this), zzcfv.zzf);
    }
}
