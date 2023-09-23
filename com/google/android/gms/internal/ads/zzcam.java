package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzcam extends zzaqw implements zzcan {
    public zzcam() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final boolean zzbI(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            zzaqx.zzc(parcel);
            zzg((zzcar) zzaqx.zza(parcel, zzcar.CREATOR));
            parcel2.writeNoException();
        } else if (i2 != 2) {
            zzcaq zzcaqVar = null;
            zzcal zzcalVar = null;
            if (i2 == 3) {
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    zzcaqVar = queryLocalInterface instanceof zzcaq ? (zzcaq) queryLocalInterface : new zzcao(readStrongBinder);
                }
                zzaqx.zzc(parcel);
                zzo(zzcaqVar);
                parcel2.writeNoException();
            } else if (i2 != 34) {
                switch (i2) {
                    case 5:
                        boolean zzs = zzs();
                        parcel2.writeNoException();
                        zzaqx.zzd(parcel2, zzs);
                        break;
                    case 6:
                        zzh();
                        parcel2.writeNoException();
                        break;
                    case 7:
                        zzj();
                        parcel2.writeNoException();
                        break;
                    case 8:
                        zze();
                        parcel2.writeNoException();
                        break;
                    case 9:
                        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                        zzaqx.zzc(parcel);
                        zzi(asInterface);
                        parcel2.writeNoException();
                        break;
                    case 10:
                        IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                        zzaqx.zzc(parcel);
                        zzk(asInterface2);
                        parcel2.writeNoException();
                        break;
                    case 11:
                        IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                        zzaqx.zzc(parcel);
                        zzf(asInterface3);
                        parcel2.writeNoException();
                        break;
                    case 12:
                        String zzd = zzd();
                        parcel2.writeNoException();
                        parcel2.writeString(zzd);
                        break;
                    case 13:
                        String readString = parcel.readString();
                        zzaqx.zzc(parcel);
                        zzp(readString);
                        parcel2.writeNoException();
                        break;
                    case 14:
                        com.google.android.gms.ads.internal.client.zzbw zzb = com.google.android.gms.ads.internal.client.zzbv.zzb(parcel.readStrongBinder());
                        zzaqx.zzc(parcel);
                        zzl(zzb);
                        parcel2.writeNoException();
                        break;
                    case 15:
                        Bundle zzb2 = zzb();
                        parcel2.writeNoException();
                        zzaqx.zzf(parcel2, zzb2);
                        break;
                    case 16:
                        IBinder readStrongBinder2 = parcel.readStrongBinder();
                        if (readStrongBinder2 != null) {
                            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                            zzcalVar = queryLocalInterface2 instanceof zzcal ? (zzcal) queryLocalInterface2 : new zzcal(readStrongBinder2);
                        }
                        zzaqx.zzc(parcel);
                        zzu(zzcalVar);
                        parcel2.writeNoException();
                        break;
                    case 17:
                        parcel.readString();
                        zzaqx.zzc(parcel);
                        parcel2.writeNoException();
                        break;
                    case 18:
                        IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                        zzaqx.zzc(parcel);
                        zzr(asInterface4);
                        parcel2.writeNoException();
                        break;
                    case 19:
                        String readString2 = parcel.readString();
                        zzaqx.zzc(parcel);
                        zzm(readString2);
                        parcel2.writeNoException();
                        break;
                    case 20:
                        boolean zzt = zzt();
                        parcel2.writeNoException();
                        zzaqx.zzd(parcel2, zzt);
                        break;
                    case 21:
                        com.google.android.gms.ads.internal.client.zzdh zzc = zzc();
                        parcel2.writeNoException();
                        zzaqx.zzg(parcel2, zzc);
                        break;
                    default:
                        return false;
                }
            } else {
                boolean zzh = zzaqx.zzh(parcel);
                zzaqx.zzc(parcel);
                zzn(zzh);
                parcel2.writeNoException();
            }
        } else {
            zzq();
            parcel2.writeNoException();
        }
        return true;
    }
}
