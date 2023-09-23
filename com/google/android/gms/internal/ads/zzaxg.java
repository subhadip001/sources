package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzaxg {
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private zzars zzq;
    private int zza = 1000;
    private int[] zzb = new int[1000];
    private long[] zzc = new long[1000];
    private long[] zzf = new long[1000];
    private int[] zze = new int[1000];
    private int[] zzd = new int[1000];
    private zzaud[] zzg = new zzaud[1000];
    private zzars[] zzh = new zzars[1000];
    private long zzm = Long.MIN_VALUE;
    private long zzn = Long.MIN_VALUE;
    private boolean zzp = true;
    private boolean zzo = true;

    public final int zza() {
        return this.zzj + this.zzi;
    }

    public final synchronized int zzb(zzart zzartVar, zzatn zzatnVar, boolean z, boolean z2, zzars zzarsVar, zzaxf zzaxfVar) {
        if (!zzl()) {
            if (z2) {
                zzatnVar.zzc(4);
                return -4;
            }
            zzars zzarsVar2 = this.zzq;
            if (zzarsVar2 == null || (!z && zzarsVar2 == zzarsVar)) {
                return -3;
            }
            zzartVar.zza = zzarsVar2;
            return -5;
        }
        if (!z) {
            zzars[] zzarsVarArr = this.zzh;
            int i2 = this.zzk;
            if (zzarsVarArr[i2] == zzarsVar) {
                if (zzatnVar.zzb != null) {
                    zzatnVar.zzc = this.zzf[i2];
                    zzatnVar.zzc(this.zze[i2]);
                    int[] iArr = this.zzd;
                    int i3 = this.zzk;
                    zzaxfVar.zza = iArr[i3];
                    zzaxfVar.zzb = this.zzc[i3];
                    zzaxfVar.zzd = this.zzg[i3];
                    this.zzm = Math.max(this.zzm, zzatnVar.zzc);
                    int i4 = this.zzi - 1;
                    this.zzi = i4;
                    int i5 = this.zzk + 1;
                    this.zzk = i5;
                    this.zzj++;
                    if (i5 == this.zza) {
                        this.zzk = 0;
                        i5 = 0;
                    }
                    zzaxfVar.zzc = i4 > 0 ? this.zzc[i5] : zzaxfVar.zzb + zzaxfVar.zza;
                    return -4;
                }
                return -3;
            }
        }
        zzartVar.zza = this.zzh[this.zzk];
        return -5;
    }

    public final synchronized long zzc() {
        return Math.max(this.zzm, this.zzn);
    }

    public final synchronized long zzd() {
        if (zzl()) {
            int i2 = this.zzk;
            int i3 = this.zzi;
            int i4 = i2 + i3;
            int i5 = this.zza;
            int i6 = (i4 - 1) % i5;
            this.zzk = i4 % i5;
            this.zzj += i3;
            this.zzi = 0;
            return this.zzc[i6] + this.zzd[i6];
        }
        return -1L;
    }

    public final synchronized long zze(long j2, boolean z) {
        if (zzl()) {
            long[] jArr = this.zzf;
            int i2 = this.zzk;
            if (j2 >= jArr[i2]) {
                int i3 = 0;
                if (j2 <= this.zzn || z) {
                    int i4 = -1;
                    while (i2 != this.zzl && this.zzf[i2] <= j2) {
                        if (1 == (this.zze[i2] & 1)) {
                            i4 = i3;
                        }
                        i2 = (i2 + 1) % this.zza;
                        i3++;
                    }
                    if (i4 == -1) {
                        return -1L;
                    }
                    int i5 = (this.zzk + i4) % this.zza;
                    this.zzk = i5;
                    this.zzj += i4;
                    this.zzi -= i4;
                    return this.zzc[i5];
                }
                return -1L;
            }
        }
        return -1L;
    }

    public final synchronized zzars zzf() {
        if (this.zzp) {
            return null;
        }
        return this.zzq;
    }

    public final void zzg() {
        this.zzj = 0;
        this.zzk = 0;
        this.zzl = 0;
        this.zzi = 0;
        this.zzo = true;
    }

    public final synchronized void zzh(long j2, int i2, long j3, int i3, zzaud zzaudVar) {
        if (this.zzo) {
            if ((i2 & 1) == 0) {
                return;
            }
            this.zzo = false;
        }
        zzayy.zze(!this.zzp);
        zzi(j2);
        long[] jArr = this.zzf;
        int i4 = this.zzl;
        jArr[i4] = j2;
        long[] jArr2 = this.zzc;
        jArr2[i4] = j3;
        this.zzd[i4] = i3;
        this.zze[i4] = i2;
        this.zzg[i4] = zzaudVar;
        this.zzh[i4] = this.zzq;
        this.zzb[i4] = 0;
        int i5 = this.zzi + 1;
        this.zzi = i5;
        int i6 = this.zza;
        if (i5 != i6) {
            int i7 = i4 + 1;
            this.zzl = i7;
            if (i7 == i6) {
                this.zzl = 0;
                return;
            }
            return;
        }
        int i8 = i6 + 1000;
        int[] iArr = new int[i8];
        long[] jArr3 = new long[i8];
        long[] jArr4 = new long[i8];
        int[] iArr2 = new int[i8];
        int[] iArr3 = new int[i8];
        zzaud[] zzaudVarArr = new zzaud[i8];
        zzars[] zzarsVarArr = new zzars[i8];
        int i9 = this.zzk;
        int i10 = i6 - i9;
        System.arraycopy(jArr2, i9, jArr3, 0, i10);
        System.arraycopy(this.zzf, this.zzk, jArr4, 0, i10);
        System.arraycopy(this.zze, this.zzk, iArr2, 0, i10);
        System.arraycopy(this.zzd, this.zzk, iArr3, 0, i10);
        System.arraycopy(this.zzg, this.zzk, zzaudVarArr, 0, i10);
        System.arraycopy(this.zzh, this.zzk, zzarsVarArr, 0, i10);
        System.arraycopy(this.zzb, this.zzk, iArr, 0, i10);
        int i11 = this.zzk;
        System.arraycopy(this.zzc, 0, jArr3, i10, i11);
        System.arraycopy(this.zzf, 0, jArr4, i10, i11);
        System.arraycopy(this.zze, 0, iArr2, i10, i11);
        System.arraycopy(this.zzd, 0, iArr3, i10, i11);
        System.arraycopy(this.zzg, 0, zzaudVarArr, i10, i11);
        System.arraycopy(this.zzh, 0, zzarsVarArr, i10, i11);
        System.arraycopy(this.zzb, 0, iArr, i10, i11);
        this.zzc = jArr3;
        this.zzf = jArr4;
        this.zze = iArr2;
        this.zzd = iArr3;
        this.zzg = zzaudVarArr;
        this.zzh = zzarsVarArr;
        this.zzb = iArr;
        this.zzk = 0;
        int i12 = this.zza;
        this.zzl = i12;
        this.zzi = i12;
        this.zza = i8;
    }

    public final synchronized void zzi(long j2) {
        this.zzn = Math.max(this.zzn, j2);
    }

    public final void zzj() {
        this.zzm = Long.MIN_VALUE;
        this.zzn = Long.MIN_VALUE;
    }

    public final synchronized boolean zzk(zzars zzarsVar) {
        if (zzarsVar == null) {
            this.zzp = true;
            return false;
        }
        this.zzp = false;
        if (zzazn.zzo(zzarsVar, this.zzq)) {
            return false;
        }
        this.zzq = zzarsVar;
        return true;
    }

    public final synchronized boolean zzl() {
        return this.zzi != 0;
    }
}
