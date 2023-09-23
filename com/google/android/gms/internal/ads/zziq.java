package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zziq implements zzjt {
    public final /* synthetic */ zzix zza;

    public zziq(zzix zzixVar) {
        this.zza = zzixVar;
    }

    @Override // com.google.android.gms.internal.ads.zzjt
    public final void zza(long j2) {
        if (j2 >= 2000) {
            this.zza.zzD = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzjt
    public final void zzb() {
        zzdg zzdgVar;
        zzdgVar = this.zza.zzh;
        zzdgVar.zzh(2);
    }
}
