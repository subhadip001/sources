package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzaqw;
import com.google.android.gms.internal.ads.zzaqx;
import com.google.android.gms.internal.ads.zzble;
import com.google.android.gms.internal.ads.zzblk;
import com.google.android.gms.internal.ads.zzbpf;
import com.google.android.gms.internal.ads.zzbpg;
import com.google.android.gms.internal.ads.zzbpj;
import com.google.android.gms.internal.ads.zzbty;
import com.google.android.gms.internal.ads.zzbtz;
import com.google.android.gms.internal.ads.zzbxk;
import com.google.android.gms.internal.ads.zzbxu;
import com.google.android.gms.internal.ads.zzcan;
import com.google.android.gms.internal.ads.zzcbd;
import com.google.android.gms.internal.ads.zzcdz;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzcb extends zzaqw implements zzcc {
    public zzcb() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final boolean zzbI(int i2, Parcel parcel, Parcel parcel2, int i3) {
        switch (i2) {
            case 1:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzq zzqVar = (zzq) zzaqx.zza(parcel, zzq.CREATOR);
                String readString = parcel.readString();
                zzbtz zzf = zzbty.zzf(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                zzaqx.zzc(parcel);
                zzbs zzd = zzd(asInterface, zzqVar, readString, zzf, readInt);
                parcel2.writeNoException();
                zzaqx.zzg(parcel2, zzd);
                return true;
            case 2:
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzq zzqVar2 = (zzq) zzaqx.zza(parcel, zzq.CREATOR);
                String readString2 = parcel.readString();
                zzbtz zzf2 = zzbty.zzf(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                zzaqx.zzc(parcel);
                zzbs zze = zze(asInterface2, zzqVar2, readString2, zzf2, readInt2);
                parcel2.writeNoException();
                zzaqx.zzg(parcel2, zze);
                return true;
            case 3:
                IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String readString3 = parcel.readString();
                zzbtz zzf3 = zzbty.zzf(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                zzaqx.zzc(parcel);
                zzbo zzb = zzb(asInterface3, readString3, zzf3, readInt3);
                parcel2.writeNoException();
                zzaqx.zzg(parcel2, zzb);
                return true;
            case 4:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzaqx.zzc(parcel);
                parcel2.writeNoException();
                zzaqx.zzg(parcel2, null);
                return true;
            case 5:
                IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzaqx.zzc(parcel);
                zzble zzh = zzh(asInterface4, asInterface5);
                parcel2.writeNoException();
                zzaqx.zzg(parcel2, zzh);
                return true;
            case 6:
                IObjectWrapper asInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbtz zzf4 = zzbty.zzf(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                zzaqx.zzc(parcel);
                zzcan zzm = zzm(asInterface6, zzf4, readInt4);
                parcel2.writeNoException();
                zzaqx.zzg(parcel2, zzm);
                return true;
            case 7:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzaqx.zzc(parcel);
                parcel2.writeNoException();
                zzaqx.zzg(parcel2, null);
                return true;
            case 8:
                IObjectWrapper asInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzaqx.zzc(parcel);
                zzbxu zzl = zzl(asInterface7);
                parcel2.writeNoException();
                zzaqx.zzg(parcel2, zzl);
                return true;
            case 9:
                IObjectWrapper asInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                int readInt5 = parcel.readInt();
                zzaqx.zzc(parcel);
                zzcm zzg = zzg(asInterface8, readInt5);
                parcel2.writeNoException();
                zzaqx.zzg(parcel2, zzg);
                return true;
            case 10:
                String readString4 = parcel.readString();
                int readInt6 = parcel.readInt();
                zzaqx.zzc(parcel);
                zzbs zzf5 = zzf(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (zzq) zzaqx.zza(parcel, zzq.CREATOR), readString4, readInt6);
                parcel2.writeNoException();
                zzaqx.zzg(parcel2, zzf5);
                return true;
            case 11:
                IObjectWrapper asInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzaqx.zzc(parcel);
                zzblk zzi = zzi(asInterface9, asInterface10, asInterface11);
                parcel2.writeNoException();
                zzaqx.zzg(parcel2, zzi);
                return true;
            case 12:
                IObjectWrapper asInterface12 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String readString5 = parcel.readString();
                zzbtz zzf6 = zzbty.zzf(parcel.readStrongBinder());
                int readInt7 = parcel.readInt();
                zzaqx.zzc(parcel);
                zzcbd zzn = zzn(asInterface12, readString5, zzf6, readInt7);
                parcel2.writeNoException();
                zzaqx.zzg(parcel2, zzn);
                return true;
            case 13:
                IObjectWrapper asInterface13 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzq zzqVar3 = (zzq) zzaqx.zza(parcel, zzq.CREATOR);
                String readString6 = parcel.readString();
                zzbtz zzf7 = zzbty.zzf(parcel.readStrongBinder());
                int readInt8 = parcel.readInt();
                zzaqx.zzc(parcel);
                zzbs zzc = zzc(asInterface13, zzqVar3, readString6, zzf7, readInt8);
                parcel2.writeNoException();
                zzaqx.zzg(parcel2, zzc);
                return true;
            case 14:
                IObjectWrapper asInterface14 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbtz zzf8 = zzbty.zzf(parcel.readStrongBinder());
                int readInt9 = parcel.readInt();
                zzaqx.zzc(parcel);
                zzcdz zzo = zzo(asInterface14, zzf8, readInt9);
                parcel2.writeNoException();
                zzaqx.zzg(parcel2, zzo);
                return true;
            case 15:
                IObjectWrapper asInterface15 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbtz zzf9 = zzbty.zzf(parcel.readStrongBinder());
                int readInt10 = parcel.readInt();
                zzaqx.zzc(parcel);
                zzbxk zzk = zzk(asInterface15, zzf9, readInt10);
                parcel2.writeNoException();
                zzaqx.zzg(parcel2, zzk);
                return true;
            case 16:
                IObjectWrapper asInterface16 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbtz zzf10 = zzbty.zzf(parcel.readStrongBinder());
                int readInt11 = parcel.readInt();
                zzbpg zzc2 = zzbpf.zzc(parcel.readStrongBinder());
                zzaqx.zzc(parcel);
                zzbpj zzj = zzj(asInterface16, zzf10, readInt11, zzc2);
                parcel2.writeNoException();
                zzaqx.zzg(parcel2, zzj);
                return true;
            default:
                return false;
        }
    }
}
