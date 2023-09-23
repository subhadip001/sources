package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzbuh extends zzaqw implements zzbui {
    public zzbuh() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    public static zzbui zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
        return queryLocalInterface instanceof zzbui ? (zzbui) queryLocalInterface : new zzbug(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final boolean zzbI(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            IObjectWrapper zze = zze();
            parcel2.writeNoException();
            zzaqx.zzg(parcel2, zze);
        } else if (i2 != 2) {
            return false;
        } else {
            boolean zzf = zzf();
            parcel2.writeNoException();
            zzaqx.zzd(parcel2, zzf);
        }
        return true;
    }
}
