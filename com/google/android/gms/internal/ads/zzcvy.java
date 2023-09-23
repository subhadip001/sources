package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcvy implements zzgpu {
    private final zzgqh zza;
    private final zzgqh zzb;
    private final zzgqh zzc;
    private final zzgqh zzd;
    private final zzgqh zze;
    private final zzgqh zzf;
    private final zzgqh zzg;
    private final zzgqh zzh;
    private final zzgqh zzi;
    private final zzgqh zzj;

    public zzcvy(zzgqh zzgqhVar, zzgqh zzgqhVar2, zzgqh zzgqhVar3, zzgqh zzgqhVar4, zzgqh zzgqhVar5, zzgqh zzgqhVar6, zzgqh zzgqhVar7, zzgqh zzgqhVar8, zzgqh zzgqhVar9, zzgqh zzgqhVar10) {
        this.zza = zzgqhVar;
        this.zzb = zzgqhVar2;
        this.zzc = zzgqhVar3;
        this.zzd = zzgqhVar4;
        this.zze = zzgqhVar5;
        this.zzf = zzgqhVar6;
        this.zzg = zzgqhVar7;
        this.zzh = zzgqhVar8;
        this.zzi = zzgqhVar9;
        this.zzj = zzgqhVar10;
    }

    public static zzcvx zzc(zzcxv zzcxvVar, Context context, zzfbh zzfbhVar, View view, zzcli zzcliVar, zzcxu zzcxuVar, zzdnr zzdnrVar, zzdjh zzdjhVar, zzgpo zzgpoVar, Executor executor) {
        return new zzcvx(zzcxvVar, context, zzfbhVar, view, zzcliVar, zzcxuVar, zzdnrVar, zzdjhVar, zzgpoVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzgqh
    /* renamed from: zza */
    public final zzcvx zzb() {
        return new zzcvx(((zzczr) this.zza).zzb(), (Context) this.zzb.zzb(), ((zzcwe) this.zzc).zza(), ((zzcwd) this.zzd).zza(), ((zzcwp) this.zze).zza(), ((zzcwf) this.zzf).zza(), ((zzdlr) this.zzg).zza(), (zzdjh) this.zzh.zzb(), zzgpt.zza(this.zzi), (Executor) this.zzj.zzb());
    }
}
