package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzzr {
    private byte[] zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    public zzzr(byte[] bArr, int i2, int i3) {
        this.zza = bArr;
        this.zzc = i2;
        this.zzb = i3;
        zzh();
    }

    private final int zzg() {
        int i2 = 0;
        while (!zzf()) {
            i2++;
        }
        return ((1 << i2) - 1) + (i2 > 0 ? zza(i2) : 0);
    }

    private final void zzh() {
        int i2;
        int i3 = this.zzc;
        boolean z = true;
        if (i3 < 0 || (i3 >= (i2 = this.zzb) && (i3 != i2 || this.zzd != 0))) {
            z = false;
        }
        zzcw.zzf(z);
    }

    private final boolean zzi(int i2) {
        if (i2 < 2 || i2 >= this.zzb) {
            return false;
        }
        byte[] bArr = this.zza;
        return bArr[i2] == 3 && bArr[i2 + (-2)] == 0 && bArr[i2 + (-1)] == 0;
    }

    public final int zza(int i2) {
        int i3;
        this.zzd += i2;
        int i4 = 0;
        while (true) {
            i3 = this.zzd;
            if (i3 <= 8) {
                break;
            }
            int i5 = i3 - 8;
            this.zzd = i5;
            byte[] bArr = this.zza;
            int i6 = this.zzc;
            i4 |= (bArr[i6] & 255) << i5;
            if (true != zzi(i6 + 1)) {
                r3 = 1;
            }
            this.zzc = i6 + r3;
        }
        byte[] bArr2 = this.zza;
        int i7 = this.zzc;
        int i8 = ((-1) >>> (32 - i2)) & (i4 | ((bArr2[i7] & 255) >> (8 - i3)));
        if (i3 == 8) {
            this.zzd = 0;
            this.zzc = i7 + (true != zzi(i7 + 1) ? 1 : 2);
        }
        zzh();
        return i8;
    }

    public final int zzb() {
        int zzg = zzg();
        return ((zzg + 1) / 2) * (zzg % 2 == 0 ? -1 : 1);
    }

    public final int zzc() {
        return zzg();
    }

    public final void zzd() {
        int i2 = this.zzd + 1;
        this.zzd = i2;
        if (i2 == 8) {
            this.zzd = 0;
            int i3 = this.zzc;
            this.zzc = i3 + (true == zzi(i3 + 1) ? 2 : 1);
        }
        zzh();
    }

    public final void zze(int i2) {
        int i3 = this.zzc;
        int i4 = i2 / 8;
        int i5 = i3 + i4;
        this.zzc = i5;
        int i6 = (i2 - (i4 * 8)) + this.zzd;
        this.zzd = i6;
        if (i6 > 7) {
            this.zzc = i5 + 1;
            this.zzd = i6 - 8;
        }
        while (true) {
            i3++;
            if (i3 > this.zzc) {
                zzh();
                return;
            } else if (zzi(i3)) {
                this.zzc++;
                i3 += 2;
            }
        }
    }

    public final boolean zzf() {
        boolean z = (this.zza[this.zzc] & (128 >> this.zzd)) != 0;
        zzd();
        return z;
    }
}
