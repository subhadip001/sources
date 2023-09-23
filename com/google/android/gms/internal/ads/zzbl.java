package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbl implements Parcelable {
    public static final Parcelable.Creator<zzbl> CREATOR = new zzbj();
    private final zzbk[] zza;

    public zzbl(Parcel parcel) {
        this.zza = new zzbk[parcel.readInt()];
        int i2 = 0;
        while (true) {
            zzbk[] zzbkVarArr = this.zza;
            if (i2 >= zzbkVarArr.length) {
                return;
            }
            zzbkVarArr[i2] = (zzbk) parcel.readParcelable(zzbk.class.getClassLoader());
            i2++;
        }
    }

    public zzbl(zzbk... zzbkVarArr) {
        this.zza = zzbkVarArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzbl.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.zza, ((zzbl) obj).zza);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final String toString() {
        return "entries=".concat(String.valueOf(Arrays.toString(this.zza)));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.zza.length);
        for (zzbk zzbkVar : this.zza) {
            parcel.writeParcelable(zzbkVar, 0);
        }
    }

    public final int zza() {
        return this.zza.length;
    }

    public final zzbk zzb(int i2) {
        return this.zza[i2];
    }

    public final zzbl zzc(zzbk... zzbkVarArr) {
        return zzbkVarArr.length == 0 ? this : new zzbl((zzbk[]) zzeg.zzac(this.zza, zzbkVarArr));
    }

    public final zzbl zzd(zzbl zzblVar) {
        return zzblVar == null ? this : zzc(zzblVar.zza);
    }

    public zzbl(List list) {
        this.zza = (zzbk[]) list.toArray(new zzbk[0]);
    }
}
