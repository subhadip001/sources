package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.arthenica.ffmpegkit.MediaInformation;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzfnu;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportDataCapture;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import f.a.b.a.a;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
@VisibleForTesting
/* loaded from: classes.dex */
public final class zzcmb extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, zzcli {
    public static final /* synthetic */ int zza = 0;
    private boolean zzA;
    private boolean zzB;
    private zzbkn zzC;
    private zzbkl zzD;
    private zzbbz zzE;
    private int zzF;
    private int zzG;
    private zzbik zzH;
    private final zzbik zzI;
    private zzbik zzJ;
    private final zzbil zzK;
    private int zzL;
    private int zzM;
    private int zzN;
    private com.google.android.gms.ads.internal.overlay.zzl zzO;
    private boolean zzP;
    private final com.google.android.gms.ads.internal.util.zzci zzQ;
    private int zzR;
    private int zzS;
    private int zzT;
    private int zzU;
    private Map zzV;
    private final WindowManager zzW;
    private final zzbdl zzX;
    private final zzcmw zzb;
    private final zzaoc zzc;
    private final zzbix zzd;
    private final zzcfo zze;
    private com.google.android.gms.ads.internal.zzl zzf;
    private final com.google.android.gms.ads.internal.zza zzg;
    private final DisplayMetrics zzh;
    private final float zzi;
    private zzfbg zzj;
    private zzfbj zzk;
    private boolean zzl;
    private boolean zzm;
    private zzclp zzn;
    private com.google.android.gms.ads.internal.overlay.zzl zzo;
    private IObjectWrapper zzp;
    private zzcmx zzq;
    private final String zzr;
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private Boolean zzw;
    private boolean zzx;
    private final String zzy;
    private zzcme zzz;

