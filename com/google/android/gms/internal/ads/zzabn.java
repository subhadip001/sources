package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import f.a.b.a.a;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzabn extends zzacc {
    public static final Parcelable.Creator<zzabn> CREATOR = new zzabm();
    public final String zza;
    public final String zzb;
    public final int zzc;
    public final byte[] zzd;

    public zzabn(Parcel parcel) {
        super("APIC");
        String readString = parcel.readString();
        int i2 = zzeg.zza;
        this.zza = readString;
        this.zzb = parcel.readString();
        this.zzc = parcel.readInt();
        this.zzd = (byte[]) zzeg.zzG(parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzabn.class == obj.getClass()) {
            zzabn zzabnVar = (zzabn) obj;
            if (this.zzc == zzabnVar.zzc && zzeg.zzS(this.zza, zzabnVar.zza) && zzeg.zzS(this.zzb, zzabnVar.zzb) && Arrays.equals(this.zzd, zzabnVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = (this.zzc + 527) * 31;
        String str = this.zza;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.zzb;
        return Arrays.hashCode(this.zzd) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzacc
    public final String toString() {
        return a.s(this.zzf, ": mimeType=", this.zza, ", description=", this.zzb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeByteArray(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzacc, com.google.android.gms.internal.ads.zzbk
    public final void zza(zzbf zzbfVar) {
        zzbfVar.zza(this.zzd, this.zzc);
    }

    public zzabn(String str, String str2, int i2, byte[] bArr) {
        super("APIC");
        this.zza = str;
        this.zzb = str2;
        this.zzc = i2;
        this.zzd = bArr;
    }
}
