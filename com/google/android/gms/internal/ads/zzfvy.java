package com.google.android.gms.internal.ads;

import f.a.b.a.a;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfvy extends zzfuq implements RunnableFuture {
    private volatile zzfvi zza;

    public zzfvy(zzfug zzfugVar) {
        this.zza = new zzfvw(this, zzfugVar);
    }

    public static zzfvy zzf(Runnable runnable, Object obj) {
        return new zzfvy(Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        zzfvi zzfviVar = this.zza;
        if (zzfviVar != null) {
            zzfviVar.run();
        }
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzftr
    public final String zza() {
        zzfvi zzfviVar = this.zza;
        if (zzfviVar != null) {
            String zzfviVar2 = zzfviVar.toString();
            return a.v(new StringBuilder(zzfviVar2.length() + 7), "task=[", zzfviVar2, "]");
        }
        return super.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzftr
    public final void zzb() {
        zzfvi zzfviVar;
        if (zzu() && (zzfviVar = this.zza) != null) {
            zzfviVar.zzh();
        }
        this.zza = null;
    }

    public zzfvy(Callable callable) {
        this.zza = new zzfvx(this, callable);
    }
}
