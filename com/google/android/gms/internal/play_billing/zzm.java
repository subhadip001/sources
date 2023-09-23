package com.google.android.gms.internal.play_billing;

import f.a.b.a.a;

/* compiled from: com.android.billingclient:billing@@4.1.0 */
/* loaded from: classes.dex */
public final class zzm {
    public static int zza(int i2, int i3, String str) {
        String zza;
        if (i2 < 0 || i2 >= i3) {
            if (i2 < 0) {
                zza = zzn.zza("%s (%s) must not be negative", "index", Integer.valueOf(i2));
            } else if (i3 < 0) {
                throw new IllegalArgumentException(a.d(26, "negative size: ", i3));
            } else {
                zza = zzn.zza("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i2), Integer.valueOf(i3));
            }
            throw new IndexOutOfBoundsException(zza);
        }
        return i2;
    }

    public static int zzb(int i2, int i3, String str) {
        if (i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException(zzd(i2, i3, "index"));
        }
        return i2;
    }

    public static void zzc(int i2, int i3, int i4) {
        String zzd;
        if (i2 < 0 || i3 < i2 || i3 > i4) {
            if (i2 >= 0 && i2 <= i4) {
                zzd = (i3 < 0 || i3 > i4) ? zzd(i3, i4, "end index") : zzn.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i3), Integer.valueOf(i2));
            } else {
                zzd = zzd(i2, i4, "start index");
            }
            throw new IndexOutOfBoundsException(zzd);
        }
    }

    private static String zzd(int i2, int i3, String str) {
        if (i2 < 0) {
            return zzn.zza("%s (%s) must not be negative", str, Integer.valueOf(i2));
        }
        if (i3 >= 0) {
            return zzn.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i3));
        }
        throw new IllegalArgumentException(a.d(26, "negative size: ", i3));
    }
}
