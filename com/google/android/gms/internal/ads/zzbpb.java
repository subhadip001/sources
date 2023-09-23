package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbpb implements zzbol {
    private final zzbpa zza;

    public zzbpb(zzbpa zzbpaVar) {
        this.zza = zzbpaVar;
    }

    public static void zzb(zzcli zzcliVar, zzbpa zzbpaVar) {
        zzcliVar.zzaf("/reward", new zzbpb(zzbpaVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("action");
        if ("grant".equals(str)) {
            zzcaw zzcawVar = null;
            try {
                int parseInt = Integer.parseInt((String) map.get("amount"));
                String str2 = (String) map.get(NotificationCompat.MessagingStyle.Message.KEY_DATA_MIME_TYPE);
                if (!TextUtils.isEmpty(str2)) {
                    zzcawVar = new zzcaw(str2, parseInt);
                }
            } catch (NumberFormatException e2) {
                zzcfi.zzk("Unable to parse reward amount.", e2);
            }
            this.zza.zza(zzcawVar);
        } else if ("video_start".equals(str)) {
            this.zza.zzc();
        } else if ("video_complete".equals(str)) {
            this.zza.zzb();
        }
    }
}
