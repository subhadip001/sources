package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgab {
    private static final byte[] zza = new byte[0];
    private final zzgaa zzb;
    private final BigInteger zzc;
    private final byte[] zzd;
    private final byte[] zze;
    private final byte[] zzf;
    private BigInteger zzg = BigInteger.ZERO;

    private zzgab(byte[] bArr, byte[] bArr2, byte[] bArr3, BigInteger bigInteger, zzgaa zzgaaVar) {
        this.zzf = bArr;
        this.zzd = bArr2;
        this.zze = bArr3;
        this.zzc = bigInteger;
        this.zzb = zzgaaVar;
    }

    public static zzgab zzc(byte[] bArr, byte[] bArr2, zzgam zzgamVar, zzfzz zzfzzVar, zzgaa zzgaaVar, byte[] bArr3) {
        byte[] bArr4 = zzgal.zzc;
        if (Arrays.equals(bArr4, bArr4)) {
            byte[] zzb = zzgal.zzb(zzgal.zzb, bArr4, zzgaaVar.zzb());
            byte[] bArr5 = zzgal.zzg;
            byte[] bArr6 = zza;
            byte[] zzc = zzghf.zzc(zzgal.zza, zzfzzVar.zzd(bArr5, bArr6, "psk_id_hash", zzb), zzfzzVar.zzd(bArr5, bArr3, "info_hash", zzb));
            byte[] zzd = zzfzzVar.zzd(bArr2, bArr6, "secret", zzb);
            byte[] zzc2 = zzfzzVar.zzc(zzd, zzc, "key", zzb, zzgaaVar.zza());
            byte[] zzc3 = zzfzzVar.zzc(zzd, zzc, "base_nonce", zzb, 12);
            BigInteger bigInteger = BigInteger.ONE;
            return new zzgab(bArr, zzc2, zzc3, bigInteger.shiftLeft(96).subtract(bigInteger), zzgaaVar);
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
    }

    private final synchronized byte[] zzd() {
        byte[] zzd;
        byte[] bArr = this.zze;
        byte[] byteArray = this.zzg.toByteArray();
        int length = byteArray.length;
        if (length != 12) {
            if (length > 13) {
                throw new GeneralSecurityException("integer too large");
            }
            if (length == 13) {
                if (byteArray[0] == 0) {
                    byteArray = Arrays.copyOfRange(byteArray, 1, 13);
                } else {
                    throw new GeneralSecurityException("integer too large");
                }
            } else {
                byte[] bArr2 = new byte[12];
                System.arraycopy(byteArray, 0, bArr2, 12 - length, length);
                byteArray = bArr2;
            }
        }
        zzd = zzghf.zzd(bArr, byteArray);
        if (this.zzg.compareTo(this.zzc) < 0) {
            this.zzg = this.zzg.add(BigInteger.ONE);
        } else {
            throw new GeneralSecurityException("message limit reached");
        }
        return zzd;
    }

    public final byte[] zza() {
        return this.zzf;
    }

    public final byte[] zzb(byte[] bArr, byte[] bArr2) {
        return this.zzb.zzc(this.zzd, zzd(), bArr, bArr2);
    }
}
