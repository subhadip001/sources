package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgdo extends zzgko implements zzglz {
    private static final zzgdo zzb;
    private zzgfm zze;

    static {
        zzgdo zzgdoVar = new zzgdo();
        zzb = zzgdoVar;
        zzgko.zzaN(zzgdo.class, zzgdoVar);
    }

    private zzgdo() {
    }

    public static zzgdn zza() {
        return (zzgdn) zzb.zzaw();
    }

    public static zzgdo zzd() {
        return zzb;
    }

    public static /* synthetic */ void zzf(zzgdo zzgdoVar, zzgfm zzgfmVar) {
        zzgfmVar.getClass();
        zzgdoVar.zze = zzgfmVar;
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
                    return new zzgdn(null);
                }
                return new zzgdo();
            }
            return zzgko.zzaM(zzb, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"zze"});
        }
        return (byte) 1;
    }

    public final zzgfm zze() {
        zzgfm zzgfmVar = this.zze;
        return zzgfmVar == null ? zzgfm.zzd() : zzgfmVar;
    }
}
