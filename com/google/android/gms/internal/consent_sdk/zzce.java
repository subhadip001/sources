package com.google.android.gms.internal.consent_sdk;

import android.webkit.WebView;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
/* loaded from: classes.dex */
public final class zzce {
    private static Boolean zza;

    private zzce() {
    }

    public static void zza(WebView webView, String str) {
        boolean booleanValue;
        synchronized (zzce.class) {
            if (zza == null) {
                try {
                    webView.evaluateJavascript("(function(){})()", null);
                    zza = Boolean.TRUE;
                } catch (IllegalStateException unused) {
                    zza = Boolean.FALSE;
                }
            }
            booleanValue = zza.booleanValue();
        }
        if (!booleanValue) {
            String valueOf = String.valueOf(str);
            webView.loadUrl(valueOf.length() != 0 ? "javascript:".concat(valueOf) : new String("javascript:"));
            return;
        }
        webView.evaluateJavascript(str, null);
    }
}
