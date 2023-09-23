package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfme extends zzaqv implements IInterface {
    public zzfme(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final zzfmc zze(zzfma zzfmaVar) {
        Parcel zza = zza();
        zzaqx.zze(zza, zzfmaVar);
        Parcel zzbk = zzbk(1, zza);
        zzfmc zzfmcVar = (zzfmc) zzaqx.zza(zzbk, zzfmc.CREATOR);
        zzbk.recycle();
        return zzfmcVar;
    }

    public final zzfml zzf(zzfmj zzfmjVar) {
        Parcel zza = zza();
        zzaqx.zze(zza, zzfmjVar);
        Parcel zzbk = zzbk(3, zza);
        zzfml zzfmlVar = (zzfml) zzaqx.zza(zzbk, zzfml.CREATOR);
        zzbk.recycle();
        return zzfmlVar;
    }

    public final void zzg(zzflx zzflxVar) {
        Parcel zza = zza();
        zzaqx.zze(zza, zzflxVar);
        zzbl(2, zza);
    }
}
