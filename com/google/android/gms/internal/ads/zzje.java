package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzje {
    public final zzsb zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;

    public zzje(zzsb zzsbVar, long j2, long j3, long j4, long j5, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = true;
        zzcw.zzd(!z4 || z2);
        if (z3 && !z2) {
            z5 = false;
        }
        zzcw.zzd(z5);
        this.zza = zzsbVar;
        this.zzb = j2;
        this.zzc = j3;
        this.zzd = j4;
        this.zze = j5;
        this.zzf = false;
        this.zzg = z2;
        this.zzh = z3;
        this.zzi = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzje.class == obj.getClass()) {
            zzje zzjeVar = (zzje) obj;
            if (this.zzb == zzjeVar.zzb && this.zzc == zzjeVar.zzc && this.zzd == zzjeVar.zzd && this.zze == zzjeVar.zze && this.zzg == zzjeVar.zzg && this.zzh == zzjeVar.zzh && this.zzi == zzjeVar.zzi && zzeg.zzS(this.zza, zzjeVar.zza)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.zza.hashCode() + 527) * 31) + ((int) this.zzb)) * 31) + ((int) this.zzc)) * 31) + ((int) this.zzd)) * 31) + ((int) this.zze)) * 961) + (this.zzg ? 1 : 0)) * 31) + (this.zzh ? 1 : 0)) * 31) + (this.zzi ? 1 : 0);
    }

    public final zzje zza(long j2) {
        return j2 == this.zzc ? this : new zzje(this.zza, this.zzb, j2, this.zzd, this.zze, false, this.zzg, this.zzh, this.zzi);
    }

    public final zzje zzb(long j2) {
        return j2 == this.zzb ? this : new zzje(this.zza, j2, this.zzc, this.zzd, this.zze, false, this.zzg, this.zzh, this.zzi);
    }
}
