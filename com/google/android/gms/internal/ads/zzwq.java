package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzwq extends HandlerThread implements Handler.Callback {
    private zzde zza;
    private Handler zzb;
    private Error zzc;
    private RuntimeException zzd;
    private zzws zze;

    public zzwq() {
        super("ExoPlayer:DummySurface");
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i2 = message.what;
        try {
            if (i2 != 1) {
                if (i2 != 2) {
                    return true;
                }
                try {
                    zzde zzdeVar = this.zza;
                    Objects.requireNonNull(zzdeVar);
                    zzdeVar.zzc();
                } finally {
                    try {
                        return true;
                    } finally {
                    }
                }
                return true;
            }
            try {
                int i3 = message.arg1;
                zzde zzdeVar2 = this.zza;
                Objects.requireNonNull(zzdeVar2);
                zzdeVar2.zzb(i3);
                this.zze = new zzws(this, this.zza.zza(), i3 != 0, null);
                synchronized (this) {
                    notify();
                }
            } catch (Error e2) {
                zzdn.zza("DummySurface", "Failed to initialize dummy surface", e2);
                this.zzc = e2;
                synchronized (this) {
                    notify();
                }
            } catch (RuntimeException e3) {
                zzdn.zza("DummySurface", "Failed to initialize dummy surface", e3);
                this.zzd = e3;
                synchronized (this) {
                    notify();
                }
            }
            return true;
        } catch (Throwable th) {
            synchronized (this) {
                notify();
                throw th;
            }
        }
    }

    public final zzws zza(int i2) {
        boolean z;
        start();
        Handler handler = new Handler(getLooper(), this);
        this.zzb = handler;
        this.zza = new zzde(handler, null);
        synchronized (this) {
            z = false;
            this.zzb.obtainMessage(1, i2, 0).sendToTarget();
            while (this.zze == null && this.zzd == null && this.zzc == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.zzd;
        if (runtimeException == null) {
            Error error = this.zzc;
            if (error == null) {
                zzws zzwsVar = this.zze;
                Objects.requireNonNull(zzwsVar);
                return zzwsVar;
            }
            throw error;
        }
        throw runtimeException;
    }

    public final void zzb() {
        Handler handler = this.zzb;
        Objects.requireNonNull(handler);
        handler.sendEmptyMessage(2);
    }
}
