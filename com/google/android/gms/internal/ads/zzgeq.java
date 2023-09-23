package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgeq extends zzgko implements zzglz {
    private static final zzgeq zzb;
    private int zze;
    private int zzf;

    static {
        zzgeq zzgeqVar = new zzgeq();
        zzb = zzgeqVar;
        zzgko.zzaN(zzgeq.class, zzgeqVar);
    }

    private zzgeq() {
    }

    public static zzgep zzc() {
        return (zzgep) zzb.zzaw();
    }

    public static zzgeq zze() {
        return zzb;
    }

    public final int zza() {
        return this.zzf;
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
                    return new zzgep(null);
                }
                return new zzgeq();
            }
            return zzgko.zzaM(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }

    public final int zzg() {
        int zzb2 = zzgeh.zzb(this.zze);
        if (zzb2 == 0) {
            return 1;
        }
        return zzb2;
    }
}
