package com.google.android.gms.internal.ads;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfjb extends BroadcastReceiver {
    public final /* synthetic */ zzfjc zza;

    public zzfjb(zzfjc zzfjcVar) {
        this.zza = zzfjcVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        KeyguardManager keyguardManager;
        if (intent == null) {
            return;
        }
        if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            zzfjc.zzb(this.zza, true);
        } else if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            zzfjc.zzb(this.zza, false);
        } else if (!"android.intent.action.SCREEN_ON".equals(intent.getAction()) || (keyguardManager = (KeyguardManager) context.getSystemService("keyguard")) == null || keyguardManager.inKeyguardRestrictedInputMode()) {
        } else {
            zzfjc.zzb(this.zza, false);
        }
    }
}
