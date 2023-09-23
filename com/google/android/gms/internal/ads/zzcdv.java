package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzcdv extends zzaqw implements zzcdw {
    public zzcdv() {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final boolean zzbI(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            parcel.readString();
            parcel.readString();
            zzaqx.zzc(parcel);
        } else if (i2 == 2) {
            String readString = parcel.readString();
            zzaqx.zzc(parcel);
            zzb(readString);
        } else if (i2 != 3) {
            return false;
        } else {
            zzaqx.zzc(parcel);
            zzc(parcel.readString(), parcel.readString(), (Bundle) zzaqx.zza(parcel, Bundle.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
