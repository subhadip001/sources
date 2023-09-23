package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdqh implements zzgpu {
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
    private final zzgqh zzk;
    private final zzgqh zzl;
    private final zzgqh zzm;
    private final zzgqh zzn;
    private final zzgqh zzo;
    private final zzgqh zzp;

    public zzdqh(zzgqh zzgqhVar, zzgqh zzgqhVar2, zzgqh zzgqhVar3, zzgqh zzgqhVar4, zzgqh zzgqhVar5, zzgqh zzgqhVar6, zzgqh zzgqhVar7, zzgqh zzgqhVar8, zzgqh zzgqhVar9, zzgqh zzgqhVar10, zzgqh zzgqhVar11, zzgqh zzgqhVar12, zzgqh zzgqhVar13, zzgqh zzgqhVar14, zzgqh zzgqhVar15, zzgqh zzgqhVar16) {
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
        this.zzk = zzgqhVar11;
        this.zzl = zzgqhVar12;
        this.zzm = zzgqhVar13;
        this.zzn = zzgqhVar14;
        this.zzo = zzgqhVar15;
        this.zzp = zzgqhVar16;
    }

    @Override // com.google.android.gms.internal.ads.zzgqh
    /* renamed from: zza */
    public final zzdqg zzb() {
        Context context = (Context) this.zza.zzb();
        zzdpp zzdppVar = (zzdpp) this.zzb.zzb();
        zzaoc zzaocVar = (zzaoc) this.zzc.zzb();
        zzcfo zza = ((zzcnu) this.zzd).zza();
        com.google.android.gms.ads.internal.zza zza2 = zzcrd.zza();
        zzbdl zzbdlVar = (zzbdl) this.zzf.zzb();
        zzfvk zzfvkVar = zzcfv.zza;
        zzgqc.zzb(zzfvkVar);
        return new zzdqg(context, zzdppVar, zzaocVar, zza, zza2, zzbdlVar, zzfvkVar, ((zzdbj) this.zzh).zza(), (zzdqy) this.zzi.zzb(), (zzdto) this.zzj.zzb(), (ScheduledExecutorService) this.zzk.zzb(), (zzdwg) this.zzl.zzb(), (zzfgo) this.zzm.zzb(), (zzfig) this.zzn.zzb(), (zzeen) this.zzo.zzb(), (zzdsj) this.zzp.zzb());
    }
}
