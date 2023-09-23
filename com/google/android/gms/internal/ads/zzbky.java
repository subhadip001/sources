package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import f.a.b.a.a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbky extends zzaqv implements zzbla {
    public zzbky(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override // com.google.android.gms.internal.ads.zzbla
    public final double zzb() {
        Parcel zzbk = zzbk(3, zza());
        double readDouble = zzbk.readDouble();
        zzbk.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.zzbla
    public final int zzc() {
        Parcel zzbk = zzbk(5, zza());
        int readInt = zzbk.readInt();
        zzbk.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.ads.zzbla
    public final int zzd() {
        Parcel zzbk = zzbk(4, zza());
        int readInt = zzbk.readInt();
        zzbk.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.ads.zzbla
    public final Uri zze() {
        Parcel zzbk = zzbk(2, zza());
        Uri uri = (Uri) zzaqx.zza(zzbk, Uri.CREATOR);
        zzbk.recycle();
        return uri;
    }

    @Override // com.google.android.gms.internal.ads.zzbla
    public final IObjectWrapper zzf() {
        return a.V(zzbk(1, zza()));
    }
}
