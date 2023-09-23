package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzgjq extends zzgjv {
    public final byte[] zza;
    public final int zzb;
    public int zzc;
    public int zzd;

    public zzgjq(int i2) {
        super(null);
        if (i2 >= 0) {
            byte[] bArr = new byte[Math.max(i2, 20)];
            this.zza = bArr;
            this.zzb = bArr.length;
            return;
        }
        throw new IllegalArgumentException("bufferSize must be >= 0");
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    public final int zzb() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    public final void zzc(byte b) {
        byte[] bArr = this.zza;
        int i2 = this.zzc;
        this.zzc = i2 + 1;
        bArr[i2] = b;
        this.zzd++;
    }

    public final void zzd(int i2) {
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
        this.zzd += 4;
    }

    public final void zze(long j2) {
        byte[] bArr = this.zza;
        int i2 = this.zzc;
        int i3 = i2 + 1;
        this.zzc = i3;
        bArr[i2] = (byte) (j2 & 255);
        int i4 = i3 + 1;
        this.zzc = i4;
        bArr[i3] = (byte) ((j2 >> 8) & 255);
        int i5 = i4 + 1;
        this.zzc = i5;
        bArr[i4] = (byte) ((j2 >> 16) & 255);
        int i6 = i5 + 1;
        this.zzc = i6;
        bArr[i5] = (byte) (255 & (j2 >> 24));
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
        this.zzd += 8;
    }

    public final void zzf(int i2) {
        boolean z;
        z = zzgjv.zzb;
        if (!z) {
            while ((i2 & (-128)) != 0) {
                byte[] bArr = this.zza;
                int i3 = this.zzc;
                this.zzc = i3 + 1;
                bArr[i3] = (byte) ((i2 & 127) | 128);
                this.zzd++;
                i2 >>>= 7;
            }
            byte[] bArr2 = this.zza;
            int i4 = this.zzc;
            this.zzc = i4 + 1;
            bArr2[i4] = (byte) i2;
            this.zzd++;
            return;
        }
        long j2 = this.zzc;
        while ((i2 & (-128)) != 0) {
            byte[] bArr3 = this.zza;
            int i5 = this.zzc;
            this.zzc = i5 + 1;
            zzgns.zzq(bArr3, i5, (byte) ((i2 & 127) | 128));
            i2 >>>= 7;
        }
        byte[] bArr4 = this.zza;
        int i6 = this.zzc;
        this.zzc = i6 + 1;
        zzgns.zzq(bArr4, i6, (byte) i2);
        this.zzd += (int) (this.zzc - j2);
    }

    public final void zzg(long j2) {
        boolean z;
        z = zzgjv.zzb;
        if (!z) {
            while ((j2 & (-128)) != 0) {
                byte[] bArr = this.zza;
                int i2 = this.zzc;
                this.zzc = i2 + 1;
                bArr[i2] = (byte) ((((int) j2) & 127) | 128);
                this.zzd++;
                j2 >>>= 7;
            }
            byte[] bArr2 = this.zza;
            int i3 = this.zzc;
            this.zzc = i3 + 1;
            bArr2[i3] = (byte) j2;
            this.zzd++;
            return;
        }
        long j3 = this.zzc;
        while ((j2 & (-128)) != 0) {
            byte[] bArr3 = this.zza;
            int i4 = this.zzc;
            this.zzc = i4 + 1;
            zzgns.zzq(bArr3, i4, (byte) ((((int) j2) & 127) | 128));
            j2 >>>= 7;
        }
        byte[] bArr4 = this.zza;
        int i5 = this.zzc;
        this.zzc = i5 + 1;
        zzgns.zzq(bArr4, i5, (byte) j2);
        this.zzd += (int) (this.zzc - j3);
    }
}
