package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzgl implements zzju, zzjv {
    private final int zza;
    private zzjw zzc;
    private int zzd;
    private zzmv zze;
    private int zzf;
    private zztr zzg;
    private zzad[] zzh;
    private long zzi;
    private boolean zzk;
    private boolean zzl;
    private final zzja zzb = new zzja();
    private long zzj = Long.MIN_VALUE;

    public zzgl(int i2) {
        this.zza = i2;
    }

    private final void zzP(long j2, boolean z) {
        this.zzk = false;
        this.zzj = j2;
        zzu(j2, z);
    }

    @Override // com.google.android.gms.internal.ads.zzju
    public final void zzA() {
        zzcw.zzf(this.zzf == 0);
        zzja zzjaVar = this.zzb;
        zzjaVar.zzb = null;
        zzjaVar.zza = null;
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzju
    public final void zzB(long j2) {
        zzP(j2, false);
    }

    @Override // com.google.android.gms.internal.ads.zzju
    public final void zzC() {
        this.zzk = true;
    }

    @Override // com.google.android.gms.internal.ads.zzju
    public /* synthetic */ void zzD(float f2, float f3) {
    }

    @Override // com.google.android.gms.internal.ads.zzju
    public final void zzE() {
        zzcw.zzf(this.zzf == 1);
        this.zzf = 2;
        zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzju
    public final void zzF() {
        zzcw.zzf(this.zzf == 2);
        this.zzf = 1;
        zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzju
    public final boolean zzG() {
        return this.zzj == Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzju
    public final boolean zzH() {
        return this.zzk;
    }

    public final boolean zzI() {
        if (zzG()) {
            return this.zzk;
        }
        zztr zztrVar = this.zzg;
        Objects.requireNonNull(zztrVar);
        return zztrVar.zze();
    }

    public final zzad[] zzJ() {
        zzad[] zzadVarArr = this.zzh;
        Objects.requireNonNull(zzadVarArr);
        return zzadVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzju, com.google.android.gms.internal.ads.zzjv
    public final int zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzju
    public final int zzbe() {
        return this.zzf;
    }

    public final int zzbf(zzja zzjaVar, zzgc zzgcVar, int i2) {
        zztr zztrVar = this.zzg;
        Objects.requireNonNull(zztrVar);
        int zza = zztrVar.zza(zzjaVar, zzgcVar, i2);
        if (zza == -4) {
            if (zzgcVar.zzg()) {
                this.zzj = Long.MIN_VALUE;
                return this.zzk ? -4 : -3;
            }
            long j2 = zzgcVar.zzd + this.zzi;
            zzgcVar.zzd = j2;
            this.zzj = Math.max(this.zzj, j2);
        } else if (zza == -5) {
            zzad zzadVar = zzjaVar.zza;
            Objects.requireNonNull(zzadVar);
            long j3 = zzadVar.zzq;
            if (j3 != Long.MAX_VALUE) {
                zzab zzb = zzadVar.zzb();
                zzb.zzW(j3 + this.zzi);
                zzjaVar.zza = zzb.zzY();
                return -5;
            }
        }
        return zza;
    }

    public final zzgu zzbg(Throwable th, zzad zzadVar, boolean z, int i2) {
        int i3;
        if (zzadVar != null && !this.zzl) {
            this.zzl = true;
            try {
                int zzO = zzO(zzadVar) & 7;
                this.zzl = false;
                i3 = zzO;
            } catch (zzgu unused) {
                this.zzl = false;
            } catch (Throwable th2) {
                this.zzl = false;
                throw th2;
            }
            return zzgu.zzb(th, zzK(), this.zzd, zzadVar, i3, z, i2);
        }
        i3 = 4;
        return zzgu.zzb(th, zzK(), this.zzd, zzadVar, i3, z, i2);
    }

    public final int zzd(long j2) {
        zztr zztrVar = this.zzg;
        Objects.requireNonNull(zztrVar);
        return zztrVar.zzb(j2 - this.zzi);
    }

    @Override // com.google.android.gms.internal.ads.zzjv
    public int zze() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzju
    public final long zzf() {
        return this.zzj;
    }

    public final zzja zzh() {
        zzja zzjaVar = this.zzb;
        zzjaVar.zzb = null;
        zzjaVar.zza = null;
        return zzjaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzju
    public zzjc zzi() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzju
    public final zzjv zzj() {
        return this;
    }

    public final zzjw zzk() {
        zzjw zzjwVar = this.zzc;
        Objects.requireNonNull(zzjwVar);
        return zzjwVar;
    }

    public final zzmv zzl() {
        zzmv zzmvVar = this.zze;
        Objects.requireNonNull(zzmvVar);
        return zzmvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzju
    public final zztr zzm() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzju
    public final void zzn() {
        zzcw.zzf(this.zzf == 1);
        zzja zzjaVar = this.zzb;
        zzjaVar.zzb = null;
        zzjaVar.zza = null;
        this.zzf = 0;
        this.zzg = null;
        this.zzh = null;
        this.zzk = false;
        zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzju
    public final void zzo(zzjw zzjwVar, zzad[] zzadVarArr, zztr zztrVar, long j2, boolean z, boolean z2, long j3, long j4) {
        zzcw.zzf(this.zzf == 0);
        this.zzc = zzjwVar;
        this.zzf = 1;
        zzt(z, z2);
        zzz(zzadVarArr, zztrVar, j3, j4);
        zzP(j2, z);
    }

    @Override // com.google.android.gms.internal.ads.zzjq
    public void zzp(int i2, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzju
    public final void zzq(int i2, zzmv zzmvVar) {
        this.zzd = i2;
        this.zze = zzmvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzju
    public final void zzr() {
        zztr zztrVar = this.zzg;
        Objects.requireNonNull(zztrVar);
        zztrVar.zzd();
    }

    public void zzs() {
        throw null;
    }

    public void zzt(boolean z, boolean z2) {
    }

    public void zzu(long j2, boolean z) {
        throw null;
    }

    public void zzv() {
    }

    public void zzw() {
    }

    public void zzx() {
    }

    public void zzy(zzad[] zzadVarArr, long j2, long j3) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzju
    public final void zzz(zzad[] zzadVarArr, zztr zztrVar, long j2, long j3) {
        zzcw.zzf(!this.zzk);
        this.zzg = zztrVar;
        if (this.zzj == Long.MIN_VALUE) {
            this.zzj = j2;
        }
        this.zzh = zzadVarArr;
        this.zzi = j3;
        zzy(zzadVarArr, j2, j3);
    }
}
