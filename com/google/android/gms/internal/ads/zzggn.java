package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzggn {
    private static final zzgkr zza = new zzggm();

    public static int zza(int i2) {
        if (i2 != 1) {
            return i2 - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static int zzb(int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        return i2 != 4 ? 0 : 6;
                    }
                    return 5;
                }
                return 4;
            }
            return 3;
        }
        return 2;
    }
}
