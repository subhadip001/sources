package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfjf implements Runnable {
    public final /* synthetic */ WebView zza;
    public final /* synthetic */ String zzb;

    public zzfjf(zzfjg zzfjgVar, WebView webView, String str) {
        this.zza = webView;
        this.zzb = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.loadUrl(this.zzb);
    }
}
