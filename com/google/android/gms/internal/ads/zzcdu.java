package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcdu extends zzaqv implements zzcdw {
    public zzcdu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzcdw
    public final void zzb(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzbl(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcdw
    public final void zzc(String str, String str2, Bundle bundle) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzaqx.zze(zza, bundle);
        zzbl(3, zza);
    }
}
