package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbup extends com.google.android.gms.ads.internal.client.zzdj {
    private final Object zza = new Object();
    private volatile com.google.android.gms.ads.internal.client.zzdn zzb;

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final float zze() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final float zzf() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final float zzg() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final int zzh() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final com.google.android.gms.ads.internal.client.zzdn zzi() {
        com.google.android.gms.ads.internal.client.zzdn zzdnVar;
        synchronized (this.zza) {
            zzdnVar = this.zzb;
        }
        return zzdnVar;
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
            this.zzb = zzdnVar;
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
