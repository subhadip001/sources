package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
@Deprecated
/* loaded from: classes.dex */
public final class zzgfp extends zzgko implements zzglz {
    private static final zzgfp zzb;
    private int zzg;
    private boolean zzh;
    private String zze = "";
    private String zzf = "";
    private String zzi = "";

    static {
        zzgfp zzgfpVar = new zzgfp();
        zzb = zzgfpVar;
        zzgko.zzaN(zzgfp.class, zzgfpVar);
    }

    private zzgfp() {
    }

    public final int zza() {
        return this.zzg;
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
                    return new zzgfo(null);
                }
                return new zzgfp();
            }
            return zzgko.zzaM(zzb, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }

    public final String zzd() {
        return this.zzi;
    }

    public final String zze() {
        return this.zze;
    }

    public final String zzf() {
        return this.zzf;
    }

    public final boolean zzg() {
        return this.zzh;
    }
}
