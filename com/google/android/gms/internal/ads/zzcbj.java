package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzcbj extends zzaqw implements zzcbk {
    public zzcbj() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final boolean zzbI(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            zzg();
        } else if (i2 == 2) {
            int readInt = parcel.readInt();
            zzaqx.zzc(parcel);
            zze(readInt);
        } else if (i2 != 3) {
            return false;
        } else {
            zzaqx.zzc(parcel);
            zzf((com.google.android.gms.ads.internal.client.zze) zzaqx.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
