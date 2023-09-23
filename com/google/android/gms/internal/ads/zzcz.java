package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcz {
    private final zzcx zza;
    private boolean zzb;

    public zzcz() {
        throw null;
    }

    public zzcz(zzcx zzcxVar) {
        this.zza = zzcxVar;
    }

    public final synchronized void zza() {
        while (!this.zzb) {
            wait();
        }
    }

    public final synchronized void zzb() {
        boolean z = false;
        while (!this.zzb) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean zzc() {
        boolean z;
        z = this.zzb;
        this.zzb = false;
        return z;
    }

    public final synchronized boolean zzd() {
        return this.zzb;
    }

    public final synchronized boolean zze() {
        if (this.zzb) {
            return false;
        }
        this.zzb = true;
        notifyAll();
        return true;
    }
}
