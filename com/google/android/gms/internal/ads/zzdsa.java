package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdsa implements Callable {
    private final com.google.android.gms.ads.internal.zza zza;
    private final zzclu zzb;
    private final Context zzc;
    private final zzdwg zzd;
    private final zzfgo zze;
    private final zzeen zzf;
    private final Executor zzg;
    private final zzaoc zzh;
    private final zzcfo zzi;
    private final zzfig zzj;

    public zzdsa(Context context, Executor executor, zzaoc zzaocVar, zzcfo zzcfoVar, com.google.android.gms.ads.internal.zza zzaVar, zzclu zzcluVar, zzeen zzeenVar, zzfig zzfigVar, zzdwg zzdwgVar, zzfgo zzfgoVar) {
        this.zzc = context;
        this.zzg = executor;
        this.zzh = zzaocVar;
        this.zzi = zzcfoVar;
        this.zza = zzaVar;
        this.zzb = zzcluVar;
        this.zzf = zzeenVar;
        this.zzj = zzfigVar;
        this.zzd = zzdwgVar;
        this.zze = zzfgoVar;
    }

    public static /* bridge */ /* synthetic */ Context zza(zzdsa zzdsaVar) {
        return zzdsaVar.zzc;
    }

    public static /* bridge */ /* synthetic */ zzaoc zzb(zzdsa zzdsaVar) {
        return zzdsaVar.zzh;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.zza zzc(zzdsa zzdsaVar) {
        return zzdsaVar.zza;
    }

    public static /* bridge */ /* synthetic */ zzcfo zzd(zzdsa zzdsaVar) {
        return zzdsaVar.zzi;
    }

    public static /* bridge */ /* synthetic */ zzclu zze(zzdsa zzdsaVar) {
        return zzdsaVar.zzb;
    }

    public static /* bridge */ /* synthetic */ zzdwg zzf(zzdsa zzdsaVar) {
        return zzdsaVar.zzd;
    }

    public static /* bridge */ /* synthetic */ zzeen zzg(zzdsa zzdsaVar) {
        return zzdsaVar.zzf;
    }

    public static /* bridge */ /* synthetic */ zzfgo zzh(zzdsa zzdsaVar) {
        return zzdsaVar.zze;
    }

    public static /* bridge */ /* synthetic */ zzfig zzi(zzdsa zzdsaVar) {
        return zzdsaVar.zzj;
    }

    public static /* bridge */ /* synthetic */ Executor zzj(zzdsa zzdsaVar) {
        return zzdsaVar.zzg;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zzdsd zzdsdVar = new zzdsd(this);
        zzdsdVar.zzh();
        return zzdsdVar;
    }
}
