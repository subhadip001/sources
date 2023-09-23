package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import f.a.b.a.a;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzggy implements zzgic {
    private static final ThreadLocal zza = new zzggx();
    private final SecretKeySpec zzb;
    private final int zzc;
    private final int zzd;

    public zzggy(byte[] bArr, int i2) {
        if (zzfzc.zza(2)) {
            zzgik.zza(bArr.length);
            this.zzb = new SecretKeySpec(bArr, "AES");
            int blockSize = ((Cipher) zza.get()).getBlockSize();
            this.zzd = blockSize;
            if (i2 < 12 || i2 > blockSize) {
                throw new GeneralSecurityException("invalid IV size");
            }
            this.zzc = i2;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
    }

    private final void zzc(byte[] bArr, int i2, int i3, byte[] bArr2, int i4, byte[] bArr3, boolean z) {
        Cipher cipher = (Cipher) zza.get();
        byte[] bArr4 = new byte[this.zzd];
        System.arraycopy(bArr3, 0, bArr4, 0, this.zzc);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        if (z) {
            cipher.init(1, this.zzb, ivParameterSpec);
        } else {
            cipher.init(2, this.zzb, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i2, i3, bArr2, i4) != i3) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgic
    public final byte[] zza(byte[] bArr) {
        int length = bArr.length;
        int i2 = this.zzc;
        if (length >= i2) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, 0, bArr2, 0, i2);
            int i3 = this.zzc;
            int i4 = length - i3;
            byte[] bArr3 = new byte[i4];
            zzc(bArr, i3, i4, bArr3, 0, bArr2, false);
            return bArr3;
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    @Override // com.google.android.gms.internal.ads.zzgic
    public final byte[] zzb(byte[] bArr) {
        int length = bArr.length;
        int i2 = this.zzc;
        if (length <= Api.BaseClientBuilder.API_PRIORITY_OTHER - i2) {
            byte[] bArr2 = new byte[i2 + length];
            byte[] zza2 = zzgii.zza(i2);
            System.arraycopy(zza2, 0, bArr2, 0, this.zzc);
            zzc(bArr, 0, length, bArr2, this.zzc, zza2, true);
            return bArr2;
        }
        int i3 = this.zzc;
        StringBuilder A = a.A("plaintext length can not exceed ");
        A.append(Api.BaseClientBuilder.API_PRIORITY_OTHER - i3);
        throw new GeneralSecurityException(A.toString());
    }
}
