package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzctw implements zzbol {
    public final /* synthetic */ zzctx zza;

    public zzctw(zzctx zzctxVar) {
        this.zza = zzctxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final void zza(Object obj, Map map) {
        Executor executor;
        if (zzctx.zzg(this.zza, map)) {
            executor = this.zza.zzc;
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzctv
                @Override // java.lang.Runnable
                public final void run() {
                    zzcuc zzcucVar;
                    zzcucVar = zzctw.this.zza.zzd;
                    zzcucVar.zzj();
                }
            });
        }
    }
}
