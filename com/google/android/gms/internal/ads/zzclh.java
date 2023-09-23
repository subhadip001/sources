package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import f.a.b.a.a;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzclh extends WebChromeClient {
    private final zzcli zza;

    public zzclh(zzcli zzcliVar) {
        this.zza = zzcliVar;
    }

    private static final Context zzb(WebView webView) {
        if (!(webView instanceof zzcli)) {
            return webView.getContext();
        }
        zzcli zzcliVar = (zzcli) webView;
        Activity zzk = zzcliVar.zzk();
        return zzk != null ? zzk : zzcliVar.getContext();
    }

    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        if (!(webView instanceof zzcli)) {
            zzcfi.zzj("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        com.google.android.gms.ads.internal.overlay.zzl zzN = ((zzcli) webView).zzN();
        if (zzN == null) {
            zzcfi.zzj("Tried to close an AdWebView not associated with an overlay.");
        } else {
            zzN.zzb();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String message = consoleMessage.message();
        String sourceId = consoleMessage.sourceId();
        String t = a.t(a.F("JS: ", message, " (", sourceId, ":"), consoleMessage.lineNumber(), ")");
        if (t.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i2 = zzclg.zza[consoleMessage.messageLevel().ordinal()];
        if (i2 == 1) {
            zzcfi.zzg(t);
        } else if (i2 == 2) {
            zzcfi.zzj(t);
        } else if (i2 == 3 || i2 == 4) {
            zzcfi.zzi(t);
        } else if (i2 != 5) {
            zzcfi.zzi(t);
        } else {
            zzcfi.zze(t);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        if (this.zza.zzJ() != null) {
            webView2.setWebViewClient(this.zza.zzJ());
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(String str, String str2, long j2, long j3, long j4, WebStorage.QuotaUpdater quotaUpdater) {
        long j5 = 5242880 - j4;
        if (j5 <= 0) {
            quotaUpdater.updateQuota(j2);
            return;
        }
        if (j2 == 0) {
            if (j3 > j5 || j3 > 1048576) {
                j3 = 0;
            }
        } else if (j3 == 0) {
            j3 = Math.min(Math.min(131072L, j5) + j2, 1048576L);
        } else {
            if (j3 <= Math.min(1048576 - j2, j5)) {
                j2 += j3;
            }
            j3 = j2;
        }
        quotaUpdater.updateQuota(j3);
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        boolean z;
        if (callback != null) {
            com.google.android.gms.ads.internal.zzt.zzp();
            if (!com.google.android.gms.ads.internal.util.zzs.zzx(this.zza.getContext(), "android.permission.ACCESS_FINE_LOCATION")) {
                com.google.android.gms.ads.internal.zzt.zzp();
                if (!com.google.android.gms.ads.internal.util.zzs.zzx(this.zza.getContext(), "android.permission.ACCESS_COARSE_LOCATION")) {
                    z = false;
                    callback.invoke(str, z, true);
                }
            }
            z = true;
            callback.invoke(str, z, true);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        com.google.android.gms.ads.internal.overlay.zzl zzN = this.zza.zzN();
        if (zzN == null) {
            zzcfi.zzj("Could not get ad overlay when hiding custom view.");
        } else {
            zzN.zzf();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zzb(webView), "alert", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zzb(webView), "onBeforeUnload", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zzb(webView), "confirm", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return zza(zzb(webView), "prompt", str, str2, str3, null, jsPromptResult, true);
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public final void onShowCustomView(View view, int i2, WebChromeClient.CustomViewCallback customViewCallback) {
        com.google.android.gms.ads.internal.overlay.zzl zzN = this.zza.zzN();
        if (zzN == null) {
            zzcfi.zzj("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
            return;
        }
        zzN.zzA(view, customViewCallback);
        zzN.zzy(i2);
    }

    public final boolean zza(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z) {
        zzcli zzcliVar;
        com.google.android.gms.ads.internal.zzb zzd;
        try {
            zzcliVar = this.zza;
        } catch (WindowManager.BadTokenException e2) {
            zzcfi.zzk("Fail to display Dialog.", e2);
        }
        if (zzcliVar != null && zzcliVar.zzP() != null && this.zza.zzP().zzd() != null && (zzd = this.zza.zzP().zzd()) != null && !zzd.zzc()) {
            zzd.zzb("window." + str + "('" + str3 + "')");
            return false;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(str2);
        if (z) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            TextView textView = new TextView(context);
            textView.setText(str3);
            EditText editText = new EditText(context);
            editText.setText(str4);
            linearLayout.addView(textView);
            linearLayout.addView(editText);
            builder.setView(linearLayout).setPositiveButton(17039370, new zzclf(jsPromptResult, editText)).setNegativeButton(17039360, new zzcle(jsPromptResult)).setOnCancelListener(new zzcld(jsPromptResult)).create().show();
        } else {
            builder.setMessage(str3).setPositiveButton(17039370, new zzclc(jsResult)).setNegativeButton(17039360, new zzclb(jsResult)).setOnCancelListener(new zzcla(jsResult)).create().show();
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }
}
