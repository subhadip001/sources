package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.initialization.InitializationStatus;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final /* synthetic */ class zzdw implements InitializationStatus {
    public final /* synthetic */ zzee zza;

    public /* synthetic */ zzdw(zzee zzeeVar) {
        this.zza = zzeeVar;
    }

    @Override // com.google.android.gms.ads.initialization.InitializationStatus
    public final Map getAdapterStatusMap() {
        zzee zzeeVar = this.zza;
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.gms.ads.MobileAds", new zzdz(zzeeVar));
        return hashMap;
    }
}
