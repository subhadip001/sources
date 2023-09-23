package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzatl {
    public byte[] zza;
    public byte[] zzb;
    public int zzc;
    public int[] zzd;
    public int[] zze;
    public int zzf;
    private final MediaCodec.CryptoInfo zzg;
    private final zzatk zzh;

    public zzatl() {
        int i2 = zzazn.zza;
        MediaCodec.CryptoInfo cryptoInfo = i2 >= 16 ? new MediaCodec.CryptoInfo() : null;
        this.zzg = cryptoInfo;
        this.zzh = i2 >= 24 ? new zzatk(cryptoInfo, null) : null;
    }

    public final MediaCodec.CryptoInfo zza() {
        return this.zzg;
    }

    public final void zzb(int i2, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i3) {
        this.zzf = i2;
        this.zzd = iArr;
        this.zze = iArr2;
        this.zzb = bArr;
        this.zza = bArr2;
        this.zzc = 1;
        int i4 = zzazn.zza;
        if (i4 >= 16) {
            MediaCodec.CryptoInfo cryptoInfo = this.zzg;
            cryptoInfo.numSubSamples = i2;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr;
            cryptoInfo.iv = bArr2;
            cryptoInfo.mode = 1;
            if (i4 >= 24) {
                zzatk.zza(this.zzh, 0, 0);
            }
        }
    }
}
