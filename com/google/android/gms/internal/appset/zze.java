package com.google.android.gms.internal.appset;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
/* loaded from: classes.dex */
public abstract class zze extends zzb implements zzf {
    public zze() {
        super("com.google.android.gms.appset.internal.IAppSetIdCallback");
    }

    @Override // com.google.android.gms.internal.appset.zzb
    public final boolean zza(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            zzb((Status) zzc.zza(parcel, Status.CREATOR), (com.google.android.gms.appset.zzc) zzc.zza(parcel, com.google.android.gms.appset.zzc.CREATOR));
            return true;
        }
        return false;
    }
}
