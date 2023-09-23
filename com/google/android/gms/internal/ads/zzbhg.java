package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbhg extends zzgko implements zzglz {
    private static final zzbhg zzb;
    private int zze;
    private boolean zzf;
    private int zzg;

    static {
        zzbhg zzbhgVar = new zzbhg();
        zzb = zzbhgVar;
        zzgko.zzaN(zzbhg.class, zzbhgVar);
    }

    private zzbhg() {
    }

    public static zzbhf zza() {
        return (zzbhf) zzb.zzaw();
    }

    public static /* synthetic */ void zzd(zzbhg zzbhgVar, boolean z) {
        zzbhgVar.zze |= 1;
        zzbhgVar.zzf = z;
    }

    public static /* synthetic */ void zze(zzbhg zzbhgVar, int i2) {
        zzbhgVar.zze |= 2;
        zzbhgVar.zzg = i2;
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
                    return new zzbhf(null);
                }
                return new zzbhg();
            }
            return zzgko.zzaM(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final boolean zzf() {
        return this.zzf;
    }
}
