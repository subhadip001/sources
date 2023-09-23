package com.google.android.gms.internal.ads;

import f.a.b.a.a;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfzx implements zzgaa {
    private final int zza;

    public zzfzx(int i2) {
        if (i2 != 16 && i2 != 32) {
            throw new InvalidAlgorithmParameterException(a.i("Unsupported key length: ", i2));
        }
        this.zza = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzgaa
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgaa
    public final byte[] zzb() {
        int i2 = this.zza;
        if (i2 != 16) {
            if (i2 == 32) {
                return zzgal.zze;
            }
            throw new GeneralSecurityException("Could not determine HPKE AEAD ID");
        }
        return zzgal.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgaa
    public final byte[] zzc(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        int length = bArr.length;
        if (length == this.zza) {
            return new zzfys(bArr, false).zzb(bArr2, bArr3, bArr4);
        }
        throw new InvalidAlgorithmParameterException(a.i("Unexpected key length: ", length));
    }
}
