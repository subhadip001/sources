package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdyu {
    private final String zza;
    private final String zzb;
    private final int zzc;
    private final String zzd;
    private final int zze;

    public zzdyu(String str, String str2, int i2, String str3, int i3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i2;
        this.zzd = str3;
        this.zze = i3;
    }

    public final JSONObject zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("adapterClassName", this.zza);
        jSONObject.put("version", this.zzb);
        jSONObject.put("status", this.zzc);
        jSONObject.put("description", this.zzd);
        jSONObject.put("initializationLatencyMillis", this.zze);
        return jSONObject;
    }
}
