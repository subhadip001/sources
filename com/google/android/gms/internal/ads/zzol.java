package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzol {
    public final /* synthetic */ zzon zza;
    private final Handler zzb = new Handler();
    private final AudioTrack.StreamEventCallback zzc;

    public zzol(zzon zzonVar) {
        this.zza = zzonVar;
        this.zzc = new zzok(this, zzonVar);
    }

    public final void zza(AudioTrack audioTrack) {
        final Handler handler = this.zzb;
        audioTrack.registerStreamEventCallback(new Executor() { // from class: com.google.android.gms.internal.ads.zzoj
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, this.zzc);
    }

    public final void zzb(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.zzc);
        this.zzb.removeCallbacksAndMessages(null);
    }
}
