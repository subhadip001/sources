package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.telephony.TelephonyManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebResourceResponse;
import com.google.android.gms.internal.ads.zzbdl;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzcli;
import com.google.android.gms.internal.ads.zzclp;
import com.google.android.gms.internal.ads.zzcmk;
import java.io.InputStream;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public class zzaa {
    private zzaa() {
    }

    public /* synthetic */ zzaa(zzz zzzVar) {
    }

    public static zzaa zzl(int i2) {
        return i2 >= 30 ? new zzy() : i2 >= 28 ? new zzx() : i2 >= 26 ? new zzv() : i2 >= 24 ? new zzu() : i2 >= 21 ? new zzt() : new zzaa();
    }

    public int zza() {
        return 1;
    }

    public CookieManager zzb(Context context) {
        com.google.android.gms.ads.internal.zzt.zzp();
        if (zzs.zzB()) {
            return null;
        }
        try {
            CookieSyncManager.createInstance(context);
            return CookieManager.getInstance();
        } catch (Throwable th) {
            zzcfi.zzh("Failed to obtain CookieManager.", th);
            com.google.android.gms.ads.internal.zzt.zzo().zzt(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    public WebResourceResponse zzc(String str, String str2, int i2, String str3, Map map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, inputStream);
    }

    public zzclp zzd(zzcli zzcliVar, zzbdl zzbdlVar, boolean z) {
        return new zzcmk(zzcliVar, zzbdlVar, z);
    }

    public boolean zze(Activity activity, Configuration configuration) {
        return false;
    }

    public void zzg(Context context) {
    }

    public int zzh(Context context, TelephonyManager telephonyManager) {
        return 1001;
    }

    public void zzi(Activity activity) {
    }

    public int zzk(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
    }
}
