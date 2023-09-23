package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzbzd extends zzaqw implements zzbze {
    public zzbzd() {
        super("com.google.android.gms.ads.internal.report.IDynamiteErrorEventListener");
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final boolean zzbI(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            zzb();
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
