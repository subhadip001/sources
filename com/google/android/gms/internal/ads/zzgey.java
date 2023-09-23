package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgey extends zzgko implements zzglz {
    private static final zzgey zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzgey zzgeyVar = new zzgey();
        zzb = zzgeyVar;
        zzgko.zzaN(zzgey.class, zzgeyVar);
    }

    private zzgey() {
    }

    public static zzgex zza() {
        return (zzgex) zzb.zzaw();
    }

    public static zzgey zzd() {
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
                    return new zzgex(null);
                }
                return new zzgey();
            }
            return zzgko.zzaM(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final int zze() {
        int i2 = this.zzg;
        int i3 = 3;
        if (i2 == 0) {
            i3 = 2;
        } else if (i2 != 1) {
            i3 = i2 != 2 ? i2 != 3 ? 0 : 5 : 4;
        }
        if (i3 == 0) {
            return 1;
        }
        return i3;
    }

    public final int zzf() {
        int i2 = this.zzf;
        int i3 = i2 != 0 ? i2 != 1 ? 0 : 3 : 2;
        if (i3 == 0) {
            return 1;
        }
        return i3;
    }

    public final int zzg() {
        int i2 = this.zze;
        int i3 = i2 != 0 ? i2 != 1 ? 0 : 3 : 2;
        if (i3 == 0) {
            return 1;
        }
        return i3;
    }
}
