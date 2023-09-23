package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportDataCapture;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import f.e.a.k.e;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfgw {
    private final Context zza;
    private final String zzb;
    private final String zzc;

    public zzfgw(Context context, zzcfo zzcfoVar) {
        this.zza = context;
        this.zzb = context.getPackageName();
        this.zzc = zzcfoVar.zza;
    }

    public final void zza(Map map) {
        map.put("s", "gmob_sdk");
        map.put("v", "3");
        map.put("os", Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        com.google.android.gms.ads.internal.zzt.zzp();
        map.put("device", com.google.android.gms.ads.internal.util.zzs.zzq());
        map.put("app", this.zzb);
        com.google.android.gms.ads.internal.zzt.zzp();
        map.put("is_lite_sdk", true != com.google.android.gms.ads.internal.util.zzs.zzA(this.zza) ? CrashlyticsReportDataCapture.SIGNAL_DEFAULT : "1");
        List zzb = zzbhy.zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzfQ)).booleanValue()) {
            zzb.addAll(com.google.android.gms.ads.internal.zzt.zzo().zzh().zzh().zzd());
        }
        map.put(e.u, TextUtils.join(",", zzb));
        map.put(RemoteConfigConstants.RequestFieldKey.SDK_VERSION, this.zzc);
    }
}
