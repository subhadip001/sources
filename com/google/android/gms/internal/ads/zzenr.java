package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzenr implements zzetb {
    private final zzfvj zza;
    private final Executor zzb;

    public zzenr(zzfvj zzfvjVar, Executor executor) {
        this.zza = zzfvjVar;
        this.zzb = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final int zza() {
        return 6;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final zzfvj zzb() {
        return zzfva.zzn(this.zza, new zzfuh() { // from class: com.google.android.gms.internal.ads.zzenq
            @Override // com.google.android.gms.internal.ads.zzfuh
            public final zzfvj zza(Object obj) {
                final String str = (String) obj;
                return zzfva.zzi(new zzeta() { // from class: com.google.android.gms.internal.ads.zzenp
                    @Override // com.google.android.gms.internal.ads.zzeta
                    public final void zzf(Object obj2) {
                        ((Bundle) obj2).putString("ms", str);
                    }
                });
            }
        }, this.zzb);
    }
}
