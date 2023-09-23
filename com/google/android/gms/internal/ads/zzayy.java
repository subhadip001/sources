package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzayy {
    public static int zza(int i2, int i3, int i4) {
        if (i2 < 0 || i2 >= i4) {
            throw new IndexOutOfBoundsException();
        }
        return 0;
    }

    public static String zzb(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        return str;
    }

    public static void zzc(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void zzd(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void zze(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void zzf(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException((String) obj);
        }
    }
}
