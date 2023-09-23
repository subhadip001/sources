package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaqv;
import com.google.android.gms.internal.ads.zzaqx;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdf extends zzaqv implements zzdh {
    public zzdf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdh
    public final Bundle zze() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdh
    public final zzu zzf() {
        Parcel zzbk = zzbk(4, zza());
        zzu zzuVar = (zzu) zzaqx.zza(zzbk, zzu.CREATOR);
        zzbk.recycle();
        return zzuVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdh
    public final String zzg() {
        Parcel zzbk = zzbk(1, zza());
        String readString = zzbk.readString();
        zzbk.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdh
    public final String zzh() {
        Parcel zzbk = zzbk(2, zza());
        String readString = zzbk.readString();
        zzbk.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdh
    public final List zzi() {
        Parcel zzbk = zzbk(3, zza());
        ArrayList createTypedArrayList = zzbk.createTypedArrayList(zzu.CREATOR);
        zzbk.recycle();
        return createTypedArrayList;
    }
}
