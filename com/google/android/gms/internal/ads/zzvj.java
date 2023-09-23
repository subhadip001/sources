package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzvj {
    private final String[] zza;
    private final int[] zzb;
    private final zztz[] zzc;
    private final int[] zzd;
    private final int[][][] zze;
    private final zztz zzf;

    public zzvj(String[] strArr, int[] iArr, zztz[] zztzVarArr, int[] iArr2, int[][][] iArr3, zztz zztzVar) {
        this.zza = strArr;
        this.zzb = iArr;
        this.zzc = zztzVarArr;
        this.zze = iArr3;
        this.zzd = iArr2;
        this.zzf = zztzVar;
    }

    public final int zza(int i2, int i3, boolean z) {
        int i4 = this.zzc[i2].zzb(i3).zzb;
        int[] iArr = new int[1];
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 <= 0; i7++) {
            if ((this.zze[i2][i3][i7] & 7) == 4) {
                iArr[i6] = i7;
                i6++;
            }
        }
        int[] copyOf = Arrays.copyOf(iArr, i6);
        String str = null;
        boolean z2 = false;
        int i8 = 0;
        int i9 = 16;
        while (i5 < copyOf.length) {
            String str2 = this.zzc[i2].zzb(i3).zzb(copyOf[i5]).zzm;
            int i10 = i8 + 1;
            if (i8 != 0) {
                z2 |= !zzeg.zzS(str, str2);
            } else {
                str = str2;
            }
            i9 = Math.min(i9, this.zze[i2][i3][i5] & 24);
            i5++;
            i8 = i10;
        }
        return z2 ? Math.min(i9, this.zzd[i2]) : i9;
    }

    public final int zzb(int i2, int i3, int i4) {
        return this.zze[i2][i3][i4];
    }

    public final int zzc(int i2) {
        return this.zzb[i2];
    }

    public final zztz zzd(int i2) {
        return this.zzc[i2];
    }

    public final zztz zze() {
        return this.zzf;
    }
}
