package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzemn {
    private final zzems zza;
    private final String zzb;
    private com.google.android.gms.ads.internal.client.zzdh zzc;

    public zzemn(zzems zzemsVar, String str) {
        this.zza = zzemsVar;
        this.zzb = str;
    }

    public final synchronized String zza() {
        com.google.android.gms.ads.internal.client.zzdh zzdhVar;
        try {
            zzdhVar = this.zzc;
        } catch (RemoteException e2) {
            zzcfi.zzl("#007 Could not call remote method.", e2);
            return null;
        }
        return zzdhVar != null ? zzdhVar.zzg() : null;
    }

    public final synchronized String zzb() {
        com.google.android.gms.ads.internal.client.zzdh zzdhVar;
        try {
            zzdhVar = this.zzc;
        } catch (RemoteException e2) {
            zzcfi.zzl("#007 Could not call remote method.", e2);
            return null;
        }
        return zzdhVar != null ? zzdhVar.zzg() : null;
    }

    public final synchronized void zzd(com.google.android.gms.ads.internal.client.zzl zzlVar, int i2) {
        this.zzc = null;
        this.zza.zzb(zzlVar, this.zzb, new zzemt(i2), new zzemm(this));
    }

    public final synchronized boolean zze() {
        return this.zza.zza();
    }
}
