package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbvt extends zzaqv implements zzbvv {
    public zzbvt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbvv
    public final void zze(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzbl(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvv
    public final void zzf(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzbl(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvv
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) {
        Parcel zza = zza();
        zzaqx.zze(zza, zzeVar);
        zzbl(3, zza);
    }
}
