package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzbqw extends zzaqw implements zzbqx {
    public zzbqw() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final boolean zzbI(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 != 1) {
            if (i2 != 2) {
                return false;
            }
            parcel.readInt();
            zzaqx.zzc(parcel);
        }
        parcel2.writeNoException();
        return true;
    }
}
