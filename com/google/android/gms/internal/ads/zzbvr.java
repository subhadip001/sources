package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzbvr extends zzaqw implements zzbvs {
    public zzbvr() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public static zzbvs zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        return queryLocalInterface instanceof zzbvs ? (zzbvs) queryLocalInterface : new zzbvq(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final boolean zzbI(int i2, Parcel parcel, Parcel parcel2, int i3) {
        zzbvv zzbvvVar = null;
        zzbvm zzbvkVar = null;
        zzbvg zzbveVar = null;
        zzbvp zzbvnVar = null;
        zzbvm zzbvkVar2 = null;
        zzbvp zzbvnVar2 = null;
        zzbvj zzbvhVar = null;
        zzbvg zzbveVar2 = null;
        if (i2 == 1) {
            IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            String readString = parcel.readString();
            Parcelable.Creator creator = Bundle.CREATOR;
            Bundle bundle = (Bundle) zzaqx.zza(parcel, creator);
            Bundle bundle2 = (Bundle) zzaqx.zza(parcel, creator);
            com.google.android.gms.ads.internal.client.zzq zzqVar = (com.google.android.gms.ads.internal.client.zzq) zzaqx.zza(parcel, com.google.android.gms.ads.internal.client.zzq.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                zzbvvVar = queryLocalInterface instanceof zzbvv ? (zzbvv) queryLocalInterface : new zzbvt(readStrongBinder);
            }
            zzbvv zzbvvVar2 = zzbvvVar;
            zzaqx.zzc(parcel);
            zzh(asInterface, readString, bundle, bundle2, zzqVar, zzbvvVar2);
            parcel2.writeNoException();
        } else if (i2 == 2) {
            zzbwf zzf = zzf();
            parcel2.writeNoException();
            zzaqx.zzf(parcel2, zzf);
        } else if (i2 == 3) {
            zzbwf zzg = zzg();
            parcel2.writeNoException();
            zzaqx.zzf(parcel2, zzg);
        } else if (i2 == 5) {
            com.google.android.gms.ads.internal.client.zzdk zze = zze();
            parcel2.writeNoException();
            zzaqx.zzg(parcel2, zze);
        } else if (i2 == 10) {
            IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzaqx.zzc(parcel);
            parcel2.writeNoException();
        } else if (i2 != 11) {
            switch (i2) {
                case 13:
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzl zzlVar = (com.google.android.gms.ads.internal.client.zzl) zzaqx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                    IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder2 = parcel.readStrongBinder();
                    if (readStrongBinder2 != null) {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        zzbveVar2 = queryLocalInterface2 instanceof zzbvg ? (zzbvg) queryLocalInterface2 : new zzbve(readStrongBinder2);
                    }
                    zzbvg zzbvgVar = zzbveVar2;
                    zzaqx.zzc(parcel);
                    zzi(readString2, readString3, zzlVar, asInterface2, zzbvgVar, zzbue.zzb(parcel.readStrongBinder()), (com.google.android.gms.ads.internal.client.zzq) zzaqx.zza(parcel, com.google.android.gms.ads.internal.client.zzq.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 14:
                    String readString4 = parcel.readString();
                    String readString5 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzl zzlVar2 = (com.google.android.gms.ads.internal.client.zzl) zzaqx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                    IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder3 = parcel.readStrongBinder();
                    if (readStrongBinder3 != null) {
                        IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                        zzbvhVar = queryLocalInterface3 instanceof zzbvj ? (zzbvj) queryLocalInterface3 : new zzbvh(readStrongBinder3);
                    }
                    zzbvj zzbvjVar = zzbvhVar;
                    zzbuf zzb = zzbue.zzb(parcel.readStrongBinder());
                    zzaqx.zzc(parcel);
                    zzk(readString4, readString5, zzlVar2, asInterface3, zzbvjVar, zzb);
                    parcel2.writeNoException();
                    break;
                case 15:
                    IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    zzaqx.zzc(parcel);
                    boolean zzq = zzq(asInterface4);
                    parcel2.writeNoException();
                    zzaqx.zzd(parcel2, zzq);
                    break;
                case 16:
                    String readString6 = parcel.readString();
                    String readString7 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzl zzlVar3 = (com.google.android.gms.ads.internal.client.zzl) zzaqx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                    IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder4 = parcel.readStrongBinder();
                    if (readStrongBinder4 != null) {
                        IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        zzbvnVar2 = queryLocalInterface4 instanceof zzbvp ? (zzbvp) queryLocalInterface4 : new zzbvn(readStrongBinder4);
                    }
                    zzbvp zzbvpVar = zzbvnVar2;
                    zzbuf zzb2 = zzbue.zzb(parcel.readStrongBinder());
                    zzaqx.zzc(parcel);
                    zzo(readString6, readString7, zzlVar3, asInterface5, zzbvpVar, zzb2);
                    parcel2.writeNoException();
                    break;
                case 17:
                    IObjectWrapper asInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    zzaqx.zzc(parcel);
                    boolean zzr = zzr(asInterface6);
                    parcel2.writeNoException();
                    zzaqx.zzd(parcel2, zzr);
                    break;
                case 18:
                    String readString8 = parcel.readString();
                    String readString9 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzl zzlVar4 = (com.google.android.gms.ads.internal.client.zzl) zzaqx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                    IObjectWrapper asInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder5 = parcel.readStrongBinder();
                    if (readStrongBinder5 != null) {
                        IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        zzbvkVar2 = queryLocalInterface5 instanceof zzbvm ? (zzbvm) queryLocalInterface5 : new zzbvk(readStrongBinder5);
                    }
                    zzbvm zzbvmVar = zzbvkVar2;
                    zzbuf zzb3 = zzbue.zzb(parcel.readStrongBinder());
                    zzaqx.zzc(parcel);
                    zzl(readString8, readString9, zzlVar4, asInterface7, zzbvmVar, zzb3);
                    parcel2.writeNoException();
                    break;
                case 19:
                    String readString10 = parcel.readString();
                    zzaqx.zzc(parcel);
                    zzp(readString10);
                    parcel2.writeNoException();
                    break;
                case 20:
                    String readString11 = parcel.readString();
                    String readString12 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzl zzlVar5 = (com.google.android.gms.ads.internal.client.zzl) zzaqx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                    IObjectWrapper asInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder6 = parcel.readStrongBinder();
                    if (readStrongBinder6 != null) {
                        IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        zzbvnVar = queryLocalInterface6 instanceof zzbvp ? (zzbvp) queryLocalInterface6 : new zzbvn(readStrongBinder6);
                    }
                    zzbvp zzbvpVar2 = zzbvnVar;
                    zzbuf zzb4 = zzbue.zzb(parcel.readStrongBinder());
                    zzaqx.zzc(parcel);
                    zzn(readString11, readString12, zzlVar5, asInterface8, zzbvpVar2, zzb4);
                    parcel2.writeNoException();
                    break;
                case 21:
                    String readString13 = parcel.readString();
                    String readString14 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzl zzlVar6 = (com.google.android.gms.ads.internal.client.zzl) zzaqx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                    IObjectWrapper asInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder7 = parcel.readStrongBinder();
                    if (readStrongBinder7 != null) {
                        IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        zzbveVar = queryLocalInterface7 instanceof zzbvg ? (zzbvg) queryLocalInterface7 : new zzbve(readStrongBinder7);
                    }
                    zzbvg zzbvgVar2 = zzbveVar;
                    zzaqx.zzc(parcel);
                    zzj(readString13, readString14, zzlVar6, asInterface9, zzbvgVar2, zzbue.zzb(parcel.readStrongBinder()), (com.google.android.gms.ads.internal.client.zzq) zzaqx.zza(parcel, com.google.android.gms.ads.internal.client.zzq.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 22:
                    String readString15 = parcel.readString();
                    String readString16 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzl zzlVar7 = (com.google.android.gms.ads.internal.client.zzl) zzaqx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                    IObjectWrapper asInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder8 = parcel.readStrongBinder();
                    if (readStrongBinder8 != null) {
                        IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        zzbvkVar = queryLocalInterface8 instanceof zzbvm ? (zzbvm) queryLocalInterface8 : new zzbvk(readStrongBinder8);
                    }
                    zzbvm zzbvmVar2 = zzbvkVar;
                    zzaqx.zzc(parcel);
                    zzm(readString15, readString16, zzlVar7, asInterface10, zzbvmVar2, zzbue.zzb(parcel.readStrongBinder()), (zzbko) zzaqx.zza(parcel, zzbko.CREATOR));
                    parcel2.writeNoException();
                    break;
                default:
                    return false;
            }
        } else {
            parcel.createStringArray();
            Bundle[] bundleArr = (Bundle[]) parcel.createTypedArray(Bundle.CREATOR);
            zzaqx.zzc(parcel);
            parcel2.writeNoException();
        }
        return true;
    }
}
