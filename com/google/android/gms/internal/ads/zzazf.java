package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzazf {
    public byte[] zza;
    private int zzb;
    private int zzc;
    private int zzd;

    public zzazf() {
    }

    public zzazf(byte[] bArr, int i2) {
        this.zza = bArr;
        this.zzd = i2;
    }

    public final int zza(int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i2 >> 3;
        boolean z = false;
        int i8 = 0;
        for (int i9 = 0; i9 < i7; i9++) {
            int i10 = this.zzc;
            if (i10 != 0) {
                byte[] bArr = this.zza;
                int i11 = this.zzb;
                i6 = ((bArr[i11 + 1] & 255) >>> (8 - i10)) | ((bArr[i11] & 255) << i10);
            } else {
                i6 = this.zza[this.zzb];
            }
            i2 -= 8;
            i8 |= (255 & i6) << i2;
            this.zzb++;
        }
        if (i2 > 0) {
            int i12 = this.zzc + i2;
            byte b = (byte) (255 >> (8 - i2));
            if (i12 > 8) {
                byte[] bArr2 = this.zza;
                int i13 = this.zzb;
                int i14 = i13 + 1;
                i5 = (b & (((255 & bArr2[i14]) >> (16 - i12)) | ((bArr2[i13] & 255) << (i12 - 8)))) | i8;
                this.zzb = i14;
            } else {
                byte[] bArr3 = this.zza;
                int i15 = this.zzb;
                i5 = (b & ((255 & bArr3[i15]) >> (8 - i12))) | i8;
                if (i12 == 8) {
                    this.zzb = i15 + 1;
                }
            }
            i8 = i5;
            this.zzc = i12 % 8;
        }
        int i16 = this.zzb;
        if (i16 >= 0 && (i3 = this.zzc) >= 0 && (i16 < (i4 = this.zzd) || (i16 == i4 && i3 == 0))) {
            z = true;
        }
        zzayy.zze(z);
        return i8;
    }
}
