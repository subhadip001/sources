package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcpl implements zzext {
    private final Context zza;
    private final com.google.android.gms.ads.internal.client.zzq zzb;
    private final String zzc;
    private final zzcrb zzd;
    private final zzcpl zze = this;
    private final zzgqh zzf;
    private final zzgqh zzg;
    private final zzgqh zzh;
    private final zzgqh zzi;
    private final zzgqh zzj;
    private final zzgqh zzk;

    public /* synthetic */ zzcpl(zzcrb zzcrbVar, Context context, String str, com.google.android.gms.ads.internal.client.zzq zzqVar, zzcpk zzcpkVar) {
        zzgqh zzgqhVar;
        zzgqh zzgqhVar2;
        zzgqh zzgqhVar3;
        this.zzd = zzcrbVar;
        this.zza = context;
        this.zzb = zzqVar;
        this.zzc = str;
        zzgpu zza = zzgpv.zza(context);
        this.zzf = zza;
        zzgpu zza2 = zzgpv.zza(zzqVar);
        this.zzg = zza2;
        zzgqhVar = zzcrbVar.zzo;
        zzgqh zzc = zzgpt.zzc(new zzemd(zzgqhVar));
        this.zzh = zzc;
        zzgqh zzc2 = zzgpt.zzc(zzemi.zza());
        this.zzi = zzc2;
        zzgqh zzc3 = zzgpt.zzc(zzdgp.zza());
        this.zzj = zzc3;
        zzgqhVar2 = zzcrbVar.zzp;
        zzgqhVar3 = zzcrbVar.zzQ;
        this.zzk = zzgpt.zzc(new zzexr(zza, zzgqhVar2, zza2, zzgqhVar3, zzc, zzc2, zzfca.zza(), zzc3));
    }

    @Override // com.google.android.gms.internal.ads.zzext
    public final zzelj zza() {
        zzcni zzcniVar;
        Context context = this.zza;
        com.google.android.gms.ads.internal.client.zzq zzqVar = this.zzb;
        String str = this.zzc;
        zzexq zzexqVar = (zzexq) this.zzk.zzb();
        zzemc zzemcVar = (zzemc) this.zzh.zzb();
        zzcniVar = this.zzd.zza;
        zzcfo zzd = zzcniVar.zzd();
        zzgqc.zzb(zzd);
        return new zzelj(context, zzqVar, str, zzexqVar, zzemcVar, zzd);
    }
}
