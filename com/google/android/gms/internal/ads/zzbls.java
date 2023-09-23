package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import f.a.b.a.a;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbls extends zzaqv implements zzblu {
    public zzbls(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    @Override // com.google.android.gms.internal.ads.zzblu
    public final com.google.android.gms.ads.internal.client.zzdk zze() {
        Parcel zzbk = zzbk(7, zza());
        com.google.android.gms.ads.internal.client.zzdk zzb = com.google.android.gms.ads.internal.client.zzdj.zzb(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzblu
    public final zzbla zzf(String str) {
        zzbla zzbkyVar;
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzbk = zzbk(2, zza);
        IBinder readStrongBinder = zzbk.readStrongBinder();
        if (readStrongBinder == null) {
            zzbkyVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            zzbkyVar = queryLocalInterface instanceof zzbla ? (zzbla) queryLocalInterface : new zzbky(readStrongBinder);
        }
        zzbk.recycle();
        return zzbkyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblu
    public final IObjectWrapper zzg() {
        return a.V(zzbk(9, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzblu
    public final String zzh() {
        Parcel zzbk = zzbk(4, zza());
        String readString = zzbk.readString();
        zzbk.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzblu
    public final String zzi(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzbk = zzbk(1, zza);
        String readString = zzbk.readString();
        zzbk.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzblu
    public final List zzj() {
        Parcel zzbk = zzbk(3, zza());
        ArrayList<String> createStringArrayList = zzbk.createStringArrayList();
        zzbk.recycle();
        return createStringArrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzblu
    public final void zzk() {
        zzbl(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzblu
    public final void zzl() {
        zzbl(15, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzblu
    public final void zzm(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzbl(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzblu
    public final void zzn() {
        zzbl(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzblu
    public final void zzo(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zzbl(14, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzblu
    public final boolean zzp() {
        Parcel zzbk = zzbk(12, zza());
        boolean zzh = zzaqx.zzh(zzbk);
        zzbk.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzblu
    public final boolean zzq(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        Parcel zzbk = zzbk(10, zza);
        boolean zzh = zzaqx.zzh(zzbk);
        zzbk.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzblu
    public final boolean zzr() {
        Parcel zzbk = zzbk(13, zza());
        boolean zzh = zzaqx.zzh(zzbk);
        zzbk.recycle();
        return zzh;
    }
}
