package com.google.android.gms.internal.ads;

import f.a.b.a.a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfos {
    public static int zza(int i2, int i3, String str) {
        String zzb;
        if (i2 < 0 || i2 >= i3) {
            if (i2 < 0) {
                zzb = zzfpg.zzb("%s (%s) must not be negative", "index", Integer.valueOf(i2));
            } else if (i3 < 0) {
                throw new IllegalArgumentException(a.d(26, "negative size: ", i3));
            } else {
                zzb = zzfpg.zzb("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i2), Integer.valueOf(i3));
            }
            throw new IndexOutOfBoundsException(zzb);
        }
        return i2;
    }

    public static int zzb(int i2, int i3, String str) {
        if (i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException(zzj(i2, i3, "index"));
        }
        return i2;
    }

    public static Object zzc(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException((String) obj2);
    }

    public static Object zzd(Object obj, String str, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(zzfpg.zzb(str, obj2));
    }

    public static void zze(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void zzf(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void zzg(int i2, int i3, int i4) {
        String zzj;
        if (i2 < 0 || i3 < i2 || i3 > i4) {
            if (i2 >= 0 && i2 <= i4) {
                zzj = (i3 < 0 || i3 > i4) ? zzj(i3, i4, "end index") : zzfpg.zzb("end index (%s) must not be less than start index (%s)", Integer.valueOf(i3), Integer.valueOf(i2));
            } else {
                zzj = zzj(i2, i4, "start index");
            }
            throw new IndexOutOfBoundsException(zzj);
        }
    }

    public static void zzh(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void zzi(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException((String) obj);
        }
    }

    private static String zzj(int i2, int i3, String str) {
        if (i2 < 0) {
            return zzfpg.zzb("%s (%s) must not be negative", str, Integer.valueOf(i2));
        }
        if (i3 >= 0) {
            return zzfpg.zzb("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i3));
        }
        throw new IllegalArgumentException(a.d(26, "negative size: ", i3));
    }
}
