package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbfz extends zzgko implements zzglz {
    private static final zzbfz zzb;
    private int zze;
    private int zzg;
    private int zzh;
    private long zzi;
    private long zzl;
    private zzgkx zzf = zzgko.zzaH();
    private String zzj = "";
    private String zzk = "";

    static {
        zzbfz zzbfzVar = new zzbfz();
        zzb = zzbfzVar;
        zzgko.zzaN(zzbfz.class, zzbfzVar);
    }

    private zzbfz() {
    }

    public static zzbfv zza() {
        return (zzbfv) zzb.zzaw();
    }

    public static /* synthetic */ void zzd(zzbfz zzbfzVar, Iterable iterable) {
        zzgkx zzgkxVar = zzbfzVar.zzf;
        if (!zzgkxVar.zzc()) {
            zzbfzVar.zzf = zzgko.zzaI(zzgkxVar);
        }
        zzgip.zzar(iterable, zzbfzVar.zzf);
    }

    public static /* synthetic */ void zze(zzbfz zzbfzVar, int i2) {
        zzbfzVar.zze |= 1;
        zzbfzVar.zzg = i2;
    }

    public static /* synthetic */ void zzf(zzbfz zzbfzVar, int i2) {
        zzbfzVar.zze |= 2;
        zzbfzVar.zzh = i2;
    }

    public static /* synthetic */ void zzg(zzbfz zzbfzVar, long j2) {
        zzbfzVar.zze |= 4;
        zzbfzVar.zzi = j2;
    }

    public static /* synthetic */ void zzh(zzbfz zzbfzVar, String str) {
        str.getClass();
        zzbfzVar.zze |= 8;
        zzbfzVar.zzj = str;
    }

    public static /* synthetic */ void zzi(zzbfz zzbfzVar, String str) {
        str.getClass();
        zzbfzVar.zze |= 16;
        zzbfzVar.zzk = str;
    }

    public static /* synthetic */ void zzj(zzbfz zzbfzVar, long j2) {
        zzbfzVar.zze |= 32;
        zzbfzVar.zzl = j2;
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
                    return new zzbfv(null);
                }
                return new zzbfz();
            }
            return zzgko.zzaM(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005", new Object[]{"zze", "zzf", zzbfu.class, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        return (byte) 1;
    }
}
