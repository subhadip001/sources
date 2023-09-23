package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class zzas {
    public final String zza;
    public final String zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final long zzf;
    public final long zzg;
    public final Long zzh;
    public final Long zzi;
    public final Long zzj;
    public final Boolean zzk;

    public zzas(String str, String str2, long j2, long j3, long j4, long j5, long j6, Long l2, Long l3, Long l4, Boolean bool) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkArgument(j2 >= 0);
        Preconditions.checkArgument(j3 >= 0);
        Preconditions.checkArgument(j4 >= 0);
        Preconditions.checkArgument(j6 >= 0);
        this.zza = str;
        this.zzb = str2;
        this.zzc = j2;
        this.zzd = j3;
        this.zze = j4;
        this.zzf = j5;
        this.zzg = j6;
        this.zzh = l2;
        this.zzi = l3;
        this.zzj = l4;
        this.zzk = bool;
    }

    public final zzas zza(Long l2, Long l3, Boolean bool) {
        return new zzas(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, l2, l3, (bool == null || bool.booleanValue()) ? bool : null);
    }

    public final zzas zzb(long j2, long j3) {
        return new zzas(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, j2, Long.valueOf(j3), this.zzi, this.zzj, this.zzk);
    }

    public final zzas zzc(long j2) {
        return new zzas(this.zza, this.zzb, this.zzc, this.zzd, this.zze, j2, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk);
    }
}
