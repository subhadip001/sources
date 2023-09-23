package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzeqp implements zzetb {
    private final zzfvk zza;
    private final zzdza zzb;

    public zzeqp(zzfvk zzfvkVar, zzdza zzdzaVar) {
        this.zza = zzfvkVar;
        this.zzb = zzdzaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final int zza() {
        return 23;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final zzfvj zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeqo
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeqp.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzeqq zzc() {
        return new zzeqq(this.zzb.zzb(), this.zzb.zzn(), com.google.android.gms.ads.internal.zzt.zzs().zzl());
    }
}
