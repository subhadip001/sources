package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgnj {
    private static final zzgnj zza = new zzgnj(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzgnj() {
        this(0, new int[8], new Object[8], true);
    }

    private zzgnj(int i2, int[] iArr, Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = i2;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }

    public static zzgnj zzc() {
        return zza;
    }

    public static zzgnj zzd(zzgnj zzgnjVar, zzgnj zzgnjVar2) {
        int i2 = zzgnjVar.zzb + zzgnjVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzgnjVar.zzc, i2);
        System.arraycopy(zzgnjVar2.zzc, 0, copyOf, zzgnjVar.zzb, zzgnjVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzgnjVar.zzd, i2);
        System.arraycopy(zzgnjVar2.zzd, 0, copyOf2, zzgnjVar.zzb, zzgnjVar2.zzb);
        return new zzgnj(i2, copyOf, copyOf2, true);
    }

    public static zzgnj zze() {
        return new zzgnj(0, new int[8], new Object[8], true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof zzgnj)) {
            zzgnj zzgnjVar = (zzgnj) obj;
            int i2 = this.zzb;
            if (i2 == zzgnjVar.zzb) {
                int[] iArr = this.zzc;
                int[] iArr2 = zzgnjVar.zzc;
                int i3 = 0;
                while (true) {
                    if (i3 >= i2) {
                        Object[] objArr = this.zzd;
                        Object[] objArr2 = zzgnjVar.zzd;
                        int i4 = this.zzb;
                        for (int i5 = 0; i5 < i4; i5++) {
                            if (objArr[i5].equals(objArr2[i5])) {
                            }
                        }
                        return true;
                    } else if (iArr[i3] != iArr2[i3]) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.zzb;
        int i3 = (i2 + 527) * 31;
        int[] iArr = this.zzc;
        int i4 = 17;
        int i5 = 17;
        for (int i6 = 0; i6 < i2; i6++) {
            i5 = (i5 * 31) + iArr[i6];
        }
        int i7 = (i3 + i5) * 31;
        Object[] objArr = this.zzd;
        int i8 = this.zzb;
        for (int i9 = 0; i9 < i8; i9++) {
            i4 = (i4 * 31) + objArr[i9].hashCode();
        }
        return i7 + i4;
    }

    public final int zza() {
        int zzE;
        int zzF;
        int zzE2;
        int i2 = this.zze;
        if (i2 == -1) {
            int i3 = 0;
            for (int i4 = 0; i4 < this.zzb; i4++) {
                int i5 = this.zzc[i4];
                int i6 = i5 >>> 3;
                int i7 = i5 & 7;
                if (i7 != 0) {
                    if (i7 == 1) {
                        ((Long) this.zzd[i4]).longValue();
                        zzE2 = zzgjv.zzE(i6 << 3) + 8;
                    } else if (i7 == 2) {
                        int zzE3 = zzgjv.zzE(i6 << 3);
                        int zzd = ((zzgjg) this.zzd[i4]).zzd();
                        i3 = zzgjv.zzE(zzd) + zzd + zzE3 + i3;
                    } else if (i7 == 3) {
                        int zzD = zzgjv.zzD(i6);
                        zzE = zzD + zzD;
                        zzF = ((zzgnj) this.zzd[i4]).zza();
                    } else if (i7 == 5) {
                        ((Integer) this.zzd[i4]).intValue();
                        zzE2 = zzgjv.zzE(i6 << 3) + 4;
                    } else {
                        throw new IllegalStateException(zzgla.zza());
                    }
                    i3 = zzE2 + i3;
                } else {
                    long longValue = ((Long) this.zzd[i4]).longValue();
                    zzE = zzgjv.zzE(i6 << 3);
                    zzF = zzgjv.zzF(longValue);
                }
                i3 = zzF + zzE + i3;
            }
            this.zze = i3;
            return i3;
        }
        return i2;
    }

    public final int zzb() {
        int i2 = this.zze;
        if (i2 == -1) {
            int i3 = 0;
            for (int i4 = 0; i4 < this.zzb; i4++) {
                int i5 = this.zzc[i4];
                int zzE = zzgjv.zzE(8);
                int zzd = ((zzgjg) this.zzd[i4]).zzd();
                i3 += zzgjv.zzE(zzd) + zzd + zzgjv.zzE(24) + zzgjv.zzE(i5 >>> 3) + zzgjv.zzE(16) + zzE + zzE;
            }
            this.zze = i3;
            return i3;
        }
        return i2;
    }

    public final void zzf() {
        this.zzf = false;
    }

    public final void zzg(StringBuilder sb, int i2) {
        for (int i3 = 0; i3 < this.zzb; i3++) {
            zzgma.zzb(sb, i2, String.valueOf(this.zzc[i3] >>> 3), this.zzd[i3]);
        }
    }

    public final void zzh(int i2, Object obj) {
        if (this.zzf) {
            int i3 = this.zzb;
            int[] iArr = this.zzc;
            if (i3 == iArr.length) {
                int i4 = i3 + (i3 < 4 ? 8 : i3 >> 1);
                this.zzc = Arrays.copyOf(iArr, i4);
                this.zzd = Arrays.copyOf(this.zzd, i4);
            }
            int[] iArr2 = this.zzc;
            int i5 = this.zzb;
            iArr2[i5] = i2;
            this.zzd[i5] = obj;
            this.zzb = i5 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void zzi(zzgjw zzgjwVar) {
        if (this.zzb != 0) {
            for (int i2 = 0; i2 < this.zzb; i2++) {
                int i3 = this.zzc[i2];
                Object obj = this.zzd[i2];
                int i4 = i3 >>> 3;
                int i5 = i3 & 7;
                if (i5 == 0) {
                    zzgjwVar.zzt(i4, ((Long) obj).longValue());
                } else if (i5 == 1) {
                    zzgjwVar.zzm(i4, ((Long) obj).longValue());
                } else if (i5 == 2) {
                    zzgjwVar.zzd(i4, (zzgjg) obj);
                } else if (i5 == 3) {
                    zzgjwVar.zzE(i4);
                    ((zzgnj) obj).zzi(zzgjwVar);
                    zzgjwVar.zzh(i4);
                } else if (i5 == 5) {
                    zzgjwVar.zzk(i4, ((Integer) obj).intValue());
                } else {
                    throw new RuntimeException(zzgla.zza());
                }
            }
        }
    }
}
