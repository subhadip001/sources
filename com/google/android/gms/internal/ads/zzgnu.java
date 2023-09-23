package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzgnu {
    public static final String zzd(ByteBuffer byteBuffer, int i2, int i3) {
        if ((i2 | i3 | ((byteBuffer.limit() - i2) - i3)) >= 0) {
            int i4 = i2 + i3;
            char[] cArr = new char[i3];
            int i5 = 0;
            while (i2 < i4) {
                byte b = byteBuffer.get(i2);
                if (!zzgnt.zzd(b)) {
                    break;
                }
                i2++;
                cArr[i5] = (char) b;
                i5++;
            }
            int i6 = i5;
            while (i2 < i4) {
                int i7 = i2 + 1;
                byte b2 = byteBuffer.get(i2);
                if (zzgnt.zzd(b2)) {
                    int i8 = i6 + 1;
                    cArr[i6] = (char) b2;
                    i2 = i7;
                    while (true) {
                        i6 = i8;
                        if (i2 < i4) {
                            byte b3 = byteBuffer.get(i2);
                            if (!zzgnt.zzd(b3)) {
                                break;
                            }
                            i2++;
                            i8 = i6 + 1;
                            cArr[i6] = (char) b3;
                        }
                    }
                } else if (zzgnt.zzf(b2)) {
                    if (i7 < i4) {
                        zzgnt.zzc(b2, byteBuffer.get(i7), cArr, i6);
                        i2 = i7 + 1;
                        i6++;
                    } else {
                        throw zzgla.zzd();
                    }
                } else if (zzgnt.zze(b2)) {
                    if (i7 < i4 - 1) {
                        int i9 = i7 + 1;
                        zzgnt.zzb(b2, byteBuffer.get(i7), byteBuffer.get(i9), cArr, i6);
                        i2 = i9 + 1;
                        i6++;
                    } else {
                        throw zzgla.zzd();
                    }
                } else if (i7 < i4 - 2) {
                    int i10 = i7 + 1;
                    int i11 = i10 + 1;
                    zzgnt.zza(b2, byteBuffer.get(i7), byteBuffer.get(i10), byteBuffer.get(i11), cArr, i6);
                    i6 += 2;
                    i2 = i11 + 1;
                } else {
                    throw zzgla.zzd();
                }
            }
            return new String(cArr, 0, i6);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i2), Integer.valueOf(i3)));
    }

    public abstract int zza(int i2, byte[] bArr, int i3, int i4);

    public abstract String zzb(byte[] bArr, int i2, int i3);

    public final boolean zzc(byte[] bArr, int i2, int i3) {
        return zza(0, bArr, i2, i3) == 0;
    }
}
