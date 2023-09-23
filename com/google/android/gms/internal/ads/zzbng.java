package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbng implements Runnable {
    public final /* synthetic */ AdManagerAdView zza;
    public final /* synthetic */ com.google.android.gms.ads.internal.client.zzbs zzb;
    public final /* synthetic */ zzbnh zzc;

    public zzbng(zzbnh zzbnhVar, AdManagerAdView adManagerAdView, com.google.android.gms.ads.internal.client.zzbs zzbsVar) {
        this.zzc = zzbnhVar;
        this.zza = adManagerAdView;
        this.zzb = zzbsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener;
        if (this.zza.zzb(this.zzb)) {
            onAdManagerAdViewLoadedListener = this.zzc.zza;
            onAdManagerAdViewLoadedListener.onAdManagerAdViewLoaded(this.zza);
            return;
        }
        zzcfi.zzj("Could not bind.");
    }
}
