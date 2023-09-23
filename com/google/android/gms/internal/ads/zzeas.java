package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.StringReader;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzeas {
    private final zzcnf zza;
    private final Context zzb;
    private final zzcfo zzc;
    private final zzfby zzd;
    private final Executor zze;
    private final String zzf;
    private final zzfhq zzg;
    private final zzfck zzh;
    private final zzdwb zzi;

    public zzeas(zzcnf zzcnfVar, Context context, zzcfo zzcfoVar, zzfby zzfbyVar, Executor executor, String str, zzfhq zzfhqVar, zzdwb zzdwbVar) {
        this.zza = zzcnfVar;
        this.zzb = context;
        this.zzc = zzcfoVar;
        this.zzd = zzfbyVar;
        this.zze = executor;
        this.zzf = str;
        this.zzg = zzfhqVar;
        this.zzh = zzcnfVar.zzv();
        this.zzi = zzdwbVar;
    }

    private final zzfvj zzc(final String str, final String str2) {
        zzfhg zza = zzfhf.zza(this.zzb, 11);
        zza.zzf();
        zzbsz zza2 = com.google.android.gms.ads.internal.zzt.zzf().zza(this.zzb, this.zzc, this.zza.zzy());
        zzbst zzbstVar = zzbsw.zza;
        final zzbsp zza3 = zza2.zza("google.afma.response.normalize", zzbstVar, zzbstVar);
        zzfvj zzn = zzfva.zzn(zzfva.zzn(zzfva.zzn(zzfva.zzi(""), new zzfuh() { // from class: com.google.android.gms.internal.ads.zzeap
            @Override // com.google.android.gms.internal.ads.zzfuh
            public final zzfvj zza(Object obj) {
                String str3 = str;
                String str4 = str2;
                String str5 = (String) obj;
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("headers", new JSONObject());
                    jSONObject3.put("body", str3);
                    jSONObject2.put("base_url", "");
                    jSONObject2.put("signals", new JSONObject(str4));
                    jSONObject.put("request", jSONObject2);
                    jSONObject.put("response", jSONObject3);
                    jSONObject.put("flags", new JSONObject());
                    return zzfva.zzi(jSONObject);
                } catch (JSONException e2) {
                    throw new JSONException("Preloaded loader: ".concat(String.valueOf(e2.getMessage())));
                }
            }
        }, this.zze), new zzfuh() { // from class: com.google.android.gms.internal.ads.zzeaq
            @Override // com.google.android.gms.internal.ads.zzfuh
            public final zzfvj zza(Object obj) {
                return zzbsp.this.zzb((JSONObject) obj);
            }
        }, this.zze), new zzfuh() { // from class: com.google.android.gms.internal.ads.zzear
            @Override // com.google.android.gms.internal.ads.zzfuh
            public final zzfvj zza(Object obj) {
                return zzeas.this.zzb((JSONObject) obj);
            }
        }, this.zze);
        zzfhp.zza(zzn, this.zzg, zza);
        return zzn;
    }

    private final String zzd(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && "unknown".equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.zzf));
            }
            return jSONObject.toString();
        } catch (JSONException e2) {
            zzcfi.zzj("Failed to update the ad types for rendering. ".concat(e2.toString()));
            return str;
        }
    }

    private static final String zze(String str) {
        try {
            return new JSONObject(str).optString("request_id", "");
        } catch (JSONException unused) {
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.zzfvj zza() {
        /*
            Method dump skipped, instructions count: 378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeas.zza():com.google.android.gms.internal.ads.zzfvj");
    }

    public final /* synthetic */ zzfvj zzb(JSONObject jSONObject) {
        return zzfva.zzi(new zzfbs(new zzfbp(this.zzd), zzfbr.zza(new StringReader(jSONObject.toString()))));
    }
}
