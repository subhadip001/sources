package com.google.android.gms.internal.ads;

import f.a.b.a.a;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfqs {
    public static int zza(int i2) {
        return (i2 + 1) * (i2 < 32 ? 4 : 2);
    }

    public static int zzb(Object obj, Object obj2, int i2, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i3;
        int i4;
        int zzb = zzfqz.zzb(obj);
        int i5 = zzb & i2;
        int zzc = zzc(obj3, i5);
        if (zzc != 0) {
            int i6 = ~i2;
            int i7 = zzb & i6;
            int i8 = -1;
            while (true) {
                i3 = zzc - 1;
                i4 = iArr[i3];
                if ((i4 & i6) != i7 || !zzfoo.zza(obj, objArr[i3]) || (objArr2 != null && !zzfoo.zza(obj2, objArr2[i3]))) {
                    int i9 = i4 & i2;
                    if (i9 == 0) {
                        break;
                    }
                    i8 = i3;
                    zzc = i9;
                }
            }
            int i10 = i4 & i2;
            if (i8 == -1) {
                zze(obj3, i5, i10);
            } else {
                iArr[i8] = (i10 & i2) | (iArr[i8] & i6);
            }
            return i3;
        }
        return -1;
    }

    public static int zzc(Object obj, int i2) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i2] & 255;
        }
        if (obj instanceof short[]) {
            return (char) ((short[]) obj)[i2];
        }
        return ((int[]) obj)[i2];
    }

    public static Object zzd(int i2) {
        if (i2 < 2 || i2 > 1073741824 || Integer.highestOneBit(i2) != i2) {
            throw new IllegalArgumentException(a.d(52, "must be power of 2 between 2^1 and 2^30: ", i2));
        }
        if (i2 <= 256) {
            return new byte[i2];
        }
        return i2 <= 65536 ? new short[i2] : new int[i2];
    }

    public static void zze(Object obj, int i2, int i3) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i2] = (byte) i3;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i2] = (short) i3;
        } else {
            ((int[]) obj)[i2] = i3;
        }
    }
}
