package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzee {
    private long zza;
    private long zzb;
    private long zzc;
    private final ThreadLocal zzd = new ThreadLocal();

    public zzee(long j2) {
        zzf(0L);
    }

    public final synchronized long zza(long j2) {
        if (this.zzb == -9223372036854775807L) {
            long j3 = this.zza;
            if (j3 == 9223372036854775806L) {
                Long l2 = (Long) this.zzd.get();
                Objects.requireNonNull(l2);
                j3 = l2.longValue();
            }
            this.zzb = j3 - j2;
            notifyAll();
        }
        this.zzc = j2;
        return j2 + this.zzb;
    }

    public final synchronized long zzb(long j2) {
        if (j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j3 = this.zzc;
        if (j3 != -9223372036854775807L) {
            long j4 = (j3 * 90000) / 1000000;
            long j5 = (4294967296L + j4) / 8589934592L;
            long j6 = (((-1) + j5) * 8589934592L) + j2;
            long j7 = (j5 * 8589934592L) + j2;
            j2 = Math.abs(j6 - j4) < Math.abs(j7 - j4) ? j6 : j7;
        }
        return zza((j2 * 1000000) / 90000);
    }

    public final synchronized long zzc() {
        long j2 = this.zza;
        if (j2 == Long.MAX_VALUE || j2 == 9223372036854775806L) {
            return -9223372036854775807L;
        }
        return j2;
    }

    public final synchronized long zzd() {
        long j2;
        j2 = this.zzc;
        return j2 != -9223372036854775807L ? j2 + this.zzb : zzc();
    }

    public final synchronized long zze() {
        return this.zzb;
    }

    public final synchronized void zzf(long j2) {
        this.zza = j2;
        this.zzb = j2 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.zzc = -9223372036854775807L;
    }
}
