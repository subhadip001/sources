package com.google.android.gms.internal.ads;

import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbae implements Runnable {
    public final /* synthetic */ Surface zza;
    public final /* synthetic */ zzbag zzb;

    public zzbae(zzbag zzbagVar, Surface surface) {
        this.zzb = zzbagVar;
        this.zza = surface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbah zzbahVar;
        zzbahVar = this.zzb.zzb;
        zzbahVar.zzm(this.zza);
    }
}
