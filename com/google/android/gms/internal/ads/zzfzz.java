package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfzz {
    private final String zza = "HmacSha256";

    public zzfzz(String str) {
    }

    private final byte[] zze(byte[] bArr, byte[] bArr2, int i2) {
        Mac mac = (Mac) zzghq.zzb.zza(this.zza);
        if (i2 <= mac.getMacLength() * 255) {
            byte[] bArr3 = new byte[i2];
            mac.init(new SecretKeySpec(bArr, this.zza));
            byte[] bArr4 = new byte[0];
            int i3 = 1;
            int i4 = 0;
            while (true) {
                mac.update(bArr4);
                mac.update(bArr2);
                mac.update((byte) i3);
                bArr4 = mac.doFinal();
                int length = bArr4.length;
                int i5 = i4 + length;
                if (i5 < i2) {
                    System.arraycopy(bArr4, 0, bArr3, i4, length);
                    i3++;
                    i4 = i5;
                } else {
                    System.arraycopy(bArr4, 0, bArr3, i4, i2 - i4);
                    return bArr3;
                }
            }
        } else {
            throw new GeneralSecurityException("size too large");
        }
    }

    private final byte[] zzf(byte[] bArr, byte[] bArr2) {
        Mac mac = (Mac) zzghq.zzb.zza(this.zza);
        if (bArr2 != null && bArr2.length != 0) {
            mac.init(new SecretKeySpec(bArr2, this.zza));
        } else {
            mac.init(new SecretKeySpec(new byte[mac.getMacLength()], this.zza));
        }
        return mac.doFinal(bArr);
    }

    public final int zza() {
        return Mac.getInstance(this.zza).getMacLength();
    }

    public final byte[] zzb(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, String str2, byte[] bArr4, int i2) {
        return zze(zzf(zzgal.zze("eae_prk", bArr2, bArr4), null), zzgal.zzf("shared_secret", bArr3, bArr4, i2), i2);
    }

    public final byte[] zzc(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, int i2) {
        return zze(bArr, zzgal.zzf(str, bArr2, bArr3, i2), i2);
    }

    public final byte[] zzd(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return zzf(zzgal.zze(str, bArr2, bArr3), bArr);
    }
}
