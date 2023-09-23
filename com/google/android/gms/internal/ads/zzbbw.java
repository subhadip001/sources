package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.MessageDigest;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbbw extends zzbbn {
    private MessageDigest zzb;
    private final int zzc;
    private final int zzd;

    public zzbbw(int i2) {
        int i3 = i2 >> 3;
        this.zzc = (i2 & 7) > 0 ? i3 + 1 : i3;
        this.zzd = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzbbn
    public final byte[] zzb(String str) {
        synchronized (this.zza) {
            MessageDigest zza = zza();
            this.zzb = zza;
            if (zza == null) {
                return new byte[0];
            }
            zza.reset();
            this.zzb.update(str.getBytes(Charset.forName("UTF-8")));
            byte[] digest = this.zzb.digest();
            int length = digest.length;
            int i2 = this.zzc;
            if (length > i2) {
                length = i2;
            }
            byte[] bArr = new byte[length];
            System.arraycopy(digest, 0, bArr, 0, length);
            if ((this.zzd & 7) > 0) {
                long j2 = 0;
                for (int i3 = 0; i3 < length; i3++) {
                    if (i3 > 0) {
                        j2 <<= 8;
                    }
                    j2 += bArr[i3] & 255;
                }
                long j3 = j2 >>> (8 - (this.zzd & 7));
                int i4 = this.zzc;
                while (true) {
                    i4--;
                    if (i4 < 0) {
                        break;
                    }
                    bArr[i4] = (byte) (255 & j3);
                    j3 >>>= 8;
                }
            }
            return bArr;
        }
    }
}
