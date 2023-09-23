package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzago implements zzaga {
    private final zzdy zza;
    private final zzzl zzb;
    private final String zzc;
    private zzzz zzd;
    private String zze;
    private int zzf;
    private int zzg;
    private boolean zzh;
    private boolean zzi;
    private long zzj;
    private int zzk;
    private long zzl;

    public zzago() {
        this(null);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zza(zzdy zzdyVar) {
        zzzl zzzlVar;
        zzcw.zzb(this.zzd);
        while (zzdyVar.zza() > 0) {
            int i2 = this.zzf;
            if (i2 == 0) {
                byte[] zzH = zzdyVar.zzH();
                int zzc = zzdyVar.zzc();
                int zzd = zzdyVar.zzd();
                while (true) {
                    if (zzc < zzd) {
                        byte b = zzH[zzc];
                        boolean z = (b & 255) == 255;
                        boolean z2 = this.zzi && (b & 224) == 224;
                        this.zzi = z;
                        if (z2) {
                            zzdyVar.zzF(zzc + 1);
                            this.zzi = false;
                            this.zza.zzH()[1] = zzH[zzc];
                            this.zzg = 2;
                            this.zzf = 1;
                            break;
                        }
                        zzc++;
                    } else {
                        zzdyVar.zzF(zzd);
                        break;
                    }
                }
            } else if (i2 != 1) {
                int min = Math.min(zzdyVar.zza(), this.zzk - this.zzg);
                zzzx.zzb(this.zzd, zzdyVar, min);
                int i3 = this.zzg + min;
                this.zzg = i3;
                int i4 = this.zzk;
                if (i3 >= i4) {
                    long j2 = this.zzl;
                    if (j2 != -9223372036854775807L) {
                        this.zzd.zzs(j2, 1, i4, 0, null);
                        this.zzl += this.zzj;
                    }
                    this.zzg = 0;
                    this.zzf = 0;
                }
            } else {
                int min2 = Math.min(zzdyVar.zza(), 4 - this.zzg);
                zzdyVar.zzB(this.zza.zzH(), this.zzg, min2);
                int i5 = this.zzg + min2;
                this.zzg = i5;
                if (i5 >= 4) {
                    this.zza.zzF(0);
                    if (this.zzb.zza(this.zza.zze())) {
                        this.zzk = this.zzb.zzc;
                        if (!this.zzh) {
                            this.zzj = (zzzlVar.zzg * 1000000) / zzzlVar.zzd;
                            zzab zzabVar = new zzab();
                            zzabVar.zzH(this.zze);
                            zzabVar.zzS(this.zzb.zzb);
                            zzabVar.zzL(4096);
                            zzabVar.zzw(this.zzb.zze);
                            zzabVar.zzT(this.zzb.zzd);
                            zzabVar.zzK(this.zzc);
                            this.zzd.zzk(zzabVar.zzY());
                            this.zzh = true;
                        }
                        this.zza.zzF(0);
                        zzzx.zzb(this.zzd, this.zza, 4);
                        this.zzf = 2;
                    } else {
                        this.zzg = 0;
                        this.zzf = 1;
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzb(zzyv zzyvVar, zzahm zzahmVar) {
        zzahmVar.zzc();
        this.zze = zzahmVar.zzb();
        this.zzd = zzyvVar.zzv(zzahmVar.zza(), 1);
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
        this.zzi = false;
        this.zzl = -9223372036854775807L;
    }

    public zzago(String str) {
        this.zzf = 0;
        zzdy zzdyVar = new zzdy(4);
        this.zza = zzdyVar;
        zzdyVar.zzH()[0] = -1;
        this.zzb = new zzzl();
        this.zzl = -9223372036854775807L;
        this.zzc = str;
    }
}
