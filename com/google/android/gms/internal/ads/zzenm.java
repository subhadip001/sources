package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzenm implements zzetb {
    private final zzfvk zza;
    private final zzfby zzb;
    private final zzfck zzc;

    public zzenm(zzfvk zzfvkVar, zzfby zzfbyVar, zzfck zzfckVar) {
        this.zza = zzfvkVar;
        this.zzb = zzfbyVar;
        this.zzc = zzfckVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final int zza() {
        return 5;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final zzfvj zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzenl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzenm.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzenn zzc() {
        String str = null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzgf)).booleanValue() && "requester_type_2".equals(com.google.android.gms.ads.nonagon.signalgeneration.zzf.zzb(this.zzb.zzd))) {
            str = zzfck.zza();
        }
        return new zzenn(str);
    }
}
