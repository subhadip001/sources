package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzaia implements zzaib {
    private final ByteBuffer zza;

    public zzaia(ByteBuffer byteBuffer) {
        this.zza = byteBuffer.slice();
    }

    @Override // com.google.android.gms.internal.ads.zzaib
    public final long zza() {
        return this.zza.capacity();
    }

    @Override // com.google.android.gms.internal.ads.zzaib
    public final void zzb(MessageDigest[] messageDigestArr, long j2, int i2) {
        ByteBuffer slice;
        synchronized (this.zza) {
            int i3 = (int) j2;
            this.zza.position(i3);
            this.zza.limit(i3 + i2);
            slice = this.zza.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            slice.position(0);
            messageDigest.update(slice);
        }
    }
}
