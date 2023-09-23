package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import com.arthenica.ffmpegkit.AbstractSession;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzwf extends Handler implements Runnable {
    public final /* synthetic */ zzwk zza;
    private final zzwg zzb;
    private final long zzc;
    private zzwc zzd;
    private IOException zze;
    private int zzf;
    private Thread zzg;
    private boolean zzh;
    private volatile boolean zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzwf(zzwk zzwkVar, Looper looper, zzwg zzwgVar, zzwc zzwcVar, int i2, long j2) {
        super(looper);
        this.zza = zzwkVar;
        this.zzb = zzwgVar;
        this.zzd = zzwcVar;
        this.zzc = j2;
    }

    private final void zzd() {
        ExecutorService executorService;
        zzwf zzwfVar;
        this.zze = null;
        zzwk zzwkVar = this.zza;
        executorService = zzwkVar.zze;
        zzwfVar = zzwkVar.zzf;
        Objects.requireNonNull(zzwfVar);
        executorService.execute(zzwfVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i2;
        int i3;
        int i4;
        long j2;
        if (this.zzi) {
            return;
        }
        int i5 = message.what;
        if (i5 == 0) {
            zzd();
        } else if (i5 != 3) {
            this.zza.zzf = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = elapsedRealtime - this.zzc;
            zzwc zzwcVar = this.zzd;
            Objects.requireNonNull(zzwcVar);
            if (this.zzh) {
                zzwcVar.zzG(this.zzb, elapsedRealtime, j3, false);
                return;
            }
            int i6 = message.what;
            if (i6 == 1) {
                try {
                    zzwcVar.zzH(this.zzb, elapsedRealtime, j3);
                } catch (RuntimeException e2) {
                    zzdn.zza("LoadTask", "Unexpected exception handling load completed", e2);
                    this.zza.zzg = new zzwj(e2);
                }
            } else if (i6 != 2) {
            } else {
                IOException iOException = (IOException) message.obj;
                this.zze = iOException;
                int i7 = this.zzf + 1;
                this.zzf = i7;
                zzwe zzt = zzwcVar.zzt(this.zzb, elapsedRealtime, j3, iOException, i7);
                i2 = zzt.zza;
                if (i2 == 3) {
                    this.zza.zzg = this.zze;
                    return;
                }
                i3 = zzt.zza;
                if (i3 != 2) {
                    i4 = zzt.zza;
                    if (i4 == 1) {
                        this.zzf = 1;
                    }
                    j2 = zzt.zzb;
                    zzc(j2 != -9223372036854775807L ? zzt.zzb : Math.min((this.zzf - 1) * 1000, (int) AbstractSession.DEFAULT_TIMEOUT_FOR_ASYNCHRONOUS_MESSAGES_IN_TRANSMIT));
                }
            }
        } else {
            throw ((Error) message.obj);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        try {
            synchronized (this) {
                z = !this.zzh;
                this.zzg = Thread.currentThread();
            }
            if (z) {
                int i2 = zzeg.zza;
                Trace.beginSection("load:" + this.zzb.getClass().getSimpleName());
                try {
                    this.zzb.zzi();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.zzg = null;
                Thread.interrupted();
            }
            if (this.zzi) {
                return;
            }
            sendEmptyMessage(1);
        } catch (IOException e2) {
            if (this.zzi) {
                return;
            }
            obtainMessage(2, e2).sendToTarget();
        } catch (Exception e3) {
            if (this.zzi) {
                return;
            }
            zzdn.zza("LoadTask", "Unexpected exception loading stream", e3);
            obtainMessage(2, new zzwj(e3)).sendToTarget();
        } catch (OutOfMemoryError e4) {
            if (this.zzi) {
                return;
            }
            zzdn.zza("LoadTask", "OutOfMemory error loading stream", e4);
            obtainMessage(2, new zzwj(e4)).sendToTarget();
        } catch (Error e5) {
            if (!this.zzi) {
                zzdn.zza("LoadTask", "Unexpected error loading stream", e5);
                obtainMessage(3, e5).sendToTarget();
            }
            throw e5;
        }
    }

    public final void zza(boolean z) {
        this.zzi = z;
        this.zze = null;
        if (hasMessages(0)) {
            this.zzh = true;
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                this.zzh = true;
                this.zzb.zzh();
                Thread thread = this.zzg;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        if (z) {
            this.zza.zzf = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            zzwc zzwcVar = this.zzd;
            Objects.requireNonNull(zzwcVar);
            zzwcVar.zzG(this.zzb, elapsedRealtime, elapsedRealtime - this.zzc, true);
            this.zzd = null;
        }
    }

    public final void zzb(int i2) {
        IOException iOException = this.zze;
        if (iOException != null && this.zzf > i2) {
            throw iOException;
        }
    }

    public final void zzc(long j2) {
        zzwf zzwfVar;
        zzwfVar = this.zza.zzf;
        zzcw.zzf(zzwfVar == null);
        this.zza.zzf = this;
        if (j2 > 0) {
            sendEmptyMessageDelayed(0, j2);
        } else {
            zzd();
        }
    }
}
