package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Arrays;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzaxz extends zzayd {
    private final SparseArray zza = new SparseArray();
    private final SparseBooleanArray zzb = new SparseBooleanArray();
    private zzaxx zzc;

    public abstract zzaxt[] zzb(zzary[] zzaryVarArr, zzaxp[] zzaxpVarArr, int[][][] iArr);

    @Override // com.google.android.gms.internal.ads.zzayd
    public final zzaye zzc(zzary[] zzaryVarArr, zzaxp zzaxpVar) {
        int[] iArr;
        int[] iArr2 = new int[3];
        zzaxo[][] zzaxoVarArr = new zzaxo[3];
        int[][][] iArr3 = new int[3][];
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = zzaxpVar.zzb;
            zzaxoVarArr[i2] = new zzaxo[i3];
            iArr3[i2] = new int[i3];
        }
        int i4 = 2;
        int[] iArr4 = new int[2];
        for (int i5 = 0; i5 < 2; i5++) {
            zzaryVarArr[i5].zze();
            iArr4[i5] = 4;
        }
        int i6 = 0;
        while (i6 < zzaxpVar.zzb) {
            zzaxo zzb = zzaxpVar.zzb(i6);
            int i7 = 0;
            int i8 = 0;
            int i9 = 2;
            while (true) {
                if (i7 >= i4) {
                    i7 = i9;
                    break;
                }
                zzary zzaryVar = zzaryVarArr[i7];
                int i10 = 0;
                while (true) {
                    int i11 = zzb.zza;
                    if (i10 <= 0) {
                        int zzG = zzaryVar.zzG(zzb.zzb(i10)) & 3;
                        if (zzG > i8) {
                            if (zzG == 3) {
                                break;
                            }
                            i9 = i7;
                            i8 = zzG;
                        }
                        i10++;
                    }
                }
                i7++;
                i4 = 2;
            }
            if (i7 == 2) {
                int i12 = zzb.zza;
                iArr = new int[1];
            } else {
                zzary zzaryVar2 = zzaryVarArr[i7];
                int i13 = zzb.zza;
                int[] iArr5 = new int[1];
                for (int i14 = 0; i14 <= 0; i14++) {
                    iArr5[i14] = zzaryVar2.zzG(zzb.zzb(i14));
                }
                iArr = iArr5;
            }
            int i15 = iArr2[i7];
            zzaxoVarArr[i7][i15] = zzb;
            iArr3[i7][i15] = iArr;
            iArr2[i7] = i15 + 1;
            i6++;
            i4 = 2;
        }
        zzaxp[] zzaxpVarArr = new zzaxp[2];
        int[] iArr6 = new int[2];
        int i16 = 0;
        for (int i17 = 2; i16 < i17; i17 = 2) {
            int i18 = iArr2[i16];
            zzaxpVarArr[i16] = new zzaxp((zzaxo[]) Arrays.copyOf(zzaxoVarArr[i16], i18));
            iArr3[i16] = (int[][]) Arrays.copyOf(iArr3[i16], i18);
            iArr6[i16] = zzaryVarArr[i16].zzc();
            i16++;
        }
        zzaxp zzaxpVar2 = new zzaxp((zzaxo[]) Arrays.copyOf(zzaxoVarArr[2], iArr2[2]));
        zzaxt[] zzb2 = zzb(zzaryVarArr, zzaxpVarArr, iArr3);
        int i19 = 0;
        for (int i20 = 2; i19 < i20; i20 = 2) {
            if (this.zzb.get(i19)) {
                zzb2[i19] = null;
            } else {
                zzaxp zzaxpVar3 = zzaxpVarArr[i19];
                Map map = (Map) this.zza.get(i19);
                if ((map == null ? null : (zzaxy) map.get(zzaxpVar3)) != null) {
                    throw null;
                }
            }
            i19++;
        }
        zzaxx zzaxxVar = new zzaxx(iArr6, zzaxpVarArr, iArr4, iArr3, zzaxpVar2);
        zzarz[] zzarzVarArr = new zzarz[2];
        for (int i21 = 0; i21 < 2; i21++) {
            zzarzVarArr[i21] = zzb2[i21] != null ? zzarz.zza : null;
        }
        return new zzaye(zzaxpVar, new zzayb(zzb2, null), zzaxxVar, zzarzVarArr);
    }

    @Override // com.google.android.gms.internal.ads.zzayd
    public final void zzd(Object obj) {
        this.zzc = (zzaxx) obj;
    }

    public final void zze(int i2, boolean z) {
        if (this.zzb.get(i2) == z) {
            return;
        }
        this.zzb.put(i2, z);
        zzg();
    }
}
