package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzerq implements zzetb {
    private final zzfvk zza;
    private final Bundle zzb;

    public zzerq(zzfvk zzfvkVar, Bundle bundle) {
        this.zza = zzfvkVar;
        this.zzb = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final int zza() {
        return 30;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final zzfvj zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzerp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzerq.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzerr zzc() {
        return new zzerr(this.zzb);
    }
}
