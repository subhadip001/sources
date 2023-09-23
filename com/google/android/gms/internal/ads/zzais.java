package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzais {
    private final Executor zza;

    public zzais(Handler handler) {
        this.zza = new zzaiq(this, handler);
    }

    public final void zza(zzajb zzajbVar, zzajk zzajkVar) {
        zzajbVar.zzm("post-error");
        zzajh zza = zzajh.zza(zzajkVar);
        Executor executor = this.zza;
        ((zzaiq) executor).zza.post(new zzair(zzajbVar, zza, null));
    }

    public final void zzb(zzajb zzajbVar, zzajh zzajhVar, Runnable runnable) {
        zzajbVar.zzq();
        zzajbVar.zzm("post-response");
        Executor executor = this.zza;
        ((zzaiq) executor).zza.post(new zzair(zzajbVar, zzajhVar, runnable));
    }
}
