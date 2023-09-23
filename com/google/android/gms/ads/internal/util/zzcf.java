package com.google.android.gms.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcf extends BroadcastReceiver {
    public final /* synthetic */ zzcg zza;

    public zzcf(zzcg zzcgVar) {
        this.zza = zzcgVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.zza.zze(context, intent);
    }
}
