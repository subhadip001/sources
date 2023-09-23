package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdto {
    private final zzclu zza;
    private final Context zzb;
    private final zzaoc zzc;
    private final zzbix zzd;
    private final zzcfo zze;
    private final com.google.android.gms.ads.internal.zza zzf;
    private final zzbdl zzg;
    private final zzdeh zzh;

    public zzdto(zzclu zzcluVar, Context context, zzaoc zzaocVar, zzbix zzbixVar, zzcfo zzcfoVar, com.google.android.gms.ads.internal.zza zzaVar, zzbdl zzbdlVar, zzdeh zzdehVar) {
        this.zza = zzcluVar;
        this.zzb = context;
        this.zzc = zzaocVar;
        this.zzd = zzbixVar;
        this.zze = zzcfoVar;
        this.zzf = zzaVar;
        this.zzg = zzbdlVar;
        this.zzh = zzdehVar;
    }

    public final zzcli zza(com.google.android.gms.ads.internal.client.zzq zzqVar, zzfbg zzfbgVar, zzfbj zzfbjVar) {
        return zzclu.zza(this.zzb, zzcmx.zzc(zzqVar), zzqVar.zza, false, false, this.zzc, this.zzd, this.zze, null, new zzdtd(this), this.zzf, this.zzg, zzfbgVar, zzfbjVar);
    }
}
