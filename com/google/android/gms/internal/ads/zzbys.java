package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
@SafeParcelable.Class(creator = "NativeAdLayoutInfoParcelCreator")
/* loaded from: classes.dex */
public final class zzbys extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbys> CREATOR = new zzbyt();
    @SafeParcelable.Field(getter = "getAdViewAsBinder", id = 1, type = "android.os.IBinder")
    public final View zza;
    @SafeParcelable.Field(getter = "getAssetViewMapAsBinder", id = 2, type = "android.os.IBinder")
    public final Map zzb;

    @SafeParcelable.Constructor
    public zzbys(@SafeParcelable.Param(id = 1) IBinder iBinder, @SafeParcelable.Param(id = 2) IBinder iBinder2) {
        this.zza = (View) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder));
        this.zzb = (Map) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder2));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIBinder(parcel, 1, ObjectWrapper.wrap(this.zza).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 2, ObjectWrapper.wrap(this.zzb).asBinder(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
