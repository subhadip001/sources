package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzawd implements Parcelable {
    public static final Parcelable.Creator<zzawd> CREATOR = new zzawb();
    private final zzawc[] zza;

    public zzawd(Parcel parcel) {
        this.zza = new zzawc[parcel.readInt()];
        int i2 = 0;
        while (true) {
            zzawc[] zzawcVarArr = this.zza;
            if (i2 >= zzawcVarArr.length) {
                return;
            }
            zzawcVarArr[i2] = (zzawc) parcel.readParcelable(zzawc.class.getClassLoader());
            i2++;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzawd.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.zza, ((zzawd) obj).zza);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.zza.length);
        for (zzawc zzawcVar : this.zza) {
            parcel.writeParcelable(zzawcVar, 0);
        }
    }

    public final int zza() {
        return this.zza.length;
    }

    public final zzawc zzb(int i2) {
        return this.zza[i2];
    }

    public zzawd(List list) {
        zzawc[] zzawcVarArr = new zzawc[list.size()];
        this.zza = zzawcVarArr;
        list.toArray(zzawcVarArr);
    }
}
