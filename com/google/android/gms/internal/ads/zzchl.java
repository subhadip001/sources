package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzchl {
    private long zzb;
    private final long zza = TimeUnit.MILLISECONDS.toNanos(((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzB)).longValue());
    private boolean zzc = true;

    public final void zza(SurfaceTexture surfaceTexture, final zzcgw zzcgwVar) {
        if (zzcgwVar == null) {
            return;
        }
        long timestamp = surfaceTexture.getTimestamp();
        if (this.zzc || Math.abs(timestamp - this.zzb) >= this.zza) {
            this.zzc = false;
            this.zzb = timestamp;
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzchk
                @Override // java.lang.Runnable
                public final void run() {
                    zzcgw.this.zzk();
                }
            });
        }
    }

    public final void zzb() {
        this.zzc = true;
    }
}
