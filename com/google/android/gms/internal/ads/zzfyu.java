package com.google.android.gms.internal.ads;

import f.a.b.a.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzfyu {
    public int[] zza;
    private final int zzb;

    public zzfyu(byte[] bArr, int i2) {
        if (bArr.length == 32) {
            this.zza = zzfyq.zzd(bArr);
            this.zzb = i2;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    private final void zzf(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        if (bArr.length == zza()) {
            int remaining = byteBuffer2.remaining();
            int i2 = (remaining / 64) + 1;
            for (int i3 = 0; i3 < i2; i3++) {
                ByteBuffer zzc = zzc(bArr, this.zzb + i3);
                if (i3 == i2 - 1) {
                    zzghf.zza(byteBuffer, byteBuffer2, zzc, remaining % 64);
                } else {
                    zzghf.zza(byteBuffer, byteBuffer2, zzc, 64);
                }
            }
            return;
        }
        StringBuilder A = a.A("The nonce length (in bytes) must be ");
        A.append(zza());
        throw new GeneralSecurityException(A.toString());
    }

    public abstract int zza();

    public abstract int[] zzb(int[] iArr, int i2);

    public final ByteBuffer zzc(byte[] bArr, int i2) {
        int[] zzb = zzb(zzfyq.zzd(bArr), i2);
        int[] iArr = (int[]) zzb.clone();
        zzfyq.zzc(iArr);
        for (int i3 = 0; i3 < 16; i3++) {
            zzb[i3] = zzb[i3] + iArr[i3];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(zzb, 0, 16);
        return order;
    }

    public final void zzd(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        if (byteBuffer.remaining() >= bArr2.length) {
            zzf(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
            return;
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }

    public final byte[] zze(byte[] bArr, ByteBuffer byteBuffer) {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        zzf(bArr, allocate, byteBuffer);
        return allocate.array();
    }
}
