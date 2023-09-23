package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfzp {
    @Deprecated
    public static final zzggq zza;
    @Deprecated
    public static final zzggq zzb;
    @Deprecated
    public static final zzggq zzc;

    static {
        new zzfzo();
        new zzfzm();
        zza = zzggq.zzc();
        zzb = zzggq.zzc();
        zzc = zzggq.zzc();
        try {
            zzfxi.zzn(new zzfzr());
            zzfxi.zzn(new zzfzu());
            zzfxk.zza();
            if (zzfzd.zzb()) {
                return;
            }
            zzfxi.zzk(new zzfzm(), new zzfzo(), true);
            zzfxi.zzk(new zzgai(), new zzgak(), true);
        } catch (GeneralSecurityException e2) {
            throw new ExceptionInInitializerError(e2);
        }
    }
}
