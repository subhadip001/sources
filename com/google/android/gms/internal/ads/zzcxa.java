package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final /* synthetic */ class zzcxa implements Runnable {
    public final /* synthetic */ AtomicReference zza;

    public /* synthetic */ zzcxa(AtomicReference atomicReference) {
        this.zza = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcxc.zzi(this.zza);
    }
}
