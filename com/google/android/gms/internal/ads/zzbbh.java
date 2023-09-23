package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbbh implements Runnable {
    public final /* synthetic */ View zza;
    public final /* synthetic */ zzbbl zzb;

    public zzbbh(zzbbl zzbblVar, View view) {
        this.zzb = zzbblVar;
        this.zza = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzc(this.zza);
    }
}
