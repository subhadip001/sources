package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgor extends zzgko implements zzglz {
    private static final zzgor zzb;
    private int zze;
    private int zzf;
    private String zzg = "";
    private zzgjg zzh = zzgjg.zzb;

    static {
        zzgor zzgorVar = new zzgor();
        zzb = zzgorVar;
        zzgko.zzaN(zzgor.class, zzgorVar);
    }

    private zzgor() {
    }

    public static zzgop zza() {
        return (zzgop) zzb.zzaw();
    }

    public static /* synthetic */ void zzd(zzgor zzgorVar, String str) {
        zzgorVar.zze |= 2;
        zzgorVar.zzg = "image/png";
    }

    public static /* synthetic */ void zze(zzgor zzgorVar, zzgjg zzgjgVar) {
        zzgjgVar.getClass();
        zzgorVar.zze |= 4;
        zzgorVar.zzh = zzgjgVar;
    }

    public static /* synthetic */ void zzf(zzgor zzgorVar, int i2) {
        zzgorVar.zzf = 1;
        zzgorVar.zze = 1 | zzgorVar.zze;
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
                    return new zzgop(null);
                }
                return new zzgor();
            }
            return zzgko.zzaM(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ည\u0002", new Object[]{"zze", "zzf", zzgoq.zza, "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
