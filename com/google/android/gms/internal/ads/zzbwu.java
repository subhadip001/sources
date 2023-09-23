package com.google.android.gms.internal.ads;

import com.arthenica.ffmpegkit.StreamInformation;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public class zzbwu {
    private final zzcli zza;
    private final String zzb;

    public zzbwu(zzcli zzcliVar, String str) {
        this.zza = zzcliVar;
        this.zzb = str;
    }

    public final void zzf(int i2, int i3, int i4, int i5) {
        try {
            this.zza.zze("onDefaultPositionReceived", new JSONObject().put("x", i2).put("y", i3).put(StreamInformation.KEY_WIDTH, i4).put(StreamInformation.KEY_HEIGHT, i5));
        } catch (JSONException e2) {
            zzcfi.zzh("Error occurred while dispatching default position.", e2);
        }
    }

    public final void zzg(String str) {
        try {
            JSONObject put = new JSONObject().put("message", str).put("action", this.zzb);
            zzcli zzcliVar = this.zza;
            if (zzcliVar != null) {
                zzcliVar.zze("onError", put);
            }
        } catch (JSONException e2) {
            zzcfi.zzh("Error occurred while dispatching error event.", e2);
        }
    }

    public final void zzh(String str) {
        try {
            this.zza.zze("onReadyEventReceived", new JSONObject().put("js", str));
        } catch (JSONException e2) {
            zzcfi.zzh("Error occurred while dispatching ready Event.", e2);
        }
    }

    public final void zzi(int i2, int i3, int i4, int i5, float f2, int i6) {
        try {
            this.zza.zze("onScreenInfoChanged", new JSONObject().put(StreamInformation.KEY_WIDTH, i2).put(StreamInformation.KEY_HEIGHT, i3).put("maxSizeWidth", i4).put("maxSizeHeight", i5).put("density", f2).put("rotation", i6));
        } catch (JSONException e2) {
            zzcfi.zzh("Error occurred while obtaining screen information.", e2);
        }
    }

    public final void zzj(int i2, int i3, int i4, int i5) {
        try {
            this.zza.zze("onSizeChanged", new JSONObject().put("x", i2).put("y", i3).put(StreamInformation.KEY_WIDTH, i4).put(StreamInformation.KEY_HEIGHT, i5));
        } catch (JSONException e2) {
            zzcfi.zzh("Error occurred while dispatching size change.", e2);
        }
    }

    public final void zzk(String str) {
        try {
            this.zza.zze("onStateChanged", new JSONObject().put(RemoteConfigConstants.ResponseFieldKey.STATE, str));
        } catch (JSONException e2) {
            zzcfi.zzh("Error occurred while dispatching state change.", e2);
        }
    }
}
