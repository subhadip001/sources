package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import f.a.b.a.a;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzawl extends zzawj {
    public static final Parcelable.Creator<zzawl> CREATOR = new zzawk();
    public final String zza;
    public final String zzb;

    public zzawl(Parcel parcel) {
        super(parcel.readString());
        this.zza = parcel.readString();
        this.zzb = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzawl.class == obj.getClass()) {
            zzawl zzawlVar = (zzawl) obj;
            if (this.zze.equals(zzawlVar.zze) && zzazn.zzo(this.zza, zzawlVar.zza) && zzazn.zzo(this.zzb, zzawlVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int I = a.I(this.zze, 527, 31);
        String str = this.zza;
        int hashCode = (I + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.zzb;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.zze);
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
    }

    public zzawl(String str, String str2, String str3) {
        super(str);
        this.zza = null;
        this.zzb = str3;
    }
}
