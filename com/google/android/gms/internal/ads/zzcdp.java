package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import f.a.b.a.a;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcdp {
    @VisibleForTesting
    public static Uri zza(String str, String str2, String str3) {
        int indexOf = str.indexOf("&adurl");
        if (indexOf == -1) {
            indexOf = str.indexOf("?adurl");
        }
        if (indexOf != -1) {
            int i2 = indexOf + 1;
            StringBuilder sb = new StringBuilder(str.substring(0, i2));
            a.R(sb, str2, "=", str3, "&");
            sb.append(str.substring(i2));
            return Uri.parse(sb.toString());
        }
        return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
    }

    public static String zzb(Uri uri, Context context) {
        if (!com.google.android.gms.ads.internal.zzt.zzn().zzu(context)) {
            return uri.toString();
        }
        String zza = com.google.android.gms.ads.internal.zzt.zzn().zza(context);
        if (zza == null) {
            return uri.toString();
        }
        String str = (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzac);
        String uri2 = uri.toString();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzab)).booleanValue() && uri2.contains(str)) {
            com.google.android.gms.ads.internal.zzt.zzn().zzm(context, zza);
            return zzd(uri2, context).replace(str, zza);
        } else if (TextUtils.isEmpty(uri.getQueryParameter("fbs_aeid"))) {
            String uri3 = zza(zzd(uri2, context), "fbs_aeid", zza).toString();
            com.google.android.gms.ads.internal.zzt.zzn().zzm(context, zza);
            return uri3;
        } else {
            return uri2;
        }
    }

    public static String zzc(String str, Context context, boolean z) {
        String zza;
        if ((!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzaj)).booleanValue() || z) && com.google.android.gms.ads.internal.zzt.zzn().zzu(context) && !TextUtils.isEmpty(str) && (zza = com.google.android.gms.ads.internal.zzt.zzn().zza(context)) != null) {
            String str2 = (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzac);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzab)).booleanValue() && str.contains(str2)) {
                if (com.google.android.gms.ads.internal.zzt.zzp().zzg(str)) {
                    com.google.android.gms.ads.internal.zzt.zzn().zzm(context, zza);
                    return zzd(str, context).replace(str2, zza);
                } else if (com.google.android.gms.ads.internal.zzt.zzp().zzh(str)) {
                    com.google.android.gms.ads.internal.zzt.zzn().zzn(context, zza);
                    return zzd(str, context).replace(str2, zza);
                } else {
                    return str;
                }
            } else if (str.contains("fbs_aeid")) {
                return str;
            } else {
                if (com.google.android.gms.ads.internal.zzt.zzp().zzg(str)) {
                    com.google.android.gms.ads.internal.zzt.zzn().zzm(context, zza);
                    return zza(zzd(str, context), "fbs_aeid", zza).toString();
                } else if (com.google.android.gms.ads.internal.zzt.zzp().zzh(str)) {
                    com.google.android.gms.ads.internal.zzt.zzn().zzn(context, zza);
                    return zza(zzd(str, context), "fbs_aeid", zza).toString();
                } else {
                    return str;
                }
            }
        }
        return str;
    }

    private static String zzd(String str, Context context) {
        String zze = com.google.android.gms.ads.internal.zzt.zzn().zze(context);
        String zzc = com.google.android.gms.ads.internal.zzt.zzn().zzc(context);
        if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(zze)) {
            str = zza(str, "gmp_app_id", zze).toString();
        }
        return (str.contains("fbs_aiid") || TextUtils.isEmpty(zzc)) ? str : zza(str, "fbs_aiid", zzc).toString();
    }
}
