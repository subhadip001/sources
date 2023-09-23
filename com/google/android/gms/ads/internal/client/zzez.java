package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzez extends zzdd {
    private final OnPaidEventListener zza;

    public zzez(OnPaidEventListener onPaidEventListener) {
        this.zza = onPaidEventListener;
    }

    @Override // com.google.android.gms.ads.internal.client.zzde
    public final void zze(zzs zzsVar) {
        OnPaidEventListener onPaidEventListener = this.zza;
        if (onPaidEventListener != null) {
            onPaidEventListener.onPaidEvent(AdValue.zza(zzsVar.zzb, zzsVar.zzc, zzsVar.zzd));
        }
    }
}
