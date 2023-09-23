package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzare extends Exception {
    private zzare(int i2, String str, Throwable th, int i3) {
        super(null, th);
    }

    public static zzare zza(Exception exc, int i2) {
        return new zzare(1, null, exc, i2);
    }

    public static zzare zzb(IOException iOException) {
        return new zzare(0, null, iOException, -1);
    }

    public static zzare zzc(RuntimeException runtimeException) {
        return new zzare(2, null, runtimeException, -1);
    }
}
