package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public abstract class zzap {
    private static volatile Handler zza;
    private final zzgm zzb;
    private final Runnable zzc;
    private volatile long zzd;

    public zzap(zzgm zzgmVar) {
        Preconditions.checkNotNull(zzgmVar);
        this.zzb = zzgmVar;
        this.zzc = new zzao(this, zzgmVar);
    }

    private final Handler zzf() {
        Handler handler;
        if (zza != null) {
            return zza;
        }
        synchronized (zzap.class) {
            if (zza == null) {
                zza = new com.google.android.gms.internal.measurement.zzby(this.zzb.zzau().getMainLooper());
            }
            handler = zza;
        }
        return handler;
    }

    public final void zzb() {
        this.zzd = 0L;
        zzf().removeCallbacks(this.zzc);
    }

    public abstract void zzc();

    public final void zzd(long j2) {
        zzb();
        if (j2 >= 0) {
            this.zzd = this.zzb.zzav().currentTimeMillis();
            if (zzf().postDelayed(this.zzc, j2)) {
                return;
            }
            this.zzb.zzay().zzd().zzb("Failed to schedule delayed post. time", Long.valueOf(j2));
        }
    }

    public final boolean zze() {
        return this.zzd != 0;
    }
}
