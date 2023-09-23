package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public final class zznb extends zzna {
    @Override // com.google.android.gms.internal.measurement.zzna
    public final int zza(int i2, byte[] bArr, int i3, int i4) {
        while (i3 < i4 && bArr[i3] >= 0) {
            i3++;
        }
        if (i3 >= i4) {
            return 0;
        }
        while (i3 < i4) {
            int i5 = i3 + 1;
            byte b = bArr[i3];
            if (b < 0) {
                if (b < -32) {
                    if (i5 < i4) {
                        if (b >= -62) {
                            i3 = i5 + 1;
                            if (bArr[i5] > -65) {
                            }
                        }
                        return -1;
                    }
                    return b;
                }
                if (b < -16) {
                    if (i5 >= i4 - 1) {
                        return zznd.zza(bArr, i5, i4);
                    }
                    int i6 = i5 + 1;
                    byte b2 = bArr[i5];
                    if (b2 <= -65 && ((b != -32 || b2 >= -96) && (b != -19 || b2 < -96))) {
                        i3 = i6 + 1;
                        if (bArr[i6] > -65) {
                        }
                    }
                } else if (i5 >= i4 - 2) {
                    return zznd.zza(bArr, i5, i4);
                } else {
                    int i7 = i5 + 1;
                    byte b3 = bArr[i5];
                    if (b3 <= -65) {
                        if ((((b3 + 112) + (b << 28)) >> 30) == 0) {
                            int i8 = i7 + 1;
                            if (bArr[i7] <= -65) {
                                i5 = i8 + 1;
                                if (bArr[i8] > -65) {
                                }
                            }
                        }
                    }
                }
                return -1;
            }
            i3 = i5;
        }
        return 0;
    }
}
