package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import f.a.b.a.a;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzabh implements zzbk {
    public static final Parcelable.Creator<zzabh> CREATOR = new zzabg();
    public final int zza;
    public final String zzb;
    public final String zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final byte[] zzh;

    public zzabh(int i2, String str, String str2, int i3, int i4, int i5, int i6, byte[] bArr) {
        this.zza = i2;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = i3;
        this.zze = i4;
        this.zzf = i5;
        this.zzg = i6;
        this.zzh = bArr;
    }

    public zzabh(Parcel parcel) {
        this.zza = parcel.readInt();
        String readString = parcel.readString();
        int i2 = zzeg.zza;
        this.zzb = readString;
        this.zzc = parcel.readString();
        this.zzd = parcel.readInt();
        this.zze = parcel.readInt();
        this.zzf = parcel.readInt();
        this.zzg = parcel.readInt();
        this.zzh = (byte[]) zzeg.zzG(parcel.createByteArray());
    }

    public static zzabh zzb(zzdy zzdyVar) {
        int zze = zzdyVar.zze();
        String zzx = zzdyVar.zzx(zzdyVar.zze(), zzfog.zza);
        String zzx2 = zzdyVar.zzx(zzdyVar.zze(), zzfog.zzc);
        int zze2 = zzdyVar.zze();
        int zze3 = zzdyVar.zze();
        int zze4 = zzdyVar.zze();
        int zze5 = zzdyVar.zze();
        int zze6 = zzdyVar.zze();
        byte[] bArr = new byte[zze6];
        zzdyVar.zzB(bArr, 0, zze6);
        return new zzabh(zze, zzx, zzx2, zze2, zze3, zze4, zze5, bArr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzabh.class == obj.getClass()) {
            zzabh zzabhVar = (zzabh) obj;
            if (this.zza == zzabhVar.zza && this.zzb.equals(zzabhVar.zzb) && this.zzc.equals(zzabhVar.zzc) && this.zzd == zzabhVar.zzd && this.zze == zzabhVar.zze && this.zzf == zzabhVar.zzf && this.zzg == zzabhVar.zzg && Arrays.equals(this.zzh, zzabhVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int I = a.I(this.zzb, (this.zza + 527) * 31, 31);
        return Arrays.hashCode(this.zzh) + ((((((((a.I(this.zzc, I, 31) + this.zzd) * 31) + this.zze) * 31) + this.zzf) * 31) + this.zzg) * 31);
    }

    public final String toString() {
        return a.r("Picture: mimeType=", this.zzb, ", description=", this.zzc);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeInt(this.zzd);
        parcel.writeInt(this.zze);
        parcel.writeInt(this.zzf);
        parcel.writeInt(this.zzg);
        parcel.writeByteArray(this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final void zza(zzbf zzbfVar) {
        zzbfVar.zza(this.zzh, this.zza);
    }
}
