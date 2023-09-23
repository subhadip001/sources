package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzkj {
    public final long zza;
    public final zzci zzb;
    public final int zzc;
    public final zzsb zzd;
    public final long zze;
    public final zzci zzf;
    public final int zzg;
    public final zzsb zzh;
    public final long zzi;
    public final long zzj;

    public zzkj(long j2, zzci zzciVar, int i2, zzsb zzsbVar, long j3, zzci zzciVar2, int i3, zzsb zzsbVar2, long j4, long j5) {
        this.zza = j2;
        this.zzb = zzciVar;
        this.zzc = i2;
        this.zzd = zzsbVar;
        this.zze = j3;
        this.zzf = zzciVar2;
        this.zzg = i3;
        this.zzh = zzsbVar2;
        this.zzi = j4;
        this.zzj = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzkj.class == obj.getClass()) {
            zzkj zzkjVar = (zzkj) obj;
            if (this.zza == zzkjVar.zza && this.zzc == zzkjVar.zzc && this.zze == zzkjVar.zze && this.zzg == zzkjVar.zzg && this.zzi == zzkjVar.zzi && this.zzj == zzkjVar.zzj && zzfoo.zza(this.zzb, zzkjVar.zzb) && zzfoo.zza(this.zzd, zzkjVar.zzd) && zzfoo.zza(this.zzf, zzkjVar.zzf) && zzfoo.zza(this.zzh, zzkjVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.zza), this.zzb, Integer.valueOf(this.zzc), this.zzd, Long.valueOf(this.zze), this.zzf, Integer.valueOf(this.zzg), this.zzh, Long.valueOf(this.zzi), Long.valueOf(this.zzj)});
    }
}
