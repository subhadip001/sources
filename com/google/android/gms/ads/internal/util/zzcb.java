package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.os.StrictMode;
import com.google.android.gms.internal.ads.zzbyx;
import com.google.android.gms.internal.ads.zzcfi;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcb {
    @Deprecated
    public static Object zza(Context context, Callable callable) {
        try {
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            Object call = callable.call();
            StrictMode.setThreadPolicy(threadPolicy);
            return call;
        } catch (Throwable th) {
            zzcfi.zzh("Unexpected exception.", th);
            zzbyx.zza(context).zzd(th, "StrictModeUtil.runWithLaxStrictMode");
            return null;
        }
    }
}
