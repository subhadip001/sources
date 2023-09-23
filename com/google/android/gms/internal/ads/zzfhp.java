package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfhp {
    public static void zza(zzfvj zzfvjVar, zzfhq zzfhqVar, zzfhg zzfhgVar) {
        if (((Boolean) zzbjh.zzc.zze()).booleanValue()) {
            zzfva.zzr(zzfur.zzv(zzfvjVar), new zzfhn(zzfhqVar, zzfhgVar, false), zzcfv.zzf);
        }
    }

    public static void zzb(zzfvj zzfvjVar, zzfhq zzfhqVar, zzfhg zzfhgVar) {
        if (((Boolean) zzbjh.zzc.zze()).booleanValue()) {
            zzfva.zzr(zzfur.zzv(zzfvjVar), new zzfho(zzfhqVar, zzfhgVar), zzcfv.zzf);
        }
    }

    public static void zzc(zzfvj zzfvjVar, zzfhg zzfhgVar) {
        if (((Boolean) zzbjh.zzc.zze()).booleanValue()) {
            zzfva.zzr(zzfur.zzv(zzfvjVar), new zzfhm(zzfhgVar), zzcfv.zzf);
        }
    }

    public static boolean zzd(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.matches((String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzhn), str);
    }
}
