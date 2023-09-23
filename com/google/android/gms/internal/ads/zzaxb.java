package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.IdentityHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzaxb implements zzawy, zzawx {
    public final zzawy[] zza;
    private final IdentityHashMap zzb = new IdentityHashMap();
    private zzawx zzc;
    private int zzd;
    private zzaxp zze;
    private zzawy[] zzf;
    private zzaxm zzg;

    public zzaxb(zzawy... zzawyVarArr) {
        this.zza = zzawyVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzawy
    public final long zzB(zzaxt[] zzaxtVarArr, boolean[] zArr, zzaxk[] zzaxkVarArr, boolean[] zArr2, long j2) {
        int length;
        zzaxk[] zzaxkVarArr2 = zzaxkVarArr;
        int length2 = zzaxtVarArr.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i2 = 0;
        while (true) {
            length = zzaxtVarArr.length;
            if (i2 >= length) {
                break;
            }
            zzaxk zzaxkVar = zzaxkVarArr2[i2];
            iArr[i2] = zzaxkVar == null ? -1 : ((Integer) this.zzb.get(zzaxkVar)).intValue();
            iArr2[i2] = -1;
            zzaxt zzaxtVar = zzaxtVarArr[i2];
            if (zzaxtVar != null) {
                zzaxo zzd = zzaxtVar.zzd();
                int i3 = 0;
                while (true) {
                    zzawy[] zzawyVarArr = this.zza;
                    if (i3 >= zzawyVarArr.length) {
                        break;
                    } else if (zzawyVarArr[i3].zzn().zza(zzd) != -1) {
                        iArr2[i2] = i3;
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            i2++;
        }
        this.zzb.clear();
        zzaxk[] zzaxkVarArr3 = new zzaxk[length];
        zzaxk[] zzaxkVarArr4 = new zzaxk[length];
        zzaxt[] zzaxtVarArr2 = new zzaxt[length];
        ArrayList arrayList = new ArrayList(this.zza.length);
        long j3 = j2;
        int i4 = 0;
        while (i4 < this.zza.length) {
            for (int i5 = 0; i5 < zzaxtVarArr.length; i5++) {
                zzaxt zzaxtVar2 = null;
                zzaxkVarArr4[i5] = iArr[i5] == i4 ? zzaxkVarArr2[i5] : null;
                if (iArr2[i5] == i4) {
                    zzaxtVar2 = zzaxtVarArr[i5];
                }
                zzaxtVarArr2[i5] = zzaxtVar2;
            }
            int i6 = i4;
            zzaxt[] zzaxtVarArr3 = zzaxtVarArr2;
            ArrayList arrayList2 = arrayList;
            long zzB = this.zza[i4].zzB(zzaxtVarArr2, zArr, zzaxkVarArr4, zArr2, j3);
            if (i6 == 0) {
                j3 = zzB;
            } else if (zzB != j3) {
                throw new IllegalStateException("Children enabled at different positions");
            }
            boolean z = false;
            for (int i7 = 0; i7 < zzaxtVarArr.length; i7++) {
                if (iArr2[i7] == i6) {
                    zzayy.zze(zzaxkVarArr4[i7] != null);
                    zzaxk zzaxkVar2 = zzaxkVarArr4[i7];
                    zzaxkVarArr3[i7] = zzaxkVar2;
                    this.zzb.put(zzaxkVar2, Integer.valueOf(i6));
                    z = true;
                } else if (iArr[i7] == i6) {
                    zzayy.zze(zzaxkVarArr4[i7] == null);
                }
            }
            if (z) {
                arrayList2.add(this.zza[i6]);
            }
            i4 = i6 + 1;
            arrayList = arrayList2;
            zzaxtVarArr2 = zzaxtVarArr3;
            zzaxkVarArr2 = zzaxkVarArr;
        }
        zzaxk[] zzaxkVarArr5 = zzaxkVarArr2;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(zzaxkVarArr3, 0, zzaxkVarArr5, 0, length);
        zzawy[] zzawyVarArr2 = new zzawy[arrayList3.size()];
        this.zzf = zzawyVarArr2;
        arrayList3.toArray(zzawyVarArr2);
        this.zzg = new zzawm(this.zzf);
        return j3;
    }

    @Override // com.google.android.gms.internal.ads.zzawy, com.google.android.gms.internal.ads.zzaxm
    public final long zza() {
        return this.zzg.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzawy, com.google.android.gms.internal.ads.zzaxm
    public final boolean zzbj(long j2) {
        return this.zzg.zzbj(j2);
    }

    @Override // com.google.android.gms.internal.ads.zzaxl
    public final /* bridge */ /* synthetic */ void zze(zzaxm zzaxmVar) {
        zzawy zzawyVar = (zzawy) zzaxmVar;
        if (this.zze == null) {
            return;
        }
        this.zzc.zze(this);
    }

    @Override // com.google.android.gms.internal.ads.zzawx
    public final void zzf(zzawy zzawyVar) {
        int i2 = this.zzd - 1;
        this.zzd = i2;
        if (i2 > 0) {
            return;
        }
        int i3 = 0;
        for (zzawy zzawyVar2 : this.zza) {
            i3 += zzawyVar2.zzn().zzb;
        }
        zzaxo[] zzaxoVarArr = new zzaxo[i3];
        int i4 = 0;
        for (zzawy zzawyVar3 : this.zza) {
            zzaxp zzn = zzawyVar3.zzn();
            int i5 = zzn.zzb;
            int i6 = 0;
            while (i6 < i5) {
                zzaxoVarArr[i4] = zzn.zzb(i6);
                i6++;
                i4++;
            }
        }
        this.zze = new zzaxp(zzaxoVarArr);
        this.zzc.zzf(this);
    }

    @Override // com.google.android.gms.internal.ads.zzawy
    public final long zzg() {
        long j2 = Long.MAX_VALUE;
        for (zzawy zzawyVar : this.zzf) {
            long zzg = zzawyVar.zzg();
            if (zzg != Long.MIN_VALUE) {
                j2 = Math.min(j2, zzg);
            }
        }
        if (j2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zzawy
    public final long zzh() {
        zzawy[] zzawyVarArr;
        long zzh = this.zza[0].zzh();
        int i2 = 1;
        while (true) {
            zzawy[] zzawyVarArr2 = this.zza;
            if (i2 >= zzawyVarArr2.length) {
                if (zzh != -9223372036854775807L) {
                    for (zzawy zzawyVar : this.zzf) {
                        if (zzawyVar != this.zza[0] && zzawyVar.zzi(zzh) != zzh) {
                            throw new IllegalStateException("Children seeked to different positions");
                        }
                    }
                }
                return zzh;
            } else if (zzawyVarArr2[i2].zzh() != -9223372036854775807L) {
                throw new IllegalStateException("Child reported discontinuity");
            } else {
                i2++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzawy
    public final long zzi(long j2) {
        long zzi = this.zzf[0].zzi(j2);
        int i2 = 1;
        while (true) {
            zzawy[] zzawyVarArr = this.zzf;
            if (i2 >= zzawyVarArr.length) {
                return zzi;
            }
            if (zzawyVarArr[i2].zzi(zzi) != zzi) {
                throw new IllegalStateException("Children seeked to different positions");
            }
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzawy
    public final zzaxp zzn() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzawy
    public final void zzq(long j2) {
        for (zzawy zzawyVar : this.zzf) {
            zzawyVar.zzq(j2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzawy
    public final void zzs() {
        for (zzawy zzawyVar : this.zza) {
            zzawyVar.zzs();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzawy
    public final void zzw(zzawx zzawxVar, long j2) {
        this.zzc = zzawxVar;
        zzawy[] zzawyVarArr = this.zza;
        this.zzd = zzawyVarArr.length;
        for (zzawy zzawyVar : zzawyVarArr) {
            zzawyVar.zzw(this, j2);
        }
    }
}
