package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbom implements zzbol {
    private final zzdza zza;

    public zzbom(zzdza zzdzaVar) {
        Preconditions.checkNotNull(zzdzaVar, "The Inspector Manager must not be null");
        this.zza = zzdzaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final void zza(Object obj, Map map) {
        if (map == null || !map.containsKey(NotificationCompat.MessagingStyle.Message.KEY_EXTRAS_BUNDLE)) {
            return;
        }
        long j2 = Long.MAX_VALUE;
        if (map.containsKey("expires")) {
            try {
                j2 = Long.parseLong((String) map.get("expires"));
            } catch (NumberFormatException unused) {
            }
        }
        this.zza.zzh((String) map.get(NotificationCompat.MessagingStyle.Message.KEY_EXTRAS_BUNDLE), j2);
    }
}
