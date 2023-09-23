package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbmj extends zzaqv implements zzbml {
    public zzbmj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbml
    public final void zze(com.google.android.gms.ads.internal.client.zzbs zzbsVar, IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzaqx.zzg(zza, zzbsVar);
        zzaqx.zzg(zza, iObjectWrapper);
        zzbl(1, zza);
    }
}
