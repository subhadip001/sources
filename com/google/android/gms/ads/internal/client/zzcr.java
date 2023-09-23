package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.MuteThisAdListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcr extends zzcp {
    private final MuteThisAdListener zza;

    public zzcr(MuteThisAdListener muteThisAdListener) {
        this.zza = muteThisAdListener;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcq
    public final void zze() {
        this.zza.onAdMuted();
    }
}
