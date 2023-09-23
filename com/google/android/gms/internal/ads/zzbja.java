package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public class zzbja {
    private final String zza;
    private final Object zzb;
    private final int zzc;

    public zzbja(String str, Object obj, int i2) {
        this.zza = str;
        this.zzb = obj;
        this.zzc = i2;
    }

    public static zzbja zza(String str, double d2) {
        return new zzbja(str, Double.valueOf(d2), 3);
    }

    public static zzbja zzb(String str, long j2) {
        return new zzbja(str, Long.valueOf(j2), 2);
    }

    public static zzbja zzc(String str, String str2) {
        return new zzbja(str, str2, 4);
    }

    public static zzbja zzd(String str, boolean z) {
        return new zzbja(str, Boolean.valueOf(z), 1);
    }

    public final Object zze() {
        zzbkd zza = zzbkf.zza();
        if (zza == null) {
            if (zzbkf.zzb() != null) {
                zzbkf.zzb().zza();
            }
            return this.zzb;
        }
        int i2 = this.zzc - 1;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    return zza.zzd(this.zza, (String) this.zzb);
                }
                return zza.zzb(this.zza, ((Double) this.zzb).doubleValue());
            }
            return zza.zzc(this.zza, ((Long) this.zzb).longValue());
        }
        return zza.zza(this.zza, ((Boolean) this.zzb).booleanValue());
    }
}
