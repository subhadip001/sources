package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
@Deprecated
/* loaded from: classes.dex */
public final class zzggq extends zzgko implements zzglz {
    private static final zzggq zzb;
    private String zze = "";
    private zzgkx zzf = zzgko.zzaH();

    static {
        zzggq zzggqVar = new zzggq();
        zzb = zzggqVar;
        zzgko.zzaN(zzggq.class, zzggqVar);
    }

    private zzggq() {
    }

    public static zzggq zzc() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    public final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzggp(null);
                }
                return new zzggq();
            }
            return zzgko.zzaM(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zze", "zzf", zzgfp.class});
        }
        return (byte) 1;
    }

    public final List zzd() {
        return this.zzf;
    }
}
