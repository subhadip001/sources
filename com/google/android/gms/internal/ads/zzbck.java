package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbck extends zzaqv implements zzbcm {
    public zzbck(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbcm
    public final void zzb() {
        zzbl(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbcm
    public final void zzc() {
        zzbl(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbcm
    public final void zzd(com.google.android.gms.ads.internal.client.zze zzeVar) {
        Parcel zza = zza();
        zzaqx.zze(zza, zzeVar);
        zzbl(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbcm
    public final void zze() {
        zzbl(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbcm
    public final void zzf() {
        zzbl(1, zza());
    }
}
