package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public final class zzmp {
    private static final zzmp zza = new zzmp(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzmp() {
        this(0, new int[8], new Object[8], true);
    }

    private zzmp(int i2, int[] iArr, Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = i2;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }

    public static zzmp zzc() {
        return zza;
    }

    public static zzmp zze(zzmp zzmpVar, zzmp zzmpVar2) {
        int i2 = zzmpVar.zzb + zzmpVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzmpVar.zzc, i2);
        System.arraycopy(zzmpVar2.zzc, 0, copyOf, zzmpVar.zzb, zzmpVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzmpVar.zzd, i2);
        System.arraycopy(zzmpVar2.zzd, 0, copyOf2, zzmpVar.zzb, zzmpVar2.zzb);
        return new zzmp(i2, copyOf, copyOf2, true);
    }

    public static zzmp zzf() {
        return new zzmp(0, new int[8], new Object[8], true);
    }

    private final void zzl(int i2) {
        int[] iArr = this.zzc;
        if (i2 > iArr.length) {
            int i3 = this.zzb;
            int i4 = (i3 / 2) + i3;
            if (i4 >= i2) {
                i2 = i4;
            }
            if (i2 < 8) {
                i2 = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i2);
            this.zzd = Arrays.copyOf(this.zzd, i2);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof zzmp)) {
            zzmp zzmpVar = (zzmp) obj;
            int i2 = this.zzb;
            if (i2 == zzmpVar.zzb) {
                int[] iArr = this.zzc;
                int[] iArr2 = zzmpVar.zzc;
                int i3 = 0;
                while (true) {
                    if (i3 >= i2) {
                        Object[] objArr = this.zzd;
                        Object[] objArr2 = zzmpVar.zzd;
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
        int zzA;
        int zzB;
        int zzA2;
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
                        zzA2 = zzjm.zzA(i6 << 3) + 8;
                    } else if (i7 == 2) {
                        int zzA3 = zzjm.zzA(i6 << 3);
                        int zzd = ((zzje) this.zzd[i4]).zzd();
                        i3 = zzjm.zzA(zzd) + zzd + zzA3 + i3;
                    } else if (i7 == 3) {
                        int zzz = zzjm.zzz(i6);
                        zzA = zzz + zzz;
                        zzB = ((zzmp) this.zzd[i4]).zza();
                    } else if (i7 == 5) {
                        ((Integer) this.zzd[i4]).intValue();
                        zzA2 = zzjm.zzA(i6 << 3) + 4;
                    } else {
                        throw new IllegalStateException(zzkp.zza());
                    }
                    i3 = zzA2 + i3;
                } else {
                    long longValue = ((Long) this.zzd[i4]).longValue();
                    zzA = zzjm.zzA(i6 << 3);
                    zzB = zzjm.zzB(longValue);
                }
                i3 = zzB + zzA + i3;
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
                int zzA = zzjm.zzA(8);
                int zzd = ((zzje) this.zzd[i4]).zzd();
                i3 += zzjm.zzA(zzd) + zzd + zzjm.zzA(24) + zzjm.zzA(i5 >>> 3) + zzjm.zzA(16) + zzA + zzA;
            }
            this.zze = i3;
            return i3;
        }
        return i2;
    }

    public final zzmp zzd(zzmp zzmpVar) {
        if (zzmpVar.equals(zza)) {
            return this;
        }
        zzg();
        int i2 = this.zzb + zzmpVar.zzb;
        zzl(i2);
        System.arraycopy(zzmpVar.zzc, 0, this.zzc, this.zzb, zzmpVar.zzb);
        System.arraycopy(zzmpVar.zzd, 0, this.zzd, this.zzb, zzmpVar.zzb);
        this.zzb = i2;
        return this;
    }

    public final void zzg() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzh() {
        this.zzf = false;
    }

    public final void zzi(StringBuilder sb, int i2) {
        for (int i3 = 0; i3 < this.zzb; i3++) {
            zzlo.zzb(sb, i2, String.valueOf(this.zzc[i3] >>> 3), this.zzd[i3]);
        }
    }

    public final void zzj(int i2, Object obj) {
        zzg();
        zzl(this.zzb + 1);
        int[] iArr = this.zzc;
        int i3 = this.zzb;
        iArr[i3] = i2;
        this.zzd[i3] = obj;
        this.zzb = i3 + 1;
    }

    public final void zzk(zzng zzngVar) {
        if (this.zzb != 0) {
            for (int i2 = 0; i2 < this.zzb; i2++) {
                int i3 = this.zzc[i2];
                Object obj = this.zzd[i2];
                int i4 = i3 >>> 3;
                int i5 = i3 & 7;
                if (i5 == 0) {
                    zzngVar.zzt(i4, ((Long) obj).longValue());
                } else if (i5 == 1) {
                    zzngVar.zzm(i4, ((Long) obj).longValue());
                } else if (i5 == 2) {
                    zzngVar.zzd(i4, (zzje) obj);
                } else if (i5 == 3) {
                    zzngVar.zzE(i4);
                    ((zzmp) obj).zzk(zzngVar);
                    zzngVar.zzh(i4);
                } else if (i5 == 5) {
                    zzngVar.zzk(i4, ((Integer) obj).intValue());
                } else {
                    throw new RuntimeException(zzkp.zza());
                }
            }
        }
    }
}
