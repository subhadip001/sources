package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.view.MotionEvent;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import androidx.core.app.NotificationCompat;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzaoc;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzcfv;
import com.google.android.gms.internal.ads.zzdwl;
import f.a.b.a.a;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class TaggingLibraryJsInterface {
    private final Context zza;
    private final WebView zzb;
    private final zzaoc zzc;
    private final int zzd;
    private final zzdwl zze;
    private final boolean zzf;

    public TaggingLibraryJsInterface(WebView webView, zzaoc zzaocVar, zzdwl zzdwlVar) {
        this.zzb = webView;
        Context context = webView.getContext();
        this.zza = context;
        this.zzc = zzaocVar;
        this.zze = zzdwlVar;
        zzbhy.zzc(context);
        this.zzd = ((Integer) zzay.zzc().zzb(zzbhy.zzhM)).intValue();
        this.zzf = ((Boolean) zzay.zzc().zzb(zzbhy.zzhN)).booleanValue();
    }

    @JavascriptInterface
    @KeepForSdk
    public String getClickSignals(String str) {
        try {
            long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis();
            String zze = this.zzc.zzc().zze(this.zza, str, this.zzb);
            if (this.zzf) {
                zzf.zzc(this.zze, null, "csg", new Pair("clat", String.valueOf(com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis() - currentTimeMillis)));
            }
            return zze;
        } catch (RuntimeException e2) {
            zzcfi.zzh("Exception getting click signals. ", e2);
            com.google.android.gms.ads.internal.zzt.zzo().zzt(e2, "TaggingLibraryJsInterface.getClickSignals");
            return "";
        }
    }

    @JavascriptInterface
    @KeepForSdk
    public String getClickSignalsWithTimeout(final String str, int i2) {
        if (i2 <= 0) {
            zzcfi.zzg("Invalid timeout for getting click signals. Timeout=" + i2);
            return "";
        }
        try {
            return (String) zzcfv.zza.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzan
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return TaggingLibraryJsInterface.this.getClickSignals(str);
                }
            }).get(Math.min(i2, this.zzd), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            zzcfi.zzh("Exception getting click signals with timeout. ", e2);
            com.google.android.gms.ads.internal.zzt.zzo().zzt(e2, "TaggingLibraryJsInterface.getClickSignalsWithTimeout");
            return e2 instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    @KeepForSdk
    public String getQueryInfo() {
        com.google.android.gms.ads.internal.zzt.zzp();
        String uuid = UUID.randomUUID().toString();
        Bundle S = a.S("query_info_type", "requester_type_6");
        Context context = this.zza;
        AdFormat adFormat = AdFormat.BANNER;
        AdRequest.Builder builder = new AdRequest.Builder();
        builder.addNetworkExtrasBundle(AdMobAdapter.class, S);
        QueryInfo.generate(context, adFormat, builder.build(), new zzao(this, uuid));
        return uuid;
    }

    @JavascriptInterface
    @KeepForSdk
    public String getViewSignals() {
        try {
            long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis();
            String zzh = this.zzc.zzc().zzh(this.zza, this.zzb, null);
            if (this.zzf) {
                zzf.zzc(this.zze, null, "vsg", new Pair("vlat", String.valueOf(com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis() - currentTimeMillis)));
            }
            return zzh;
        } catch (RuntimeException e2) {
            zzcfi.zzh("Exception getting view signals. ", e2);
            com.google.android.gms.ads.internal.zzt.zzo().zzt(e2, "TaggingLibraryJsInterface.getViewSignals");
            return "";
        }
    }

    @JavascriptInterface
    @KeepForSdk
    public String getViewSignalsWithTimeout(int i2) {
        if (i2 <= 0) {
            zzcfi.zzg("Invalid timeout for getting view signals. Timeout=" + i2);
            return "";
        }
        try {
            return (String) zzcfv.zza.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzam
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return TaggingLibraryJsInterface.this.getViewSignals();
                }
            }).get(Math.min(i2, this.zzd), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            zzcfi.zzh("Exception getting view signals with timeout. ", e2);
            com.google.android.gms.ads.internal.zzt.zzo().zzt(e2, "TaggingLibraryJsInterface.getViewSignalsWithTimeout");
            return e2 instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    @KeepForSdk
    public void reportTouchEvent(String str) {
        int i2;
        int i3;
        int i4;
        float f2;
        int i5;
        try {
            JSONObject jSONObject = new JSONObject(str);
            i2 = jSONObject.getInt("x");
            i3 = jSONObject.getInt("y");
            i4 = jSONObject.getInt("duration_ms");
            f2 = (float) jSONObject.getDouble("force");
            i5 = jSONObject.getInt(NotificationCompat.MessagingStyle.Message.KEY_DATA_MIME_TYPE);
        } catch (RuntimeException | JSONException e2) {
            e = e2;
        }
        try {
            this.zzc.zzd(MotionEvent.obtain(0L, i4, i5 != 0 ? i5 != 1 ? i5 != 2 ? i5 != 3 ? -1 : 3 : 2 : 1 : 0, i2, i3, f2, 1.0f, 0, 1.0f, 1.0f, 0, 0));
        } catch (RuntimeException e3) {
            e = e3;
            zzcfi.zzh("Failed to parse the touch string. ", e);
            com.google.android.gms.ads.internal.zzt.zzo().zzt(e, "TaggingLibraryJsInterface.reportTouchEvent");
        } catch (JSONException e4) {
            e = e4;
            zzcfi.zzh("Failed to parse the touch string. ", e);
            com.google.android.gms.ads.internal.zzt.zzo().zzt(e, "TaggingLibraryJsInterface.reportTouchEvent");
        }
    }
}
