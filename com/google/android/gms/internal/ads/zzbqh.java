package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbqh extends zzaqv implements zzbqj {
    public zzbqh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbqj
    public final void zze(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzbl(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqj
    public final void zzf() {
        zzbl(2, zza());
    }
}
