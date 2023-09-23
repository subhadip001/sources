package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgok extends zzgko implements zzglz {
    private static final zzgok zzb;
    private int zze;
    private zzgoj zzf;
    private zzgjg zzh;
    private zzgjg zzi;
    private int zzj;
    private byte zzk = 2;
    private zzgkx zzg = zzgko.zzaH();

    static {
        zzgok zzgokVar = new zzgok();
        zzb = zzgokVar;
        zzgko.zzaN(zzgok.class, zzgokVar);
    }

    private zzgok() {
        zzgjg zzgjgVar = zzgjg.zzb;
        this.zzh = zzgjgVar;
        this.zzi = zzgjgVar;
    }

    public static zzgoh zza() {
        return (zzgoh) zzb.zzaw();
    }

    public static /* synthetic */ void zzd(zzgok zzgokVar, zzgog zzgogVar) {
        zzgogVar.getClass();
        zzgkx zzgkxVar = zzgokVar.zzg;
        if (!zzgkxVar.zzc()) {
            zzgokVar.zzg = zzgko.zzaI(zzgkxVar);
        }
        zzgokVar.zzg.add(zzgogVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    public final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 != 5) {
                            this.zzk = obj == null ? (byte) 0 : (byte) 1;
                            return null;
                        }
                        return zzb;
                    }
                    return new zzgoh(null);
                }
                return new zzgok();
            }
            return zzgko.zzaM(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zze", "zzf", "zzg", zzgog.class, "zzh", "zzi", "zzj"});
        }
        return Byte.valueOf(this.zzk);
    }
}
