package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfwr {
    private final zzgfu zza;

    private zzfwr(zzgfu zzgfuVar) {
        this.zza = zzgfuVar;
    }

    public static final zzfwr zza(zzgfu zzgfuVar) {
        if (zzgfuVar == null || zzgfuVar.zza() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        return new zzfwr(zzgfuVar);
    }

    public static final zzfwr zzb(zzfwp zzfwpVar) {
        zzfws zzd = zzfws.zzd();
        zzd.zzc(zzfwpVar.zza());
        return zzd.zzb();
    }

    public final String toString() {
        return zzfxj.zza(this.zza).toString();
    }

    public final zzgfu zzc() {
        return this.zza;
    }

    public final Object zzd(Class cls) {
        Class zze = zzfxi.zze(cls);
        if (zze != null) {
            zzfxj.zzb(this.zza);
            zzfxa zzc = zzfxa.zzc(zze);
            for (zzgft zzgftVar : this.zza.zzh()) {
                if (zzgftVar.zzi() == 3) {
                    zzfwx zza = zzc.zza(zzfxi.zzf(zzgftVar.zzc(), zze), zzgftVar);
                    if (zzgftVar.zza() == this.zza.zzc()) {
                        zzc.zzf(zza);
                    }
                }
            }
            return zzfxi.zzi(zzc, cls);
        }
        throw new GeneralSecurityException("No wrapper found for ".concat(cls.getName()));
    }
}
