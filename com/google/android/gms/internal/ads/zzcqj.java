package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcqj implements zzezm {
    private final zzcrb zza;
    private final zzcqj zzb = this;
    private final zzgqh zzc;
    private final zzgqh zzd;
    private final zzgqh zze;
    private final zzgqh zzf;
    private final zzgqh zzg;
    private final zzgqh zzh;
    private final zzgqh zzi;

    public /* synthetic */ zzcqj(zzcrb zzcrbVar, Context context, String str, com.google.android.gms.ads.internal.client.zzq zzqVar, zzcqi zzcqiVar) {
        zzgqh zzgqhVar;
        zzgqh zzgqhVar2;
        zzgqh zzgqhVar3;
        zzgqh zzgqhVar4;
        zzgqh zzgqhVar5;
        this.zza = zzcrbVar;
        zzgpu zza = zzgpv.zza(context);
        this.zzc = zza;
        zzgpu zza2 = zzgpv.zza(zzqVar);
        this.zzd = zza2;
        zzgpu zza3 = zzgpv.zza(str);
        this.zze = zza3;
        zzgqhVar = zzcrbVar.zzo;
        zzgqh zzc = zzgpt.zzc(new zzemd(zzgqhVar));
        this.zzf = zzc;
        zzgqhVar2 = zzcrbVar.zzaw;
        zzgqh zzc2 = zzgpt.zzc(new zzfak(zzgqhVar2));
        this.zzg = zzc2;
        zzgqhVar3 = zzcrbVar.zzp;
        zzgqhVar4 = zzcrbVar.zzQ;
        zzgqh zzc3 = zzgpt.zzc(new zzezk(zza, zzgqhVar3, zzgqhVar4, zzc, zzc2, zzfca.zza()));
        this.zzh = zzc3;
        zzgqhVar5 = zzcrbVar.zzi;
        this.zzi = zzgpt.zzc(new zzeml(zza, zza2, zza3, zzc3, zzc, zzc2, zzgqhVar5));
    }

    @Override // com.google.android.gms.internal.ads.zzezm
    public final zzemk zza() {
        return (zzemk) this.zzi.zzb();
    }
}
