package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import f.a.b.a.a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbug extends zzaqv implements zzbui {
    public zzbug(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final IObjectWrapper zze() {
        return a.V(zzbk(1, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final boolean zzf() {
        Parcel zzbk = zzbk(2, zza());
        boolean zzh = zzaqx.zzh(zzbk);
        zzbk.recycle();
        return zzh;
    }
}
