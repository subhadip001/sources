package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzbx;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzaoc;
import com.google.android.gms.internal.ads.zzaod;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzbyj;
import com.google.android.gms.internal.ads.zzbys;
import com.google.android.gms.internal.ads.zzcdw;
import com.google.android.gms.internal.ads.zzcdy;
import com.google.android.gms.internal.ads.zzced;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzcfo;
import com.google.android.gms.internal.ads.zzcfv;
import com.google.android.gms.internal.ads.zzcnf;
import com.google.android.gms.internal.ads.zzdbc;
import com.google.android.gms.internal.ads.zzdhc;
import com.google.android.gms.internal.ads.zzdsd;
import com.google.android.gms.internal.ads.zzdwb;
import com.google.android.gms.internal.ads.zzdwl;
import com.google.android.gms.internal.ads.zzfbw;
import com.google.android.gms.internal.ads.zzfcu;
import com.google.android.gms.internal.ads.zzfig;
import com.google.android.gms.internal.ads.zzfoi;
import com.google.android.gms.internal.ads.zzfpg;
import com.google.android.gms.internal.ads.zzfug;
import com.google.android.gms.internal.ads.zzfuh;
import com.google.android.gms.internal.ads.zzfur;
import com.google.android.gms.internal.ads.zzfva;
import com.google.android.gms.internal.ads.zzfvj;
import com.google.android.gms.internal.ads.zzfvk;
import f.a.b.a.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzz extends zzcdy {
    public static final List zza = new ArrayList(Arrays.asList("/aclk", "/pcs/click", "/dbm/clk"));
    public static final List zzb = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));
    public static final List zzc = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"));
    public static final List zzd = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));
    public static final /* synthetic */ int zze = 0;
    private final zzcfo zzA;
    private String zzB;
    private final List zzD;
    private final List zzE;
    private final List zzF;
    private final List zzG;
    private final zzcnf zzf;
    private Context zzg;
    private final zzaoc zzh;
    private final zzfcu zzi;
    private final zzfvk zzk;
    private final ScheduledExecutorService zzl;
    private zzbys zzm;
    private final zzc zzq;
    private final zzdwl zzr;
    private final zzfig zzs;
    private zzdwb zzj = null;
    private Point zzn = new Point();
    private Point zzo = new Point();
    private final Set zzp = Collections.newSetFromMap(new WeakHashMap());
    private final AtomicInteger zzz = new AtomicInteger(0);
    private final boolean zzt = ((Boolean) zzay.zzc().zzb(zzbhy.zzgi)).booleanValue();
    private final boolean zzu = ((Boolean) zzay.zzc().zzb(zzbhy.zzgh)).booleanValue();
    private final boolean zzv = ((Boolean) zzay.zzc().zzb(zzbhy.zzgj)).booleanValue();
    private final boolean zzw = ((Boolean) zzay.zzc().zzb(zzbhy.zzgl)).booleanValue();
    private final String zzx = (String) zzay.zzc().zzb(zzbhy.zzgk);
    private final String zzy = (String) zzay.zzc().zzb(zzbhy.zzgm);
    private final String zzC = (String) zzay.zzc().zzb(zzbhy.zzgn);

    public zzz(zzcnf zzcnfVar, Context context, zzaoc zzaocVar, zzfcu zzfcuVar, zzfvk zzfvkVar, ScheduledExecutorService scheduledExecutorService, zzdwl zzdwlVar, zzfig zzfigVar, zzcfo zzcfoVar) {
        List list;
        this.zzf = zzcnfVar;
        this.zzg = context;
        this.zzh = zzaocVar;
        this.zzi = zzfcuVar;
        this.zzk = zzfvkVar;
        this.zzl = scheduledExecutorService;
        this.zzq = zzcnfVar.zzm();
        this.zzr = zzdwlVar;
        this.zzs = zzfigVar;
        this.zzA = zzcfoVar;
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzgo)).booleanValue()) {
            this.zzD = zzW((String) zzay.zzc().zzb(zzbhy.zzgp));
            this.zzE = zzW((String) zzay.zzc().zzb(zzbhy.zzgq));
            this.zzF = zzW((String) zzay.zzc().zzb(zzbhy.zzgr));
            list = zzW((String) zzay.zzc().zzb(zzbhy.zzgs));
        } else {
            this.zzD = zza;
            this.zzE = zzb;
            this.zzF = zzc;
            list = zzd;
        }
        this.zzG = list;
    }

    public static /* bridge */ /* synthetic */ void zzE(zzz zzzVar, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (zzzVar.zzM((Uri) it.next())) {
                zzzVar.zzz.getAndIncrement();
                return;
            }
        }
    }

    public static /* bridge */ /* synthetic */ void zzF(zzz zzzVar, final String str, final String str2, final zzdwb zzdwbVar) {
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzfT)).booleanValue()) {
            if (((Boolean) zzay.zzc().zzb(zzbhy.zzfZ)).booleanValue()) {
                zzcfv.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzi
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzz.this.zzH(str, str2, zzdwbVar);
                    }
                });
            } else {
                zzzVar.zzq.zzd(str, str2, zzdwbVar);
            }
        }
    }

    public static final /* synthetic */ Uri zzO(Uri uri, String str) {
        return !TextUtils.isEmpty(str) ? zzV(uri, "nas", str) : uri;
    }

    private final zzh zzP(Context context, String str, String str2, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar) {
        zzg zzn = this.zzf.zzn();
        zzdbc zzdbcVar = new zzdbc();
        zzdbcVar.zzc(context);
        zzfbw zzfbwVar = new zzfbw();
        if (str == null) {
            str = "adUnitId";
        }
        zzfbwVar.zzs(str);
        if (zzlVar == null) {
            zzlVar = new com.google.android.gms.ads.internal.client.zzm().zza();
        }
        zzfbwVar.zzE(zzlVar);
        if (zzqVar == null) {
            zzqVar = new com.google.android.gms.ads.internal.client.zzq();
        }
        zzfbwVar.zzr(zzqVar);
        zzfbwVar.zzx(true);
        zzdbcVar.zzf(zzfbwVar.zzG());
        zzn.zza(zzdbcVar.zzg());
        zzab zzabVar = new zzab();
        zzabVar.zza(str2);
        zzn.zzb(new zzad(zzabVar, null));
        new zzdhc();
        zzh zzc2 = zzn.zzc();
        this.zzj = zzc2.zza();
        return zzc2;
    }

    private final zzfvj zzQ(final String str) {
        final zzdsd[] zzdsdVarArr = new zzdsd[1];
        zzfvj zzn = zzfva.zzn(this.zzi.zza(), new zzfuh() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzj
            @Override // com.google.android.gms.internal.ads.zzfuh
            public final zzfvj zza(Object obj) {
                return zzz.this.zzu(zzdsdVarArr, str, (zzdsd) obj);
            }
        }, this.zzk);
        zzn.zzc(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzk
            @Override // java.lang.Runnable
            public final void run() {
                zzz.this.zzG(zzdsdVarArr);
            }
        }, this.zzk);
        return zzfva.zzf(zzfva.zzm((zzfur) zzfva.zzo(zzfur.zzv(zzn), ((Integer) zzay.zzc().zzb(zzbhy.zzgv)).intValue(), TimeUnit.MILLISECONDS, this.zzl), new zzfoi() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzt
            @Override // com.google.android.gms.internal.ads.zzfoi
            public final Object apply(Object obj) {
                int i2 = zzz.zze;
                return ((JSONObject) obj).optString("nas");
            }
        }, this.zzk), Exception.class, new zzfoi() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzu
            @Override // com.google.android.gms.internal.ads.zzfoi
            public final Object apply(Object obj) {
                int i2 = zzz.zze;
                zzcfi.zzh("", (Exception) obj);
                return null;
            }
        }, this.zzk);
    }

    private final void zzR(List list, final IObjectWrapper iObjectWrapper, zzbyj zzbyjVar, boolean z) {
        zzfvj zzb2;
        if (!((Boolean) zzay.zzc().zzb(zzbhy.zzgu)).booleanValue()) {
            zzcfi.zzj("The updating URL feature is not enabled.");
            try {
                zzbyjVar.zze("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e2) {
                zzcfi.zzh("", e2);
                return;
            }
        }
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (zzM((Uri) it.next())) {
                i2++;
            }
        }
        if (i2 > 1) {
            zzcfi.zzj("Multiple google urls found: ".concat(String.valueOf(list)));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            final Uri uri = (Uri) it2.next();
            if (!zzM(uri)) {
                zzcfi.zzj("Not a Google URL: ".concat(String.valueOf(uri)));
                zzb2 = zzfva.zzi(uri);
            } else {
                zzb2 = this.zzk.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzo
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return zzz.this.zzm(uri, iObjectWrapper);
                    }
                });
                if (zzU()) {
                    zzb2 = zzfva.zzn(zzb2, new zzfuh() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzp
                        @Override // com.google.android.gms.internal.ads.zzfuh
                        public final zzfvj zza(Object obj) {
                            return zzz.zzr(zzz.this, (Uri) obj);
                        }
                    }, this.zzk);
                } else {
                    zzcfi.zzi("Asset view map is empty.");
                }
            }
            arrayList.add(zzb2);
        }
        zzfva.zzr(zzfva.zze(arrayList), new zzx(this, zzbyjVar, z), this.zzf.zzA());
    }

    private final void zzS(final List list, final IObjectWrapper iObjectWrapper, zzbyj zzbyjVar, boolean z) {
        if (!((Boolean) zzay.zzc().zzb(zzbhy.zzgu)).booleanValue()) {
            try {
                zzbyjVar.zze("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e2) {
                zzcfi.zzh("", e2);
                return;
            }
        }
        zzfvj zzb2 = this.zzk.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzz.this.zzB(list, iObjectWrapper);
            }
        });
        if (zzU()) {
            zzb2 = zzfva.zzn(zzb2, new zzfuh() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzr
                @Override // com.google.android.gms.internal.ads.zzfuh
                public final zzfvj zza(Object obj) {
                    return zzz.this.zzv((ArrayList) obj);
                }
            }, this.zzk);
        } else {
            zzcfi.zzi("Asset view map is empty.");
        }
        zzfva.zzr(zzb2, new zzw(this, zzbyjVar, z), this.zzf.zzA());
    }

    private static boolean zzT(Uri uri, List list, List list2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (host != null && path != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (path.contains((String) it.next())) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (host.endsWith((String) it2.next())) {
                            return true;
                        }
                    }
                    continue;
                }
            }
        }
        return false;
    }

    private final boolean zzU() {
        Map map;
        zzbys zzbysVar = this.zzm;
        return (zzbysVar == null || (map = zzbysVar.zzb) == null || map.isEmpty()) ? false : true;
    }

    public static final Uri zzV(Uri uri, String str, String str2) {
        String uri2 = uri.toString();
        int indexOf = uri2.indexOf("&adurl=");
        if (indexOf == -1) {
            indexOf = uri2.indexOf("?adurl=");
        }
        if (indexOf != -1) {
            int i2 = indexOf + 1;
            StringBuilder sb = new StringBuilder(uri2.substring(0, i2));
            a.R(sb, str, "=", str2, "&");
            sb.append(uri2.substring(i2));
            return Uri.parse(sb.toString());
        }
        return uri.buildUpon().appendQueryParameter(str, str2).build();
    }

    private static final List zzW(String str) {
        String[] split = TextUtils.split(str, ",");
        ArrayList arrayList = new ArrayList();
        for (String str2 : split) {
            if (!zzfpg.zzd(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ zzfvj zzr(zzz zzzVar, final Uri uri) {
        return zzfva.zzm(zzzVar.zzQ("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new zzfoi() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzl
            @Override // com.google.android.gms.internal.ads.zzfoi
            public final Object apply(Object obj) {
                return zzz.zzO(uri, (String) obj);
            }
        }, zzzVar.zzk);
    }

    public final /* synthetic */ ArrayList zzA(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (zzN(uri) && !TextUtils.isEmpty(str)) {
                arrayList.add(zzV(uri, "nas", str));
            } else {
                arrayList.add(uri);
            }
        }
        return arrayList;
    }

    public final /* synthetic */ ArrayList zzB(List list, IObjectWrapper iObjectWrapper) {
        String zzh = this.zzh.zzc() != null ? this.zzh.zzc().zzh(this.zzg, (View) ObjectWrapper.unwrap(iObjectWrapper), null) : "";
        if (!TextUtils.isEmpty(zzh)) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Uri uri = (Uri) it.next();
                if (!zzN(uri)) {
                    zzcfi.zzj("Not a Google URL: ".concat(String.valueOf(uri)));
                    arrayList.add(uri);
                } else {
                    arrayList.add(zzV(uri, "ms", zzh));
                }
            }
            if (arrayList.isEmpty()) {
                throw new Exception("Empty impression URLs result.");
            }
            return arrayList;
        }
        throw new Exception("Failed to get view signals.");
    }

    public final /* synthetic */ void zzG(zzdsd[] zzdsdVarArr) {
        zzdsd zzdsdVar = zzdsdVarArr[0];
        if (zzdsdVar != null) {
            this.zzi.zzb(zzfva.zzi(zzdsdVar));
        }
    }

    public final /* synthetic */ void zzH(String str, String str2, zzdwb zzdwbVar) {
        this.zzq.zzd(str, str2, zzdwbVar);
    }

    public final boolean zzM(Uri uri) {
        return zzT(uri, this.zzD, this.zzE);
    }

    public final boolean zzN(Uri uri) {
        return zzT(uri, this.zzF, this.zzG);
    }

    @Override // com.google.android.gms.internal.ads.zzcdz
    public final void zze(IObjectWrapper iObjectWrapper, final zzced zzcedVar, zzcdw zzcdwVar) {
        zzfvj zzb2;
        this.zzg = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzio)).booleanValue()) {
            zzb2 = zzfva.zzl(new zzfug() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzn
                @Override // com.google.android.gms.internal.ads.zzfug
                public final zzfvj zza() {
                    return zzz.this.zzs(zzcedVar);
                }
            }, zzcfv.zza);
        } else {
            zzb2 = zzP(this.zzg, zzcedVar.zza, zzcedVar.zzb, zzcedVar.zzc, zzcedVar.zzd).zzb();
        }
        zzfva.zzr(zzb2, new zzv(this, zzcdwVar, com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis()), this.zzf.zzA());
    }

    @Override // com.google.android.gms.internal.ads.zzcdz
    public final void zzf(zzbys zzbysVar) {
        this.zzm = zzbysVar;
        this.zzi.zzc(1);
    }

    @Override // com.google.android.gms.internal.ads.zzcdz
    public final void zzg(List list, IObjectWrapper iObjectWrapper, zzbyj zzbyjVar) {
        zzR(list, iObjectWrapper, zzbyjVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzcdz
    public final void zzh(List list, IObjectWrapper iObjectWrapper, zzbyj zzbyjVar) {
        zzS(list, iObjectWrapper, zzbyjVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzcdz
    public final void zzi(IObjectWrapper iObjectWrapper) {
        zzfvj zzb2;
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzhK)).booleanValue()) {
            if (((Boolean) zzay.zzc().zzb(zzbhy.zzhL)).booleanValue()) {
                if (((Boolean) zzay.zzc().zzb(zzbhy.zzio)).booleanValue()) {
                    zzb2 = zzfva.zzl(new zzfug() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzs
                        @Override // com.google.android.gms.internal.ads.zzfug
                        public final zzfvj zza() {
                            return zzz.this.zzt();
                        }
                    }, zzcfv.zza);
                } else {
                    zzb2 = zzP(this.zzg, null, AdFormat.BANNER.name(), null, null).zzb();
                }
                zzfva.zzr(zzb2, new zzy(this), this.zzf.zzA());
            }
            WebView webView = (WebView) ObjectWrapper.unwrap(iObjectWrapper);
            if (webView == null) {
                zzcfi.zzg("The webView cannot be null.");
            } else if (this.zzp.contains(webView)) {
                zzcfi.zzi("This webview has already been registered.");
            } else {
                this.zzp.add(webView);
                webView.addJavascriptInterface(new TaggingLibraryJsInterface(webView, this.zzh, this.zzr), "gmaSdk");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdz
    public final void zzj(IObjectWrapper iObjectWrapper) {
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzgu)).booleanValue()) {
            MotionEvent motionEvent = (MotionEvent) ObjectWrapper.unwrap(iObjectWrapper);
            zzbys zzbysVar = this.zzm;
            this.zzn = zzbx.zza(motionEvent, zzbysVar == null ? null : zzbysVar.zza);
            if (motionEvent.getAction() == 0) {
                this.zzo = this.zzn;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            Point point = this.zzn;
            obtain.setLocation(point.x, point.y);
            this.zzh.zzd(obtain);
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdz
    public final void zzk(List list, IObjectWrapper iObjectWrapper, zzbyj zzbyjVar) {
        zzR(list, iObjectWrapper, zzbyjVar, false);
    }

    @Override // com.google.android.gms.internal.ads.zzcdz
    public final void zzl(List list, IObjectWrapper iObjectWrapper, zzbyj zzbyjVar) {
        zzS(list, iObjectWrapper, zzbyjVar, false);
    }

    public final /* synthetic */ Uri zzm(Uri uri, IObjectWrapper iObjectWrapper) {
        try {
            uri = this.zzh.zza(uri, this.zzg, (View) ObjectWrapper.unwrap(iObjectWrapper), null);
        } catch (zzaod e2) {
            zzcfi.zzk("", e2);
        }
        if (uri.getQueryParameter("ms") != null) {
            return uri;
        }
        throw new Exception("Failed to append spam signals to click url.");
    }

    public final /* synthetic */ zzfvj zzs(zzced zzcedVar) {
        return zzP(this.zzg, zzcedVar.zza, zzcedVar.zzb, zzcedVar.zzc, zzcedVar.zzd).zzb();
    }

    public final /* synthetic */ zzfvj zzt() {
        return zzP(this.zzg, null, AdFormat.BANNER.name(), null, null).zzb();
    }

    public final /* synthetic */ zzfvj zzu(zzdsd[] zzdsdVarArr, String str, zzdsd zzdsdVar) {
        zzdsdVarArr[0] = zzdsdVar;
        Context context = this.zzg;
        zzbys zzbysVar = this.zzm;
        Map map = zzbysVar.zzb;
        JSONObject zzd2 = zzbx.zzd(context, map, map, zzbysVar.zza);
        JSONObject zzg = zzbx.zzg(this.zzg, this.zzm.zza);
        JSONObject zzf = zzbx.zzf(this.zzm.zza);
        JSONObject zze2 = zzbx.zze(this.zzg, this.zzm.zza);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("asset_view_signal", zzd2);
        jSONObject.put("ad_view_signal", zzg);
        jSONObject.put("scroll_view_signal", zzf);
        jSONObject.put("lock_screen_signal", zze2);
        if (str == "google.afma.nativeAds.getPublisherCustomRenderedClickSignals") {
            jSONObject.put("click_signal", zzbx.zzc(null, this.zzg, this.zzo, this.zzn));
        }
        return zzdsdVar.zzd(str, jSONObject);
    }

    public final /* synthetic */ zzfvj zzv(final ArrayList arrayList) {
        return zzfva.zzm(zzQ("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new zzfoi() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzm
            @Override // com.google.android.gms.internal.ads.zzfoi
            public final Object apply(Object obj) {
                return zzz.this.zzA(arrayList, (String) obj);
            }
        }, this.zzk);
    }
}
