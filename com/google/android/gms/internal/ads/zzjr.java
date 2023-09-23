package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzjr {
    private final zzjq zza;
    private final zzjp zzb;
    private final zzcx zzc;
    private final zzci zzd;
    private int zze;
    private Object zzf;
    private final Looper zzg;
    private final int zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    public zzjr(zzjp zzjpVar, zzjq zzjqVar, zzci zzciVar, int i2, zzcx zzcxVar, Looper looper) {
        this.zzb = zzjpVar;
        this.zza = zzjqVar;
        this.zzd = zzciVar;
        this.zzg = looper;
        this.zzc = zzcxVar;
        this.zzh = i2;
    }

    public final int zza() {
        return this.zze;
    }

    public final Looper zzb() {
        return this.zzg;
    }

    public final zzjq zzc() {
        return this.zza;
    }

    public final zzjr zzd() {
        zzcw.zzf(!this.zzi);
        this.zzi = true;
        this.zzb.zzm(this);
        return this;
    }

    public final zzjr zze(Object obj) {
        zzcw.zzf(!this.zzi);
        this.zzf = obj;
        return this;
    }

    public final zzjr zzf(int i2) {
        zzcw.zzf(!this.zzi);
        this.zze = i2;
        return this;
    }

    public final Object zzg() {
        return this.zzf;
    }

    public final synchronized void zzh(boolean z) {
        this.zzj = z | this.zzj;
        this.zzk = true;
        notifyAll();
    }

    public final synchronized boolean zzi(long j2) {
        zzcw.zzf(this.zzi);
        zzcw.zzf(this.zzg.getThread() != Thread.currentThread());
        long elapsedRealtime = SystemClock.elapsedRealtime() + j2;
        while (!this.zzk) {
            if (j2 > 0) {
                wait(j2);
                j2 = elapsedRealtime - SystemClock.elapsedRealtime();
            } else {
                throw new TimeoutException("Message delivery timed out.");
            }
        }
        return this.zzj;
    }

    public final synchronized boolean zzj() {
        return false;
    }
}
