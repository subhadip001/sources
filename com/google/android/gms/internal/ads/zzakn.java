package com.google.android.gms.internal.ads;

import com.google.firebase.database.tubesock.WebSocket;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzakn {
    public static double zza(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        return (((((bArr[0] << 24) & (-16777216)) | ((bArr[1] << 16) & 16711680)) | ((bArr[2] << 8) & 65280)) | (bArr[3] & 255)) / 1.073741824E9d;
    }

    public static double zzb(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        return (((((bArr[0] << 24) & (-16777216)) | ((bArr[1] << 16) & 16711680)) | ((bArr[2] << 8) & 65280)) | (bArr[3] & 255)) / 65536.0d;
    }

    public static int zzc(byte b) {
        return b < 0 ? b + WebSocket.OPCODE_NONE : b;
    }

    public static int zzd(ByteBuffer byteBuffer) {
        return zzc(byteBuffer.get()) + (zzc(byteBuffer.get()) << 8);
    }

    public static long zze(ByteBuffer byteBuffer) {
        long j2 = byteBuffer.getInt();
        return j2 < 0 ? j2 + 4294967296L : j2;
    }

    public static long zzf(ByteBuffer byteBuffer) {
        long zze = zze(byteBuffer) << 32;
        if (zze >= 0) {
            return zze(byteBuffer) + zze;
        }
        throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
    }
}
