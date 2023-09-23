package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzbzp extends zzaqw implements zzbzq {
    public zzbzp() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final boolean zzbI(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            zzaqx.zzc(parcel);
            zzf((ParcelFileDescriptor) zzaqx.zza(parcel, ParcelFileDescriptor.CREATOR));
        } else if (i2 != 2) {
            return false;
        } else {
            zzaqx.zzc(parcel);
            zze((com.google.android.gms.ads.internal.util.zzaz) zzaqx.zza(parcel, com.google.android.gms.ads.internal.util.zzaz.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