    @VisibleForTesting
    public zzcmb(zzcmw zzcmwVar, zzcmx zzcmxVar, String str, boolean z, boolean z2, zzaoc zzaocVar, zzbix zzbixVar, zzcfo zzcfoVar, zzbin zzbinVar, com.google.android.gms.ads.internal.zzl zzlVar, com.google.android.gms.ads.internal.zza zzaVar, zzbdl zzbdlVar, zzfbg zzfbgVar, zzfbj zzfbjVar) {
        super(zzcmwVar);
        zzfbj zzfbjVar2;
        this.zzl = false;
        this.zzm = false;
        this.zzx = true;
        this.zzy = "";
        this.zzR = -1;
        this.zzS = -1;
        this.zzT = -1;
        this.zzU = -1;
        this.zzb = zzcmwVar;
        this.zzq = zzcmxVar;
        this.zzr = str;
        this.zzu = z;
        this.zzc = zzaocVar;
        this.zzd = zzbixVar;
        this.zze = zzcfoVar;
        this.zzf = zzlVar;
        this.zzg = zzaVar;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.zzW = windowManager;
        com.google.android.gms.ads.internal.zzt.zzp();
        DisplayMetrics zzr = com.google.android.gms.ads.internal.util.zzs.zzr(windowManager);
        this.zzh = zzr;
        this.zzi = zzr.density;
        this.zzX = zzbdlVar;
        this.zzj = zzfbgVar;
        this.zzk = zzfbjVar;
        this.zzQ = new com.google.android.gms.ads.internal.util.zzci(zzcmwVar.zza(), this, this, null);
        setBackgroundColor(0);
        final WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e2) {
            zzcfi.zzh("Unable to enable Javascript.", e2);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setMixedContentMode(2);
        settings.setUserAgentString(com.google.android.gms.ads.internal.zzt.zzp().zzc(zzcmwVar, zzcfoVar.zza));
        com.google.android.gms.ads.internal.zzt.zzp();
        final Context context = getContext();
        com.google.android.gms.ads.internal.util.zzcb.zza(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.zzm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                WebSettings webSettings = settings;
                Context context2 = context;
                zzfnu zzfnuVar = zzs.zza;
                webSettings.setDatabasePath(context2.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath());
                webSettings.setDatabaseEnabled(true);
                webSettings.setDomStorageEnabled(true);
                webSettings.setDisplayZoomControls(false);
                webSettings.setBuiltInZoomControls(true);
                webSettings.setSupportZoom(true);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzaE)).booleanValue()) {
                    webSettings.setTextZoom(100);
                }
                webSettings.setAllowContentAccess(false);
                return Boolean.TRUE;
            }
        });
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMediaPlaybackRequiresUserGesture(false);
        setDownloadListener(this);
        zzaU();
        addJavascriptInterface(new zzcmi(this, new zzcmh(this), null), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        zzbc();
        zzbil zzbilVar = new zzbil(new zzbin(true, "make_wv", this.zzr));
        this.zzK = zzbilVar;
        zzbilVar.zza().zzc(null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzbB)).booleanValue() && (zzfbjVar2 = this.zzk) != null && zzfbjVar2.zzb != null) {
            zzbilVar.zza().zzd("gqi", this.zzk.zzb);
        }
        zzbilVar.zza();
        zzbik zzf = zzbin.zzf();
        this.zzI = zzf;
        zzbilVar.zzb("native:view_create", zzf);
        this.zzJ = null;
        this.zzH = null;
        com.google.android.gms.ads.internal.util.zzce.zza().zzb(zzcmwVar);
        com.google.android.gms.ads.internal.zzt.zzo().zzq();
    }

    private final synchronized void zzaU() {
        zzfbg zzfbgVar = this.zzj;
        if (zzfbgVar != null && zzfbgVar.zzao) {
            zzcfi.zze("Disabling hardware acceleration on an overlay.");
            zzaW();
            return;
        }
        if (!this.zzu && !this.zzq.zzi()) {
            zzcfi.zze("Enabling hardware acceleration on an AdView.");
            zzaY();
            return;
        }
        zzcfi.zze("Enabling hardware acceleration on an overlay.");
        zzaY();
    }

    private final synchronized void zzaV() {
        if (this.zzP) {
            return;
        }
        this.zzP = true;
        com.google.android.gms.ads.internal.zzt.zzo().zzp();
    }

    private final synchronized void zzaW() {
        if (!this.zzv) {
            setLayerType(1, null);
        }
        this.zzv = true;
    }

    private final void zzaX(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", true != z ? CrashlyticsReportDataCapture.SIGNAL_DEFAULT : "1");
        zzd("onAdVisibilityChanged", hashMap);
    }

    private final synchronized void zzaY() {
        if (this.zzv) {
            setLayerType(0, null);
        }
        this.zzv = false;
    }

    private final synchronized void zzaZ(String str) {
        try {
            super.loadUrl("about:blank");
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzo().zzt(th, "AdWebViewImpl.loadUrlUnsafe");
            zzcfi.zzk("Could not call loadUrl in destroy(). ", th);
        }
    }

    private final void zzba() {
        zzbif.zza(this.zzK.zza(), this.zzI, "aeh2");
    }

    private final synchronized void zzbb() {
        Map map = this.zzV;
        if (map != null) {
            for (zzcju zzcjuVar : map.values()) {
                zzcjuVar.release();
            }
        }
        this.zzV = null;
    }

    private final void zzbc() {
        zzbil zzbilVar = this.zzK;
        if (zzbilVar == null) {
            return;
        }
        zzbin zza2 = zzbilVar.zza();
        zzbid zzf = com.google.android.gms.ads.internal.zzt.zzo().zzf();
        if (zzf != null) {
            zzf.zzf(zza2);
        }
    }

    private final synchronized void zzbd() {
        Boolean zzk = com.google.android.gms.ads.internal.zzt.zzo().zzk();
        this.zzw = zzk;
        if (zzk == null) {
            try {
                evaluateJavascript("(function(){})()", null);
                zzaS(Boolean.TRUE);
            } catch (IllegalStateException unused) {
                zzaS(Boolean.FALSE);
            }
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcli
    public final synchronized void destroy() {
        zzbc();
        this.zzQ.zza();
        com.google.android.gms.ads.internal.overlay.zzl zzlVar = this.zzo;
        if (zzlVar != null) {
            zzlVar.zzb();
            this.zzo.zzl();
            this.zzo = null;
        }
        this.zzp = null;
        this.zzn.zzy();
        this.zzE = null;
        this.zzf = null;
        setOnClickListener(null);
        setOnTouchListener(null);
        if (this.zzt) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzy().zzd(this);
        zzbb();
        this.zzt = true;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzig)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zza("Initiating WebView self destruct sequence in 3...");
            com.google.android.gms.ads.internal.util.zze.zza("Loading blank page in WebView, 2...");
            zzaZ("about:blank");
            return;
        }
        com.google.android.gms.ads.internal.util.zze.zza("Destroying the WebView immediately...");
        zzW();
    }

    @Override // android.webkit.WebView
    public final synchronized void evaluateJavascript(String str, ValueCallback valueCallback) {
        if (!zzaB()) {
            super.evaluateJavascript(str, valueCallback);
            return;
        }
        zzcfi.zzl("#004 The webview is destroyed. Ignoring action.", null);
        if (valueCallback != null) {
            valueCallback.onReceiveValue(null);
        }
    }

    public final void finalize() {
        try {
            synchronized (this) {
                if (!this.zzt) {
                    this.zzn.zzy();
                    com.google.android.gms.ads.internal.zzt.zzy().zzd(this);
                    zzbb();
                    zzaV();
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcli
    public final synchronized void loadData(String str, String str2, String str3) {
        if (zzaB()) {
            zzcfi.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadData(str, str2, str3);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcli
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (zzaB()) {
            zzcfi.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcli
    public final synchronized void loadUrl(String str) {
        if (zzaB()) {
            zzcfi.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadUrl(str);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzclp zzclpVar = this.zzn;
        if (zzclpVar != null) {
            zzclpVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!zzaB()) {
            this.zzQ.zzc();
        }
        boolean z = this.zzA;
        zzclp zzclpVar = this.zzn;
        if (zzclpVar != null && zzclpVar.zzK()) {
            if (!this.zzB) {
                this.zzn.zza();
                this.zzn.zzb();
                this.zzB = true;
            }
            zzaT();
            z = true;
        }
        zzaX(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        zzclp zzclpVar;
        synchronized (this) {
            if (!zzaB()) {
                this.zzQ.zzd();
            }
            super.onDetachedFromWindow();
            if (this.zzB && (zzclpVar = this.zzn) != null && zzclpVar.zzK() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                this.zzn.zza();
                this.zzn.zzb();
                this.zzB = false;
            }
        }
        zzaX(false);
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j2) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            com.google.android.gms.ads.internal.zzt.zzp();
            com.google.android.gms.ads.internal.util.zzs.zzI(getContext(), intent);
        } catch (ActivityNotFoundException unused) {
            zzcfi.zze("Couldn't find an Activity to view url/mimetype: " + str + " / " + str4);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (zzaB()) {
            return;
        }
        if (Build.VERSION.SDK_INT == 21 && canvas.isHardwareAccelerated() && !isAttachedToWindow()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean zzaT = zzaT();
        com.google.android.gms.ads.internal.overlay.zzl zzN = zzN();
        if (zzN == null || !zzaT) {
            return;
        }
        zzN.zzm();
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01bb A[Catch: all -> 0x01e1, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:8:0x000d, B:10:0x0013, B:12:0x0017, B:15:0x0021, B:17:0x0029, B:20:0x002e, B:22:0x0036, B:24:0x0048, B:27:0x004d, B:29:0x0054, B:33:0x005e, B:36:0x0063, B:39:0x0076, B:45:0x0088, B:43:0x0082, B:48:0x0095, B:50:0x009d, B:52:0x00af, B:55:0x00b4, B:57:0x00d0, B:59:0x00d9, B:58:0x00d5, B:62:0x00de, B:64:0x00e6, B:67:0x00f1, B:76:0x0117, B:78:0x011e, B:83:0x0126, B:85:0x0138, B:87:0x0146, B:91:0x0153, B:94:0x0158, B:96:0x01a3, B:97:0x01a7, B:99:0x01ae, B:104:0x01bb, B:106:0x01c1, B:107:0x01c4, B:109:0x01c8, B:110:0x01d1, B:113:0x01dc), top: B:119:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0138 A[Catch: all -> 0x01e1, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:8:0x000d, B:10:0x0013, B:12:0x0017, B:15:0x0021, B:17:0x0029, B:20:0x002e, B:22:0x0036, B:24:0x0048, B:27:0x004d, B:29:0x0054, B:33:0x005e, B:36:0x0063, B:39:0x0076, B:45:0x0088, B:43:0x0082, B:48:0x0095, B:50:0x009d, B:52:0x00af, B:55:0x00b4, B:57:0x00d0, B:59:0x00d9, B:58:0x00d5, B:62:0x00de, B:64:0x00e6, B:67:0x00f1, B:76:0x0117, B:78:0x011e, B:83:0x0126, B:85:0x0138, B:87:0x0146, B:91:0x0153, B:94:0x0158, B:96:0x01a3, B:97:0x01a7, B:99:0x01ae, B:104:0x01bb, B:106:0x01c1, B:107:0x01c4, B:109:0x01c8, B:110:0x01d1, B:113:0x01dc), top: B:119:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0158 A[Catch: all -> 0x01e1, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:8:0x000d, B:10:0x0013, B:12:0x0017, B:15:0x0021, B:17:0x0029, B:20:0x002e, B:22:0x0036, B:24:0x0048, B:27:0x004d, B:29:0x0054, B:33:0x005e, B:36:0x0063, B:39:0x0076, B:45:0x0088, B:43:0x0082, B:48:0x0095, B:50:0x009d, B:52:0x00af, B:55:0x00b4, B:57:0x00d0, B:59:0x00d9, B:58:0x00d5, B:62:0x00de, B:64:0x00e6, B:67:0x00f1, B:76:0x0117, B:78:0x011e, B:83:0x0126, B:85:0x0138, B:87:0x0146, B:91:0x0153, B:94:0x0158, B:96:0x01a3, B:97:0x01a7, B:99:0x01ae, B:104:0x01bb, B:106:0x01c1, B:107:0x01c4, B:109:0x01c8, B:110:0x01d1, B:113:0x01dc), top: B:119:0x0001 }] */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void onMeasure(int r9, int r10) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcmb.onMeasure(int, int):void");
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcli
    public final void onPause() {
        if (zzaB()) {
            return;
        }
        try {
            super.onPause();
        } catch (Exception e2) {
            zzcfi.zzh("Could not pause webview.", e2);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcli
    public final void onResume() {
        if (zzaB()) {
            return;
        }
        try {
            super.onResume();
        } catch (Exception e2) {
            zzcfi.zzh("Could not resume webview.", e2);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.zzn.zzK() || this.zzn.zzI()) {
            zzaoc zzaocVar = this.zzc;
            if (zzaocVar != null) {
                zzaocVar.zzd(motionEvent);
            }
            zzbix zzbixVar = this.zzd;
            if (zzbixVar != null) {
                zzbixVar.zzb(motionEvent);
            }
        } else {
            synchronized (this) {
                zzbkn zzbknVar = this.zzC;
                if (zzbknVar != null) {
                    zzbknVar.zzd(motionEvent);
                }
            }
        }
        if (zzaB()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcli
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof zzclp) {
            this.zzn = (zzclp) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (zzaB()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e2) {
            zzcfi.zzh("Could not stop loading webview.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final void zzA(int i2) {
        this.zzM = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final void zzB(boolean z) {
        this.zzn.zzB(false);
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final synchronized void zzC(int i2) {
        this.zzL = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final void zzD(int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcli, com.google.android.gms.internal.ads.zzchr
    public final synchronized void zzE(zzcme zzcmeVar) {
        if (this.zzz != null) {
            zzcfi.zzg("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.zzz = zzcmeVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcli, com.google.android.gms.internal.ads.zzckz
    public final zzfbg zzF() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final Context zzG() {
        return this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcli, com.google.android.gms.internal.ads.zzcms
    public final View zzH() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final WebView zzI() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final WebViewClient zzJ() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzcli, com.google.android.gms.internal.ads.zzcmq
    public final zzaoc zzK() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final synchronized zzbbz zzL() {
        return this.zzE;
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final synchronized zzbkn zzM() {
        return this.zzC;
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final synchronized com.google.android.gms.ads.internal.overlay.zzl zzN() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final synchronized com.google.android.gms.ads.internal.overlay.zzl zzO() {
        return this.zzO;
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final /* synthetic */ zzcmv zzP() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzcli, com.google.android.gms.internal.ads.zzcmp
    public final synchronized zzcmx zzQ() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzcli, com.google.android.gms.internal.ads.zzcmf
    public final zzfbj zzR() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final synchronized IObjectWrapper zzS() {
        return this.zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final zzfvj zzT() {
        zzbix zzbixVar = this.zzd;
        return zzbixVar == null ? zzfva.zzi(null) : zzbixVar.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final synchronized String zzU() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final void zzV(zzfbg zzfbgVar, zzfbj zzfbjVar) {
        this.zzj = zzfbgVar;
        this.zzk = zzfbjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final synchronized void zzW() {
        com.google.android.gms.ads.internal.util.zze.zza("Destroying WebView!");
        zzaV();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcma(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final void zzX() {
        zzba();
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.zze.zza);
        zzd("onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final void zzY(int i2) {
        if (i2 == 0) {
            zzbif.zza(this.zzK.zza(), this.zzI, "aebb2");
        }
        zzba();
        this.zzK.zza();
        this.zzK.zza().zzd("close_type", String.valueOf(i2));
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i2));
        hashMap.put("version", this.zze.zza);
        zzd("onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final void zzZ() {
        if (this.zzH == null) {
            zzbif.zza(this.zzK.zza(), this.zzI, "aes2");
            this.zzK.zza();
            zzbik zzf = zzbin.zzf();
            this.zzH = zzf;
            this.zzK.zzb("native:view_show", zzf);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.zze.zza);
        zzd("onshow", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void zza(String str) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final boolean zzaA(final boolean z, final int i2) {
        destroy();
        this.zzX.zzb(new zzbdk() { // from class: com.google.android.gms.internal.ads.zzcly
            @Override // com.google.android.gms.internal.ads.zzbdk
            public final void zza(zzbfa zzbfaVar) {
                boolean z2 = z;
                int i3 = i2;
                int i4 = zzcmb.zza;
                zzbhf zza2 = zzbhg.zza();
                if (zza2.zzc() != z2) {
                    zza2.zza(z2);
                }
                zza2.zzb(i3);
                zzbfaVar.zzj((zzbhg) zza2.zzaj());
            }
        });
        this.zzX.zzc(10003);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final synchronized boolean zzaB() {
        return this.zzt;
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final synchronized boolean zzaC() {
        return this.zzu;
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final boolean zzaD() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final synchronized boolean zzaE() {
        return this.zzx;
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final void zzaF(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z) {
        this.zzn.zzr(zzcVar, z);
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final void zzaG(com.google.android.gms.ads.internal.util.zzbr zzbrVar, zzeen zzeenVar, zzdwg zzdwgVar, zzfgo zzfgoVar, String str, String str2, int i2) {
        this.zzn.zzs(zzbrVar, zzeenVar, zzdwgVar, zzfgoVar, str, str2, 14);
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final void zzaH(boolean z, int i2, boolean z2) {
        this.zzn.zzt(z, i2, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final void zzaI(boolean z, int i2, String str, boolean z2) {
        this.zzn.zzv(z, i2, str, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final void zzaJ(boolean z, int i2, String str, String str2, boolean z2) {
        this.zzn.zzw(z, i2, str, str2, z2);
    }

    public final zzclp zzaL() {
        return this.zzn;
    }

    @VisibleForTesting
    public final synchronized Boolean zzaM() {
        return this.zzw;
    }

    public final synchronized void zzaP(String str, ValueCallback valueCallback) {
        if (zzaB()) {
            zzcfi.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            evaluateJavascript(str, null);
        }
    }

    public final void zzaQ(String str) {
        if (PlatformVersion.isAtLeastKitKat()) {
            if (zzaM() == null) {
                zzbd();
            }
            if (zzaM().booleanValue()) {
                zzaP(str, null);
                return;
            } else {
                zzaR("javascript:".concat(str));
                return;
            }
        }
        zzaR("javascript:".concat(str));
    }

    public final synchronized void zzaR(String str) {
        if (zzaB()) {
            zzcfi.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            loadUrl(str);
        }
    }

    @VisibleForTesting
    public final void zzaS(Boolean bool) {
        synchronized (this) {
            this.zzw = bool;
        }
        com.google.android.gms.ads.internal.zzt.zzo().zzu(bool);
    }

    public final boolean zzaT() {
        int i2;
        int i3;
        boolean z = false;
        if (this.zzn.zzJ() || this.zzn.zzK()) {
            com.google.android.gms.ads.internal.client.zzaw.zzb();
            DisplayMetrics displayMetrics = this.zzh;
            int zzt = zzcfb.zzt(displayMetrics, displayMetrics.widthPixels);
            com.google.android.gms.ads.internal.client.zzaw.zzb();
            DisplayMetrics displayMetrics2 = this.zzh;
            int zzt2 = zzcfb.zzt(displayMetrics2, displayMetrics2.heightPixels);
            Activity zza2 = this.zzb.zza();
            if (zza2 == null || zza2.getWindow() == null) {
                i2 = zzt;
                i3 = zzt2;
            } else {
                com.google.android.gms.ads.internal.zzt.zzp();
                int[] zzM = com.google.android.gms.ads.internal.util.zzs.zzM(zza2);
                com.google.android.gms.ads.internal.client.zzaw.zzb();
                int zzt3 = zzcfb.zzt(this.zzh, zzM[0]);
                com.google.android.gms.ads.internal.client.zzaw.zzb();
                i3 = zzcfb.zzt(this.zzh, zzM[1]);
                i2 = zzt3;
            }
            int i4 = this.zzS;
            if (i4 == zzt && this.zzR == zzt2 && this.zzT == i2 && this.zzU == i3) {
                return false;
            }
            z = (i4 == zzt && this.zzR == zzt2) ? true : true;
            this.zzS = zzt;
            this.zzR = zzt2;
            this.zzT = i2;
            this.zzU = i3;
            new zzbwu(this, "").zzi(zzt, zzt2, i2, i3, this.zzh.density, this.zzW.getDefaultDisplay().getRotation());
            return z;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final void zzaa() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final void zzab(boolean z) {
        this.zzn.zzh(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final void zzac() {
        this.zzQ.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final synchronized void zzad(String str, String str2, String str3) {
        String str4;
        if (!zzaB()) {
            String[] strArr = new String[1];
            String str5 = (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzN);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("version", str5);
                jSONObject.put("sdk", "Google Mobile Ads");
                jSONObject.put(RemoteConfigConstants.RequestFieldKey.SDK_VERSION, "12.4.51-000");
                str4 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
            } catch (JSONException e2) {
                zzcfi.zzk("Unable to build MRAID_ENV", e2);
                str4 = null;
            }
            strArr[0] = str4;
            super.loadDataWithBaseURL(str, zzcmo.zza(str2, strArr), "text/html", "UTF-8", null);
            return;
        }
        zzcfi.zzj("#004 The webview is destroyed. Ignoring action.");
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final void zzae() {
        if (this.zzJ == null) {
            this.zzK.zza();
            zzbik zzf = zzbin.zzf();
            this.zzJ = zzf;
            this.zzK.zzb("native:view_load", zzf);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final void zzaf(String str, zzbol zzbolVar) {
        zzclp zzclpVar = this.zzn;
        if (zzclpVar != null) {
            zzclpVar.zzx(str, zzbolVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final void zzag() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final synchronized void zzah(com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        this.zzo = zzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final synchronized void zzai(zzcmx zzcmxVar) {
        this.zzq = zzcmxVar;
        requestLayout();
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final synchronized void zzaj(zzbbz zzbbzVar) {
        this.zzE = zzbbzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final synchronized void zzak(boolean z) {
        this.zzx = z;
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final void zzal() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final void zzam(Context context) {
        this.zzb.setBaseContext(context);
        this.zzQ.zze(this.zzb.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final synchronized void zzan(boolean z) {
        com.google.android.gms.ads.internal.overlay.zzl zzlVar = this.zzo;
        if (zzlVar != null) {
            zzlVar.zzw(this.zzn.zzJ(), z);
        } else {
            this.zzs = z;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final synchronized void zzao(zzbkl zzbklVar) {
        this.zzD = zzbklVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final synchronized void zzap(boolean z) {
        boolean z2 = this.zzu;
        this.zzu = z;
        zzaU();
        if (z != z2) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzO)).booleanValue() || !this.zzq.zzi()) {
                new zzbwu(this, "").zzk(true != z ? "default" : "expanded");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final synchronized void zzaq(zzbkn zzbknVar) {
        this.zzC = zzbknVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final synchronized void zzar(IObjectWrapper iObjectWrapper) {
        this.zzp = iObjectWrapper;
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final synchronized void zzas(int i2) {
        com.google.android.gms.ads.internal.overlay.zzl zzlVar = this.zzo;
        if (zzlVar != null) {
            zzlVar.zzy(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final synchronized void zzat(com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        this.zzO = zzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final synchronized void zzau(boolean z) {
        com.google.android.gms.ads.internal.overlay.zzl zzlVar;
        int i2 = this.zzF + (true != z ? -1 : 1);
        this.zzF = i2;
        if (i2 > 0 || (zzlVar = this.zzo) == null) {
            return;
        }
        zzlVar.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final synchronized void zzav(boolean z) {
        if (z) {
            setBackgroundColor(0);
        }
        com.google.android.gms.ads.internal.overlay.zzl zzlVar = this.zzo;
        if (zzlVar != null) {
            zzlVar.zzz(z);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final void zzaw(String str, zzbol zzbolVar) {
        zzclp zzclpVar = this.zzn;
        if (zzclpVar != null) {
            zzclpVar.zzG(str, zzbolVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final void zzax(String str, Predicate predicate) {
        zzclp zzclpVar = this.zzn;
        if (zzclpVar != null) {
            zzclpVar.zzH(str, predicate);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final synchronized boolean zzay() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final synchronized boolean zzaz() {
        return this.zzF > 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void zzb(String str, String str2) {
        zzaQ(str + "(" + str2 + ");");
    }

    @Override // com.google.android.gms.ads.internal.zzl
    public final synchronized void zzbn() {
        com.google.android.gms.ads.internal.zzl zzlVar = this.zzf;
        if (zzlVar != null) {
            zzlVar.zzbn();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzl
    public final synchronized void zzbo() {
        com.google.android.gms.ads.internal.zzl zzlVar = this.zzf;
        if (zzlVar != null) {
            zzlVar.zzbo();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final zzchg zzbp() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbam
    public final void zzc(zzbal zzbalVar) {
        boolean z;
        synchronized (this) {
            z = zzbalVar.zzj;
            this.zzA = z;
        }
        zzaX(z);
    }

    @Override // com.google.android.gms.internal.ads.zzbrc
    public final void zzd(String str, Map map) {
        try {
            zze(str, com.google.android.gms.ads.internal.client.zzaw.zzb().zzh(map));
        } catch (JSONException unused) {
            zzcfi.zzj("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrc
    public final void zze(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        StringBuilder F = a.F("(window.AFMA_ReceiveMessage || function() {})('", str, "',", jSONObject.toString(), ");");
        zzcfi.zze("Dispatching AFMA event: ".concat(F.toString()));
        zzaQ(F.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final int zzf() {
        return this.zzN;
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final int zzg() {
        return this.zzM;
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final synchronized int zzh() {
        return this.zzL;
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final int zzi() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final int zzj() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzcli, com.google.android.gms.internal.ads.zzcmj, com.google.android.gms.internal.ads.zzchr
    public final Activity zzk() {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void zzl(String str, JSONObject jSONObject) {
        zzb(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzcli, com.google.android.gms.internal.ads.zzchr
    public final com.google.android.gms.ads.internal.zza zzm() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final zzbik zzn() {
        return this.zzI;
    }

    @Override // com.google.android.gms.internal.ads.zzcli, com.google.android.gms.internal.ads.zzchr
    public final zzbil zzo() {
        return this.zzK;
    }

    @Override // com.google.android.gms.internal.ads.zzcli, com.google.android.gms.internal.ads.zzcmr, com.google.android.gms.internal.ads.zzchr
    public final zzcfo zzp() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzdjf
    public final void zzq() {
        zzclp zzclpVar = this.zzn;
        if (zzclpVar != null) {
            zzclpVar.zzq();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final synchronized zzcju zzr(String str) {
        Map map = this.zzV;
        if (map == null) {
            return null;
        }
        return (zzcju) map.get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcli, com.google.android.gms.internal.ads.zzchr
    public final synchronized zzcme zzs() {
        return this.zzz;
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final synchronized String zzt() {
        zzfbj zzfbjVar = this.zzk;
        if (zzfbjVar != null) {
            return zzfbjVar.zzb;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final synchronized String zzu() {
        return this.zzy;
    }

    @Override // com.google.android.gms.internal.ads.zzcli, com.google.android.gms.internal.ads.zzchr
    public final synchronized void zzv(String str, zzcju zzcjuVar) {
        if (this.zzV == null) {
            this.zzV = new HashMap();
        }
        this.zzV.put(str, zzcjuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final void zzw() {
        com.google.android.gms.ads.internal.overlay.zzl zzN = zzN();
        if (zzN != null) {
            zzN.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final void zzx(boolean z, long j2) {
        HashMap hashMap = new HashMap(2);
        hashMap.put(FirebaseAnalytics.Param.SUCCESS, true != z ? CrashlyticsReportDataCapture.SIGNAL_DEFAULT : "1");
        hashMap.put(MediaInformation.KEY_DURATION, Long.toString(j2));
        zzd("onCacheAccessComplete", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final synchronized void zzy() {
        zzbkl zzbklVar = this.zzD;
        if (zzbklVar != null) {
            final zzdrd zzdrdVar = (zzdrd) zzbklVar;
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdrb
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        zzdrd.this.zzd();
                    } catch (RemoteException e2) {
                        zzcfi.zzl("#007 Could not call remote method.", e2);
                    }
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final void zzz(int i2) {
        this.zzN = i2;
    }
}
