package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzffw {
    private static final zzfvj zza = zzfva.zzi(null);
    private final zzfvk zzb;
    private final ScheduledExecutorService zzc;
    private final zzffx zzd;

    public zzffw(zzfvk zzfvkVar, ScheduledExecutorService scheduledExecutorService, zzffx zzffxVar) {
        this.zzb = zzfvkVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzffxVar;
    }

    public final zzffm zza(Object obj, zzfvj... zzfvjVarArr) {
        return new zzffm(this, obj, Arrays.asList(zzfvjVarArr), null);
    }

    public final zzffv zzb(Object obj, zzfvj zzfvjVar) {
        return new zzffv(this, obj, zzfvjVar, Collections.singletonList(zzfvjVar), zzfvjVar);
    }

    public abstract String zzf(Object obj);
}
