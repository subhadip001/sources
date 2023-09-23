package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcae extends zzcaf {
    private final Object zza = new Object();
    private final Context zzb;
    private SharedPreferences zzc;
    private final zzbsp zzd;

    public zzcae(Context context, zzbsp zzbspVar) {
        this.zzb = context.getApplicationContext();
        this.zzd = zzbspVar;
    }

    public static JSONObject zzc(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("js", zzcfo.zza().zza);
            jSONObject.put("mf", zzbjo.zza.zze());
            jSONObject.put("cl", "448117567");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", DynamiteModule.getRemoteVersion(context, ModuleDescriptor.MODULE_ID));
            jSONObject.put("container_version", GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final zzfvj zza() {
        synchronized (this.zza) {
            if (this.zzc == null) {
                this.zzc = this.zzb.getSharedPreferences("google_ads_flags_meta", 0);
            }
        }
        if (com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis() - this.zzc.getLong("js_last_update", 0L) < ((Long) zzbjo.zzb.zze()).longValue()) {
            return zzfva.zzi(null);
        }
        return zzfva.zzm(this.zzd.zzb(zzc(this.zzb)), new zzfoi() { // from class: com.google.android.gms.internal.ads.zzcad
            @Override // com.google.android.gms.internal.ads.zzfoi
            public final Object apply(Object obj) {
                zzcae.this.zzb((JSONObject) obj);
                return null;
            }
        }, zzcfv.zzf);
    }

    public final /* synthetic */ Void zzb(JSONObject jSONObject) {
        zzbhy.zzd(this.zzb, 1, jSONObject);
        this.zzc.edit().putLong("js_last_update", com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis()).apply();
        return null;
    }
}
