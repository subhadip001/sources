package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Log;
import f.a.b.a.a;
import java.net.UnknownHostException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdn {
    public static void zza(String str, String str2, Throwable th) {
        Log.e(str, zzc(str2, th));
    }

    public static void zzb(String str, String str2, Throwable th) {
        Log.w(str, zzc(str2, th));
    }

    private static String zzc(String str, Throwable th) {
        String replace;
        if (th != null) {
            Throwable th2 = th;
            while (true) {
                if (th2 != null) {
                    if (th2 instanceof UnknownHostException) {
                        replace = "UnknownHostException (no network)";
                        break;
                    }
                    th2 = th2.getCause();
                } else {
                    replace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                    break;
                }
            }
        } else {
            replace = null;
        }
        return !TextUtils.isEmpty(replace) ? a.r(str, "\n  ", replace.replace("\n", "\n  "), "\n") : str;
    }
}
