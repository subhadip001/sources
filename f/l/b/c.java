package f.l.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.widget.Toast;
import com.video_converter.video_compressor.R;
import com.video_converter.video_compressor.constants.Codec;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public final class c {
    public static String a(long j2) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss.SSS");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(Long.valueOf(j2));
    }

    public static <T> T b(Context context, Class<T> cls, String str) {
        if (cls.isInstance(new String())) {
            return cls.cast(context.getSharedPreferences("video_compressor_shared_pref", 0).getString(str, null));
        }
        if (cls.isInstance(new Integer(0))) {
            return cls.cast(Integer.valueOf(context.getSharedPreferences("video_compressor_shared_pref", 0).getInt(str, 0)));
        }
        return cls.cast(Boolean.valueOf(context.getSharedPreferences("video_compressor_shared_pref", 0).getBoolean(str, false)));
    }

    public static String c(long j2, float f2, float f3) {
        double d2 = j2 * 1.0d;
        Date date = new Date(((long) (d2 * (f3 / 100.0f))) - ((long) ((f2 / 100.0f) * d2)));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss.SSS", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(date);
    }

    public static long d(long j2, float f2, float f3) {
        double d2 = j2 * 1.0d;
        return (j2 - ((long) (d2 * (f3 / 100.0f)))) + ((long) ((f2 / 100.0f) * d2));
    }

    public static long e(long j2, float f2) {
        return (f2 / 100.0f) * ((float) j2);
    }

    public static String f(String str, String str2) {
        return f.a.b.a.a.w(new StringBuilder(), f.n.a.i.b.a, str, ".", str2);
    }

    public static String g(long j2, float f2) {
        Date date = new Date((long) (j2 * 1.0d * (f2 / 100.0f)));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss.SSS", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(date);
    }

    public static String h(String str) {
        char[] charArray;
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c != '\"' && c != '*' && c != '/' && c != ':' && c != '<' && c != '\\' && c != '|' && c != 127 && c != '>' && c != '?') {
                sb.append(c);
            } else {
                sb.append("_");
            }
        }
        return sb.toString();
    }

    public static boolean i(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT > 28) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities == null) {
                return false;
            }
            if (networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(3)) {
                return true;
            }
        } else {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    if (activeNetworkInfo.getType() == 1) {
                        return true;
                    }
                    return activeNetworkInfo.getType() == 0;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return false;
    }

    public static <T> void j(Context context, Class<T> cls, String str, T t) {
        if (cls.isInstance(new String())) {
            l(context, str, String.valueOf(t));
        } else if (cls.isInstance(new Integer(0))) {
            k(context, str, Integer.valueOf(String.valueOf(t)).intValue());
        } else {
            boolean booleanValue = Boolean.valueOf(String.valueOf(t)).booleanValue();
            SharedPreferences.Editor edit = context.getSharedPreferences("video_compressor_shared_pref", 0).edit();
            edit.putBoolean(str, booleanValue);
            edit.commit();
        }
    }

    public static void k(Context context, String str, int i2) {
        SharedPreferences.Editor edit = context.getSharedPreferences("video_compressor_shared_pref", 0).edit();
        edit.putInt(str, i2);
        edit.commit();
    }

    public static void l(Context context, String str, String str2) {
        SharedPreferences.Editor edit = context.getSharedPreferences("video_compressor_shared_pref", 0).edit();
        edit.putString(str, str2);
        edit.commit();
    }

    public static Codec m(String str) {
        if (str == null) {
            return Codec.UNKNOWN;
        }
        String lowerCase = str.toLowerCase();
        lowerCase.hashCode();
        char c = 65535;
        switch (lowerCase.hashCode()) {
            case 3148040:
                if (lowerCase.equals("h264")) {
                    c = 0;
                    break;
                }
                break;
            case 3148041:
                if (lowerCase.equals("h265")) {
                    c = 1;
                    break;
                }
                break;
            case 3624696:
                if (lowerCase.equals("x264")) {
                    c = 2;
                    break;
                }
                break;
            case 3624697:
                if (lowerCase.equals("x265")) {
                    c = 3;
                    break;
                }
                break;
            case 166340349:
                if (lowerCase.equals("libx264")) {
                    c = 4;
                    break;
                }
                break;
            case 166340350:
                if (lowerCase.equals("libx265")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return Codec.H264;
            case 1:
                return Codec.H265;
            case 2:
                return Codec.X264;
            case 3:
                return Codec.X265;
            case 4:
                return Codec.LIBX264;
            case 5:
                return Codec.LIBX265;
            default:
                return Codec.UNKNOWN;
        }
    }

    public static void n(Context context) {
        Toast.makeText(context, context.getResources().getString(R.string.something_went_wrong), 0).show();
    }
}
