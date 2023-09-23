package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import f.a.b.a.a;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes.dex */
public final class zzr extends com.google.android.gms.internal.common.zza implements IInterface {
    public zzr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final IObjectWrapper zze(IObjectWrapper iObjectWrapper, String str, int i2, IObjectWrapper iObjectWrapper2) {
        Parcel zza = zza();
        com.google.android.gms.internal.common.zzc.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeInt(i2);
        com.google.android.gms.internal.common.zzc.zzf(zza, iObjectWrapper2);
        return a.V(zzB(2, zza));
    }

    public final IObjectWrapper zzf(IObjectWrapper iObjectWrapper, String str, int i2, IObjectWrapper iObjectWrapper2) {
        Parcel zza = zza();
        com.google.android.gms.internal.common.zzc.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeInt(i2);
        com.google.android.gms.internal.common.zzc.zzf(zza, iObjectWrapper2);
        return a.V(zzB(3, zza));
    }
}
