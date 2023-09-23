package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzvk extends zzvn {
    private zzvj zza;

    public abstract Pair zzb(zzvj zzvjVar, int[][][] iArr, int[] iArr2, zzsb zzsbVar, zzci zzciVar);

    @Override // com.google.android.gms.internal.ads.zzvn
    public final zzvo zzj(zzjv[] zzjvVarArr, zztz zztzVar, zzsb zzsbVar, zzci zzciVar) {
        boolean z;
        int[] iArr;
        int[] iArr2 = new int[3];
        zzck[][] zzckVarArr = new zzck[3];
        int[][][] iArr3 = new int[3][];
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = zztzVar.zzc;
            zzckVarArr[i2] = new zzck[i3];
            iArr3[i2] = new int[i3];
        }
        int i4 = 2;
        int[] iArr4 = new int[2];
        for (int i5 = 0; i5 < 2; i5++) {
            iArr4[i5] = zzjvVarArr[i5].zze();
        }
        int i6 = 0;
        while (i6 < zztzVar.zzc) {
            zzck zzb = zztzVar.zzb(i6);
            int i7 = zzb.zzd;
            int i8 = 0;
            int i9 = 2;
            int i10 = 0;
            boolean z2 = true;
            while (i8 < i4) {
                zzjv zzjvVar = zzjvVarArr[i8];
                int i11 = 0;
                for (int i12 = 0; i12 <= 0; i12++) {
                    i11 = Math.max(i11, zzjvVar.zzO(zzb.zzb(i12)) & 7);
                }
                boolean z3 = iArr2[i8] == 0;
                if (i11 > i10) {
                    z2 = z3;
                    i9 = i8;
                    i10 = i11;
                } else if (i11 == i10 && i7 == 5 && !z2 && z3) {
                    i9 = i8;
                    i10 = i11;
                    z2 = true;
                }
                i8++;
                i4 = 2;
            }
            if (i9 == i4) {
                iArr = new int[1];
            } else {
                zzjv zzjvVar2 = zzjvVarArr[i9];
                int[] iArr5 = new int[1];
                for (int i13 = 0; i13 <= 0; i13++) {
                    iArr5[i13] = zzjvVar2.zzO(zzb.zzb(i13));
                }
                iArr = iArr5;
            }
            int i14 = iArr2[i9];
            zzckVarArr[i9][i14] = zzb;
            iArr3[i9][i14] = iArr;
            iArr2[i9] = i14 + 1;
            i6++;
            i4 = 2;
        }
        zztz[] zztzVarArr = new zztz[i4];
        String[] strArr = new String[i4];
        int[] iArr6 = new int[i4];
        int i15 = 0;
        while (i15 < i4) {
            int i16 = iArr2[i15];
            zztzVarArr[i15] = new zztz((zzck[]) zzeg.zzad(zzckVarArr[i15], i16));
            iArr3[i15] = (int[][]) zzeg.zzad(iArr3[i15], i16);
            strArr[i15] = zzjvVarArr[i15].zzK();
            iArr6[i15] = zzjvVarArr[i15].zzb();
            i15++;
            i4 = 2;
        }
        zzvj zzvjVar = new zzvj(strArr, iArr6, zztzVarArr, iArr4, iArr3, new zztz((zzck[]) zzeg.zzad(zzckVarArr[2], iArr2[2])));
        Pair zzb2 = zzb(zzvjVar, iArr3, iArr4, zzsbVar, zzciVar);
        zzvl[] zzvlVarArr = (zzvl[]) zzb2.second;
        List[] listArr = new List[zzvlVarArr.length];
        for (int i17 = 0; i17 < zzvlVarArr.length; i17++) {
            zzvl zzvlVar = zzvlVarArr[i17];
            listArr[i17] = zzvlVar != null ? zzfrh.zzp(zzvlVar) : zzfrh.zzo();
        }
        zzfre zzfreVar = new zzfre();
        for (int i18 = 0; i18 < 2; i18++) {
            zztz zzd = zzvjVar.zzd(i18);
            List list = listArr[i18];
            for (int i19 = 0; i19 < zzd.zzc; i19++) {
                zzck zzb3 = zzd.zzb(i19);
                boolean z4 = zzvjVar.zza(i18, i19, false) != 0;
                int i20 = zzb3.zzb;
                int[] iArr7 = new int[1];
                boolean[] zArr = new boolean[1];
                for (int i21 = 0; i21 <= 0; i21++) {
                    iArr7[i21] = zzvjVar.zzb(i18, i19, i21) & 7;
                    int i22 = 0;
                    while (true) {
                        if (i22 >= list.size()) {
                            z = false;
                            break;
                        }
                        zzvl zzvlVar2 = (zzvl) list.get(i22);
                        if (zzvlVar2.zze().equals(zzb3) && zzvlVar2.zzb(i21) != -1) {
                            z = true;
                            break;
                        }
                        i22++;
                    }
                    zArr[i21] = z;
                }
                zzfreVar.zze(new zzcs(zzb3, z4, iArr7, zArr));
            }
        }
        zztz zze = zzvjVar.zze();
        for (int i23 = 0; i23 < zze.zzc; i23++) {
            zzck zzb4 = zze.zzb(i23);
            int i24 = zzb4.zzb;
            int[] iArr8 = new int[1];
            Arrays.fill(iArr8, 0);
            zzfreVar.zze(new zzcs(zzb4, false, iArr8, new boolean[1]));
        }
        return new zzvo((zzjw[]) zzb2.first, (zzvh[]) zzb2.second, new zzct(zzfreVar.zzg()), zzvjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvn
    public final void zzk(Object obj) {
        this.zza = (zzvj) obj;
    }
}
