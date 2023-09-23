package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzark extends Handler {
    public final /* synthetic */ zzarl zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzark(zzarl zzarlVar, Looper looper) {
        super(looper);
        this.zza = zzarlVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        this.zza.zzt(message);
    }
}
