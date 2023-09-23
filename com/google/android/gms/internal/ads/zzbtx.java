package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbtx extends zzaqv implements zzbtz {
    public zzbtx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final zzbuc zzb(String str) {
        zzbuc zzbuaVar;
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzbk = zzbk(1, zza);
        IBinder readStrongBinder = zzbk.readStrongBinder();
        if (readStrongBinder == null) {
            zzbuaVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            zzbuaVar = queryLocalInterface instanceof zzbuc ? (zzbuc) queryLocalInterface : new zzbua(readStrongBinder);
        }
        zzbk.recycle();
        return zzbuaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final zzbvs zzc(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzbk = zzbk(3, zza);
        zzbvs zzb = zzbvr.zzb(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final boolean zzd(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzbk = zzbk(4, zza);
        boolean zzh = zzaqx.zzh(zzbk);
        zzbk.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final boolean zze(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzbk = zzbk(2, zza);
        boolean zzh = zzaqx.zzh(zzbk);
        zzbk.recycle();
        return zzh;
    }
}
