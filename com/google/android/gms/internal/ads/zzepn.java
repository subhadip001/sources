package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzepn implements zzetb {
    private final zzfvk zza;
    private final zzdug zzb;
    private final String zzc;
    private final zzfby zzd;

    public zzepn(zzfvk zzfvkVar, zzdug zzdugVar, zzfby zzfbyVar, String str) {
        this.zza = zzfvkVar;
        this.zzb = zzdugVar;
        this.zzd = zzfbyVar;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final int zza() {
        return 17;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final zzfvj zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzepm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzepn.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzepo zzc() {
        return new zzepo(this.zzb.zzb(this.zzd.zzf, this.zzc), this.zzb.zza());
    }
}
