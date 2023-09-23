package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzduk implements zzgpu {
    private final zzgqh zza;
    private final zzgqh zzb;
    private final zzgqh zzc;
    private final zzgqh zzd;
    private final zzgqh zze;

    public zzduk(zzgqh zzgqhVar, zzgqh zzgqhVar2, zzgqh zzgqhVar3, zzgqh zzgqhVar4, zzgqh zzgqhVar5) {
        this.zza = zzgqhVar;
        this.zzb = zzgqhVar2;
        this.zzc = zzgqhVar3;
        this.zzd = zzgqhVar4;
        this.zze = zzgqhVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzgqh
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza = ((zzcnk) this.zza).zza();
        final String zzb = ((zzeac) this.zzb).zzb();
        zzcfo zza2 = ((zzcnu) this.zzc).zza();
        final zzbdv zzbdvVar = (zzbdv) this.zzd.zzb();
        final String str = (String) this.zze.zzb();
        zzbdl zzbdlVar = new zzbdl(new zzbdr(zza));
        zzbgk zza3 = zzbgl.zza();
        zza3.zza(zza2.zzb);
        zza3.zzc(zza2.zzc);
        zza3.zzb(true != zza2.zzd ? 2 : 0);
        final zzbgl zzbglVar = (zzbgl) zza3.zzaj();
        zzbdlVar.zzb(new zzbdk() { // from class: com.google.android.gms.internal.ads.zzduj
            @Override // com.google.android.gms.internal.ads.zzbdk
            public final void zza(zzbfa zzbfaVar) {
                zzbdv zzbdvVar2 = zzbdv.this;
                String str2 = zzb;
                zzbgl zzbglVar2 = zzbglVar;
                String str3 = str;
                zzbdw zzbdwVar = (zzbdw) zzbfaVar.zza().zzax();
                zzbdwVar.zza(zzbdvVar2);
                zzbfaVar.zze(zzbdwVar);
                zzbes zzbesVar = (zzbes) zzbfaVar.zzb().zzax();
                zzbesVar.zza(str2);
                zzbesVar.zzb(zzbglVar2);
                zzbfaVar.zzg(zzbesVar);
                zzbfaVar.zzh(str3);
            }
        });
        return zzbdlVar;
    }
}
