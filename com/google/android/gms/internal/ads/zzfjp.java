package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfjp implements Runnable {
    public final /* synthetic */ zzfjq zza;
    private final WebView zzb;

    public zzfjp(zzfjq zzfjqVar) {
        WebView webView;
        this.zza = zzfjqVar;
        webView = zzfjqVar.zza;
        this.zzb = webView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.destroy();
    }
}
