package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzchd implements Runnable {
    public final /* synthetic */ zzchf zza;

    public zzchd(zzchf zzchfVar) {
        this.zza = zzchfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzJ("surfaceDestroyed", new String[0]);
    }
}
