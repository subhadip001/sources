package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import f.a.b.a.a;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzacp implements zzbk {
    public static final Parcelable.Creator<zzacp> CREATOR = new zzacn();
    public final String zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    public /* synthetic */ zzacp(Parcel parcel, zzaco zzacoVar) {
        String readString = parcel.readString();
        int i2 = zzeg.zza;
        this.zza = readString;
        this.zzb = (byte[]) zzeg.zzG(parcel.createByteArray());
        this.zzc = parcel.readInt();
        this.zzd = parcel.readInt();
    }

    public zzacp(String str, byte[] bArr, int i2, int i3) {
        this.zza = str;
        this.zzb = bArr;
        this.zzc = i2;
        this.zzd = i3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzacp.class == obj.getClass()) {
            zzacp zzacpVar = (zzacp) obj;
            if (this.zza.equals(zzacpVar.zza) && Arrays.equals(this.zzb, zzacpVar.zzb) && this.zzc == zzacpVar.zzc && this.zzd == zzacpVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.zzb) + a.I(this.zza, 527, 31)) * 31) + this.zzc) * 31) + this.zzd;
    }

    public final String toString() {
        return "mdta: key=".concat(String.valueOf(this.zza));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.zza);
        parcel.writeByteArray(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeInt(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final /* synthetic */ void zza(zzbf zzbfVar) {
    }
}
