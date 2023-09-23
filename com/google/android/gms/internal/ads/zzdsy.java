package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdsy implements zzgpu {
    private final zzgqh zza;
    private final zzgqh zzb;
    private final zzgqh zzc;

    public zzdsy(zzgqh zzgqhVar, zzgqh zzgqhVar2, zzgqh zzgqhVar3) {
        this.zza = zzgqhVar;
        this.zzb = zzgqhVar2;
        this.zzc = zzgqhVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgqh
    public final /* synthetic */ Object zzb() {
        zzgqh zzgqhVar = this.zza;
        zzgqh zzgqhVar2 = this.zzb;
        int i2 = ((zzdbj) this.zzc).zza().zzo.zza;
        int i3 = i2 - 1;
        if (i2 != 0) {
            if (i3 != 0) {
                return ((zzejz) zzgqhVar2).zzb();
            }
            return ((zzejz) zzgqhVar).zzb();
        }
        throw null;
    }
}
