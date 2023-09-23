package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcay extends zzaqv implements zzcba {
    public zzcay(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    @Override // com.google.android.gms.internal.ads.zzcba
    public final int zze() {
        Parcel zzbk = zzbk(2, zza());
        int readInt = zzbk.readInt();
        zzbk.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.ads.zzcba
    public final String zzf() {
        Parcel zzbk = zzbk(1, zza());
        String readString = zzbk.readString();
        zzbk.recycle();
        return readString;
    }
}
