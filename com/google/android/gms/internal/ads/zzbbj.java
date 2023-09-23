package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbbj implements Runnable {
    public final ValueCallback zza;
    public final /* synthetic */ zzbbb zzb;
    public final /* synthetic */ WebView zzc;
    public final /* synthetic */ boolean zzd;
    public final /* synthetic */ zzbbl zze;

    public zzbbj(zzbbl zzbblVar, final zzbbb zzbbbVar, final WebView webView, final boolean z) {
        this.zze = zzbblVar;
        this.zzb = zzbbbVar;
        this.zzc = webView;
        this.zzd = z;
        this.zza = new ValueCallback() { // from class: com.google.android.gms.internal.ads.zzbbi
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                zzbbj zzbbjVar = zzbbj.this;
                zzbbb zzbbbVar2 = zzbbbVar;
                WebView webView2 = webView;
                boolean z2 = z;
                zzbbjVar.zze.zzd(zzbbbVar2, webView2, (String) obj, z2);
            }
        };
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzc.getSettings().getJavaScriptEnabled()) {
            try {
                this.zzc.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.zza);
            } catch (Throwable unused) {
                this.zza.onReceiveValue("");
            }
        }
    }
}
