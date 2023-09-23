package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgax extends zzgaq {
    public zzgax(Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.ads.zzgaq
    public final /* bridge */ /* synthetic */ Object zza(zzgly zzglyVar) {
        zzgek zzgekVar = (zzgek) zzglyVar;
        int zzg = zzgekVar.zzg().zzg();
        SecretKeySpec secretKeySpec = new SecretKeySpec(zzgekVar.zzh().zzE(), "HMAC");
        int zza = zzgekVar.zzg().zza();
        int i2 = zzg - 2;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 == 5) {
                            return new zzgig(new zzgif("HMACSHA224", secretKeySpec), zza);
                        }
                        throw new GeneralSecurityException("unknown hash");
                    }
                    return new zzgig(new zzgif("HMACSHA512", secretKeySpec), zza);
                }
                return new zzgig(new zzgif("HMACSHA256", secretKeySpec), zza);
            }
            return new zzgig(new zzgif("HMACSHA384", secretKeySpec), zza);
        }
        return new zzgig(new zzgif("HMACSHA1", secretKeySpec), zza);
    }
}
