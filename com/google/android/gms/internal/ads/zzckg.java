package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.crashlytics.internal.metadata.LogFileManager;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzckg implements zzjb {
    private final zzvw zza = new zzvw(true, LogFileManager.MAX_LOG_SIZE);
    private long zzb = 15000000;
    private long zzc = 30000000;
    private long zzd = 2500000;
    private long zze = 5000000;
    private int zzf;
    private boolean zzg;

    @Override // com.google.android.gms.internal.ads.zzjb
    public final long zza() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzjb
    public final void zzb() {
        zzj(false);
    }

    @Override // com.google.android.gms.internal.ads.zzjb
    public final void zzc() {
        zzj(true);
    }

    @Override // com.google.android.gms.internal.ads.zzjb
    public final void zzd() {
        zzj(true);
    }

    @Override // com.google.android.gms.internal.ads.zzjb
    public final void zze(zzju[] zzjuVarArr, zztz zztzVar, zzvh[] zzvhVarArr) {
        int i2 = 0;
        this.zzf = 0;
        while (true) {
            int length = zzjuVarArr.length;
            if (i2 < 2) {
                if (zzvhVarArr[i2] != null) {
                    this.zzf += zzjuVarArr[i2].zzb() != 1 ? 131072000 : 13107200;
                }
                i2++;
            } else {
                this.zza.zzf(this.zzf);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzjb
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzjb
    public final boolean zzg(long j2, long j3, float f2) {
        boolean z = true;
        char c = j3 > this.zzc ? (char) 0 : j3 < this.zzb ? (char) 2 : (char) 1;
        int zza = this.zza.zza();
        int i2 = this.zzf;
        if (c != 2 && (c != 1 || !this.zzg || zza >= i2)) {
            z = false;
        }
        this.zzg = z;
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzjb
    public final boolean zzh(long j2, float f2, boolean z, long j3) {
        long j4 = z ? this.zze : this.zzd;
        return j4 <= 0 || j2 >= j4;
    }

    @Override // com.google.android.gms.internal.ads.zzjb
    public final zzvw zzi() {
        return this.zza;
    }

    @VisibleForTesting
    public final void zzj(boolean z) {
        this.zzf = 0;
        this.zzg = false;
        if (z) {
            this.zza.zze();
        }
    }

    public final synchronized void zzk(int i2) {
        this.zzd = i2 * 1000;
    }

    public final synchronized void zzl(int i2) {
        this.zze = i2 * 1000;
    }

    public final synchronized void zzm(int i2) {
        this.zzc = i2 * 1000;
    }

    public final synchronized void zzn(int i2) {
        this.zzb = i2 * 1000;
    }
}
