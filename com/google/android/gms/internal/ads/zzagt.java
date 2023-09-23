package com.google.android.gms.internal.ads;

import com.google.firebase.inappmessaging.display.FirebaseInAppMessagingDisplay;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzagt implements zzyh {
    private final zzee zza;
    private final zzdy zzb = new zzdy();

    public /* synthetic */ zzagt(zzee zzeeVar, zzags zzagsVar) {
        this.zza = zzeeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzyh
    public final zzyg zza(zzyt zzytVar, long j2) {
        int zzh;
        long j3;
        long zzf = zzytVar.zzf();
        int min = (int) Math.min((long) FirebaseInAppMessagingDisplay.DISMISS_THRESHOLD_MILLIS, zzytVar.zzd() - zzf);
        this.zzb.zzC(min);
        ((zzym) zzytVar).zzm(this.zzb.zzH(), 0, min, false);
        zzdy zzdyVar = this.zzb;
        int i2 = -1;
        long j4 = -9223372036854775807L;
        int i3 = -1;
        while (zzdyVar.zza() >= 4) {
            if (zzagu.zzh(zzdyVar.zzH(), zzdyVar.zzc()) != 442) {
                zzdyVar.zzG(1);
            } else {
                zzdyVar.zzG(4);
                long zzc = zzagv.zzc(zzdyVar);
                if (zzc != -9223372036854775807L) {
                    long zzb = this.zza.zzb(zzc);
                    if (zzb > j2) {
                        if (j4 == -9223372036854775807L) {
                            return zzyg.zzd(zzb, zzf);
                        }
                        j3 = i3;
                    } else if (100000 + zzb > j2) {
                        j3 = zzdyVar.zzc();
                    } else {
                        i3 = zzdyVar.zzc();
                        j4 = zzb;
                    }
                    return zzyg.zze(zzf + j3);
                }
                int zzd = zzdyVar.zzd();
                if (zzdyVar.zza() < 10) {
                    zzdyVar.zzF(zzd);
                } else {
                    zzdyVar.zzG(9);
                    int zzk = zzdyVar.zzk() & 7;
                    if (zzdyVar.zza() < zzk) {
                        zzdyVar.zzF(zzd);
                    } else {
                        zzdyVar.zzG(zzk);
                        if (zzdyVar.zza() < 4) {
                            zzdyVar.zzF(zzd);
                        } else {
                            if (zzagu.zzh(zzdyVar.zzH(), zzdyVar.zzc()) == 443) {
                                zzdyVar.zzG(4);
                                int zzo = zzdyVar.zzo();
                                if (zzdyVar.zza() < zzo) {
                                    zzdyVar.zzF(zzd);
                                } else {
                                    zzdyVar.zzG(zzo);
                                }
                            }
                            while (true) {
                                if (zzdyVar.zza() < 4 || (zzh = zzagu.zzh(zzdyVar.zzH(), zzdyVar.zzc())) == 442 || zzh == 441 || (zzh >>> 8) != 1) {
                                    break;
                                }
                                zzdyVar.zzG(4);
                                if (zzdyVar.zza() < 2) {
                                    zzdyVar.zzF(zzd);
                                    break;
                                }
                                zzdyVar.zzF(Math.min(zzdyVar.zzd(), zzdyVar.zzc() + zzdyVar.zzo()));
                            }
                        }
                    }
                }
                i2 = zzdyVar.zzc();
            }
        }
        return j4 != -9223372036854775807L ? zzyg.zzf(j4, zzf + i2) : zzyg.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzyh
    public final void zzb() {
        zzdy zzdyVar = this.zzb;
        byte[] bArr = zzeg.zzf;
        int length = bArr.length;
        zzdyVar.zzD(bArr, 0);
    }
}
