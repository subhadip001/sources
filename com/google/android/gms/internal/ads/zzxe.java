package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzxe implements Choreographer.FrameCallback, Handler.Callback {
    private static final zzxe zzb = new zzxe();
    public volatile long zza = -9223372036854775807L;
    private final Handler zzc;
    private final HandlerThread zzd;
    private Choreographer zze;
    private int zzf;

    private zzxe() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        this.zzd = handlerThread;
        handlerThread.start();
        Handler zzB = zzeg.zzB(handlerThread.getLooper(), this);
        this.zzc = zzB;
        zzB.sendEmptyMessage(0);
    }

    public static zzxe zza() {
        return zzb;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j2) {
        this.zza = j2;
        Choreographer choreographer = this.zze;
        Objects.requireNonNull(choreographer);
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 0) {
            try {
                this.zze = Choreographer.getInstance();
            } catch (RuntimeException e2) {
                zzdn.zzb("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e2);
            }
            return true;
        } else if (i2 == 1) {
            Choreographer choreographer = this.zze;
            if (choreographer != null) {
                int i3 = this.zzf + 1;
                this.zzf = i3;
                if (i3 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
            return true;
        } else if (i2 != 2) {
            return false;
        } else {
            Choreographer choreographer2 = this.zze;
            if (choreographer2 != null) {
                int i4 = this.zzf - 1;
                this.zzf = i4;
                if (i4 == 0) {
                    choreographer2.removeFrameCallback(this);
                    this.zza = -9223372036854775807L;
                }
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
