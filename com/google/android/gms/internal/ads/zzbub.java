package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzbub extends zzaqw implements zzbuc {
    public zzbub() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final boolean zzbI(int i2, Parcel parcel, Parcel parcel2, int i3) {
        zzbuf zzbufVar = null;
        switch (i2) {
            case 1:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzq zzqVar = (com.google.android.gms.ads.internal.client.zzq) zzaqx.zza(parcel, com.google.android.gms.ads.internal.client.zzq.CREATOR);
                com.google.android.gms.ads.internal.client.zzl zzlVar = (com.google.android.gms.ads.internal.client.zzl) zzaqx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String readString = parcel.readString();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbufVar = queryLocalInterface instanceof zzbuf ? (zzbuf) queryLocalInterface : new zzbud(readStrongBinder);
                }
                zzbuf zzbufVar2 = zzbufVar;
                zzaqx.zzc(parcel);
                zzt(asInterface, zzqVar, zzlVar, readString, zzbufVar2);
                parcel2.writeNoException();
                return true;
            case 2:
                IObjectWrapper zzn = zzn();
                parcel2.writeNoException();
                zzaqx.zzg(parcel2, zzn);
                return true;
            case 3:
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzl zzlVar2 = (com.google.android.gms.ads.internal.client.zzl) zzaqx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String readString2 = parcel.readString();
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbufVar = queryLocalInterface2 instanceof zzbuf ? (zzbuf) queryLocalInterface2 : new zzbud(readStrongBinder2);
                }
                zzaqx.zzc(parcel);
                zzw(asInterface2, zzlVar2, readString2, zzbufVar);
                parcel2.writeNoException();
                return true;
            case 4:
                zzG();
                parcel2.writeNoException();
                return true;
            case 5:
                zzo();
                parcel2.writeNoException();
                return true;
            case 6:
                IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzq zzqVar2 = (com.google.android.gms.ads.internal.client.zzq) zzaqx.zza(parcel, com.google.android.gms.ads.internal.client.zzq.CREATOR);
                com.google.android.gms.ads.internal.client.zzl zzlVar3 = (com.google.android.gms.ads.internal.client.zzl) zzaqx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbufVar = queryLocalInterface3 instanceof zzbuf ? (zzbuf) queryLocalInterface3 : new zzbud(readStrongBinder3);
                }
                zzbuf zzbufVar3 = zzbufVar;
                zzaqx.zzc(parcel);
                zzu(asInterface3, zzqVar2, zzlVar3, readString3, readString4, zzbufVar3);
                parcel2.writeNoException();
                return true;
            case 7:
                IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzl zzlVar4 = (com.google.android.gms.ads.internal.client.zzl) zzaqx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbufVar = queryLocalInterface4 instanceof zzbuf ? (zzbuf) queryLocalInterface4 : new zzbud(readStrongBinder4);
                }
                zzbuf zzbufVar4 = zzbufVar;
                zzaqx.zzc(parcel);
                zzx(asInterface4, zzlVar4, readString5, readString6, zzbufVar4);
                parcel2.writeNoException();
                return true;
            case 8:
                zzD();
                parcel2.writeNoException();
                return true;
            case 9:
                zzE();
                parcel2.writeNoException();
                return true;
            case 10:
                IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzl zzlVar5 = (com.google.android.gms.ads.internal.client.zzl) zzaqx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String readString7 = parcel.readString();
                zzcav zzb = zzcau.zzb(parcel.readStrongBinder());
                String readString8 = parcel.readString();
                zzaqx.zzc(parcel);
                zzp(asInterface5, zzlVar5, readString7, zzb, readString8);
                parcel2.writeNoException();
                return true;
            case 11:
                String readString9 = parcel.readString();
                zzaqx.zzc(parcel);
                zzs((com.google.android.gms.ads.internal.client.zzl) zzaqx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR), readString9);
                parcel2.writeNoException();
                return true;
            case 12:
                zzJ();
                parcel2.writeNoException();
                return true;
            case 13:
                boolean zzL = zzL();
                parcel2.writeNoException();
                zzaqx.zzd(parcel2, zzL);
                return true;
            case 14:
                IObjectWrapper asInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzl zzlVar6 = (com.google.android.gms.ads.internal.client.zzl) zzaqx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbufVar = queryLocalInterface5 instanceof zzbuf ? (zzbuf) queryLocalInterface5 : new zzbud(readStrongBinder5);
                }
                zzbuf zzbufVar5 = zzbufVar;
                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                zzaqx.zzc(parcel);
                zzy(asInterface6, zzlVar6, readString10, readString11, zzbufVar5, (zzbko) zzaqx.zza(parcel, zzbko.CREATOR), createStringArrayList);
                parcel2.writeNoException();
                return true;
            case 15:
                parcel2.writeNoException();
                zzaqx.zzg(parcel2, null);
                return true;
            case 16:
                parcel2.writeNoException();
                zzaqx.zzg(parcel2, null);
                return true;
            case 17:
                Bundle zze = zze();
                parcel2.writeNoException();
                zzaqx.zzf(parcel2, zze);
                return true;
            case 18:
                Bundle zzf = zzf();
                parcel2.writeNoException();
                zzaqx.zzf(parcel2, zzf);
                return true;
            case 19:
                Bundle zzg = zzg();
                parcel2.writeNoException();
                zzaqx.zzf(parcel2, zzg);
                return true;
            case 20:
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                zzaqx.zzc(parcel);
                zzA((com.google.android.gms.ads.internal.client.zzl) zzaqx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR), readString12, readString13);
                parcel2.writeNoException();
                return true;
            case 21:
                IObjectWrapper asInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzaqx.zzc(parcel);
                zzC(asInterface7);
                parcel2.writeNoException();
                return true;
            case 22:
                parcel2.writeNoException();
                zzaqx.zzd(parcel2, false);
                return true;
            case 23:
                IObjectWrapper asInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzcav zzb2 = zzcau.zzb(parcel.readStrongBinder());
                ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
                zzaqx.zzc(parcel);
                zzr(asInterface8, zzb2, createStringArrayList2);
                parcel2.writeNoException();
                return true;
            case 24:
                zzblu zzi = zzi();
                parcel2.writeNoException();
                zzaqx.zzg(parcel2, zzi);
                return true;
            case 25:
                boolean zzh = zzaqx.zzh(parcel);
                zzaqx.zzc(parcel);
                zzF(zzh);
                parcel2.writeNoException();
                return true;
            case 26:
                com.google.android.gms.ads.internal.client.zzdk zzh2 = zzh();
                parcel2.writeNoException();
                zzaqx.zzg(parcel2, zzh2);
                return true;
            case 27:
                zzbuo zzk = zzk();
                parcel2.writeNoException();
                zzaqx.zzg(parcel2, zzk);
                return true;
            case 28:
                IObjectWrapper asInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzl zzlVar7 = (com.google.android.gms.ads.internal.client.zzl) zzaqx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String readString14 = parcel.readString();
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbufVar = queryLocalInterface6 instanceof zzbuf ? (zzbuf) queryLocalInterface6 : new zzbud(readStrongBinder6);
                }
                zzaqx.zzc(parcel);
                zzz(asInterface9, zzlVar7, readString14, zzbufVar);
                parcel2.writeNoException();
                return true;
            case 29:
            default:
                return false;
            case 30:
                IObjectWrapper asInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzaqx.zzc(parcel);
                zzI(asInterface10);
                parcel2.writeNoException();
                return true;
            case 31:
                IObjectWrapper asInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbqj zzb3 = zzbqi.zzb(parcel.readStrongBinder());
                ArrayList createTypedArrayList = parcel.createTypedArrayList(zzbqp.CREATOR);
                zzaqx.zzc(parcel);
                zzq(asInterface11, zzb3, createTypedArrayList);
                parcel2.writeNoException();
                return true;
            case 32:
                IObjectWrapper asInterface12 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzl zzlVar8 = (com.google.android.gms.ads.internal.client.zzl) zzaqx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String readString15 = parcel.readString();
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbufVar = queryLocalInterface7 instanceof zzbuf ? (zzbuf) queryLocalInterface7 : new zzbud(readStrongBinder7);
                }
                zzaqx.zzc(parcel);
                zzB(asInterface12, zzlVar8, readString15, zzbufVar);
                parcel2.writeNoException();
                return true;
            case 33:
                zzbwf zzl = zzl();
                parcel2.writeNoException();
                zzaqx.zzf(parcel2, zzl);
                return true;
            case 34:
                zzbwf zzm = zzm();
                parcel2.writeNoException();
                zzaqx.zzf(parcel2, zzm);
                return true;
            case 35:
                IObjectWrapper asInterface13 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzq zzqVar3 = (com.google.android.gms.ads.internal.client.zzq) zzaqx.zza(parcel, com.google.android.gms.ads.internal.client.zzq.CREATOR);
                com.google.android.gms.ads.internal.client.zzl zzlVar9 = (com.google.android.gms.ads.internal.client.zzl) zzaqx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String readString16 = parcel.readString();
                String readString17 = parcel.readString();
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbufVar = queryLocalInterface8 instanceof zzbuf ? (zzbuf) queryLocalInterface8 : new zzbud(readStrongBinder8);
                }
                zzbuf zzbufVar6 = zzbufVar;
                zzaqx.zzc(parcel);
                zzv(asInterface13, zzqVar3, zzlVar9, readString16, readString17, zzbufVar6);
                parcel2.writeNoException();
                return true;
            case 36:
                zzbui zzj = zzj();
                parcel2.writeNoException();
                zzaqx.zzg(parcel2, zzj);
                return true;
            case 37:
                IObjectWrapper asInterface14 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzaqx.zzc(parcel);
                zzH(asInterface14);
                parcel2.writeNoException();
                return true;
        }
    }
}
