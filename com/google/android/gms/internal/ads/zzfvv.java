package com.google.android.gms.internal.ads;

import f.a.b.a.a;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfvv extends zzfuq {
    private zzfvj zza;
    private ScheduledFuture zzb;

    private zzfvv(zzfvj zzfvjVar) {
        Objects.requireNonNull(zzfvjVar);
        this.zza = zzfvjVar;
    }

    public static zzfvj zzg(zzfvj zzfvjVar, long j2, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        zzfvv zzfvvVar = new zzfvv(zzfvjVar);
        zzfvt zzfvtVar = new zzfvt(zzfvvVar);
        zzfvvVar.zzb = scheduledExecutorService.schedule(zzfvtVar, j2, timeUnit);
        zzfvjVar.zzc(zzfvtVar, zzfuo.INSTANCE);
        return zzfvvVar;
    }

    public static /* synthetic */ ScheduledFuture zzx(zzfvv zzfvvVar, ScheduledFuture scheduledFuture) {
        zzfvvVar.zzb = null;
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzftr
    public final String zza() {
        zzfvj zzfvjVar = this.zza;
        ScheduledFuture scheduledFuture = this.zzb;
        if (zzfvjVar != null) {
            String obj = zzfvjVar.toString();
            String v = a.v(new StringBuilder(obj.length() + 14), "inputFuture=[", obj, "]");
            if (scheduledFuture != null) {
                long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
                if (delay > 0) {
                    StringBuilder sb = new StringBuilder(v.length() + 43);
                    sb.append(v);
                    sb.append(", remaining delay=[");
                    sb.append(delay);
                    sb.append(" ms]");
                    return sb.toString();
                }
                return v;
            }
            return v;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzftr
    public final void zzb() {
        zzs(this.zza);
        ScheduledFuture scheduledFuture = this.zzb;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.zza = null;
        this.zzb = null;
    }
}
