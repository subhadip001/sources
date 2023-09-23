package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfuy implements Runnable {
    public final Future zza;
    public final zzfuw zzb;

    public zzfuy(Future future, zzfuw zzfuwVar) {
        this.zza = future;
        this.zzb = zzfuwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable zza;
        Future future = this.zza;
        if ((future instanceof zzfwb) && (zza = zzfwc.zza((zzfwb) future)) != null) {
            this.zzb.zza(zza);
            return;
        }
        try {
            this.zzb.zzb(zzfva.zzp(this.zza));
        } catch (Error e2) {
            e = e2;
            this.zzb.zza(e);
        } catch (RuntimeException e3) {
            e = e3;
            this.zzb.zza(e);
        } catch (ExecutionException e4) {
            this.zzb.zza(e4.getCause());
        }
    }

    public final String toString() {
        zzfom zza = zzfon.zza(this);
        zza.zza(this.zzb);
        return zza.toString();
    }
}
