package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzrw extends zzrk {
    private final zzsd zza;
    private final boolean zzb;
    private final zzch zzc;
    private final zzcf zzd;
    private zzru zze;
    private zzrt zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    public zzrw(zzsd zzsdVar, boolean z) {
        boolean z2;
        this.zza = zzsdVar;
        if (z) {
            zzsdVar.zzu();
            z2 = true;
        } else {
            z2 = false;
        }
        this.zzb = z2;
        this.zzc = new zzch();
        this.zzd = new zzcf();
        zzsdVar.zzG();
        this.zze = zzru.zzq(zzsdVar.zzz());
    }

    private final Object zzE(Object obj) {
        Object obj2;
        Object obj3;
        obj2 = this.zze.zzf;
        if (obj2 == null || !obj.equals(zzru.zzd)) {
            return obj;
        }
        obj3 = this.zze.zzf;
        return obj3;
    }

    private final void zzF(long j2) {
        zzrt zzrtVar = this.zzf;
        int zza = this.zze.zza(zzrtVar.zza.zza);
        if (zza == -1) {
            return;
        }
        zzru zzruVar = this.zze;
        zzcf zzcfVar = this.zzd;
        zzruVar.zzd(zza, zzcfVar, false);
        long j3 = zzcfVar.zze;
        if (j3 != -9223372036854775807L && j2 >= j3) {
            j2 = Math.max(0L, j3 - 1);
        }
        zzrtVar.zzs(j2);
    }

    public final zzci zzA() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final void zzB(zzrz zzrzVar) {
        ((zzrt) zzrzVar).zzt();
        if (zzrzVar == this.zzf) {
            this.zzf = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    /* renamed from: zzC */
    public final zzrt zzD(zzsb zzsbVar, zzvw zzvwVar, long j2) {
        zzrt zzrtVar = new zzrt(zzsbVar, zzvwVar, j2, null);
        zzrtVar.zzu(this.zza);
        if (this.zzh) {
            zzrtVar.zzr(zzsbVar.zzc(zzE(zzsbVar.zza)));
        } else {
            this.zzf = zzrtVar;
            if (!this.zzg) {
                this.zzg = true;
                zzy(null, this.zza);
            }
        }
        return zzrtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzrk, com.google.android.gms.internal.ads.zzrc
    public final void zzn(zzft zzftVar) {
        super.zzn(zzftVar);
        if (this.zzb) {
            return;
        }
        this.zzg = true;
        zzy(null, this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzrk, com.google.android.gms.internal.ads.zzrc
    public final void zzq() {
        this.zzh = false;
        this.zzg = false;
        super.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzrk
    public final /* bridge */ /* synthetic */ zzsb zzv(Object obj, zzsb zzsbVar) {
        Object obj2;
        Object obj3;
        Void r2 = (Void) obj;
        Object obj4 = zzsbVar.zza;
        obj2 = this.zze.zzf;
        if (obj2 != null) {
            obj3 = this.zze.zzf;
            if (obj3.equals(obj4)) {
                obj4 = zzru.zzd;
            }
        }
        return zzsbVar.zzc(obj4);
    }

    @Override // com.google.android.gms.internal.ads.zzrk, com.google.android.gms.internal.ads.zzsd
    public final void zzw() {
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
    @Override // com.google.android.gms.internal.ads.zzrk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ /* synthetic */ void zzx(java.lang.Object r13, com.google.android.gms.internal.ads.zzsd r14, com.google.android.gms.internal.ads.zzci r15) {
        /*
            r12 = this;
            java.lang.Void r13 = (java.lang.Void) r13
            boolean r13 = r12.zzh
            r14 = 0
            if (r13 == 0) goto L1c
            com.google.android.gms.internal.ads.zzru r13 = r12.zze
            com.google.android.gms.internal.ads.zzru r13 = r13.zzp(r15)
            r12.zze = r13
            com.google.android.gms.internal.ads.zzrt r13 = r12.zzf
            if (r13 == 0) goto L9d
            long r0 = r13.zzn()
            r12.zzF(r0)
            goto L9d
        L1c:
            boolean r13 = r15.zzo()
            if (r13 == 0) goto L38
            boolean r13 = r12.zzi
            if (r13 == 0) goto L2d
            com.google.android.gms.internal.ads.zzru r13 = r12.zze
            com.google.android.gms.internal.ads.zzru r13 = r13.zzp(r15)
            goto L35
        L2d:
            java.lang.Object r13 = com.google.android.gms.internal.ads.zzch.zza
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzru.zzd
            com.google.android.gms.internal.ads.zzru r13 = com.google.android.gms.internal.ads.zzru.zzr(r15, r13, r0)
        L35:
            r12.zze = r13
            goto L9d
        L38:
            com.google.android.gms.internal.ads.zzch r13 = r12.zzc
            r0 = 0
            r1 = 0
            r15.zze(r0, r13, r1)
            com.google.android.gms.internal.ads.zzch r13 = r12.zzc
            java.lang.Object r13 = r13.zzc
            com.google.android.gms.internal.ads.zzrt r3 = r12.zzf
            if (r3 == 0) goto L64
            long r4 = r3.zzq()
            com.google.android.gms.internal.ads.zzru r6 = r12.zze
            com.google.android.gms.internal.ads.zzsb r3 = r3.zza
            java.lang.Object r3 = r3.zza
            com.google.android.gms.internal.ads.zzcf r7 = r12.zzd
            r6.zzn(r3, r7)
            com.google.android.gms.internal.ads.zzru r3 = r12.zze
            com.google.android.gms.internal.ads.zzch r6 = r12.zzc
            r3.zze(r0, r6, r1)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L64
            r10 = r4
            goto L65
        L64:
            r10 = r1
        L65:
            com.google.android.gms.internal.ads.zzch r7 = r12.zzc
            com.google.android.gms.internal.ads.zzcf r8 = r12.zzd
            r9 = 0
            r6 = r15
            android.util.Pair r0 = r6.zzl(r7, r8, r9, r10)
            java.lang.Object r1 = r0.first
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = r0.longValue()
            boolean r0 = r12.zzi
            if (r0 == 0) goto L84
            com.google.android.gms.internal.ads.zzru r13 = r12.zze
            com.google.android.gms.internal.ads.zzru r13 = r13.zzp(r15)
            goto L88
        L84:
            com.google.android.gms.internal.ads.zzru r13 = com.google.android.gms.internal.ads.zzru.zzr(r15, r13, r1)
        L88:
            r12.zze = r13
            com.google.android.gms.internal.ads.zzrt r13 = r12.zzf
            if (r13 == 0) goto L9d
            r12.zzF(r2)
            com.google.android.gms.internal.ads.zzsb r13 = r13.zza
            java.lang.Object r14 = r13.zza
            java.lang.Object r14 = r12.zzE(r14)
            com.google.android.gms.internal.ads.zzsb r14 = r13.zzc(r14)
        L9d:
            r13 = 1
            r12.zzi = r13
            r12.zzh = r13
            com.google.android.gms.internal.ads.zzru r13 = r12.zze
            r12.zzo(r13)
            if (r14 == 0) goto Lb1
            com.google.android.gms.internal.ads.zzrt r13 = r12.zzf
            java.util.Objects.requireNonNull(r13)
            r13.zzr(r14)
        Lb1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzrw.zzx(java.lang.Object, com.google.android.gms.internal.ads.zzsd, com.google.android.gms.internal.ads.zzci):void");
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final zzbb zzz() {
        return this.zza.zzz();
    }
}
