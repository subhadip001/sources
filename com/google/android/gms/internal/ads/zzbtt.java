package com.google.android.gms.internal.ads;

import com.arthenica.ffmpegkit.Chapter;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbtt {
    public final String zza;
    public final String zzb;
    public final List zzc;
    public final String zzd;
    public final String zze;
    public final List zzf;
    public final List zzg;
    public final List zzh;
    public final List zzi;
    public final List zzj;
    public final String zzk;
    public final List zzl;
    public final List zzm;
    public final List zzn;
    public final String zzo;
    public final String zzp;
    public final String zzq;
    public final String zzr;
    public final String zzs;
    public final List zzt;
    public final String zzu;
    public final String zzv;

    public zzbtt(JSONObject jSONObject) {
        List list;
        this.zzb = jSONObject.optString(Chapter.KEY_ID);
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            arrayList.add(jSONArray.getString(i2));
        }
        this.zzc = Collections.unmodifiableList(arrayList);
        this.zzd = jSONObject.optString("allocation_id", null);
        com.google.android.gms.ads.internal.zzt.zzg();
        this.zzf = zzbtv.zza(jSONObject, "clickurl");
        com.google.android.gms.ads.internal.zzt.zzg();
        this.zzg = zzbtv.zza(jSONObject, "imp_urls");
        com.google.android.gms.ads.internal.zzt.zzg();
        this.zzh = zzbtv.zza(jSONObject, "downloaded_imp_urls");
        com.google.android.gms.ads.internal.zzt.zzg();
        this.zzj = zzbtv.zza(jSONObject, "fill_urls");
        com.google.android.gms.ads.internal.zzt.zzg();
        this.zzl = zzbtv.zza(jSONObject, "video_start_urls");
        com.google.android.gms.ads.internal.zzt.zzg();
        this.zzn = zzbtv.zza(jSONObject, "video_complete_urls");
        com.google.android.gms.ads.internal.zzt.zzg();
        this.zzm = zzbtv.zza(jSONObject, "video_reward_urls");
        this.zzo = jSONObject.optString(FirebaseAnalytics.Param.TRANSACTION_ID);
        this.zzp = jSONObject.optString("valid_from_timestamp");
        JSONObject optJSONObject = jSONObject.optJSONObject("ad");
        if (optJSONObject != null) {
            com.google.android.gms.ads.internal.zzt.zzg();
            list = zzbtv.zza(optJSONObject, "manual_impression_urls");
        } else {
            list = null;
        }
        this.zzi = list;
        this.zza = optJSONObject != null ? optJSONObject.toString() : null;
        JSONObject optJSONObject2 = jSONObject.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.zzk = optJSONObject2 != null ? optJSONObject2.toString() : null;
        this.zze = optJSONObject2 != null ? optJSONObject2.optString("class_name") : null;
        this.zzq = jSONObject.optString("html_template", null);
        this.zzr = jSONObject.optString("ad_base_url", null);
        JSONObject optJSONObject3 = jSONObject.optJSONObject("assets");
        this.zzs = optJSONObject3 != null ? optJSONObject3.toString() : null;
        com.google.android.gms.ads.internal.zzt.zzg();
        this.zzt = zzbtv.zza(jSONObject, "template_ids");
        JSONObject optJSONObject4 = jSONObject.optJSONObject("ad_loader_options");
        this.zzu = optJSONObject4 != null ? optJSONObject4.toString() : null;
        this.zzv = jSONObject.optString("response_type", null);
        jSONObject.optLong("ad_network_timeout_millis", -1L);
    }
}
