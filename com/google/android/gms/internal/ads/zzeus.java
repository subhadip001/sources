package com.google.android.gms.internal.ads;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzeus implements zzetb {
    private final JSONObject zza;

    public zzeus(Context context) {
        this.zza = zzcae.zzc(context);
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final int zza() {
        return 46;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final zzfvj zzb() {
        return zzfva.zzi(new zzeta() { // from class: com.google.android.gms.internal.ads.zzeur
            @Override // com.google.android.gms.internal.ads.zzeta
            public final void zzf(Object obj) {
                zzeus.this.zzc((JSONObject) obj);
            }
        });
    }

    public final /* synthetic */ void zzc(JSONObject jSONObject) {
        try {
            jSONObject.put("gms_sdk_env", this.zza);
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed putting version constants.");
        }
    }
}
