package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzbqt extends zzaqw implements zzbqu {
    public zzbqt() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final boolean zzbI(int i2, Parcel parcel, Parcel parcel2, int i3) {
        zzbqx zzbqvVar;
        if (i2 == 3) {
            com.google.android.gms.ads.internal.client.zzdk zzb = zzb();
            parcel2.writeNoException();
            zzaqx.zzg(parcel2, zzb);
            return true;
        } else if (i2 == 4) {
            zzd();
            parcel2.writeNoException();
            return true;
        } else if (i2 == 5) {
            IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzbqvVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                zzbqvVar = queryLocalInterface instanceof zzbqx ? (zzbqx) queryLocalInterface : new zzbqv(readStrongBinder);
            }
            zzaqx.zzc(parcel);
            zzf(asInterface, zzbqvVar);
            parcel2.writeNoException();
            return true;
        } else if (i2 == 6) {
            IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzaqx.zzc(parcel);
            zze(asInterface2);
            parcel2.writeNoException();
            return true;
        } else if (i2 != 7) {
            return false;
        } else {
            zzbkx zzc = zzc();
            parcel2.writeNoException();
            zzaqx.zzg(parcel2, zzc);
            return true;
        }
    }
}
