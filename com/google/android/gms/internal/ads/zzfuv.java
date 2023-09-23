package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzfuv extends zzfut implements zzfvj {
    @Override // com.google.android.gms.internal.ads.zzfut
    public /* bridge */ /* synthetic */ Future zzb() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzfvj
    public final void zzc(Runnable runnable, Executor executor) {
        zzd().zzc(runnable, executor);
    }

    public abstract zzfvj zzd();
}
