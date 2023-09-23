package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import f.e.a.k.e;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbno implements zzbol {
    @Override // com.google.android.gms.internal.ads.zzbol
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcli zzcliVar = (zzcli) obj;
        String str = (String) map.get("action");
        if ("tick".equals(str)) {
            String str2 = (String) map.get("label");
            String str3 = (String) map.get("start_label");
            String str4 = (String) map.get("timestamp");
            if (TextUtils.isEmpty(str2)) {
                zzcfi.zzj("No label given for CSI tick.");
            } else if (TextUtils.isEmpty(str4)) {
                zzcfi.zzj("No timestamp given for CSI tick.");
            } else {
                try {
                    long parseLong = (Long.parseLong(str4) - com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis()) + com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime();
                    if (true == TextUtils.isEmpty(str3)) {
                        str3 = "native:view_load";
                    }
                    zzcliVar.zzo().zzc(str2, str3, parseLong);
                } catch (NumberFormatException e2) {
                    zzcfi.zzk("Malformed timestamp for CSI tick.", e2);
                }
            }
        } else if ("experiment".equals(str)) {
            String str5 = (String) map.get("value");
            if (TextUtils.isEmpty(str5)) {
                zzcfi.zzj("No value given for CSI experiment.");
            } else {
                zzcliVar.zzo().zza().zzd(e.u, str5);
            }
        } else if ("extra".equals(str)) {
            String str6 = (String) map.get("name");
            String str7 = (String) map.get("value");
            if (TextUtils.isEmpty(str7)) {
                zzcfi.zzj("No value given for CSI extra.");
            } else if (TextUtils.isEmpty(str6)) {
                zzcfi.zzj("No name given for CSI extra.");
            } else {
                zzcliVar.zzo().zza().zzd(str6, str7);
            }
        }
    }
}
