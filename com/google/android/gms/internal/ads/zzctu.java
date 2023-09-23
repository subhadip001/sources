package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzctu implements zzbol {
    public final /* synthetic */ zzctx zza;

    public zzctu(zzctx zzctxVar) {
        this.zza = zzctxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final void zza(Object obj, Map map) {
        Executor executor;
        if (zzctx.zzg(this.zza, map)) {
            executor = this.zza.zzc;
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzctt
                @Override // java.lang.Runnable
                public final void run() {
                    zzcuc zzcucVar;
                    zzcucVar = zzctu.this.zza.zzd;
                    zzcucVar.zzg();
                }
            });
        }
    }
}
