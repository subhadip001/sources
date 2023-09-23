package com.google.android.gms.internal.ads;

import android.os.Build;
import android.webkit.WebView;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public class zzfjn {
    private zzfkl zza;
    private long zzb;
    private int zzc;

    public zzfjn() {
        zzb();
        this.zza = new zzfkl(null);
    }

    public final WebView zza() {
        return (WebView) this.zza.get();
    }

    public final void zzb() {
        this.zzb = System.nanoTime();
        this.zzc = 1;
    }

    public void zzc() {
        this.zza.clear();
    }

    public final void zzd(String str, long j2) {
        if (j2 < this.zzb || this.zzc == 3) {
            return;
        }
        this.zzc = 3;
        zzfjg.zza().zzf(zza(), str);
    }

    public final void zze(String str, long j2) {
        if (j2 >= this.zzb) {
            this.zzc = 2;
            zzfjg.zza().zzf(zza(), str);
        }
    }

    public void zzf(zzfip zzfipVar, zzfin zzfinVar) {
        zzg(zzfipVar, zzfinVar, null);
    }

    public final void zzg(zzfip zzfipVar, zzfin zzfinVar, JSONObject jSONObject) {
        String zzh = zzfipVar.zzh();
        JSONObject jSONObject2 = new JSONObject();
        zzfjr.zzg(jSONObject2, "environment", "app");
        zzfjr.zzg(jSONObject2, "adSessionType", zzfinVar.zzd());
        JSONObject jSONObject3 = new JSONObject();
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        zzfjr.zzg(jSONObject3, "deviceType", str + "; " + str2);
        zzfjr.zzg(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        zzfjr.zzg(jSONObject3, "os", "Android");
        zzfjr.zzg(jSONObject2, "deviceInfo", jSONObject3);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        zzfjr.zzg(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        zzfjr.zzg(jSONObject4, "partnerName", zzfinVar.zze().zzb());
        zzfjr.zzg(jSONObject4, "partnerVersion", zzfinVar.zze().zzc());
        zzfjr.zzg(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        zzfjr.zzg(jSONObject5, "libraryVersion", "1.3.3-google_20200416");
        zzfjr.zzg(jSONObject5, RemoteConfigConstants.RequestFieldKey.APP_ID, zzfje.zzb().zza().getApplicationContext().getPackageName());
        zzfjr.zzg(jSONObject2, "app", jSONObject5);
        if (zzfinVar.zzf() != null) {
            zzfjr.zzg(jSONObject2, "contentUrl", zzfinVar.zzf());
        }
        zzfjr.zzg(jSONObject2, "customReferenceData", zzfinVar.zzg());
        JSONObject jSONObject6 = new JSONObject();
        Iterator it = zzfinVar.zzh().iterator();
        if (!it.hasNext()) {
            zzfjg.zza().zzg(zza(), zzh, jSONObject2, jSONObject6, jSONObject);
        } else {
            zzfiv zzfivVar = (zzfiv) it.next();
            throw null;
        }
    }

    public final void zzh(float f2) {
        zzfjg.zza().zze(zza(), f2);
    }

    public final void zzi(WebView webView) {
        this.zza = new zzfkl(webView);
    }

    public void zzj() {
    }

    public final boolean zzk() {
        return this.zza.get() != 0;
    }
}
