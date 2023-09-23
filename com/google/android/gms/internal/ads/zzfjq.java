package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfjq extends zzfjn {
    private WebView zza;
    private Long zzb = null;
    private final Map zzc;

    public zzfjq(Map map, String str) {
        this.zzc = map;
    }

    @Override // com.google.android.gms.internal.ads.zzfjn
    public final void zzc() {
        super.zzc();
        new Handler().postDelayed(new zzfjp(this), Math.max(4000 - (this.zzb == null ? 4000L : TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.zzb.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzfjn
    public final void zzf(zzfip zzfipVar, zzfin zzfinVar) {
        JSONObject jSONObject = new JSONObject();
        Map zzi = zzfinVar.zzi();
        for (String str : zzi.keySet()) {
            zzfjr.zzg(jSONObject, str, (zzfiv) zzi.get(str));
        }
        zzg(zzfipVar, zzfinVar, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzfjn
    public final void zzj() {
        WebView webView = new WebView(zzfje.zzb().zza());
        this.zza = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        zzi(this.zza);
        WebView webView2 = this.zza;
        if (webView2 != null && !TextUtils.isEmpty(null)) {
            webView2.loadUrl("javascript: null");
        }
        Iterator it = this.zzc.keySet().iterator();
        if (!it.hasNext()) {
            this.zzb = Long.valueOf(System.nanoTime());
            return;
        }
        zzfiv zzfivVar = (zzfiv) this.zzc.get((String) it.next());
        throw null;
    }
}
