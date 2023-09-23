package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.arthenica.ffmpegkit.MediaInformation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcel {
    private String zzd;
    private String zze;
    private long zzf;
    private JSONObject zzg;
    private boolean zzh;
    private boolean zzj;
    private final List zza = new ArrayList();
    private final List zzb = new ArrayList();
    private final Map zzc = new HashMap();
    private final List zzi = new ArrayList();

    public zzcel(String str, long j2) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONArray optJSONArray;
        JSONObject optJSONObject3;
        this.zzh = false;
        this.zzj = false;
        this.zze = str;
        this.zzf = j2;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzg = jSONObject;
            if (jSONObject.optInt("status", -1) != 1) {
                this.zzh = false;
                zzcfi.zzj("App settings could not be fetched successfully.");
                return;
            }
            this.zzh = true;
            this.zzd = this.zzg.optString("app_id");
            JSONArray optJSONArray2 = this.zzg.optJSONArray("ad_unit_id_settings");
            if (optJSONArray2 != null) {
                for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                    JSONObject jSONObject2 = optJSONArray2.getJSONObject(i2);
                    String optString = jSONObject2.optString(MediaInformation.KEY_FORMAT_PROPERTIES);
                    String optString2 = jSONObject2.optString("ad_unit_id");
                    if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                        if ("interstitial".equalsIgnoreCase(optString)) {
                            this.zzb.add(optString2);
                        } else if (("rewarded".equalsIgnoreCase(optString) || "rewarded_interstitial".equals(optString)) && (optJSONObject3 = jSONObject2.optJSONObject("mediation_config")) != null) {
                            this.zzc.put(optString2, new zzbtu(optJSONObject3));
                        }
                    }
                }
            }
            JSONArray optJSONArray3 = this.zzg.optJSONArray("persistable_banner_ad_unit_ids");
            if (optJSONArray3 != null) {
                for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                    this.zza.add(optJSONArray3.optString(i3));
                }
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzfQ)).booleanValue() && (optJSONObject2 = this.zzg.optJSONObject("common_settings")) != null && (optJSONArray = optJSONObject2.optJSONArray("loeid")) != null) {
                for (int i4 = 0; i4 < optJSONArray.length(); i4++) {
                    this.zzi.add(optJSONArray.get(i4).toString());
                }
            }
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzfl)).booleanValue() || (optJSONObject = this.zzg.optJSONObject("common_settings")) == null) {
                return;
            }
            this.zzj = optJSONObject.optBoolean("is_prefetching_enabled", false);
        } catch (JSONException e2) {
            zzcfi.zzk("Exception occurred while processing app setting json", e2);
            com.google.android.gms.ads.internal.zzt.zzo().zzt(e2, "AppSettings.parseAppSettingsJson");
        }
    }

    public final long zza() {
        return this.zzf;
    }

    public final String zzb() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zze;
    }

    public final List zzd() {
        return this.zzi;
    }

    public final Map zze() {
        return this.zzc;
    }

    public final JSONObject zzf() {
        return this.zzg;
    }

    public final void zzg(long j2) {
        this.zzf = j2;
    }

    public final boolean zzh() {
        return this.zzj;
    }

    public final boolean zzi() {
        return this.zzh;
    }
}
