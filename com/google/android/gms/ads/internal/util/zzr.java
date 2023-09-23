package com.google.android.gms.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzr extends BroadcastReceiver {
    public final /* synthetic */ zzs zza;

    public /* synthetic */ zzr(zzs zzsVar, zzq zzqVar) {
        this.zza = zzsVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            zzs.zzd(this.zza, true);
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            zzs.zzd(this.zza, false);
        }
    }
}
