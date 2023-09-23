package com.google.android.gms.internal.ads;

import com.google.firebase.crashlytics.internal.common.CrashlyticsReportDataCapture;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzajy {
    public static long zza(String str) {
        try {
            return zzd("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (ParseException e2) {
            if (!CrashlyticsReportDataCapture.SIGNAL_DEFAULT.equals(str) && !"-1".equals(str)) {
                zzajn.zzc(e2, "Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            zzajn.zzd("Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    public static zzaik zzb(zzaix zzaixVar) {
        boolean z;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long currentTimeMillis = System.currentTimeMillis();
        Map map = zzaixVar.zzc;
        if (map == null) {
            return null;
        }
        String str = (String) map.get("Date");
        long zza = str != null ? zza(str) : 0L;
        String str2 = (String) map.get("Cache-Control");
        int i2 = 0;
        if (str2 != null) {
            String[] split = str2.split(",", 0);
            int i3 = 0;
            j2 = 0;
            j3 = 0;
            while (i2 < split.length) {
                String trim = split[i2].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j2 = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j3 = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    i3 = 1;
                }
                i2++;
            }
            i2 = i3;
            z = true;
        } else {
            z = false;
            j2 = 0;
            j3 = 0;
        }
        String str3 = (String) map.get("Expires");
        long zza2 = str3 != null ? zza(str3) : 0L;
        String str4 = (String) map.get("Last-Modified");
        long zza3 = str4 != null ? zza(str4) : 0L;
        String str5 = (String) map.get("ETag");
        if (z) {
            j5 = currentTimeMillis + (j2 * 1000);
            if (i2 != 0) {
                j6 = j5;
            } else {
                Long.signum(j3);
                j6 = (j3 * 1000) + j5;
            }
            j4 = j6;
        } else {
            j4 = 0;
            if (zza <= 0 || zza2 < zza) {
                j5 = 0;
            } else {
                j5 = currentTimeMillis + (zza2 - zza);
                j4 = j5;
            }
        }
        zzaik zzaikVar = new zzaik();
        zzaikVar.zza = zzaixVar.zzb;
        zzaikVar.zzb = str5;
        zzaikVar.zzf = j5;
        zzaikVar.zze = j4;
        zzaikVar.zzc = zza;
        zzaikVar.zzd = zza3;
        zzaikVar.zzg = map;
        zzaikVar.zzh = zzaixVar.zzd;
        return zzaikVar;
    }

    public static String zzc(long j2) {
        return zzd("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j2));
    }

    private static SimpleDateFormat zzd(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}
