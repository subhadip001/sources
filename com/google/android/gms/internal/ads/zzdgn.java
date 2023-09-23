package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdgn implements zzden {
    private int zza = ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzba)).intValue();

    @Override // com.google.android.gms.internal.ads.zzden
    public final synchronized void zzb(zzfbs zzfbsVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzbb)).booleanValue()) {
            try {
                this.zza = zzfbsVar.zzb.zzb.zzc;
            } catch (NullPointerException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final void zzbE(zzbzu zzbzuVar) {
    }

    public final synchronized int zzc() {
        return this.zza;
    }
}
