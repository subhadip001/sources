package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbqy extends zzaqv implements zzbra {
    public zzbqy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbra
    public final void zze(int i2) {
        Parcel zza = zza();
        zza.writeInt(i2);
        zzbl(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbra
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) {
        Parcel zza = zza();
        zzaqx.zze(zza, zzeVar);
        zzbl(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbra
    public final void zzg(zzbqu zzbquVar) {
        Parcel zza = zza();
        zzaqx.zzg(zza, zzbquVar);
        zzbl(1, zza);
    }
}
