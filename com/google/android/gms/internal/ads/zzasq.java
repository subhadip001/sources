package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.ConditionVariable;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzasq extends Thread {
    public final /* synthetic */ AudioTrack zza;
    public final /* synthetic */ zzata zzb;

    public zzasq(zzata zzataVar, AudioTrack audioTrack) {
        this.zzb = zzataVar;
        this.zza = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ConditionVariable conditionVariable;
        try {
            this.zza.flush();
            this.zza.release();
        } finally {
            conditionVariable = this.zzb.zze;
            conditionVariable.open();
        }
    }
}
