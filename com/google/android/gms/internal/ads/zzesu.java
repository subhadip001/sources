package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzesu implements zzetb {
    private final boolean zza;

    public zzesu(zzezb zzezbVar) {
        this.zza = zzezbVar != null;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final int zza() {
        return 36;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final zzfvj zzb() {
        return zzfva.zzi(this.zza ? new zzeta() { // from class: com.google.android.gms.internal.ads.zzest
            @Override // com.google.android.gms.internal.ads.zzeta
            public final void zzf(Object obj) {
                ((Bundle) obj).putBoolean("sdk_prefetch", true);
            }
        } : null);
    }
}
