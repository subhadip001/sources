package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbqk extends zzaqv implements zzbqm {
    public zzbqk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbqm
    public final void zzb(List list) {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzbl(1, zza);
    }
}
