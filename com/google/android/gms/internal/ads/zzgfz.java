package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgfz extends zzgko implements zzglz {
    private static final zzgfz zzb;
    private int zze;
    private zzgkx zzf = zzgko.zzaH();

    static {
        zzgfz zzgfzVar = new zzgfz();
        zzb = zzgfzVar;
        zzgko.zzaN(zzgfz.class, zzgfzVar);
    }

    private zzgfz() {
    }

    public static zzgfw zza() {
        return (zzgfw) zzb.zzaw();
    }

    public static /* synthetic */ void zze(zzgfz zzgfzVar, zzgfy zzgfyVar) {
        zzgfyVar.getClass();
        zzgkx zzgkxVar = zzgfzVar.zzf;
        if (!zzgkxVar.zzc()) {
            zzgfzVar.zzf = zzgko.zzaI(zzgkxVar);
        }
        zzgfzVar.zzf.add(zzgfyVar);
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
                    return new zzgfw(null);
                }
                return new zzgfz();
            }
            return zzgko.zzaM(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", zzgfy.class});
        }
        return (byte) 1;
    }
}
