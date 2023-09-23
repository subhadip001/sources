package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcmk extends zzcml {
    public zzcmk(zzcli zzcliVar, zzbdl zzbdlVar, boolean z) {
        super(zzcliVar, zzbdlVar, z);
    }

    @Override // com.google.android.gms.internal.ads.zzclp, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return zzM(webView, str, null);
    }
}
