package com.google.android.gms.internal.ads;

import f.a.b.a.a;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzzl {
    public int zza;
    public String zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public int zzg;

    public final boolean zza(int i2) {
        boolean zzm;
        int i3;
        int i4;
        int i5;
        int i6;
        String[] strArr;
        int[] iArr;
        int zzl;
        int[] iArr2;
        int[] iArr3;
        int i7;
        int[] iArr4;
        int[] iArr5;
        int i8;
        int[] iArr6;
        zzm = zzzm.zzm(i2);
        if (!zzm || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0 || (i5 = (i2 >>> 12) & 15) == 0 || i5 == 15 || (i6 = (i2 >>> 10) & 3) == 3) {
            return false;
        }
        this.zza = i3;
        strArr = zzzm.zza;
        this.zzb = strArr[3 - i4];
        iArr = zzzm.zzb;
        int i9 = iArr[i6];
        this.zzd = i9;
        if (i3 == 2) {
            i9 /= 2;
            this.zzd = i9;
        } else if (i3 == 0) {
            i9 /= 4;
            this.zzd = i9;
        }
        int i10 = (i2 >>> 9) & 1;
        zzl = zzzm.zzl(i3, i4);
        this.zzg = zzl;
        if (i4 == 3) {
            if (i3 == 3) {
                iArr6 = zzzm.zzc;
                i8 = iArr6[i5 - 1];
            } else {
                iArr5 = zzzm.zzd;
                i8 = iArr5[i5 - 1];
            }
            this.zzf = i8;
            this.zzc = (((i8 * 12) / i9) + i10) * 4;
        } else {
            if (i3 == 3) {
                if (i4 == 2) {
                    iArr4 = zzzm.zze;
                    i7 = iArr4[i5 - 1];
                } else {
                    iArr3 = zzzm.zzf;
                    i7 = iArr3[i5 - 1];
                }
                this.zzf = i7;
                this.zzc = a.m(i7, 144, i9, i10);
            } else {
                iArr2 = zzzm.zzg;
                int i11 = iArr2[i5 - 1];
                this.zzf = i11;
                this.zzc = a.m(i4 == 1 ? 72 : 144, i11, i9, i10);
            }
        }
        this.zze = ((i2 >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
