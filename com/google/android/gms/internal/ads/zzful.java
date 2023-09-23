package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzful extends zzfum {
    public final /* synthetic */ zzfun zza;
    private final Callable zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzful(zzfun zzfunVar, Callable callable, Executor executor) {
        super(zzfunVar, executor);
        this.zza = zzfunVar;
        Objects.requireNonNull(callable);
        this.zzc = callable;
    }

    @Override // com.google.android.gms.internal.ads.zzfvi
    public final Object zza() {
        return this.zzc.call();
    }

    @Override // com.google.android.gms.internal.ads.zzfvi
    public final String zzb() {
        return this.zzc.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfum
    public final void zzc(Object obj) {
        this.zza.zzd(obj);
    }
}
