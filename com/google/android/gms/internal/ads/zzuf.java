package com.google.android.gms.internal.ads;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzuf extends zzuh {
    private final zzvv zzd;
    private final zzfrh zze;
    private final zzcx zzf;

    public zzuf(zzck zzckVar, int[] iArr, int i2, zzvv zzvvVar, long j2, long j3, long j4, int i3, int i4, float f2, float f3, List list, zzcx zzcxVar) {
        super(zzckVar, iArr, 0);
        this.zzd = zzvvVar;
        this.zze = zzfrh.zzm(list);
        this.zzf = zzcxVar;
    }

    public static /* bridge */ /* synthetic */ zzfrh zzf(zzvg[] zzvgVarArr) {
        int i2;
        int i3;
        int[] iArr;
        ArrayList arrayList = new ArrayList();
        char c = 0;
        int i4 = 0;
        while (true) {
            i2 = 2;
            i3 = 1;
            if (i4 >= 2) {
                break;
            }
            zzvg zzvgVar = zzvgVarArr[i4];
            if (zzvgVar != null && zzvgVar.zzb.length > 1) {
                zzfre zzi = zzfrh.zzi();
                zzi.zze(new zzud(0L, 0L));
                arrayList.add(zzi);
            } else {
                arrayList.add(null);
            }
            i4++;
        }
        long[][] jArr = new long[2];
        for (int i5 = 0; i5 < 2; i5++) {
            zzvg zzvgVar2 = zzvgVarArr[i5];
            if (zzvgVar2 == null) {
                jArr[i5] = new long[0];
            } else {
                jArr[i5] = new long[zzvgVar2.zzb.length];
                int i6 = 0;
                while (true) {
                    if (i6 >= zzvgVar2.zzb.length) {
                        break;
                    }
                    jArr[i5][i6] = zzvgVar2.zza.zzb(iArr[i6]).zzi;
                    i6++;
                }
                Arrays.sort(jArr[i5]);
            }
        }
        int[] iArr2 = new int[2];
        long[] jArr2 = new long[2];
        for (int i7 = 0; i7 < 2; i7++) {
            long[] jArr3 = jArr[i7];
            jArr2[i7] = jArr3.length == 0 ? 0L : jArr3[0];
        }
        zzg(arrayList, jArr2);
        zzfrs zza = zzfsk.zzc(zzfsp.zzc()).zzb(2).zza();
        int i8 = 0;
        while (i8 < i2) {
            int length = jArr[i8].length;
            if (length > i3) {
                double[] dArr = new double[length];
                int i9 = 0;
                while (true) {
                    long[] jArr4 = jArr[i8];
                    int length2 = jArr4.length;
                    double d2 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                    if (i9 >= length2) {
                        break;
                    }
                    long j2 = jArr4[i9];
                    if (j2 != -1) {
                        d2 = Math.log(j2);
                    }
                    dArr[i9] = d2;
                    i9++;
                }
                int i10 = length - 1;
                double d3 = dArr[i10] - dArr[c];
                int i11 = 0;
                while (i11 < i10) {
                    int i12 = i11 + 1;
                    zza.zzs(Double.valueOf(d3 == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? 1.0d : (((dArr[i11] + dArr[i12]) * 0.5d) - dArr[c]) / d3), Integer.valueOf(i8));
                    i11 = i12;
                    c = 0;
                }
            }
            i8++;
            c = 0;
            i2 = 2;
            i3 = 1;
        }
        zzfrh zzm = zzfrh.zzm(zza.zzt());
        for (int i13 = 0; i13 < zzm.size(); i13++) {
            int intValue = ((Integer) zzm.get(i13)).intValue();
            int i14 = iArr2[intValue] + 1;
            iArr2[intValue] = i14;
            jArr2[intValue] = jArr[intValue][i14];
            zzg(arrayList, jArr2);
        }
        for (int i15 = 0; i15 < 2; i15++) {
            if (arrayList.get(i15) != null) {
                long j3 = jArr2[i15];
                jArr2[i15] = j3 + j3;
            }
        }
        zzg(arrayList, jArr2);
        zzfre zzi2 = zzfrh.zzi();
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            zzfre zzfreVar = (zzfre) arrayList.get(i16);
            zzi2.zze(zzfreVar == null ? zzfrh.zzo() : zzfreVar.zzg());
        }
        return zzi2.zzg();
    }

    private static void zzg(List list, long[] jArr) {
        long j2 = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            j2 += jArr[i2];
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            zzfre zzfreVar = (zzfre) list.get(i3);
            if (zzfreVar != null) {
                zzfreVar.zze(new zzud(j2, jArr[i3]));
            }
        }
    }
}
