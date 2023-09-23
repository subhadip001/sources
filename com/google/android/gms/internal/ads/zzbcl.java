package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzbcl extends zzaqw implements zzbcm {
    public zzbcl() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final boolean zzbI(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            zzf();
        } else if (i2 == 2) {
            zzc();
        } else if (i2 == 3) {
            zzaqx.zzc(parcel);
            zzd((com.google.android.gms.ads.internal.client.zze) zzaqx.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR));
        } else if (i2 == 4) {
            zze();
        } else if (i2 != 5) {
            return false;
        } else {
            zzb();
        }
        parcel2.writeNoException();
        return true;
    }
}
