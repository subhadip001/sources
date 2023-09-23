package com.google.android.gms.internal.ads;

import android.app.Activity;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbwi implements Runnable {
    public final /* synthetic */ AdOverlayInfoParcel zza;
    public final /* synthetic */ zzbwj zzb;

    public zzbwi(zzbwj zzbwjVar, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.zzb = zzbwjVar;
        this.zza = adOverlayInfoParcel;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Activity activity;
        com.google.android.gms.ads.internal.zzt.zzj();
        activity = this.zzb.zza;
        com.google.android.gms.ads.internal.overlay.zzm.zza(activity, this.zza, true);
    }
}
