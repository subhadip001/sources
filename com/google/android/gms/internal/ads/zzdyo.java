package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.text.TextUtils;
import com.arthenica.ffmpegkit.MediaInformation;
import com.google.firebase.messaging.Constants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdyo implements zzdbv, zzden, zzddk {
    private final zzdza zza;
    private final String zzb;
    private int zzc = 0;
    private zzdyn zzd = zzdyn.AD_REQUESTED;
    private zzdbl zze;
    private com.google.android.gms.ads.internal.client.zze zzf;

    public zzdyo(zzdza zzdzaVar, zzfby zzfbyVar) {
        this.zza = zzdzaVar;
        this.zzb = zzfbyVar.zzf;
    }

    private static JSONObject zze(com.google.android.gms.ads.internal.client.zze zzeVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorDomain", zzeVar.zzc);
        jSONObject.put("errorCode", zzeVar.zza);
        jSONObject.put("errorDescription", zzeVar.zzb);
        com.google.android.gms.ads.internal.client.zze zzeVar2 = zzeVar.zzd;
        jSONObject.put("underlyingError", zzeVar2 == null ? null : zze(zzeVar2));
        return jSONObject;
    }

    private static JSONObject zzf(zzdbl zzdblVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("winningAdapterClassName", zzdblVar.zzg());
        jSONObject.put("responseSecsSinceEpoch", zzdblVar.zzc());
        jSONObject.put("responseId", zzdblVar.zzh());
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzhI)).booleanValue()) {
            String zzd = zzdblVar.zzd();
            if (!TextUtils.isEmpty(zzd)) {
                zzcfi.zze("Bidding data: ".concat(String.valueOf(zzd)));
                jSONObject.put("biddingData", new JSONObject(zzd));
            }
        }
        JSONArray jSONArray = new JSONArray();
        for (com.google.android.gms.ads.internal.client.zzu zzuVar : zzdblVar.zzi()) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("adapterClassName", zzuVar.zza);
            jSONObject2.put("latencyMillis", zzuVar.zzb);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzhJ)).booleanValue()) {
                jSONObject2.put("credentials", com.google.android.gms.ads.internal.client.zzaw.zzb().zzg(zzuVar.zzd));
            }
            com.google.android.gms.ads.internal.client.zze zzeVar = zzuVar.zzc;
            jSONObject2.put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, zzeVar == null ? null : zze(zzeVar));
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("adNetworks", jSONArray);
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzdbv
    public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zzd = zzdyn.AD_LOAD_FAILED;
        this.zzf = zzeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final void zzb(zzfbs zzfbsVar) {
        if (zzfbsVar.zzb.zza.isEmpty()) {
            return;
        }
        this.zzc = ((zzfbg) zzfbsVar.zzb.zza.get(0)).zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final void zzbE(zzbzu zzbzuVar) {
        this.zza.zze(this.zzb, this);
    }

    @Override // com.google.android.gms.internal.ads.zzddk
    public final void zzbH(zzcxw zzcxwVar) {
        this.zze = zzcxwVar.zzl();
        this.zzd = zzdyn.AD_LOADED;
    }

    public final JSONObject zzc() {
        IBinder iBinder;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(RemoteConfigConstants.ResponseFieldKey.STATE, this.zzd);
        jSONObject.put(MediaInformation.KEY_FORMAT_PROPERTIES, zzfbg.zza(this.zzc));
        zzdbl zzdblVar = this.zze;
        JSONObject jSONObject2 = null;
        if (zzdblVar != null) {
            jSONObject2 = zzf(zzdblVar);
        } else {
            com.google.android.gms.ads.internal.client.zze zzeVar = this.zzf;
            if (zzeVar != null && (iBinder = zzeVar.zze) != null) {
                zzdbl zzdblVar2 = (zzdbl) iBinder;
                jSONObject2 = zzf(zzdblVar2);
                if (zzdblVar2.zzi().isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(zze(this.zzf));
                    jSONObject2.put("errors", jSONArray);
                }
            }
        }
        jSONObject.put("responseInfo", jSONObject2);
        return jSONObject;
    }

    public final boolean zzd() {
        return this.zzd != zzdyn.AD_REQUESTED;
    }
}
