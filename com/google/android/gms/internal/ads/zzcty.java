package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcty implements zzbss {
    private final Context zza;
    private final zzbai zzb;
    private final PowerManager zzc;

    public zzcty(Context context, zzbai zzbaiVar) {
        this.zza = context;
        this.zzb = zzbaiVar;
        this.zzc = (PowerManager) context.getSystemService("power");
    }

    @Override // com.google.android.gms.internal.ads.zzbss
    /* renamed from: zza */
    public final JSONObject zzb(zzcub zzcubVar) {
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        zzbal zzbalVar = zzcubVar.zzf;
        if (zzbalVar == null) {
            jSONObject = new JSONObject();
        } else if (this.zzb.zzd() != null) {
            boolean z = zzbalVar.zza;
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("afmaVersion", this.zzb.zzb()).put("activeViewJSON", this.zzb.zzd()).put("timestamp", zzcubVar.zzd).put("adFormat", this.zzb.zza()).put("hashCode", this.zzb.zzc()).put("isMraid", false).put("isStopped", false).put("isPaused", zzcubVar.zzb).put("isNative", this.zzb.zze()).put("isScreenOn", this.zzc.isInteractive()).put("appMuted", com.google.android.gms.ads.internal.zzt.zzr().zze()).put("appVolume", com.google.android.gms.ads.internal.zzt.zzr().zza()).put("deviceVolume", com.google.android.gms.ads.internal.util.zzab.zzb(this.zza.getApplicationContext()));
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzeG)).booleanValue()) {
                AudioManager audioManager = (AudioManager) this.zza.getApplicationContext().getSystemService("audio");
                Integer valueOf = audioManager == null ? null : Integer.valueOf(audioManager.getMode());
                if (valueOf != null) {
                    jSONObject3.put("audioMode", valueOf);
                }
            }
            Rect rect = new Rect();
            Display defaultDisplay = ((WindowManager) this.zza.getSystemService("window")).getDefaultDisplay();
            rect.right = defaultDisplay.getWidth();
            rect.bottom = defaultDisplay.getHeight();
            jSONObject3.put("windowVisibility", zzbalVar.zzb).put("isAttachedToWindow", z).put("viewBox", new JSONObject().put("top", zzbalVar.zzc.top).put("bottom", zzbalVar.zzc.bottom).put("left", zzbalVar.zzc.left).put("right", zzbalVar.zzc.right)).put("adBox", new JSONObject().put("top", zzbalVar.zzd.top).put("bottom", zzbalVar.zzd.bottom).put("left", zzbalVar.zzd.left).put("right", zzbalVar.zzd.right)).put("globalVisibleBox", new JSONObject().put("top", zzbalVar.zze.top).put("bottom", zzbalVar.zze.bottom).put("left", zzbalVar.zze.left).put("right", zzbalVar.zze.right)).put("globalVisibleBoxVisible", zzbalVar.zzf).put("localVisibleBox", new JSONObject().put("top", zzbalVar.zzg.top).put("bottom", zzbalVar.zzg.bottom).put("left", zzbalVar.zzg.left).put("right", zzbalVar.zzg.right)).put("localVisibleBoxVisible", zzbalVar.zzh).put("hitBox", new JSONObject().put("top", zzbalVar.zzi.top).put("bottom", zzbalVar.zzi.bottom).put("left", zzbalVar.zzi.left).put("right", zzbalVar.zzi.right)).put("screenDensity", this.zza.getResources().getDisplayMetrics().density);
            jSONObject3.put("isVisible", zzcubVar.zza);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzbi)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = zzbalVar.zzk;
                if (list != null) {
                    for (Rect rect2 : list) {
                        jSONArray2.put(new JSONObject().put("top", rect2.top).put("bottom", rect2.bottom).put("left", rect2.left).put("right", rect2.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(zzcubVar.zze)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        } else {
            throw new JSONException("Active view Info cannot be null.");
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
