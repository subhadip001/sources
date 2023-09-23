package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportDataCapture;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfgn {
    private final HashMap zza;
    private final zzfgt zzb;

    private zzfgn() {
        HashMap hashMap = new HashMap();
        this.zza = hashMap;
        this.zzb = new zzfgt(com.google.android.gms.ads.internal.zzt.zzA());
        hashMap.put("new_csi", "1");
    }

    public static zzfgn zzb(String str) {
        zzfgn zzfgnVar = new zzfgn();
        zzfgnVar.zza.put("action", str);
        return zzfgnVar;
    }

    public static zzfgn zzc(String str) {
        zzfgn zzfgnVar = new zzfgn();
        zzfgnVar.zza.put("request_id", str);
        return zzfgnVar;
    }

    public final zzfgn zza(String str, String str2) {
        this.zza.put(str, str2);
        return this;
    }

    public final zzfgn zzd(String str) {
        this.zzb.zzb(str);
        return this;
    }

    public final zzfgn zze(String str, String str2) {
        this.zzb.zzc(str, str2);
        return this;
    }

    public final zzfgn zzf(zzfbg zzfbgVar) {
        this.zza.put("aai", zzfbgVar.zzx);
        return this;
    }

    public final zzfgn zzg(zzfbj zzfbjVar) {
        if (!TextUtils.isEmpty(zzfbjVar.zzb)) {
            this.zza.put("gqi", zzfbjVar.zzb);
        }
        return this;
    }

    public final zzfgn zzh(zzfbs zzfbsVar, zzcev zzcevVar) {
        zzfbr zzfbrVar = zzfbsVar.zzb;
        zzg(zzfbrVar.zzb);
        if (!zzfbrVar.zza.isEmpty()) {
            switch (((zzfbg) zzfbrVar.zza.get(0)).zzb) {
                case 1:
                    this.zza.put(FirebaseAnalytics.Param.AD_FORMAT, "banner");
                    break;
                case 2:
                    this.zza.put(FirebaseAnalytics.Param.AD_FORMAT, "interstitial");
                    break;
                case 3:
                    this.zza.put(FirebaseAnalytics.Param.AD_FORMAT, "native_express");
                    break;
                case 4:
                    this.zza.put(FirebaseAnalytics.Param.AD_FORMAT, "native_advanced");
                    break;
                case 5:
                    this.zza.put(FirebaseAnalytics.Param.AD_FORMAT, "rewarded");
                    break;
                case 6:
                    this.zza.put(FirebaseAnalytics.Param.AD_FORMAT, "app_open_ad");
                    if (zzcevVar != null) {
                        this.zza.put("as", true != zzcevVar.zzj() ? CrashlyticsReportDataCapture.SIGNAL_DEFAULT : "1");
                        break;
                    }
                    break;
                default:
                    this.zza.put(FirebaseAnalytics.Param.AD_FORMAT, "unknown");
                    break;
            }
        }
        return this;
    }

    public final zzfgn zzi(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.zza.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.zza.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
        return this;
    }

    public final Map zzj() {
        HashMap hashMap = new HashMap(this.zza);
        for (zzfgs zzfgsVar : this.zzb.zza()) {
            hashMap.put(zzfgsVar.zza, zzfgsVar.zzb);
        }
        return hashMap;
    }
}
