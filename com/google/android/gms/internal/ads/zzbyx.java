package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import com.arthenica.ffmpegkit.Chapter;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportDataCapture;
import f.a.b.a.a;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbyx implements zzbyz {
    @VisibleForTesting
    public static zzbyz zza;
    @VisibleForTesting
    public static zzbyz zzb;
    private static final Object zzc = new Object();
    private final Context zze;
    private final ExecutorService zzg;
    private final zzcfo zzh;
    private final Object zzd = new Object();
    private final WeakHashMap zzf = new WeakHashMap();

    public zzbyx(Context context, zzcfo zzcfoVar) {
        zzfnt.zza();
        this.zzg = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        this.zze = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzh = zzcfoVar;
    }

    public static zzbyz zza(Context context) {
        synchronized (zzc) {
            if (zza == null) {
                if (((Boolean) zzbjw.zze.zze()).booleanValue()) {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzgw)).booleanValue()) {
                        zza = new zzbyx(context, zzcfo.zza());
                    }
                }
                zza = new zzbyy();
            }
        }
        return zza;
    }

    public static zzbyz zzb(Context context, zzcfo zzcfoVar) {
        synchronized (zzc) {
            if (zzb == null) {
                if (((Boolean) zzbjw.zze.zze()).booleanValue()) {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzgw)).booleanValue()) {
                        zzbyx zzbyxVar = new zzbyx(context, zzcfoVar);
                        Thread thread = Looper.getMainLooper().getThread();
                        if (thread != null) {
                            synchronized (zzbyxVar.zzd) {
                                zzbyxVar.zzf.put(thread, Boolean.TRUE);
                            }
                            thread.setUncaughtExceptionHandler(new zzbyw(zzbyxVar, thread.getUncaughtExceptionHandler()));
                        }
                        Thread.setDefaultUncaughtExceptionHandler(new zzbyv(zzbyxVar, Thread.getDefaultUncaughtExceptionHandler()));
                        zzb = zzbyxVar;
                    }
                }
                zzb = new zzbyy();
            }
        }
        return zzb;
    }

    public final void zzc(Thread thread, Throwable th) {
        StackTraceElement[] stackTrace;
        if (th != null) {
            boolean z = false;
            boolean z2 = false;
            for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
                for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                    z |= zzcfb.zzm(stackTraceElement.getClassName());
                    z2 |= zzbyx.class.getName().equals(stackTraceElement.getClassName());
                }
            }
            if (!z || z2) {
                return;
            }
            zze(th, "", 1.0f);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyz
    public final void zzd(Throwable th, String str) {
        zze(th, str, 1.0f);
    }

    @Override // com.google.android.gms.internal.ads.zzbyz
    public final void zze(Throwable th, String str, float f2) {
        boolean z;
        String str2;
        if (zzcfb.zzf(th) == null) {
            return;
        }
        String name = th.getClass().getName();
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        String stringWriter2 = stringWriter.toString();
        double d2 = f2;
        double random = Math.random();
        int i2 = f2 > 0.0f ? (int) (1.0f / f2) : 1;
        if (random < d2) {
            ArrayList arrayList = new ArrayList();
            try {
                z = Wrappers.packageManager(this.zze).isCallerInstantApp();
            } catch (Throwable th2) {
                zzcfi.zzh("Error fetching instant app info", th2);
                z = false;
            }
            try {
                str2 = this.zze.getPackageName();
            } catch (Throwable unused) {
                zzcfi.zzj("Cannot obtain package name, proceeding.");
                str2 = "unknown";
            }
            Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(z)).appendQueryParameter(Chapter.KEY_ID, "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT));
            String str3 = Build.MANUFACTURER;
            String str4 = Build.MODEL;
            if (!str4.startsWith(str3)) {
                str4 = a.q(str3, " ", str4);
            }
            arrayList.add(appendQueryParameter.appendQueryParameter("device", str4).appendQueryParameter("js", this.zzh.zza).appendQueryParameter("appid", str2).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", stringWriter2).appendQueryParameter("eids", TextUtils.join(",", zzbhy.zza())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "448117567").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i2)).appendQueryParameter("pb_tm", String.valueOf(zzbjw.zzc.zze())).appendQueryParameter("gmscv", String.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zze))).appendQueryParameter("lite", true != this.zzh.zze ? CrashlyticsReportDataCapture.SIGNAL_DEFAULT : "1").toString());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                final String str5 = (String) it.next();
                final zzcfn zzcfnVar = new zzcfn(null);
                this.zzg.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbyu
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcfn.this.zza(str5);
                    }
                });
            }
        }
    }
}
