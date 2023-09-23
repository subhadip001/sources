package com.google.android.gms.internal.ads;

import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzeua implements zzeta {
    private final JSONObject zza;

    public zzeua(JSONObject jSONObject) {
        this.zza = jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzeta
    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        try {
            JSONObject zzf = com.google.android.gms.ads.internal.util.zzbu.zzf((JSONObject) obj, "content_info");
            JSONObject jSONObject = this.zza;
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                zzf.put(next, jSONObject.get(next));
            }
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed putting app indexing json.");
        }
    }
}
