package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzsr implements zzrz, zzry {
    private final zzrz[] zza;
    private zzry zze;
    private zztz zzf;
    private final zzrm zzi;
    private final ArrayList zzc = new ArrayList();
    private final HashMap zzd = new HashMap();
    private zztt zzh = new zzrl(new zztt[0]);
    private final IdentityHashMap zzb = new IdentityHashMap();
    private zzrz[] zzg = new zzrz[0];

    public zzsr(zzrm zzrmVar, long[] jArr, zzrz[] zzrzVarArr, byte... bArr) {
        this.zzi = zzrmVar;
        this.zza = zzrzVarArr;
        for (int i2 = 0; i2 < zzrzVarArr.length; i2++) {
            long j2 = jArr[i2];
            if (j2 != 0) {
                this.zza[i2] = new zzsp(zzrzVarArr[i2], j2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrz
    public final long zza(long j2, zzjx zzjxVar) {
        zzrz[] zzrzVarArr = this.zzg;
        return (zzrzVarArr.length > 0 ? zzrzVarArr[0] : this.zza[0]).zza(j2, zzjxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzrz, com.google.android.gms.internal.ads.zztt
    public final long zzb() {
        return this.zzh.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzrz, com.google.android.gms.internal.ads.zztt
    public final long zzc() {
        return this.zzh.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzrz
    public final long zzd() {
        zzrz[] zzrzVarArr;
        zzrz[] zzrzVarArr2;
        long j2 = -9223372036854775807L;
        for (zzrz zzrzVar : this.zzg) {
            long zzd = zzrzVar.zzd();
            if (zzd != -9223372036854775807L) {
                if (j2 == -9223372036854775807L) {
                    for (zzrz zzrzVar2 : this.zzg) {
                        if (zzrzVar2 == zzrzVar) {
                            break;
                        } else if (zzrzVar2.zze(zzd) != zzd) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j2 = zzd;
                } else if (zzd != j2) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j2 != -9223372036854775807L && zzrzVar.zze(j2) != j2) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zzrz
    public final long zze(long j2) {
        long zze = this.zzg[0].zze(j2);
        int i2 = 1;
        while (true) {
            zzrz[] zzrzVarArr = this.zzg;
            if (i2 >= zzrzVarArr.length) {
                return zze;
            }
            if (zzrzVarArr[i2].zze(zze) != zze) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrz
    public final long zzf(zzvh[] zzvhVarArr, boolean[] zArr, zztr[] zztrVarArr, boolean[] zArr2, long j2) {
        int length;
        zzvh zzvhVar;
        int length2 = zzvhVarArr.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i2 = 0;
        while (true) {
            length = zzvhVarArr.length;
            zzvhVar = null;
            if (i2 >= length) {
                break;
            }
            zztr zztrVar = zztrVarArr[i2];
            Integer num = zztrVar != null ? (Integer) this.zzb.get(zztrVar) : null;
            iArr[i2] = num == null ? -1 : num.intValue();
            iArr2[i2] = -1;
            zzvh zzvhVar2 = zzvhVarArr[i2];
            if (zzvhVar2 != null) {
                zzck zzckVar = (zzck) this.zzd.get(zzvhVar2.zze());
                Objects.requireNonNull(zzckVar);
                int i3 = 0;
                while (true) {
                    zzrz[] zzrzVarArr = this.zza;
                    if (i3 >= zzrzVarArr.length) {
                        break;
                    } else if (zzrzVarArr[i3].zzh().zza(zzckVar) != -1) {
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
        zztr[] zztrVarArr2 = new zztr[length];
        zztr[] zztrVarArr3 = new zztr[length];
        zzvh[] zzvhVarArr2 = new zzvh[length];
        ArrayList arrayList = new ArrayList(this.zza.length);
        long j3 = j2;
        int i4 = 0;
        while (i4 < this.zza.length) {
            for (int i5 = 0; i5 < zzvhVarArr.length; i5++) {
                zztrVarArr3[i5] = iArr[i5] == i4 ? zztrVarArr[i5] : zzvhVar;
                if (iArr2[i5] == i4) {
                    zzvh zzvhVar3 = zzvhVarArr[i5];
                    Objects.requireNonNull(zzvhVar3);
                    zzck zzckVar2 = (zzck) this.zzd.get(zzvhVar3.zze());
                    Objects.requireNonNull(zzckVar2);
                    zzvhVarArr2[i5] = new zzso(zzvhVar3, zzckVar2);
                } else {
                    zzvhVarArr2[i5] = zzvhVar;
                }
            }
            int i6 = i4;
            ArrayList arrayList2 = arrayList;
            zztr[] zztrVarArr4 = zztrVarArr3;
            zzvh[] zzvhVarArr3 = zzvhVarArr2;
            long zzf = this.zza[i4].zzf(zzvhVarArr2, zArr, zztrVarArr3, zArr2, j3);
            if (i6 == 0) {
                j3 = zzf;
            } else if (zzf != j3) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i7 = 0; i7 < zzvhVarArr.length; i7++) {
                if (iArr2[i7] == i6) {
                    zztr zztrVar2 = zztrVarArr4[i7];
                    Objects.requireNonNull(zztrVar2);
                    zztrVarArr2[i7] = zztrVar2;
                    this.zzb.put(zztrVar2, Integer.valueOf(i6));
                    z = true;
                } else if (iArr[i7] == i6) {
                    zzcw.zzf(zztrVarArr4[i7] == null);
                }
            }
            if (z) {
                arrayList2.add(this.zza[i6]);
            }
            i4 = i6 + 1;
            arrayList = arrayList2;
            zztrVarArr3 = zztrVarArr4;
            zzvhVarArr2 = zzvhVarArr3;
            zzvhVar = null;
        }
        System.arraycopy(zztrVarArr2, 0, zztrVarArr, 0, length);
        zzrz[] zzrzVarArr2 = (zzrz[]) arrayList.toArray(new zzrz[0]);
        this.zzg = zzrzVarArr2;
        this.zzh = new zzrl(zzrzVarArr2);
        return j3;
    }

    @Override // com.google.android.gms.internal.ads.zzts
    public final /* bridge */ /* synthetic */ void zzg(zztt zzttVar) {
        zzrz zzrzVar = (zzrz) zzttVar;
        zzry zzryVar = this.zze;
        Objects.requireNonNull(zzryVar);
        zzryVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzrz
    public final zztz zzh() {
        zztz zztzVar = this.zzf;
        Objects.requireNonNull(zztzVar);
        return zztzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzry
    public final void zzi(zzrz zzrzVar) {
        this.zzc.remove(zzrzVar);
        if (!this.zzc.isEmpty()) {
            return;
        }
        int i2 = 0;
        for (zzrz zzrzVar2 : this.zza) {
            i2 += zzrzVar2.zzh().zzc;
        }
        zzck[] zzckVarArr = new zzck[i2];
        int i3 = 0;
        int i4 = 0;
        while (true) {
            zzrz[] zzrzVarArr = this.zza;
            if (i3 < zzrzVarArr.length) {
                zztz zzh = zzrzVarArr[i3].zzh();
                int i5 = zzh.zzc;
                int i6 = 0;
                while (i6 < i5) {
                    zzck zzb = zzh.zzb(i6);
                    zzck zzc = zzb.zzc(i3 + ":" + zzb.zzc);
                    this.zzd.put(zzc, zzb);
                    zzckVarArr[i4] = zzc;
                    i6++;
                    i4++;
                }
                i3++;
            } else {
                this.zzf = new zztz(zzckVarArr);
                zzry zzryVar = this.zze;
                Objects.requireNonNull(zzryVar);
                zzryVar.zzi(this);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrz
    public final void zzj(long j2, boolean z) {
        for (zzrz zzrzVar : this.zzg) {
            zzrzVar.zzj(j2, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrz
    public final void zzk() {
        for (zzrz zzrzVar : this.zza) {
            zzrzVar.zzk();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrz
    public final void zzl(zzry zzryVar, long j2) {
        this.zze = zzryVar;
        Collections.addAll(this.zzc, this.zza);
        for (zzrz zzrzVar : this.zza) {
            zzrzVar.zzl(this, j2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrz, com.google.android.gms.internal.ads.zztt
    public final void zzm(long j2) {
        this.zzh.zzm(j2);
    }

    public final zzrz zzn(int i2) {
        zzrz zzrzVar;
        zzrz zzrzVar2 = this.zza[i2];
        if (zzrzVar2 instanceof zzsp) {
            zzrzVar = ((zzsp) zzrzVar2).zza;
            return zzrzVar;
        }
        return zzrzVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzrz, com.google.android.gms.internal.ads.zztt
    public final boolean zzo(long j2) {
        if (!this.zzc.isEmpty()) {
            int size = this.zzc.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((zzrz) this.zzc.get(i2)).zzo(j2);
            }
            return false;
        }
        return this.zzh.zzo(j2);
    }

    @Override // com.google.android.gms.internal.ads.zzrz, com.google.android.gms.internal.ads.zztt
    public final boolean zzp() {
        return this.zzh.zzp();
    }
}
