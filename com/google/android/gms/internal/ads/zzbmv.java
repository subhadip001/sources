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
public final class zzbmv extends zzaqv implements zzbmx {
    public zzbmv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final void zzA() {
        zzbl(28, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final void zzB(Bundle bundle) {
        Parcel zza = zza();
        zzaqx.zze(zza, bundle);
        zzbl(17, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final void zzC() {
        zzbl(27, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final void zzD(com.google.android.gms.ads.internal.client.zzcq zzcqVar) {
        Parcel zza = zza();
        zzaqx.zzg(zza, zzcqVar);
        zzbl(26, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final void zzE(com.google.android.gms.ads.internal.client.zzde zzdeVar) {
        Parcel zza = zza();
        zzaqx.zzg(zza, zzdeVar);
        zzbl(32, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final void zzF(zzbmu zzbmuVar) {
        Parcel zza = zza();
        zzaqx.zzg(zza, zzbmuVar);
        zzbl(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final boolean zzG() {
        Parcel zzbk = zzbk(30, zza());
        boolean zzh = zzaqx.zzh(zzbk);
        zzbk.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final boolean zzH() {
        Parcel zzbk = zzbk(24, zza());
        boolean zzh = zzaqx.zzh(zzbk);
        zzbk.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final boolean zzI(Bundle bundle) {
        Parcel zza = zza();
        zzaqx.zze(zza, bundle);
        Parcel zzbk = zzbk(16, zza);
        boolean zzh = zzaqx.zzh(zzbk);
        zzbk.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final double zze() {
        Parcel zzbk = zzbk(8, zza());
        double readDouble = zzbk.readDouble();
        zzbk.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final Bundle zzf() {
        Parcel zzbk = zzbk(20, zza());
        Bundle bundle = (Bundle) zzaqx.zza(zzbk, Bundle.CREATOR);
        zzbk.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final com.google.android.gms.ads.internal.client.zzdh zzg() {
        Parcel zzbk = zzbk(31, zza());
        com.google.android.gms.ads.internal.client.zzdh zzb = com.google.android.gms.ads.internal.client.zzdg.zzb(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final com.google.android.gms.ads.internal.client.zzdk zzh() {
        Parcel zzbk = zzbk(11, zza());
        com.google.android.gms.ads.internal.client.zzdk zzb = com.google.android.gms.ads.internal.client.zzdj.zzb(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final zzbks zzi() {
        zzbks zzbkqVar;
        Parcel zzbk = zzbk(14, zza());
        IBinder readStrongBinder = zzbk.readStrongBinder();
        if (readStrongBinder == null) {
            zzbkqVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            zzbkqVar = queryLocalInterface instanceof zzbks ? (zzbks) queryLocalInterface : new zzbkq(readStrongBinder);
        }
        zzbk.recycle();
        return zzbkqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final zzbkx zzj() {
        zzbkx zzbkvVar;
        Parcel zzbk = zzbk(29, zza());
        IBinder readStrongBinder = zzbk.readStrongBinder();
        if (readStrongBinder == null) {
            zzbkvVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            zzbkvVar = queryLocalInterface instanceof zzbkx ? (zzbkx) queryLocalInterface : new zzbkv(readStrongBinder);
        }
        zzbk.recycle();
        return zzbkvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final zzbla zzk() {
        zzbla zzbkyVar;
        Parcel zzbk = zzbk(5, zza());
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

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final IObjectWrapper zzl() {
        return a.V(zzbk(19, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final IObjectWrapper zzm() {
        return a.V(zzbk(18, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final String zzn() {
        Parcel zzbk = zzbk(7, zza());
        String readString = zzbk.readString();
        zzbk.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final String zzo() {
        Parcel zzbk = zzbk(4, zza());
        String readString = zzbk.readString();
        zzbk.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final String zzp() {
        Parcel zzbk = zzbk(6, zza());
        String readString = zzbk.readString();
        zzbk.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final String zzq() {
        Parcel zzbk = zzbk(2, zza());
        String readString = zzbk.readString();
        zzbk.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final String zzr() {
        Parcel zzbk = zzbk(12, zza());
        String readString = zzbk.readString();
        zzbk.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final String zzs() {
        Parcel zzbk = zzbk(10, zza());
        String readString = zzbk.readString();
        zzbk.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final String zzt() {
        Parcel zzbk = zzbk(9, zza());
        String readString = zzbk.readString();
        zzbk.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final List zzu() {
        Parcel zzbk = zzbk(3, zza());
        ArrayList zzb = zzaqx.zzb(zzbk);
        zzbk.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final List zzv() {
        Parcel zzbk = zzbk(23, zza());
        ArrayList zzb = zzaqx.zzb(zzbk);
        zzbk.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final void zzw() {
        zzbl(22, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final void zzx() {
        zzbl(13, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final void zzy(com.google.android.gms.ads.internal.client.zzcu zzcuVar) {
        Parcel zza = zza();
        zzaqx.zzg(zza, zzcuVar);
        zzbl(25, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final void zzz(Bundle bundle) {
        Parcel zza = zza();
        zzaqx.zze(zza, bundle);
        zzbl(15, zza);
    }
}
