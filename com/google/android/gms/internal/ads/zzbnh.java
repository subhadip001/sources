package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbnh extends zzbmk {
    private final OnAdManagerAdViewLoadedListener zza;

    public zzbnh(OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener) {
        this.zza = onAdManagerAdViewLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbml
    public final void zze(com.google.android.gms.ads.internal.client.zzbs zzbsVar, IObjectWrapper iObjectWrapper) {
        if (zzbsVar == null || iObjectWrapper == null) {
            return;
        }
        AdManagerAdView adManagerAdView = new AdManagerAdView((Context) ObjectWrapper.unwrap(iObjectWrapper));
        try {
            if (zzbsVar.zzi() instanceof com.google.android.gms.ads.internal.client.zzg) {
                com.google.android.gms.ads.internal.client.zzg zzgVar = (com.google.android.gms.ads.internal.client.zzg) zzbsVar.zzi();
                adManagerAdView.setAdListener(zzgVar != null ? zzgVar.zzb() : null);
            }
        } catch (RemoteException e2) {
            zzcfi.zzh("", e2);
        }
        try {
            if (zzbsVar.zzj() instanceof zzbba) {
                zzbba zzbbaVar = (zzbba) zzbsVar.zzj();
                adManagerAdView.setAppEventListener(zzbbaVar != null ? zzbbaVar.zzb() : null);
            }
        } catch (RemoteException e3) {
            zzcfi.zzh("", e3);
        }
        zzcfb.zza.post(new zzbng(this, adManagerAdView, zzbsVar));
    }
}
