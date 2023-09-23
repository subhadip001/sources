package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import f.a.b.a.a;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbua extends zzaqv implements zzbuc {
    public zzbua(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final void zzA(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final void zzB(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbuf zzbufVar) {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zzaqx.zze(zza, zzlVar);
        zza.writeString(str);
        zzaqx.zzg(zza, zzbufVar);
        zzbl(32, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final void zzC(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zzbl(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final void zzD() {
        zzbl(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final void zzE() {
        zzbl(9, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final void zzF(boolean z) {
        Parcel zza = zza();
        zzaqx.zzd(zza, z);
        zzbl(25, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final void zzG() {
        zzbl(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final void zzH(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zzbl(37, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final void zzI(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zzbl(30, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final void zzJ() {
        zzbl(12, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final boolean zzK() {
        Parcel zzbk = zzbk(22, zza());
        boolean zzh = zzaqx.zzh(zzbk);
        zzbk.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final boolean zzL() {
        Parcel zzbk = zzbk(13, zza());
        boolean zzh = zzaqx.zzh(zzbk);
        zzbk.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final zzbuk zzM() {
        zzbuk zzbukVar;
        Parcel zzbk = zzbk(15, zza());
        IBinder readStrongBinder = zzbk.readStrongBinder();
        if (readStrongBinder == null) {
            zzbukVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            zzbukVar = queryLocalInterface instanceof zzbuk ? (zzbuk) queryLocalInterface : new zzbuk(readStrongBinder);
        }
        zzbk.recycle();
        return zzbukVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final zzbul zzN() {
        zzbul zzbulVar;
        Parcel zzbk = zzbk(16, zza());
        IBinder readStrongBinder = zzbk.readStrongBinder();
        if (readStrongBinder == null) {
            zzbulVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            zzbulVar = queryLocalInterface instanceof zzbul ? (zzbul) queryLocalInterface : new zzbul(readStrongBinder);
        }
        zzbk.recycle();
        return zzbulVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final Bundle zze() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final Bundle zzf() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final Bundle zzg() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final com.google.android.gms.ads.internal.client.zzdk zzh() {
        Parcel zzbk = zzbk(26, zza());
        com.google.android.gms.ads.internal.client.zzdk zzb = com.google.android.gms.ads.internal.client.zzdj.zzb(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final zzblu zzi() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final zzbui zzj() {
        zzbui zzbugVar;
        Parcel zzbk = zzbk(36, zza());
        IBinder readStrongBinder = zzbk.readStrongBinder();
        if (readStrongBinder == null) {
            zzbugVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            zzbugVar = queryLocalInterface instanceof zzbui ? (zzbui) queryLocalInterface : new zzbug(readStrongBinder);
        }
        zzbk.recycle();
        return zzbugVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final zzbuo zzk() {
        zzbuo zzbumVar;
        Parcel zzbk = zzbk(27, zza());
        IBinder readStrongBinder = zzbk.readStrongBinder();
        if (readStrongBinder == null) {
            zzbumVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            zzbumVar = queryLocalInterface instanceof zzbuo ? (zzbuo) queryLocalInterface : new zzbum(readStrongBinder);
        }
        zzbk.recycle();
        return zzbumVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final zzbwf zzl() {
        Parcel zzbk = zzbk(33, zza());
        zzbwf zzbwfVar = (zzbwf) zzaqx.zza(zzbk, zzbwf.CREATOR);
        zzbk.recycle();
        return zzbwfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final zzbwf zzm() {
        Parcel zzbk = zzbk(34, zza());
        zzbwf zzbwfVar = (zzbwf) zzaqx.zza(zzbk, zzbwf.CREATOR);
        zzbk.recycle();
        return zzbwfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final IObjectWrapper zzn() {
        return a.V(zzbk(2, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final void zzo() {
        zzbl(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final void zzp(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzcav zzcavVar, String str2) {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zzaqx.zze(zza, zzlVar);
        zza.writeString(null);
        zzaqx.zzg(zza, zzcavVar);
        zza.writeString(str2);
        zzbl(10, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final void zzq(IObjectWrapper iObjectWrapper, zzbqj zzbqjVar, List list) {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zzaqx.zzg(zza, zzbqjVar);
        zza.writeTypedList(list);
        zzbl(31, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final void zzr(IObjectWrapper iObjectWrapper, zzcav zzcavVar, List list) {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zzaqx.zzg(zza, zzcavVar);
        zza.writeStringList(list);
        zzbl(23, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final void zzs(com.google.android.gms.ads.internal.client.zzl zzlVar, String str) {
        Parcel zza = zza();
        zzaqx.zze(zza, zzlVar);
        zza.writeString(str);
        zzbl(11, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final void zzt(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbuf zzbufVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final void zzu(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbuf zzbufVar) {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zzaqx.zze(zza, zzqVar);
        zzaqx.zze(zza, zzlVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzaqx.zzg(zza, zzbufVar);
        zzbl(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final void zzv(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbuf zzbufVar) {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zzaqx.zze(zza, zzqVar);
        zzaqx.zze(zza, zzlVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzaqx.zzg(zza, zzbufVar);
        zzbl(35, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final void zzw(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbuf zzbufVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final void zzx(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbuf zzbufVar) {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zzaqx.zze(zza, zzlVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzaqx.zzg(zza, zzbufVar);
        zzbl(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final void zzy(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbuf zzbufVar, zzbko zzbkoVar, List list) {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zzaqx.zze(zza, zzlVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzaqx.zzg(zza, zzbufVar);
        zzaqx.zze(zza, zzbkoVar);
        zza.writeStringList(list);
        zzbl(14, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final void zzz(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbuf zzbufVar) {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zzaqx.zze(zza, zzlVar);
        zza.writeString(str);
        zzaqx.zzg(zza, zzbufVar);
        zzbl(28, zza);
    }
}
