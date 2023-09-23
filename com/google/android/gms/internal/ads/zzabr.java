package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzabr extends zzacc {
    public static final Parcelable.Creator<zzabr> CREATOR = new zzabq();
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final long zze;
    private final zzacc[] zzg;

    public zzabr(Parcel parcel) {
        super("CHAP");
        String readString = parcel.readString();
        int i2 = zzeg.zza;
        this.zza = readString;
        this.zzb = parcel.readInt();
        this.zzc = parcel.readInt();
        this.zzd = parcel.readLong();
        this.zze = parcel.readLong();
        int readInt = parcel.readInt();
        this.zzg = new zzacc[readInt];
        for (int i3 = 0; i3 < readInt; i3++) {
            this.zzg[i3] = (zzacc) parcel.readParcelable(zzacc.class.getClassLoader());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacc, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzabr.class == obj.getClass()) {
            zzabr zzabrVar = (zzabr) obj;
            if (this.zzb == zzabrVar.zzb && this.zzc == zzabrVar.zzc && this.zzd == zzabrVar.zzd && this.zze == zzabrVar.zze && zzeg.zzS(this.zza, zzabrVar.zza) && Arrays.equals(this.zzg, zzabrVar.zzg)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = (((((((this.zzb + 527) * 31) + this.zzc) * 31) + ((int) this.zzd)) * 31) + ((int) this.zze)) * 31;
        String str = this.zza;
        return i2 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.zza);
        parcel.writeInt(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeLong(this.zzd);
        parcel.writeLong(this.zze);
        parcel.writeInt(this.zzg.length);
        for (zzacc zzaccVar : this.zzg) {
            parcel.writeParcelable(zzaccVar, 0);
        }
    }

    public zzabr(String str, int i2, int i3, long j2, long j3, zzacc[] zzaccVarArr) {
        super("CHAP");
        this.zza = str;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = j2;
        this.zze = j3;
        this.zzg = zzaccVarArr;
    }
}
