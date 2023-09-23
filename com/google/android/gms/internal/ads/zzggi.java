package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzggi extends zzgko implements zzglz {
    private static final zzggi zzb;
    private int zze;
    private zzggl zzf;

    static {
        zzggi zzggiVar = new zzggi();
        zzb = zzggiVar;
        zzgko.zzaN(zzggi.class, zzggiVar);
    }

    private zzggi() {
    }

    public static zzggh zzc() {
        return (zzggh) zzb.zzaw();
    }

    public static zzggi zze(zzgjg zzgjgVar, zzgka zzgkaVar) {
        return (zzggi) zzgko.zzaB(zzb, zzgjgVar, zzgkaVar);
    }

    public static /* synthetic */ void zzh(zzggi zzggiVar, zzggl zzgglVar) {
        zzgglVar.getClass();
        zzggiVar.zzf = zzgglVar;
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
                    return new zzggh(null);
                }
                return new zzggi();
            }
            return zzgko.zzaM(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzggl zzf() {
        zzggl zzgglVar = this.zzf;
        return zzgglVar == null ? zzggl.zzd() : zzgglVar;
    }
}
