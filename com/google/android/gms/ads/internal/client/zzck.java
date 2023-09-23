package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzaqv;
import com.google.android.gms.internal.ads.zzaqx;
import com.google.android.gms.internal.ads.zzbqf;
import com.google.android.gms.internal.ads.zzbqm;
import com.google.android.gms.internal.ads.zzbtz;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzck extends zzaqv implements zzcm {
    public zzck(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final float zze() {
        Parcel zzbk = zzbk(7, zza());
        float readFloat = zzbk.readFloat();
        zzbk.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final String zzf() {
        Parcel zzbk = zzbk(9, zza());
        String readString = zzbk.readString();
        zzbk.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final List zzg() {
        Parcel zzbk = zzbk(13, zza());
        ArrayList createTypedArrayList = zzbk.createTypedArrayList(zzbqf.CREATOR);
        zzbk.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzh(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzbl(10, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzi() {
        zzbl(15, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzj() {
        zzbl(1, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzk(String str, IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zza.writeString(null);
        zzaqx.zzg(zza, iObjectWrapper);
        zzbl(6, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzl(zzcy zzcyVar) {
        Parcel zza = zza();
        zzaqx.zzg(zza, zzcyVar);
        zzbl(16, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzm(IObjectWrapper iObjectWrapper, String str) {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zza.writeString(str);
        zzbl(5, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzn(zzbtz zzbtzVar) {
        Parcel zza = zza();
        zzaqx.zzg(zza, zzbtzVar);
        zzbl(11, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzo(boolean z) {
        Parcel zza = zza();
        zzaqx.zzd(zza, z);
        zzbl(4, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzp(float f2) {
        Parcel zza = zza();
        zza.writeFloat(f2);
        zzbl(2, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzq(String str) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzr(zzbqm zzbqmVar) {
        Parcel zza = zza();
        zzaqx.zzg(zza, zzbqmVar);
        zzbl(12, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzs(zzfa zzfaVar) {
        Parcel zza = zza();
        zzaqx.zze(zza, zzfaVar);
        zzbl(14, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final boolean zzt() {
        Parcel zzbk = zzbk(8, zza());
        boolean zzh = zzaqx.zzh(zzbk);
        zzbk.recycle();
        return zzh;
    }
}
