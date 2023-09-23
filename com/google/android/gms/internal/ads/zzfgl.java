package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfgl {
    private final Executor zza;
    private final zzcfn zzb;

    public zzfgl(Executor executor, zzcfn zzcfnVar) {
        this.zza = executor;
        this.zzb = zzcfnVar;
    }

    public final /* synthetic */ void zza(String str) {
        this.zzb.zza(str);
    }

    public final void zzb(final String str) {
        this.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfgk
            @Override // java.lang.Runnable
            public final void run() {
                zzfgl.this.zza(str);
            }
        });
    }
}
