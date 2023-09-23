package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzra implements zzqe {
    private final MediaCodec zza;
    private ByteBuffer[] zzb;
    private ByteBuffer[] zzc;

    public /* synthetic */ zzra(MediaCodec mediaCodec, zzqz zzqzVar) {
        this.zza = mediaCodec;
        if (zzeg.zza < 21) {
            this.zzb = mediaCodec.getInputBuffers();
            this.zzc = mediaCodec.getOutputBuffers();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqe
    public final int zza() {
        return this.zza.dequeueInputBuffer(0L);
    }

    @Override // com.google.android.gms.internal.ads.zzqe
    public final int zzb(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.zza.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -3) {
                if (zzeg.zza < 21) {
                    this.zzc = this.zza.getOutputBuffers();
                }
                dequeueOutputBuffer = -3;
                continue;
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzqe
    public final MediaFormat zzc() {
        return this.zza.getOutputFormat();
    }

    @Override // com.google.android.gms.internal.ads.zzqe
    public final ByteBuffer zzf(int i2) {
        if (zzeg.zza >= 21) {
            return this.zza.getInputBuffer(i2);
        }
        return ((ByteBuffer[]) zzeg.zzG(this.zzb))[i2];
    }

    @Override // com.google.android.gms.internal.ads.zzqe
    public final ByteBuffer zzg(int i2) {
        if (zzeg.zza >= 21) {
            return this.zza.getOutputBuffer(i2);
        }
        return ((ByteBuffer[]) zzeg.zzG(this.zzc))[i2];
    }

    @Override // com.google.android.gms.internal.ads.zzqe
    public final void zzi() {
        this.zza.flush();
    }

    @Override // com.google.android.gms.internal.ads.zzqe
    public final void zzj(int i2, int i3, int i4, long j2, int i5) {
        this.zza.queueInputBuffer(i2, 0, i4, j2, i5);
    }

    @Override // com.google.android.gms.internal.ads.zzqe
    public final void zzk(int i2, int i3, zzfz zzfzVar, long j2, int i4) {
        this.zza.queueSecureInputBuffer(i2, 0, zzfzVar.zza(), j2, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzqe
    public final void zzl() {
        this.zzb = null;
        this.zzc = null;
        this.zza.release();
    }

    @Override // com.google.android.gms.internal.ads.zzqe
    public final void zzm(int i2, long j2) {
        this.zza.releaseOutputBuffer(i2, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzqe
    public final void zzn(int i2, boolean z) {
        this.zza.releaseOutputBuffer(i2, z);
    }

    @Override // com.google.android.gms.internal.ads.zzqe
    public final void zzo(Surface surface) {
        this.zza.setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.zzqe
    public final void zzp(Bundle bundle) {
        this.zza.setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzqe
    public final void zzq(int i2) {
        this.zza.setVideoScalingMode(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzqe
    public final boolean zzr() {
        return false;
    }
}
