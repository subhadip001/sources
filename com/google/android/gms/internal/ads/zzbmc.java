package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbmc extends zzaqv implements zzbme {
    public zzbmc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final void zze(zzblu zzbluVar, String str) {
        Parcel zza = zza();
        zzaqx.zzg(zza, zzbluVar);
        zza.writeString(str);
        zzbl(1, zza);
    }
}
