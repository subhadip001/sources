package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzggl extends zzgko implements zzglz {
    private static final zzggl zzb;
    private String zze = "";
    private zzgfm zzf;

    static {
        zzggl zzgglVar = new zzggl();
        zzb = zzgglVar;
        zzgko.zzaN(zzggl.class, zzgglVar);
    }

    private zzggl() {
    }

    public static zzggl zzd() {
        return zzb;
    }

    public static zzggl zze(zzgjg zzgjgVar, zzgka zzgkaVar) {
        return (zzggl) zzgko.zzaB(zzb, zzgjgVar, zzgkaVar);
    }

    public final zzgfm zza() {
        zzgfm zzgfmVar = this.zzf;
        return zzgfmVar == null ? zzgfm.zzd() : zzgfmVar;
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
                    return new zzggk(null);
                }
                return new zzggl();
            }
            return zzgko.zzaM(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }

    public final String zzf() {
        return this.zze;
    }

    public final boolean zzg() {
        return this.zzf != null;
    }
}
