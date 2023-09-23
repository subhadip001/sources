package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfyt extends zzfyu {
    public zzfyt(byte[] bArr, int i2) {
        super(bArr, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzfyu
    public final int zza() {
        return 12;
    }

    @Override // com.google.android.gms.internal.ads.zzfyu
    public final int[] zzb(int[] iArr, int i2) {
        int length = iArr.length;
        if (length == 3) {
            int[] iArr2 = new int[16];
            zzfyq.zzb(iArr2, this.zza);
            iArr2[12] = i2;
            System.arraycopy(iArr, 0, iArr2, 13, 3);
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
    }
}
