package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzeoj implements zzetb {
    private final zzfvk zza;
    private final zzfby zzb;
    private final zzcfo zzc;
    private final zzcev zzd;

    public zzeoj(zzfvk zzfvkVar, zzfby zzfbyVar, zzcfo zzcfoVar, zzcev zzcevVar) {
        this.zza = zzfvkVar;
        this.zzb = zzfbyVar;
        this.zzc = zzcfoVar;
        this.zzd = zzcevVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final int zza() {
        return 9;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final zzfvj zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeoi
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeoj.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzeok zzc() {
        return new zzeok(this.zzb.zzj, this.zzc, this.zzd.zzj());
    }
}
