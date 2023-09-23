package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzawh extends zzawj {
    public static final Parcelable.Creator<zzawh> CREATOR = new zzawg();
    public final String zza;
    public final String zzb;
    public final String zzc;

    public zzawh(Parcel parcel) {
        super("COMM");
        this.zza = parcel.readString();
        this.zzb = parcel.readString();
        this.zzc = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzawh.class == obj.getClass()) {
            zzawh zzawhVar = (zzawh) obj;
            if (zzazn.zzo(this.zzb, zzawhVar.zzb) && zzazn.zzo(this.zza, zzawhVar.zza) && zzazn.zzo(this.zzc, zzawhVar.zzc)) {
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

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.zze);
        parcel.writeString(this.zza);
        parcel.writeString(this.zzc);
    }

    public zzawh(String str, String str2, String str3) {
        super("COMM");
        this.zza = "und";
        this.zzb = str2;
        this.zzc = str3;
    }
}
