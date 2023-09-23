package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
@Deprecated
/* loaded from: classes.dex */
public final class zzfww {
    @Deprecated
    public static final zzfwr zza(byte[] bArr) {
        try {
            zzgfu zzg = zzgfu.zzg(bArr, zzgka.zza());
            for (zzgft zzgftVar : zzg.zzh()) {
                if (zzgftVar.zzc().zzi() == 2 || zzgftVar.zzc().zzi() == 3 || zzgftVar.zzc().zzi() == 4) {
                    throw new GeneralSecurityException("keyset contains secret key material");
                }
            }
            return zzfwr.zza(zzg);
        } catch (zzgla unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }
}
