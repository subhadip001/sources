package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzey extends zzda {
    private final OnAdMetadataChangedListener zza;

    public zzey(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        this.zza = onAdMetadataChangedListener;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zze() {
        OnAdMetadataChangedListener onAdMetadataChangedListener = this.zza;
        if (onAdMetadataChangedListener != null) {
            onAdMetadataChangedListener.onAdMetadataChanged();
        }
    }
}
