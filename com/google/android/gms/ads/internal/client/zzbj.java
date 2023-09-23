package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaqv;
import com.google.android.gms.internal.ads.zzaqx;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbj extends zzaqv implements zzbl {
    public zzbj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final String zze() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final String zzf() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzg(zzl zzlVar) {
        Parcel zza = zza();
        zzaqx.zze(zza, zzlVar);
        zzbl(1, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzh(zzl zzlVar, int i2) {
        Parcel zza = zza();
        zzaqx.zze(zza, zzlVar);
        zza.writeInt(i2);
        zzbl(5, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final boolean zzi() {
        Parcel zzbk = zzbk(3, zza());
        boolean zzh = zzaqx.zzh(zzbk);
        zzbk.recycle();
        return zzh;
    }
}
