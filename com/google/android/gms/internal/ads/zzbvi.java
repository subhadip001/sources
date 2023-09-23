package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzbvi extends zzaqw implements zzbvj {
    public zzbvi() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final boolean zzbI(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 2) {
            zzg();
        } else if (i2 == 3) {
            String readString = parcel.readString();
            zzaqx.zzc(parcel);
            zze(readString);
        } else if (i2 != 4) {
            return false;
        } else {
            zzaqx.zzc(parcel);
            zzf((com.google.android.gms.ads.internal.client.zze) zzaqx.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
