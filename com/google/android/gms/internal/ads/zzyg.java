package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzyg {
    public static final zzyg zza = new zzyg(-3, -9223372036854775807L, -1);
    private final int zzb;
    private final long zzc;
    private final long zzd;

    private zzyg(int i2, long j2, long j3) {
        this.zzb = i2;
        this.zzc = j2;
        this.zzd = j3;
    }

    public static zzyg zzd(long j2, long j3) {
        return new zzyg(-1, j2, j3);
    }

    public static zzyg zze(long j2) {
        return new zzyg(0, -9223372036854775807L, j2);
    }

    public static zzyg zzf(long j2, long j3) {
        return new zzyg(-2, j2, j3);
    }
}
