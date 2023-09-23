package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzpt extends Handler {
    public final /* synthetic */ zzpv zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzpt(zzpv zzpvVar, Looper looper) {
        super(looper);
        this.zza = zzpvVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        zzpv.zza(this.zza, message);
    }
}
