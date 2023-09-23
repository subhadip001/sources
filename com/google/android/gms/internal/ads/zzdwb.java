package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportDataCapture;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
@Deprecated
/* loaded from: classes.dex */
public final class zzdwb {
    private final ConcurrentHashMap zza;
    private final zzcev zzb;
    private final zzfby zzc;
    private final String zzd;

    public zzdwb(zzdwl zzdwlVar, zzcev zzcevVar, zzfby zzfbyVar, String str) {
        ConcurrentHashMap zzc = zzdwlVar.zzc();
        this.zza = zzc;
        this.zzb = zzcevVar;
        this.zzc = zzfbyVar;
        this.zzd = str;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzfW)).booleanValue()) {
            int zzd = com.google.android.gms.ads.nonagon.signalgeneration.zzf.zzd(zzfbyVar);
            int i2 = zzd - 1;
            if (i2 != 0) {
                if (i2 == 1) {
                    zzc.put("se", "query_g");
                } else if (i2 == 2) {
                    zzc.put("se", "r_adinfo");
                } else if (i2 != 3) {
                    zzc.put("se", "r_both");
                } else {
                    zzc.put("se", "r_adstring");
                }
                zzc.put("scar", "true");
                if (zzd == 2) {
                    zzc.put("rid", str);
                }
                zzd("ragent", zzfbyVar.zzd.zzp);
                zzd("rtype", com.google.android.gms.ads.nonagon.signalgeneration.zzf.zza(com.google.android.gms.ads.nonagon.signalgeneration.zzf.zzb(zzfbyVar.zzd)));
                return;
            }
            zzc.put("scar", "false");
        }
    }

    private final void zzd(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.zza.put(str, str2);
    }

    public final Map zza() {
        return this.zza;
    }

    public final void zzb(zzfbs zzfbsVar) {
        if (zzfbsVar.zzb.zza.size() > 0) {
            switch (((zzfbg) zzfbsVar.zzb.zza.get(0)).zzb) {
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
                    this.zza.put("as", true != this.zzb.zzj() ? CrashlyticsReportDataCapture.SIGNAL_DEFAULT : "1");
                    break;
                default:
                    this.zza.put(FirebaseAnalytics.Param.AD_FORMAT, "unknown");
                    break;
            }
        }
        zzd("gqi", zzfbsVar.zzb.zzb.zzb);
    }

    public final void zzc(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.zza.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.zza.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }
}
