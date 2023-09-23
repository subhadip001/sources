package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdeh extends zzdhb {
    private final ScheduledExecutorService zzb;
    private final Clock zzc;
    private long zzd;
    private long zze;
    private boolean zzf;
    private ScheduledFuture zzg;

    public zzdeh(ScheduledExecutorService scheduledExecutorService, Clock clock) {
        super(Collections.emptySet());
        this.zzd = -1L;
        this.zze = -1L;
        this.zzf = false;
        this.zzb = scheduledExecutorService;
        this.zzc = clock;
    }

    private final synchronized void zze(long j2) {
        ScheduledFuture scheduledFuture = this.zzg;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            this.zzg.cancel(true);
        }
        this.zzd = this.zzc.elapsedRealtime() + j2;
        this.zzg = this.zzb.schedule(new zzdeg(this, null), j2, TimeUnit.MILLISECONDS);
    }

    public final synchronized void zza() {
        this.zzf = false;
        zze(0L);
    }

    public final synchronized void zzb() {
        if (this.zzf) {
            return;
        }
        ScheduledFuture scheduledFuture = this.zzg;
        if (scheduledFuture == null || scheduledFuture.isCancelled()) {
            this.zze = -1L;
        } else {
            this.zzg.cancel(true);
            this.zze = this.zzd - this.zzc.elapsedRealtime();
        }
        this.zzf = true;
    }

    public final synchronized void zzc() {
        if (this.zzf) {
            if (this.zze > 0 && this.zzg.isCancelled()) {
                zze(this.zze);
            }
            this.zzf = false;
        }
    }

    public final synchronized void zzd(int i2) {
        if (i2 <= 0) {
            return;
        }
        long millis = TimeUnit.SECONDS.toMillis(i2);
        if (this.zzf) {
            long j2 = this.zze;
            if (j2 <= 0 || millis >= j2) {
                millis = j2;
            }
            this.zze = millis;
            return;
        }
        long elapsedRealtime = this.zzc.elapsedRealtime();
        long j3 = this.zzd;
        if (elapsedRealtime > j3 || j3 - this.zzc.elapsedRealtime() > millis) {
            zze(millis);
        }
    }
}
