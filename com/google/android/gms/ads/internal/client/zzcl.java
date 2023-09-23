package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzaqw;
import com.google.android.gms.internal.ads.zzaqx;
import com.google.android.gms.internal.ads.zzbql;
import com.google.android.gms.internal.ads.zzbqm;
import com.google.android.gms.internal.ads.zzbty;
import com.google.android.gms.internal.ads.zzbtz;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzcl extends zzaqw implements zzcm {
    public zzcl() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final boolean zzbI(int i2, Parcel parcel, Parcel parcel2, int i3) {
        zzcy zzcwVar;
        switch (i2) {
            case 1:
                zzj();
                parcel2.writeNoException();
                return true;
            case 2:
                float readFloat = parcel.readFloat();
                zzaqx.zzc(parcel);
                zzp(readFloat);
                parcel2.writeNoException();
                return true;
            case 3:
                String readString = parcel.readString();
                zzaqx.zzc(parcel);
                zzq(readString);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean zzh = zzaqx.zzh(parcel);
                zzaqx.zzc(parcel);
                zzo(zzh);
                parcel2.writeNoException();
                return true;
            case 5:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String readString2 = parcel.readString();
                zzaqx.zzc(parcel);
                zzm(asInterface, readString2);
                parcel2.writeNoException();
                return true;
            case 6:
                String readString3 = parcel.readString();
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzaqx.zzc(parcel);
                zzk(readString3, asInterface2);
                parcel2.writeNoException();
                return true;
            case 7:
                float zze = zze();
                parcel2.writeNoException();
                parcel2.writeFloat(zze);
                return true;
            case 8:
                boolean zzt = zzt();
                parcel2.writeNoException();
                zzaqx.zzd(parcel2, zzt);
                return true;
            case 9:
                String zzf = zzf();
                parcel2.writeNoException();
                parcel2.writeString(zzf);
                return true;
            case 10:
                String readString4 = parcel.readString();
                zzaqx.zzc(parcel);
                zzh(readString4);
                parcel2.writeNoException();
                return true;
            case 11:
                zzbtz zzf2 = zzbty.zzf(parcel.readStrongBinder());
                zzaqx.zzc(parcel);
                zzn(zzf2);
                parcel2.writeNoException();
                return true;
            case 12:
                zzbqm zzc = zzbql.zzc(parcel.readStrongBinder());
                zzaqx.zzc(parcel);
                zzr(zzc);
                parcel2.writeNoException();
                return true;
            case 13:
                List zzg = zzg();
                parcel2.writeNoException();
                parcel2.writeTypedList(zzg);
                return true;
            case 14:
                zzaqx.zzc(parcel);
                zzs((zzfa) zzaqx.zza(parcel, zzfa.CREATOR));
                parcel2.writeNoException();
                return true;
            case 15:
                zzi();
                parcel2.writeNoException();
                return true;
            case 16:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzcwVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
                    zzcwVar = queryLocalInterface instanceof zzcy ? (zzcy) queryLocalInterface : new zzcw(readStrongBinder);
                }
                zzaqx.zzc(parcel);
                zzl(zzcwVar);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
