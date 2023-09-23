package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.File;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public class zzcml extends zzclp {
    public zzcml(zzcli zzcliVar, zzbdl zzbdlVar, boolean z) {
        super(zzcliVar, zzbdlVar, z);
    }

    public final WebResourceResponse zzM(WebView webView, String str, Map map) {
        String str2;
        if (!(webView instanceof zzcli)) {
            zzcfi.zzj("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        zzcli zzcliVar = (zzcli) webView;
        zzccj zzccjVar = this.zza;
        if (zzccjVar != null) {
            zzccjVar.zzd(str, map, 1);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.emptyMap();
            }
            return super.zzc(str, map);
        }
        if (zzcliVar.zzP() != null) {
            zzcliVar.zzP().zzD();
        }
        if (zzcliVar.zzQ().zzi()) {
            str2 = (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzM);
        } else if (zzcliVar.zzaC()) {
            str2 = (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzL);
        } else {
            str2 = (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzK);
        }
        com.google.android.gms.ads.internal.zzt.zzp();
        return com.google.android.gms.ads.internal.util.zzs.zzu(zzcliVar.getContext(), zzcliVar.zzp().zza, str2);
    }
}
