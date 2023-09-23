package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfz {
    public byte[] zza;
    public byte[] zzb;
    public int zzc;
    public int[] zzd;
    public int[] zze;
    public int zzf;
    public int zzg;
    public int zzh;
    private final MediaCodec.CryptoInfo zzi;
    private final zzfy zzj;

    public zzfz() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.zzi = cryptoInfo;
        this.zzj = zzeg.zza >= 24 ? new zzfy(cryptoInfo, null) : null;
    }

    public final MediaCodec.CryptoInfo zza() {
        return this.zzi;
    }

    public final void zzb(int i2) {
        if (i2 == 0) {
            return;
        }
        if (this.zzd == null) {
            int[] iArr = new int[1];
            this.zzd = iArr;
            this.zzi.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.zzd;
        iArr2[0] = iArr2[0] + i2;
    }

    public final void zzc(int i2, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i3, int i4, int i5) {
        this.zzf = i2;
        this.zzd = iArr;
        this.zze = iArr2;
        this.zzb = bArr;
        this.zza = bArr2;
        this.zzc = i3;
        this.zzg = i4;
        this.zzh = i5;
        MediaCodec.CryptoInfo cryptoInfo = this.zzi;
        cryptoInfo.numSubSamples = i2;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i3;
        if (zzeg.zza >= 24) {
            zzfy zzfyVar = this.zzj;
            Objects.requireNonNull(zzfyVar);
            zzfy.zza(zzfyVar, i4, i5);
        }
    }
}
