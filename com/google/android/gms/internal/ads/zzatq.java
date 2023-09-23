package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import f.a.b.a.a;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzatq implements Parcelable {
    public static final Parcelable.Creator<zzatq> CREATOR = new zzatp();
    public final String zza;
    public final byte[] zzb;
    public final boolean zzc;
    private int zzd;
    private final UUID zze;

    public zzatq(Parcel parcel) {
        this.zze = new UUID(parcel.readLong(), parcel.readLong());
        this.zza = parcel.readString();
        this.zzb = parcel.createByteArray();
        this.zzc = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzatq) {
            if (obj == this) {
                return true;
            }
            zzatq zzatqVar = (zzatq) obj;
            return this.zza.equals(zzatqVar.zza) && zzazn.zzo(this.zze, zzatqVar.zze) && Arrays.equals(this.zzb, zzatqVar.zzb);
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.zzd;
        if (i2 == 0) {
            int I = a.I(this.zza, this.zze.hashCode() * 31, 31) + Arrays.hashCode(this.zzb);
            this.zzd = I;
            return I;
        }
        return i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.zze.getMostSignificantBits());
        parcel.writeLong(this.zze.getLeastSignificantBits());
        parcel.writeString(this.zza);
        parcel.writeByteArray(this.zzb);
        parcel.writeByte(this.zzc ? (byte) 1 : (byte) 0);
    }

    public zzatq(UUID uuid, String str, byte[] bArr, boolean z) {
        Objects.requireNonNull(uuid);
        this.zze = uuid;
        this.zza = str;
        Objects.requireNonNull(bArr);
        this.zzb = bArr;
        this.zzc = false;
    }
}
