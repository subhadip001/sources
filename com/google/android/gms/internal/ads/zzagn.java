package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzagn implements zzaga {
    private final String zza;
    private final zzdy zzb;
    private final zzdx zzc;
    private zzzz zzd;
    private String zze;
    private zzad zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private long zzk;
    private boolean zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private boolean zzp;
    private long zzq;
    private int zzr;
    private long zzs;
    private int zzt;
    private String zzu;

    public zzagn(String str) {
        this.zza = str;
        zzdy zzdyVar = new zzdy(1024);
        this.zzb = zzdyVar;
        byte[] zzH = zzdyVar.zzH();
        this.zzc = new zzdx(zzH, zzH.length);
        this.zzk = -9223372036854775807L;
    }

    private final int zzf(zzdx zzdxVar) {
        int zza = zzdxVar.zza();
        zzxt zzb = zzxu.zzb(zzdxVar, true);
        this.zzu = zzb.zzc;
        this.zzr = zzb.zza;
        this.zzt = zzb.zzb;
        return zza - zzdxVar.zza();
    }

    private static long zzg(zzdx zzdxVar) {
        return zzdxVar.zzc((zzdxVar.zzc(2) + 1) * 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0154, code lost:
        if (r14.zzl == false) goto L105;
     */
    @Override // com.google.android.gms.internal.ads.zzaga
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(com.google.android.gms.internal.ads.zzdy r15) {
        /*
            Method dump skipped, instructions count: 537
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagn.zza(com.google.android.gms.internal.ads.zzdy):void");
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzb(zzyv zzyvVar, zzahm zzahmVar) {
        zzahmVar.zzc();
        this.zzd = zzyvVar.zzv(zzahmVar.zza(), 1);
        this.zze = zzahmVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzd(long j2, int i2) {
        if (j2 != -9223372036854775807L) {
            this.zzk = j2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zze() {
        this.zzg = 0;
        this.zzk = -9223372036854775807L;
        this.zzl = false;
    }
}
