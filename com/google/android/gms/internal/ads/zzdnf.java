package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdnf extends com.google.android.gms.ads.internal.client.zzdj {
    private final Object zza = new Object();
    private final com.google.android.gms.ads.internal.client.zzdk zzb;
    private final zzbuo zzc;

    public zzdnf(com.google.android.gms.ads.internal.client.zzdk zzdkVar, zzbuo zzbuoVar) {
        this.zzb = zzdkVar;
        this.zzc = zzbuoVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final float zze() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final float zzf() {
        zzbuo zzbuoVar = this.zzc;
        if (zzbuoVar != null) {
            return zzbuoVar.zzg();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final float zzg() {
        zzbuo zzbuoVar = this.zzc;
        if (zzbuoVar != null) {
            return zzbuoVar.zzh();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final int zzh() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final com.google.android.gms.ads.internal.client.zzdn zzi() {
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.client.zzdk zzdkVar = this.zzb;
            if (zzdkVar != null) {
                return zzdkVar.zzi();
            }
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final void zzj(boolean z) {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final void zzk() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final void zzl() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final void zzm(com.google.android.gms.ads.internal.client.zzdn zzdnVar) {
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.client.zzdk zzdkVar = this.zzb;
            if (zzdkVar != null) {
                zzdkVar.zzm(zzdnVar);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final void zzn() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final boolean zzo() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final boolean zzp() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final boolean zzq() {
        throw new RemoteException();
    }
}
