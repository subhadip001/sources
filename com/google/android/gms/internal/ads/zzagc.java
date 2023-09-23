package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzagc implements zzaga {
    private static final double[] zza = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private String zzb;
    private zzzz zzc;
    private final zzahp zzd;
    private final zzdy zze;
    private final zzagp zzf;
    private final boolean[] zzg;
    private final zzagb zzh;
    private long zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private boolean zzp;
    private boolean zzq;

    public zzagc() {
        this(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01e1  */
    @Override // com.google.android.gms.internal.ads.zzaga
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(com.google.android.gms.internal.ads.zzdy r20) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagc.zza(com.google.android.gms.internal.ads.zzdy):void");
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzb(zzyv zzyvVar, zzahm zzahmVar) {
        zzahmVar.zzc();
        this.zzb = zzahmVar.zzb();
        this.zzc = zzyvVar.zzv(zzahmVar.zza(), 2);
        zzahp zzahpVar = this.zzd;
        if (zzahpVar != null) {
            zzahpVar.zzb(zzyvVar, zzahmVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzd(long j2, int i2) {
        this.zzm = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zze() {
        zzzp.zze(this.zzg);
        this.zzh.zzb();
        zzagp zzagpVar = this.zzf;
        if (zzagpVar != null) {
            zzagpVar.zzb();
        }
        this.zzi = 0L;
        this.zzj = false;
        this.zzm = -9223372036854775807L;
        this.zzo = -9223372036854775807L;
    }

    public zzagc(zzahp zzahpVar) {
        zzdy zzdyVar;
        this.zzd = zzahpVar;
        this.zzg = new boolean[4];
        this.zzh = new zzagb(128);
        if (zzahpVar != null) {
            this.zzf = new zzagp(178, 128);
            zzdyVar = new zzdy();
        } else {
            zzdyVar = null;
            this.zzf = null;
        }
        this.zze = zzdyVar;
        this.zzm = -9223372036854775807L;
        this.zzo = -9223372036854775807L;
    }
}
