package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzaml extends zzgko implements zzglz {
    private static final zzaml zzb;
    private int zze;
    private zzgkx zzf = zzgko.zzaH();
    private zzgjg zzg = zzgjg.zzb;
    private int zzh = 1;
    private int zzi = 1;

    static {
        zzaml zzamlVar = new zzaml();
        zzb = zzamlVar;
        zzgko.zzaN(zzaml.class, zzamlVar);
    }

    private zzaml() {
    }

    public static zzamk zza() {
        return (zzamk) zzb.zzaw();
    }

    public static /* synthetic */ void zzd(zzaml zzamlVar, zzgjg zzgjgVar) {
        zzgkx zzgkxVar = zzamlVar.zzf;
        if (!zzgkxVar.zzc()) {
            zzamlVar.zzf = zzgko.zzaI(zzgkxVar);
        }
        zzamlVar.zzf.add(zzgjgVar);
    }

    public static /* synthetic */ void zze(zzaml zzamlVar, zzgjg zzgjgVar) {
        zzamlVar.zze |= 1;
        zzamlVar.zzg = zzgjgVar;
    }

    public static /* synthetic */ void zzf(zzaml zzamlVar, int i2) {
        zzamlVar.zzi = i2 - 1;
        zzamlVar.zze |= 4;
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
                    return new zzamk(null);
                }
                return new zzaml();
            }
            return zzgko.zzaM(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003ဌ\u0001\u0004ဌ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh", zzamf.zza, "zzi", zzamd.zza});
        }
        return (byte) 1;
    }
}
