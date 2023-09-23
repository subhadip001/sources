package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.util.Log;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzic {
    public static zzmv zza(Context context, zzin zzinVar, boolean z) {
        zzmr zzb = zzmr.zzb(context);
        if (zzb == null) {
            Log.w("ExoPlayerImpl", "MediaMetricsService unavailable.");
            return new zzmv(LogSessionId.LOG_SESSION_ID_NONE);
        }
        if (z) {
            zzinVar.zzR(zzb);
        }
        return new zzmv(zzb.zza());
    }
}
