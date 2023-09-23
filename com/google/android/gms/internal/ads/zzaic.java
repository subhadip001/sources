package com.google.android.gms.internal.ads;

import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzaic implements zzaib {
    private final FileChannel zza;
    private final long zzb;
    private final long zzc;

    public zzaic(FileChannel fileChannel, long j2, long j3) {
        this.zza = fileChannel;
        this.zzb = j2;
        this.zzc = j3;
    }

    @Override // com.google.android.gms.internal.ads.zzaib
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzaib
    public final void zzb(MessageDigest[] messageDigestArr, long j2, int i2) {
        MappedByteBuffer map = this.zza.map(FileChannel.MapMode.READ_ONLY, this.zzb + j2, i2);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }
}
