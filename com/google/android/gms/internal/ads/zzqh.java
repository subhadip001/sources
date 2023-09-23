package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzqh {
    public static void zza(zzqc zzqcVar, zzmv zzmvVar) {
        LogSessionId zza = zzmvVar.zza();
        if (zza.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        zzqcVar.zzb.setString("log-session-id", zza.getStringId());
    }
}
