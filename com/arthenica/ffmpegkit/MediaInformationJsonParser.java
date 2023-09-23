package com.arthenica.ffmpegkit;

import f.d.a.c.a;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class MediaInformationJsonParser {
    public static final String KEY_CHAPTERS = "chapters";
    public static final String KEY_STREAMS = "streams";

    public static MediaInformation from(String str) {
        try {
            return fromWithError(str);
        } catch (JSONException e2) {
            android.util.Log.e(FFmpegKitConfig.TAG, String.format("MediaInformation parsing failed.%s", a.a(e2)));
            return null;
        }
    }

    public static MediaInformation fromWithError(String str) {
        JSONObject jSONObject = new JSONObject(str);
        JSONArray optJSONArray = jSONObject.optJSONArray(KEY_STREAMS);
        JSONArray optJSONArray2 = jSONObject.optJSONArray(KEY_CHAPTERS);
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; optJSONArray != null && i2 < optJSONArray.length(); i2++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
            if (optJSONObject != null) {
                arrayList.add(new StreamInformation(optJSONObject));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i3 = 0; optJSONArray2 != null && i3 < optJSONArray2.length(); i3++) {
            JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i3);
            if (optJSONObject2 != null) {
                arrayList2.add(new Chapter(optJSONObject2));
            }
        }
        return new MediaInformation(jSONObject, arrayList, arrayList2);
    }
}
