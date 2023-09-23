package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzacg extends zzacc {
    public static final Parcelable.Creator<zzacg> CREATOR = new zzacf();
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int[] zzd;
    public final int[] zze;

    public zzacg(int i2, int i3, int i4, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.zza = i2;
        this.zzb = i3;
        this.zzc = i4;
        this.zzd = iArr;
        this.zze = iArr2;
    }

    @Override // com.google.android.gms.internal.ads.zzacc, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzacg.class == obj.getClass()) {
            zzacg zzacgVar = (zzacg) obj;
            if (this.zza == zzacgVar.zza && this.zzb == zzacgVar.zzb && this.zzc == zzacgVar.zzc && Arrays.equals(this.zzd, zzacgVar.zzd) && Arrays.equals(this.zze, zzacgVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.zzd);
        return Arrays.hashCode(this.zze) + ((hashCode + ((((((this.zza + 527) * 31) + this.zzb) * 31) + this.zzc) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.zza);
        parcel.writeInt(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeIntArray(this.zzd);
        parcel.writeIntArray(this.zze);
    }

    public zzacg(Parcel parcel) {
        super("MLLT");
        this.zza = parcel.readInt();
        this.zzb = parcel.readInt();
        this.zzc = parcel.readInt();
        this.zzd = (int[]) zzeg.zzG(parcel.createIntArray());
        this.zze = (int[]) zzeg.zzG(parcel.createIntArray());
    }
}
