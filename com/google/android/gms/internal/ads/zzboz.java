package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.arthenica.ffmpegkit.Chapter;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzboz implements zzbol {
    private final Object zza = new Object();
    private final Map zzb = new HashMap();

    @Override // com.google.android.gms.internal.ads.zzbol
    public final void zza(Object obj, Map map) {
        String str = (String) map.get(Chapter.KEY_ID);
        String str2 = (String) map.get("fail");
        String str3 = (String) map.get("fail_reason");
        String str4 = (String) map.get("fail_stack");
        String str5 = (String) map.get("result");
        if (true == TextUtils.isEmpty(str4)) {
            str3 = "Unknown Fail Reason.";
        }
        String concat = TextUtils.isEmpty(str4) ? "" : "\n".concat(String.valueOf(str4));
        synchronized (this.zza) {
            zzboy zzboyVar = (zzboy) this.zzb.remove(str);
            if (zzboyVar == null) {
                zzcfi.zzj("Received result for unexpected method invocation: " + str);
            } else if (!TextUtils.isEmpty(str2)) {
                zzboyVar.zza(str3 + concat);
            } else if (str5 == null) {
                zzboyVar.zzb(null);
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(str5);
                    if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                        String jSONObject2 = jSONObject.toString(2);
                        com.google.android.gms.ads.internal.util.zze.zza("Result GMSG: " + jSONObject2);
                    }
                    zzboyVar.zzb(jSONObject);
                } catch (JSONException e2) {
                    zzboyVar.zza(e2.getMessage());
                }
            }
        }
    }

    public final zzfvj zzb(zzbrp zzbrpVar, String str, JSONObject jSONObject) {
        zzcga zzcgaVar = new zzcga();
        com.google.android.gms.ads.internal.zzt.zzp();
        String uuid = UUID.randomUUID().toString();
        zzc(uuid, new zzbox(this, zzcgaVar));
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(Chapter.KEY_ID, uuid);
            jSONObject2.put("args", jSONObject);
            zzbrpVar.zzl(str, jSONObject2);
        } catch (Exception e2) {
            zzcgaVar.zze(e2);
        }
        return zzcgaVar;
    }

    public final void zzc(String str, zzboy zzboyVar) {
        synchronized (this.zza) {
            this.zzb.put(str, zzboyVar);
        }
    }
}
