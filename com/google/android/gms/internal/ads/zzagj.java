package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzagj implements zzaga {
    private final zzahb zza;
    private long zze;
    private String zzg;
    private zzzz zzh;
    private zzagi zzi;
    private boolean zzj;
    private boolean zzl;
    private final boolean[] zzf = new boolean[3];
    private final zzagp zzb = new zzagp(7, 128);
    private final zzagp zzc = new zzagp(8, 128);
    private final zzagp zzd = new zzagp(6, 128);
    private long zzk = -9223372036854775807L;
    private final zzdy zzm = new zzdy();

    public zzagj(zzahb zzahbVar, boolean z, boolean z2) {
        this.zza = zzahbVar;
    }

    private final void zzf(byte[] bArr, int i2, int i3) {
        if (!this.zzj) {
            this.zzb.zza(bArr, i2, i3);
            this.zzc.zza(bArr, i2, i3);
        }
        this.zzd.zza(bArr, i2, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0181 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzaga
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(com.google.android.gms.internal.ads.zzdy r20) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagj.zza(com.google.android.gms.internal.ads.zzdy):void");
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzb(zzyv zzyvVar, zzahm zzahmVar) {
        zzahmVar.zzc();
        this.zzg = zzahmVar.zzb();
        zzzz zzv = zzyvVar.zzv(zzahmVar.zza(), 2);
        this.zzh = zzv;
        this.zzi = new zzagi(zzv, false, false);
        this.zza.zzb(zzyvVar, zzahmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzd(long j2, int i2) {
        if (j2 != -9223372036854775807L) {
            this.zzk = j2;
        }
        this.zzl |= (i2 & 2) != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zze() {
        this.zze = 0L;
        this.zzl = false;
        this.zzk = -9223372036854775807L;
        zzzp.zze(this.zzf);
        this.zzb.zzb();
        this.zzc.zzb();
        this.zzd.zzb();
        zzagi zzagiVar = this.zzi;
        if (zzagiVar != null) {
            zzagiVar.zzc();
        }
    }
}
