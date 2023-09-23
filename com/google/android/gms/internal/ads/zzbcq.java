package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbcq implements zzbbf {
    public final /* synthetic */ zzbct zza;

    public zzbcq(zzbct zzbctVar) {
        this.zza = zzbctVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbbf
    public final void zza(boolean z) {
        if (z) {
            this.zza.zzl();
        } else {
            zzbct.zzh(this.zza);
        }
    }
}
