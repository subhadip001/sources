package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzeni implements zzetb {
    private final Clock zza;
    private final zzfby zzb;

    public zzeni(Clock clock, zzfby zzfbyVar) {
        this.zza = clock;
        this.zzb = zzfbyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final int zza() {
        return 4;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final zzfvj zzb() {
        return zzfva.zzi(new zzenj(this.zzb, this.zza.currentTimeMillis()));
    }
}
