package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzabt extends zzacc {
    public static final Parcelable.Creator<zzabt> CREATOR = new zzabs();
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;
    public final String[] zzd;
    private final zzacc[] zze;

    public zzabt(Parcel parcel) {
        super("CTOC");
        String readString = parcel.readString();
        int i2 = zzeg.zza;
        this.zza = readString;
        this.zzb = parcel.readByte() != 0;
        this.zzc = parcel.readByte() != 0;
        this.zzd = (String[]) zzeg.zzG(parcel.createStringArray());
        int readInt = parcel.readInt();
        this.zze = new zzacc[readInt];
        for (int i3 = 0; i3 < readInt; i3++) {
            this.zze[i3] = (zzacc) parcel.readParcelable(zzacc.class.getClassLoader());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzabt.class == obj.getClass()) {
            zzabt zzabtVar = (zzabt) obj;
            if (this.zzb == zzabtVar.zzb && this.zzc == zzabtVar.zzc && zzeg.zzS(this.zza, zzabtVar.zza) && Arrays.equals(this.zzd, zzabtVar.zzd) && Arrays.equals(this.zze, zzabtVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = ((((this.zzb ? 1 : 0) + 527) * 31) + (this.zzc ? 1 : 0)) * 31;
        String str = this.zza;
        return i2 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.zza);
        parcel.writeByte(this.zzb ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.zzc ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.zzd);
        parcel.writeInt(this.zze.length);
        for (zzacc zzaccVar : this.zze) {
            parcel.writeParcelable(zzaccVar, 0);
        }
    }

    public zzabt(String str, boolean z, boolean z2, String[] strArr, zzacc[] zzaccVarArr) {
        super("CTOC");
        this.zza = str;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = strArr;
        this.zze = zzaccVarArr;
    }
}
