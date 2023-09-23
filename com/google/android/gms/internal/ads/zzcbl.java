package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcbl extends zzaqv implements IInterface {
    public zzcbl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
    }

    public final void zze(zzcba zzcbaVar, String str, String str2) {
        Parcel zza = zza();
        zzaqx.zzg(zza, zzcbaVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzbl(2, zza);
    }
}
