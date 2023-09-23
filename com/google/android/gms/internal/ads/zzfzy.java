package com.google.android.gms.internal.ads;

import java.security.InvalidAlgorithmParameterException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfzy implements zzgaa {
    @Override // com.google.android.gms.internal.ads.zzgaa
    public final int zza() {
        return 32;
    }

    @Override // com.google.android.gms.internal.ads.zzgaa
    public final byte[] zzb() {
        return zzgal.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzgaa
    public final byte[] zzc(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        if (bArr.length == 32) {
            return new zzfyv(bArr).zzd(bArr2, bArr3, bArr4);
        }
        throw new InvalidAlgorithmParameterException("Unexpected key length: 32");
    }
}
