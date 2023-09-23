package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzged extends zzgko implements zzglz {
    private static final zzged zzb;
    private int zze;
    private int zzf;
    private zzgjg zzg = zzgjg.zzb;

    static {
        zzged zzgedVar = new zzged();
        zzb = zzgedVar;
        zzgko.zzaN(zzged.class, zzgedVar);
    }

    private zzged() {
    }

    public static zzgec zza() {
        return (zzgec) zzb.zzaw();
    }

    public static zzged zzd() {
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
                    return new zzgec(null);
                }
                return new zzged();
            }
            return zzgko.zzaM(zzb, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final zzgjg zze() {
        return this.zzg;
    }

    public final int zzg() {
        int i2 = this.zze;
        int i3 = 5;
        if (i2 == 0) {
            i3 = 2;
        } else if (i2 == 2) {
            i3 = 4;
        } else if (i2 != 3) {
            i3 = i2 != 4 ? i2 != 5 ? 0 : 7 : 6;
        }
        if (i3 == 0) {
            return 1;
        }
        return i3;
    }

    public final int zzh() {
        int zzb2 = zzgeh.zzb(this.zzf);
        if (zzb2 == 0) {
            return 1;
        }
        return zzb2;
    }
}
