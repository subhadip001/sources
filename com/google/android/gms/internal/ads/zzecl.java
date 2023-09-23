package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzecl implements zzbss {
    @Override // com.google.android.gms.internal.ads.zzbss
    public final /* bridge */ /* synthetic */ JSONObject zzb(Object obj) {
        zzecm zzecmVar = (zzecm) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject2.put("base_url", zzecmVar.zzd.zzb());
        jSONObject2.put("signals", zzecmVar.zzc);
        jSONObject3.put("body", zzecmVar.zzb.zzc);
        jSONObject3.put("headers", com.google.android.gms.ads.internal.client.zzaw.zzb().zzh(zzecmVar.zzb.zzb));
        jSONObject3.put("response_code", zzecmVar.zzb.zza);
        jSONObject3.put("latency", zzecmVar.zzb.zzd);
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", zzecmVar.zzd.zzg());
        return jSONObject;
    }
}
