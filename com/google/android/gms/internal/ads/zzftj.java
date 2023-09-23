package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Objects;
import java.util.Queue;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzftj {
    private static final OutputStream zza = new zzfti();

    public static byte[] zza(InputStream inputStream) {
        Objects.requireNonNull(inputStream);
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int highestOneBit = Integer.highestOneBit(0);
        int min = Math.min(8192, Math.max(128, highestOneBit + highestOneBit));
        int i2 = 0;
        while (i2 < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i2);
            byte[] bArr = new byte[min2];
            arrayDeque.add(bArr);
            int i3 = 0;
            while (i3 < min2) {
                int read = inputStream.read(bArr, i3, min2 - i3);
                if (read == -1) {
                    return zzb(arrayDeque, i2);
                }
                i3 += read;
                i2 += read;
            }
            long j2 = min * (min < 4096 ? 4 : 2);
            min = j2 > 2147483647L ? Api.BaseClientBuilder.API_PRIORITY_OTHER : j2 < -2147483648L ? Integer.MIN_VALUE : (int) j2;
        }
        if (inputStream.read() == -1) {
            return zzb(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    private static byte[] zzb(Queue queue, int i2) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) queue.remove();
        int length = bArr.length;
        if (length == i2) {
            return bArr;
        }
        int i3 = i2 - length;
        byte[] copyOf = Arrays.copyOf(bArr, i2);
        while (i3 > 0) {
            byte[] bArr2 = (byte[]) queue.remove();
            int min = Math.min(i3, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i2 - i3, min);
            i3 -= min;
        }
        return copyOf;
    }
}
