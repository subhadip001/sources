package com.google.android.gms.internal.ads;

import f.a.b.a.a;
import java.nio.charset.Charset;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdy {
    private byte[] zza;
    private int zzb;
    private int zzc;

    public zzdy() {
        this.zza = zzeg.zzf;
    }

    public zzdy(byte[] bArr, int i2) {
        this.zza = bArr;
        this.zzc = i2;
    }

    public final void zzA(zzdx zzdxVar, int i2) {
        zzB(zzdxVar.zza, 0, i2);
        zzdxVar.zzh(0);
    }

    public final void zzB(byte[] bArr, int i2, int i3) {
        System.arraycopy(this.zza, this.zzb, bArr, i2, i3);
        this.zzb += i3;
    }

    public final void zzC(int i2) {
        byte[] bArr = this.zza;
        if (bArr.length < i2) {
            bArr = new byte[i2];
        }
        zzD(bArr, i2);
    }

    public final void zzD(byte[] bArr, int i2) {
        this.zza = bArr;
        this.zzc = i2;
        this.zzb = 0;
    }

    public final void zzE(int i2) {
        boolean z = false;
        if (i2 >= 0 && i2 <= this.zza.length) {
            z = true;
        }
        zzcw.zzd(z);
        this.zzc = i2;
    }

    public final void zzF(int i2) {
        boolean z = false;
        if (i2 >= 0 && i2 <= this.zzc) {
            z = true;
        }
        zzcw.zzd(z);
        this.zzb = i2;
    }

    public final void zzG(int i2) {
        zzF(this.zzb + i2);
    }

    public final byte[] zzH() {
        return this.zza;
    }

    public final int zza() {
        return this.zzc - this.zzb;
    }

    public final int zzb() {
        return this.zza.length;
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
        int i4 = i3 + 1;
        this.zzb = i4;
        byte b2 = bArr[i3];
        this.zzb = i4 + 1;
        return (bArr[i4] & 255) | (((b & 255) << 24) >> 8) | ((b2 & 255) << 8);
    }

    public final int zzg() {
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
        return ((bArr[i5] & 255) << 24) | (b & 255) | ((b2 & 255) << 8) | ((b3 & 255) << 16);
    }

    public final int zzh() {
        int zzg = zzg();
        if (zzg >= 0) {
            return zzg;
        }
        throw new IllegalStateException(a.i("Top bit not zero: ", zzg));
    }

    public final int zzi() {
        byte[] bArr = this.zza;
        int i2 = this.zzb;
        int i3 = i2 + 1;
        this.zzb = i3;
        byte b = bArr[i2];
        this.zzb = i3 + 1;
        return ((bArr[i3] & 255) << 8) | (b & 255);
    }

    public final int zzj() {
        return (zzk() << 21) | (zzk() << 14) | (zzk() << 7) | zzk();
    }

    public final int zzk() {
        byte[] bArr = this.zza;
        int i2 = this.zzb;
        this.zzb = i2 + 1;
        return bArr[i2] & 255;
    }

    public final int zzl() {
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

    public final int zzm() {
        byte[] bArr = this.zza;
        int i2 = this.zzb;
        int i3 = i2 + 1;
        this.zzb = i3;
        byte b = bArr[i2];
        int i4 = i3 + 1;
        this.zzb = i4;
        byte b2 = bArr[i3];
        this.zzb = i4 + 1;
        return (bArr[i4] & 255) | ((b & 255) << 16) | ((b2 & 255) << 8);
    }

    public final int zzn() {
        int zze = zze();
        if (zze >= 0) {
            return zze;
        }
        throw new IllegalStateException(a.i("Top bit not zero: ", zze));
    }

    public final int zzo() {
        byte[] bArr = this.zza;
        int i2 = this.zzb;
        int i3 = i2 + 1;
        this.zzb = i3;
        byte b = bArr[i2];
        this.zzb = i3 + 1;
        return (bArr[i3] & 255) | ((b & 255) << 8);
    }

    public final long zzp() {
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
        return ((b2 & 255) << 8) | (b & 255) | ((b3 & 255) << 16) | ((b4 & 255) << 24) | ((b5 & 255) << 32) | ((b6 & 255) << 40) | ((b7 & 255) << 48) | ((bArr[i9] & 255) << 56);
    }

    public final long zzq() {
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

    public final long zzr() {
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

    public final long zzs() {
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

    public final long zzt() {
        long zzr = zzr();
        if (zzr >= 0) {
            return zzr;
        }
        throw new IllegalStateException(a.l("Top bit not zero: ", zzr));
    }

    public final long zzu() {
        int i2;
        int i3;
        byte b;
        int i4;
        long j2 = this.zza[this.zzb];
        int i5 = 7;
        while (true) {
            i2 = 0;
            if (i5 < 0) {
                break;
            }
            if (((1 << i5) & j2) != 0) {
                i5--;
            } else if (i5 < 6) {
                j2 &= i4 - 1;
                i2 = 7 - i5;
            } else if (i5 == 7) {
                i2 = 1;
            }
        }
        if (i2 != 0) {
            for (i3 = 1; i3 < i2; i3++) {
                if ((this.zza[this.zzb + i3] & 192) != 128) {
                    throw new NumberFormatException(a.l("Invalid UTF-8 sequence continuation byte: ", j2));
                }
                j2 = (j2 << 6) | (b & 63);
            }
            this.zzb += i2;
            return j2;
        }
        throw new NumberFormatException(a.l("Invalid UTF-8 sequence first byte: ", j2));
    }

    public final String zzv(char c) {
        int i2 = this.zzc;
        int i3 = this.zzb;
        if (i2 - i3 != 0) {
            while (i3 < this.zzc && this.zza[i3] != 0) {
                i3++;
            }
            byte[] bArr = this.zza;
            int i4 = this.zzb;
            String zzI = zzeg.zzI(bArr, i4, i3 - i4);
            this.zzb = i3;
            if (i3 < this.zzc) {
                this.zzb = i3 + 1;
            }
            return zzI;
        }
        return null;
    }

    public final String zzw(int i2) {
        if (i2 == 0) {
            return "";
        }
        int i3 = this.zzb;
        int i4 = (i3 + i2) - 1;
        String zzI = zzeg.zzI(this.zza, i3, (i4 >= this.zzc || this.zza[i4] != 0) ? i2 : i2 - 1);
        this.zzb += i2;
        return zzI;
    }

    public final String zzx(int i2, Charset charset) {
        byte[] bArr = this.zza;
        int i3 = this.zzb;
        String str = new String(bArr, i3, i2, charset);
        this.zzb = i3 + i2;
        return str;
    }

    public final short zzy() {
        byte[] bArr = this.zza;
        int i2 = this.zzb;
        int i3 = i2 + 1;
        this.zzb = i3;
        byte b = bArr[i2];
        this.zzb = i3 + 1;
        return (short) ((bArr[i3] & 255) | ((b & 255) << 8));
    }

    public final void zzz(int i2) {
        byte[] bArr = this.zza;
        if (i2 > bArr.length) {
            this.zza = Arrays.copyOf(bArr, i2);
        }
    }

    public zzdy(int i2) {
        this.zza = new byte[i2];
        this.zzc = i2;
    }

    public zzdy(byte[] bArr) {
        this.zza = bArr;
        this.zzc = bArr.length;
    }
}
