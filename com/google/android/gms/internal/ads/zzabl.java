package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import f.a.b.a.a;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzabl implements zzbk {
    public static final Parcelable.Creator<zzabl> CREATOR = new zzabk();
    public final int zza;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final boolean zze;
    public final int zzf;

    public zzabl(int i2, String str, String str2, String str3, boolean z, int i3) {
        boolean z2 = true;
        if (i3 != -1 && i3 <= 0) {
            z2 = false;
        }
        zzcw.zzd(z2);
        this.zza = i2;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = z;
        this.zzf = i3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzabl.class == obj.getClass()) {
            zzabl zzablVar = (zzabl) obj;
            if (this.zza == zzablVar.zza && zzeg.zzS(this.zzb, zzablVar.zzb) && zzeg.zzS(this.zzc, zzablVar.zzc) && zzeg.zzS(this.zzd, zzablVar.zzd) && this.zze == zzablVar.zze && this.zzf == zzablVar.zzf) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = (this.zza + 527) * 31;
        String str = this.zzb;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.zzc;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.zzd;
        return ((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.zze ? 1 : 0)) * 31) + this.zzf;
    }

    public final String toString() {
        String str = this.zzc;
        String str2 = this.zzb;
        int i2 = this.zza;
        int i3 = this.zzf;
        StringBuilder F = a.F("IcyHeaders: name=\"", str, "\", genre=\"", str2, "\", bitrate=");
        F.append(i2);
        F.append(", metadataInterval=");
        F.append(i3);
        return F.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeString(this.zzd);
        zzeg.zzR(parcel, this.zze);
        parcel.writeInt(this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final void zza(zzbf zzbfVar) {
        String str = this.zzc;
        if (str != null) {
            zzbfVar.zzq(str);
        }
        String str2 = this.zzb;
        if (str2 != null) {
            zzbfVar.zzj(str2);
        }
    }

    public zzabl(Parcel parcel) {
        this.zza = parcel.readInt();
        this.zzb = parcel.readString();
        this.zzc = parcel.readString();
        this.zzd = parcel.readString();
        this.zze = zzeg.zzY(parcel);
        this.zzf = parcel.readInt();
    }
}
