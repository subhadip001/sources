package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfia extends zzgko implements zzglz {
    private static final zzfia zzb;
    private zzgkx zze = zzgko.zzaH();

    static {
        zzfia zzfiaVar = new zzfia();
        zzb = zzfiaVar;
        zzgko.zzaN(zzfia.class, zzfiaVar);
    }

    private zzfia() {
    }

    public static zzfhx zzc() {
        return (zzfhx) zzb.zzaw();
    }

    public static /* synthetic */ zzfia zzd() {
        return zzb;
    }

    public static /* synthetic */ void zze(zzfia zzfiaVar) {
        zzfiaVar.zze = zzgko.zzaH();
    }

    public static /* synthetic */ void zzf(zzfia zzfiaVar, zzfhz zzfhzVar) {
        zzfhzVar.getClass();
        zzgkx zzgkxVar = zzfiaVar.zze;
        if (!zzgkxVar.zzc()) {
            zzfiaVar.zze = zzgko.zzaI(zzgkxVar);
        }
        zzfiaVar.zze.add(zzfhzVar);
    }

    public final int zza() {
        return this.zze.size();
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
                    return new zzfhx(null);
                }
                return new zzfia();
            }
            return zzgko.zzaM(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", zzfhz.class});
        }
        return (byte) 1;
    }
}
