package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfun extends zzfua {
    private zzfum zza;

    public zzfun(zzfrc zzfrcVar, boolean z, Executor executor, Callable callable) {
        super(zzfrcVar, z, false);
        this.zza = new zzful(this, callable, executor);
        zzw();
    }

    public static /* synthetic */ zzfum zzG(zzfun zzfunVar, zzfum zzfumVar) {
        zzfunVar.zza = null;
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfua
    public final void zzg(int i2, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzftr
    public final void zzr() {
        zzfum zzfumVar = this.zza;
        if (zzfumVar != null) {
            zzfumVar.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfua
    public final void zzv() {
        zzfum zzfumVar = this.zza;
        if (zzfumVar != null) {
            zzfumVar.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfua
    public final void zzz(int i2) {
        super.zzz(i2);
        if (i2 == 1) {
            this.zza = null;
        }
    }
}
