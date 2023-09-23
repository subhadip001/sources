package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfyx extends zzfyu {
    public zzfyx(byte[] bArr, int i2) {
        super(bArr, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzfyu
    public final int zza() {
        return 24;
    }

    @Override // com.google.android.gms.internal.ads.zzfyu
    public final int[] zzb(int[] iArr, int i2) {
        int length = iArr.length;
        if (length == 6) {
            int[] iArr2 = new int[16];
            zzfyq.zzb(r0, this.zza);
            int[] iArr3 = {0, 0, 0, 0, iArr3[12], iArr3[13], iArr3[14], iArr3[15], 0, 0, 0, 0, iArr[0], iArr[1], iArr[2], iArr[3]};
            zzfyq.zzc(iArr3);
            zzfyq.zzb(iArr2, Arrays.copyOf(iArr3, 8));
            iArr2[12] = i2;
            iArr2[13] = 0;
            iArr2[14] = iArr[4];
            iArr2[15] = iArr[5];
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
    }
}
