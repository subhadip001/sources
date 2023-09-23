package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdql {
    private final Executor zza;
    private final zzdqg zzb;

    public zzdql(Executor executor, zzdqg zzdqgVar) {
        this.zza = executor;
        this.zzb = zzdqgVar;
    }

    public final zzfvj zza(JSONObject jSONObject, String str) {
        zzfvj zzi;
        JSONArray optJSONArray = jSONObject.optJSONArray("custom_assets");
        if (optJSONArray == null) {
            return zzfva.zzi(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
            if (optJSONObject == null) {
                zzi = zzfva.zzi(null);
            } else {
                final String optString = optJSONObject.optString("name");
                if (optString == null) {
                    zzi = zzfva.zzi(null);
                } else {
                    String optString2 = optJSONObject.optString(NotificationCompat.MessagingStyle.Message.KEY_DATA_MIME_TYPE);
                    if ("string".equals(optString2)) {
                        zzi = zzfva.zzi(new zzdqk(optString, optJSONObject.optString("string_value")));
                    } else if ("image".equals(optString2)) {
                        zzi = zzfva.zzm(this.zzb.zze(optJSONObject, "image_value"), new zzfoi() { // from class: com.google.android.gms.internal.ads.zzdqi
                            @Override // com.google.android.gms.internal.ads.zzfoi
                            public final Object apply(Object obj) {
                                return new zzdqk(optString, (zzbkm) obj);
                            }
                        }, this.zza);
                    } else {
                        zzi = zzfva.zzi(null);
                    }
                }
            }
            arrayList.add(zzi);
        }
        return zzfva.zzm(zzfva.zze(arrayList), new zzfoi() { // from class: com.google.android.gms.internal.ads.zzdqj
            @Override // com.google.android.gms.internal.ads.zzfoi
            public final Object apply(Object obj) {
                ArrayList arrayList2 = new ArrayList();
                for (zzdqk zzdqkVar : (List) obj) {
                    if (zzdqkVar != null) {
                        arrayList2.add(zzdqkVar);
                    }
                }
                return arrayList2;
            }
        }, this.zza);
    }
}
