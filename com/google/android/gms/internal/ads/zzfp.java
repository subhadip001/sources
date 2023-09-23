package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Log;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfp {
    private static final Pattern zza = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");
    private static final Pattern zzb = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    public static long zza(String str, String str2) {
        long j2 = -1;
        if (!TextUtils.isEmpty(str)) {
            try {
                j2 = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                Log.e("HttpUtil", "Unexpected Content-Length [" + str + "]");
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return j2;
        }
        Matcher matcher = zza.matcher(str2);
        if (matcher.matches()) {
            try {
                String group = matcher.group(2);
                Objects.requireNonNull(group);
                long parseLong = Long.parseLong(group);
                String group2 = matcher.group(1);
                Objects.requireNonNull(group2);
                long parseLong2 = (parseLong - Long.parseLong(group2)) + 1;
                if (j2 < 0) {
                    return parseLong2;
                }
                if (j2 != parseLong2) {
                    Log.w("HttpUtil", "Inconsistent headers [" + str + "] [" + str2 + "]");
                    return Math.max(j2, parseLong2);
                }
                return j2;
            } catch (NumberFormatException unused2) {
                Log.e("HttpUtil", "Unexpected Content-Range [" + str2 + "]");
                return j2;
            }
        }
        return j2;
    }

    public static long zzb(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = zzb.matcher(str);
        if (matcher.matches()) {
            String group = matcher.group(1);
            Objects.requireNonNull(group);
            return Long.parseLong(group);
        }
        return -1L;
    }
}
