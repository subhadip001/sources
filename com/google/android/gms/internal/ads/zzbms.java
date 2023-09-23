package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbms extends zzaqv implements zzbmu {
    public zzbms(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbmu
    public final void zze() {
        zzbl(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbmu
    public final void zzf(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzbl(1, zza);
    }
}
