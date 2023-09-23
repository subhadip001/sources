package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzblt extends zzaqw implements zzblu {
    public zzblt() {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    public static zzblu zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        return queryLocalInterface instanceof zzblu ? (zzblu) queryLocalInterface : new zzbls(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final boolean zzbI(int i2, Parcel parcel, Parcel parcel2, int i3) {
        switch (i2) {
            case 1:
                String readString = parcel.readString();
                zzaqx.zzc(parcel);
                String zzi = zzi(readString);
                parcel2.writeNoException();
                parcel2.writeString(zzi);
                return true;
            case 2:
                String readString2 = parcel.readString();
                zzaqx.zzc(parcel);
                zzbla zzf = zzf(readString2);
                parcel2.writeNoException();
                zzaqx.zzg(parcel2, zzf);
                return true;
            case 3:
                List<String> zzj = zzj();
                parcel2.writeNoException();
                parcel2.writeStringList(zzj);
                return true;
            case 4:
                String zzh = zzh();
                parcel2.writeNoException();
                parcel2.writeString(zzh);
                return true;
            case 5:
                String readString3 = parcel.readString();
                zzaqx.zzc(parcel);
                zzm(readString3);
                parcel2.writeNoException();
                return true;
            case 6:
                zzn();
                parcel2.writeNoException();
                return true;
            case 7:
                com.google.android.gms.ads.internal.client.zzdk zze = zze();
                parcel2.writeNoException();
                zzaqx.zzg(parcel2, zze);
                return true;
            case 8:
                zzk();
                parcel2.writeNoException();
                return true;
            case 9:
                IObjectWrapper zzg = zzg();
                parcel2.writeNoException();
                zzaqx.zzg(parcel2, zzg);
                return true;
            case 10:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzaqx.zzc(parcel);
                boolean zzq = zzq(asInterface);
                parcel2.writeNoException();
                zzaqx.zzd(parcel2, zzq);
                return true;
            case 11:
                parcel2.writeNoException();
                zzaqx.zzg(parcel2, null);
                return true;
            case 12:
                boolean zzp = zzp();
                parcel2.writeNoException();
                zzaqx.zzd(parcel2, zzp);
                return true;
            case 13:
                boolean zzr = zzr();
                parcel2.writeNoException();
                zzaqx.zzd(parcel2, zzr);
                return true;
            case 14:
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzaqx.zzc(parcel);
                zzo(asInterface2);
                parcel2.writeNoException();
                return true;
            case 15:
                zzl();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
