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
public final class zzbul extends zzaqv implements IInterface {
    public zzbul(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    public final Bundle zze() {
        Parcel zzbk = zzbk(13, zza());
        Bundle bundle = (Bundle) zzaqx.zza(zzbk, Bundle.CREATOR);
        zzbk.recycle();
        return bundle;
    }

    public final com.google.android.gms.ads.internal.client.zzdk zzf() {
        Parcel zzbk = zzbk(16, zza());
        com.google.android.gms.ads.internal.client.zzdk zzb = com.google.android.gms.ads.internal.client.zzdj.zzb(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzb;
    }

    public final zzbks zzg() {
        Parcel zzbk = zzbk(19, zza());
        zzbks zzj = zzbkr.zzj(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzj;
    }

    public final zzbla zzh() {
        Parcel zzbk = zzbk(5, zza());
        zzbla zzg = zzbkz.zzg(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzg;
    }

    public final IObjectWrapper zzi() {
        return a.V(zzbk(15, zza()));
    }

    public final IObjectWrapper zzj() {
        return a.V(zzbk(20, zza()));
    }

    public final IObjectWrapper zzk() {
        return a.V(zzbk(21, zza()));
    }

    public final String zzl() {
        Parcel zzbk = zzbk(7, zza());
        String readString = zzbk.readString();
        zzbk.recycle();
        return readString;
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

    public final List zzp() {
        Parcel zzbk = zzbk(3, zza());
        ArrayList zzb = zzaqx.zzb(zzbk);
        zzbk.recycle();
        return zzb;
    }

    public final void zzq(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zzbl(9, zza);
    }

    public final void zzr() {
        zzbl(8, zza());
    }

    public final void zzs(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zzbl(10, zza);
    }

    public final void zzt(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zzaqx.zzg(zza, iObjectWrapper2);
        zzaqx.zzg(zza, iObjectWrapper3);
        zzbl(22, zza);
    }

    public final void zzu(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zzbl(14, zza);
    }

    public final boolean zzv() {
        Parcel zzbk = zzbk(12, zza());
        boolean zzh = zzaqx.zzh(zzbk);
        zzbk.recycle();
        return zzh;
    }

    public final boolean zzw() {
        Parcel zzbk = zzbk(11, zza());
        boolean zzh = zzaqx.zzh(zzbk);
        zzbk.recycle();
        return zzh;
    }
}
