package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzbvf extends zzaqw implements zzbvg {
    public zzbvf() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final boolean zzbI(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzaqx.zzc(parcel);
            zzg(asInterface);
        } else if (i2 == 2) {
            String readString = parcel.readString();
            zzaqx.zzc(parcel);
            zze(readString);
        } else if (i2 == 3) {
            zzaqx.zzc(parcel);
            zzf((com.google.android.gms.ads.internal.client.zze) zzaqx.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR));
        } else if (i2 != 4) {
            return false;
        } else {
            zzbui zzb = zzbuh.zzb(parcel.readStrongBinder());
            zzaqx.zzc(parcel);
            zzh(zzb);
        }
        parcel2.writeNoException();
        return true;
    }
}
