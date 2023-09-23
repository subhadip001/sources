package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbtu {
    public final List zza;
    public final List zzb;
    public final List zzc;
    public final List zzd;
    public final List zze;
    public final List zzf;
    public final String zzg;
    public final String zzh;

    public zzbtu(JSONObject jSONObject) {
        if (zzcfi.zzm(2)) {
            com.google.android.gms.ads.internal.util.zze.zza("Mediation Response JSON: ".concat(String.valueOf(jSONObject.toString(2))));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i2 = -1;
        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
            try {
                zzbtt zzbttVar = new zzbtt(jSONArray.getJSONObject(i3));
                "banner".equalsIgnoreCase(zzbttVar.zzv);
                arrayList.add(zzbttVar);
                if (i2 < 0) {
                    Iterator it = zzbttVar.zzc.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((String) it.next()).equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                                i2 = i3;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }
        jSONArray.length();
        this.zza = Collections.unmodifiableList(arrayList);
        this.zzg = jSONObject.optString("qdata");
        jSONObject.optInt("fs_model_type", -1);
        jSONObject.optLong("timeout_ms", -1L);
        JSONObject optJSONObject = jSONObject.optJSONObject("settings");
        if (optJSONObject == null) {
            this.zzb = null;
            this.zzc = null;
            this.zzd = null;
            this.zze = null;
            this.zzf = null;
            this.zzh = null;
            return;
        }
        optJSONObject.optLong("ad_network_timeout_millis", -1L);
        com.google.android.gms.ads.internal.zzt.zzg();
        this.zzb = zzbtv.zza(optJSONObject, "click_urls");
        com.google.android.gms.ads.internal.zzt.zzg();
        this.zzc = zzbtv.zza(optJSONObject, "imp_urls");
        com.google.android.gms.ads.internal.zzt.zzg();
        this.zzd = zzbtv.zza(optJSONObject, "downloaded_imp_urls");
        com.google.android.gms.ads.internal.zzt.zzg();
        this.zze = zzbtv.zza(optJSONObject, "nofill_urls");
        com.google.android.gms.ads.internal.zzt.zzg();
        this.zzf = zzbtv.zza(optJSONObject, "remote_ping_urls");
        optJSONObject.optBoolean("render_in_browser", false);
        optJSONObject.optLong("refresh", -1L);
        zzcaw zza = zzcaw.zza(optJSONObject.optJSONArray("rewards"));
        if (zza == null) {
            this.zzh = null;
        } else {
            this.zzh = zza.zza;
        }
        optJSONObject.optBoolean("use_displayed_impression", false);
        optJSONObject.optBoolean("allow_pub_rendered_attribution", false);
        optJSONObject.optBoolean("allow_pub_owned_ad_view", false);
        optJSONObject.optBoolean("allow_custom_click_gesture", false);
    }
}
