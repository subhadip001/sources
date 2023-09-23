package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzaqw;
import com.google.android.gms.internal.ads.zzaqx;
import com.google.android.gms.internal.ads.zzbko;
import com.google.android.gms.internal.ads.zzblx;
import com.google.android.gms.internal.ads.zzbly;
import com.google.android.gms.internal.ads.zzbma;
import com.google.android.gms.internal.ads.zzbmb;
import com.google.android.gms.internal.ads.zzbmd;
import com.google.android.gms.internal.ads.zzbme;
import com.google.android.gms.internal.ads.zzbmg;
import com.google.android.gms.internal.ads.zzbmh;
import com.google.android.gms.internal.ads.zzbmk;
import com.google.android.gms.internal.ads.zzbmn;
import com.google.android.gms.internal.ads.zzbmo;
import com.google.android.gms.internal.ads.zzbqr;
import com.google.android.gms.internal.ads.zzbqz;
import com.google.android.gms.internal.ads.zzbra;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzbn extends zzaqw implements zzbo {
    public zzbn() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final boolean zzbI(int i2, Parcel parcel, Parcel parcel2, int i3) {
        zzbf zzbfVar = null;
        zzcd zzcdVar = null;
        switch (i2) {
            case 1:
                zzbl zze = zze();
                parcel2.writeNoException();
                zzaqx.zzg(parcel2, zze);
                return true;
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    zzbfVar = queryLocalInterface instanceof zzbf ? (zzbf) queryLocalInterface : new zzbd(readStrongBinder);
                }
                zzaqx.zzc(parcel);
                zzl(zzbfVar);
                parcel2.writeNoException();
                return true;
            case 3:
                zzbly zzb = zzblx.zzb(parcel.readStrongBinder());
                zzaqx.zzc(parcel);
                zzf(zzb);
                parcel2.writeNoException();
                return true;
            case 4:
                zzbmb zzb2 = zzbma.zzb(parcel.readStrongBinder());
                zzaqx.zzc(parcel);
                zzg(zzb2);
                parcel2.writeNoException();
                return true;
            case 5:
                String readString = parcel.readString();
                zzbmh zzb3 = zzbmg.zzb(parcel.readStrongBinder());
                zzbme zzb4 = zzbmd.zzb(parcel.readStrongBinder());
                zzaqx.zzc(parcel);
                zzh(readString, zzb3, zzb4);
                parcel2.writeNoException();
                return true;
            case 6:
                zzaqx.zzc(parcel);
                zzo((zzbko) zzaqx.zza(parcel, zzbko.CREATOR));
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    zzcdVar = queryLocalInterface2 instanceof zzcd ? (zzcd) queryLocalInterface2 : new zzcd(readStrongBinder2);
                }
                zzaqx.zzc(parcel);
                zzq(zzcdVar);
                parcel2.writeNoException();
                return true;
            case 8:
                zzaqx.zzc(parcel);
                zzj(zzbmk.zzb(parcel.readStrongBinder()), (zzq) zzaqx.zza(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                return true;
            case 9:
                zzaqx.zzc(parcel);
                zzp((PublisherAdViewOptions) zzaqx.zza(parcel, PublisherAdViewOptions.CREATOR));
                parcel2.writeNoException();
                return true;
            case 10:
                zzbmo zzb5 = zzbmn.zzb(parcel.readStrongBinder());
                zzaqx.zzc(parcel);
                zzk(zzb5);
                parcel2.writeNoException();
                return true;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                zzaqx.zzc(parcel);
                zzn((zzbqr) zzaqx.zza(parcel, zzbqr.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                zzbra zzb6 = zzbqz.zzb(parcel.readStrongBinder());
                zzaqx.zzc(parcel);
                zzi(zzb6);
                parcel2.writeNoException();
                return true;
            case 15:
                zzaqx.zzc(parcel);
                zzm((AdManagerAdViewOptions) zzaqx.zza(parcel, AdManagerAdViewOptions.CREATOR));
                parcel2.writeNoException();
                return true;
        }
    }
}
