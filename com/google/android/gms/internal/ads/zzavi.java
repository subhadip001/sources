package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Stack;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzavi implements zzatv, zzauc {
    public static final zzatx zza = new zzavg();
    private static final int zzb = zzazn.zzg("qt  ");
    private int zzg;
    private int zzh;
    private long zzi;
    private int zzj;
    private zzazg zzk;
    private int zzl;
    private int zzm;
    private zzatw zzn;
    private zzavh[] zzo;
    private long zzp;
    private boolean zzq;
    private final zzazg zze = new zzazg(16);
    private final Stack zzf = new Stack();
    private final zzazg zzc = new zzazg(zzaze.zza);
    private final zzazg zzd = new zzazg(4);

    private final void zzh() {
        this.zzg = 0;
        this.zzj = 0;
    }

    private final void zzi(long j2) {
        zzawd zzawdVar;
        zzatz zzatzVar;
        zzawd zzawdVar2;
        zzavk zza2;
        while (!this.zzf.isEmpty() && ((zzauq) this.zzf.peek()).zza == j2) {
            zzauq zzauqVar = (zzauq) this.zzf.pop();
            if (zzauqVar.zzaR == zzaus.zzE) {
                ArrayList arrayList = new ArrayList();
                zzatz zzatzVar2 = new zzatz();
                zzaur zzb2 = zzauqVar.zzb(zzaus.zzaC);
                if (zzb2 != null) {
                    zzawdVar = zzauz.zzc(zzb2, this.zzq);
                    if (zzawdVar != null) {
                        zzatzVar2.zzb(zzawdVar);
                    }
                } else {
                    zzawdVar = null;
                }
                long j3 = -9223372036854775807L;
                long j4 = Long.MAX_VALUE;
                int i2 = 0;
                while (i2 < zzauqVar.zzc.size()) {
                    zzauq zzauqVar2 = (zzauq) zzauqVar.zzc.get(i2);
                    if (zzauqVar2.zzaR == zzaus.zzG && (zza2 = zzauz.zza(zzauqVar2, zzauqVar.zzb(zzaus.zzF), -9223372036854775807L, null, this.zzq)) != null) {
                        zzavn zzb3 = zzauz.zzb(zza2, zzauqVar2.zza(zzaus.zzH).zza(zzaus.zzI).zza(zzaus.zzJ), zzatzVar2);
                        if (zzb3.zza != 0) {
                            zzavh zzavhVar = new zzavh(zza2, zzb3, this.zzn.zzbi(i2, zza2.zzb));
                            zzars zze = zza2.zzf.zze(zzb3.zzd + 30);
                            if (zza2.zzb == 1) {
                                if (zzatzVar2.zza()) {
                                    zze = zze.zzd(zzatzVar2.zzb, zzatzVar2.zzc);
                                }
                                if (zzawdVar != null) {
                                    zze = zze.zzf(zzawdVar);
                                }
                            }
                            zzavhVar.zzc.zza(zze);
                            zzatzVar = zzatzVar2;
                            zzawdVar2 = zzawdVar;
                            long max = Math.max(j3, zza2.zze);
                            arrayList.add(zzavhVar);
                            long j5 = zzb3.zzb[0];
                            if (j5 < j4) {
                                j3 = max;
                                j4 = j5;
                            } else {
                                j3 = max;
                            }
                            i2++;
                            zzatzVar2 = zzatzVar;
                            zzawdVar = zzawdVar2;
                        }
                    }
                    zzatzVar = zzatzVar2;
                    zzawdVar2 = zzawdVar;
                    i2++;
                    zzatzVar2 = zzatzVar;
                    zzawdVar = zzawdVar2;
                }
                this.zzp = j3;
                this.zzo = (zzavh[]) arrayList.toArray(new zzavh[arrayList.size()]);
                this.zzn.zzb();
                this.zzn.zzc(this);
                this.zzf.clear();
                this.zzg = 2;
            } else if (!this.zzf.isEmpty()) {
                ((zzauq) this.zzf.peek()).zzc(zzauqVar);
            }
        }
        if (this.zzg != 2) {
            zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauc
    public final long zza() {
        return this.zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzauc
    public final long zzb(long j2) {
        long j3 = Long.MAX_VALUE;
        for (zzavh zzavhVar : this.zzo) {
            zzavn zzavnVar = zzavhVar.zzb;
            int zza2 = zzavnVar.zza(j2);
            if (zza2 == -1) {
                zza2 = zzavnVar.zzb(j2);
            }
            long j4 = zzavnVar.zzb[zza2];
            if (j4 < j3) {
                j3 = j4;
            }
        }
        return j3;
    }

    @Override // com.google.android.gms.internal.ads.zzauc
    public final boolean zzc() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzatv
    public final void zzd(zzatw zzatwVar) {
        this.zzn = zzatwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzatv
    public final void zze(long j2, long j3) {
        this.zzf.clear();
        this.zzj = 0;
        this.zzl = 0;
        this.zzm = 0;
        if (j2 == 0) {
            zzh();
            return;
        }
        zzavh[] zzavhVarArr = this.zzo;
        if (zzavhVarArr != null) {
            for (zzavh zzavhVar : zzavhVarArr) {
                zzavn zzavnVar = zzavhVar.zzb;
                int zza2 = zzavnVar.zza(j3);
                if (zza2 == -1) {
                    zza2 = zzavnVar.zzb(j3);
                }
                zzavhVar.zzd = zza2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatv
    public final int zzf(zzatu zzatuVar, zzaua zzauaVar) {
        zzavh[] zzavhVarArr;
        boolean z;
        boolean z2;
        while (true) {
            int i2 = this.zzg;
            if (i2 == 0) {
                if (this.zzj == 0) {
                    if (!zzatuVar.zzh(this.zze.zza, 0, 8, true)) {
                        return -1;
                    }
                    this.zzj = 8;
                    this.zze.zzv(0);
                    this.zzi = this.zze.zzm();
                    this.zzh = this.zze.zze();
                }
                if (this.zzi == 1) {
                    zzatuVar.zzh(this.zze.zza, 8, 8, false);
                    this.zzj += 8;
                    this.zzi = this.zze.zzn();
                }
                int i3 = this.zzh;
                if (i3 != zzaus.zzE && i3 != zzaus.zzG && i3 != zzaus.zzH && i3 != zzaus.zzI && i3 != zzaus.zzJ && i3 != zzaus.zzS) {
                    if (i3 != zzaus.zzU && i3 != zzaus.zzF && i3 != zzaus.zzV && i3 != zzaus.zzW && i3 != zzaus.zzao && i3 != zzaus.zzap && i3 != zzaus.zzaq && i3 != zzaus.zzT && i3 != zzaus.zzar && i3 != zzaus.zzas && i3 != zzaus.zzat && i3 != zzaus.zzau && i3 != zzaus.zzav && i3 != zzaus.zzR && i3 != zzaus.zzd && i3 != zzaus.zzaC) {
                        this.zzk = null;
                    } else {
                        zzayy.zze(this.zzj == 8);
                        zzayy.zze(this.zzi <= 2147483647L);
                        zzazg zzazgVar = new zzazg((int) this.zzi);
                        this.zzk = zzazgVar;
                        System.arraycopy(this.zze.zza, 0, zzazgVar.zza, 0, 8);
                    }
                    this.zzg = 1;
                } else {
                    long zzd = (zzatuVar.zzd() + this.zzi) - this.zzj;
                    this.zzf.add(new zzauq(this.zzh, zzd));
                    if (this.zzi == this.zzj) {
                        zzi(zzd);
                    } else {
                        zzh();
                    }
                }
            } else if (i2 != 1) {
                long j2 = Long.MAX_VALUE;
                int i4 = 0;
                int i5 = -1;
                while (true) {
                    zzavhVarArr = this.zzo;
                    if (i4 >= zzavhVarArr.length) {
                        break;
                    }
                    zzavh zzavhVar = zzavhVarArr[i4];
                    int i6 = zzavhVar.zzd;
                    zzavn zzavnVar = zzavhVar.zzb;
                    if (i6 != zzavnVar.zza) {
                        long j3 = zzavnVar.zzb[i6];
                        if (j3 < j2) {
                            i5 = i4;
                            j2 = j3;
                        }
                    }
                    i4++;
                }
                if (i5 == -1) {
                    return -1;
                }
                zzavh zzavhVar2 = zzavhVarArr[i5];
                zzaue zzaueVar = zzavhVar2.zzc;
                int i7 = zzavhVar2.zzd;
                zzavn zzavnVar2 = zzavhVar2.zzb;
                long j4 = zzavnVar2.zzb[i7];
                int i8 = zzavnVar2.zzc[i7];
                if (zzavhVar2.zza.zzg == 1) {
                    j4 += 8;
                    i8 -= 8;
                }
                long zzd2 = (j4 - zzatuVar.zzd()) + this.zzl;
                if (zzd2 >= 0 && zzd2 < 262144) {
                    int i9 = (int) zzd2;
                    boolean z3 = false;
                    zzatuVar.zzi(i9, false);
                    int i10 = zzavhVar2.zza.zzk;
                    if (i10 == 0) {
                        while (true) {
                            int i11 = this.zzl;
                            if (i11 >= i8) {
                                break;
                            }
                            int zzd3 = zzaueVar.zzd(zzatuVar, i8 - i11, false);
                            this.zzl += zzd3;
                            this.zzm -= zzd3;
                        }
                    } else {
                        byte[] bArr = this.zzd.zza;
                        bArr[0] = 0;
                        bArr[1] = 0;
                        bArr[2] = 0;
                        int i12 = 4 - i10;
                        while (this.zzl < i8) {
                            int i13 = this.zzm;
                            if (i13 == 0) {
                                zzatuVar.zzh(this.zzd.zza, i12, i10, z3);
                                this.zzd.zzv(z3 ? 1 : 0);
                                this.zzm = this.zzd.zzi();
                                this.zzc.zzv(z3 ? 1 : 0);
                                zzaueVar.zzb(this.zzc, 4);
                                this.zzl += 4;
                                i8 += i12;
                            } else {
                                int zzd4 = zzaueVar.zzd(zzatuVar, i13, z3);
                                this.zzl += zzd4;
                                this.zzm -= zzd4;
                                z3 = false;
                            }
                        }
                    }
                    int i14 = i8;
                    zzavn zzavnVar3 = zzavhVar2.zzb;
                    zzaueVar.zzc(zzavnVar3.zze[i7], zzavnVar3.zzf[i7], i14, 0, null);
                    zzavhVar2.zzd++;
                    this.zzl = 0;
                    this.zzm = 0;
                    return 0;
                }
                zzauaVar.zza = j4;
                return 1;
            } else {
                long j5 = this.zzi;
                int i15 = this.zzj;
                long j6 = j5 - i15;
                long zzd5 = zzatuVar.zzd() + j6;
                zzazg zzazgVar2 = this.zzk;
                if (zzazgVar2 != null) {
                    zzatuVar.zzh(zzazgVar2.zza, i15, (int) j6, false);
                    if (this.zzh == zzaus.zzd) {
                        zzazg zzazgVar3 = this.zzk;
                        zzazgVar3.zzv(8);
                        if (zzazgVar3.zze() == zzb) {
                            z2 = true;
                            break;
                        }
                        zzazgVar3.zzw(4);
                        while (zzazgVar3.zza() > 0) {
                            if (zzazgVar3.zze() == zzb) {
                                z2 = true;
                                break;
                            }
                        }
                        z2 = false;
                        this.zzq = z2;
                    } else if (!this.zzf.isEmpty()) {
                        ((zzauq) this.zzf.peek()).zzd(new zzaur(this.zzh, this.zzk));
                    }
                } else if (j6 < 262144) {
                    zzatuVar.zzi((int) j6, false);
                } else {
                    zzauaVar.zza = zzatuVar.zzd() + j6;
                    z = true;
                    zzi(zzd5);
                    if (z && this.zzg != 2) {
                        return 1;
                    }
                }
                z = false;
                zzi(zzd5);
                if (z) {
                    return 1;
                }
                continue;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatv
    public final boolean zzg(zzatu zzatuVar) {
        return zzavj.zzb(zzatuVar);
    }
}
