package com.google.android.gms.internal.ads;

import android.content.Context;
import android.provider.Settings;
import android.util.JsonWriter;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.firebase.crashlytics.CrashlyticsAnalyticsListener;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcfh {
    public static final /* synthetic */ int zza = 0;
    private static boolean zzc = false;
    private static boolean zzd = false;
    private final List zzg;
    private static final Object zzb = new Object();
    private static final Clock zze = DefaultClock.getInstance();
    private static final Set zzf = new HashSet(Arrays.asList(new String[0]));

    public zzcfh() {
        this(null);
    }

    public static /* synthetic */ void zza(String str, String str2, Map map, byte[] bArr, JsonWriter jsonWriter) {
        jsonWriter.name(CrashlyticsAnalyticsListener.EVENT_PARAMS_KEY).beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name(NotificationCompat.MessagingStyle.Message.KEY_DATA_URI).value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        zzs(jsonWriter, map);
        if (bArr != null) {
            jsonWriter.name("body").value(Base64Utils.encode(bArr));
        }
        jsonWriter.endObject();
    }

    public static /* synthetic */ void zzb(int i2, Map map, JsonWriter jsonWriter) {
        jsonWriter.name(CrashlyticsAnalyticsListener.EVENT_PARAMS_KEY).beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value(i2);
        jsonWriter.endObject();
        zzs(jsonWriter, map);
        jsonWriter.endObject();
    }

    public static void zzi() {
        synchronized (zzb) {
            zzc = false;
            zzd = false;
            zzcfi.zzj("Ad debug logging enablement is out of date.");
        }
    }

    public static void zzj(boolean z) {
        synchronized (zzb) {
            zzc = true;
            zzd = z;
        }
    }

    public static boolean zzk(Context context) {
        if (((Boolean) zzbjk.zza.zze()).booleanValue()) {
            try {
                return Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0;
            } catch (Exception e2) {
                zzcfi.zzk("Fail to determine debug setting.", e2);
                return false;
            }
        }
        return false;
    }

    public static boolean zzl() {
        boolean z;
        synchronized (zzb) {
            z = false;
            if (zzc && zzd) {
                z = true;
            }
        }
        return z;
    }

    public static boolean zzm() {
        boolean z;
        synchronized (zzb) {
            z = zzc;
        }
        return z;
    }

    private static synchronized void zzn(String str) {
        synchronized (zzcfh.class) {
            zzcfi.zzi("GMA Debug BEGIN");
            int i2 = 0;
            while (i2 < str.length()) {
                int i3 = i2 + 4000;
                zzcfi.zzi("GMA Debug CONTENT ".concat(String.valueOf(str.substring(i2, Math.min(i3, str.length())))));
                i2 = i3;
            }
            zzcfi.zzi("GMA Debug FINISH");
        }
    }

    private final void zzo(String str, zzcfg zzcfgVar) {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(zze.currentTimeMillis());
            jsonWriter.name(NotificationCompat.CATEGORY_EVENT).value(str);
            jsonWriter.name("components").beginArray();
            for (String str2 : this.zzg) {
                jsonWriter.value(str2);
            }
            jsonWriter.endArray();
            zzcfgVar.zza(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e2) {
            zzcfi.zzh("unable to log", e2);
        }
        zzn(stringWriter.toString());
    }

    private final void zzp(final String str) {
        zzo("onNetworkRequestError", new zzcfg() { // from class: com.google.android.gms.internal.ads.zzcfd
            @Override // com.google.android.gms.internal.ads.zzcfg
            public final void zza(JsonWriter jsonWriter) {
                String str2 = str;
                int i2 = zzcfh.zza;
                jsonWriter.name(CrashlyticsAnalyticsListener.EVENT_PARAMS_KEY).beginObject();
                if (str2 != null) {
                    jsonWriter.name("error_description").value(str2);
                }
                jsonWriter.endObject();
            }
        });
    }

    private final void zzq(final String str, final String str2, final Map map, final byte[] bArr) {
        zzo("onNetworkRequest", new zzcfg() { // from class: com.google.android.gms.internal.ads.zzcfe
            @Override // com.google.android.gms.internal.ads.zzcfg
            public final void zza(JsonWriter jsonWriter) {
                zzcfh.zza(str, str2, map, bArr, jsonWriter);
            }
        });
    }

    private final void zzr(final Map map, final int i2) {
        zzo("onNetworkResponse", new zzcfg() { // from class: com.google.android.gms.internal.ads.zzcfc
            @Override // com.google.android.gms.internal.ads.zzcfg
            public final void zza(JsonWriter jsonWriter) {
                zzcfh.zzb(i2, map, jsonWriter);
            }
        });
    }

    private static void zzs(JsonWriter jsonWriter, Map map) {
        if (map == null) {
            return;
        }
        jsonWriter.name("headers").beginArray();
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            if (!zzf.contains(str)) {
                if (entry.getValue() instanceof List) {
                    for (String str2 : (List) entry.getValue()) {
                        jsonWriter.beginObject();
                        jsonWriter.name("name").value(str);
                        jsonWriter.name("value").value(str2);
                        jsonWriter.endObject();
                    }
                } else if (entry.getValue() instanceof String) {
                    jsonWriter.beginObject();
                    jsonWriter.name("name").value(str);
                    jsonWriter.name("value").value((String) entry.getValue());
                    jsonWriter.endObject();
                } else {
                    zzcfi.zzg("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                    break;
                }
            }
        }
        jsonWriter.endArray();
    }

    public final void zzc(HttpURLConnection httpURLConnection, byte[] bArr) {
        if (zzl()) {
            zzq(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), httpURLConnection.getRequestProperties() == null ? null : new HashMap(httpURLConnection.getRequestProperties()), bArr);
        }
    }

    public final void zzd(String str, String str2, Map map, byte[] bArr) {
        if (zzl()) {
            zzq(str, "GET", map, bArr);
        }
    }

    public final void zze(HttpURLConnection httpURLConnection, int i2) {
        if (zzl()) {
            String str = null;
            zzr(httpURLConnection.getHeaderFields() == null ? null : new HashMap(httpURLConnection.getHeaderFields()), i2);
            if (i2 < 200 || i2 >= 300) {
                try {
                    str = httpURLConnection.getResponseMessage();
                } catch (IOException e2) {
                    zzcfi.zzj("Can not get error message from error HttpURLConnection\n".concat(String.valueOf(e2.getMessage())));
                }
                zzp(str);
            }
        }
    }

    public final void zzf(Map map, int i2) {
        if (zzl()) {
            zzr(map, i2);
            if (i2 < 200 || i2 >= 300) {
                zzp(null);
            }
        }
    }

    public final void zzg(String str) {
        if (zzl() && str != null) {
            zzh(str.getBytes());
        }
    }

    public final void zzh(final byte[] bArr) {
        zzo("onNetworkResponseBody", new zzcfg() { // from class: com.google.android.gms.internal.ads.zzcff
            @Override // com.google.android.gms.internal.ads.zzcfg
            public final void zza(JsonWriter jsonWriter) {
                byte[] bArr2 = bArr;
                int i2 = zzcfh.zza;
                jsonWriter.name(CrashlyticsAnalyticsListener.EVENT_PARAMS_KEY).beginObject();
                int length = bArr2.length;
                String encode = Base64Utils.encode(bArr2);
                if (length < 10000) {
                    jsonWriter.name("body").value(encode);
                } else {
                    String zze2 = zzcfb.zze(encode);
                    if (zze2 != null) {
                        jsonWriter.name("bodydigest").value(zze2);
                    }
                }
                jsonWriter.name("bodylength").value(length);
                jsonWriter.endObject();
            }
        });
    }

    public zzcfh(String str) {
        List asList;
        if (!zzl()) {
            asList = new ArrayList();
        } else {
            asList = Arrays.asList("network_request_".concat(String.valueOf(UUID.randomUUID().toString())));
        }
        this.zzg = asList;
    }
}
