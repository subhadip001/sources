package com.google.android.gms.internal.ads;

import com.arthenica.ffmpegkit.MediaInformation;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdug {
    private final Map zza = new ConcurrentHashMap();
    private JSONObject zzb;
    private final Executor zzc;
    private boolean zzd;
    private JSONObject zze;

    public zzdug(Executor executor) {
        this.zzc = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzg */
    public final synchronized void zzf() {
        Map map;
        this.zzd = true;
        zzcel zzh = com.google.android.gms.ads.internal.zzt.zzo().zzh().zzh();
        if (zzh == null) {
            return;
        }
        JSONObject zzf = zzh.zzf();
        if (zzf == null) {
            return;
        }
        this.zzb = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzdb)).booleanValue() ? zzf.optJSONObject("common_settings") : null;
        this.zze = zzf.optJSONObject("ad_unit_patterns");
        JSONArray optJSONArray = zzf.optJSONArray("ad_unit_id_settings");
        if (optJSONArray != null) {
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString("ad_unit_id");
                    String optString2 = optJSONObject.optString(MediaInformation.KEY_FORMAT_PROPERTIES);
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("request_signals");
                    if (optString != null && optJSONObject2 != null && optString2 != null) {
                        if (this.zza.containsKey(optString2)) {
                            map = (Map) this.zza.get(optString2);
                        } else {
                            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                            this.zza.put(optString2, concurrentHashMap);
                            map = concurrentHashMap;
                        }
                        map.put(optString, optJSONObject2);
                    }
                }
            }
        }
    }

    public final JSONObject zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzdb)).booleanValue()) {
            return this.zzb;
        }
        return null;
    }

    public final JSONObject zzb(String str, String str2) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzda)).booleanValue() || str == null || str2 == null) {
            return null;
        }
        if (!this.zzd) {
            zzf();
        }
        Map map = (Map) this.zza.get(str2);
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = (JSONObject) map.get(str);
        if (jSONObject != null) {
            return jSONObject;
        }
        String zza = zzdui.zza(this.zze, str, str2);
        if (zza == null) {
            return null;
        }
        return (JSONObject) map.get(zza);
    }

    public final void zzc() {
        com.google.android.gms.ads.internal.zzt.zzo().zzh().zzq(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdud
            @Override // java.lang.Runnable
            public final void run() {
                zzdug.this.zze();
            }
        });
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdue
            @Override // java.lang.Runnable
            public final void run() {
                zzdug.this.zzf();
            }
        });
    }

    public final /* synthetic */ void zze() {
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzduf
            @Override // java.lang.Runnable
            public final void run() {
                zzdug.this.zzd();
            }
        });
    }
}
