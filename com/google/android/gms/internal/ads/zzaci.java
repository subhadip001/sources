package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import f.a.b.a.a;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzaci extends zzacc {
    public static final Parcelable.Creator<zzaci> CREATOR = new zzach();
    public final String zza;
    public final byte[] zzb;

    public zzaci(Parcel parcel) {
        super("PRIV");
        String readString = parcel.readString();
        int i2 = zzeg.zza;
        this.zza = readString;
        this.zzb = (byte[]) zzeg.zzG(parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaci.class == obj.getClass()) {
            zzaci zzaciVar = (zzaci) obj;
            if (zzeg.zzS(this.zza, zzaciVar.zza) && Arrays.equals(this.zzb, zzaciVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        return Arrays.hashCode(this.zzb) + (((str != null ? str.hashCode() : 0) + 527) * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzacc
    public final String toString() {
        return a.q(this.zzf, ": owner=", this.zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.zza);
        parcel.writeByteArray(this.zzb);
    }

    public zzaci(String str, byte[] bArr) {
        super("PRIV");
        this.zza = str;
        this.zzb = bArr;
    }
}
