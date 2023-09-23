package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbbs extends zzbbn {
    private MessageDigest zzb;

    @Override // com.google.android.gms.internal.ads.zzbbn
    public final byte[] zzb(String str) {
        byte[] bArr;
        byte[] bArr2;
        String[] split = str.split(" ");
        int length = split.length;
        int i2 = 4;
        if (length == 1) {
            int zza = zzbbr.zza(split[0]);
            ByteBuffer allocate = ByteBuffer.allocate(4);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(zza);
            bArr2 = allocate.array();
        } else {
            if (length < 5) {
                bArr = new byte[length + length];
                for (int i3 = 0; i3 < split.length; i3++) {
                    int zza2 = zzbbr.zza(split[i3]);
                    int i4 = (zza2 >> 16) ^ ((char) zza2);
                    byte[] bArr3 = {(byte) i4, (byte) (i4 >> 8)};
                    int i5 = i3 + i3;
                    bArr[i5] = bArr3[0];
                    bArr[i5 + 1] = bArr3[1];
                }
            } else {
                bArr = new byte[length];
                for (int i6 = 0; i6 < split.length; i6++) {
                    int zza3 = zzbbr.zza(split[i6]);
                    bArr[i6] = (byte) ((zza3 >> 24) ^ (((zza3 & 255) ^ ((zza3 >> 8) & 255)) ^ ((zza3 >> 16) & 255)));
                }
            }
            bArr2 = bArr;
        }
        this.zzb = zza();
        synchronized (this.zza) {
            MessageDigest messageDigest = this.zzb;
            if (messageDigest == null) {
                return new byte[0];
            }
            messageDigest.reset();
            this.zzb.update(bArr2);
            byte[] digest = this.zzb.digest();
            int length2 = digest.length;
            if (length2 <= 4) {
                i2 = length2;
            }
            byte[] bArr4 = new byte[i2];
            System.arraycopy(digest, 0, bArr4, 0, i2);
            return bArr4;
        }
    }
}
