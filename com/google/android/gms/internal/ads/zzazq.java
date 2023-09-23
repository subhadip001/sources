package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import f.a.b.a.a;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzazq implements Parcelable {
    public static final Parcelable.Creator<zzazq> CREATOR = new zzazp();
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final byte[] zzd;
    private int zze;

    public zzazq(int i2, int i3, int i4, byte[] bArr) {
        this.zza = i2;
        this.zzb = i3;
        this.zzc = i4;
        this.zzd = bArr;
    }

    public zzazq(Parcel parcel) {
        this.zza = parcel.readInt();
        this.zzb = parcel.readInt();
        this.zzc = parcel.readInt();
        this.zzd = parcel.readInt() != 0 ? parcel.createByteArray() : null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzazq.class == obj.getClass()) {
            zzazq zzazqVar = (zzazq) obj;
            if (this.zza == zzazqVar.zza && this.zzb == zzazqVar.zzb && this.zzc == zzazqVar.zzc && Arrays.equals(this.zzd, zzazqVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.zze;
        if (i2 == 0) {
            int hashCode = Arrays.hashCode(this.zzd) + ((((((this.zza + 527) * 31) + this.zzb) * 31) + this.zzc) * 31);
            this.zze = hashCode;
            return hashCode;
        }
        return i2;
    }

    public final String toString() {
        int i2 = this.zza;
        int i3 = this.zzb;
        int i4 = this.zzc;
        boolean z = this.zzd != null;
        StringBuilder C = a.C("ColorInfo(", i2, ", ", i3, ", ");
        C.append(i4);
        C.append(", ");
        C.append(z);
        C.append(")");
        return C.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.zza);
        parcel.writeInt(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeInt(this.zzd != null ? 1 : 0);
        byte[] bArr = this.zzd;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }
}
