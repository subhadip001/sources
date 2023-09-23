package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbvn extends zzaqv implements zzbvp {
    public zzbvn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zze(String str) {
        Parcel zza = zza();
        zza.writeString("Adapter returned null.");
        zzbl(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) {
        Parcel zza = zza();
        zzaqx.zze(zza, zzeVar);
        zzbl(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzg() {
        zzbl(2, zza());
    }
}
