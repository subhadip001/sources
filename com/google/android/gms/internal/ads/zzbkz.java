package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzbkz extends zzaqw implements zzbla {
    public zzbkz() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    public static zzbla zzg(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        return queryLocalInterface instanceof zzbla ? (zzbla) queryLocalInterface : new zzbky(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final boolean zzbI(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            IObjectWrapper zzf = zzf();
            parcel2.writeNoException();
            zzaqx.zzg(parcel2, zzf);
        } else if (i2 == 2) {
            Uri zze = zze();
            parcel2.writeNoException();
            zzaqx.zzf(parcel2, zze);
        } else if (i2 == 3) {
            double zzb = zzb();
            parcel2.writeNoException();
            parcel2.writeDouble(zzb);
        } else if (i2 == 4) {
            int zzd = zzd();
            parcel2.writeNoException();
            parcel2.writeInt(zzd);
        } else if (i2 != 5) {
            return false;
        } else {
            int zzc = zzc();
            parcel2.writeNoException();
            parcel2.writeInt(zzc);
        }
        return true;
    }
}
