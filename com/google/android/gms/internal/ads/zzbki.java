package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbki extends zzaqv implements IInterface {
    public zzbki(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
    }

    public final void zze(zzbze zzbzeVar) {
        Parcel zza = zza();
        zzaqx.zzg(zza, zzbzeVar);
        zzbl(1, zza);
    }
}
