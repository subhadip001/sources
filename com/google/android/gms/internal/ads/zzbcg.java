package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbcg extends zzaqv implements zzbci {
    public zzbcg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbci
    public final void zzb(int i2) {
        Parcel zza = zza();
        zza.writeInt(i2);
        zzbl(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbci
    public final void zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        Parcel zza = zza();
        zzaqx.zze(zza, zzeVar);
        zzbl(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbci
    public final void zzd(zzbcf zzbcfVar) {
        Parcel zza = zza();
        zzaqx.zzg(zza, zzbcfVar);
        zzbl(1, zza);
    }
}
