package com.google.android.gms.internal.ads;

import f.a.b.a.a;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzazg {
    public byte[] zza;
    private int zzb;
    private int zzc;

    public zzazg() {
    }

    public zzazg(int i2) {
        this.zza = new byte[i2];
        this.zzc = i2;
    }

    public final int zza() {
        return this.zzc - this.zzb;
    }

    public final int zzb() {
        byte[] bArr = this.zza;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    public final int zzc() {
        return this.zzb;
    }

    public final int zzd() {
        return this.zzc;
    }

    public final int zze() {
        byte[] bArr = this.zza;
        int i2 = this.zzb;
        int i3 = i2 + 1;
        this.zzb = i3;
        byte b = bArr[i2];
        int i4 = i3 + 1;
        this.zzb = i4;
        byte b2 = bArr[i3];
        int i5 = i4 + 1;
        this.zzb = i5;
        byte b3 = bArr[i4];
        this.zzb = i5 + 1;
        return (bArr[i5] & 255) | ((b & 255) << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8);
    }

    public final int zzf() {
        byte[] bArr = this.zza;
        int i2 = this.zzb;
        int i3 = i2 + 1;
        this.zzb = i3;
        byte b = bArr[i2];
        this.zzb = i3 + 1;
        return ((bArr[i3] & 255) << 8) | (b & 255);
    }

    public final int zzg() {
        byte[] bArr = this.zza;
        int i2 = this.zzb;
        this.zzb = i2 + 1;
        return bArr[i2] & 255;
    }

    public final int zzh() {
        byte[] bArr = this.zza;
        int i2 = this.zzb;
        int i3 = i2 + 1;
        this.zzb = i3;
        byte b = bArr[i2];
        int i4 = i3 + 1;
        this.zzb = i4;
        byte b2 = bArr[i3];
        this.zzb = i4 + 2;
        return (b2 & 255) | ((b & 255) << 8);
    }

    public final int zzi() {
        int zze = zze();
        if (zze >= 0) {
            return zze;
        }
        throw new IllegalStateException(a.i("Top bit not zero: ", zze));
    }

    public final int zzj() {
        byte[] bArr = this.zza;
        int i2 = this.zzb;
        int i3 = i2 + 1;
        this.zzb = i3;
        byte b = bArr[i2];
        this.zzb = i3 + 1;
        return (bArr[i3] & 255) | ((b & 255) << 8);
    }

    public final long zzk() {
        byte[] bArr = this.zza;
        int i2 = this.zzb;
        int i3 = i2 + 1;
        this.zzb = i3;
        byte b = bArr[i2];
        int i4 = i3 + 1;
        this.zzb = i4;
        byte b2 = bArr[i3];
        int i5 = i4 + 1;
        this.zzb = i5;
        byte b3 = bArr[i4];
        this.zzb = i5 + 1;
        return ((b2 & 255) << 8) | (b & 255) | ((b3 & 255) << 16) | ((bArr[i5] & 255) << 24);
    }

    public final long zzl() {
        byte[] bArr = this.zza;
        int i2 = this.zzb;
        int i3 = i2 + 1;
        this.zzb = i3;
        byte b = bArr[i2];
        int i4 = i3 + 1;
        this.zzb = i4;
        byte b2 = bArr[i3];
        int i5 = i4 + 1;
        this.zzb = i5;
        byte b3 = bArr[i4];
        int i6 = i5 + 1;
        this.zzb = i6;
        byte b4 = bArr[i5];
        int i7 = i6 + 1;
        this.zzb = i7;
        byte b5 = bArr[i6];
        int i8 = i7 + 1;
        this.zzb = i8;
        byte b6 = bArr[i7];
        int i9 = i8 + 1;
        this.zzb = i9;
        byte b7 = bArr[i8];
        this.zzb = i9 + 1;
        return ((b2 & 255) << 48) | ((b & 255) << 56) | ((b3 & 255) << 40) | ((b4 & 255) << 32) | ((b5 & 255) << 24) | ((b6 & 255) << 16) | ((b7 & 255) << 8) | (bArr[i9] & 255);
    }

    public final long zzm() {
        byte[] bArr = this.zza;
        int i2 = this.zzb;
        int i3 = i2 + 1;
        this.zzb = i3;
        byte b = bArr[i2];
        int i4 = i3 + 1;
        this.zzb = i4;
        byte b2 = bArr[i3];
        int i5 = i4 + 1;
        this.zzb = i5;
        byte b3 = bArr[i4];
        this.zzb = i5 + 1;
        return ((b2 & 255) << 16) | ((b & 255) << 24) | ((b3 & 255) << 8) | (bArr[i5] & 255);
    }

    public final long zzn() {
        long zzl = zzl();
        if (zzl >= 0) {
            return zzl;
        }
        throw new IllegalStateException(a.l("Top bit not zero: ", zzl));
    }

    public final String zzo(int i2) {
        if (i2 == 0) {
            return "";
        }
        int i3 = this.zzb;
        int i4 = i3 + i2;
        int i5 = i4 - 1;
        if (i5 < this.zzc && this.zza[i5] == 0) {
            i2--;
        }
        String str = new String(this.zza, i3, i2);
        this.zzb = i4;
        return str;
    }

    public final short zzp() {
        byte[] bArr = this.zza;
        int i2 = this.zzb;
        int i3 = i2 + 1;
        this.zzb = i3;
        byte b = bArr[i2];
        this.zzb = i3 + 1;
        return (short) ((bArr[i3] & 255) | ((b & 255) << 8));
    }

    public final void zzq(byte[] bArr, int i2, int i3) {
        System.arraycopy(this.zza, this.zzb, bArr, i2, i3);
        this.zzb += i3;
    }

    public final void zzr() {
        this.zzb = 0;
        this.zzc = 0;
    }

    public final void zzs(int i2) {
        zzt(zzb() < i2 ? new byte[i2] : this.zza, i2);
    }

    public final void zzt(byte[] bArr, int i2) {
        this.zza = bArr;
        this.zzc = i2;
        this.zzb = 0;
    }

    public final void zzu(int i2) {
        boolean z = false;
        if (i2 >= 0 && i2 <= this.zza.length) {
            z = true;
        }
        zzayy.zzc(z);
        this.zzc = i2;
    }

    public final void zzv(int i2) {
        boolean z = false;
        if (i2 >= 0 && i2 <= this.zzc) {
            z = true;
        }
        zzayy.zzc(z);
        this.zzb = i2;
    }

    public final void zzw(int i2) {
        zzv(this.zzb + i2);
    }

    public zzazg(byte[] bArr) {
        this.zza = bArr;
        this.zzc = bArr.length;
    }
}
