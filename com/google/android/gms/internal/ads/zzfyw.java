package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import javax.crypto.AEADBadTagException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzfyw {
    private final zzfyu zza;
    private final zzfyu zzb;

    public zzfyw(byte[] bArr) {
        if (zzfzc.zza(1)) {
            this.zza = zza(bArr, 1);
            this.zzb = zza(bArr, 0);
            return;
        }
        throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
    }

    private final byte[] zze(byte[] bArr) {
        byte[] bArr2 = new byte[32];
        this.zzb.zzc(bArr, 0).get(bArr2);
        return bArr2;
    }

    private static byte[] zzf(byte[] bArr, ByteBuffer byteBuffer) {
        int length = bArr.length;
        int i2 = length & 15;
        int i3 = i2 == 0 ? length : (length + 16) - i2;
        int remaining = byteBuffer.remaining();
        int i4 = remaining % 16;
        int i5 = (i4 == 0 ? remaining : (remaining + 16) - i4) + i3;
        ByteBuffer order = ByteBuffer.allocate(i5 + 16).order(ByteOrder.LITTLE_ENDIAN);
        order.put(bArr);
        order.position(i3);
        order.put(byteBuffer);
        order.position(i5);
        order.putLong(length);
        order.putLong(remaining);
        return order.array();
    }

    public abstract zzfyu zza(byte[] bArr, int i2);

    public final void zzb(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (byteBuffer.remaining() >= bArr2.length + 16) {
            int position = byteBuffer.position();
            this.zza.zzd(byteBuffer, bArr, bArr2);
            byteBuffer.position(position);
            byteBuffer.limit(byteBuffer.limit() - 16);
            byte[] zza = zzfyz.zza(zze(bArr), zzf(bArr3, byteBuffer));
            byteBuffer.limit(byteBuffer.limit() + 16);
            byteBuffer.put(zza);
            return;
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }

    public final byte[] zzc(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        if (byteBuffer.remaining() >= 16) {
            int position = byteBuffer.position();
            byte[] bArr3 = new byte[16];
            byteBuffer.position(byteBuffer.limit() - 16);
            byteBuffer.get(bArr3);
            byteBuffer.position(position);
            byteBuffer.limit(byteBuffer.limit() - 16);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            try {
                if (zzghf.zzb(zzfyz.zza(zze(bArr), zzf(bArr2, byteBuffer)), bArr3)) {
                    byteBuffer.position(position);
                    return this.zza.zze(bArr, byteBuffer);
                }
                throw new GeneralSecurityException("invalid MAC");
            } catch (GeneralSecurityException e2) {
                throw new AEADBadTagException(e2.toString());
            }
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    public final byte[] zzd(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int length = bArr2.length;
        if (length <= 2147483631) {
            ByteBuffer allocate = ByteBuffer.allocate(length + 16);
            zzb(allocate, bArr, bArr2, bArr3);
            return allocate.array();
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
