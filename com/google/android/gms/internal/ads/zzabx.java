package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import f.a.b.a.a;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzabx extends zzacc {
    public static final Parcelable.Creator<zzabx> CREATOR = new zzabw();
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final byte[] zzd;

    public zzabx(Parcel parcel) {
        super("GEOB");
        String readString = parcel.readString();
        int i2 = zzeg.zza;
        this.zza = readString;
        this.zzb = parcel.readString();
        this.zzc = parcel.readString();
        this.zzd = (byte[]) zzeg.zzG(parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzabx.class == obj.getClass()) {
            zzabx zzabxVar = (zzabx) obj;
            if (zzeg.zzS(this.zza, zzabxVar.zza) && zzeg.zzS(this.zzb, zzabxVar.zzb) && zzeg.zzS(this.zzc, zzabxVar.zzc) && Arrays.equals(this.zzd, zzabxVar.zzd)) {
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
        return Arrays.hashCode(this.zzd) + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzacc
    public final String toString() {
        String str = this.zzf;
        String str2 = this.zza;
        String str3 = this.zzb;
        return a.u(a.F(str, ": mimeType=", str2, ", filename=", str3), ", description=", this.zzc);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeByteArray(this.zzd);
    }

    public zzabx(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = bArr;
    }
}
