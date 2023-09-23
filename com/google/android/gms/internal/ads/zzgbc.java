package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgbc implements zzfwv {
    private final zzfxa zza;
    private final byte[] zzb = {0};

    public /* synthetic */ zzgbc(zzfxa zzfxaVar, zzgbb zzgbbVar) {
        this.zza = zzfxaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfwv
    public final void zza(byte[] bArr, byte[] bArr2) {
        Logger logger;
        int length = bArr.length;
        if (length > 5) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, length);
            for (zzfwx zzfwxVar : this.zza.zze(copyOf)) {
                try {
                    if (zzfwxVar.zzd() == 4) {
                        ((zzfwv) zzfwxVar.zza()).zza(copyOfRange, zzghf.zzc(bArr2, this.zzb));
                        return;
                    } else {
                        ((zzfwv) zzfwxVar.zza()).zza(copyOfRange, bArr2);
                        return;
                    }
                } catch (GeneralSecurityException e2) {
                    logger = zzgbd.zza;
                    logger.logp(Level.INFO, "com.google.crypto.tink.mac.MacWrapper$WrappedMac", "verifyMac", "tag prefix matches a key, but cannot verify: ".concat(e2.toString()));
                }
            }
            for (zzfwx zzfwxVar2 : this.zza.zze(zzfwi.zza)) {
                try {
                    ((zzfwv) zzfwxVar2.zza()).zza(bArr, bArr2);
                    return;
                } catch (GeneralSecurityException unused) {
                }
            }
            throw new GeneralSecurityException("invalid MAC");
        }
        throw new GeneralSecurityException("tag too short");
    }

    @Override // com.google.android.gms.internal.ads.zzfwv
    public final byte[] zzb(byte[] bArr) {
        if (this.zza.zzb().zzd() == 4) {
            return zzghf.zzc(this.zza.zzb().zzb(), ((zzfwv) this.zza.zzb().zza()).zzb(zzghf.zzc(bArr, this.zzb)));
        }
        return zzghf.zzc(this.zza.zzb().zzb(), ((zzfwv) this.zza.zzb().zza()).zzb(bArr));
    }
}
