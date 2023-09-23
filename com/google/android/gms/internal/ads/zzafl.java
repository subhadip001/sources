package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzafl {
    private zzzz zzb;
    private zzyv zzc;
    private zzafg zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private long zzk;
    private boolean zzl;
    private boolean zzm;
    private final zzafe zza = new zzafe();
    private zzafi zzj = new zzafi();

    public abstract long zza(zzdy zzdyVar);

    public void zzb(boolean z) {
        int i2;
        if (z) {
            this.zzj = new zzafi();
            this.zzf = 0L;
            i2 = 0;
        } else {
            i2 = 1;
        }
        this.zzh = i2;
        this.zze = -1L;
        this.zzg = 0L;
    }

    public abstract boolean zzc(zzdy zzdyVar, long j2, zzafi zzafiVar);

    public final int zze(zzyt zzytVar, zzzs zzzsVar) {
        zzcw.zzb(this.zzb);
        int i2 = zzeg.zza;
        int i3 = this.zzh;
        if (i3 == 0) {
            while (this.zza.zze(zzytVar)) {
                long zzf = zzytVar.zzf();
                long j2 = this.zzf;
                this.zzk = zzf - j2;
                if (!zzc(this.zza.zza(), j2, this.zzj)) {
                    zzad zzadVar = this.zzj.zza;
                    this.zzi = zzadVar.zzA;
                    if (!this.zzm) {
                        this.zzb.zzk(zzadVar);
                        this.zzm = true;
                    }
                    zzafg zzafgVar = this.zzj.zzb;
                    if (zzafgVar != null) {
                        this.zzd = zzafgVar;
                    } else if (zzytVar.zzd() == -1) {
                        this.zzd = new zzafk(null);
                    } else {
                        zzaff zzb = this.zza.zzb();
                        this.zzd = new zzaez(this, this.zzf, zzytVar.zzd(), zzb.zzd + zzb.zze, zzb.zzb, (zzb.zza & 4) != 0);
                    }
                    this.zzh = 2;
                    this.zza.zzd();
                    return 0;
                }
                this.zzf = zzytVar.zzf();
            }
            this.zzh = 3;
            return -1;
        } else if (i3 == 1) {
            ((zzym) zzytVar).zzo((int) this.zzf, false);
            this.zzh = 2;
            return 0;
        } else if (i3 != 2) {
            return -1;
        } else {
            long zzd = this.zzd.zzd(zzytVar);
            if (zzd >= 0) {
                zzzsVar.zza = zzd;
                return 1;
            }
            if (zzd < -1) {
                zzi(-(zzd + 2));
            }
            if (!this.zzl) {
                zzzv zze = this.zzd.zze();
                zzcw.zzb(zze);
                this.zzc.zzL(zze);
                this.zzl = true;
            }
            if (this.zzk <= 0 && !this.zza.zze(zzytVar)) {
                this.zzh = 3;
                return -1;
            }
            this.zzk = 0L;
            zzdy zza = this.zza.zza();
            long zza2 = zza(zza);
            if (zza2 >= 0) {
                long j3 = this.zzg;
                if (j3 + zza2 >= this.zze) {
                    long zzf2 = zzf(j3);
                    zzzx.zzb(this.zzb, zza, zza.zzd());
                    this.zzb.zzs(zzf2, 1, zza.zzd(), 0, null);
                    this.zze = -1L;
                }
            }
            this.zzg += zza2;
            return 0;
        }
    }

    public final long zzf(long j2) {
        return (j2 * 1000000) / this.zzi;
    }

    public final long zzg(long j2) {
        return (this.zzi * j2) / 1000000;
    }

    public final void zzh(zzyv zzyvVar, zzzz zzzzVar) {
        this.zzc = zzyvVar;
        this.zzb = zzzzVar;
        zzb(true);
    }

    public void zzi(long j2) {
        this.zzg = j2;
    }

    public final void zzj(long j2, long j3) {
        this.zza.zzc();
        if (j2 == 0) {
            zzb(!this.zzl);
        } else if (this.zzh != 0) {
            long zzg = zzg(j3);
            this.zze = zzg;
            zzafg zzafgVar = this.zzd;
            int i2 = zzeg.zza;
            zzafgVar.zzg(zzg);
            this.zzh = 2;
        }
    }
}
