package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzbpw extends zzaqw implements zzbpx {
    public zzbpw() {
        super("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final boolean zzbI(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            zzaqx.zzc(parcel);
            zzb((ParcelFileDescriptor) zzaqx.zza(parcel, ParcelFileDescriptor.CREATOR));
            return true;
        }
        return false;
    }
}
