package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzaqy extends zzaqv implements zzara {
    public zzaqy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }

    @Override // com.google.android.gms.internal.ads.zzara
    public final void zze(IObjectWrapper iObjectWrapper, String str) {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zza.writeString("GMA_SDK");
        zzbl(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzara
    public final void zzf() {
        zzbl(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzara
    public final void zzg(int i2) {
        Parcel zza = zza();
        zza.writeInt(i2);
        zzbl(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzara
    public final void zzh(int[] iArr) {
        Parcel zza = zza();
        zza.writeIntArray(null);
        zzbl(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzara
    public final void zzi(int i2) {
        Parcel zza = zza();
        zza.writeInt(0);
        zzbl(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzara
    public final void zzj(byte[] bArr) {
        Parcel zza = zza();
        zza.writeByteArray(bArr);
        zzbl(5, zza);
    }
}
