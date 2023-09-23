package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbpe extends zzaqv implements zzbpg {
    public zzbpe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbpg
    public final void zzb(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzbl(1, zza);
    }
}
