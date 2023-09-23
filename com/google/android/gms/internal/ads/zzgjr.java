package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgjr extends zzgjv {
    private final byte[] zza;
    private final int zzb;
    private int zzc;

    public zzgjr(byte[] bArr, int i2, int i3) {
        super(null);
        Objects.requireNonNull(bArr, "buffer");
        int length = bArr.length;
        if (((length - i3) | i3) >= 0) {
            this.zza = bArr;
            this.zzc = 0;
            this.zzb = i3;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i3)));
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    public final void zzN() {
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    public final void zzO(byte b) {
        try {
            byte[] bArr = this.zza;
            int i2 = this.zzc;
            this.zzc = i2 + 1;
            bArr[i2] = b;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzgjs(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    public final void zzP(int i2, boolean z) {
        zzs(i2 << 3);
        zzO(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    public final void zzQ(int i2, zzgjg zzgjgVar) {
        zzs((i2 << 3) | 2);
        zzs(zzgjgVar.zzd());
        zzgjgVar.zzo(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgjv, com.google.android.gms.internal.ads.zzgiv
    public final void zza(byte[] bArr, int i2, int i3) {
        zze(bArr, i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    public final int zzb() {
        return this.zzb - this.zzc;
    }

    public final void zze(byte[] bArr, int i2, int i3) {
        try {
            System.arraycopy(bArr, i2, this.zza, this.zzc, i3);
            this.zzc += i3;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzgjs(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), Integer.valueOf(i3)), e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    public final void zzh(int i2, int i3) {
        zzs((i2 << 3) | 5);
        zzi(i3);
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    public final void zzi(int i2) {
        try {
            byte[] bArr = this.zza;
            int i3 = this.zzc;
            int i4 = i3 + 1;
            this.zzc = i4;
            bArr[i3] = (byte) (i2 & 255);
            int i5 = i4 + 1;
            this.zzc = i5;
            bArr[i4] = (byte) ((i2 >> 8) & 255);
            int i6 = i5 + 1;
            this.zzc = i6;
            bArr[i5] = (byte) ((i2 >> 16) & 255);
            this.zzc = i6 + 1;
            bArr[i6] = (byte) ((i2 >> 24) & 255);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzgjs(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    public final void zzj(int i2, long j2) {
        zzs((i2 << 3) | 1);
        zzk(j2);
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    public final void zzk(long j2) {
        try {
            byte[] bArr = this.zza;
            int i2 = this.zzc;
            int i3 = i2 + 1;
            this.zzc = i3;
            bArr[i2] = (byte) (((int) j2) & 255);
            int i4 = i3 + 1;
            this.zzc = i4;
            bArr[i3] = (byte) (((int) (j2 >> 8)) & 255);
            int i5 = i4 + 1;
            this.zzc = i5;
            bArr[i4] = (byte) (((int) (j2 >> 16)) & 255);
            int i6 = i5 + 1;
            this.zzc = i6;
            bArr[i5] = (byte) (((int) (j2 >> 24)) & 255);
            int i7 = i6 + 1;
            this.zzc = i7;
            bArr[i6] = (byte) (((int) (j2 >> 32)) & 255);
            int i8 = i7 + 1;
            this.zzc = i8;
            bArr[i7] = (byte) (((int) (j2 >> 40)) & 255);
            int i9 = i8 + 1;
            this.zzc = i9;
            bArr[i8] = (byte) (((int) (j2 >> 48)) & 255);
            this.zzc = i9 + 1;
            bArr[i9] = (byte) (((int) (j2 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzgjs(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    public final void zzl(int i2, int i3) {
        zzs(i2 << 3);
        zzm(i3);
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    public final void zzm(int i2) {
        if (i2 >= 0) {
            zzs(i2);
        } else {
            zzu(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    public final void zzn(int i2, zzgly zzglyVar, zzgmr zzgmrVar) {
        zzs((i2 << 3) | 2);
        zzgip zzgipVar = (zzgip) zzglyVar;
        int zzap = zzgipVar.zzap();
        if (zzap == -1) {
            zzap = zzgmrVar.zza(zzgipVar);
            zzgipVar.zzas(zzap);
        }
        zzs(zzap);
        zzgmrVar.zzn(zzglyVar, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    public final void zzo(int i2, String str) {
        zzs((i2 << 3) | 2);
        zzp(str);
    }

    public final void zzp(String str) {
        int i2 = this.zzc;
        try {
            int zzE = zzgjv.zzE(str.length() * 3);
            int zzE2 = zzgjv.zzE(str.length());
            if (zzE2 == zzE) {
                int i3 = i2 + zzE2;
                this.zzc = i3;
                int zzd = zzgnx.zzd(str, this.zza, i3, this.zzb - i3);
                this.zzc = i2;
                zzs((zzd - i2) - zzE2);
                this.zzc = zzd;
                return;
            }
            zzs(zzgnx.zze(str));
            byte[] bArr = this.zza;
            int i4 = this.zzc;
            this.zzc = zzgnx.zzd(str, bArr, i4, this.zzb - i4);
        } catch (zzgnw e2) {
            this.zzc = i2;
            zzJ(str, e2);
        } catch (IndexOutOfBoundsException e3) {
            throw new zzgjs(e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    public final void zzq(int i2, int i3) {
        zzs((i2 << 3) | i3);
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    public final void zzr(int i2, int i3) {
        zzs(i2 << 3);
        zzs(i3);
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    public final void zzs(int i2) {
        while ((i2 & (-128)) != 0) {
            try {
                byte[] bArr = this.zza;
                int i3 = this.zzc;
                this.zzc = i3 + 1;
                bArr[i3] = (byte) ((i2 & 127) | 128);
                i2 >>>= 7;
            } catch (IndexOutOfBoundsException e2) {
                throw new zzgjs(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e2);
            }
        }
        byte[] bArr2 = this.zza;
        int i4 = this.zzc;
        this.zzc = i4 + 1;
        bArr2[i4] = (byte) i2;
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    public final void zzt(int i2, long j2) {
        zzs(i2 << 3);
        zzu(j2);
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    public final void zzu(long j2) {
        boolean z;
        z = zzgjv.zzb;
        if (z && this.zzb - this.zzc >= 10) {
            while ((j2 & (-128)) != 0) {
                byte[] bArr = this.zza;
                int i2 = this.zzc;
                this.zzc = i2 + 1;
                zzgns.zzq(bArr, i2, (byte) ((((int) j2) & 127) | 128));
                j2 >>>= 7;
            }
            byte[] bArr2 = this.zza;
            int i3 = this.zzc;
            this.zzc = i3 + 1;
            zzgns.zzq(bArr2, i3, (byte) j2);
            return;
        }
        while ((j2 & (-128)) != 0) {
            try {
                byte[] bArr3 = this.zza;
                int i4 = this.zzc;
                this.zzc = i4 + 1;
                bArr3[i4] = (byte) ((((int) j2) & 127) | 128);
                j2 >>>= 7;
            } catch (IndexOutOfBoundsException e2) {
                throw new zzgjs(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e2);
            }
        }
        byte[] bArr4 = this.zza;
        int i5 = this.zzc;
        this.zzc = i5 + 1;
        bArr4[i5] = (byte) j2;
    }
}
