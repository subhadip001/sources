package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzsp implements zzrz, zzry {
    private final zzrz zza;
    private final long zzb;
    private zzry zzc;

    public zzsp(zzrz zzrzVar, long j2) {
        this.zza = zzrzVar;
        this.zzb = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzrz
    public final long zza(long j2, zzjx zzjxVar) {
        return this.zza.zza(j2 - this.zzb, zzjxVar) + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzrz, com.google.android.gms.internal.ads.zztt
    public final long zzb() {
        long zzb = this.zza.zzb();
        if (zzb == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return zzb + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzrz, com.google.android.gms.internal.ads.zztt
    public final long zzc() {
        long zzc = this.zza.zzc();
        if (zzc == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return zzc + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzrz
    public final long zzd() {
        long zzd = this.zza.zzd();
        if (zzd == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return zzd + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzrz
    public final long zze(long j2) {
        return this.zza.zze(j2 - this.zzb) + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzrz
    public final long zzf(zzvh[] zzvhVarArr, boolean[] zArr, zztr[] zztrVarArr, boolean[] zArr2, long j2) {
        zztr[] zztrVarArr2 = new zztr[zztrVarArr.length];
        int i2 = 0;
        while (true) {
            zztr zztrVar = null;
            if (i2 >= zztrVarArr.length) {
                break;
            }
            zzsq zzsqVar = (zzsq) zztrVarArr[i2];
            if (zzsqVar != null) {
                zztrVar = zzsqVar.zzc();
            }
            zztrVarArr2[i2] = zztrVar;
            i2++;
        }
        long zzf = this.zza.zzf(zzvhVarArr, zArr, zztrVarArr2, zArr2, j2 - this.zzb);
        for (int i3 = 0; i3 < zztrVarArr.length; i3++) {
            zztr zztrVar2 = zztrVarArr2[i3];
            if (zztrVar2 == null) {
                zztrVarArr[i3] = null;
            } else {
                zztr zztrVar3 = zztrVarArr[i3];
                if (zztrVar3 == null || ((zzsq) zztrVar3).zzc() != zztrVar2) {
                    zztrVarArr[i3] = new zzsq(zztrVar2, this.zzb);
                }
            }
        }
        return zzf + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzts
    public final /* bridge */ /* synthetic */ void zzg(zztt zzttVar) {
        zzrz zzrzVar = (zzrz) zzttVar;
        zzry zzryVar = this.zzc;
        Objects.requireNonNull(zzryVar);
        zzryVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzrz
    public final zztz zzh() {
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzry
    public final void zzi(zzrz zzrzVar) {
        zzry zzryVar = this.zzc;
        Objects.requireNonNull(zzryVar);
        zzryVar.zzi(this);
    }

    @Override // com.google.android.gms.internal.ads.zzrz
    public final void zzj(long j2, boolean z) {
        this.zza.zzj(j2 - this.zzb, false);
    }

    @Override // com.google.android.gms.internal.ads.zzrz
    public final void zzk() {
        this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzrz
    public final void zzl(zzry zzryVar, long j2) {
        this.zzc = zzryVar;
        this.zza.zzl(this, j2 - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzrz, com.google.android.gms.internal.ads.zztt
    public final void zzm(long j2) {
        this.zza.zzm(j2 - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzrz, com.google.android.gms.internal.ads.zztt
    public final boolean zzo(long j2) {
        return this.zza.zzo(j2 - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzrz, com.google.android.gms.internal.ads.zztt
    public final boolean zzp() {
        return this.zza.zzp();
    }
}
