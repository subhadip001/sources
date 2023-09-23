package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcjv implements zzbol {
    private static final Integer zzb(Map map, String str) {
        if (map.containsKey(str)) {
            try {
                return Integer.valueOf(Integer.parseInt((String) map.get(str)));
            } catch (NumberFormatException unused) {
                zzcfi.zzj("Precache invalid numeric parameter '" + str + "': " + ((String) map.get(str)));
                return null;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcju zzcjuVar;
        zzcjm zza;
        zzchr zzchrVar = (zzchr) obj;
        if (zzcfi.zzm(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            zzcfi.zze("Precache GMSG: ".concat(jSONObject.toString()));
        }
        zzcjn zzy = com.google.android.gms.ads.internal.zzt.zzy();
        if (map.containsKey("abort")) {
            if (zzy.zzd(zzchrVar)) {
                return;
            }
            zzcfi.zzj("Precache abort but no precache task running.");
            return;
        }
        String str = (String) map.get("src");
        Integer zzb = zzb(map, "periodicReportIntervalMs");
        Integer zzb2 = zzb(map, "exoPlayerRenderingIntervalMs");
        Integer zzb3 = zzb(map, "exoPlayerIdleIntervalMs");
        zzchq zzchqVar = new zzchq((String) map.get("flags"));
        boolean z = zzchqVar.zzn;
        if (str != null) {
            String[] strArr = {str};
            String str2 = (String) map.get("demuxed");
            if (str2 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str2);
                    String[] strArr2 = new String[jSONArray.length()];
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        strArr2[i2] = jSONArray.getString(i2);
                    }
                    strArr = strArr2;
                } catch (JSONException unused) {
                    zzcfi.zzj("Malformed demuxed URL list for precache: ".concat(str2));
                    strArr = null;
                }
            }
            if (strArr == null) {
                strArr = new String[]{str};
            }
            if (z) {
                Iterator it = zzy.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        zza = null;
                        break;
                    }
                    zzcjm zzcjmVar = (zzcjm) it.next();
                    if (zzcjmVar.zza == zzchrVar && str.equals(zzcjmVar.zze())) {
                        zza = zzcjmVar;
                        break;
                    }
                }
            } else {
                zza = zzy.zza(zzchrVar);
            }
            if (zza != null) {
                zzcfi.zzj("Precache task is already running.");
                return;
            } else if (zzchrVar.zzm() == null) {
                zzcfi.zzj("Precache requires a dependency provider.");
                return;
            } else {
                Integer zzb4 = zzb(map, "player");
                if (zzb4 == null) {
                    zzb4 = 0;
                }
                if (zzb != null) {
                    zzchrVar.zzC(zzb.intValue());
                }
                if (zzb2 != null) {
                    zzchrVar.zzA(zzb2.intValue());
                }
                if (zzb3 != null) {
                    zzchrVar.zzz(zzb3.intValue());
                }
                int intValue = zzb4.intValue();
                zzcjg zzcjgVar = zzchrVar.zzm().zzc;
                if (intValue > 0) {
                    int zzu = zzchi.zzu();
                    if (zzu < zzchqVar.zzh) {
                        zzcjuVar = new zzckd(zzchrVar, zzchqVar);
                    } else if (zzu < zzchqVar.zzb) {
                        zzcjuVar = new zzcka(zzchrVar, zzchqVar);
                    } else {
                        zzcjuVar = new zzcjy(zzchrVar);
                    }
                } else {
                    zzcjuVar = new zzcjx(zzchrVar);
                }
                new zzcjm(zzchrVar, zzcjuVar, str, strArr).zzb();
            }
        } else {
            zzcjm zza2 = zzy.zza(zzchrVar);
            if (zza2 == null) {
                zzcfi.zzj("Precache must specify a source.");
                return;
            }
            zzcjuVar = zza2.zzb;
        }
        Integer zzb5 = zzb(map, "minBufferMs");
        if (zzb5 != null) {
            zzcjuVar.zzp(zzb5.intValue());
        }
        Integer zzb6 = zzb(map, "maxBufferMs");
        if (zzb6 != null) {
            zzcjuVar.zzo(zzb6.intValue());
        }
        Integer zzb7 = zzb(map, "bufferForPlaybackMs");
        if (zzb7 != null) {
            zzcjuVar.zzh(zzb7.intValue());
        }
        Integer zzb8 = zzb(map, "bufferForPlaybackAfterRebufferMs");
        if (zzb8 != null) {
            zzcjuVar.zzn(zzb8.intValue());
        }
    }
}
