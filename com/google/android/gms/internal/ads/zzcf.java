package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcf {
    public static final zzl zza = new zzl() { // from class: com.google.android.gms.internal.ads.zzce
    };
    public Object zzb;
    public Object zzc;
    public int zzd;
    public long zze;
    public long zzf;
    public boolean zzg;
    private zzd zzh = zzd.zza;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzcf.class.equals(obj.getClass())) {
            zzcf zzcfVar = (zzcf) obj;
            if (zzeg.zzS(this.zzb, zzcfVar.zzb) && zzeg.zzS(this.zzc, zzcfVar.zzc) && this.zzd == zzcfVar.zzd && this.zze == zzcfVar.zze && this.zzg == zzcfVar.zzg && zzeg.zzS(this.zzh, zzcfVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.zzb;
        int hashCode = ((obj == null ? 0 : obj.hashCode()) + 217) * 31;
        Object obj2 = this.zzc;
        int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
        int i2 = this.zzd;
        long j2 = this.zze;
        return this.zzh.hashCode() + ((((((((hashCode + hashCode2) * 31) + i2) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 961) + (this.zzg ? 1 : 0)) * 31);
    }

    public final int zza(int i2) {
        return this.zzh.zza(i2).zzc;
    }

    public final int zzb() {
        int i2 = this.zzh.zzc;
        return 0;
    }

    public final int zzc(long j2) {
        long j3 = this.zze;
        if (j2 == Long.MIN_VALUE || j3 == -9223372036854775807L) {
            return -1;
        }
        int i2 = (j2 > j3 ? 1 : (j2 == j3 ? 0 : -1));
        return -1;
    }

    public final int zzd(long j2) {
        return -1;
    }

    public final int zze(int i2) {
        return this.zzh.zza(i2).zza(-1);
    }

    public final int zzf(int i2, int i3) {
        return this.zzh.zza(i2).zza(i3);
    }

    public final long zzg(int i2, int i3) {
        zzc zza2 = this.zzh.zza(i2);
        if (zza2.zzc != -1) {
            return zza2.zzf[i3];
        }
        return -9223372036854775807L;
    }

    public final long zzh(int i2) {
        long j2 = this.zzh.zza(i2).zzb;
        return 0L;
    }

    public final long zzi() {
        long j2 = this.zzh.zzd;
        return 0L;
    }

    public final long zzj(int i2) {
        long j2 = this.zzh.zza(i2).zzg;
        return 0L;
    }

    public final zzcf zzk(Object obj, Object obj2, int i2, long j2, long j3, zzd zzdVar, boolean z) {
        this.zzb = obj;
        this.zzc = obj2;
        this.zzd = 0;
        this.zze = j2;
        this.zzf = 0L;
        this.zzh = zzdVar;
        this.zzg = z;
        return this;
    }

    public final boolean zzl(int i2) {
        boolean z = this.zzh.zza(i2).zzh;
        return false;
    }
}
