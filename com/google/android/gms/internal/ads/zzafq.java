package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzafq implements zzaga {
    private final zzdx zza;
    private final zzdy zzb;
    private final String zzc;
    private String zzd;
    private zzzz zze;
    private int zzf;
    private int zzg;
    private boolean zzh;
    private long zzi;
    private zzad zzj;
    private int zzk;
    private long zzl;

    public zzafq() {
        this(null);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zza(zzdy zzdyVar) {
        zzcw.zzb(this.zze);
        while (zzdyVar.zza() > 0) {
            int i2 = this.zzf;
            if (i2 == 0) {
                while (true) {
                    if (zzdyVar.zza() <= 0) {
                        break;
                    } else if (!this.zzh) {
                        this.zzh = zzdyVar.zzk() == 11;
                    } else {
                        int zzk = zzdyVar.zzk();
                        if (zzk == 119) {
                            this.zzh = false;
                            this.zzf = 1;
                            zzdy zzdyVar2 = this.zzb;
                            zzdyVar2.zzH()[0] = 11;
                            zzdyVar2.zzH()[1] = 119;
                            this.zzg = 2;
                            break;
                        }
                        this.zzh = zzk == 11;
                    }
                }
            } else if (i2 != 1) {
                int min = Math.min(zzdyVar.zza(), this.zzk - this.zzg);
                zzzx.zzb(this.zze, zzdyVar, min);
                int i3 = this.zzg + min;
                this.zzg = i3;
                int i4 = this.zzk;
                if (i3 == i4) {
                    long j2 = this.zzl;
                    if (j2 != -9223372036854775807L) {
                        this.zze.zzs(j2, 1, i4, 0, null);
                        this.zzl += this.zzi;
                    }
                    this.zzf = 0;
                }
            } else {
                byte[] zzH = this.zzb.zzH();
                int min2 = Math.min(zzdyVar.zza(), 128 - this.zzg);
                zzdyVar.zzB(zzH, this.zzg, min2);
                int i5 = this.zzg + min2;
                this.zzg = i5;
                if (i5 == 128) {
                    this.zza.zzh(0);
                    zzxw zze = zzxx.zze(this.zza);
                    zzad zzadVar = this.zzj;
                    if (zzadVar == null || zze.zzc != zzadVar.zzz || zze.zzb != zzadVar.zzA || !zzeg.zzS(zze.zza, zzadVar.zzm)) {
                        zzab zzabVar = new zzab();
                        zzabVar.zzH(this.zzd);
                        zzabVar.zzS(zze.zza);
                        zzabVar.zzw(zze.zzc);
                        zzabVar.zzT(zze.zzb);
                        zzabVar.zzK(this.zzc);
                        zzad zzY = zzabVar.zzY();
                        this.zzj = zzY;
                        this.zze.zzk(zzY);
                    }
                    this.zzk = zze.zzd;
                    this.zzi = (zze.zze * 1000000) / this.zzj.zzA;
                    this.zzb.zzF(0);
                    zzzx.zzb(this.zze, this.zzb, 128);
                    this.zzf = 2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzb(zzyv zzyvVar, zzahm zzahmVar) {
        zzahmVar.zzc();
        this.zzd = zzahmVar.zzb();
        this.zze = zzyvVar.zzv(zzahmVar.zza(), 1);
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
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = false;
        this.zzl = -9223372036854775807L;
    }

    public zzafq(String str) {
        zzdx zzdxVar = new zzdx(new byte[128], 128);
        this.zza = zzdxVar;
        this.zzb = new zzdy(zzdxVar.zza);
        this.zzf = 0;
        this.zzl = -9223372036854775807L;
        this.zzc = str;
    }
}
