package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfcz implements zzgpu {
    private final zzfcy zza;

    public zzfcz(zzfcy zzfcyVar) {
        this.zza = zzfcyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgqh
    public final /* synthetic */ Object zzb() {
        Clock defaultClock = DefaultClock.getInstance();
        zzgqc.zzb(defaultClock);
        return defaultClock;
    }
}
