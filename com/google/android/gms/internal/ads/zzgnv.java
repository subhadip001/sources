package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgnv extends zzgnu {
    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
        if (r13[r14] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0047, code lost:
        if (r13[r14] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0083, code lost:
        if (r13[r14] <= (-65)) goto L11;
     */
    @Override // com.google.android.gms.internal.ads.zzgnu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(int r12, byte[] r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgnv.zza(int, byte[], int, int):int");
    }

    @Override // com.google.android.gms.internal.ads.zzgnu
    public final String zzb(byte[] bArr, int i2, int i3) {
        int length = bArr.length;
        if ((i2 | i3 | ((length - i2) - i3)) >= 0) {
            int i4 = i2 + i3;
            char[] cArr = new char[i3];
            int i5 = 0;
            while (i2 < i4) {
                byte b = bArr[i2];
                if (!zzgnt.zzd(b)) {
                    break;
                }
                i2++;
                cArr[i5] = (char) b;
                i5++;
            }
            while (i2 < i4) {
                int i6 = i2 + 1;
                byte b2 = bArr[i2];
                if (zzgnt.zzd(b2)) {
                    int i7 = i5 + 1;
                    cArr[i5] = (char) b2;
                    i2 = i6;
                    while (true) {
                        i5 = i7;
                        if (i2 < i4) {
                            byte b3 = bArr[i2];
                            if (!zzgnt.zzd(b3)) {
                                break;
                            }
                            i2++;
                            i7 = i5 + 1;
                            cArr[i5] = (char) b3;
                        }
                    }
                } else if (zzgnt.zzf(b2)) {
                    if (i6 < i4) {
                        zzgnt.zzc(b2, bArr[i6], cArr, i5);
                        i2 = i6 + 1;
                        i5++;
                    } else {
                        throw zzgla.zzd();
                    }
                } else if (zzgnt.zze(b2)) {
                    if (i6 < i4 - 1) {
                        int i8 = i6 + 1;
                        zzgnt.zzb(b2, bArr[i6], bArr[i8], cArr, i5);
                        i2 = i8 + 1;
                        i5++;
                    } else {
                        throw zzgla.zzd();
                    }
                } else if (i6 < i4 - 2) {
                    int i9 = i6 + 1;
                    int i10 = i9 + 1;
                    zzgnt.zza(b2, bArr[i6], bArr[i9], bArr[i10], cArr, i5);
                    i5 += 2;
                    i2 = i10 + 1;
                } else {
                    throw zzgla.zzd();
                }
            }
            return new String(cArr, 0, i5);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i2), Integer.valueOf(i3)));
    }
}
