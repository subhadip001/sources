package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import f.a.b.a.a;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbum extends zzaqv implements zzbuo {
    public zzbum(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override // com.google.android.gms.internal.ads.zzbuo
    public final boolean zzA() {
        Parcel zzbk = zzbk(18, zza());
        boolean zzh = zzaqx.zzh(zzbk);
        zzbk.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzbuo
    public final boolean zzB() {
        Parcel zzbk = zzbk(17, zza());
        boolean zzh = zzaqx.zzh(zzbk);
        zzbk.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzbuo
    public final double zze() {
        Parcel zzbk = zzbk(8, zza());
        double readDouble = zzbk.readDouble();
        zzbk.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.zzbuo
    public final float zzf() {
        Parcel zzbk = zzbk(23, zza());
        float readFloat = zzbk.readFloat();
        zzbk.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbuo
    public final float zzg() {
        Parcel zzbk = zzbk(25, zza());
        float readFloat = zzbk.readFloat();
        zzbk.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbuo
    public final float zzh() {
        Parcel zzbk = zzbk(24, zza());
        float readFloat = zzbk.readFloat();
        zzbk.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbuo
    public final Bundle zzi() {
        Parcel zzbk = zzbk(16, zza());
        Bundle bundle = (Bundle) zzaqx.zza(zzbk, Bundle.CREATOR);
        zzbk.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbuo
    public final com.google.android.gms.ads.internal.client.zzdk zzj() {
        Parcel zzbk = zzbk(11, zza());
        com.google.android.gms.ads.internal.client.zzdk zzb = com.google.android.gms.ads.internal.client.zzdj.zzb(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbuo
    public final zzbks zzk() {
        Parcel zzbk = zzbk(12, zza());
        zzbks zzj = zzbkr.zzj(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzbuo
    public final zzbla zzl() {
        Parcel zzbk = zzbk(5, zza());
        zzbla zzg = zzbkz.zzg(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbuo
    public final IObjectWrapper zzm() {
        return a.V(zzbk(13, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbuo
    public final IObjectWrapper zzn() {
        return a.V(zzbk(14, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbuo
    public final IObjectWrapper zzo() {
        return a.V(zzbk(15, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbuo
    public final String zzp() {
        Parcel zzbk = zzbk(7, zza());
        String readString = zzbk.readString();
        zzbk.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbuo
    public final String zzq() {
        Parcel zzbk = zzbk(4, zza());
        String readString = zzbk.readString();
        zzbk.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbuo
    public final String zzr() {
        Parcel zzbk = zzbk(6, zza());
        String readString = zzbk.readString();
        zzbk.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbuo
    public final String zzs() {
        Parcel zzbk = zzbk(2, zza());
        String readString = zzbk.readString();
        zzbk.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbuo
    public final String zzt() {
        Parcel zzbk = zzbk(10, zza());
        String readString = zzbk.readString();
        zzbk.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbuo
    public final String zzu() {
        Parcel zzbk = zzbk(9, zza());
        String readString = zzbk.readString();
        zzbk.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbuo
    public final List zzv() {
        Parcel zzbk = zzbk(3, zza());
        ArrayList zzb = zzaqx.zzb(zzbk);
        zzbk.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbuo
    public final void zzw(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zzbl(20, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuo
    public final void zzx() {
        zzbl(19, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbuo
    public final void zzy(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zzaqx.zzg(zza, iObjectWrapper2);
        zzaqx.zzg(zza, iObjectWrapper3);
        zzbl(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuo
    public final void zzz(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zzbl(22, zza);
    }
}
