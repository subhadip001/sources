package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcje implements zzgpg {
    private final ByteBuffer zza;

    public zzcje(ByteBuffer byteBuffer) {
        this.zza = byteBuffer.duplicate();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // com.google.android.gms.internal.ads.zzgpg
    public final int zza(ByteBuffer byteBuffer) {
        if (this.zza.remaining() != 0 || byteBuffer.remaining() <= 0) {
            int min = Math.min(byteBuffer.remaining(), this.zza.remaining());
            byte[] bArr = new byte[min];
            this.zza.get(bArr);
            byteBuffer.put(bArr);
            return min;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgpg
    public final long zzb() {
        return this.zza.position();
    }

    @Override // com.google.android.gms.internal.ads.zzgpg
    public final long zzc() {
        return this.zza.limit();
    }

    @Override // com.google.android.gms.internal.ads.zzgpg
    public final ByteBuffer zzd(long j2, long j3) {
        int position = this.zza.position();
        this.zza.position((int) j2);
        ByteBuffer slice = this.zza.slice();
        slice.limit((int) j3);
        this.zza.position(position);
        return slice;
    }

    @Override // com.google.android.gms.internal.ads.zzgpg
    public final void zze(long j2) {
        this.zza.position((int) j2);
    }
}
