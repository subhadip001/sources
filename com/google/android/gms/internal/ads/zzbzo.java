package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbzo extends zzaqv implements zzbzq {
    public zzbzo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbzq
    public final void zze(com.google.android.gms.ads.internal.util.zzaz zzazVar) {
        Parcel zza = zza();
        zzaqx.zze(zza, zzazVar);
        zzbl(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbzq
    public final void zzf(ParcelFileDescriptor parcelFileDescriptor) {
        Parcel zza = zza();
        zzaqx.zze(zza, parcelFileDescriptor);
        zzbl(1, zza);
    }
}
