package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzazj implements zzazc {
    private boolean zza;
    private long zzb;
    private long zzc;
    private zzarw zzd = zzarw.zza;

    @Override // com.google.android.gms.internal.ads.zzazc
    public final long zzI() {
        long zza;
        long j2 = this.zzb;
        if (this.zza) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.zzc;
            zzarw zzarwVar = this.zzd;
            if (zzarwVar.zzb == 1.0f) {
                zza = zzard.zza(elapsedRealtime);
            } else {
                zza = zzarwVar.zza(elapsedRealtime);
            }
            return j2 + zza;
        }
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final zzarw zzJ() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final zzarw zzK(zzarw zzarwVar) {
        if (this.zza) {
            zza(zzI());
        }
        this.zzd = zzarwVar;
        return zzarwVar;
    }

    public final void zza(long j2) {
        this.zzb = j2;
        if (this.zza) {
            this.zzc = SystemClock.elapsedRealtime();
        }
    }

    public final void zzb() {
        if (this.zza) {
            return;
        }
        this.zzc = SystemClock.elapsedRealtime();
        this.zza = true;
    }

    public final void zzc() {
        if (this.zza) {
            zza(zzI());
            this.zza = false;
        }
    }

    public final void zzd(zzazc zzazcVar) {
        zza(zzazcVar.zzI());
        this.zzd = zzazcVar.zzJ();
    }
}
