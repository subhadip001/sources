package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcmx {
    public final int zza;
    public final int zzb;
    private final int zzc;

    private zzcmx(int i2, int i3, int i4) {
        this.zzc = i2;
        this.zzb = i3;
        this.zza = i4;
    }

    public static zzcmx zza() {
        return new zzcmx(0, 0, 0);
    }

    public static zzcmx zzb(int i2, int i3) {
        return new zzcmx(1, i2, i3);
    }

    public static zzcmx zzc(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        return zzqVar.zzd ? new zzcmx(3, 0, 0) : zzqVar.zzi ? new zzcmx(2, 0, 0) : zzqVar.zzh ? zza() : zzb(zzqVar.zzf, zzqVar.zzc);
    }

    public static zzcmx zzd() {
        return new zzcmx(5, 0, 0);
    }

    public static zzcmx zze() {
        return new zzcmx(4, 0, 0);
    }

    public final boolean zzf() {
        return this.zzc == 0;
    }

    public final boolean zzg() {
        return this.zzc == 2;
    }

    public final boolean zzh() {
        return this.zzc == 5;
    }

    public final boolean zzi() {
        return this.zzc == 3;
    }

    public final boolean zzj() {
        return this.zzc == 4;
    }
}
