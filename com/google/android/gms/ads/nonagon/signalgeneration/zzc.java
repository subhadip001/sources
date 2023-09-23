package com.google.android.gms.ads.nonagon.signalgeneration;

import android.text.TextUtils;
import android.util.Pair;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzcfv;
import com.google.android.gms.internal.ads.zzdwb;
import com.google.android.gms.internal.ads.zzdwl;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzc {
    private final zzdwl zzh;
    private Map zzi;
    private final ArrayDeque zzf = new ArrayDeque();
    private final ArrayDeque zzg = new ArrayDeque();
    private final int zza = ((Integer) zzay.zzc().zzb(zzbhy.zzfU)).intValue();
    private final long zzb = ((Long) zzay.zzc().zzb(zzbhy.zzfV)).longValue();
    private final boolean zzc = ((Boolean) zzay.zzc().zzb(zzbhy.zzga)).booleanValue();
    private final boolean zzd = ((Boolean) zzay.zzc().zzb(zzbhy.zzfY)).booleanValue();
    private final Map zze = Collections.synchronizedMap(new zzb(this));

    public zzc(zzdwl zzdwlVar) {
        this.zzh = zzdwlVar;
    }

    private final synchronized void zzg(final zzdwb zzdwbVar) {
        if (this.zzc) {
            final ArrayDeque clone = this.zzg.clone();
            this.zzg.clear();
            final ArrayDeque clone2 = this.zzf.clone();
            this.zzf.clear();
            zzcfv.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zza
                @Override // java.lang.Runnable
                public final void run() {
                    zzc.this.zze(zzdwbVar, clone, clone2);
                }
            });
        }
    }

    private final void zzh(zzdwb zzdwbVar, ArrayDeque arrayDeque, String str) {
        Pair pair;
        while (!arrayDeque.isEmpty()) {
            Pair pair2 = (Pair) arrayDeque.poll();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(zzdwbVar.zza());
            this.zzi = concurrentHashMap;
            concurrentHashMap.put("action", "ev");
            this.zzi.put("e_r", str);
            this.zzi.put("e_id", (String) pair2.first);
            if (this.zzd) {
                try {
                    JSONObject jSONObject = new JSONObject((String) pair2.second);
                    pair = new Pair(zzf.zza(jSONObject.getJSONObject(NotificationCompat.MessagingStyle.Message.KEY_EXTRAS_BUNDLE).getString("query_info_type")), jSONObject.getString("request_agent"));
                } catch (JSONException unused) {
                    pair = new Pair("", "");
                }
                zzj(this.zzi, "e_type", (String) pair.first);
                zzj(this.zzi, "e_agent", (String) pair.second);
            }
            this.zzh.zze(this.zzi);
        }
    }

    private final synchronized void zzi() {
        long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis();
        try {
            Iterator it = this.zze.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (currentTimeMillis - ((Long) ((Pair) entry.getValue()).first).longValue() <= this.zzb) {
                    break;
                }
                this.zzg.add(new Pair((String) entry.getKey(), (String) ((Pair) entry.getValue()).second));
                it.remove();
            }
        } catch (ConcurrentModificationException e2) {
            com.google.android.gms.ads.internal.zzt.zzo().zzt(e2, "QueryJsonMap.removeExpiredEntries");
        }
    }

    private static final void zzj(Map map, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        map.put(str, str2);
    }

    public final synchronized String zzb(String str, zzdwb zzdwbVar) {
        Pair pair = (Pair) this.zze.get(str);
        zzdwbVar.zza().put("rid", str);
        if (pair != null) {
            String str2 = (String) pair.second;
            this.zze.remove(str);
            zzdwbVar.zza().put("mhit", "true");
            return str2;
        }
        zzdwbVar.zza().put("mhit", "false");
        return null;
    }

    public final synchronized void zzd(String str, String str2, zzdwb zzdwbVar) {
        this.zze.put(str, new Pair(Long.valueOf(com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis()), str2));
        zzi();
        zzg(zzdwbVar);
    }

    public final /* synthetic */ void zze(zzdwb zzdwbVar, ArrayDeque arrayDeque, ArrayDeque arrayDeque2) {
        zzh(zzdwbVar, arrayDeque, "to");
        zzh(zzdwbVar, arrayDeque2, "of");
    }

    public final synchronized void zzf(String str) {
        this.zze.remove(str);
    }
}
