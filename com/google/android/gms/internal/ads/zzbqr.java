package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
@SafeParcelable.Class(creator = "InstreamAdConfigurationParcelCreator")
/* loaded from: classes.dex */
public final class zzbqr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbqr> CREATOR = new zzbqs();
    @SafeParcelable.VersionField(id = 1000)
    public final int zza;
    @SafeParcelable.Field(id = 1)
    public final int zzb;
    @SafeParcelable.Field(id = 2)
    public final String zzc;
    @SafeParcelable.Field(id = 3)
    public final int zzd;

    @SafeParcelable.Constructor
    public zzbqr(@SafeParcelable.Param(id = 1000) int i2, @SafeParcelable.Param(id = 1) int i3, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i4) {
        this.zza = i2;
        this.zzb = i3;
        this.zzc = str;
        this.zzd = i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzb);
        SafeParcelWriter.writeString(parcel, 2, this.zzc, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzd);
        SafeParcelWriter.writeInt(parcel, 1000, this.zza);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
