package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzezk implements zzgpu {
    private final zzgqh zza;
    private final zzgqh zzb;
    private final zzgqh zzc;
    private final zzgqh zzd;
    private final zzgqh zze;
    private final zzgqh zzf;

    public zzezk(zzgqh zzgqhVar, zzgqh zzgqhVar2, zzgqh zzgqhVar3, zzgqh zzgqhVar4, zzgqh zzgqhVar5, zzgqh zzgqhVar6) {
        this.zza = zzgqhVar;
        this.zzb = zzgqhVar2;
        this.zzc = zzgqhVar3;
        this.zzd = zzgqhVar4;
        this.zze = zzgqhVar5;
        this.zzf = zzgqhVar6;
    }

    @Override // com.google.android.gms.internal.ads.zzgqh
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzezj((Context) this.zza.zzb(), (Executor) this.zzb.zzb(), (zzcnf) this.zzc.zzb(), (zzemc) this.zzd.zzb(), (zzfaj) this.zze.zzb(), new zzfbw());
    }
}
