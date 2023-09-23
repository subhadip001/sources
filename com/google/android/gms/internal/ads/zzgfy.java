package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgfy extends zzgko implements zzglz {
    private static final zzgfy zzb;
    private String zze = "";
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        zzgfy zzgfyVar = new zzgfy();
        zzb = zzgfyVar;
        zzgko.zzaN(zzgfy.class, zzgfyVar);
    }

    private zzgfy() {
    }

    public static zzgfx zza() {
        return (zzgfx) zzb.zzaw();
    }

    public static /* synthetic */ void zzd(zzgfy zzgfyVar, String str) {
        str.getClass();
        zzgfyVar.zze = str;
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
                    return new zzgfx(null);
                }
                return new zzgfy();
            }
            return zzgko.zzaM(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
