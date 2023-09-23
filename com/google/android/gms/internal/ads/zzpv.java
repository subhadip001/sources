package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzpv {
    private static final ArrayDeque zza = new ArrayDeque();
    private static final Object zzb = new Object();
    private final MediaCodec zzc;
    private final HandlerThread zzd;
    private Handler zze;
    private final AtomicReference zzf;
    private final zzcz zzg;
    private boolean zzh;

    public zzpv(MediaCodec mediaCodec, HandlerThread handlerThread) {
        zzcz zzczVar = new zzcz(zzcx.zza);
        this.zzc = mediaCodec;
        this.zzd = handlerThread;
        this.zzg = zzczVar;
        this.zzf = new AtomicReference();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* bridge */ /* synthetic */ void zza(com.google.android.gms.internal.ads.zzpv r9, android.os.Message r10) {
        /*
            int r0 = r10.what
            r1 = 0
            if (r0 == 0) goto L43
            r2 = 1
            if (r0 == r2) goto L22
            r2 = 2
            if (r0 == r2) goto L1c
            java.util.concurrent.atomic.AtomicReference r9 = r9.zzf
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            int r10 = r10.what
            java.lang.String r10 = java.lang.String.valueOf(r10)
            r0.<init>(r10)
            com.google.android.gms.internal.ads.zzps.zza(r9, r1, r0)
            goto L5d
        L1c:
            com.google.android.gms.internal.ads.zzcz r9 = r9.zzg
            r9.zze()
            goto L5d
        L22:
            java.lang.Object r10 = r10.obj
            com.google.android.gms.internal.ads.zzpu r10 = (com.google.android.gms.internal.ads.zzpu) r10
            int r3 = r10.zza
            android.media.MediaCodec$CryptoInfo r5 = r10.zzd
            long r6 = r10.zze
            int r8 = r10.zzf
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzpv.zzb     // Catch: java.lang.RuntimeException -> L3c
            monitor-enter(r0)     // Catch: java.lang.RuntimeException -> L3c
            android.media.MediaCodec r2 = r9.zzc     // Catch: java.lang.Throwable -> L39
            r4 = 0
            r2.queueSecureInputBuffer(r3, r4, r5, r6, r8)     // Catch: java.lang.Throwable -> L39
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
            goto L5c
        L39:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
            throw r2     // Catch: java.lang.RuntimeException -> L3c
        L3c:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicReference r9 = r9.zzf
            com.google.android.gms.internal.ads.zzps.zza(r9, r1, r0)
            goto L5c
        L43:
            java.lang.Object r10 = r10.obj
            com.google.android.gms.internal.ads.zzpu r10 = (com.google.android.gms.internal.ads.zzpu) r10
            int r3 = r10.zza
            int r5 = r10.zzc
            long r6 = r10.zze
            int r8 = r10.zzf
            android.media.MediaCodec r2 = r9.zzc     // Catch: java.lang.RuntimeException -> L56
            r4 = 0
            r2.queueInputBuffer(r3, r4, r5, r6, r8)     // Catch: java.lang.RuntimeException -> L56
            goto L5c
        L56:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicReference r9 = r9.zzf
            com.google.android.gms.internal.ads.zzps.zza(r9, r1, r0)
        L5c:
            r1 = r10
        L5d:
            if (r1 == 0) goto L6a
            java.util.ArrayDeque r9 = com.google.android.gms.internal.ads.zzpv.zza
            monitor-enter(r9)
            r9.add(r1)     // Catch: java.lang.Throwable -> L67
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L67
            return
        L67:
            r10 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L67
            throw r10
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpv.zza(com.google.android.gms.internal.ads.zzpv, android.os.Message):void");
    }

    private static zzpu zzg() {
        ArrayDeque arrayDeque = zza;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new zzpu();
            }
            return (zzpu) arrayDeque.removeFirst();
        }
    }

    private final void zzh() {
        RuntimeException runtimeException = (RuntimeException) this.zzf.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    private static byte[] zzi(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 != null) {
            int length = bArr2.length;
            int length2 = bArr.length;
            if (length >= length2) {
                System.arraycopy(bArr, 0, bArr2, 0, length2);
                return bArr2;
            }
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    private static int[] zzj(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 != null) {
            int length = iArr2.length;
            int length2 = iArr.length;
            if (length >= length2) {
                System.arraycopy(iArr, 0, iArr2, 0, length2);
                return iArr2;
            }
        }
        return Arrays.copyOf(iArr, iArr.length);
    }

    public final void zzb() {
        if (this.zzh) {
            try {
                Handler handler = this.zze;
                Objects.requireNonNull(handler);
                handler.removeCallbacksAndMessages(null);
                this.zzg.zzc();
                Handler handler2 = this.zze;
                Objects.requireNonNull(handler2);
                handler2.obtainMessage(2).sendToTarget();
                this.zzg.zza();
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e2);
            }
        }
    }

    public final void zzc(int i2, int i3, int i4, long j2, int i5) {
        zzh();
        zzpu zzg = zzg();
        zzg.zza(i2, 0, i4, j2, i5);
        Handler handler = this.zze;
        int i6 = zzeg.zza;
        handler.obtainMessage(0, zzg).sendToTarget();
    }

    public final void zzd(int i2, int i3, zzfz zzfzVar, long j2, int i4) {
        zzh();
        zzpu zzg = zzg();
        zzg.zza(i2, 0, 0, j2, 0);
        MediaCodec.CryptoInfo cryptoInfo = zzg.zzd;
        cryptoInfo.numSubSamples = zzfzVar.zzf;
        cryptoInfo.numBytesOfClearData = zzj(zzfzVar.zzd, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = zzj(zzfzVar.zze, cryptoInfo.numBytesOfEncryptedData);
        byte[] zzi = zzi(zzfzVar.zzb, cryptoInfo.key);
        Objects.requireNonNull(zzi);
        cryptoInfo.key = zzi;
        byte[] zzi2 = zzi(zzfzVar.zza, cryptoInfo.iv);
        Objects.requireNonNull(zzi2);
        cryptoInfo.iv = zzi2;
        cryptoInfo.mode = zzfzVar.zzc;
        if (zzeg.zza >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(zzfzVar.zzg, zzfzVar.zzh));
        }
        this.zze.obtainMessage(1, zzg).sendToTarget();
    }

    public final void zze() {
        if (this.zzh) {
            zzb();
            this.zzd.quit();
        }
        this.zzh = false;
    }

    public final void zzf() {
        if (this.zzh) {
            return;
        }
        this.zzd.start();
        this.zze = new zzpt(this, this.zzd.getLooper());
        this.zzh = true;
    }
}
