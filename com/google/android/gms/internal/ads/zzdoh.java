package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdoh implements zzgpu {
    private final zzgqh zza;
    private final zzgqh zzb;
    private final zzgqh zzc;
    private final zzgqh zzd;
    private final zzgqh zze;
    private final zzgqh zzf;
    private final zzgqh zzg;
    private final zzgqh zzh;
    private final zzgqh zzi;

    public zzdoh(zzgqh zzgqhVar, zzgqh zzgqhVar2, zzgqh zzgqhVar3, zzgqh zzgqhVar4, zzgqh zzgqhVar5, zzgqh zzgqhVar6, zzgqh zzgqhVar7, zzgqh zzgqhVar8, zzgqh zzgqhVar9) {
        this.zza = zzgqhVar;
        this.zzb = zzgqhVar2;
        this.zzc = zzgqhVar3;
        this.zzd = zzgqhVar4;
        this.zze = zzgqhVar5;
        this.zzf = zzgqhVar6;
        this.zzg = zzgqhVar7;
        this.zzh = zzgqhVar8;
        this.zzi = zzgqhVar9;
    }

    @Override // com.google.android.gms.internal.ads.zzgqh
    /* renamed from: zza */
    public final zzdog zzb() {
        zzfvk zzfvkVar = zzcfv.zza;
        zzgqc.zzb(zzfvkVar);
        return new zzdog(((zzfdg) this.zza).zzb(), ((zzdbj) this.zzb).zza(), (zzdnl) this.zzc.zzb(), ((zzdnz) this.zzd).zza(), (zzdor) this.zze.zzb(), (zzdoz) this.zzf.zzb(), (Executor) this.zzg.zzb(), zzfvkVar, (zzdnd) this.zzi.zzb());
    }
}
