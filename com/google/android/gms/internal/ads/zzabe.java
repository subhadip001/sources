package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import f.a.b.a.a;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzabe implements zzbk {
    public static final Parcelable.Creator<zzabe> CREATOR;
    private static final zzad zzf;
    private static final zzad zzg;
    public final String zza;
    public final String zzb;
    public final long zzc;
    public final long zzd;
    public final byte[] zze;
    private int zzh;

    static {
        zzab zzabVar = new zzab();
        zzabVar.zzS("application/id3");
        zzf = zzabVar.zzY();
        zzab zzabVar2 = new zzab();
        zzabVar2.zzS("application/x-scte35");
        zzg = zzabVar2.zzY();
        CREATOR = new zzabd();
    }

    public zzabe(Parcel parcel) {
        String readString = parcel.readString();
        int i2 = zzeg.zza;
        this.zza = readString;
        this.zzb = parcel.readString();
        this.zzc = parcel.readLong();
        this.zzd = parcel.readLong();
        this.zze = (byte[]) zzeg.zzG(parcel.createByteArray());
    }

    public zzabe(String str, String str2, long j2, long j3, byte[] bArr) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j2;
        this.zzd = j3;
        this.zze = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzabe.class == obj.getClass()) {
            zzabe zzabeVar = (zzabe) obj;
            if (this.zzc == zzabeVar.zzc && this.zzd == zzabeVar.zzd && zzeg.zzS(this.zza, zzabeVar.zza) && zzeg.zzS(this.zzb, zzabeVar.zzb) && Arrays.equals(this.zze, zzabeVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.zzh;
        if (i2 == 0) {
            String str = this.zza;
            int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
            String str2 = this.zzb;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            long j2 = this.zzc;
            long j3 = this.zzd;
            int hashCode3 = ((((((hashCode + hashCode2) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31) + Arrays.hashCode(this.zze);
            this.zzh = hashCode3;
            return hashCode3;
        }
        return i2;
    }

    public final String toString() {
        String str = this.zza;
        long j2 = this.zzd;
        long j3 = this.zzc;
        String str2 = this.zzb;
        StringBuilder sb = new StringBuilder();
        sb.append("EMSG: scheme=");
        sb.append(str);
        sb.append(", id=");
        sb.append(j2);
        a.Q(sb, ", durationMs=", j3, ", value=");
        sb.append(str2);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeLong(this.zzc);
        parcel.writeLong(this.zzd);
        parcel.writeByteArray(this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final /* synthetic */ void zza(zzbf zzbfVar) {
    }
}
