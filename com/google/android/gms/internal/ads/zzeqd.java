package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzeqd implements zzetb {
    private final zzfvk zza;

    public zzeqd(zzfvk zzfvkVar) {
        this.zza = zzfvkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final int zza() {
        return 20;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final zzfvj zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeqc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzeqe(com.google.android.gms.ads.internal.zzt.zzs().zzb(), com.google.android.gms.ads.internal.zzt.zzs().zzm());
            }
        });
    }
}
