package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import f.a.b.a.a;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbuk extends zzaqv implements IInterface {
    public zzbuk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
    }

    public final double zze() {
        Parcel zzbk = zzbk(7, zza());
        double readDouble = zzbk.readDouble();
        zzbk.recycle();
        return readDouble;
    }

    public final Bundle zzf() {
        Parcel zzbk = zzbk(15, zza());
        Bundle bundle = (Bundle) zzaqx.zza(zzbk, Bundle.CREATOR);
        zzbk.recycle();
        return bundle;
    }

    public final com.google.android.gms.ads.internal.client.zzdk zzg() {
        Parcel zzbk = zzbk(17, zza());
        com.google.android.gms.ads.internal.client.zzdk zzb = com.google.android.gms.ads.internal.client.zzdj.zzb(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzb;
    }

    public final zzbks zzh() {
        Parcel zzbk = zzbk(19, zza());
        zzbks zzj = zzbkr.zzj(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzj;
    }

    public final zzbla zzi() {
        Parcel zzbk = zzbk(5, zza());
        zzbla zzg = zzbkz.zzg(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzg;
    }

    public final IObjectWrapper zzj() {
        return a.V(zzbk(18, zza()));
    }

    public final IObjectWrapper zzk() {
        return a.V(zzbk(20, zza()));
    }

    public final IObjectWrapper zzl() {
        return a.V(zzbk(21, zza()));
    }

    public final String zzm() {
        Parcel zzbk = zzbk(4, zza());
        String readString = zzbk.readString();
        zzbk.recycle();
        return readString;
    }

    public final String zzn() {
        Parcel zzbk = zzbk(6, zza());
        String readString = zzbk.readString();
        zzbk.recycle();
        return readString;
    }

    public final String zzo() {
        Parcel zzbk = zzbk(2, zza());
        String readString = zzbk.readString();
        zzbk.recycle();
        return readString;
    }

    public final String zzp() {
        Parcel zzbk = zzbk(9, zza());
        String readString = zzbk.readString();
        zzbk.recycle();
        return readString;
    }

    public final String zzq() {
        Parcel zzbk = zzbk(8, zza());
        String readString = zzbk.readString();
        zzbk.recycle();
        return readString;
    }

    public final List zzr() {
        Parcel zzbk = zzbk(3, zza());
        ArrayList zzb = zzaqx.zzb(zzbk);
        zzbk.recycle();
        return zzb;
    }

    public final void zzs(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zzbl(11, zza);
    }

    public final void zzt() {
        zzbl(10, zza());
    }

    public final void zzu(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zzbl(12, zza);
    }

    public final void zzv(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zzaqx.zzg(zza, iObjectWrapper2);
        zzaqx.zzg(zza, iObjectWrapper3);
        zzbl(22, zza);
    }

    public final void zzw(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zzbl(16, zza);
    }

    public final boolean zzx() {
        Parcel zzbk = zzbk(14, zza());
        boolean zzh = zzaqx.zzh(zzbk);
        zzbk.recycle();
        return zzh;
    }

    public final boolean zzy() {
        Parcel zzbk = zzbk(13, zza());
        boolean zzh = zzaqx.zzh(zzbk);
        zzbk.recycle();
        return zzh;
    }
}
