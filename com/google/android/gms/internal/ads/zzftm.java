package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzftm extends zzftn {
    public static int zza(long j2) {
        int i2 = (int) j2;
        if (i2 == j2) {
            return i2;
        }
        throw new IllegalArgumentException(zzfpg.zzb("Out of range: %s", Long.valueOf(j2)));
    }

    public static int zzb(int i2, int i3, int i4) {
        return Math.min(Math.max(i2, i3), 1073741823);
    }
}
