package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzedn {
    private final zzedj zza;
    private final zzfvk zzb;

    public zzedn(zzedj zzedjVar, zzfvk zzfvkVar) {
        this.zza = zzedjVar;
        this.zzb = zzfvkVar;
    }

    public final void zza(zzffh zzffhVar) {
        zzfvk zzfvkVar = this.zzb;
        final zzedj zzedjVar = this.zza;
        zzfva.zzr(zzfvkVar.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzedl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzedj.this.getWritableDatabase();
            }
        }), new zzedm(this, zzffhVar), this.zzb);
    }
}
