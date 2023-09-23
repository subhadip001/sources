package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzbce extends zzaqw implements zzbcf {
    public zzbce() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final boolean zzbI(int i2, Parcel parcel, Parcel parcel2, int i3) {
        zzbcj zzbcjVar = null;
        zzbcm zzbcmVar = null;
        switch (i2) {
            case 2:
                com.google.android.gms.ads.internal.client.zzbs zze = zze();
                parcel2.writeNoException();
                zzaqx.zzg(parcel2, zze);
                return true;
            case 3:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
                    zzbcjVar = queryLocalInterface instanceof zzbcj ? (zzbcj) queryLocalInterface : new zzbcj(readStrongBinder);
                }
                zzaqx.zzc(parcel);
                zzj(zzbcjVar);
                parcel2.writeNoException();
                return true;
            case 4:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                    zzbcmVar = queryLocalInterface2 instanceof zzbcm ? (zzbcm) queryLocalInterface2 : new zzbck(readStrongBinder2);
                }
                zzaqx.zzc(parcel);
                zzi(asInterface, zzbcmVar);
                parcel2.writeNoException();
                return true;
            case 5:
                com.google.android.gms.ads.internal.client.zzdh zzf = zzf();
                parcel2.writeNoException();
                zzaqx.zzg(parcel2, zzf);
                return true;
            case 6:
                boolean zzh = zzaqx.zzh(parcel);
                zzaqx.zzc(parcel);
                zzg(zzh);
                parcel2.writeNoException();
                return true;
            case 7:
                com.google.android.gms.ads.internal.client.zzde zzb = com.google.android.gms.ads.internal.client.zzdd.zzb(parcel.readStrongBinder());
                zzaqx.zzc(parcel);
                zzh(zzb);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
