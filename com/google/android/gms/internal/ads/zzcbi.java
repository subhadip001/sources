package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcbi extends zzaqv implements zzcbk {
    public zzcbi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final void zze(int i2) {
        Parcel zza = zza();
        zza.writeInt(i2);
        zzbl(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) {
        Parcel zza = zza();
        zzaqx.zze(zza, zzeVar);
        zzbl(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final void zzg() {
        zzbl(1, zza());
    }
}
