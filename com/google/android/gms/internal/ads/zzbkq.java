package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbkq extends zzaqv implements zzbks {
    public zzbkq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    @Override // com.google.android.gms.internal.ads.zzbks
    public final String zzg() {
        Parcel zzbk = zzbk(2, zza());
        String readString = zzbk.readString();
        zzbk.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbks
    public final List zzh() {
        Parcel zzbk = zzbk(3, zza());
        ArrayList zzb = zzaqx.zzb(zzbk);
        zzbk.recycle();
        return zzb;
    }
}
