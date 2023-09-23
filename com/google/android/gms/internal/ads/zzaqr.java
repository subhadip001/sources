package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzaqr extends zzgko implements zzglz {
    private static final zzaqr zzb;
    private int zze;
    private zzaqu zzf;
    private zzgjg zzg;
    private zzgjg zzh;

    static {
        zzaqr zzaqrVar = new zzaqr();
        zzb = zzaqrVar;
        zzgko.zzaN(zzaqr.class, zzaqrVar);
    }

    private zzaqr() {
        zzgjg zzgjgVar = zzgjg.zzb;
        this.zzg = zzgjgVar;
        this.zzh = zzgjgVar;
    }

    public static zzaqr zzc(zzgjg zzgjgVar, zzgka zzgkaVar) {
        return (zzaqr) zzgko.zzaB(zzb, zzgjgVar, zzgkaVar);
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
                    return new zzaqq(null);
                }
                return new zzaqr();
            }
            return zzgko.zzaM(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    public final zzaqu zzd() {
        zzaqu zzaquVar = this.zzf;
        return zzaquVar == null ? zzaqu.zzg() : zzaquVar;
    }

    public final zzgjg zze() {
        return this.zzh;
    }

    public final zzgjg zzf() {
        return this.zzg;
    }
}
