package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfbl {
    public final String zza;
    public final String zzb;
    public final JSONObject zzc;
    public final JSONObject zzd;

    public zzfbl(JsonReader jsonReader) {
        JSONObject zzh = com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader);
        this.zzd = zzh;
        this.zza = zzh.optString("ad_html", null);
        this.zzb = zzh.optString("ad_base_url", null);
        this.zzc = zzh.optJSONObject("ad_json");
    }
}
