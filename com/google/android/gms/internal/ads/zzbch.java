package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzbch extends zzaqw implements zzbci {
    public zzbch() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    public static zzbci zze(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
        return queryLocalInterface instanceof zzbci ? (zzbci) queryLocalInterface : new zzbcg(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final boolean zzbI(int i2, Parcel parcel, Parcel parcel2, int i3) {
        zzbcf zzbcdVar;
        if (i2 == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzbcdVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
                zzbcdVar = queryLocalInterface instanceof zzbcf ? (zzbcf) queryLocalInterface : new zzbcd(readStrongBinder);
            }
            zzaqx.zzc(parcel);
            zzd(zzbcdVar);
        } else if (i2 == 2) {
            parcel.readInt();
            zzaqx.zzc(parcel);
        } else if (i2 != 3) {
            return false;
        } else {
            zzaqx.zzc(parcel);
            zzc((com.google.android.gms.ads.internal.client.zze) zzaqx.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
