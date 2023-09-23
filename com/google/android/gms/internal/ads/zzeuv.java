package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzeuv implements zzetb {
    public final zzfvk zza;
    public final String zzb;
    public final zzcef zzc;

    public zzeuv(zzcef zzcefVar, zzfvk zzfvkVar, String str, byte[] bArr) {
        this.zzc = zzcefVar;
        this.zza = zzfvkVar;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final int zza() {
        return 47;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final zzfvj zzb() {
        final zzfvj zzi = zzfva.zzi(null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzeM)).booleanValue()) {
            zzi = zzfva.zzi(null);
        }
        final zzfvj zzi2 = zzfva.zzi(null);
        return zzfva.zzd(zzi, zzi2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeuu
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzeuw((String) zzfvj.this.get(), (String) zzi2.get());
            }
        }, zzcfv.zza);
    }
}
