package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.util.Clock;
import com.google.firebase.crashlytics.CrashlyticsAnalyticsListener;
import java.io.IOException;
import java.io.StringWriter;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdwr {
    private final Clock zza;

    public zzdwr(Clock clock) {
        this.zza = clock;
    }

    public final void zza(List list, String str, String str2, Object... objArr) {
        if (((Boolean) zzbjr.zza.zze()).booleanValue()) {
            long currentTimeMillis = this.zza.currentTimeMillis();
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            try {
                jsonWriter.beginObject();
                jsonWriter.name("timestamp").value(currentTimeMillis);
                jsonWriter.name("source").value(str);
                jsonWriter.name(NotificationCompat.CATEGORY_EVENT).value(str2);
                jsonWriter.name("components").beginArray();
                for (Object obj : list) {
                    jsonWriter.value(obj.toString());
                }
                jsonWriter.endArray();
                jsonWriter.name(CrashlyticsAnalyticsListener.EVENT_PARAMS_KEY).beginArray();
                int length = objArr.length;
                for (int i2 = 0; i2 < length; i2++) {
                    Object obj2 = objArr[i2];
                    jsonWriter.value(obj2 != null ? obj2.toString() : null);
                }
                jsonWriter.endArray();
                jsonWriter.endObject();
                jsonWriter.flush();
                jsonWriter.close();
            } catch (IOException e2) {
                zzcfi.zzh("unable to log", e2);
            }
            zzcfi.zzi("AD-DBG ".concat(String.valueOf(stringWriter.toString())));
        }
    }
}
