package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
@SafeParcelable.Class(creator = "LiteSdkVersionsParcelCreator")
/* loaded from: classes.dex */
public final class zzei extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzei> CREATOR = new zzej();
    @SafeParcelable.Field(getter = "getAdsDynamiteVersion", id = 1)
    private final int zza;
    @SafeParcelable.Field(getter = "getSdkVersionLite", id = 2)
    private final int zzb;
    @SafeParcelable.Field(getter = "getGranularVersion", id = 3)
    private final String zzc;

    public zzei() {
        this(ModuleDescriptor.MODULE_VERSION, 221310000, "21.0.0");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final int zza() {
        return this.zzb;
    }

    @SafeParcelable.Constructor
    public zzei(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) int i3, @SafeParcelable.Param(id = 3) String str) {
        this.zza = i2;
        this.zzb = i3;
        this.zzc = str;
    }
}
