package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaqv;
import com.google.android.gms.internal.ads.zzaqx;
import com.google.android.gms.internal.ads.zzbty;
import com.google.android.gms.internal.ads.zzbtz;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzch extends zzaqv implements zzcj {
    public zzch(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcj
    public final zzbtz getAdapterCreator() {
        Parcel zzbk = zzbk(2, zza());
        zzbtz zzf = zzbty.zzf(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzf;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcj
    public final zzei getLiteSdkVersion() {
        Parcel zzbk = zzbk(1, zza());
        zzei zzeiVar = (zzei) zzaqx.zza(zzbk, zzei.CREATOR);
        zzbk.recycle();
        return zzeiVar;
    }
}
