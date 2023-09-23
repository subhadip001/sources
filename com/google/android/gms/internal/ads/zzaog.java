package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzaog {
    private NetworkCapabilities zza;

    public zzaog(ConnectivityManager connectivityManager) {
        if (connectivityManager == null || Build.VERSION.SDK_INT < 24) {
            return;
        }
        try {
            connectivityManager.registerDefaultNetworkCallback(new zzaof(this));
        } catch (RuntimeException unused) {
            synchronized (zzaog.class) {
                this.zza = null;
            }
        }
    }

    public static zzaog zzc(Context context) {
        if (context != null) {
            return new zzaog((ConnectivityManager) context.getSystemService("connectivity"));
        }
        return null;
    }

    public final long zza() {
        synchronized (zzaog.class) {
            NetworkCapabilities networkCapabilities = this.zza;
            if (networkCapabilities != null) {
                if (networkCapabilities.hasTransport(4)) {
                    return 2L;
                }
                if (this.zza.hasTransport(1)) {
                    return 1L;
                }
                if (this.zza.hasTransport(0)) {
                    return 0L;
                }
            }
            return -1L;
        }
    }

    public final NetworkCapabilities zzb() {
        return this.zza;
    }
}
