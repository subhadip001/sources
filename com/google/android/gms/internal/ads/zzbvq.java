package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbvq extends zzaqv implements zzbvs {
    public zzbvq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final com.google.android.gms.ads.internal.client.zzdk zze() {
        Parcel zzbk = zzbk(5, zza());
        com.google.android.gms.ads.internal.client.zzdk zzb = com.google.android.gms.ads.internal.client.zzdj.zzb(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final zzbwf zzf() {
        Parcel zzbk = zzbk(2, zza());
        zzbwf zzbwfVar = (zzbwf) zzaqx.zza(zzbk, zzbwf.CREATOR);
        zzbk.recycle();
        return zzbwfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final zzbwf zzg() {
        Parcel zzbk = zzbk(3, zza());
        zzbwf zzbwfVar = (zzbwf) zzaqx.zza(zzbk, zzbwf.CREATOR);
        zzbk.recycle();
        return zzbwfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzh(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, com.google.android.gms.ads.internal.client.zzq zzqVar, zzbvv zzbvvVar) {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zza.writeString(str);
        zzaqx.zze(zza, bundle);
        zzaqx.zze(zza, bundle2);
        zzaqx.zze(zza, zzqVar);
        zzaqx.zzg(zza, zzbvvVar);
        zzbl(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzi(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbvg zzbvgVar, zzbuf zzbufVar, com.google.android.gms.ads.internal.client.zzq zzqVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzaqx.zze(zza, zzlVar);
        zzaqx.zzg(zza, iObjectWrapper);
        zzaqx.zzg(zza, zzbvgVar);
        zzaqx.zzg(zza, zzbufVar);
        zzaqx.zze(zza, zzqVar);
        zzbl(13, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzj(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbvg zzbvgVar, zzbuf zzbufVar, com.google.android.gms.ads.internal.client.zzq zzqVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzaqx.zze(zza, zzlVar);
        zzaqx.zzg(zza, iObjectWrapper);
        zzaqx.zzg(zza, zzbvgVar);
        zzaqx.zzg(zza, zzbufVar);
        zzaqx.zze(zza, zzqVar);
        zzbl(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzk(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbvj zzbvjVar, zzbuf zzbufVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzaqx.zze(zza, zzlVar);
        zzaqx.zzg(zza, iObjectWrapper);
        zzaqx.zzg(zza, zzbvjVar);
        zzaqx.zzg(zza, zzbufVar);
        zzbl(14, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzl(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbvm zzbvmVar, zzbuf zzbufVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzaqx.zze(zza, zzlVar);
        zzaqx.zzg(zza, iObjectWrapper);
        zzaqx.zzg(zza, zzbvmVar);
        zzaqx.zzg(zza, zzbufVar);
        zzbl(18, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzm(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbvm zzbvmVar, zzbuf zzbufVar, zzbko zzbkoVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzaqx.zze(zza, zzlVar);
        zzaqx.zzg(zza, iObjectWrapper);
        zzaqx.zzg(zza, zzbvmVar);
        zzaqx.zzg(zza, zzbufVar);
        zzaqx.zze(zza, zzbkoVar);
        zzbl(22, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzn(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbvp zzbvpVar, zzbuf zzbufVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzaqx.zze(zza, zzlVar);
        zzaqx.zzg(zza, iObjectWrapper);
        zzaqx.zzg(zza, zzbvpVar);
        zzaqx.zzg(zza, zzbufVar);
        zzbl(20, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzo(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbvp zzbvpVar, zzbuf zzbufVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzaqx.zze(zza, zzlVar);
        zzaqx.zzg(zza, iObjectWrapper);
        zzaqx.zzg(zza, zzbvpVar);
        zzaqx.zzg(zza, zzbufVar);
        zzbl(16, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzp(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzbl(19, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final boolean zzq(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        Parcel zzbk = zzbk(15, zza);
        boolean zzh = zzaqx.zzh(zzbk);
        zzbk.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final boolean zzr(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        Parcel zzbk = zzbk(17, zza);
        boolean zzh = zzaqx.zzh(zzbk);
        zzbk.recycle();
        return zzh;
    }
}
