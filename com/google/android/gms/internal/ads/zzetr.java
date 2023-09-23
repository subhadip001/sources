package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzetr implements zzeta {
    private final AdvertisingIdClient.Info zza;
    private final String zzb;

    public zzetr(AdvertisingIdClient.Info info, String str) {
        this.zza = info;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzeta
    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        try {
            JSONObject zzf = com.google.android.gms.ads.internal.util.zzbu.zzf((JSONObject) obj, "pii");
            AdvertisingIdClient.Info info = this.zza;
            if (info != null && !TextUtils.isEmpty(info.getId())) {
                zzf.put("rdid", this.zza.getId());
                zzf.put("is_lat", this.zza.isLimitAdTrackingEnabled());
                zzf.put("idtype", "adid");
                return;
            }
            zzf.put("pdid", this.zzb);
            zzf.put("pdidtype", "ssaid");
        } catch (JSONException e2) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed putting Ad ID.", e2);
        }
    }
}
