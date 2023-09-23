package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import f.a.b.a.a;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzabv extends zzacc {
    public static final Parcelable.Creator<zzabv> CREATOR = new zzabu();
    public final String zza;
    public final String zzb;
    public final String zzc;

    public zzabv(Parcel parcel) {
        super("COMM");
        String readString = parcel.readString();
        int i2 = zzeg.zza;
        this.zza = readString;
        this.zzb = parcel.readString();
        this.zzc = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzabv.class == obj.getClass()) {
            zzabv zzabvVar = (zzabv) obj;
            if (zzeg.zzS(this.zzb, zzabvVar.zzb) && zzeg.zzS(this.zza, zzabvVar.zza) && zzeg.zzS(this.zzc, zzabvVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.zzb;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.zzc;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzacc
    public final String toString() {
        return a.s(this.zzf, ": language=", this.zza, ", description=", this.zzb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.zzf);
        parcel.writeString(this.zza);
        parcel.writeString(this.zzc);
    }

    public zzabv(String str, String str2, String str3) {
        super("COMM");
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }
}
