package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgci extends zzgko implements zzglz {
    private static final zzgci zzb;
    private zzgcl zze;
    private int zzf;

    static {
        zzgci zzgciVar = new zzgci();
        zzb = zzgciVar;
        zzgko.zzaN(zzgci.class, zzgciVar);
    }

    private zzgci() {
    }

    public static zzgch zzc() {
        return (zzgch) zzb.zzaw();
    }

    public static zzgci zze(zzgjg zzgjgVar, zzgka zzgkaVar) {
        return (zzgci) zzgko.zzaB(zzb, zzgjgVar, zzgkaVar);
    }

    public static /* synthetic */ void zzg(zzgci zzgciVar, zzgcl zzgclVar) {
        zzgclVar.getClass();
        zzgciVar.zze = zzgclVar;
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
                    return new zzgch(null);
                }
                return new zzgci();
            }
            return zzgko.zzaM(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzgcl zzf() {
        zzgcl zzgclVar = this.zze;
        return zzgclVar == null ? zzgcl.zze() : zzgclVar;
    }
}
