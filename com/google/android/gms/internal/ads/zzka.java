package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzka implements zzjc {
    private final zzcx zza;
    private boolean zzb;
    private long zzc;
    private long zzd;
    private zzbt zze = zzbt.zza;

    public zzka(zzcx zzcxVar) {
        this.zza = zzcxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzjc
    public final long zza() {
        long zza;
        long j2 = this.zzc;
        if (this.zzb) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.zzd;
            zzbt zzbtVar = this.zze;
            if (zzbtVar.zzc == 1.0f) {
                zza = zzeg.zzv(elapsedRealtime);
            } else {
                zza = zzbtVar.zza(elapsedRealtime);
            }
            return j2 + zza;
        }
        return j2;
    }

    public final void zzb(long j2) {
        this.zzc = j2;
        if (this.zzb) {
            this.zzd = SystemClock.elapsedRealtime();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzjc
    public final zzbt zzc() {
        return this.zze;
    }

    public final void zzd() {
        if (this.zzb) {
            return;
        }
        this.zzd = SystemClock.elapsedRealtime();
        this.zzb = true;
    }

    public final void zze() {
        if (this.zzb) {
            zzb(zza());
            this.zzb = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzjc
    public final void zzg(zzbt zzbtVar) {
        if (this.zzb) {
            zzb(zza());
        }
        this.zze = zzbtVar;
    }
}
