package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzboo {
    private boolean zza = false;
    private boolean zzb = false;
    private float zzc = 0.0f;
    private final AtomicBoolean zzd = new AtomicBoolean(false);

    public final synchronized float zza() {
        return this.zzc;
    }

    public final synchronized void zzb(boolean z, float f2) {
        this.zzb = z;
        this.zzc = f2;
    }

    public final synchronized void zzc(boolean z) {
        this.zza = z;
        this.zzd.set(true);
    }

    public final synchronized boolean zzd() {
        return this.zzb;
    }

    public final synchronized boolean zze(boolean z) {
        if (this.zzd.get()) {
            return this.zza;
        }
        return z;
    }
}
