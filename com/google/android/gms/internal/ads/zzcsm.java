package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcsm {
    private final Map zza;
    private final Map zzb;

    public zzcsm(Map map, Map map2) {
        this.zza = map;
        this.zzb = map2;
    }

    public final void zza(zzfbs zzfbsVar) {
        for (zzfbq zzfbqVar : zzfbsVar.zzb.zzc) {
            if (this.zza.containsKey(zzfbqVar.zza)) {
                ((zzcsp) this.zza.get(zzfbqVar.zza)).zza(zzfbqVar.zzb);
            } else if (this.zzb.containsKey(zzfbqVar.zza)) {
                zzcso zzcsoVar = (zzcso) this.zzb.get(zzfbqVar.zza);
                JSONObject jSONObject = zzfbqVar.zzb;
                HashMap hashMap = new HashMap();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    String optString = jSONObject.optString(next);
                    if (optString != null) {
                        hashMap.put(next, optString);
                    }
                }
                zzcsoVar.zza(hashMap);
            }
        }
    }
}
