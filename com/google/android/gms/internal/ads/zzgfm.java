package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgfm extends zzgko implements zzglz {
    private static final zzgfm zzb;
    private String zze = "";
    private zzgjg zzf = zzgjg.zzb;
    private int zzg;

    static {
        zzgfm zzgfmVar = new zzgfm();
        zzb = zzgfmVar;
        zzgko.zzaN(zzgfm.class, zzgfmVar);
    }

    private zzgfm() {
    }

    public static zzgfl zza() {
        return (zzgfl) zzb.zzaw();
    }

    public static /* synthetic */ zzgfm zzc() {
        return zzb;
    }

    public static zzgfm zzd() {
        return zzb;
    }

    public static /* synthetic */ void zzg(zzgfm zzgfmVar, String str) {
        str.getClass();
        zzgfmVar.zze = str;
    }

    public static /* synthetic */ void zzh(zzgfm zzgfmVar, zzgjg zzgjgVar) {
        zzgfmVar.zzf = zzgjgVar;
    }

    public static /* synthetic */ void zzj(zzgfm zzgfmVar, int i2) {
        zzgfmVar.zzg = zzggn.zza(i2);
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
                    return new zzgfl(null);
                }
                return new zzgfm();
            }
            return zzgko.zzaM(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final zzgjg zze() {
        return this.zzf;
    }

    public final String zzf() {
        return this.zze;
    }

    public final int zzi() {
        int zzb2 = zzggn.zzb(this.zzg);
        if (zzb2 == 0) {
            return 1;
        }
        return zzb2;
    }
}
