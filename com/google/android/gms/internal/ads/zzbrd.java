package com.google.android.gms.internal.ads;

import f.a.b.a.a;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final /* synthetic */ class zzbrd {
    public static void zza(zzbre zzbreVar, String str, Map map) {
        try {
            zzbreVar.zze(str, com.google.android.gms.ads.internal.client.zzaw.zzb().zzh(map));
        } catch (JSONException unused) {
            zzcfi.zzj("Could not convert parameters to JSON.");
        }
    }

    public static void zzb(zzbre zzbreVar, String str, JSONObject jSONObject) {
        StringBuilder F = a.F("(window.AFMA_ReceiveMessage || function() {})('", str, "',", jSONObject.toString(), ");");
        zzcfi.zze("Dispatching AFMA event: ".concat(F.toString()));
        zzbreVar.zza(F.toString());
    }

    public static void zzc(zzbre zzbreVar, String str, String str2) {
        zzbreVar.zza(str + "(" + str2 + ");");
    }

    public static void zzd(zzbre zzbreVar, String str, JSONObject jSONObject) {
        zzbreVar.zzb(str, jSONObject.toString());
    }
}
