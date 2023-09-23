package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgcf extends zzgko implements zzglz {
    private static final zzgcf zzb;
    private int zze;
    private zzgcl zzf;
    private zzgjg zzg = zzgjg.zzb;

    static {
        zzgcf zzgcfVar = new zzgcf();
        zzb = zzgcfVar;
        zzgko.zzaN(zzgcf.class, zzgcfVar);
    }

    private zzgcf() {
    }

    public static zzgce zzc() {
        return (zzgce) zzb.zzaw();
    }

    public static zzgcf zze(zzgjg zzgjgVar, zzgka zzgkaVar) {
        return (zzgcf) zzgko.zzaB(zzb, zzgjgVar, zzgkaVar);
    }

    public static /* synthetic */ void zzi(zzgcf zzgcfVar, zzgcl zzgclVar) {
        zzgclVar.getClass();
        zzgcfVar.zzf = zzgclVar;
    }

    public final int zza() {
        return this.zze;
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
                    return new zzgce(null);
                }
                return new zzgcf();
            }
            return zzgko.zzaM(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final zzgcl zzf() {
        zzgcl zzgclVar = this.zzf;
        return zzgclVar == null ? zzgcl.zze() : zzgclVar;
    }

    public final zzgjg zzg() {
        return this.zzg;
    }
}
