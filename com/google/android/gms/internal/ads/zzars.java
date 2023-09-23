package com.google.android.gms.internal.ads;

import android.media.MediaFormat;
import android.os.Parcel;
import android.os.Parcelable;
import com.arthenica.ffmpegkit.StreamInformation;
import f.a.b.a.a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzars implements Parcelable {
    public static final Parcelable.Creator<zzars> CREATOR = new zzarr();
    private int zzA;
    public final String zza;
    public final int zzb;
    public final String zzc;
    public final zzawd zzd;
    public final String zze;
    public final String zzf;
    public final int zzg;
    public final List zzh;
    public final zzatr zzi;
    public final int zzj;
    public final int zzk;
    public final float zzl;
    public final int zzm;
    public final float zzn;
    public final int zzo;
    public final byte[] zzp;
    public final zzazq zzq;
    public final int zzr;
    public final int zzs;
    public final int zzt;
    public final int zzu;
    public final int zzv;
    public final long zzw;
    public final int zzx;
    public final String zzy;
    public final int zzz;

    public zzars(Parcel parcel) {
        this.zza = parcel.readString();
        this.zze = parcel.readString();
        this.zzf = parcel.readString();
        this.zzc = parcel.readString();
        this.zzb = parcel.readInt();
        this.zzg = parcel.readInt();
        this.zzj = parcel.readInt();
        this.zzk = parcel.readInt();
        this.zzl = parcel.readFloat();
        this.zzm = parcel.readInt();
        this.zzn = parcel.readFloat();
        this.zzp = parcel.readInt() != 0 ? parcel.createByteArray() : null;
        this.zzo = parcel.readInt();
        this.zzq = (zzazq) parcel.readParcelable(zzazq.class.getClassLoader());
        this.zzr = parcel.readInt();
        this.zzs = parcel.readInt();
        this.zzt = parcel.readInt();
        this.zzu = parcel.readInt();
        this.zzv = parcel.readInt();
        this.zzx = parcel.readInt();
        this.zzy = parcel.readString();
        this.zzz = parcel.readInt();
        this.zzw = parcel.readLong();
        int readInt = parcel.readInt();
        this.zzh = new ArrayList(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            this.zzh.add(parcel.createByteArray());
        }
        this.zzi = (zzatr) parcel.readParcelable(zzatr.class.getClassLoader());
        this.zzd = (zzawd) parcel.readParcelable(zzawd.class.getClassLoader());
    }

    public static zzars zzg(String str, String str2, String str3, int i2, int i3, int i4, int i5, List list, zzatr zzatrVar, int i6, String str4) {
        return zzh(str, str2, null, -1, -1, i4, i5, -1, -1, -1, null, zzatrVar, 0, str4, null);
    }

    public static zzars zzh(String str, String str2, String str3, int i2, int i3, int i4, int i5, int i6, int i7, int i8, List list, zzatr zzatrVar, int i9, String str4, zzawd zzawdVar) {
        return new zzars(str, null, str2, null, -1, i3, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i4, i5, i6, -1, -1, i9, str4, -1, Long.MAX_VALUE, list, zzatrVar, null);
    }

    public static zzars zzi(String str, String str2, String str3, int i2, List list, String str4, zzatr zzatrVar) {
        return new zzars(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, str4, -1, Long.MAX_VALUE, list, zzatrVar, null);
    }

    public static zzars zzj(String str, String str2, String str3, int i2, zzatr zzatrVar) {
        return new zzars(str, null, "application/x-camera-motion", null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, zzatrVar, null);
    }

    public static zzars zzk(String str, String str2, String str3, int i2, int i3, String str4, int i4, zzatr zzatrVar, long j2, List list) {
        return new zzars(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i3, str4, -1, j2, list, zzatrVar, null);
    }

    public static zzars zzl(String str, String str2, String str3, int i2, int i3, int i4, int i5, float f2, List list, int i6, float f3, byte[] bArr, int i7, zzazq zzazqVar, zzatr zzatrVar) {
        return new zzars(str, null, str2, null, -1, i3, i4, i5, -1.0f, i6, f3, bArr, i7, zzazqVar, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, list, zzatrVar, null);
    }

    private static void zzm(MediaFormat mediaFormat, String str, int i2) {
        if (i2 != -1) {
            mediaFormat.setInteger(str, i2);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzars.class == obj.getClass()) {
            zzars zzarsVar = (zzars) obj;
            if (this.zzb == zzarsVar.zzb && this.zzg == zzarsVar.zzg && this.zzj == zzarsVar.zzj && this.zzk == zzarsVar.zzk && this.zzl == zzarsVar.zzl && this.zzm == zzarsVar.zzm && this.zzn == zzarsVar.zzn && this.zzo == zzarsVar.zzo && this.zzr == zzarsVar.zzr && this.zzs == zzarsVar.zzs && this.zzt == zzarsVar.zzt && this.zzu == zzarsVar.zzu && this.zzv == zzarsVar.zzv && this.zzw == zzarsVar.zzw && this.zzx == zzarsVar.zzx && zzazn.zzo(this.zza, zzarsVar.zza) && zzazn.zzo(this.zzy, zzarsVar.zzy) && this.zzz == zzarsVar.zzz && zzazn.zzo(this.zze, zzarsVar.zze) && zzazn.zzo(this.zzf, zzarsVar.zzf) && zzazn.zzo(this.zzc, zzarsVar.zzc) && zzazn.zzo(this.zzi, zzarsVar.zzi) && zzazn.zzo(this.zzd, zzarsVar.zzd) && zzazn.zzo(this.zzq, zzarsVar.zzq) && Arrays.equals(this.zzp, zzarsVar.zzp) && this.zzh.size() == zzarsVar.zzh.size()) {
                for (int i2 = 0; i2 < this.zzh.size(); i2++) {
                    if (!Arrays.equals((byte[]) this.zzh.get(i2), (byte[]) zzarsVar.zzh.get(i2))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.zzA;
        if (i2 == 0) {
            String str = this.zza;
            int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
            String str2 = this.zze;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.zzf;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.zzc;
            int hashCode4 = (((((((((((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.zzb) * 31) + this.zzj) * 31) + this.zzk) * 31) + this.zzr) * 31) + this.zzs) * 31;
            String str5 = this.zzy;
            int hashCode5 = (((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.zzz) * 31;
            zzatr zzatrVar = this.zzi;
            int hashCode6 = (hashCode5 + (zzatrVar == null ? 0 : zzatrVar.hashCode())) * 31;
            zzawd zzawdVar = this.zzd;
            int hashCode7 = hashCode6 + (zzawdVar != null ? zzawdVar.hashCode() : 0);
            this.zzA = hashCode7;
            return hashCode7;
        }
        return i2;
    }

    public final String toString() {
        String str = this.zza;
        String str2 = this.zze;
        String str3 = this.zzf;
        int i2 = this.zzb;
        String str4 = this.zzy;
        int i3 = this.zzj;
        int i4 = this.zzk;
        float f2 = this.zzl;
        int i5 = this.zzr;
        int i6 = this.zzs;
        StringBuilder F = a.F("Format(", str, ", ", str2, ", ");
        F.append(str3);
        F.append(", ");
        F.append(i2);
        F.append(", ");
        F.append(str4);
        F.append(", [");
        F.append(i3);
        F.append(", ");
        F.append(i4);
        F.append(", ");
        F.append(f2);
        F.append("], [");
        F.append(i5);
        F.append(", ");
        F.append(i6);
        F.append("])");
        return F.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zze);
        parcel.writeString(this.zzf);
        parcel.writeString(this.zzc);
        parcel.writeInt(this.zzb);
        parcel.writeInt(this.zzg);
        parcel.writeInt(this.zzj);
        parcel.writeInt(this.zzk);
        parcel.writeFloat(this.zzl);
        parcel.writeInt(this.zzm);
        parcel.writeFloat(this.zzn);
        parcel.writeInt(this.zzp != null ? 1 : 0);
        byte[] bArr = this.zzp;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.zzo);
        parcel.writeParcelable(this.zzq, i2);
        parcel.writeInt(this.zzr);
        parcel.writeInt(this.zzs);
        parcel.writeInt(this.zzt);
        parcel.writeInt(this.zzu);
        parcel.writeInt(this.zzv);
        parcel.writeInt(this.zzx);
        parcel.writeString(this.zzy);
        parcel.writeInt(this.zzz);
        parcel.writeLong(this.zzw);
        int size = this.zzh.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            parcel.writeByteArray((byte[]) this.zzh.get(i3));
        }
        parcel.writeParcelable(this.zzi, 0);
        parcel.writeParcelable(this.zzd, 0);
    }

    public final int zza() {
        int i2;
        int i3 = this.zzj;
        if (i3 == -1 || (i2 = this.zzk) == -1) {
            return -1;
        }
        return i3 * i2;
    }

    public final MediaFormat zzb() {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", this.zzf);
        String str = this.zzy;
        if (str != null) {
            mediaFormat.setString("language", str);
        }
        zzm(mediaFormat, "max-input-size", this.zzg);
        zzm(mediaFormat, StreamInformation.KEY_WIDTH, this.zzj);
        zzm(mediaFormat, StreamInformation.KEY_HEIGHT, this.zzk);
        float f2 = this.zzl;
        if (f2 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f2);
        }
        zzm(mediaFormat, "rotation-degrees", this.zzm);
        zzm(mediaFormat, "channel-count", this.zzr);
        zzm(mediaFormat, "sample-rate", this.zzs);
        zzm(mediaFormat, "encoder-delay", this.zzu);
        zzm(mediaFormat, "encoder-padding", this.zzv);
        for (int i2 = 0; i2 < this.zzh.size(); i2++) {
            mediaFormat.setByteBuffer(a.i("csd-", i2), ByteBuffer.wrap((byte[]) this.zzh.get(i2)));
        }
        zzazq zzazqVar = this.zzq;
        if (zzazqVar != null) {
            zzm(mediaFormat, "color-transfer", zzazqVar.zzc);
            zzm(mediaFormat, "color-standard", zzazqVar.zza);
            zzm(mediaFormat, "color-range", zzazqVar.zzb);
            byte[] bArr = zzazqVar.zzd;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        return mediaFormat;
    }

    public final zzars zzc(zzatr zzatrVar) {
        return new zzars(this.zza, this.zze, this.zzf, this.zzc, this.zzb, this.zzg, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, this.zzu, this.zzv, this.zzx, this.zzy, this.zzz, this.zzw, this.zzh, zzatrVar, this.zzd);
    }

    public final zzars zzd(int i2, int i3) {
        return new zzars(this.zza, this.zze, this.zzf, this.zzc, this.zzb, this.zzg, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, i2, i3, this.zzx, this.zzy, this.zzz, this.zzw, this.zzh, this.zzi, this.zzd);
    }

    public final zzars zze(int i2) {
        return new zzars(this.zza, this.zze, this.zzf, this.zzc, this.zzb, i2, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, this.zzu, this.zzv, this.zzx, this.zzy, this.zzz, this.zzw, this.zzh, this.zzi, this.zzd);
    }

    public final zzars zzf(zzawd zzawdVar) {
        return new zzars(this.zza, this.zze, this.zzf, this.zzc, this.zzb, this.zzg, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, this.zzu, this.zzv, this.zzx, this.zzy, this.zzz, this.zzw, this.zzh, this.zzi, zzawdVar);
    }

    public zzars(String str, String str2, String str3, String str4, int i2, int i3, int i4, int i5, float f2, int i6, float f3, byte[] bArr, int i7, zzazq zzazqVar, int i8, int i9, int i10, int i11, int i12, int i13, String str5, int i14, long j2, List list, zzatr zzatrVar, zzawd zzawdVar) {
        this.zza = str;
        this.zze = str2;
        this.zzf = str3;
        this.zzc = str4;
        this.zzb = i2;
        this.zzg = i3;
        this.zzj = i4;
        this.zzk = i5;
        this.zzl = f2;
        this.zzm = i6;
        this.zzn = f3;
        this.zzp = bArr;
        this.zzo = i7;
        this.zzq = zzazqVar;
        this.zzr = i8;
        this.zzs = i9;
        this.zzt = i10;
        this.zzu = i11;
        this.zzv = i12;
        this.zzx = i13;
        this.zzy = str5;
        this.zzz = i14;
        this.zzw = j2;
        this.zzh = list == null ? Collections.emptyList() : list;
        this.zzi = zzatrVar;
        this.zzd = zzawdVar;
    }
}
