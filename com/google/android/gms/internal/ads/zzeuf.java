package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzeuf implements zzeta {
    @VisibleForTesting
    public final String zza;
    @VisibleForTesting
    public final int zzb;

    public zzeuf(String str, int i2) {
        this.zza = str;
        this.zzb = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzeta
    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (TextUtils.isEmpty(this.zza) || this.zzb == -1) {
            return;
        }
        try {
            JSONObject zzf = com.google.android.gms.ads.internal.util.zzbu.zzf(jSONObject, "pii");
            zzf.put("pvid", this.zza);
            zzf.put("pvid_s", this.zzb);
        } catch (JSONException e2) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed putting gms core app set ID info.", e2);
        }
    }
}
