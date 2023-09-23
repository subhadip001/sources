package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzjo {
    private static final zzsb zzt = new zzsb(new Object());
    public final zzci zza;
    public final zzsb zzb;
    public final long zzc;
    public final long zzd;
    public final int zze;
    public final zzgu zzf;
    public final boolean zzg;
    public final zztz zzh;
    public final zzvo zzi;
    public final List zzj;
    public final zzsb zzk;
    public final boolean zzl;
    public final int zzm;
    public final zzbt zzn;
    public final boolean zzo;
    public final boolean zzp;
    public volatile long zzq;
    public volatile long zzr;
    public volatile long zzs;

    public zzjo(zzci zzciVar, zzsb zzsbVar, long j2, long j3, int i2, zzgu zzguVar, boolean z, zztz zztzVar, zzvo zzvoVar, List list, zzsb zzsbVar2, boolean z2, int i3, zzbt zzbtVar, long j4, long j5, long j6, boolean z3, boolean z4) {
        this.zza = zzciVar;
        this.zzb = zzsbVar;
        this.zzc = j2;
        this.zzd = j3;
        this.zze = i2;
        this.zzf = zzguVar;
        this.zzg = z;
        this.zzh = zztzVar;
        this.zzi = zzvoVar;
        this.zzj = list;
        this.zzk = zzsbVar2;
        this.zzl = z2;
        this.zzm = i3;
        this.zzn = zzbtVar;
        this.zzq = j4;
        this.zzr = j5;
        this.zzs = j6;
        this.zzo = z3;
        this.zzp = z4;
    }

    public static zzjo zzh(zzvo zzvoVar) {
        zzci zzciVar = zzci.zza;
        zzsb zzsbVar = zzt;
        return new zzjo(zzciVar, zzsbVar, -9223372036854775807L, 0L, 1, null, false, zztz.zza, zzvoVar, zzfrh.zzo(), zzsbVar, false, 0, zzbt.zza, 0L, 0L, 0L, false, false);
    }

    public static zzsb zzi() {
        return zzt;
    }

    public final zzjo zza(zzsb zzsbVar) {
        return new zzjo(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, zzsbVar, this.zzl, this.zzm, this.zzn, this.zzq, this.zzr, this.zzs, this.zzo, this.zzp);
    }

    public final zzjo zzb(zzsb zzsbVar, long j2, long j3, long j4, long j5, zztz zztzVar, zzvo zzvoVar, List list) {
        return new zzjo(this.zza, zzsbVar, j3, j4, this.zze, this.zzf, this.zzg, zztzVar, zzvoVar, list, this.zzk, this.zzl, this.zzm, this.zzn, this.zzq, j5, j2, this.zzo, this.zzp);
    }

    public final zzjo zzc(boolean z) {
        return new zzjo(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzq, this.zzr, this.zzs, z, this.zzp);
    }

    public final zzjo zzd(boolean z, int i2) {
        return new zzjo(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, z, i2, this.zzn, this.zzq, this.zzr, this.zzs, this.zzo, this.zzp);
    }

    public final zzjo zze(zzgu zzguVar) {
        return new zzjo(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzguVar, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzq, this.zzr, this.zzs, this.zzo, this.zzp);
    }

    public final zzjo zzf(int i2) {
        return new zzjo(this.zza, this.zzb, this.zzc, this.zzd, i2, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzq, this.zzr, this.zzs, this.zzo, this.zzp);
    }

    public final zzjo zzg(zzci zzciVar) {
        return new zzjo(zzciVar, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzq, this.zzr, this.zzs, this.zzo, this.zzp);
    }
}
