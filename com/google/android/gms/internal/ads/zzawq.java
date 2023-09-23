package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzawq implements Runnable {
    public final /* synthetic */ IOException zza;
    public final /* synthetic */ zzawu zzb;

    public zzawq(zzawu zzawuVar, IOException iOException) {
        this.zzb = zzawuVar;
        this.zza = iOException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzawv zzawvVar;
        zzawvVar = this.zzb.zze;
        zzawvVar.zzi(this.zza);
    }
}
