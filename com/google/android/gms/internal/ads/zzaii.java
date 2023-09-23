package com.google.android.gms.internal.ads;

import android.util.Pair;
import f.a.b.a.a;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzaii {
    public static long zza(ByteBuffer byteBuffer) {
        zzg(byteBuffer);
        return zze(byteBuffer, byteBuffer.position() + 16);
    }

    public static long zzb(ByteBuffer byteBuffer) {
        zzg(byteBuffer);
        return zze(byteBuffer, byteBuffer.position() + 12);
    }

    public static Pair zzc(RandomAccessFile randomAccessFile) {
        if (randomAccessFile.length() < 22) {
            return null;
        }
        Pair zzf = zzf(randomAccessFile, 0);
        return zzf != null ? zzf : zzf(randomAccessFile, 65535);
    }

    public static void zzd(ByteBuffer byteBuffer, long j2) {
        zzg(byteBuffer);
        int position = byteBuffer.position() + 16;
        if (j2 >= 0 && j2 <= 4294967295L) {
            byteBuffer.putInt(byteBuffer.position() + position, (int) j2);
            return;
        }
        throw new IllegalArgumentException(a.l("uint32 value of out range: ", j2));
    }

    private static long zze(ByteBuffer byteBuffer, int i2) {
        return byteBuffer.getInt(i2) & 4294967295L;
    }

    private static Pair zzf(RandomAccessFile randomAccessFile, int i2) {
        int i3;
        long length = randomAccessFile.length();
        if (length < 22) {
            return null;
        }
        ByteBuffer allocate = ByteBuffer.allocate(((int) Math.min(i2, (-22) + length)) + 22);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        long capacity = length - allocate.capacity();
        randomAccessFile.seek(capacity);
        randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
        zzg(allocate);
        int capacity2 = allocate.capacity();
        if (capacity2 >= 22) {
            int i4 = capacity2 - 22;
            int min = Math.min(i4, 65535);
            for (int i5 = 0; i5 < min; i5++) {
                i3 = i4 - i5;
                if (allocate.getInt(i3) == 101010256 && ((char) allocate.getShort(i3 + 20)) == i5) {
                    break;
                }
            }
        }
        i3 = -1;
        if (i3 == -1) {
            return null;
        }
        allocate.position(i3);
        ByteBuffer slice = allocate.slice();
        slice.order(ByteOrder.LITTLE_ENDIAN);
        return Pair.create(slice, Long.valueOf(capacity + i3));
    }

    private static void zzg(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }
}
