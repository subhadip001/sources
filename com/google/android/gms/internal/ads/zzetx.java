package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzetx implements zzeta {
    private final String zza;

    public zzetx(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzeta
    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        try {
            ((JSONObject) obj).put("ms", this.zza);
        } catch (JSONException e2) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed putting Ad ID.", e2);
        }
    }
}
