package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzaan implements zzys {
    public static final zzyz zza = new zzyz() { // from class: com.google.android.gms.internal.ads.zzaam
        @Override // com.google.android.gms.internal.ads.zzyz
        public final zzys[] zza() {
            zzyz zzyzVar = zzaan.zza;
            return new zzys[]{new zzaan(0)};
        }

        @Override // com.google.android.gms.internal.ads.zzyz
        public final /* synthetic */ zzys[] zzb(Uri uri, Map map) {
            return zzyy.zza(this, uri, map);
        }
    };
    private final byte[] zzb;
    private final zzdy zzc;
    private final zzza zzd;
    private zzyv zze;
    private zzzz zzf;
    private int zzg;
    private zzbl zzh;
    private zzzf zzi;
    private int zzj;
    private int zzk;
    private zzaal zzl;
    private int zzm;
    private long zzn;

    public zzaan() {
        this(0);
    }

    public zzaan(int i2) {
        this.zzb = new byte[42];
        this.zzc = new zzdy(new byte[32768], 0);
        this.zzd = new zzza();
        this.zzg = 0;
    }

    private final long zze(zzdy zzdyVar, boolean z) {
        boolean z2;
        Objects.requireNonNull(this.zzi);
        int zzc = zzdyVar.zzc();
        while (zzc <= zzdyVar.zzd() - 16) {
            zzdyVar.zzF(zzc);
            if (zzzb.zzc(zzdyVar, this.zzi, this.zzk, this.zzd)) {
                zzdyVar.zzF(zzc);
                return this.zzd.zza;
            }
            zzc++;
        }
        if (z) {
            while (zzc <= zzdyVar.zzd() - this.zzj) {
                zzdyVar.zzF(zzc);
                try {
                    z2 = zzzb.zzc(zzdyVar, this.zzi, this.zzk, this.zzd);
                } catch (IndexOutOfBoundsException unused) {
                    z2 = false;
                }
                if (zzdyVar.zzc() <= zzdyVar.zzd() && z2) {
                    zzdyVar.zzF(zzc);
                    return this.zzd.zza;
                }
                zzc++;
            }
            zzdyVar.zzF(zzdyVar.zzd());
            return -1L;
        }
        zzdyVar.zzF(zzc);
        return -1L;
    }

    private final void zzf() {
        long j2 = this.zzn;
        zzzf zzzfVar = this.zzi;
        int i2 = zzeg.zza;
        this.zzf.zzs((j2 * 1000000) / zzzfVar.zze, 1, this.zzm, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final int zza(zzyt zzytVar, zzzs zzzsVar) {
        boolean zzl;
        zzzv zzzuVar;
        boolean z;
        int i2 = this.zzg;
        if (i2 == 0) {
            zzytVar.zzj();
            long zze = zzytVar.zze();
            zzbl zza2 = zzzc.zza(zzytVar, true);
            ((zzym) zzytVar).zzo((int) (zzytVar.zze() - zze), false);
            this.zzh = zza2;
            this.zzg = 1;
            return 0;
        } else if (i2 == 1) {
            ((zzym) zzytVar).zzm(this.zzb, 0, 42, false);
            zzytVar.zzj();
            this.zzg = 2;
            return 0;
        } else if (i2 == 2) {
            zzdy zzdyVar = new zzdy(4);
            ((zzym) zzytVar).zzn(zzdyVar.zzH(), 0, 4, false);
            if (zzdyVar.zzs() == 1716281667) {
                this.zzg = 3;
                return 0;
            }
            throw zzbp.zza("Failed to read FLAC stream marker.", null);
        } else if (i2 == 3) {
            zzzf zzzfVar = this.zzi;
            do {
                zzytVar.zzj();
                zzdx zzdxVar = new zzdx(new byte[4], 4);
                zzym zzymVar = (zzym) zzytVar;
                zzymVar.zzm(zzdxVar.zza, 0, 4, false);
                zzl = zzdxVar.zzl();
                int zzc = zzdxVar.zzc(7);
                int zzc2 = zzdxVar.zzc(24) + 4;
                if (zzc == 0) {
                    byte[] bArr = new byte[38];
                    zzymVar.zzn(bArr, 0, 38, false);
                    zzzfVar = new zzzf(bArr, 4);
                } else if (zzzfVar == null) {
                    throw new IllegalArgumentException();
                } else {
                    if (zzc == 3) {
                        zzdy zzdyVar2 = new zzdy(zzc2);
                        zzymVar.zzn(zzdyVar2.zzH(), 0, zzc2, false);
                        zzzfVar = zzzfVar.zzf(zzzc.zzb(zzdyVar2));
                    } else if (zzc == 4) {
                        zzdy zzdyVar3 = new zzdy(zzc2);
                        zzymVar.zzn(zzdyVar3.zzH(), 0, zzc2, false);
                        zzdyVar3.zzG(4);
                        zzzfVar = zzzfVar.zzg(Arrays.asList(zzaaf.zzc(zzdyVar3, false, false).zzb));
                    } else if (zzc == 6) {
                        zzdy zzdyVar4 = new zzdy(zzc2);
                        zzymVar.zzn(zzdyVar4.zzH(), 0, zzc2, false);
                        zzdyVar4.zzG(4);
                        zzzfVar = zzzfVar.zze(zzfrh.zzp(zzabh.zzb(zzdyVar4)));
                    } else {
                        zzymVar.zzo(zzc2, false);
                    }
                }
                int i3 = zzeg.zza;
                this.zzi = zzzfVar;
            } while (!zzl);
            Objects.requireNonNull(zzzfVar);
            this.zzj = Math.max(zzzfVar.zzc, 6);
            this.zzf.zzk(this.zzi.zzc(this.zzb, this.zzh));
            this.zzg = 4;
            return 0;
        } else if (i2 != 4) {
            Objects.requireNonNull(this.zzf);
            zzzf zzzfVar2 = this.zzi;
            Objects.requireNonNull(zzzfVar2);
            zzaal zzaalVar = this.zzl;
            if (zzaalVar == null || !zzaalVar.zze()) {
                if (this.zzn == -1) {
                    this.zzn = zzzb.zzb(zzytVar, zzzfVar2);
                    return 0;
                }
                zzdy zzdyVar5 = this.zzc;
                int zzd = zzdyVar5.zzd();
                if (zzd < 32768) {
                    int zza3 = zzytVar.zza(zzdyVar5.zzH(), zzd, 32768 - zzd);
                    z = zza3 == -1;
                    if (!z) {
                        this.zzc.zzE(zzd + zza3);
                    } else if (this.zzc.zza() == 0) {
                        zzf();
                        return -1;
                    }
                } else {
                    z = false;
                }
                zzdy zzdyVar6 = this.zzc;
                int zzc3 = zzdyVar6.zzc();
                int i4 = this.zzm;
                int i5 = this.zzj;
                if (i4 < i5) {
                    zzdyVar6.zzG(Math.min(i5 - i4, zzdyVar6.zza()));
                }
                long zze2 = zze(this.zzc, z);
                zzdy zzdyVar7 = this.zzc;
                int zzc4 = zzdyVar7.zzc() - zzc3;
                zzdyVar7.zzF(zzc3);
                zzzx.zzb(this.zzf, this.zzc, zzc4);
                this.zzm += zzc4;
                if (zze2 != -1) {
                    zzf();
                    this.zzm = 0;
                    this.zzn = zze2;
                }
                zzdy zzdyVar8 = this.zzc;
                if (zzdyVar8.zza() >= 16) {
                    return 0;
                }
                int zza4 = zzdyVar8.zza();
                System.arraycopy(zzdyVar8.zzH(), zzdyVar8.zzc(), zzdyVar8.zzH(), 0, zza4);
                this.zzc.zzF(0);
                this.zzc.zzE(zza4);
                return 0;
            }
            return zzaalVar.zza(zzytVar, zzzsVar);
        } else {
            zzytVar.zzj();
            zzdy zzdyVar9 = new zzdy(2);
            ((zzym) zzytVar).zzm(zzdyVar9.zzH(), 0, 2, false);
            int zzo = zzdyVar9.zzo();
            if ((zzo >> 2) == 16382) {
                zzytVar.zzj();
                this.zzk = zzo;
                zzyv zzyvVar = this.zze;
                int i6 = zzeg.zza;
                long zzf = zzytVar.zzf();
                long zzd2 = zzytVar.zzd();
                zzzf zzzfVar3 = this.zzi;
                Objects.requireNonNull(zzzfVar3);
                if (zzzfVar3.zzk != null) {
                    zzzuVar = new zzzd(zzzfVar3, zzf);
                } else if (zzd2 != -1 && zzzfVar3.zzj > 0) {
                    zzaal zzaalVar2 = new zzaal(zzzfVar3, this.zzk, zzf, zzd2);
                    this.zzl = zzaalVar2;
                    zzzuVar = zzaalVar2.zzb();
                } else {
                    zzzuVar = new zzzu(zzzfVar3.zza(), 0L);
                }
                zzyvVar.zzL(zzzuVar);
                this.zzg = 5;
                return 0;
            }
            zzytVar.zzj();
            throw zzbp.zza("First frame does not start with sync code.", null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final void zzb(zzyv zzyvVar) {
        this.zze = zzyvVar;
        this.zzf = zzyvVar.zzv(0, 1);
        zzyvVar.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final void zzc(long j2, long j3) {
        if (j2 == 0) {
            this.zzg = 0;
        } else {
            zzaal zzaalVar = this.zzl;
            if (zzaalVar != null) {
                zzaalVar.zzd(j3);
            }
        }
        this.zzn = j3 != 0 ? -1L : 0L;
        this.zzm = 0;
        this.zzc.zzC(0);
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final boolean zzd(zzyt zzytVar) {
        zzzc.zza(zzytVar, false);
        zzdy zzdyVar = new zzdy(4);
        ((zzym) zzytVar).zzm(zzdyVar.zzH(), 0, 4, false);
        return zzdyVar.zzs() == 1716281667;
    }
}
