package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzcbc extends zzaqw implements zzcbd {
    public zzcbc() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public static zzcbd zzq(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        return queryLocalInterface instanceof zzcbd ? (zzcbd) queryLocalInterface : new zzcbb(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final boolean zzbI(int i2, Parcel parcel, Parcel parcel2, int i3) {
        zzcbk zzcbkVar = null;
        zzcbk zzcbkVar2 = null;
        zzcbl zzcblVar = null;
        zzcbg zzcbgVar = null;
        switch (i2) {
            case 1:
                com.google.android.gms.ads.internal.client.zzl zzlVar = (com.google.android.gms.ads.internal.client.zzl) zzaqx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    zzcbkVar = queryLocalInterface instanceof zzcbk ? (zzcbk) queryLocalInterface : new zzcbi(readStrongBinder);
                }
                zzaqx.zzc(parcel);
                zzf(zzlVar, zzcbkVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    zzcbgVar = queryLocalInterface2 instanceof zzcbg ? (zzcbg) queryLocalInterface2 : new zzcbe(readStrongBinder2);
                }
                zzaqx.zzc(parcel);
                zzk(zzcbgVar);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zzo = zzo();
                parcel2.writeNoException();
                zzaqx.zzd(parcel2, zzo);
                return true;
            case 4:
                String zze = zze();
                parcel2.writeNoException();
                parcel2.writeString(zze);
                return true;
            case 5:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzaqx.zzc(parcel);
                zzm(asInterface);
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    zzcblVar = queryLocalInterface3 instanceof zzcbl ? (zzcbl) queryLocalInterface3 : new zzcbl(readStrongBinder3);
                }
                zzaqx.zzc(parcel);
                zzp(zzcblVar);
                parcel2.writeNoException();
                return true;
            case 7:
                zzaqx.zzc(parcel);
                zzl((zzcbr) zzaqx.zza(parcel, zzcbr.CREATOR));
                parcel2.writeNoException();
                return true;
            case 8:
                com.google.android.gms.ads.internal.client.zzdb zzb = com.google.android.gms.ads.internal.client.zzda.zzb(parcel.readStrongBinder());
                zzaqx.zzc(parcel);
                zzi(zzb);
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle zzb2 = zzb();
                parcel2.writeNoException();
                zzaqx.zzf(parcel2, zzb2);
                return true;
            case 10:
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                boolean zzh = zzaqx.zzh(parcel);
                zzaqx.zzc(parcel);
                zzn(asInterface2, zzh);
                parcel2.writeNoException();
                return true;
            case 11:
                zzcba zzd = zzd();
                parcel2.writeNoException();
                zzaqx.zzg(parcel2, zzd);
                return true;
            case 12:
                com.google.android.gms.ads.internal.client.zzdh zzc = zzc();
                parcel2.writeNoException();
                zzaqx.zzg(parcel2, zzc);
                return true;
            case 13:
                com.google.android.gms.ads.internal.client.zzde zzb3 = com.google.android.gms.ads.internal.client.zzdd.zzb(parcel.readStrongBinder());
                zzaqx.zzc(parcel);
                zzj(zzb3);
                parcel2.writeNoException();
                return true;
            case 14:
                com.google.android.gms.ads.internal.client.zzl zzlVar2 = (com.google.android.gms.ads.internal.client.zzl) zzaqx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    zzcbkVar2 = queryLocalInterface4 instanceof zzcbk ? (zzcbk) queryLocalInterface4 : new zzcbi(readStrongBinder4);
                }
                zzaqx.zzc(parcel);
                zzg(zzlVar2, zzcbkVar2);
                parcel2.writeNoException();
                return true;
            case 15:
                boolean zzh2 = zzaqx.zzh(parcel);
                zzaqx.zzc(parcel);
                zzh(zzh2);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
