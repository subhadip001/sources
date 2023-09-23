package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzedr {
    private int zza = 0;
    private long zzb = 0;
    private long zzc = 0;
    private long zzd = 0;
    private final Object zze = new Object();
    private final Object zzf = new Object();
    private final Object zzg = new Object();
    private final Object zzh = new Object();

    public final int zza() {
        int i2;
        synchronized (this.zze) {
            i2 = this.zza;
        }
        return i2;
    }

    public final synchronized long zzb() {
        long j2;
        synchronized (this.zzh) {
            j2 = this.zzd;
        }
        return j2;
    }

    public final synchronized long zzc() {
        long j2;
        synchronized (this.zzg) {
            j2 = this.zzc;
        }
        return j2;
    }

    public final long zzd() {
        long j2;
        synchronized (this.zzf) {
            j2 = this.zzb;
        }
        return j2;
    }

    public final synchronized void zze(long j2) {
        synchronized (this.zzh) {
            this.zzd = j2;
        }
    }

    public final synchronized void zzf(long j2) {
        synchronized (this.zzg) {
            this.zzc = j2;
        }
    }

    public final void zzg(int i2) {
        synchronized (this.zze) {
            this.zza = i2;
        }
    }

    public final void zzh(long j2) {
        synchronized (this.zzf) {
            this.zzb = j2;
        }
    }
}
