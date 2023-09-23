package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzrg implements zzrz, zzry {
    public final zzrz zza;
    public long zzb;
    private zzry zzc;
    private zzrf[] zzd = new zzrf[0];
    private long zze = 0;

    public zzrg(zzrz zzrzVar, boolean z, long j2, long j3) {
        this.zza = zzrzVar;
        this.zzb = j3;
    }

    @Override // com.google.android.gms.internal.ads.zzrz
    public final long zza(long j2, zzjx zzjxVar) {
        if (j2 != 0) {
            long zzr = zzeg.zzr(zzjxVar.zzf, 0L, j2);
            long j3 = zzjxVar.zzg;
            long j4 = this.zzb;
            long zzr2 = zzeg.zzr(j3, 0L, j4 == Long.MIN_VALUE ? Long.MAX_VALUE : j4 - j2);
            if (zzr != zzjxVar.zzf || zzr2 != zzjxVar.zzg) {
                zzjxVar = new zzjx(zzr, zzr2);
            }
            return this.zza.zza(j2, zzjxVar);
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzrz, com.google.android.gms.internal.ads.zztt
    public final long zzb() {
        long zzb = this.zza.zzb();
        if (zzb != Long.MIN_VALUE) {
            long j2 = this.zzb;
            if (j2 == Long.MIN_VALUE || zzb < j2) {
                return zzb;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzrz, com.google.android.gms.internal.ads.zztt
    public final long zzc() {
        long zzc = this.zza.zzc();
        if (zzc != Long.MIN_VALUE) {
            long j2 = this.zzb;
            if (j2 == Long.MIN_VALUE || zzc < j2) {
                return zzc;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzrz
    public final long zzd() {
        if (zzq()) {
            long j2 = this.zze;
            this.zze = -9223372036854775807L;
            long zzd = zzd();
            return zzd != -9223372036854775807L ? zzd : j2;
        }
        long zzd2 = this.zza.zzd();
        if (zzd2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z = false;
        zzcw.zzf(zzd2 >= 0);
        long j3 = this.zzb;
        zzcw.zzf((j3 == Long.MIN_VALUE || zzd2 <= j3) ? true : true);
        return zzd2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
        if (r0 > r8) goto L18;
     */
    @Override // com.google.android.gms.internal.ads.zzrz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long zze(long r8) {
        /*
            r7 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.zze = r0
            com.google.android.gms.internal.ads.zzrf[] r0 = r7.zzd
            int r1 = r0.length
            r2 = 0
            r3 = 0
        Lc:
            if (r3 >= r1) goto L18
            r4 = r0[r3]
            if (r4 == 0) goto L15
            r4.zzc()
        L15:
            int r3 = r3 + 1
            goto Lc
        L18:
            com.google.android.gms.internal.ads.zzrz r0 = r7.zza
            long r0 = r0.zze(r8)
            r3 = 1
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 == 0) goto L35
            r8 = 0
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 < 0) goto L36
            long r8 = r7.zzb
            r4 = -9223372036854775808
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 == 0) goto L35
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 > 0) goto L36
        L35:
            r2 = 1
        L36:
            com.google.android.gms.internal.ads.zzcw.zzf(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzrg.zze(long):long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
        if (r4 > r7) goto L24;
     */
    @Override // com.google.android.gms.internal.ads.zzrz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long zzf(com.google.android.gms.internal.ads.zzvh[] r15, boolean[] r16, com.google.android.gms.internal.ads.zztr[] r17, boolean[] r18, long r19) {
        /*
            r14 = this;
            r0 = r14
            r1 = r17
            int r2 = r1.length
            com.google.android.gms.internal.ads.zzrf[] r3 = new com.google.android.gms.internal.ads.zzrf[r2]
            r0.zzd = r3
            com.google.android.gms.internal.ads.zztr[] r2 = new com.google.android.gms.internal.ads.zztr[r2]
            r3 = 0
            r4 = 0
        Lc:
            int r5 = r1.length
            r11 = 0
            if (r4 >= r5) goto L21
            com.google.android.gms.internal.ads.zzrf[] r5 = r0.zzd
            r6 = r1[r4]
            com.google.android.gms.internal.ads.zzrf r6 = (com.google.android.gms.internal.ads.zzrf) r6
            r5[r4] = r6
            if (r6 == 0) goto L1c
            com.google.android.gms.internal.ads.zztr r11 = r6.zza
        L1c:
            r2[r4] = r11
            int r4 = r4 + 1
            goto Lc
        L21:
            com.google.android.gms.internal.ads.zzrz r4 = r0.zza
            r5 = r15
            r6 = r16
            r7 = r2
            r8 = r18
            r9 = r19
            long r4 = r4.zzf(r5, r6, r7, r8, r9)
            boolean r6 = r14.zzq()
            r7 = 0
            if (r6 == 0) goto L3d
            int r6 = (r19 > r7 ? 1 : (r19 == r7 ? 0 : -1))
            if (r6 != 0) goto L3d
            r9 = r7
            goto L3f
        L3d:
            r9 = r19
        L3f:
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.zze = r12
            r6 = 1
            int r12 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r12 == 0) goto L5d
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 < 0) goto L5c
            long r7 = r0.zzb
            r9 = -9223372036854775808
            int r12 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r12 == 0) goto L5d
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 > 0) goto L5c
            goto L5d
        L5c:
            r6 = 0
        L5d:
            com.google.android.gms.internal.ads.zzcw.zzf(r6)
        L60:
            int r6 = r1.length
            if (r3 >= r6) goto L86
            r6 = r2[r3]
            if (r6 != 0) goto L6c
            com.google.android.gms.internal.ads.zzrf[] r6 = r0.zzd
            r6[r3] = r11
            goto L7d
        L6c:
            com.google.android.gms.internal.ads.zzrf[] r7 = r0.zzd
            r8 = r7[r3]
            if (r8 == 0) goto L76
            com.google.android.gms.internal.ads.zztr r8 = r8.zza
            if (r8 == r6) goto L7d
        L76:
            com.google.android.gms.internal.ads.zzrf r8 = new com.google.android.gms.internal.ads.zzrf
            r8.<init>(r14, r6)
            r7[r3] = r8
        L7d:
            com.google.android.gms.internal.ads.zzrf[] r6 = r0.zzd
            r6 = r6[r3]
            r1[r3] = r6
            int r3 = r3 + 1
            goto L60
        L86:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzrg.zzf(com.google.android.gms.internal.ads.zzvh[], boolean[], com.google.android.gms.internal.ads.zztr[], boolean[], long):long");
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
        this.zza.zzj(j2, false);
    }

    @Override // com.google.android.gms.internal.ads.zzrz
    public final void zzk() {
        this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzrz
    public final void zzl(zzry zzryVar, long j2) {
        this.zzc = zzryVar;
        this.zza.zzl(this, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzrz, com.google.android.gms.internal.ads.zztt
    public final void zzm(long j2) {
        this.zza.zzm(j2);
    }

    public final void zzn(long j2, long j3) {
        this.zzb = j3;
    }

    @Override // com.google.android.gms.internal.ads.zzrz, com.google.android.gms.internal.ads.zztt
    public final boolean zzo(long j2) {
        return this.zza.zzo(j2);
    }

    @Override // com.google.android.gms.internal.ads.zzrz, com.google.android.gms.internal.ads.zztt
    public final boolean zzp() {
        return this.zza.zzp();
    }

    public final boolean zzq() {
        return this.zze != -9223372036854775807L;
    }
}
