package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbqv extends zzaqv implements zzbqx {
    public zzbqv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbqx
    public final void zze(int i2) {
        Parcel zza = zza();
        zza.writeInt(i2);
        zzbl(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqx
    public final void zzf() {
        zzbl(1, zza());
    }
}
