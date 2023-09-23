package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzpr implements zzqe {
    private final MediaCodec zza;
    private final zzpx zzb;
    private final zzpv zzc;
    private boolean zzd;
    private int zze = 0;

    public /* synthetic */ zzpr(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z, zzpq zzpqVar) {
        this.zza = mediaCodec;
        this.zzb = new zzpx(handlerThread);
        this.zzc = new zzpv(mediaCodec, handlerThread2);
    }

    public static /* synthetic */ String zzd(int i2) {
        return zzs(i2, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    public static /* synthetic */ String zze(int i2) {
        return zzs(i2, "ExoPlayer:MediaCodecQueueingThread:");
    }

    public static /* synthetic */ void zzh(zzpr zzprVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i2) {
        zzprVar.zzb.zzf(zzprVar.zza);
        int i3 = zzeg.zza;
        Trace.beginSection("configureCodec");
        zzprVar.zza.configure(mediaFormat, surface, (MediaCrypto) null, 0);
        Trace.endSection();
        zzprVar.zzc.zzf();
        Trace.beginSection("startCodec");
        zzprVar.zza.start();
        Trace.endSection();
        zzprVar.zze = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzs(int i2, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i2 == 1) {
            sb.append("Audio");
        } else if (i2 == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i2);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzqe
    public final int zza() {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzqe
    public final int zzb(MediaCodec.BufferInfo bufferInfo) {
        return this.zzb.zzb(bufferInfo);
    }

    @Override // com.google.android.gms.internal.ads.zzqe
    public final MediaFormat zzc() {
        return this.zzb.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzqe
    public final ByteBuffer zzf(int i2) {
        return this.zza.getInputBuffer(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzqe
    public final ByteBuffer zzg(int i2) {
        return this.zza.getOutputBuffer(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzqe
    public final void zzi() {
        this.zzc.zzb();
        this.zza.flush();
        this.zzb.zze();
        this.zza.start();
    }

    @Override // com.google.android.gms.internal.ads.zzqe
    public final void zzj(int i2, int i3, int i4, long j2, int i5) {
        this.zzc.zzc(i2, 0, i4, j2, i5);
    }

    @Override // com.google.android.gms.internal.ads.zzqe
    public final void zzk(int i2, int i3, zzfz zzfzVar, long j2, int i4) {
        this.zzc.zzd(i2, 0, zzfzVar, j2, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzqe
    public final void zzl() {
        try {
            if (this.zze == 1) {
                this.zzc.zze();
                this.zzb.zzg();
            }
            this.zze = 2;
            if (this.zzd) {
                return;
            }
            this.zza.release();
            this.zzd = true;
        } catch (Throwable th) {
            if (!this.zzd) {
                this.zza.release();
                this.zzd = true;
            }
            throw th;
        }
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
