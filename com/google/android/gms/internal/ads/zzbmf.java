package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbmf extends zzaqv implements zzbmh {
    public zzbmf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbmh
    public final void zze(zzblu zzbluVar) {
        Parcel zza = zza();
        zzaqx.zzg(zza, zzbluVar);
        zzbl(1, zza);
    }
}
