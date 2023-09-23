package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbxi extends zzaqv implements zzbxk {
    public zzbxi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    @Override // com.google.android.gms.internal.ads.zzbxk
    public final void zze(Intent intent) {
        Parcel zza = zza();
        zzaqx.zze(zza, intent);
        zzbl(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxk
    public final void zzf() {
        zzbl(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbxk
    public final void zzg(IObjectWrapper iObjectWrapper, String str, String str2) {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeString(str2);
        zzbl(2, zza);
    }
}
