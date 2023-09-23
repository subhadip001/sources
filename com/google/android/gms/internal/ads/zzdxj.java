package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import f.a.b.a.a;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdxj {
    private Long zza;
    private final String zzb;
    private String zzc;
    private Integer zzd;
    private String zze;
    private Integer zzf;

    public /* synthetic */ zzdxj(String str, zzdxi zzdxiVar) {
        this.zzb = str;
    }

    public static /* bridge */ /* synthetic */ String zza(zzdxj zzdxjVar) {
        String str = (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzhR);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", zzdxjVar.zza);
            jSONObject.put("eventCategory", zzdxjVar.zzb);
            jSONObject.putOpt(NotificationCompat.CATEGORY_EVENT, zzdxjVar.zzc);
            jSONObject.putOpt("errorCode", zzdxjVar.zzd);
            jSONObject.putOpt("rewardType", zzdxjVar.zze);
            jSONObject.putOpt("rewardAmount", zzdxjVar.zzf);
        } catch (JSONException unused) {
            zzcfi.zzj("Could not convert parameters to JSON.");
        }
        return a.r(str, "(\"h5adsEvent\",", jSONObject.toString(), ");");
    }
}
