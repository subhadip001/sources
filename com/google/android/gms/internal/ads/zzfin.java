package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfin {
    private final zzfiu zza;
    private final WebView zzb;
    private final List zzc = new ArrayList();
    private final Map zzd = new HashMap();
    private final String zze = "";
    private final String zzf;
    private final zzfio zzg;

    private zzfin(zzfiu zzfiuVar, WebView webView, String str, List list, String str2, String str3, zzfio zzfioVar) {
        this.zza = zzfiuVar;
        this.zzb = webView;
        this.zzg = zzfioVar;
        this.zzf = str2;
    }

    public static zzfin zzb(zzfiu zzfiuVar, WebView webView, String str, String str2) {
        return new zzfin(zzfiuVar, webView, null, null, str, "", zzfio.HTML);
    }

    public static zzfin zzc(zzfiu zzfiuVar, WebView webView, String str, String str2) {
        return new zzfin(zzfiuVar, webView, null, null, str, "", zzfio.JAVASCRIPT);
    }

    public final WebView zza() {
        return this.zzb;
    }

    public final zzfio zzd() {
        return this.zzg;
    }

    public final zzfiu zze() {
        return this.zza;
    }

    public final String zzf() {
        return this.zzf;
    }

    public final String zzg() {
        return this.zze;
    }

    public final List zzh() {
        return Collections.unmodifiableList(this.zzc);
    }

    public final Map zzi() {
        return Collections.unmodifiableMap(this.zzd);
    }
}
