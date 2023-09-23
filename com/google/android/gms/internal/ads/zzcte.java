package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcte implements zzcso {
    private final CookieManager zza;

    public zzcte(Context context) {
        this.zza = com.google.android.gms.ads.internal.zzt.zzq().zzb(context);
    }

    @Override // com.google.android.gms.internal.ads.zzcso
    public final void zza(Map map) {
        if (this.zza == null) {
            return;
        }
        if (((String) map.get("clear")) != null) {
            String str = (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzaH);
            String cookie = this.zza.getCookie(str);
            if (cookie == null) {
                return;
            }
            List zzf = zzfpe.zzc(zzfof.zzc(';')).zzf(cookie);
            for (int i2 = 0; i2 < zzf.size(); i2++) {
                CookieManager cookieManager = this.zza;
                Iterator it = zzfpe.zzc(zzfof.zzc('=')).zzd((String) zzf.get(i2)).iterator();
                Objects.requireNonNull(it);
                if (it.hasNext()) {
                    cookieManager.setCookie(str, String.valueOf((String) it.next()).concat(String.valueOf((String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzau))));
                } else {
                    StringBuilder sb = new StringBuilder(91);
                    sb.append("position (0) must be less than the number of elements that remained (");
                    sb.append(0);
                    sb.append(")");
                    throw new IndexOutOfBoundsException(sb.toString());
                }
            }
            return;
        }
        String str2 = (String) map.get("cookie");
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.zza.setCookie((String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzaH), str2);
    }
}
