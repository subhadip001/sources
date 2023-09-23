package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzagf implements zzaga {
    private static final float[] zza = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    private final zzahp zzb;
    private final zzdy zzc;
    private final boolean[] zzd;
    private final zzagd zze;
    private final zzagp zzf;
    private zzage zzg;
    private long zzh;
    private String zzi;
    private zzzz zzj;
    private boolean zzk;
    private long zzl;

    public zzagf() {
        this(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ce A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzaga
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(com.google.android.gms.internal.ads.zzdy r19) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagf.zza(com.google.android.gms.internal.ads.zzdy):void");
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzb(zzyv zzyvVar, zzahm zzahmVar) {
        zzahmVar.zzc();
        this.zzi = zzahmVar.zzb();
        zzzz zzv = zzyvVar.zzv(zzahmVar.zza(), 2);
        this.zzj = zzv;
        this.zzg = new zzage(zzv);
        this.zzb.zzb(zzyvVar, zzahmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzd(long j2, int i2) {
        if (j2 != -9223372036854775807L) {
            this.zzl = j2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zze() {
        zzzp.zze(this.zzd);
        this.zze.zzb();
        zzage zzageVar = this.zzg;
        if (zzageVar != null) {
            zzageVar.zzd();
        }
        this.zzf.zzb();
        this.zzh = 0L;
        this.zzl = -9223372036854775807L;
    }

    public zzagf(zzahp zzahpVar) {
        this.zzb = zzahpVar;
        this.zzd = new boolean[4];
        this.zze = new zzagd(128);
        this.zzl = -9223372036854775807L;
        this.zzf = new zzagp(178, 128);
        this.zzc = new zzdy();
    }
}
