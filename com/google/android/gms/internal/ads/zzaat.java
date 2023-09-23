package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzaat {
    public final zzzz zza;

    public zzaat(zzzz zzzzVar) {
        this.zza = zzzzVar;
    }

    public abstract boolean zza(zzdy zzdyVar);

    public abstract boolean zzb(zzdy zzdyVar, long j2);

    public final boolean zzf(zzdy zzdyVar, long j2) {
        return zza(zzdyVar) && zzb(zzdyVar, j2);
    }
}
