package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzge extends BroadcastReceiver implements Runnable {
    public final /* synthetic */ zzgg zza;
    private final zzgf zzb;
    private final Handler zzc;

    public zzge(zzgg zzggVar, Handler handler, zzgf zzgfVar) {
        this.zza = zzggVar;
        this.zzc = handler;
        this.zzb = zzgfVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.zzc.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
