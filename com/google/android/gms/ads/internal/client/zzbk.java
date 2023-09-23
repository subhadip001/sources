package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaqw;
import com.google.android.gms.internal.ads.zzaqx;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzbk extends zzaqw implements zzbl {
    public zzbk() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final boolean zzbI(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            zzaqx.zzc(parcel);
            zzg((zzl) zzaqx.zza(parcel, zzl.CREATOR));
            parcel2.writeNoException();
        } else if (i2 == 2) {
            String zze = zze();
            parcel2.writeNoException();
            parcel2.writeString(zze);
        } else if (i2 == 3) {
            boolean zzi = zzi();
            parcel2.writeNoException();
            zzaqx.zzd(parcel2, zzi);
        } else if (i2 == 4) {
            String zzf = zzf();
            parcel2.writeNoException();
            parcel2.writeString(zzf);
        } else if (i2 != 5) {
            return false;
        } else {
            int readInt = parcel.readInt();
            zzaqx.zzc(parcel);
            zzh((zzl) zzaqx.zza(parcel, zzl.CREATOR), readInt);
            parcel2.writeNoException();
        }
        return true;
    }
}
