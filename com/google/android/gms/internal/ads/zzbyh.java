package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbyh extends zzaqv implements zzbyj {
    public zzbyh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbyj
    public final void zze(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzbl(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyj
    public final void zzf(List list) {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzbl(1, zza);
    }
}
