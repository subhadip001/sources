package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.arthenica.ffmpegkit.AbstractSession;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzayt extends Handler implements Runnable {
    public final int zza;
    public final /* synthetic */ zzayw zzb;
    private final zzayu zzc;
    private final zzays zzd;
    private final long zze;
    private IOException zzf;
    private int zzg;
    private volatile Thread zzh;
    private volatile boolean zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzayt(zzayw zzaywVar, Looper looper, zzayu zzayuVar, zzays zzaysVar, int i2, long j2) {
        super(looper);
        this.zzb = zzaywVar;
        this.zzc = zzayuVar;
        this.zzd = zzaysVar;
        this.zza = i2;
        this.zze = j2;
    }

    private final void zzd() {
        ExecutorService executorService;
        zzayt zzaytVar;
        this.zzf = null;
        zzayw zzaywVar = this.zzb;
        executorService = zzaywVar.zza;
        zzaytVar = zzaywVar.zzb;
        executorService.execute(zzaytVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.zzi) {
            return;
        }
        int i2 = message.what;
        if (i2 == 0) {
            zzd();
        } else if (i2 != 4) {
            this.zzb.zzb = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = elapsedRealtime - this.zze;
            if (this.zzc.zze()) {
                this.zzd.zzt(this.zzc, elapsedRealtime, j2, false);
                return;
            }
            int i3 = message.what;
            if (i3 == 1) {
                this.zzd.zzt(this.zzc, elapsedRealtime, j2, false);
            } else if (i3 == 2) {
                this.zzd.zzu(this.zzc, elapsedRealtime, j2);
            } else if (i3 != 3) {
            } else {
                IOException iOException = (IOException) message.obj;
                this.zzf = iOException;
                int zzd = this.zzd.zzd(this.zzc, elapsedRealtime, j2, iOException);
                if (zzd == 3) {
                    this.zzb.zzc = this.zzf;
                } else if (zzd != 2) {
                    int i4 = zzd != 1 ? 1 + this.zzg : 1;
                    this.zzg = i4;
                    zzc(Math.min((i4 - 1) * 1000, (int) AbstractSession.DEFAULT_TIMEOUT_FOR_ASYNCHRONOUS_MESSAGES_IN_TRANSMIT));
                }
            }
        } else {
            throw ((Error) message.obj);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzh = Thread.currentThread();
            if (!this.zzc.zze()) {
                String simpleName = this.zzc.getClass().getSimpleName();
                zzazl.zza("load:" + simpleName);
                try {
                    this.zzc.zzc();
                    zzazl.zzb();
                } catch (Throwable th) {
                    zzazl.zzb();
                    throw th;
                }
            }
            if (this.zzi) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e2) {
            if (this.zzi) {
                return;
            }
            obtainMessage(3, e2).sendToTarget();
        } catch (OutOfMemoryError e3) {
            Log.e("LoadTask", "OutOfMemory error loading stream", e3);
            if (this.zzi) {
                return;
            }
            obtainMessage(3, new zzayv(e3)).sendToTarget();
        } catch (Error e4) {
            Log.e("LoadTask", "Unexpected error loading stream", e4);
            if (!this.zzi) {
                obtainMessage(4, e4).sendToTarget();
            }
            throw e4;
        } catch (InterruptedException unused) {
            zzayy.zze(this.zzc.zze());
            if (this.zzi) {
                return;
            }
            sendEmptyMessage(2);
        } catch (Exception e5) {
            Log.e("LoadTask", "Unexpected exception loading stream", e5);
            if (this.zzi) {
                return;
            }
            obtainMessage(3, new zzayv(e5)).sendToTarget();
        }
    }

    public final void zza(boolean z) {
        this.zzi = z;
        this.zzf = null;
        if (hasMessages(0)) {
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
                return;
            }
        } else {
            this.zzc.zzb();
            if (this.zzh != null) {
                this.zzh.interrupt();
            }
            if (!z) {
                return;
            }
        }
        this.zzb.zzb = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.zzd.zzt(this.zzc, elapsedRealtime, elapsedRealtime - this.zze, true);
    }

    public final void zzb(int i2) {
        IOException iOException = this.zzf;
        if (iOException != null && this.zzg > i2) {
            throw iOException;
        }
    }

    public final void zzc(long j2) {
        zzayt zzaytVar;
        zzaytVar = this.zzb.zzb;
        zzayy.zze(zzaytVar == null);
        this.zzb.zzb = this;
        if (j2 > 0) {
            sendEmptyMessageDelayed(0, j2);
        } else {
            zzd();
        }
    }
}
