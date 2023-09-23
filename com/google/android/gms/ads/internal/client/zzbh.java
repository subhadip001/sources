package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaqw;
import com.google.android.gms.internal.ads.zzaqx;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzbh extends zzaqw implements zzbi {
    public zzbh() {
        super("com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final boolean zzbI(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            zzc();
        } else if (i2 != 2) {
            return false;
        } else {
            zzaqx.zzc(parcel);
            zzb((zze) zzaqx.zza(parcel, zze.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
