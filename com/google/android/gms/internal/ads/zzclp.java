package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.common.util.VisibleForTesting;
import e.i.j.z;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
@VisibleForTesting
/* loaded from: classes.dex */
public class zzclp extends WebViewClient implements zzcmv {
    public static final /* synthetic */ int zzb = 0;
    private boolean zzA;
    private final HashSet zzB;
    private View.OnAttachStateChangeListener zzC;
    public zzccj zza;
    private final zzcli zzc;
    private final zzbdl zzd;
    private final HashMap zze;
    private final Object zzf;
    private com.google.android.gms.ads.internal.client.zza zzg;
    private com.google.android.gms.ads.internal.overlay.zzo zzh;
    private zzcmt zzi;
    private zzcmu zzj;
    private zzbnl zzk;
    private zzbnn zzl;
    private zzdjf zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private com.google.android.gms.ads.internal.overlay.zzw zzs;
    private zzbwt zzt;
    private com.google.android.gms.ads.internal.zzb zzu;
    private zzbwo zzv;
    private zzfig zzw;
    private boolean zzx;
    private boolean zzy;
    private int zzz;

    public zzclp(zzcli zzcliVar, zzbdl zzbdlVar, boolean z) {
        zzbwt zzbwtVar = new zzbwt(zzcliVar, zzcliVar.zzG(), new zzbhi(zzcliVar.getContext()));
        this.zze = new HashMap();
        this.zzf = new Object();
        this.zzd = zzbdlVar;
        this.zzc = zzcliVar;
        this.zzp = z;
        this.zzt = zzbwtVar;
        this.zzv = null;
        this.zzB = new HashSet(Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzeC)).split(",")));
    }

    private static WebResourceResponse zzM() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzaD)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    private final WebResourceResponse zzN(String str, Map map) {
        HttpURLConnection httpURLConnection;
        URL url = new URL(str);
        try {
            TrafficStats.setThreadStatsTag(264);
            int i2 = 0;
            while (true) {
                i2++;
                if (i2 <= 20) {
                    URLConnection openConnection = url.openConnection();
                    openConnection.setConnectTimeout(10000);
                    openConnection.setReadTimeout(10000);
                    for (Map.Entry entry : map.entrySet()) {
                        openConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                    if (openConnection instanceof HttpURLConnection) {
                        httpURLConnection = (HttpURLConnection) openConnection;
                        com.google.android.gms.ads.internal.zzt.zzp().zze(this.zzc.getContext(), this.zzc.zzp().zza, false, httpURLConnection, false, 60000);
                        zzcfh zzcfhVar = new zzcfh(null);
                        zzcfhVar.zzc(httpURLConnection, null);
                        int responseCode = httpURLConnection.getResponseCode();
                        zzcfhVar.zze(httpURLConnection, responseCode);
                        if (responseCode < 300 || responseCode >= 400) {
                            break;
                        }
                        String headerField = httpURLConnection.getHeaderField("Location");
                        if (headerField != null) {
                            if (headerField.startsWith("tel:")) {
                                return null;
                            }
                            URL url2 = new URL(url, headerField);
                            String protocol = url2.getProtocol();
                            if (protocol == null) {
                                zzcfi.zzj("Protocol is null");
                                return zzM();
                            } else if (!protocol.equals("http") && !protocol.equals("https")) {
                                zzcfi.zzj("Unsupported scheme: " + protocol);
                                return zzM();
                            } else {
                                zzcfi.zze("Redirecting to " + headerField);
                                httpURLConnection.disconnect();
                                url = url2;
                            }
                        } else {
                            throw new IOException("Missing Location header in redirect");
                        }
                    } else {
                        throw new IOException("Invalid protocol.");
                    }
                } else {
                    TrafficStats.clearThreadStatsTag();
                    throw new IOException("Too many redirects (20)");
                }
            }
            com.google.android.gms.ads.internal.zzt.zzp();
            return com.google.android.gms.ads.internal.util.zzs.zzL(httpURLConnection);
        } finally {
            TrafficStats.clearThreadStatsTag();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzO(Map map, List list, String str) {
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                com.google.android.gms.ads.internal.util.zze.zza("  " + str2 + ": " + ((String) map.get(str2)));
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((zzbol) it.next()).zza(this.zzc, map);
        }
    }

    private final void zzP() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.zzC;
        if (onAttachStateChangeListener == null) {
            return;
        }
        ((View) this.zzc).removeOnAttachStateChangeListener(onAttachStateChangeListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzQ(final View view, final zzccj zzccjVar, final int i2) {
        if (!zzccjVar.zzi() || i2 <= 0) {
            return;
        }
        zzccjVar.zzg(view);
        if (zzccjVar.zzi()) {
            com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcll
                @Override // java.lang.Runnable
                public final void run() {
                    zzclp.this.zzn(view, zzccjVar, i2);
                }
            }, 100L);
        }
    }

    private static final boolean zzR(boolean z, zzcli zzcliVar) {
        return (!z || zzcliVar.zzQ().zzi() || zzcliVar.zzU().equals("interstitial_mb")) ? false : true;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        com.google.android.gms.ads.internal.client.zza zzaVar = this.zzg;
        if (zzaVar != null) {
            zzaVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        com.google.android.gms.ads.internal.util.zze.zza("Loading resource: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            zzi(parse);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        synchronized (this.zzf) {
            if (this.zzc.zzaB()) {
                com.google.android.gms.ads.internal.util.zze.zza("Blank page loaded, 1...");
                this.zzc.zzW();
                return;
            }
            this.zzx = true;
            zzcmu zzcmuVar = this.zzj;
            if (zzcmuVar != null) {
                zzcmuVar.zza();
                this.zzj = null;
            }
            zzg();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i2, String str, String str2) {
        this.zzo = true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.zzc.zzaA(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return zzc(str, Collections.emptyMap());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        com.google.android.gms.ads.internal.util.zze.zza("AdWebView shouldOverrideUrlLoading: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            zzi(parse);
        } else {
            if (this.zzn && webView == this.zzc.zzI()) {
                String scheme = parse.getScheme();
                if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    com.google.android.gms.ads.internal.client.zza zzaVar = this.zzg;
                    if (zzaVar != null) {
                        zzaVar.onAdClicked();
                        zzccj zzccjVar = this.zza;
                        if (zzccjVar != null) {
                            zzccjVar.zzh(str);
                        }
                        this.zzg = null;
                    }
                    zzdjf zzdjfVar = this.zzm;
                    if (zzdjfVar != null) {
                        zzdjfVar.zzq();
                        this.zzm = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (!this.zzc.zzI().willNotDraw()) {
                try {
                    zzaoc zzK = this.zzc.zzK();
                    if (zzK != null && zzK.zzf(parse)) {
                        Context context = this.zzc.getContext();
                        zzcli zzcliVar = this.zzc;
                        parse = zzK.zza(parse, context, (View) zzcliVar, zzcliVar.zzk());
                    }
                } catch (zzaod unused) {
                    zzcfi.zzj("Unable to append parameter to URL: ".concat(String.valueOf(str)));
                }
                com.google.android.gms.ads.internal.zzb zzbVar = this.zzu;
                if (zzbVar != null && !zzbVar.zzc()) {
                    this.zzu.zzb(str);
                } else {
                    zzr(new com.google.android.gms.ads.internal.overlay.zzc("android.intent.action.VIEW", parse.toString(), null, null, null, null, null, null), true);
                }
            } else {
                zzcfi.zzj("AdWebView unable to handle URL: ".concat(String.valueOf(str)));
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzcmv
    public final void zzA(int i2, int i3) {
        zzbwo zzbwoVar = this.zzv;
        if (zzbwoVar != null) {
            zzbwoVar.zzd(i2, i3);
        }
    }

    public final void zzB(boolean z) {
        this.zzn = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcmv
    public final void zzC(boolean z) {
        synchronized (this.zzf) {
            this.zzr = z;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcmv
    public final void zzD() {
        synchronized (this.zzf) {
            this.zzn = false;
            this.zzp = true;
            zzcfv.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclk
                @Override // java.lang.Runnable
                public final void run() {
                    zzclp.this.zzm();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcmv
    public final void zzE(boolean z) {
        synchronized (this.zzf) {
            this.zzq = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcmv
    public final void zzF(zzcmu zzcmuVar) {
        this.zzj = zzcmuVar;
    }

    public final void zzG(String str, zzbol zzbolVar) {
        synchronized (this.zzf) {
            List list = (List) this.zze.get(str);
            if (list == null) {
                return;
            }
            list.remove(zzbolVar);
        }
    }

    public final void zzH(String str, Predicate predicate) {
        synchronized (this.zzf) {
            List<zzbol> list = (List) this.zze.get(str);
            if (list == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (zzbol zzbolVar : list) {
                if (predicate.apply(zzbolVar)) {
                    arrayList.add(zzbolVar);
                }
            }
            list.removeAll(arrayList);
        }
    }

    public final boolean zzI() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzr;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzcmv
    public final boolean zzJ() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzp;
        }
        return z;
    }

    public final boolean zzK() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzq;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzcmv
    public final void zzL(com.google.android.gms.ads.internal.client.zza zzaVar, zzbnl zzbnlVar, com.google.android.gms.ads.internal.overlay.zzo zzoVar, zzbnn zzbnnVar, com.google.android.gms.ads.internal.overlay.zzw zzwVar, boolean z, zzboo zzbooVar, com.google.android.gms.ads.internal.zzb zzbVar, zzbwv zzbwvVar, zzccj zzccjVar, final zzeen zzeenVar, final zzfig zzfigVar, zzdwg zzdwgVar, zzfgo zzfgoVar, zzbom zzbomVar, final zzdjf zzdjfVar) {
        com.google.android.gms.ads.internal.zzb zzbVar2 = zzbVar == null ? new com.google.android.gms.ads.internal.zzb(this.zzc.getContext(), zzccjVar, null) : zzbVar;
        this.zzv = new zzbwo(this.zzc, zzbwvVar);
        this.zza = zzccjVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzaL)).booleanValue()) {
            zzx("/adMetadata", new zzbnk(zzbnlVar));
        }
        if (zzbnnVar != null) {
            zzx("/appEvent", new zzbnm(zzbnnVar));
        }
        zzx("/backButton", zzbok.zzj);
        zzx("/refresh", zzbok.zzk);
        zzx("/canOpenApp", zzbok.zzb);
        zzx("/canOpenURLs", zzbok.zza);
        zzx("/canOpenIntents", zzbok.zzc);
        zzx("/close", zzbok.zzd);
        zzx("/customClose", zzbok.zze);
        zzx("/instrument", zzbok.zzn);
        zzx("/delayPageLoaded", zzbok.zzp);
        zzx("/delayPageClosed", zzbok.zzq);
        zzx("/getLocationInfo", zzbok.zzr);
        zzx("/log", zzbok.zzg);
        zzx("/mraid", new zzbos(zzbVar2, this.zzv, zzbwvVar));
        zzbwt zzbwtVar = this.zzt;
        if (zzbwtVar != null) {
            zzx("/mraidLoaded", zzbwtVar);
        }
        zzx("/open", new zzbow(zzbVar2, this.zzv, zzeenVar, zzdwgVar, zzfgoVar));
        zzx("/precache", new zzcjv());
        zzx("/touch", zzbok.zzi);
        zzx("/video", zzbok.zzl);
        zzx("/videoMeta", zzbok.zzm);
        if (zzeenVar != null && zzfigVar != null) {
            zzx("/click", new zzbol() { // from class: com.google.android.gms.internal.ads.zzfcf
                @Override // com.google.android.gms.internal.ads.zzbol
                public final void zza(Object obj, Map map) {
                    zzdjf zzdjfVar2 = zzdjf.this;
                    zzfig zzfigVar2 = zzfigVar;
                    zzeen zzeenVar2 = zzeenVar;
                    zzcli zzcliVar = (zzcli) obj;
                    zzbok.zzd(map, zzdjfVar2);
                    String str = (String) map.get("u");
                    if (str == null) {
                        zzcfi.zzj("URL missing from click GMSG.");
                    } else {
                        zzfva.zzr(zzbok.zzb(zzcliVar, str), new zzfcg(zzcliVar, zzfigVar2, zzeenVar2), zzcfv.zza);
                    }
                }
            });
            zzx("/httpTrack", new zzbol() { // from class: com.google.android.gms.internal.ads.zzfce
                @Override // com.google.android.gms.internal.ads.zzbol
                public final void zza(Object obj, Map map) {
                    zzfig zzfigVar2 = zzfig.this;
                    zzeen zzeenVar2 = zzeenVar;
                    zzckz zzckzVar = (zzckz) obj;
                    String str = (String) map.get("u");
                    if (str == null) {
                        zzcfi.zzj("URL missing from httpTrack GMSG.");
                    } else if (!zzckzVar.zzF().zzak) {
                        zzfigVar2.zzc(str, null);
                    } else {
                        zzeenVar2.zzd(new zzeep(com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis(), ((zzcmf) zzckzVar).zzR().zzb, str, 2));
                    }
                }
            });
        } else {
            zzx("/click", zzbok.zza(zzdjfVar));
            zzx("/httpTrack", zzbok.zzf);
        }
        if (com.google.android.gms.ads.internal.zzt.zzn().zzu(this.zzc.getContext())) {
            zzx("/logScionEvent", new zzbor(this.zzc.getContext()));
        }
        if (zzbooVar != null) {
            zzx("/setInterstitialProperties", new zzbon(zzbooVar, null));
        }
        if (zzbomVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzhr)).booleanValue()) {
                zzx("/inspectorNetworkExtras", zzbomVar);
            }
        }
        this.zzg = zzaVar;
        this.zzh = zzoVar;
        this.zzk = zzbnlVar;
        this.zzl = zzbnnVar;
        this.zzs = zzwVar;
        this.zzu = zzbVar2;
        this.zzm = zzdjfVar;
        this.zzn = z;
        this.zzw = zzfigVar;
    }

    public final ViewTreeObserver.OnGlobalLayoutListener zza() {
        synchronized (this.zzf) {
        }
        return null;
    }

    public final ViewTreeObserver.OnScrollChangedListener zzb() {
        synchronized (this.zzf) {
        }
        return null;
    }

    public final WebResourceResponse zzc(String str, Map map) {
        zzbcu zzb2;
        try {
            if (((Boolean) zzbjp.zza.zze()).booleanValue() && this.zzw != null && "oda".equals(Uri.parse(str).getScheme())) {
                this.zzw.zzc(str, null);
                return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
            }
            String zzc = zzcdp.zzc(str, this.zzc.getContext(), this.zzA);
            if (!zzc.equals(str)) {
                return zzN(zzc, map);
            }
            zzbcx zza = zzbcx.zza(Uri.parse(str));
            if (zza != null && (zzb2 = com.google.android.gms.ads.internal.zzt.zzc().zzb(zza)) != null && zzb2.zze()) {
                return new WebResourceResponse("", "", zzb2.zzc());
            }
            if (zzcfh.zzl() && ((Boolean) zzbjk.zzb.zze()).booleanValue()) {
                return zzN(str, map);
            }
            return null;
        } catch (Exception | NoClassDefFoundError e2) {
            com.google.android.gms.ads.internal.zzt.zzo().zzt(e2, "AdWebViewClient.interceptRequest");
            return zzM();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcmv
    public final com.google.android.gms.ads.internal.zzb zzd() {
        return this.zzu;
    }

    public final void zzg() {
        if (this.zzi != null && ((this.zzx && this.zzz <= 0) || this.zzy || this.zzo)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzbB)).booleanValue() && this.zzc.zzo() != null) {
                zzbif.zza(this.zzc.zzo().zza(), this.zzc.zzn(), "awfllc");
            }
            zzcmt zzcmtVar = this.zzi;
            boolean z = false;
            if (!this.zzy && !this.zzo) {
                z = true;
            }
            zzcmtVar.zza(z);
            this.zzi = null;
        }
        this.zzc.zzae();
    }

    public final void zzh(boolean z) {
        this.zzA = z;
    }

    @Override // com.google.android.gms.internal.ads.zzcmv
    public final void zzi(Uri uri) {
        String path = uri.getPath();
        List list = (List) this.zze.get(path);
        if (path != null && list != null) {
            String encodedQuery = uri.getEncodedQuery();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzeB)).booleanValue() && this.zzB.contains(path) && encodedQuery != null) {
                if (encodedQuery.length() >= ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzeD)).intValue()) {
                    com.google.android.gms.ads.internal.util.zze.zza("Parsing gmsg query params on BG thread: ".concat(path));
                    zzfva.zzr(com.google.android.gms.ads.internal.zzt.zzp().zzb(uri), new zzcln(this, list, path, uri), zzcfv.zze);
                    return;
                }
            }
            com.google.android.gms.ads.internal.zzt.zzp();
            zzO(com.google.android.gms.ads.internal.util.zzs.zzK(uri), list, path);
            return;
        }
        com.google.android.gms.ads.internal.util.zze.zza("No GMSG handler found for GMSG: ".concat(String.valueOf(uri)));
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzfI)).booleanValue() || com.google.android.gms.ads.internal.zzt.zzo().zzf() == null) {
            return;
        }
        final String substring = (path == null || path.length() < 2) ? "null" : path.substring(1);
        zzcfv.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclj
            @Override // java.lang.Runnable
            public final void run() {
                String str = substring;
                int i2 = zzclp.zzb;
                com.google.android.gms.ads.internal.zzt.zzo().zzf().zze(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcmv
    public final void zzj() {
        zzbdl zzbdlVar = this.zzd;
        if (zzbdlVar != null) {
            zzbdlVar.zzc(10005);
        }
        this.zzy = true;
        zzg();
        this.zzc.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzcmv
    public final void zzk() {
        synchronized (this.zzf) {
        }
        this.zzz++;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcmv
    public final void zzl() {
        this.zzz--;
        zzg();
    }

    public final /* synthetic */ void zzm() {
        this.zzc.zzac();
        com.google.android.gms.ads.internal.overlay.zzl zzN = this.zzc.zzN();
        if (zzN != null) {
            zzN.zzx();
        }
    }

    public final /* synthetic */ void zzn(View view, zzccj zzccjVar, int i2) {
        zzQ(view, zzccjVar, i2 - 1);
    }

    @Override // com.google.android.gms.internal.ads.zzcmv
    public final void zzo(int i2, int i3, boolean z) {
        zzbwt zzbwtVar = this.zzt;
        if (zzbwtVar != null) {
            zzbwtVar.zzb(i2, i3);
        }
        zzbwo zzbwoVar = this.zzv;
        if (zzbwoVar != null) {
            zzbwoVar.zzc(i2, i3, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcmv
    public final void zzp() {
        zzccj zzccjVar = this.zza;
        if (zzccjVar != null) {
            WebView zzI = this.zzc.zzI();
            AtomicInteger atomicInteger = z.a;
            if (z.g.b(zzI)) {
                zzQ(zzI, zzccjVar, 10);
                return;
            }
            zzP();
            zzclm zzclmVar = new zzclm(this, zzccjVar);
            this.zzC = zzclmVar;
            ((View) this.zzc).addOnAttachStateChangeListener(zzclmVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjf
    public final void zzq() {
        zzdjf zzdjfVar = this.zzm;
        if (zzdjfVar != null) {
            zzdjfVar.zzq();
        }
    }

    public final void zzr(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z) {
        boolean zzaC = this.zzc.zzaC();
        boolean zzR = zzR(zzaC, this.zzc);
        boolean z2 = true;
        if (!zzR && z) {
            z2 = false;
        }
        zzu(new AdOverlayInfoParcel(zzcVar, zzR ? null : this.zzg, zzaC ? null : this.zzh, this.zzs, this.zzc.zzp(), this.zzc, z2 ? null : this.zzm));
    }

    public final void zzs(com.google.android.gms.ads.internal.util.zzbr zzbrVar, zzeen zzeenVar, zzdwg zzdwgVar, zzfgo zzfgoVar, String str, String str2, int i2) {
        zzcli zzcliVar = this.zzc;
        zzu(new AdOverlayInfoParcel(zzcliVar, zzcliVar.zzp(), zzbrVar, zzeenVar, zzdwgVar, zzfgoVar, str, str2, 14));
    }

    public final void zzt(boolean z, int i2, boolean z2) {
        boolean zzR = zzR(this.zzc.zzaC(), this.zzc);
        boolean z3 = true;
        if (!zzR && z2) {
            z3 = false;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = zzR ? null : this.zzg;
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzh;
        com.google.android.gms.ads.internal.overlay.zzw zzwVar = this.zzs;
        zzcli zzcliVar = this.zzc;
        zzu(new AdOverlayInfoParcel(zzaVar, zzoVar, zzwVar, zzcliVar, z, i2, zzcliVar.zzp(), z3 ? null : this.zzm));
    }

    public final void zzu(AdOverlayInfoParcel adOverlayInfoParcel) {
        com.google.android.gms.ads.internal.overlay.zzc zzcVar;
        zzbwo zzbwoVar = this.zzv;
        boolean zze = zzbwoVar != null ? zzbwoVar.zze() : false;
        com.google.android.gms.ads.internal.zzt.zzj();
        com.google.android.gms.ads.internal.overlay.zzm.zza(this.zzc.getContext(), adOverlayInfoParcel, !zze);
        zzccj zzccjVar = this.zza;
        if (zzccjVar != null) {
            String str = adOverlayInfoParcel.zzl;
            if (str == null && (zzcVar = adOverlayInfoParcel.zza) != null) {
                str = zzcVar.zzb;
            }
            zzccjVar.zzh(str);
        }
    }

    public final void zzv(boolean z, int i2, String str, boolean z2) {
        boolean zzaC = this.zzc.zzaC();
        boolean zzR = zzR(zzaC, this.zzc);
        boolean z3 = true;
        if (!zzR && z2) {
            z3 = false;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = zzR ? null : this.zzg;
        zzclo zzcloVar = zzaC ? null : new zzclo(this.zzc, this.zzh);
        zzbnl zzbnlVar = this.zzk;
        zzbnn zzbnnVar = this.zzl;
        com.google.android.gms.ads.internal.overlay.zzw zzwVar = this.zzs;
        zzcli zzcliVar = this.zzc;
        zzu(new AdOverlayInfoParcel(zzaVar, zzcloVar, zzbnlVar, zzbnnVar, zzwVar, zzcliVar, z, i2, str, zzcliVar.zzp(), z3 ? null : this.zzm));
    }

    public final void zzw(boolean z, int i2, String str, String str2, boolean z2) {
        boolean zzaC = this.zzc.zzaC();
        boolean zzR = zzR(zzaC, this.zzc);
        boolean z3 = true;
        if (!zzR && z2) {
            z3 = false;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = zzR ? null : this.zzg;
        zzclo zzcloVar = zzaC ? null : new zzclo(this.zzc, this.zzh);
        zzbnl zzbnlVar = this.zzk;
        zzbnn zzbnnVar = this.zzl;
        com.google.android.gms.ads.internal.overlay.zzw zzwVar = this.zzs;
        zzcli zzcliVar = this.zzc;
        zzu(new AdOverlayInfoParcel(zzaVar, zzcloVar, zzbnlVar, zzbnnVar, zzwVar, zzcliVar, z, i2, str, str2, zzcliVar.zzp(), z3 ? null : this.zzm));
    }

    public final void zzx(String str, zzbol zzbolVar) {
        synchronized (this.zzf) {
            List list = (List) this.zze.get(str);
            if (list == null) {
                list = new CopyOnWriteArrayList();
                this.zze.put(str, list);
            }
            list.add(zzbolVar);
        }
    }

    public final void zzy() {
        zzccj zzccjVar = this.zza;
        if (zzccjVar != null) {
            zzccjVar.zze();
            this.zza = null;
        }
        zzP();
        synchronized (this.zzf) {
            this.zze.clear();
            this.zzg = null;
            this.zzh = null;
            this.zzi = null;
            this.zzj = null;
            this.zzk = null;
            this.zzl = null;
            this.zzn = false;
            this.zzp = false;
            this.zzq = false;
            this.zzs = null;
            this.zzu = null;
            this.zzt = null;
            zzbwo zzbwoVar = this.zzv;
            if (zzbwoVar != null) {
                zzbwoVar.zza(true);
                this.zzv = null;
            }
            this.zzw = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcmv
    public final void zzz(zzcmt zzcmtVar) {
        this.zzi = zzcmtVar;
    }
}
