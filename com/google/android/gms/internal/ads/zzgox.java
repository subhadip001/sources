package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgox extends zzgko implements zzglz {
    private static final zzgox zzb;
    private int zze;
    private int zzf;
    private zzgok zzh;
    private zzgoo zzi;
    private int zzj;
    private int zzm;
    private byte zzo = 2;
    private String zzg = "";
    private zzgkt zzk = zzgko.zzaE();
    private String zzl = "";
    private zzgkx zzn = zzgko.zzaH();

    static {
        zzgox zzgoxVar = new zzgox();
        zzb = zzgoxVar;
        zzgko.zzaN(zzgox.class, zzgoxVar);
    }

    private zzgox() {
    }

    public static zzgow zzc() {
        return (zzgow) zzb.zzaw();
    }

    public static /* synthetic */ void zzf(zzgox zzgoxVar, int i2) {
        zzgoxVar.zze |= 1;
        zzgoxVar.zzf = i2;
    }

    public static /* synthetic */ void zzg(zzgox zzgoxVar, String str) {
        str.getClass();
        zzgoxVar.zze |= 2;
        zzgoxVar.zzg = str;
    }

    public static /* synthetic */ void zzh(zzgox zzgoxVar, zzgok zzgokVar) {
        zzgokVar.getClass();
        zzgoxVar.zzh = zzgokVar;
        zzgoxVar.zze |= 4;
    }

    public static /* synthetic */ void zzi(zzgox zzgoxVar, String str) {
        str.getClass();
        zzgkx zzgkxVar = zzgoxVar.zzn;
        if (!zzgkxVar.zzc()) {
            zzgoxVar.zzn = zzgko.zzaI(zzgkxVar);
        }
        zzgoxVar.zzn.add(str);
    }

    public static /* synthetic */ void zzj(zzgox zzgoxVar, int i2) {
        zzgoxVar.zzm = i2 - 1;
        zzgoxVar.zze |= 64;
    }

    public final int zza() {
        return this.zzn.size();
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    public final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 != 5) {
                            this.zzo = obj == null ? (byte) 0 : (byte) 1;
                            return null;
                        }
                        return zzb;
                    }
                    return new zzgow(null);
                }
                return new zzgox();
            }
            return zzgko.zzaM(zzb, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\bဌ\u0006\t\u001a", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", zzgou.zza, "zzn"});
        }
        return Byte.valueOf(this.zzo);
    }

    public final String zze() {
        return this.zzg;
    }
}
