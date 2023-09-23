package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes.dex */
public final class HexDumpUtils {
    @KeepForSdk
    public static String dump(byte[] bArr, int i2, int i3, boolean z) {
        int length;
        if (bArr == null || (length = bArr.length) == 0 || i2 < 0 || i3 <= 0 || i2 + i3 > length) {
            return null;
        }
        StringBuilder sb = new StringBuilder(((i3 + 15) / 16) * (z ? 75 : 57));
        int i4 = i3;
        int i5 = 0;
        int i6 = 0;
        while (i4 > 0) {
            if (i5 == 0) {
                if (i3 < 65536) {
                    sb.append(String.format("%04X:", Integer.valueOf(i2)));
                } else {
                    sb.append(String.format("%08X:", Integer.valueOf(i2)));
                }
                i6 = i2;
            } else if (i5 == 8) {
                sb.append(" -");
            }
            sb.append(String.format(" %02X", Integer.valueOf(bArr[i2] & 255)));
            i4--;
            i5++;
            if (z && (i5 == 16 || i4 == 0)) {
                int i7 = 16 - i5;
                if (i7 > 0) {
                    for (int i8 = 0; i8 < i7; i8++) {
                        sb.append("   ");
                    }
                }
                if (i7 >= 8) {
                    sb.append("  ");
                }
                sb.append("  ");
                for (int i9 = 0; i9 < i5; i9++) {
                    char c = (char) bArr[i6 + i9];
                    if (c < ' ' || c > '~') {
                        c = '.';
                    }
                    sb.append(c);
                }
            }
            if (i5 == 16 || i4 == 0) {
                sb.append('\n');
                i5 = 0;
            }
            i2++;
        }
        return sb.toString();
    }
}
