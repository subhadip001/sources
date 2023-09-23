package com.google.android.gms.internal.ads;

import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfka implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        Handler handler;
        Handler handler2;
        Runnable runnable;
        Handler handler3;
        Runnable runnable2;
        handler = zzfkd.zzc;
        if (handler != null) {
            handler2 = zzfkd.zzc;
            runnable = zzfkd.zzd;
            handler2.post(runnable);
            handler3 = zzfkd.zzc;
            runnable2 = zzfkd.zze;
            handler3.postDelayed(runnable2, 200L);
        }
    }
}
