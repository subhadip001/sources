package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzche implements Runnable {
    public final /* synthetic */ boolean zza;
    public final /* synthetic */ zzchf zzb;

    public zzche(zzchf zzchfVar, boolean z) {
        this.zzb = zzchfVar;
        this.zza = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzJ("windowVisibilityChanged", "isVisible", String.valueOf(this.zza));
    }
}
