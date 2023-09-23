package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzeqx implements zzetb {
    private final zzfvk zza;
    private final zzfbf zzb;

    public zzeqx(zzfvk zzfvkVar, zzfbf zzfbfVar) {
        this.zza = zzfvkVar;
        this.zzb = zzfbfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final int zza() {
        return 25;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final zzfvj zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeqw
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeqx.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzeqy zzc() {
        return new zzeqy(this.zzb);
    }
}
