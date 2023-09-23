package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Pair;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzaeo implements zzys, zzzv {
    public static final zzyz zza = new zzyz() { // from class: com.google.android.gms.internal.ads.zzael
        @Override // com.google.android.gms.internal.ads.zzyz
        public final zzys[] zza() {
            zzyz zzyzVar = zzaeo.zza;
            return new zzys[]{new zzaeo(0)};
        }

        @Override // com.google.android.gms.internal.ads.zzyz
        public final /* synthetic */ zzys[] zzb(Uri uri, Map map) {
            return zzyy.zza(this, uri, map);
        }
    };
    private final zzdy zzb;
    private final zzdy zzc;
    private final zzdy zzd;
    private final zzdy zze;
    private final ArrayDeque zzf;
    private final zzaer zzg;
    private final List zzh;
    private int zzi;
    private int zzj;
    private long zzk;
    private int zzl;
    private zzdy zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private zzyv zzr;
    private zzaen[] zzs;
    private long[][] zzt;
    private int zzu;
    private long zzv;
    private int zzw;
    private zzacs zzx;

    public zzaeo() {
        this(0);
    }

    private static int zzf(int i2) {
        if (i2 != 1751476579) {
            return i2 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static int zzi(zzaew zzaewVar, long j2) {
        int zza2 = zzaewVar.zza(j2);
        return zza2 == -1 ? zzaewVar.zzb(j2) : zza2;
    }

    private static long zzj(zzaew zzaewVar, long j2, long j3) {
        int zzi = zzi(zzaewVar, j2);
        return zzi == -1 ? j3 : Math.min(zzaewVar.zzc[zzi], j3);
    }

    private final void zzk() {
        this.zzi = 0;
        this.zzl = 0;
    }

    private final void zzl(long j2) {
        zzbl zzblVar;
        zzbl zzblVar2;
        long j3;
        List list;
        int i2;
        int i3;
        int i4;
        while (!this.zzf.isEmpty() && ((zzadu) this.zzf.peek()).zza == j2) {
            zzadu zzaduVar = (zzadu) this.zzf.pop();
            if (zzaduVar.zzd == 1836019574) {
                ArrayList arrayList = new ArrayList();
                boolean z = this.zzw == 1;
                zzzh zzzhVar = new zzzh();
                zzadv zzb = zzaduVar.zzb(1969517665);
                if (zzb != null) {
                    Pair zza2 = zzaed.zza(zzb);
                    zzbl zzblVar3 = (zzbl) zza2.first;
                    zzbl zzblVar4 = (zzbl) zza2.second;
                    if (zzblVar3 != null) {
                        zzzhVar.zzb(zzblVar3);
                    }
                    zzblVar = zzblVar4;
                    zzblVar2 = zzblVar3;
                } else {
                    zzblVar = null;
                    zzblVar2 = null;
                }
                zzadu zza3 = zzaduVar.zza(1835365473);
                long j4 = -9223372036854775807L;
                zzbl zzb2 = zza3 != null ? zzaed.zzb(zza3) : null;
                List zzc = zzaed.zzc(zzaduVar, zzzhVar, -9223372036854775807L, null, false, z, new zzfoi() { // from class: com.google.android.gms.internal.ads.zzaem
                    @Override // com.google.android.gms.internal.ads.zzfoi
                    public final Object apply(Object obj) {
                        zzaet zzaetVar = (zzaet) obj;
                        zzyz zzyzVar = zzaeo.zza;
                        return zzaetVar;
                    }
                });
                int size = zzc.size();
                long j5 = -9223372036854775807L;
                int i5 = 0;
                int i6 = -1;
                while (true) {
                    j3 = 0;
                    if (i5 >= size) {
                        break;
                    }
                    zzaew zzaewVar = (zzaew) zzc.get(i5);
                    if (zzaewVar.zzb == 0) {
                        list = zzc;
                        i2 = size;
                    } else {
                        zzaet zzaetVar = zzaewVar.zza;
                        list = zzc;
                        long j6 = zzaetVar.zze;
                        if (j6 == j4) {
                            j6 = zzaewVar.zzh;
                        }
                        long max = Math.max(j5, j6);
                        i2 = size;
                        zzaen zzaenVar = new zzaen(zzaetVar, zzaewVar, this.zzr.zzv(i5, zzaetVar.zzb));
                        if ("audio/true-hd".equals(zzaetVar.zzf.zzm)) {
                            i3 = zzaewVar.zze * 16;
                        } else {
                            i3 = zzaewVar.zze + 30;
                        }
                        zzab zzb3 = zzaetVar.zzf.zzb();
                        zzb3.zzL(i3);
                        if (zzaetVar.zzb == 2 && j6 > 0 && (i4 = zzaewVar.zzb) > 1) {
                            zzb3.zzE(i4 / (((float) j6) / 1000000.0f));
                        }
                        if (zzaetVar.zzb == 1 && zzzhVar.zza()) {
                            zzb3.zzC(zzzhVar.zza);
                            zzb3.zzD(zzzhVar.zzb);
                        }
                        int i7 = zzaetVar.zzb;
                        zzbl[] zzblVarArr = new zzbl[2];
                        zzblVarArr[0] = zzblVar;
                        zzblVarArr[1] = this.zzh.isEmpty() ? null : new zzbl(this.zzh);
                        zzbl zzblVar5 = new zzbl(new zzbk[0]);
                        if (i7 == 1) {
                            if (zzblVar2 != null) {
                                zzblVar5 = zzblVar2;
                            }
                        } else if (i7 == 2 && zzb2 != null) {
                            int i8 = 0;
                            while (true) {
                                if (i8 >= zzb2.zza()) {
                                    break;
                                }
                                zzbk zzb4 = zzb2.zzb(i8);
                                if (zzb4 instanceof zzacp) {
                                    zzacp zzacpVar = (zzacp) zzb4;
                                    if ("com.android.capture.fps".equals(zzacpVar.zza)) {
                                        zzblVar5 = new zzbl(zzacpVar);
                                        break;
                                    }
                                }
                                i8++;
                            }
                        }
                        for (int i9 = 0; i9 < 2; i9++) {
                            zzblVar5 = zzblVar5.zzd(zzblVarArr[i9]);
                        }
                        if (zzblVar5.zza() > 0) {
                            zzb3.zzM(zzblVar5);
                        }
                        zzaenVar.zzc.zzk(zzb3.zzY());
                        if (zzaetVar.zzb == 2 && i6 == -1) {
                            i6 = arrayList.size();
                        }
                        arrayList.add(zzaenVar);
                        j5 = max;
                    }
                    i5++;
                    zzc = list;
                    size = i2;
                    j4 = -9223372036854775807L;
                }
                this.zzu = i6;
                this.zzv = j5;
                zzaen[] zzaenVarArr = (zzaen[]) arrayList.toArray(new zzaen[0]);
                this.zzs = zzaenVarArr;
                int length = zzaenVarArr.length;
                long[][] jArr = new long[length];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i10 = 0; i10 < zzaenVarArr.length; i10++) {
                    jArr[i10] = new long[zzaenVarArr[i10].zzb.zzb];
                    jArr2[i10] = zzaenVarArr[i10].zzb.zzf[0];
                }
                int i11 = 0;
                while (i11 < zzaenVarArr.length) {
                    long j7 = Long.MAX_VALUE;
                    int i12 = -1;
                    for (int i13 = 0; i13 < zzaenVarArr.length; i13++) {
                        if (!zArr[i13]) {
                            long j8 = jArr2[i13];
                            if (j8 <= j7) {
                                i12 = i13;
                                j7 = j8;
                            }
                        }
                    }
                    int i14 = iArr[i12];
                    long[] jArr3 = jArr[i12];
                    jArr3[i14] = j3;
                    zzaew zzaewVar2 = zzaenVarArr[i12].zzb;
                    j3 += zzaewVar2.zzd[i14];
                    int i15 = i14 + 1;
                    iArr[i12] = i15;
                    if (i15 < jArr3.length) {
                        jArr2[i12] = zzaewVar2.zzf[i15];
                    } else {
                        zArr[i12] = true;
                        i11++;
                    }
                }
                this.zzt = jArr;
                this.zzr.zzB();
                this.zzr.zzL(this);
                this.zzf.clear();
                this.zzi = 2;
            } else if (!this.zzf.isEmpty()) {
                ((zzadu) this.zzf.peek()).zzc(zzaduVar);
            }
        }
        if (this.zzi != 2) {
            zzk();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:194:0x037e, code lost:
        r3 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007f  */
    @Override // com.google.android.gms.internal.ads.zzys
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(com.google.android.gms.internal.ads.zzyt r33, com.google.android.gms.internal.ads.zzzs r34) {
        /*
            Method dump skipped, instructions count: 1033
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaeo.zza(com.google.android.gms.internal.ads.zzyt, com.google.android.gms.internal.ads.zzzs):int");
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final void zzb(zzyv zzyvVar) {
        this.zzr = zzyvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final void zzc(long j2, long j3) {
        zzaen[] zzaenVarArr;
        this.zzf.clear();
        this.zzl = 0;
        this.zzn = -1;
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0;
        if (j2 == 0) {
            zzk();
            return;
        }
        for (zzaen zzaenVar : this.zzs) {
            zzaew zzaewVar = zzaenVar.zzb;
            int zza2 = zzaewVar.zza(j3);
            if (zza2 == -1) {
                zza2 = zzaewVar.zzb(j3);
            }
            zzaenVar.zze = zza2;
            zzaaa zzaaaVar = zzaenVar.zzd;
            if (zzaaaVar != null) {
                zzaaaVar.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final boolean zzd(zzyt zzytVar) {
        return zzaes.zzb(zzytVar, false);
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final long zze() {
        return this.zzv;
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final zzzt zzg(long j2) {
        long j3;
        long j4;
        int zzb;
        zzaen[] zzaenVarArr = this.zzs;
        if (zzaenVarArr.length == 0) {
            zzzw zzzwVar = zzzw.zza;
            return new zzzt(zzzwVar, zzzwVar);
        }
        int i2 = this.zzu;
        long j5 = -1;
        if (i2 != -1) {
            zzaew zzaewVar = zzaenVarArr[i2].zzb;
            int zzi = zzi(zzaewVar, j2);
            if (zzi == -1) {
                zzzw zzzwVar2 = zzzw.zza;
                return new zzzt(zzzwVar2, zzzwVar2);
            }
            long j6 = zzaewVar.zzf[zzi];
            j3 = zzaewVar.zzc[zzi];
            if (j6 >= j2 || zzi >= zzaewVar.zzb - 1 || (zzb = zzaewVar.zzb(j2)) == -1 || zzb == zzi) {
                j4 = -9223372036854775807L;
            } else {
                j4 = zzaewVar.zzf[zzb];
                j5 = zzaewVar.zzc[zzb];
            }
            j2 = j6;
        } else {
            j3 = Long.MAX_VALUE;
            j4 = -9223372036854775807L;
        }
        int i3 = 0;
        while (true) {
            zzaen[] zzaenVarArr2 = this.zzs;
            if (i3 >= zzaenVarArr2.length) {
                break;
            }
            if (i3 != this.zzu) {
                zzaew zzaewVar2 = zzaenVarArr2[i3].zzb;
                long zzj = zzj(zzaewVar2, j2, j3);
                if (j4 != -9223372036854775807L) {
                    j5 = zzj(zzaewVar2, j4, j5);
                }
                j3 = zzj;
            }
            i3++;
        }
        zzzw zzzwVar3 = new zzzw(j2, j3);
        return j4 == -9223372036854775807L ? new zzzt(zzzwVar3, zzzwVar3) : new zzzt(zzzwVar3, new zzzw(j4, j5));
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final boolean zzh() {
        return true;
    }

    public zzaeo(int i2) {
        this.zzi = 0;
        this.zzg = new zzaer();
        this.zzh = new ArrayList();
        this.zze = new zzdy(16);
        this.zzf = new ArrayDeque();
        this.zzb = new zzdy(zzzp.zza);
        this.zzc = new zzdy(4);
        this.zzd = new zzdy();
        this.zzn = -1;
        this.zzr = zzyv.zza;
        this.zzs = new zzaen[0];
    }
}
