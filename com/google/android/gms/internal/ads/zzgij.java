package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgij {
    public static int zza() {
        try {
            return Class.forName("android.os.Build$VERSION").getDeclaredField("SDK_INT").getInt(null);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return -1;
        }
    }

    public static boolean zzb() {
        return "The Android Project".equals(System.getProperty("java.vendor"));
    }
}
