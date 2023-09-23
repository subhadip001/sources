package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbmm extends zzaqv implements zzbmo {
    public zzbmm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbmo
    public final void zze(zzbmx zzbmxVar) {
        Parcel zza = zza();
        zzaqx.zzg(zza, zzbmxVar);
        zzbl(1, zza);
    }
}
