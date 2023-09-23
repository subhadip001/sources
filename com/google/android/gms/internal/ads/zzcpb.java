package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcpb implements zzewf {
    private final zzcrb zza;
    private final zzcpb zzb = this;
    private final zzgqh zzc;
    private final zzgqh zzd;
    private final zzgqh zze;
    private final zzgqh zzf;
    private final zzgqh zzg;
    private final zzgqh zzh;
    private final zzgqh zzi;
    private final zzgqh zzj;
    private final zzgqh zzk;

    public /* synthetic */ zzcpb(zzcrb zzcrbVar, Context context, String str, zzcpa zzcpaVar) {
        zzgqh zzgqhVar;
        zzgqh zzgqhVar2;
        zzgqh zzgqhVar3;
        zzgqh zzgqhVar4;
        zzgqh zzgqhVar5;
        zzgqh zzgqhVar6;
        zzgqh zzgqhVar7;
        zzgqh zzgqhVar8;
        zzgqh zzgqhVar9;
        zzgqh zzgqhVar10;
        zzgqh zzgqhVar11;
        zzgqh zzgqhVar12;
        zzgqh zzgqhVar13;
        zzgqh zzgqhVar14;
        zzgqh zzgqhVar15;
        this.zza = zzcrbVar;
        zzgpu zza = zzgpv.zza(context);
        this.zzc = zza;
        zzgpu zza2 = zzgpv.zza(str);
        this.zzd = zza2;
        zzgqhVar = zzcrbVar.zzaw;
        zzgqhVar2 = zzcrbVar.zzax;
        zzeyz zzeyzVar = new zzeyz(zza, zzgqhVar, zzgqhVar2);
        this.zze = zzeyzVar;
        zzgqhVar3 = zzcrbVar.zzaw;
        zzgqh zzc = zzgpt.zzc(new zzexd(zzgqhVar3));
        this.zzf = zzc;
        zzgqhVar4 = zzcrbVar.zzp;
        zzgqhVar5 = zzcrbVar.zzQ;
        zzfca zza3 = zzfca.zza();
        zzgqhVar6 = zzcrbVar.zzi;
        zzgqh zzc2 = zzgpt.zzc(new zzevx(zza, zzgqhVar4, zzgqhVar5, zzeyzVar, zzc, zza3, zzgqhVar6));
        this.zzg = zzc2;
        zzgqhVar7 = zzcrbVar.zzQ;
        zzgqhVar8 = zzcrbVar.zzi;
        this.zzh = zzgpt.zzc(new zzewd(zzgqhVar7, zza, zza2, zzc2, zzc, zzgqhVar8));
        zzgqhVar9 = zzcrbVar.zzaw;
        zzgqhVar10 = zzcrbVar.zzax;
        zzeyy zzeyyVar = new zzeyy(zza, zzgqhVar9, zzgqhVar10);
        this.zzi = zzeyyVar;
        zzgqhVar11 = zzcrbVar.zzp;
        zzgqhVar12 = zzcrbVar.zzQ;
        zzfca zza4 = zzfca.zza();
        zzgqhVar13 = zzcrbVar.zzi;
        zzgqh zzc3 = zzgpt.zzc(new zzexf(zza, zzgqhVar11, zzgqhVar12, zzeyyVar, zzc, zza4, zzgqhVar13));
        this.zzj = zzc3;
        zzgqhVar14 = zzcrbVar.zzQ;
        zzgqhVar15 = zzcrbVar.zzi;
        this.zzk = zzgpt.zzc(new zzexl(zzgqhVar14, zza, zza2, zzc3, zzc, zzgqhVar15));
    }

    @Override // com.google.android.gms.internal.ads.zzewf
    public final zzewc zza() {
        return (zzewc) this.zzh.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzewf
    public final zzexk zzb() {
        return (zzexk) this.zzk.zzb();
    }
}
