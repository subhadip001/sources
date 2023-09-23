package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzrt implements zzrz, zzry {
    public final zzsb zza;
    private final long zzb;
    private zzsd zzc;
    private zzrz zzd;
    private zzry zze;
    private long zzf = -9223372036854775807L;
    private final zzvw zzg;

    public zzrt(zzsb zzsbVar, zzvw zzvwVar, long j2, byte[] bArr) {
        this.zza = zzsbVar;
        this.zzg = zzvwVar;
        this.zzb = j2;
    }

    private final long zzv(long j2) {
        long j3 = this.zzf;
        return j3 != -9223372036854775807L ? j3 : j2;
    }

    @Override // com.google.android.gms.internal.ads.zzrz
    public final long zza(long j2, zzjx zzjxVar) {
        zzrz zzrzVar = this.zzd;
        int i2 = zzeg.zza;
        return zzrzVar.zza(j2, zzjxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzrz, com.google.android.gms.internal.ads.zztt
    public final long zzb() {
        zzrz zzrzVar = this.zzd;
        int i2 = zzeg.zza;
        return zzrzVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzrz, com.google.android.gms.internal.ads.zztt
    public final long zzc() {
        zzrz zzrzVar = this.zzd;
        int i2 = zzeg.zza;
        return zzrzVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzrz
    public final long zzd() {
        zzrz zzrzVar = this.zzd;
        int i2 = zzeg.zza;
        return zzrzVar.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzrz
    public final long zze(long j2) {
        zzrz zzrzVar = this.zzd;
        int i2 = zzeg.zza;
        return zzrzVar.zze(j2);
    }

    @Override // com.google.android.gms.internal.ads.zzrz
    public final long zzf(zzvh[] zzvhVarArr, boolean[] zArr, zztr[] zztrVarArr, boolean[] zArr2, long j2) {
        long j3;
        long j4 = this.zzf;
        if (j4 == -9223372036854775807L || j2 != this.zzb) {
            j3 = j2;
        } else {
            this.zzf = -9223372036854775807L;
            j3 = j4;
        }
        zzrz zzrzVar = this.zzd;
        int i2 = zzeg.zza;
        return zzrzVar.zzf(zzvhVarArr, zArr, zztrVarArr, zArr2, j3);
    }

    @Override // com.google.android.gms.internal.ads.zzts
    public final /* bridge */ /* synthetic */ void zzg(zztt zzttVar) {
        zzrz zzrzVar = (zzrz) zzttVar;
        zzry zzryVar = this.zze;
        int i2 = zzeg.zza;
        zzryVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzrz
    public final zztz zzh() {
        zzrz zzrzVar = this.zzd;
        int i2 = zzeg.zza;
        return zzrzVar.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzry
    public final void zzi(zzrz zzrzVar) {
        zzry zzryVar = this.zze;
        int i2 = zzeg.zza;
        zzryVar.zzi(this);
    }

    @Override // com.google.android.gms.internal.ads.zzrz
    public final void zzj(long j2, boolean z) {
        zzrz zzrzVar = this.zzd;
        int i2 = zzeg.zza;
        zzrzVar.zzj(j2, false);
    }

    @Override // com.google.android.gms.internal.ads.zzrz
    public final void zzk() {
        try {
            zzrz zzrzVar = this.zzd;
            if (zzrzVar != null) {
                zzrzVar.zzk();
                return;
            }
            zzsd zzsdVar = this.zzc;
            if (zzsdVar != null) {
                zzsdVar.zzw();
            }
        } catch (IOException e2) {
            throw e2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrz
    public final void zzl(zzry zzryVar, long j2) {
        this.zze = zzryVar;
        zzrz zzrzVar = this.zzd;
        if (zzrzVar != null) {
            zzrzVar.zzl(this, zzv(this.zzb));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrz, com.google.android.gms.internal.ads.zztt
    public final void zzm(long j2) {
        zzrz zzrzVar = this.zzd;
        int i2 = zzeg.zza;
        zzrzVar.zzm(j2);
    }

    public final long zzn() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzrz, com.google.android.gms.internal.ads.zztt
    public final boolean zzo(long j2) {
        zzrz zzrzVar = this.zzd;
        return zzrzVar != null && zzrzVar.zzo(j2);
    }

    @Override // com.google.android.gms.internal.ads.zzrz, com.google.android.gms.internal.ads.zztt
    public final boolean zzp() {
        zzrz zzrzVar = this.zzd;
        return zzrzVar != null && zzrzVar.zzp();
    }

    public final long zzq() {
        return this.zzb;
    }

    public final void zzr(zzsb zzsbVar) {
        long zzv = zzv(this.zzb);
        zzsd zzsdVar = this.zzc;
        Objects.requireNonNull(zzsdVar);
        zzrz zzD = zzsdVar.zzD(zzsbVar, this.zzg, zzv);
        this.zzd = zzD;
        if (this.zze != null) {
            zzD.zzl(this, zzv);
        }
    }

    public final void zzs(long j2) {
        this.zzf = j2;
    }

    public final void zzt() {
        zzrz zzrzVar = this.zzd;
        if (zzrzVar != null) {
            zzsd zzsdVar = this.zzc;
            Objects.requireNonNull(zzsdVar);
            zzsdVar.zzB(zzrzVar);
        }
    }

    public final void zzu(zzsd zzsdVar) {
        zzcw.zzf(this.zzc == null);
        this.zzc = zzsdVar;
    }
}
