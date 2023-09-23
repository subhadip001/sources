package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import com.arthenica.ffmpegkit.StreamInformation;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfjr {
    private static WindowManager zzb;
    private static final String[] zzc = {"x", "y", StreamInformation.KEY_WIDTH, StreamInformation.KEY_HEIGHT};
    public static float zza = Resources.getSystem().getDisplayMetrics().density;

    public static JSONObject zza(int i2, int i3, int i4, int i5) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", i2 / zza);
            jSONObject.put("y", i3 / zza);
            jSONObject.put(StreamInformation.KEY_WIDTH, i4 / zza);
            jSONObject.put(StreamInformation.KEY_HEIGHT, i5 / zza);
        } catch (JSONException e2) {
            zzfjs.zza("Error with creating viewStateObject", e2);
        }
        return jSONObject;
    }

    public static void zzb(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e2) {
            zzfjs.zza("Error with setting ad session id", e2);
        }
    }

    public static void zzc(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
                jSONObject.put("childViews", optJSONArray);
            }
            optJSONArray.put(jSONObject2);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public static void zzd(JSONObject jSONObject, zzfjv zzfjvVar) {
        zzfjd zza2 = zzfjvVar.zza();
        JSONArray jSONArray = new JSONArray();
        ArrayList zzb2 = zzfjvVar.zzb();
        int size = zzb2.size();
        for (int i2 = 0; i2 < size; i2++) {
            jSONArray.put((String) zzb2.get(i2));
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", zza2.zzd());
            jSONObject.put("friendlyObstructionPurpose", zza2.zza());
            jSONObject.put("friendlyObstructionReason", zza2.zzc());
        } catch (JSONException e2) {
            zzfjs.zza("Error with setting friendly obstruction", e2);
        }
    }

    public static void zze(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e2) {
            zzfjs.zza("Error with setting not visible reason", e2);
        }
    }

    public static void zzf(Context context) {
        if (context != null) {
            zza = context.getResources().getDisplayMetrics().density;
            zzb = (WindowManager) context.getSystemService("window");
        }
    }

    public static void zzg(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e2) {
            zzfjs.zza("JSONException during JSONObject.put for name [" + str + "]", e2);
        }
    }

    public static void zzh(JSONObject jSONObject) {
        float f2;
        float f3 = 0.0f;
        if (zzb != null) {
            Point point = new Point(0, 0);
            zzb.getDefaultDisplay().getRealSize(point);
            float f4 = zza;
            f3 = point.x / f4;
            f2 = point.y / f4;
        } else {
            f2 = 0.0f;
        }
        try {
            jSONObject.put(StreamInformation.KEY_WIDTH, f3);
            jSONObject.put(StreamInformation.KEY_HEIGHT, f2);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public static boolean zzi(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject != null && jSONObject2 != null) {
            String[] strArr = zzc;
            int i2 = 0;
            while (true) {
                if (i2 < 4) {
                    String str = strArr[i2];
                    if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                        break;
                    }
                    i2++;
                } else if (jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""))) {
                    JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
                    JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
                    if (optJSONArray != null || optJSONArray2 != null) {
                        if (zzj(optJSONArray, optJSONArray2)) {
                            for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                                if (!optJSONArray.optString(i3, "").equals(optJSONArray2.optString(i3, ""))) {
                                    break;
                                }
                            }
                        }
                    }
                    JSONArray optJSONArray3 = jSONObject.optJSONArray("childViews");
                    JSONArray optJSONArray4 = jSONObject2.optJSONArray("childViews");
                    if (optJSONArray3 != null || optJSONArray4 != null) {
                        if (zzj(optJSONArray3, optJSONArray4)) {
                            for (int i4 = 0; i4 < optJSONArray3.length(); i4++) {
                                if (zzi(optJSONArray3.optJSONObject(i4), optJSONArray4.optJSONObject(i4))) {
                                }
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean zzj(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }
}
