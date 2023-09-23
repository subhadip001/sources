package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzceo extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ zzcer zza;

    public zzceo(zzcer zzcerVar) {
        this.zza = zzcerVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.zza.zzm;
        atomicBoolean.set(true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.zza.zzm;
        atomicBoolean.set(false);
    }
}
