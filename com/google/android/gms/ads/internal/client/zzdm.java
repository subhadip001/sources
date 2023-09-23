package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaqw;
import com.google.android.gms.internal.ads.zzaqx;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzdm extends zzaqw implements zzdn {
    public zzdm() {
        super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final boolean zzbI(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            zzi();
        } else if (i2 == 2) {
            zzh();
        } else if (i2 == 3) {
            zzg();
        } else if (i2 == 4) {
            zze();
        } else if (i2 != 5) {
            return false;
        } else {
            boolean zzh = zzaqx.zzh(parcel);
            zzaqx.zzc(parcel);
            zzf(zzh);
        }
        parcel2.writeNoException();
        return true;
    }
}
