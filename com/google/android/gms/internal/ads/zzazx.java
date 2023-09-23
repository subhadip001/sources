package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzazx implements Choreographer.FrameCallback, Handler.Callback {
    private static final zzazx zzb = new zzazx();
    public volatile long zza;
    private final Handler zzc;
    private final HandlerThread zzd;
    private Choreographer zze;
    private int zzf;

    private zzazx() {
        HandlerThread handlerThread = new HandlerThread("ChoreographerOwner:Handler");
        this.zzd = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), this);
        this.zzc = handler;
        handler.sendEmptyMessage(0);
    }

    public static zzazx zza() {
        return zzb;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j2) {
        this.zza = j2;
        this.zze.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 0) {
            this.zze = Choreographer.getInstance();
            return true;
        } else if (i2 == 1) {
            int i3 = this.zzf + 1;
            this.zzf = i3;
            if (i3 == 1) {
                this.zze.postFrameCallback(this);
            }
            return true;
        } else if (i2 != 2) {
            return false;
        } else {
            int i4 = this.zzf - 1;
            this.zzf = i4;
            if (i4 == 0) {
                this.zze.removeFrameCallback(this);
                this.zza = 0L;
            }
            return true;
        }
    }

    public final void zzb() {
        this.zzc.sendEmptyMessage(1);
    }

    public final void zzc() {
        this.zzc.sendEmptyMessage(2);
    }
}
