package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgba {
    @Deprecated
    public static final zzggq zza;
    @Deprecated
    public static final zzggq zzb;
    @Deprecated
    public static final zzggq zzc;

    static {
        new zzgaz();
        zzggq zzc2 = zzggq.zzc();
        zza = zzc2;
        zzb = zzc2;
        zzc = zzc2;
        try {
            zza();
        } catch (GeneralSecurityException e2) {
            throw new ExceptionInInitializerError(e2);
        }
    }

    public static void zza() {
        zzfxi.zzn(new zzgbd());
        zzfxi.zzm(new zzgaz(), true);
        if (zzfzd.zzb()) {
            return;
        }
        zzfxi.zzm(new zzgaw(), true);
    }
}
