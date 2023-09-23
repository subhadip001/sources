package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcjm extends com.google.android.gms.ads.internal.util.zzb {
    public final zzchr zza;
    public final zzcju zzb;
    private final String zzc;
    private final String[] zzd;

    public zzcjm(zzchr zzchrVar, zzcju zzcjuVar, String str, String[] strArr) {
        this.zza = zzchrVar;
        this.zzb = zzcjuVar;
        this.zzc = str;
        this.zzd = strArr;
        com.google.android.gms.ads.internal.zzt.zzy().zzb(this);
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        try {
            this.zzb.zzr(this.zzc, this.zzd);
        } finally {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcjl(this));
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final zzfvj zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzbI)).booleanValue() && (this.zzb instanceof zzckd)) {
            return zzcfv.zze.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzcjk
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzcjm.this.zzd();
                }
            });
        }
        return super.zzb();
    }

    public final /* synthetic */ Boolean zzd() {
        return Boolean.valueOf(this.zzb.zzs(this.zzc, this.zzd, this));
    }

    public final String zze() {
        return this.zzc;
    }
}
