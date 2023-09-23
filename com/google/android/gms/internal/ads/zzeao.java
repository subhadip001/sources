package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzeao implements zzgpu {
    private final zzgqh zza;
    private final zzgqh zzb;
    private final zzgqh zzc;
    private final zzgqh zzd;
    private final zzgqh zze;
    private final zzgqh zzf;
    private final zzgqh zzg;

    public zzeao(zzgqh zzgqhVar, zzgqh zzgqhVar2, zzgqh zzgqhVar3, zzgqh zzgqhVar4, zzgqh zzgqhVar5, zzgqh zzgqhVar6, zzgqh zzgqhVar7) {
        this.zza = zzgqhVar;
        this.zzb = zzgqhVar2;
        this.zzc = zzgqhVar3;
        this.zzd = zzgqhVar4;
        this.zze = zzgqhVar5;
        this.zzf = zzgqhVar6;
        this.zzg = zzgqhVar7;
    }

    @Override // com.google.android.gms.internal.ads.zzgqh
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza = ((zzfdh) this.zza).zza();
        zzfby zza2 = ((zzdbj) this.zzb).zza();
        zzdzo zzb = ((zzdzp) this.zzc).zzb();
        zzfvk zzfvkVar = zzcfv.zza;
        zzgqc.zzb(zzfvkVar);
        return new zzean(zza, zza2, zzb, zzfvkVar, (ScheduledExecutorService) this.zze.zzb(), (zzedr) this.zzf.zzb(), (zzfhq) this.zzg.zzb());
    }
}
