package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgif implements zzgbe {
    private final ThreadLocal zza;
    private final String zzb;
    private final Key zzc;
    private final int zzd;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public zzgif(String str, Key key) {
        char c;
        int i2;
        zzgie zzgieVar = new zzgie(this);
        this.zza = zzgieVar;
        if (zzfzc.zza(2)) {
            this.zzb = str;
            this.zzc = key;
            if (key.getEncoded().length >= 16) {
                switch (str.hashCode()) {
                    case -1823053428:
                        if (str.equals("HMACSHA1")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 392315023:
                        if (str.equals("HMACSHA224")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 392315118:
                        if (str.equals("HMACSHA256")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 392316170:
                        if (str.equals("HMACSHA384")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 392317873:
                        if (str.equals("HMACSHA512")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                if (c != 0) {
                    if (c == 1) {
                        i2 = 28;
                    } else if (c == 2) {
                        i2 = 32;
                    } else if (c == 3) {
                        i2 = 48;
                    } else if (c != 4) {
                        throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
                    } else {
                        i2 = 64;
                    }
                    this.zzd = i2;
                } else {
                    this.zzd = 20;
                }
                zzgieVar.get();
                return;
            }
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }

    @Override // com.google.android.gms.internal.ads.zzgbe
    public final byte[] zza(byte[] bArr, int i2) {
        if (i2 <= this.zzd) {
            ((Mac) this.zza.get()).update(bArr);
            return Arrays.copyOf(((Mac) this.zza.get()).doFinal(), i2);
        }
        throw new InvalidAlgorithmParameterException("tag size too big");
    }
}
