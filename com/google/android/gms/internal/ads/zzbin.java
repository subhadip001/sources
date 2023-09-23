package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
@Deprecated
/* loaded from: classes.dex */
public final class zzbin {
    private final List zza = new LinkedList();
    private final Map zzb;
    private final Object zzc;

    public zzbin(boolean z, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzb = linkedHashMap;
        this.zzc = new Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put(FirebaseAnalytics.Param.AD_FORMAT, str2);
    }

    public static final zzbik zzf() {
        return new zzbik(com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime(), null, null);
    }

    public final zzbim zza() {
        zzbim zzbimVar;
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzbB)).booleanValue();
        StringBuilder sb = new StringBuilder();
        HashMap hashMap = new HashMap();
        synchronized (this.zzc) {
            for (zzbik zzbikVar : this.zza) {
                long zza = zzbikVar.zza();
                String zzc = zzbikVar.zzc();
                zzbik zzb = zzbikVar.zzb();
                if (zzb != null && zza > 0) {
                    sb.append(zzc);
                    sb.append('.');
                    sb.append(zza - zzb.zza());
                    sb.append(',');
                    if (booleanValue) {
                        if (!hashMap.containsKey(Long.valueOf(zzb.zza()))) {
                            hashMap.put(Long.valueOf(zzb.zza()), new StringBuilder(zzc));
                        } else {
                            StringBuilder sb2 = (StringBuilder) hashMap.get(Long.valueOf(zzb.zza()));
                            sb2.append('+');
                            sb2.append(zzc);
                        }
                    }
                }
            }
            this.zza.clear();
            String str = null;
            if (!TextUtils.isEmpty(null)) {
                sb.append((String) null);
            } else if (sb.length() > 0) {
                sb.setLength(sb.length() - 1);
            }
            StringBuilder sb3 = new StringBuilder();
            if (booleanValue) {
                for (Map.Entry entry : hashMap.entrySet()) {
                    sb3.append((CharSequence) entry.getValue());
                    sb3.append('.');
                    long longValue = ((Long) entry.getKey()).longValue();
                    sb3.append((longValue - com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime()) + com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis());
                    sb3.append(',');
                }
                if (sb3.length() > 0) {
                    sb3.setLength(sb3.length() - 1);
                }
                str = sb3.toString();
            }
            zzbimVar = new zzbim(sb.toString(), str);
        }
        return zzbimVar;
    }

    @VisibleForTesting
    public final Map zzb() {
        Map map;
        synchronized (this.zzc) {
            com.google.android.gms.ads.internal.zzt.zzo().zzf();
            map = this.zzb;
        }
        return map;
    }

    public final void zzc(zzbin zzbinVar) {
        synchronized (this.zzc) {
        }
    }

    public final void zzd(String str, String str2) {
        zzbid zzf;
        if (TextUtils.isEmpty(str2) || (zzf = com.google.android.gms.ads.internal.zzt.zzo().zzf()) == null) {
            return;
        }
        synchronized (this.zzc) {
            zzbij zza = zzf.zza(str);
            Map map = this.zzb;
            map.put(str, zza.zza((String) map.get(str), str2));
        }
    }

    public final boolean zze(zzbik zzbikVar, long j2, String... strArr) {
        synchronized (this.zzc) {
            for (int i2 = 0; i2 <= 0; i2++) {
                this.zza.add(new zzbik(j2, strArr[i2], zzbikVar));
            }
        }
        return true;
    }
}
