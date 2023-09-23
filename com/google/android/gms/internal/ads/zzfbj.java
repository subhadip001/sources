package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import android.util.JsonToken;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfbj {
    public final List zza;
    public final String zzb;
    public final int zzc;
    public final String zzd;
    public final int zze;
    public final long zzf;
    public final boolean zzg;
    public final String zzh;
    public final zzfbi zzi;
    public final Bundle zzj;

    public zzfbj(JsonReader jsonReader) {
        List emptyList = Collections.emptyList();
        Bundle bundle = new Bundle();
        jsonReader.beginObject();
        int i2 = 0;
        String str = "";
        long j2 = 0;
        zzfbi zzfbiVar = null;
        boolean z = false;
        String str2 = str;
        String str3 = str2;
        int i3 = 0;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if ("nofill_urls".equals(nextName)) {
                emptyList = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
            } else if ("refresh_interval".equals(nextName)) {
                i2 = jsonReader.nextInt();
            } else if ("gws_query_id".equals(nextName)) {
                str2 = jsonReader.nextString();
            } else if ("analytics_query_ad_event_id".equals(nextName)) {
                str3 = jsonReader.nextString();
            } else if ("is_idless".equals(nextName)) {
                z = jsonReader.nextBoolean();
            } else if ("response_code".equals(nextName)) {
                i3 = jsonReader.nextInt();
            } else if ("latency".equals(nextName)) {
                j2 = jsonReader.nextLong();
            } else {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzgS)).booleanValue() && "public_error".equals(nextName) && jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                    zzfbiVar = new zzfbi(jsonReader);
                } else if ("bidding_data".equals(nextName)) {
                    str = jsonReader.nextString();
                } else if ("response_info_extras".equals(nextName)) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzfM)).booleanValue()) {
                        try {
                            Bundle zza = com.google.android.gms.ads.internal.util.zzbu.zza(com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader));
                            if (zza != null) {
                                bundle = zza;
                            }
                        } catch (JSONException unused) {
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                } else {
                    jsonReader.skipValue();
                }
            }
        }
        jsonReader.endObject();
        this.zza = emptyList;
        this.zzc = i2;
        this.zzb = str2;
        this.zzd = str3;
        this.zze = i3;
        this.zzf = j2;
        this.zzi = zzfbiVar;
        this.zzg = z;
        this.zzh = str;
        this.zzj = bundle;
    }
}
