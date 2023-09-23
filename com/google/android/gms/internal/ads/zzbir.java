package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbir extends zzaqv implements zzbit {
    public zzbir(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbit
    public final void zze(zzbiq zzbiqVar) {
        Parcel zza = zza();
        zzaqx.zzg(zza, zzbiqVar);
        zzbl(1, zza);
    }
}
