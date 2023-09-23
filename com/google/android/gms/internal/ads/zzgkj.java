package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgkj implements zzglw {
    private static final zzgkj zza = new zzgkj();

    private zzgkj() {
    }

    public static zzgkj zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzglw
    public final zzglv zzb(Class cls) {
        if (zzgko.class.isAssignableFrom(cls)) {
            try {
                return (zzglv) zzgko.zzay(cls.asSubclass(zzgko.class)).zzb(3, null, null);
            } catch (Exception e2) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e2);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.ads.zzglw
    public final boolean zzc(Class cls) {
        return zzgko.class.isAssignableFrom(cls);
    }
}
