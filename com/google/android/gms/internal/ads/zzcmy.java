package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzcmy extends zzaqw implements zzcmz {
    public zzcmy() {
        super("com.google.android.gms.ads.measurement.IAppMeasurementProxy");
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final boolean zzbI(int i2, Parcel parcel, Parcel parcel2, int i3) {
        switch (i2) {
            case 1:
                zzaqx.zzc(parcel);
                zzp((Bundle) zzaqx.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                zzaqx.zzc(parcel);
                Bundle zzd = zzd((Bundle) zzaqx.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                zzaqx.zzf(parcel2, zzd);
                return true;
            case 3:
                zzaqx.zzc(parcel);
                zzo(parcel.readString(), parcel.readString(), (Bundle) zzaqx.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 4:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzaqx.zzc(parcel);
                zzt(readString, readString2, asInterface);
                parcel2.writeNoException();
                return true;
            case 5:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                boolean zzh = zzaqx.zzh(parcel);
                zzaqx.zzc(parcel);
                Map zzk = zzk(readString3, readString4, zzh);
                parcel2.writeNoException();
                parcel2.writeMap(zzk);
                return true;
            case 6:
                String readString5 = parcel.readString();
                zzaqx.zzc(parcel);
                int zzb = zzb(readString5);
                parcel2.writeNoException();
                parcel2.writeInt(zzb);
                return true;
            case 7:
                zzaqx.zzc(parcel);
                zzq((Bundle) zzaqx.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 8:
                zzaqx.zzc(parcel);
                zzm(parcel.readString(), parcel.readString(), (Bundle) zzaqx.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 9:
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                zzaqx.zzc(parcel);
                List zzj = zzj(readString6, readString7);
                parcel2.writeNoException();
                parcel2.writeList(zzj);
                return true;
            case 10:
                String zzf = zzf();
                parcel2.writeNoException();
                parcel2.writeString(zzf);
                return true;
            case 11:
                String zzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(zzi);
                return true;
            case 12:
                long zzc = zzc();
                parcel2.writeNoException();
                parcel2.writeLong(zzc);
                return true;
            case 13:
                String readString8 = parcel.readString();
                zzaqx.zzc(parcel);
                zzl(readString8);
                parcel2.writeNoException();
                return true;
            case 14:
                String readString9 = parcel.readString();
                zzaqx.zzc(parcel);
                zzn(readString9);
                parcel2.writeNoException();
                return true;
            case 15:
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                zzaqx.zzc(parcel);
                zzs(asInterface2, readString10, readString11);
                parcel2.writeNoException();
                return true;
            case 16:
                String zzh2 = zzh();
                parcel2.writeNoException();
                parcel2.writeString(zzh2);
                return true;
            case 17:
                String zzg = zzg();
                parcel2.writeNoException();
                parcel2.writeString(zzg);
                return true;
            case 18:
                String zze = zze();
                parcel2.writeNoException();
                parcel2.writeString(zze);
                return true;
            case 19:
                zzaqx.zzc(parcel);
                zzr((Bundle) zzaqx.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
