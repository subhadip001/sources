package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.initialization.AdapterStatus;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbqn implements AdapterStatus {
    private final AdapterStatus.State zza;
    private final String zzb;
    private final int zzc;

    public zzbqn(AdapterStatus.State state, String str, int i2) {
        this.zza = state;
        this.zzb = str;
        this.zzc = i2;
    }

    @Override // com.google.android.gms.ads.initialization.AdapterStatus
    public final String getDescription() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.initialization.AdapterStatus
    public final AdapterStatus.State getInitializationState() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.initialization.AdapterStatus
    public final int getLatency() {
        return this.zzc;
    }
}
