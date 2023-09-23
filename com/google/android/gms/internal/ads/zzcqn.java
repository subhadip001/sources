package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcqn implements zzfba {
    private final zzcrb zza;
    private final zzcqn zzb = this;
    private final zzgqh zzc;
    private final zzgqh zzd;
    private final zzgqh zze;
    private final zzgqh zzf;
    private final zzgqh zzg;
    private final zzgqh zzh;
    private final zzgqh zzi;
    private final zzgqh zzj;

    public /* synthetic */ zzcqn(zzcrb zzcrbVar, Context context, String str, zzcqm zzcqmVar) {
        zzgqh zzgqhVar;
        zzgqh zzgqhVar2;
        zzgqh zzgqhVar3;
        zzgqh zzgqhVar4;
        zzgqh zzgqhVar5;
        zzgqh zzgqhVar6;
        this.zza = zzcrbVar;
        zzgpu zza = zzgpv.zza(context);
        this.zzc = zza;
        zzgqhVar = zzcrbVar.zzaw;
        zzgqhVar2 = zzcrbVar.zzax;
        zzeza zzezaVar = new zzeza(zza, zzgqhVar, zzgqhVar2);
        this.zzd = zzezaVar;
        zzgqhVar3 = zzcrbVar.zzaw;
        zzgqh zzc = zzgpt.zzc(new zzfak(zzgqhVar3));
        this.zze = zzc;
        zzgqh zzc2 = zzgpt.zzc(zzfbv.zza());
        this.zzf = zzc2;
        zzgqhVar4 = zzcrbVar.zzp;
        zzgqhVar5 = zzcrbVar.zzQ;
        zzgqh zzc3 = zzgpt.zzc(new zzfau(zza, zzgqhVar4, zzgqhVar5, zzezaVar, zzc, zzfca.zza(), zzc2));
        this.zzg = zzc3;
        this.zzh = zzgpt.zzc(new zzfbe(zzc3, zzc, zzc2));
        zzgpu zzc4 = zzgpv.zzc(str);
        this.zzi = zzc4;
        zzgqhVar6 = zzcrbVar.zzi;
        this.zzj = zzgpt.zzc(new zzfay(zzc4, zzc3, zza, zzc, zzc2, zzgqhVar6));
    }

    @Override // com.google.android.gms.internal.ads.zzfba
    public final zzfax zza() {
        return (zzfax) this.zzj.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzfba
    public final zzfbd zzb() {
        return (zzfbd) this.zzh.zzb();
    }
}
