package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgfh extends zzgko implements zzglz {
    private static final zzgfh zzb;
    private String zze = "";
    private zzgjg zzf = zzgjg.zzb;
    private int zzg;

    static {
        zzgfh zzgfhVar = new zzgfh();
        zzb = zzgfhVar;
        zzgko.zzaN(zzgfh.class, zzgfhVar);
    }

    private zzgfh() {
    }

    public static zzgfg zza() {
        return (zzgfg) zzb.zzaw();
    }

    public static zzgfh zzd() {
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
                    return new zzgfg(null);
                }
                return new zzgfh();
            }
            return zzgko.zzaM(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final zzgjg zze() {
        return this.zzf;
    }

    public final String zzf() {
        return this.zze;
    }

    public final int zzi() {
        int i2 = this.zzg;
        int i3 = 4;
        if (i2 == 0) {
            i3 = 2;
        } else if (i2 == 1) {
            i3 = 3;
        } else if (i2 != 2) {
            i3 = i2 != 3 ? i2 != 4 ? 0 : 6 : 5;
        }
        if (i3 == 0) {
            return 1;
        }
        return i3;
    }
}
