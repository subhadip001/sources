package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzagl implements zzaga {
    private final zzahb zza;
    private String zzb;
    private zzzz zzc;
    private zzagk zzd;
    private boolean zze;
    private long zzl;
    private final boolean[] zzf = new boolean[3];
    private final zzagp zzg = new zzagp(32, 128);
    private final zzagp zzh = new zzagp(33, 128);
    private final zzagp zzi = new zzagp(34, 128);
    private final zzagp zzj = new zzagp(39, 128);
    private final zzagp zzk = new zzagp(40, 128);
    private long zzm = -9223372036854775807L;
    private final zzdy zzn = new zzdy();

    public zzagl(zzahb zzahbVar) {
        this.zza = zzahbVar;
    }

    private final void zzf(byte[] bArr, int i2, int i3) {
        this.zzd.zzb(bArr, i2, i3);
        if (!this.zze) {
            this.zzg.zza(bArr, i2, i3);
            this.zzh.zza(bArr, i2, i3);
            this.zzi.zza(bArr, i2, i3);
        }
        this.zzj.zza(bArr, i2, i3);
        this.zzk.zza(bArr, i2, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:156:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0169  */
    @Override // com.google.android.gms.internal.ads.zzaga
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(com.google.android.gms.internal.ads.zzdy r33) {
        /*
            Method dump skipped, instructions count: 962
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagl.zza(com.google.android.gms.internal.ads.zzdy):void");
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzb(zzyv zzyvVar, zzahm zzahmVar) {
        zzahmVar.zzc();
        this.zzb = zzahmVar.zzb();
        zzzz zzv = zzyvVar.zzv(zzahmVar.zza(), 2);
        this.zzc = zzv;
        this.zzd = new zzagk(zzv);
        this.zza.zzb(zzyvVar, zzahmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzd(long j2, int i2) {
        if (j2 != -9223372036854775807L) {
            this.zzm = j2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zze() {
        this.zzl = 0L;
        this.zzm = -9223372036854775807L;
        zzzp.zze(this.zzf);
        this.zzg.zzb();
        this.zzh.zzb();
        this.zzi.zzb();
        this.zzj.zzb();
        this.zzk.zzb();
        zzagk zzagkVar = this.zzd;
        if (zzagkVar != null) {
            zzagkVar.zzc();
        }
    }
}
