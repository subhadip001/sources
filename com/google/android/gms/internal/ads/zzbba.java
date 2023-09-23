package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbba extends com.google.android.gms.ads.internal.client.zzby {
    private final AppEventListener zza;

    public zzbba(AppEventListener appEventListener) {
        this.zza = appEventListener;
    }

    public final AppEventListener zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbz
    public final void zzc(String str, String str2) {
        this.zza.onAppEvent(str, str2);
    }
}
