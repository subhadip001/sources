package com.google.android.gms.internal.ads;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfpi {
    private static final Object zza;
    private static final Method zzb;
    private static final Method zzc;

    static {
        Object zzc2 = zzc();
        zza = zzc2;
        zzb = zzc2 == null ? null : zzd("getStackTraceElement", Throwable.class, Integer.TYPE);
        zzc = zzc2 != null ? zze(zzc2) : null;
    }

    public static String zza(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static void zzb(Throwable th) {
        if (!(th instanceof RuntimeException)) {
            if (th instanceof Error) {
                throw ((Error) th);
            }
            return;
        }
        throw ((RuntimeException) th);
    }

    private static Object zzc() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", new Class[0]).invoke(null, new Object[0]);
        } catch (ThreadDeath e2) {
            throw e2;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method zzd(String str, Class... clsArr) {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e2) {
            throw e2;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method zze(Object obj) {
        try {
            Method zzd = zzd("getStackTraceDepth", Throwable.class);
            if (zzd == null) {
                return null;
            }
            zzd.invoke(obj, new Throwable());
            return zzd;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }
}
