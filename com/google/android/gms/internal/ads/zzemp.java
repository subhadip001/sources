package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzemp {
    private final zzdnr zza;
    private final zzemc zzb;
    private final zzdbv zzc;

    public zzemp(zzdnr zzdnrVar, zzfgo zzfgoVar) {
        this.zza = zzdnrVar;
        final zzemc zzemcVar = new zzemc(zzfgoVar);
        this.zzb = zzemcVar;
        final zzbra zzg = zzdnrVar.zzg();
        this.zzc = new zzdbv() { // from class: com.google.android.gms.internal.ads.zzemo
            @Override // com.google.android.gms.internal.ads.zzdbv
            public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
                zzemc zzemcVar2 = zzemc.this;
                zzbra zzbraVar = zzg;
                zzemcVar2.zza(zzeVar);
                if (zzbraVar != null) {
                    try {
                        zzbraVar.zzf(zzeVar);
                    } catch (RemoteException e2) {
                        zzcfi.zzl("#007 Could not call remote method.", e2);
                    }
                }
                if (zzbraVar != null) {
                    try {
                        zzbraVar.zze(zzeVar.zza);
                    } catch (RemoteException e3) {
                        zzcfi.zzl("#007 Could not call remote method.", e3);
                    }
                }
            }
        };
    }

    public final zzdbv zza() {
        return this.zzc;
    }

    public final zzddg zzb() {
        return this.zzb;
    }

    public final zzdlo zzc() {
        return new zzdlo(this.zza, this.zzb.zzc());
    }

    public final zzemc zzd() {
        return this.zzb;
    }

    public final void zze(com.google.android.gms.ads.internal.client.zzbf zzbfVar) {
        this.zzb.zze(zzbfVar);
    }
}
