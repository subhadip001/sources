package com.google.android.gms.internal.ads;

import f.a.b.a.a;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgnx {
    private static final zzgnu zza;

    static {
        if (zzgns.zzA() && zzgns.zzB()) {
            int i2 = zzgir.zza;
        }
        zza = new zzgnv();
    }

    public static /* bridge */ /* synthetic */ int zzc(byte[] bArr, int i2, int i3) {
        byte b = bArr[i2 - 1];
        int i4 = i3 - i2;
        if (i4 == 0) {
            if (b > -12) {
                return -1;
            }
            return b;
        } else if (i4 != 1) {
            if (i4 == 2) {
                return zzl(b, bArr[i2], bArr[i2 + 1]);
            }
            throw new AssertionError();
        } else {
            return zzk(b, bArr[i2]);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00fe, code lost:
        return r9 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int zzd(java.lang.CharSequence r7, byte[] r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgnx.zzd(java.lang.CharSequence, byte[], int, int):int");
    }

    public static int zze(CharSequence charSequence) {
        int length = charSequence.length();
        int i2 = 0;
        int i3 = 0;
        while (i3 < length && charSequence.charAt(i3) < 128) {
            i3++;
        }
        int i4 = length;
        while (true) {
            if (i3 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i3);
            if (charAt < 2048) {
                i4 += (127 - charAt) >>> 31;
                i3++;
            } else {
                int length2 = charSequence.length();
                while (i3 < length2) {
                    char charAt2 = charSequence.charAt(i3);
                    if (charAt2 < 2048) {
                        i2 += (127 - charAt2) >>> 31;
                    } else {
                        i2 += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i3) < 65536) {
                                throw new zzgnw(i3, length2);
                            }
                            i3++;
                        }
                    }
                    i3++;
                }
                i4 += i2;
            }
        }
        if (i4 >= length) {
            return i4;
        }
        StringBuilder A = a.A("UTF-8 length does not fit in int: ");
        A.append(i4 + 4294967296L);
        throw new IllegalArgumentException(A.toString());
    }

    public static int zzf(int i2, byte[] bArr, int i3, int i4) {
        return zza.zza(i2, bArr, i3, i4);
    }

    public static String zzg(ByteBuffer byteBuffer, int i2, int i3) {
        zzgnu zzgnuVar = zza;
        if (byteBuffer.hasArray()) {
            return zzgnuVar.zzb(byteBuffer.array(), byteBuffer.arrayOffset() + i2, i3);
        } else if (byteBuffer.isDirect()) {
            return zzgnu.zzd(byteBuffer, i2, i3);
        } else {
            return zzgnu.zzd(byteBuffer, i2, i3);
        }
    }

    public static String zzh(byte[] bArr, int i2, int i3) {
        return zza.zzb(bArr, i2, i3);
    }

    public static boolean zzi(byte[] bArr) {
        return zza.zzc(bArr, 0, bArr.length);
    }

    public static boolean zzj(byte[] bArr, int i2, int i3) {
        return zza.zzc(bArr, i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzk(int i2, int i3) {
        if (i2 > -12 || i3 > -65) {
            return -1;
        }
        return i2 ^ (i3 << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzl(int i2, int i3, int i4) {
        if (i2 > -12 || i3 > -65 || i4 > -65) {
            return -1;
        }
        return (i2 ^ (i3 << 8)) ^ (i4 << 16);
    }
}
