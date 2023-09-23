package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzevq implements zzeta {
    private final String zza;

    public zzevq(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzeta
    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        try {
            if (TextUtils.isEmpty(this.zza)) {
                return;
            }
            com.google.android.gms.ads.internal.util.zzbu.zzf(jSONObject, "pii").put("adsid", this.zza);
        } catch (JSONException e2) {
            zzcfi.zzk("Failed putting trustless token.", e2);
        }
    }
}
