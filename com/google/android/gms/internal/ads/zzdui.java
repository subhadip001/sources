package com.google.android.gms.internal.ads;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdui {
    public static String zza(JSONObject jSONObject, String str, String str2) {
        JSONArray optJSONArray;
        if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray(str2)) != null) {
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                if (optJSONObject != null) {
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("including");
                    JSONArray optJSONArray3 = optJSONObject.optJSONArray("excluding");
                    if (zzb(optJSONArray2, str) && !zzb(optJSONArray3, str)) {
                        return optJSONObject.optString("effective_ad_unit_id", "");
                    }
                }
            }
        }
        return "";
    }

    private static boolean zzb(JSONArray jSONArray, String str) {
        if (jSONArray != null && str != null) {
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                String optString = jSONArray.optString(i2);
                try {
                } catch (PatternSyntaxException e2) {
                    com.google.android.gms.ads.internal.zzt.zzo().zzt(e2, "RtbAdapterMap.hasAtleastOneRegexMatch");
                }
                if ((((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzij)).booleanValue() ? Pattern.compile(optString, 2) : Pattern.compile(optString)).matcher(str).lookingAt()) {
                    return true;
                }
            }
        }
        return false;
    }
}
