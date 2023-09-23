package com.google.android.gms.ads.query;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzcfi;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
@KeepForSdk
@Deprecated
/* loaded from: classes.dex */
public class AdInfo {
    private final QueryInfo zza;
    private final String zzb;

    @KeepForSdk
    public AdInfo(QueryInfo queryInfo, String str) {
        this.zza = queryInfo;
        this.zzb = str;
    }

    @KeepForSdk
    public static String getRequestId(String str) {
        if (str == null) {
            zzcfi.zzj("adString passed to AdInfo.getRequestId() cannot be null. Returning empty string.");
            return "";
        }
        try {
            return new JSONObject(str).optString("request_id", "");
        } catch (JSONException unused) {
            zzcfi.zzj("Invalid adString passed to AdInfo.getRequestId(). Returning empty string.");
            return "";
        }
    }

    @KeepForSdk
    public String getAdString() {
        return this.zzb;
    }

    @KeepForSdk
    public QueryInfo getQueryInfo() {
        return this.zza;
    }
}
