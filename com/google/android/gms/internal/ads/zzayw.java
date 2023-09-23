package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzayw {
    private final ExecutorService zza = zzazn.zzl("Loader:ExtractorMediaPeriod");
    private zzayt zzb;
    private IOException zzc;

    public zzayw(String str) {
    }

    public final long zza(zzayu zzayuVar, zzays zzaysVar, int i2) {
        Looper myLooper = Looper.myLooper();
        zzayy.zze(myLooper != null);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new zzayt(this, myLooper, zzayuVar, zzaysVar, i2, elapsedRealtime).zzc(0L);
        return elapsedRealtime;
    }

    public final void zzf() {
        this.zzb.zza(false);
    }

    public final void zzg(int i2) {
        IOException iOException = this.zzc;
        if (iOException != null) {
            throw iOException;
        }
        zzayt zzaytVar = this.zzb;
        if (zzaytVar != null) {
            zzaytVar.zzb(zzaytVar.zza);
        }
    }

    public final void zzh(Runnable runnable) {
        zzayt zzaytVar = this.zzb;
        if (zzaytVar != null) {
            zzaytVar.zza(true);
        }
        this.zza.execute(runnable);
        this.zza.shutdown();
    }

    public final boolean zzi() {
        return this.zzb != null;
    }
}
