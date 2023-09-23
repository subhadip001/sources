package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzexr implements zzgpu {
    private final zzgqh zza;
    private final zzgqh zzb;
    private final zzgqh zzc;
    private final zzgqh zzd;
    private final zzgqh zze;
    private final zzgqh zzf;
    private final zzgqh zzg;
    private final zzgqh zzh;

    public zzexr(zzgqh zzgqhVar, zzgqh zzgqhVar2, zzgqh zzgqhVar3, zzgqh zzgqhVar4, zzgqh zzgqhVar5, zzgqh zzgqhVar6, zzgqh zzgqhVar7, zzgqh zzgqhVar8) {
        this.zza = zzgqhVar;
        this.zzb = zzgqhVar2;
        this.zzc = zzgqhVar3;
        this.zzd = zzgqhVar4;
        this.zze = zzgqhVar5;
        this.zzf = zzgqhVar6;
        this.zzg = zzgqhVar7;
        this.zzh = zzgqhVar8;
    }

    @Override // com.google.android.gms.internal.ads.zzgqh
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzexq((Context) this.zza.zzb(), (Executor) this.zzb.zzb(), (com.google.android.gms.ads.internal.client.zzq) this.zzc.zzb(), (zzcnf) this.zzd.zzb(), (zzemc) this.zze.zzb(), (zzemg) this.zzf.zzb(), new zzfbw(), (zzdgn) this.zzh.zzb());
    }
}
