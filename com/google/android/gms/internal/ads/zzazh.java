package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzazh {
    private final byte[] zza;
    private final int zzb;
    private int zzc;
    private int zzd = 0;

    public zzazh(byte[] bArr, int i2, int i3) {
        this.zza = bArr;
        this.zzc = i2;
        this.zzb = i3;
        zzg();
    }

    private final int zzf() {
        int i2 = 0;
        while (!zze()) {
            i2++;
        }
        return ((1 << i2) - 1) + (i2 > 0 ? zza(i2) : 0);
    }

    private final void zzg() {
        int i2;
        int i3;
        int i4 = this.zzc;
        boolean z = true;
        if (i4 < 0 || (i2 = this.zzd) < 0 || i2 >= 8 || (i4 >= (i3 = this.zzb) && (i4 != i3 || i2 != 0))) {
            z = false;
        }
        zzayy.zze(z);
    }

    private final boolean zzh(int i2) {
        if (i2 < 2 || i2 >= this.zzb) {
            return false;
        }
        byte[] bArr = this.zza;
        return bArr[i2] == 3 && bArr[i2 + (-2)] == 0 && bArr[i2 + (-1)] == 0;
    }

    public final int zza(int i2) {
        int i3;
        int i4;
        int i5 = i2 >> 3;
        int i6 = 0;
        for (int i7 = 0; i7 < i5; i7++) {
            int i8 = zzh(this.zzc + 1) ? this.zzc + 2 : this.zzc + 1;
            int i9 = this.zzd;
            if (i9 != 0) {
                byte[] bArr = this.zza;
                i4 = ((bArr[i8] & 255) >>> (8 - i9)) | ((bArr[this.zzc] & 255) << i9);
            } else {
                i4 = this.zza[this.zzc];
            }
            i2 -= 8;
            i6 |= (255 & i4) << i2;
            this.zzc = i8;
        }
        if (i2 > 0) {
            int i10 = this.zzd + i2;
            byte b = (byte) (255 >> (8 - i2));
            int i11 = zzh(this.zzc + 1) ? this.zzc + 2 : this.zzc + 1;
            if (i10 > 8) {
                byte[] bArr2 = this.zza;
                i3 = (b & (((255 & bArr2[i11]) >> (16 - i10)) | ((bArr2[this.zzc] & 255) << (i10 - 8)))) | i6;
                this.zzc = i11;
            } else {
                i3 = (b & ((255 & this.zza[this.zzc]) >> (8 - i10))) | i6;
                if (i10 == 8) {
                    this.zzc = i11;
                }
            }
            i6 = i3;
            this.zzd = i10 % 8;
        }
        zzg();
        return i6;
    }

    public final int zzb() {
        int zzf = zzf();
        return ((zzf + 1) / 2) * (zzf % 2 == 0 ? -1 : 1);
    }

    public final int zzc() {
        return zzf();
    }

    public final void zzd(int i2) {
        int i3 = this.zzc;
        int i4 = (i2 >> 3) + i3;
        this.zzc = i4;
        int i5 = this.zzd + (i2 & 7);
        this.zzd = i5;
        if (i5 > 7) {
            this.zzc = i4 + 1;
            this.zzd = i5 - 8;
        }
        while (true) {
            i3++;
            if (i3 > this.zzc) {
                zzg();
                return;
            } else if (zzh(i3)) {
                this.zzc++;
                i3 += 2;
            }
        }
    }

    public final boolean zze() {
        return zza(1) == 1;
    }
}
