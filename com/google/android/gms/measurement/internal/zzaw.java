package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import f.a.b.a.a;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
@SafeParcelable.Class(creator = "EventParcelCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public final class zzaw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaw> CREATOR = new zzax();
    @SafeParcelable.Field(id = 2)
    public final String zza;
    @SafeParcelable.Field(id = 3)
    public final zzau zzb;
    @SafeParcelable.Field(id = 4)
    public final String zzc;
    @SafeParcelable.Field(id = 5)
    public final long zzd;

    public zzaw(zzaw zzawVar, long j2) {
        Preconditions.checkNotNull(zzawVar);
        this.zza = zzawVar.zza;
        this.zzb = zzawVar.zzb;
        this.zzc = zzawVar.zzc;
        this.zzd = j2;
    }

    public final String toString() {
        String str = this.zzc;
        String str2 = this.zza;
        String valueOf = String.valueOf(this.zzb);
        StringBuilder F = a.F("origin=", str, ",name=", str2, ",params=");
        F.append(valueOf);
        return F.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        zzax.zza(this, parcel, i2);
    }

    @SafeParcelable.Constructor
    public zzaw(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) zzau zzauVar, @SafeParcelable.Param(id = 4) String str2, @SafeParcelable.Param(id = 5) long j2) {
        this.zza = str;
        this.zzb = zzauVar;
        this.zzc = str2;
        this.zzd = j2;
    }
}
