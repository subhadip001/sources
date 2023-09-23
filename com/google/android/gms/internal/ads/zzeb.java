package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzeb implements zzdf {
    private Message zza;
    private zzec zzb;

    private zzeb() {
    }

    public /* synthetic */ zzeb(zzea zzeaVar) {
    }

    private final void zzd() {
        this.zza = null;
        this.zzb = null;
        zzec.zzk(this);
    }

    @Override // com.google.android.gms.internal.ads.zzdf
    public final void zza() {
        Message message = this.zza;
        Objects.requireNonNull(message);
        message.sendToTarget();
        zzd();
    }

    public final zzeb zzb(Message message, zzec zzecVar) {
        this.zza = message;
        this.zzb = zzecVar;
        return this;
    }

    public final boolean zzc(Handler handler) {
        Message message = this.zza;
        Objects.requireNonNull(message);
        boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
        zzd();
        return sendMessageAtFrontOfQueue;
    }
}
