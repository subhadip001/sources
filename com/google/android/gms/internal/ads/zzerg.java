package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzerg implements zzgpu {
    private final zzgqh zza;
    private final zzgqh zzb;
    private final zzgqh zzc;
    private final zzgqh zzd;

    public zzerg(zzgqh zzgqhVar, zzgqh zzgqhVar2, zzgqh zzgqhVar3, zzgqh zzgqhVar4) {
        this.zza = zzgqhVar;
        this.zzb = zzgqhVar2;
        this.zzc = zzgqhVar3;
        this.zzd = zzgqhVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzgqh
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfvk zzfvkVar = zzcfv.zza;
        zzgqc.zzb(zzfvkVar);
        return new zzere(zzfvkVar, ((zzdbj) this.zzb).zza(), (PackageInfo) this.zzc.zzb(), ((zzfdg) this.zzd).zzb());
    }
}
