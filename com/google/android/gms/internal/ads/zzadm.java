package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzadm implements zzadr {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;

    private zzadm(long[] jArr, long[] jArr2, long j2) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j2 == -9223372036854775807L ? zzeg.zzv(jArr2[jArr2.length - 1]) : j2;
    }

    public static zzadm zza(long j2, zzacg zzacgVar, long j3) {
        int length = zzacgVar.zzd.length;
        int i2 = length + 1;
        long[] jArr = new long[i2];
        long[] jArr2 = new long[i2];
        jArr[0] = j2;
        long j4 = 0;
        jArr2[0] = 0;
        for (int i3 = 1; i3 <= length; i3++) {
            int i4 = i3 - 1;
            j2 += zzacgVar.zzb + zzacgVar.zzd[i4];
            j4 += zzacgVar.zzc + zzacgVar.zze[i4];
            jArr[i3] = j2;
            jArr2[i3] = j4;
        }
        return new zzadm(jArr, jArr2, j3);
    }

    private static Pair zzd(long j2, long[] jArr, long[] jArr2) {
        int zzd = zzeg.zzd(jArr, j2, true, true);
        long j3 = jArr[zzd];
        long j4 = jArr2[zzd];
        int i2 = zzd + 1;
        if (i2 == jArr.length) {
            return Pair.create(Long.valueOf(j3), Long.valueOf(j4));
        }
        long j5 = jArr[i2];
        return Pair.create(Long.valueOf(j2), Long.valueOf(((long) ((j5 == j3 ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : (j2 - j3) / (j5 - j3)) * (jArr2[i2] - j4))) + j4));
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final long zzb() {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final long zzc(long j2) {
        return zzeg.zzv(((Long) zzd(j2, this.zza, this.zzb).second).longValue());
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final long zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final zzzt zzg(long j2) {
        Pair zzd = zzd(zzeg.zzz(zzeg.zzr(j2, 0L, this.zzc)), this.zzb, this.zza);
        long longValue = ((Long) zzd.first).longValue();
        zzzw zzzwVar = new zzzw(zzeg.zzv(longValue), ((Long) zzd.second).longValue());
        return new zzzt(zzzwVar, zzzwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final boolean zzh() {
        return true;
    }
}
