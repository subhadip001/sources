package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzke extends BroadcastReceiver {
    public final /* synthetic */ zzkf zza;

    public /* synthetic */ zzke(zzkf zzkfVar, zzkd zzkdVar) {
        this.zza = zzkfVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        final zzkf zzkfVar = this.zza;
        zzkf.zzc(zzkfVar).post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkc
            @Override // java.lang.Runnable
            public final void run() {
                zzkf.zzd(zzkf.this);
            }
        });
    }
}
