package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.arthenica.ffmpegkit.Chapter;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.search.SearchAdView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.VisibleForTesting;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcfb {
    public static final Handler zza = new zzfnu(Looper.getMainLooper());
    private static final String zzb = AdView.class.getName();
    private static final String zzc = InterstitialAd.class.getName();
    private static final String zzd = AdManagerAdView.class.getName();
    private static final String zze = AdManagerInterstitialAd.class.getName();
    private static final String zzf = SearchAdView.class.getName();
    private static final String zzg = AdLoader.class.getName();
    private float zzh = -1.0f;

    private static final void zzA(ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzq zzqVar, String str, int i2, int i3) {
        if (viewGroup.getChildCount() != 0) {
            return;
        }
        Context context = viewGroup.getContext();
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setText(str);
        textView.setTextColor(i2);
        textView.setBackgroundColor(i3);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(i2);
        int zzv = zzv(context, 3);
        frameLayout.addView(textView, new FrameLayout.LayoutParams(zzqVar.zzf - zzv, zzqVar.zzc - zzv, 17));
        viewGroup.addView(frameLayout, zzqVar.zzf, zzqVar.zzc);
    }

    public static int zza(Context context, int i2) {
        DisplayMetrics displayMetrics;
        Configuration configuration;
        if (context == null) {
            return -1;
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        Resources resources = context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null || (configuration = resources.getConfiguration()) == null) {
            return -1;
        }
        int i3 = configuration.orientation;
        if (i2 == 0) {
            i2 = i3;
        }
        if (i2 == i3) {
            return Math.round(displayMetrics.heightPixels / displayMetrics.density);
        }
        return Math.round(displayMetrics.widthPixels / displayMetrics.density);
    }

    public static AdSize zzc(Context context, int i2, int i3, int i4) {
        int round;
        int zza2 = zza(context, i4);
        if (zza2 == -1) {
            return AdSize.INVALID;
        }
        int min = Math.min(90, Math.round(zza2 * 0.15f));
        if (i2 > 655) {
            round = Math.round((i2 / 728.0f) * 90.0f);
        } else if (i2 > 632) {
            round = 81;
        } else if (i2 > 526) {
            round = Math.round((i2 / 468.0f) * 60.0f);
        } else {
            round = i2 > 432 ? 68 : Math.round((i2 / 320.0f) * 50.0f);
        }
        return new AdSize(i2, Math.max(Math.min(round, min), 50));
    }

    public static String zzd() {
        UUID randomUUID = UUID.randomUUID();
        byte[] byteArray = BigInteger.valueOf(randomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = BigInteger.valueOf(randomUUID.getMostSignificantBits()).toByteArray();
        String bigInteger = new BigInteger(1, byteArray).toString();
        for (int i2 = 0; i2 < 2; i2++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(byteArray);
                messageDigest.update(byteArray2);
                byte[] bArr = new byte[8];
                System.arraycopy(messageDigest.digest(), 0, bArr, 0, 8);
                bigInteger = new BigInteger(1, bArr).toString();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return bigInteger;
    }

    public static String zze(String str) {
        for (int i2 = 0; i2 < 2; i2++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(str.getBytes());
                return String.format(Locale.US, "%032X", new BigInteger(1, messageDigest.digest()));
            } catch (ArithmeticException unused) {
                return null;
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        return null;
    }

    public static Throwable zzf(Throwable th) {
        if (((Boolean) zzbjw.zzf.zze()).booleanValue()) {
            return th;
        }
        LinkedList linkedList = new LinkedList();
        while (th != null) {
            linkedList.push(th);
            th = th.getCause();
        }
        Throwable th2 = null;
        while (!linkedList.isEmpty()) {
            Throwable th3 = (Throwable) linkedList.pop();
            StackTraceElement[] stackTrace = th3.getStackTrace();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new StackTraceElement(th3.getClass().getName(), "<filtered>", "<filtered>", 1));
            boolean z = false;
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (zzm(stackTraceElement.getClassName())) {
                    arrayList.add(stackTraceElement);
                    z = true;
                } else {
                    String className = stackTraceElement.getClassName();
                    if (TextUtils.isEmpty(className) || (!className.startsWith("android.") && !className.startsWith("java."))) {
                        arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                    } else {
                        arrayList.add(stackTraceElement);
                    }
                }
            }
            if (z) {
                if (th2 == null) {
                    th2 = new Throwable(th3.getMessage());
                } else {
                    th2 = new Throwable(th3.getMessage(), th2);
                }
                th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
            }
        }
        return th2;
    }

    @VisibleForTesting
    public static boolean zzm(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith((String) zzbjw.zzd.zze());
    }

    public static final int zzn(DisplayMetrics displayMetrics, int i2) {
        return (int) TypedValue.applyDimension(1, i2, displayMetrics);
    }

    @VisibleForTesting
    public static final String zzo(StackTraceElement[] stackTraceElementArr, String str) {
        int i2;
        int i3;
        String str2;
        while (true) {
            i3 = i2 + 1;
            if (i3 >= stackTraceElementArr.length) {
                str2 = null;
                break;
            }
            StackTraceElement stackTraceElement = stackTraceElementArr[i2];
            String className = stackTraceElement.getClassName();
            i2 = ("loadAd".equalsIgnoreCase(stackTraceElement.getMethodName()) && (zzb.equalsIgnoreCase(className) || zzc.equalsIgnoreCase(className) || zzd.equalsIgnoreCase(className) || zze.equalsIgnoreCase(className) || zzf.equalsIgnoreCase(className) || zzg.equalsIgnoreCase(className))) ? 0 : i3;
        }
        str2 = stackTraceElementArr[i3].getClassName();
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            StringBuilder sb = new StringBuilder();
            if (stringTokenizer.hasMoreElements()) {
                sb.append(stringTokenizer.nextToken());
                int i4 = 2;
                while (true) {
                    int i5 = i4 - 1;
                    if (i4 <= 0 || !stringTokenizer.hasMoreElements()) {
                        break;
                    }
                    sb.append(".");
                    sb.append(stringTokenizer.nextToken());
                    i4 = i5;
                }
                str = sb.toString();
            }
            if (str2 != null && !str2.contains(str)) {
                return str2;
            }
        }
        return null;
    }

    public static final boolean zzp() {
        if (Build.VERSION.SDK_INT >= 31) {
            String str = Build.FINGERPRINT;
            return str.contains("generic") || str.contains("emulator");
        }
        return Build.DEVICE.startsWith("generic");
    }

    public static final boolean zzq(Context context, int i2) {
        return GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, i2) == 0;
    }

    public static final boolean zzr(Context context) {
        int isGooglePlayServicesAvailable = GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
        return isGooglePlayServicesAvailable == 0 || isGooglePlayServicesAvailable == 2;
    }

    public static final boolean zzs() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static final int zzt(DisplayMetrics displayMetrics, int i2) {
        return Math.round(i2 / displayMetrics.density);
    }

    public static final void zzu(Context context, String str, String str2, Bundle bundle, boolean z, zzcfa zzcfaVar) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        bundle.putString("os", Build.VERSION.RELEASE);
        bundle.putString("api", String.valueOf(Build.VERSION.SDK_INT));
        bundle.putString("appid", applicationContext.getPackageName());
        if (str == null) {
            str = GoogleApiAvailabilityLight.getInstance().getApkVersion(context) + ".221310000";
        }
        bundle.putString("js", str);
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter(Chapter.KEY_ID, "gmob-apps");
        for (String str3 : bundle.keySet()) {
            appendQueryParameter.appendQueryParameter(str3, bundle.getString(str3));
        }
        zzcfaVar.zza(appendQueryParameter.toString());
    }

    public static final int zzv(Context context, int i2) {
        return zzn(context.getResources().getDisplayMetrics(), i2);
    }

    public static final String zzw(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        return zze(((contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id")) == null || zzp()) ? "emulator" : "emulator");
    }

    private final JSONArray zzx(Collection collection) {
        JSONArray jSONArray = new JSONArray();
        for (Object obj : collection) {
            zzy(jSONArray, obj);
        }
        return jSONArray;
    }

    private final void zzy(JSONArray jSONArray, Object obj) {
        if (obj instanceof Bundle) {
            jSONArray.put(zzg((Bundle) obj));
        } else if (obj instanceof Map) {
            jSONArray.put(zzh((Map) obj));
        } else if (obj instanceof Collection) {
            jSONArray.put(zzx((Collection) obj));
        } else if (obj instanceof Object[]) {
            JSONArray jSONArray2 = new JSONArray();
            for (Object obj2 : (Object[]) obj) {
                zzy(jSONArray2, obj2);
            }
            jSONArray.put(jSONArray2);
        } else {
            jSONArray.put(obj);
        }
    }

    private final void zzz(JSONObject jSONObject, String str, Object obj) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzr)).booleanValue()) {
            str = String.valueOf(str);
        }
        if (obj instanceof Bundle) {
            jSONObject.put(str, zzg((Bundle) obj));
        } else if (obj instanceof Map) {
            jSONObject.put(str, zzh((Map) obj));
        } else if (obj instanceof Collection) {
            jSONObject.put(String.valueOf(str), zzx((Collection) obj));
        } else if (obj instanceof Object[]) {
            jSONObject.put(str, zzx(Arrays.asList((Object[]) obj)));
        } else {
            jSONObject.put(str, obj);
        }
    }

    public final int zzb(Context context, int i2) {
        if (this.zzh < 0.0f) {
            synchronized (this) {
                if (this.zzh < 0.0f) {
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (windowManager == null) {
                        return 0;
                    }
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    defaultDisplay.getMetrics(displayMetrics);
                    this.zzh = displayMetrics.density;
                }
            }
        }
        return Math.round(i2 / this.zzh);
    }

    public final JSONObject zzg(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            zzz(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    public final JSONObject zzh(Map map) {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                zzz(jSONObject, str, map.get(str));
            }
            return jSONObject;
        } catch (ClassCastException e2) {
            throw new JSONException("Could not convert map to JSON: ".concat(String.valueOf(e2.getMessage())));
        }
    }

    public final JSONObject zzi(Bundle bundle, JSONObject jSONObject) {
        if (bundle != null) {
            try {
                return zzg(bundle);
            } catch (JSONException e2) {
                zzcfi.zzh("Error converting Bundle to JSON", e2);
                return null;
            }
        }
        return null;
    }

    public final void zzj(ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzq zzqVar, String str, String str2) {
        if (str2 != null) {
            zzcfi.zzj(str2);
        }
        zzA(viewGroup, zzqVar, str, -65536, -16777216);
    }

    public final void zzk(ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzq zzqVar, String str) {
        zzA(viewGroup, zzqVar, "Ads by Google", -16777216, -1);
    }

    public final void zzl(Context context, String str, String str2, Bundle bundle, boolean z) {
        zzu(context, str, "gmob-apps", bundle, true, new zzcfa() { // from class: com.google.android.gms.internal.ads.zzcey
            @Override // com.google.android.gms.internal.ads.zzcfa
            public final boolean zza(String str3) {
                new zzcez(zzcfb.this, str3).start();
                return true;
            }
        });
    }
}
