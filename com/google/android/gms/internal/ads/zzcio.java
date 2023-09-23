package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.crashlytics.internal.metadata.LogFileManager;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcio {
    private final zzayl zza = new zzayl(true, LogFileManager.MAX_LOG_SIZE);
    private long zzb = 15000000;
    private long zzc = 30000000;
    private long zzd = 2500000;
    private long zze = 5000000;
    private int zzf;
    private boolean zzg;

    public final void zza() {
        zze(false);
    }

    public final void zzb() {
        zze(true);
    }

    public final void zzc() {
        zze(true);
    }

    public final void zzd(zzarx[] zzarxVarArr, zzaxp zzaxpVar, zzayb zzaybVar) {
        this.zzf = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            if (zzaybVar.zza(i2) != null) {
                this.zzf = zzazn.zzf(zzarxVarArr[i2].zzc()) + this.zzf;
            }
        }
        this.zza.zzf(this.zzf);
    }

    @VisibleForTesting
    public final void zze(boolean z) {
        this.zzf = 0;
        this.zzg = false;
        if (z) {
            this.zza.zze();
        }
    }

    public final synchronized void zzf(int i2) {
        this.zzd = i2 * 1000;
    }

    public final synchronized void zzg(int i2) {
        this.zze = i2 * 1000;
    }

    public final synchronized void zzh(int i2) {
        this.zzc = i2 * 1000;
    }

    public final synchronized void zzi(int i2) {
        this.zzb = i2 * 1000;
    }

    public final synchronized boolean zzj(long j2) {
        boolean z;
        z = true;
        char c = j2 > this.zzc ? (char) 0 : j2 < this.zzb ? (char) 2 : (char) 1;
        int zza = this.zza.zza();
        int i2 = this.zzf;
        if (c != 2 && (c != 1 || !this.zzg || zza >= i2)) {
            z = false;
        }
        this.zzg = z;
        return z;
    }

    public final synchronized boolean zzk(long j2, boolean z) {
        long j3;
        j3 = z ? this.zze : this.zzd;
        return j3 <= 0 || j2 >= j3;
    }

    public final zzayl zzl() {
        return this.zza;
    }
}
