package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgft extends zzgko implements zzglz {
    private static final zzgft zzb;
    private zzgfh zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        zzgft zzgftVar = new zzgft();
        zzb = zzgftVar;
        zzgko.zzaN(zzgft.class, zzgftVar);
    }

    private zzgft() {
    }

    public static zzgfs zzd() {
        return (zzgfs) zzb.zzaw();
    }

    public static /* synthetic */ void zzf(zzgft zzgftVar, zzgfh zzgfhVar) {
        zzgfhVar.getClass();
        zzgftVar.zze = zzgfhVar;
    }

    public final int zza() {
        return this.zzg;
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
                    return new zzgfs(null);
                }
                return new zzgft();
            }
            return zzgko.zzaM(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    public final zzgfh zzc() {
        zzgfh zzgfhVar = this.zze;
        return zzgfhVar == null ? zzgfh.zzd() : zzgfhVar;
    }

    public final boolean zzh() {
        return this.zze != null;
    }

    public final int zzi() {
        int i2 = this.zzf;
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

    public final int zzj() {
        int zzb2 = zzggn.zzb(this.zzh);
        if (zzb2 == 0) {
            return 1;
        }
        return zzb2;
    }
}
