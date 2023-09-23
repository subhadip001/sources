package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzcfv;
import com.google.android.gms.internal.ads.zzdwb;
import com.google.android.gms.internal.ads.zzdwl;
import com.google.android.gms.internal.ads.zzfby;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportDataCapture;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzf {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static String zza(String str) {
        char c;
        if (TextUtils.isEmpty(str)) {
            return "unspecified";
        }
        switch (str.hashCode()) {
            case 1743582862:
                if (str.equals("requester_type_0")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1743582863:
                if (str.equals("requester_type_1")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1743582864:
                if (str.equals("requester_type_2")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1743582865:
                if (str.equals("requester_type_3")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1743582866:
                if (str.equals("requester_type_4")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1743582867:
                if (str.equals("requester_type_5")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1743582868:
                if (str.equals("requester_type_6")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1743582869:
                if (str.equals("requester_type_7")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return CrashlyticsReportDataCapture.SIGNAL_DEFAULT;
            case 1:
                return "1";
            case 2:
                return "2";
            case 3:
                return "3";
            case 4:
                return "4";
            case 5:
                return "5";
            case 6:
                return "6";
            case 7:
                return "7";
            default:
                return str;
        }
    }

    public static String zzb(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        Bundle bundle = zzlVar.zzc;
        return bundle == null ? "unspecified" : bundle.getString("query_info_type");
    }

    public static void zzc(final zzdwl zzdwlVar, final zzdwb zzdwbVar, final String str, final Pair... pairArr) {
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzfW)).booleanValue()) {
            zzcfv.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zze
                @Override // java.lang.Runnable
                public final void run() {
                    zzdwl zzdwlVar2 = zzdwl.this;
                    zzdwb zzdwbVar2 = zzdwbVar;
                    String str2 = str;
                    Pair[] pairArr2 = pairArr;
                    Map zzc = zzdwbVar2 == null ? zzdwlVar2.zzc() : zzdwbVar2.zza();
                    zzc.put("action", str2);
                    for (Pair pair : pairArr2) {
                        zzc.put((String) pair.first, (String) pair.second);
                    }
                    zzdwlVar2.zze(zzc);
                }
            });
        }
    }

    public static int zzd(zzfby zzfbyVar) {
        if (zzfbyVar.zzq) {
            return 2;
        }
        com.google.android.gms.ads.internal.client.zzl zzlVar = zzfbyVar.zzd;
        com.google.android.gms.ads.internal.client.zzc zzcVar = zzlVar.zzs;
        if (zzcVar == null && zzlVar.zzx == null) {
            return 1;
        }
        if (zzcVar == null || zzlVar.zzx == null) {
            return zzcVar != null ? 3 : 4;
        }
        return 5;
    }
}
