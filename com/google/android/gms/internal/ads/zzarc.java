package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzarc implements zzarx, zzary {
    private final int zza;
    private zzarz zzb;
    private int zzc;
    private int zzd;
    private zzaxk zze;
    private long zzf;
    private boolean zzg = true;
    private boolean zzh;

    public zzarc(int i2) {
        this.zza = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzarx
    public final boolean zzA() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzarx
    public final boolean zzB() {
        return this.zzh;
    }

    public final boolean zzC() {
        return this.zzg ? this.zzh : this.zze.zze();
    }

    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzarx
    public final int zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzarx, com.google.android.gms.internal.ads.zzary
    public final int zzc() {
        return this.zza;
    }

    public final int zzd(zzart zzartVar, zzatn zzatnVar, boolean z) {
        int zzb = this.zze.zzb(zzartVar, zzatnVar, z);
        if (zzb == -4) {
            if (zzatnVar.zzf()) {
                this.zzg = true;
                return this.zzh ? -4 : -3;
            }
            zzatnVar.zzc += this.zzf;
        } else if (zzb == -5) {
            zzars zzarsVar = zzartVar.zza;
            long j2 = zzarsVar.zzw;
            if (j2 != Long.MAX_VALUE) {
                zzartVar.zza = new zzars(zzarsVar.zza, zzarsVar.zze, zzarsVar.zzf, zzarsVar.zzc, zzarsVar.zzb, zzarsVar.zzg, zzarsVar.zzj, zzarsVar.zzk, zzarsVar.zzl, zzarsVar.zzm, zzarsVar.zzn, zzarsVar.zzp, zzarsVar.zzo, zzarsVar.zzq, zzarsVar.zzr, zzarsVar.zzs, zzarsVar.zzt, zzarsVar.zzu, zzarsVar.zzv, zzarsVar.zzx, zzarsVar.zzy, zzarsVar.zzz, j2 + this.zzf, zzarsVar.zzh, zzarsVar.zzi, zzarsVar.zzd);
                return -5;
            }
        }
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzary
    public int zze() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzarx
    public final zzary zzf() {
        return this;
    }

    public final zzarz zzg() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzarx
    public final zzaxk zzh() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzarx
    public zzazc zzi() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzarx
    public final void zzj() {
        zzayy.zze(this.zzd == 1);
        this.zzd = 0;
        this.zze = null;
        this.zzh = false;
        zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzarx
    public final void zzk(zzarz zzarzVar, zzars[] zzarsVarArr, zzaxk zzaxkVar, long j2, boolean z, long j3) {
        zzayy.zze(this.zzd == 0);
        this.zzb = zzarzVar;
        this.zzd = 1;
        zzo(z);
        zzt(zzarsVarArr, zzaxkVar, j3);
        zzp(j2, z);
    }

    @Override // com.google.android.gms.internal.ads.zzarg
    public void zzl(int i2, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzarx
    public final void zzm() {
        this.zze.zzc();
    }

    public void zzn() {
        throw null;
    }

    public void zzo(boolean z) {
    }

    public void zzp(long j2, boolean z) {
        throw null;
    }

    public void zzq() {
    }

    public void zzr() {
    }

    public void zzs(zzars[] zzarsVarArr, long j2) {
    }

    @Override // com.google.android.gms.internal.ads.zzarx
    public final void zzt(zzars[] zzarsVarArr, zzaxk zzaxkVar, long j2) {
        zzayy.zze(!this.zzh);
        this.zze = zzaxkVar;
        this.zzg = false;
        this.zzf = j2;
        zzs(zzarsVarArr, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzarx
    public final void zzu(long j2) {
        this.zzh = false;
        this.zzg = false;
        zzp(j2, false);
    }

    @Override // com.google.android.gms.internal.ads.zzarx
    public final void zzv() {
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzarx
    public final void zzw(int i2) {
        this.zzc = i2;
    }

    public final void zzx(long j2) {
        this.zze.zzd(j2 - this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzarx
    public final void zzy() {
        zzayy.zze(this.zzd == 1);
        this.zzd = 2;
        zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzarx
    public final void zzz() {
        zzayy.zze(this.zzd == 2);
        this.zzd = 1;
        zzr();
    }
}
