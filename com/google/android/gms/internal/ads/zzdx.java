package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdx {
    public byte[] zza;
    private int zzb;
    private int zzc;
    private int zzd;

    public zzdx() {
        this.zza = zzeg.zzf;
    }

    public zzdx(byte[] bArr, int i2) {
        this.zza = bArr;
        this.zzd = i2;
    }

    private final void zzm() {
        int i2;
        int i3 = this.zzb;
        boolean z = true;
        if (i3 < 0 || (i3 >= (i2 = this.zzd) && (i3 != i2 || this.zzc != 0))) {
            z = false;
        }
        zzcw.zzf(z);
    }

    public final int zza() {
        return ((this.zzd - this.zzb) * 8) - this.zzc;
    }

    public final int zzb() {
        return (this.zzb * 8) + this.zzc;
    }

    public final int zzc(int i2) {
        int i3;
        if (i2 == 0) {
            return 0;
        }
        this.zzc += i2;
        int i4 = 0;
        while (true) {
            i3 = this.zzc;
            if (i3 <= 8) {
                break;
            }
            int i5 = i3 - 8;
            this.zzc = i5;
            byte[] bArr = this.zza;
            int i6 = this.zzb;
            this.zzb = i6 + 1;
            i4 |= (bArr[i6] & 255) << i5;
        }
        byte[] bArr2 = this.zza;
        int i7 = this.zzb;
        int i8 = ((-1) >>> (32 - i2)) & (i4 | ((bArr2[i7] & 255) >> (8 - i3)));
        if (i3 == 8) {
            this.zzc = 0;
            this.zzb = i7 + 1;
        }
        zzm();
        return i8;
    }

    public final void zzd() {
        if (this.zzc == 0) {
            return;
        }
        this.zzc = 0;
        this.zzb++;
        zzm();
    }

    public final void zze(int i2, int i3) {
        int i4;
        int i5 = i2 & 16383;
        int min = Math.min(8 - this.zzc, 14);
        int i6 = this.zzc;
        int i7 = (8 - i6) - min;
        byte[] bArr = this.zza;
        int i8 = this.zzb;
        byte b = (byte) (((65280 >> i6) | ((1 << i7) - 1)) & bArr[i8]);
        bArr[i8] = b;
        int i9 = 14 - min;
        bArr[i8] = (byte) (b | ((i5 >>> i9) << i7));
        int i10 = i8 + 1;
        while (i9 > 8) {
            i9 -= 8;
            this.zza[i10] = (byte) (i5 >>> i9);
            i10++;
        }
        byte[] bArr2 = this.zza;
        byte b2 = (byte) (bArr2[i10] & ((1 << i4) - 1));
        bArr2[i10] = b2;
        bArr2[i10] = (byte) (((i5 & ((1 << i9) - 1)) << (8 - i9)) | b2);
        zzj(14);
        zzm();
    }

    public final void zzf(byte[] bArr, int i2, int i3) {
        int i4 = i3 >> 3;
        for (int i5 = 0; i5 < i4; i5++) {
            byte[] bArr2 = this.zza;
            int i6 = this.zzb;
            int i7 = i6 + 1;
            this.zzb = i7;
            byte b = bArr2[i6];
            int i8 = this.zzc;
            byte b2 = (byte) (b << i8);
            bArr[i5] = b2;
            bArr[i5] = (byte) (((255 & bArr2[i7]) >> (8 - i8)) | b2);
        }
        int i9 = i3 & 7;
        if (i9 == 0) {
            return;
        }
        byte b3 = (byte) (bArr[i4] & (255 >> i9));
        bArr[i4] = b3;
        int i10 = this.zzc;
        if (i10 + i9 > 8) {
            byte[] bArr3 = this.zza;
            int i11 = this.zzb;
            this.zzb = i11 + 1;
            b3 = (byte) (b3 | ((bArr3[i11] & 255) << i10));
            bArr[i4] = b3;
            i10 -= 8;
        }
        int i12 = i10 + i9;
        this.zzc = i12;
        byte[] bArr4 = this.zza;
        int i13 = this.zzb;
        bArr[i4] = (byte) (((byte) (((255 & bArr4[i13]) >> (8 - i12)) << (8 - i9))) | b3);
        if (i12 == 8) {
            this.zzc = 0;
            this.zzb = i13 + 1;
        }
        zzm();
    }

    public final void zzg(byte[] bArr, int i2) {
        this.zza = bArr;
        this.zzb = 0;
        this.zzc = 0;
        this.zzd = i2;
    }

    public final void zzh(int i2) {
        int i3 = i2 / 8;
        this.zzb = i3;
        this.zzc = i2 - (i3 * 8);
        zzm();
    }

    public final void zzi() {
        int i2 = this.zzc + 1;
        this.zzc = i2;
        if (i2 == 8) {
            this.zzc = 0;
            this.zzb++;
        }
        zzm();
    }

    public final void zzj(int i2) {
        int i3 = i2 / 8;
        int i4 = this.zzb + i3;
        this.zzb = i4;
        int i5 = (i2 - (i3 * 8)) + this.zzc;
        this.zzc = i5;
        if (i5 > 7) {
            this.zzb = i4 + 1;
            this.zzc = i5 - 8;
        }
        zzm();
    }

    public final void zzk(int i2) {
        zzcw.zzf(this.zzc == 0);
        this.zzb += i2;
        zzm();
    }

    public final boolean zzl() {
        boolean z = (this.zza[this.zzb] & (128 >> this.zzc)) != 0;
        zzi();
        return z;
    }
}
