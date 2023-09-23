package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgog extends zzgko implements zzglz {
    private static final zzgog zzb;
    private int zze;
    private zzgjg zzf;
    private zzgjg zzg;
    private byte zzh = 2;

    static {
        zzgog zzgogVar = new zzgog();
        zzb = zzgogVar;
        zzgko.zzaN(zzgog.class, zzgogVar);
    }

    private zzgog() {
        zzgjg zzgjgVar = zzgjg.zzb;
        this.zzf = zzgjgVar;
        this.zzg = zzgjgVar;
    }

    public static zzgof zza() {
        return (zzgof) zzb.zzaw();
    }

    public static /* synthetic */ zzgog zzc() {
        return zzb;
    }

    public static /* synthetic */ void zzd(zzgog zzgogVar, zzgjg zzgjgVar) {
        zzgogVar.zze |= 1;
        zzgogVar.zzf = zzgjgVar;
    }

    public static /* synthetic */ void zze(zzgog zzgogVar, zzgjg zzgjgVar) {
        zzgogVar.zze |= 2;
        zzgogVar.zzg = zzgjgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    public final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 != 5) {
                            this.zzh = obj == null ? (byte) 0 : (byte) 1;
                            return null;
                        }
                        return zzb;
                    }
                    return new zzgof(null);
                }
                return new zzgog();
            }
            return zzgko.zzaM(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        return Byte.valueOf(this.zzh);
    }
}
