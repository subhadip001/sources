package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgoo extends zzgko implements zzglz {
    private static final zzgoo zzb;
    private int zze;
    private zzgon zzf;
    private zzgjg zzh;
    private zzgjg zzi;
    private int zzj;
    private zzgjg zzk;
    private byte zzl = 2;
    private zzgkx zzg = zzgko.zzaH();

    static {
        zzgoo zzgooVar = new zzgoo();
        zzb = zzgooVar;
        zzgko.zzaN(zzgoo.class, zzgooVar);
    }

    private zzgoo() {
        zzgjg zzgjgVar = zzgjg.zzb;
        this.zzh = zzgjgVar;
        this.zzi = zzgjgVar;
        this.zzk = zzgjgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    public final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 != 5) {
                            this.zzl = obj == null ? (byte) 0 : (byte) 1;
                            return null;
                        }
                        return zzb;
                    }
                    return new zzgol(null);
                }
                return new zzgoo();
            }
            return zzgko.zzaM(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zze", "zzf", "zzg", zzgog.class, "zzh", "zzi", "zzj", "zzk"});
        }
        return Byte.valueOf(this.zzl);
    }
}
