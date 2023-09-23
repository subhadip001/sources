package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgps implements zzgpu {
    private zzgqh zza;

    public static void zza(zzgqh zzgqhVar, zzgqh zzgqhVar2) {
        zzgps zzgpsVar = (zzgps) zzgqhVar;
        if (zzgpsVar.zza != null) {
            throw new IllegalStateException();
        }
        zzgpsVar.zza = zzgqhVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgqh
    public final Object zzb() {
        zzgqh zzgqhVar = this.zza;
        if (zzgqhVar != null) {
            return zzgqhVar.zzb();
        }
        throw new IllegalStateException();
    }
}
