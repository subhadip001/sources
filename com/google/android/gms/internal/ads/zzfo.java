package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public interface zzfo extends zzer {
    public static final zzfot zza = new zzfot() { // from class: com.google.android.gms.internal.ads.zzfi
        @Override // com.google.android.gms.internal.ads.zzfot
        public final boolean zza(Object obj) {
            String str = (String) obj;
            if (str == null) {
                return false;
            }
            String zza2 = zzfoa.zza(str);
            if (TextUtils.isEmpty(zza2)) {
                return false;
            }
            return ((zza2.contains(NotificationCompat.MessagingStyle.Message.KEY_TEXT) && !zza2.contains("text/vtt")) || zza2.contains("html") || zza2.contains("xml")) ? false : true;
        }
    };

    @Override // 
    Map zze();
}
