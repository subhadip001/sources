package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzmv {
    public static final zzmv zza;
    private final zzmu zzb;

    static {
        zza = zzeg.zza < 31 ? new zzmv() : new zzmv(zzmu.zza);
    }

    public zzmv() {
        this.zzb = null;
        zzcw.zzf(zzeg.zza < 31);
    }

    private zzmv(zzmu zzmuVar) {
        this.zzb = zzmuVar;
    }

    public final LogSessionId zza() {
        zzmu zzmuVar = this.zzb;
        Objects.requireNonNull(zzmuVar);
        return zzmuVar.zzb;
    }

    public zzmv(LogSessionId logSessionId) {
        this.zzb = new zzmu(logSessionId);
    }
}
