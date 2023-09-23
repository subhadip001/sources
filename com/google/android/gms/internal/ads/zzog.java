package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzog {
    private Exception zza;
    private long zzb;

    public zzog(long j2) {
    }

    public final void zza() {
        this.zza = null;
    }

    public final void zzb(Exception exc) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.zza == null) {
            this.zza = exc;
            this.zzb = 100 + elapsedRealtime;
        }
        if (elapsedRealtime >= this.zzb) {
            Exception exc2 = this.zza;
            if (exc2 != exc) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(exc2, exc);
                } catch (Exception unused) {
                }
            }
            Exception exc3 = this.zza;
            this.zza = null;
            throw exc3;
        }
    }
}
