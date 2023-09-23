package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgmc implements zzgmr {
    private final zzgly zza;
    private final zzgni zzb;
    private final boolean zzc;
    private final zzgkb zzd;

    private zzgmc(zzgni zzgniVar, zzgkb zzgkbVar, zzgly zzglyVar) {
        this.zzb = zzgniVar;
        this.zzc = zzgkbVar.zzh(zzglyVar);
        this.zzd = zzgkbVar;
        this.zza = zzglyVar;
    }

    public static zzgmc zzc(zzgni zzgniVar, zzgkb zzgkbVar, zzgly zzglyVar) {
        return new zzgmc(zzgniVar, zzgkbVar, zzglyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgmr
    public final int zza(Object obj) {
        zzgni zzgniVar = this.zzb;
        int zzb = zzgniVar.zzb(zzgniVar.zzd(obj));
        if (this.zzc) {
            this.zzd.zza(obj);
            throw null;
        }
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgmr
    public final int zzb(Object obj) {
        int hashCode = this.zzb.zzd(obj).hashCode();
        if (this.zzc) {
            this.zzd.zza(obj);
            throw null;
        }
        return hashCode;
    }

    @Override // com.google.android.gms.internal.ads.zzgmr
    public final Object zze() {
        return this.zza.zzaJ().zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzgmr
    public final void zzf(Object obj) {
        this.zzb.zzm(obj);
        this.zzd.zze(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgmr
    public final void zzg(Object obj, Object obj2) {
        zzgmt.zzF(this.zzb, obj, obj2);
        if (this.zzc) {
            zzgmt.zzE(this.zzd, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgmr
    public final void zzh(Object obj, zzgmj zzgmjVar, zzgka zzgkaVar) {
        boolean zzO;
        zzgni zzgniVar = this.zzb;
        zzgkb zzgkbVar = this.zzd;
        Object zzc = zzgniVar.zzc(obj);
        zzgkf zzb = zzgkbVar.zzb(obj);
        while (zzgmjVar.zzc() != Integer.MAX_VALUE) {
            try {
                int zzd = zzgmjVar.zzd();
                if (zzd != 11) {
                    if ((zzd & 7) == 2) {
                        Object zzc2 = zzgkbVar.zzc(zzgkaVar, this.zza, zzd >>> 3);
                        if (zzc2 != null) {
                            zzgkbVar.zzf(zzgmjVar, zzc2, zzgkaVar, zzb);
                        } else {
                            zzO = zzgniVar.zzp(zzc, zzgmjVar);
                        }
                    } else {
                        zzO = zzgmjVar.zzO();
                    }
                    if (!zzO) {
                        return;
                    }
                } else {
                    int i2 = 0;
                    Object obj2 = null;
                    zzgjg zzgjgVar = null;
                    while (zzgmjVar.zzc() != Integer.MAX_VALUE) {
                        int zzd2 = zzgmjVar.zzd();
                        if (zzd2 == 16) {
                            i2 = zzgmjVar.zzj();
                            obj2 = zzgkbVar.zzc(zzgkaVar, this.zza, i2);
                        } else if (zzd2 == 26) {
                            if (obj2 != null) {
                                zzgkbVar.zzf(zzgmjVar, obj2, zzgkaVar, zzb);
                            } else {
                                zzgjgVar = zzgmjVar.zzp();
                            }
                        } else if (!zzgmjVar.zzO()) {
                            break;
                        }
                    }
                    if (zzgmjVar.zzd() != 12) {
                        throw zzgla.zzb();
                    } else if (zzgjgVar != null) {
                        if (obj2 != null) {
                            zzgkbVar.zzg(zzgjgVar, obj2, zzgkaVar, zzb);
                        } else {
                            zzgniVar.zzk(zzc, i2, zzgjgVar);
                        }
                    }
                }
            } finally {
                zzgniVar.zzn(obj, zzc);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgmr
    public final void zzi(Object obj, byte[] bArr, int i2, int i3, zzgis zzgisVar) {
        zzgko zzgkoVar = (zzgko) obj;
        if (zzgkoVar.zzc == zzgnj.zzc()) {
            zzgkoVar.zzc = zzgnj.zze();
        }
        zzgkl zzgklVar = (zzgkl) obj;
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgmr
    public final boolean zzj(Object obj, Object obj2) {
        if (this.zzb.zzd(obj).equals(this.zzb.zzd(obj2))) {
            if (this.zzc) {
                this.zzd.zza(obj);
                this.zzd.zza(obj2);
                throw null;
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgmr
    public final boolean zzk(Object obj) {
        this.zzd.zza(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgmr
    public final void zzn(Object obj, zzgjw zzgjwVar) {
        this.zzd.zza(obj);
        throw null;
    }
}
