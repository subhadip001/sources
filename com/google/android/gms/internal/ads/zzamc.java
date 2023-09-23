package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzamc extends zzgko implements zzglz {
    private static final zzamc zzb;
    private int zze;
    private zzgjg zzf;
    private zzgjg zzg;
    private zzgjg zzh;
    private zzgjg zzi;

    static {
        zzamc zzamcVar = new zzamc();
        zzb = zzamcVar;
        zzgko.zzaN(zzamc.class, zzamcVar);
    }

    private zzamc() {
        zzgjg zzgjgVar = zzgjg.zzb;
        this.zzf = zzgjgVar;
        this.zzg = zzgjgVar;
        this.zzh = zzgjgVar;
        this.zzi = zzgjgVar;
    }

    public static zzamb zza() {
        return (zzamb) zzb.zzaw();
    }

    public static zzamc zzd(byte[] bArr, zzgka zzgkaVar) {
        return (zzamc) zzgko.zzaD(zzb, bArr, zzgkaVar);
    }

    public static /* synthetic */ void zzi(zzamc zzamcVar, zzgjg zzgjgVar) {
        zzamcVar.zze |= 1;
        zzamcVar.zzf = zzgjgVar;
    }

    public static /* synthetic */ void zzj(zzamc zzamcVar, zzgjg zzgjgVar) {
        zzamcVar.zze |= 2;
        zzamcVar.zzg = zzgjgVar;
    }

    public static /* synthetic */ void zzk(zzamc zzamcVar, zzgjg zzgjgVar) {
        zzamcVar.zze |= 4;
        zzamcVar.zzh = zzgjgVar;
    }

    public static /* synthetic */ void zzl(zzamc zzamcVar, zzgjg zzgjgVar) {
        zzamcVar.zze |= 8;
        zzamcVar.zzi = zzgjgVar;
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
                    return new zzamb(null);
                }
                return new zzamc();
            }
            return zzgko.zzaM(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }

    public final zzgjg zze() {
        return this.zzf;
    }

    public final zzgjg zzf() {
        return this.zzg;
    }

    public final zzgjg zzg() {
        return this.zzi;
    }

    public final zzgjg zzh() {
        return this.zzh;
    }
}
