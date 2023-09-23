package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfxm implements zzfwd {
    private final zzfxa zza;

    public /* synthetic */ zzfxm(zzfxa zzfxaVar, zzfxl zzfxlVar) {
        this.zza = zzfxaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfwd
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        Logger logger;
        int length = bArr.length;
        if (length > 5) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 5);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 5, length);
            for (zzfwx zzfwxVar : this.zza.zze(copyOfRange)) {
                try {
                    return ((zzfwd) zzfwxVar.zza()).zza(copyOfRange2, bArr2);
                } catch (GeneralSecurityException e2) {
                    logger = zzfxn.zza;
                    logger.logp(Level.INFO, "com.google.crypto.tink.aead.AeadWrapper$WrappedAead", "decrypt", "ciphertext prefix matches a key, but cannot decrypt: ".concat(String.valueOf(e2.toString())));
                }
            }
        }
        for (zzfwx zzfwxVar2 : this.zza.zze(zzfwi.zza)) {
            try {
                return ((zzfwd) zzfwxVar2.zza()).zza(bArr, bArr2);
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }

    @Override // com.google.android.gms.internal.ads.zzfwd
    public final byte[] zzb(byte[] bArr, byte[] bArr2) {
        return zzghf.zzc(this.zza.zzb().zzb(), ((zzfwd) this.zza.zzb().zza()).zzb(bArr, bArr2));
    }
}
