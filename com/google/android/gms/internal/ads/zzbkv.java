package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import f.a.b.a.a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbkv extends zzaqv implements zzbkx {
    public zzbkv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.google.android.gms.internal.ads.zzbkx
    public final float zze() {
        Parcel zzbk = zzbk(2, zza());
        float readFloat = zzbk.readFloat();
        zzbk.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbkx
    public final float zzf() {
        Parcel zzbk = zzbk(6, zza());
        float readFloat = zzbk.readFloat();
        zzbk.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbkx
    public final float zzg() {
        Parcel zzbk = zzbk(5, zza());
        float readFloat = zzbk.readFloat();
        zzbk.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbkx
    public final com.google.android.gms.ads.internal.client.zzdk zzh() {
        Parcel zzbk = zzbk(7, zza());
        com.google.android.gms.ads.internal.client.zzdk zzb = com.google.android.gms.ads.internal.client.zzdj.zzb(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbkx
    public final IObjectWrapper zzi() {
        return a.V(zzbk(4, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbkx
    public final void zzj(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zzbl(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbkx
    public final boolean zzk() {
        Parcel zzbk = zzbk(8, zza());
        boolean zzh = zzaqx.zzh(zzbk);
        zzbk.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzbkx
    public final void zzl(zzbmi zzbmiVar) {
        throw null;
    }
}
