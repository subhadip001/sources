package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzjd {
    public final zzrz zza;
    public final Object zzb;
    public final zztr[] zzc;
    public boolean zzd;
    public boolean zze;
    public zzje zzf;
    public boolean zzg;
    private final boolean[] zzh;
    private final zzjv[] zzi;
    private final zzvn zzj;
    private final zzjn zzk;
    private zzjd zzl;
    private zztz zzm;
    private zzvo zzn;
    private long zzo;

    public zzjd(zzjv[] zzjvVarArr, long j2, zzvn zzvnVar, zzvw zzvwVar, zzjn zzjnVar, zzje zzjeVar, zzvo zzvoVar, byte[] bArr) {
        this.zzi = zzjvVarArr;
        this.zzo = j2;
        this.zzj = zzvnVar;
        this.zzk = zzjnVar;
        zzsb zzsbVar = zzjeVar.zza;
        this.zzb = zzsbVar.zza;
        this.zzf = zzjeVar;
        this.zzm = zztz.zza;
        this.zzn = zzvoVar;
        this.zzc = new zztr[2];
        this.zzh = new boolean[2];
        long j3 = zzjeVar.zzb;
        long j4 = zzjeVar.zzd;
        zzrz zzo = zzjnVar.zzo(zzsbVar, zzvwVar, j3);
        this.zza = j4 != -9223372036854775807L ? new zzrg(zzo, true, 0L, j4) : zzo;
    }

    private final void zzs() {
        if (!zzu()) {
            return;
        }
        int i2 = 0;
        while (true) {
            zzvo zzvoVar = this.zzn;
            if (i2 >= zzvoVar.zza) {
                return;
            }
            zzvoVar.zzb(i2);
            zzvh zzvhVar = this.zzn.zzc[i2];
            i2++;
        }
    }

    private final void zzt() {
        if (!zzu()) {
            return;
        }
        int i2 = 0;
        while (true) {
            zzvo zzvoVar = this.zzn;
            if (i2 >= zzvoVar.zza) {
                return;
            }
            zzvoVar.zzb(i2);
            zzvh zzvhVar = this.zzn.zzc[i2];
            i2++;
        }
    }

    private final boolean zzu() {
        return this.zzl == null;
    }

    public final long zza(zzvo zzvoVar, long j2, boolean z) {
        return zzb(zzvoVar, j2, false, new boolean[2]);
    }

    public final long zzb(zzvo zzvoVar, long j2, boolean z, boolean[] zArr) {
        int i2 = 0;
        while (true) {
            boolean z2 = true;
            if (i2 >= zzvoVar.zza) {
                break;
            }
            boolean[] zArr2 = this.zzh;
            if (z || !zzvoVar.zza(this.zzn, i2)) {
                z2 = false;
            }
            zArr2[i2] = z2;
            i2++;
        }
        int i3 = 0;
        while (true) {
            zzjv[] zzjvVarArr = this.zzi;
            if (i3 >= 2) {
                break;
            }
            zzjvVarArr[i3].zzb();
            i3++;
        }
        zzs();
        this.zzn = zzvoVar;
        zzt();
        long zzf = this.zza.zzf(zzvoVar.zzc, this.zzh, this.zzc, zArr, j2);
        int i4 = 0;
        while (true) {
            zzjv[] zzjvVarArr2 = this.zzi;
            if (i4 >= 2) {
                break;
            }
            zzjvVarArr2[i4].zzb();
            i4++;
        }
        this.zze = false;
        int i5 = 0;
        while (true) {
            zztr[] zztrVarArr = this.zzc;
            if (i5 >= 2) {
                return zzf;
            }
            if (zztrVarArr[i5] != null) {
                zzcw.zzf(zzvoVar.zzb(i5));
                this.zzi[i5].zzb();
                this.zze = true;
            } else {
                zzcw.zzf(zzvoVar.zzc[i5] == null);
            }
            i5++;
        }
    }

    public final long zzc() {
        if (this.zzd) {
            long zzb = this.zze ? this.zza.zzb() : Long.MIN_VALUE;
            return zzb == Long.MIN_VALUE ? this.zzf.zze : zzb;
        }
        return this.zzf.zzb;
    }

    public final long zzd() {
        if (this.zzd) {
            return this.zza.zzc();
        }
        return 0L;
    }

    public final long zze() {
        return this.zzo;
    }

    public final long zzf() {
        return this.zzf.zzb + this.zzo;
    }

    public final zzjd zzg() {
        return this.zzl;
    }

    public final zztz zzh() {
        return this.zzm;
    }

    public final zzvo zzi() {
        return this.zzn;
    }

    public final zzvo zzj(float f2, zzci zzciVar) {
        zzvh[] zzvhVarArr;
        zzvo zzj = this.zzj.zzj(this.zzi, this.zzm, this.zzf.zza, zzciVar);
        for (zzvh zzvhVar : zzj.zzc) {
        }
        return zzj;
    }

    public final void zzk(long j2) {
        zzcw.zzf(zzu());
        this.zza.zzo(j2 - this.zzo);
    }

    public final void zzl(float f2, zzci zzciVar) {
        this.zzd = true;
        this.zzm = this.zza.zzh();
        zzvo zzj = zzj(f2, zzciVar);
        zzje zzjeVar = this.zzf;
        long j2 = zzjeVar.zzb;
        long j3 = zzjeVar.zze;
        if (j3 != -9223372036854775807L && j2 >= j3) {
            j2 = Math.max(0L, j3 - 1);
        }
        long zza = zza(zzj, j2, false);
        long j4 = this.zzo;
        zzje zzjeVar2 = this.zzf;
        this.zzo = (zzjeVar2.zzb - zza) + j4;
        this.zzf = zzjeVar2.zzb(zza);
    }

    public final void zzm(long j2) {
        zzcw.zzf(zzu());
        if (this.zzd) {
            this.zza.zzm(j2 - this.zzo);
        }
    }

    public final void zzn() {
        zzs();
        zzjn zzjnVar = this.zzk;
        zzrz zzrzVar = this.zza;
        try {
            if (zzrzVar instanceof zzrg) {
                zzjnVar.zzh(((zzrg) zzrzVar).zza);
            } else {
                zzjnVar.zzh(zzrzVar);
            }
        } catch (RuntimeException e2) {
            zzdn.zza("MediaPeriodHolder", "Period release failed.", e2);
        }
    }

    public final void zzo(zzjd zzjdVar) {
        if (zzjdVar == this.zzl) {
            return;
        }
        zzs();
        this.zzl = zzjdVar;
        zzt();
    }

    public final void zzp(long j2) {
        this.zzo = 1000000000000L;
    }

    public final void zzq() {
        zzrz zzrzVar = this.zza;
        if (zzrzVar instanceof zzrg) {
            long j2 = this.zzf.zzd;
            if (j2 == -9223372036854775807L) {
                j2 = Long.MIN_VALUE;
            }
            ((zzrg) zzrzVar).zzn(0L, j2);
        }
    }

    public final boolean zzr() {
        return this.zzd && (!this.zze || this.zza.zzb() == Long.MIN_VALUE);
    }
}
