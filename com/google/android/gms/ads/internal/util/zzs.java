package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import androidx.core.app.BundleCompat;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.util.SharedPreferencesUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbhq;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzbiw;
import com.google.android.gms.internal.ads.zzbjw;
import com.google.android.gms.internal.ads.zzcai;
import com.google.android.gms.internal.ads.zzcfh;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzcfv;
import com.google.android.gms.internal.ads.zzckz;
import com.google.android.gms.internal.ads.zzcmf;
import com.google.android.gms.internal.ads.zzdtr;
import com.google.android.gms.internal.ads.zzfbg;
import com.google.android.gms.internal.ads.zzfbj;
import com.google.android.gms.internal.ads.zzfnu;
import com.google.android.gms.internal.ads.zzfva;
import com.google.android.gms.internal.ads.zzfvj;
import com.google.android.gms.internal.ads.zzgqi;
import com.google.firebase.crashlytics.internal.settings.DefaultSettingsSpiCall;
import e.d.a.c;
import f.a.b.a.a;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzs {
    public static final zzfnu zza = new zzf(Looper.getMainLooper());
    private String zzf;
    private final AtomicReference zzb = new AtomicReference(null);
    private final AtomicReference zzc = new AtomicReference(null);
    private boolean zzd = true;
    private final Object zze = new Object();
    private boolean zzg = false;
    private boolean zzh = false;
    private final Executor zzi = Executors.newSingleThreadExecutor();

    public static final boolean zzA(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th) {
            zzcfi.zzh("Error loading class.", th);
            com.google.android.gms.ads.internal.zzt.zzo().zzt(th, "AdUtil.isLiteSdk");
            return false;
        }
    }

    public static final boolean zzB() {
        int myUid = Process.myUid();
        return myUid == 0 || myUid == 1000;
    }

    public static final boolean zzC(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        PowerManager powerManager;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    if (runningAppProcessInfo.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode() && (powerManager = (PowerManager) context.getSystemService("power")) != null) {
                        return !powerManager.isScreenOn();
                    }
                    return true;
                }
            }
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    public static final boolean zzD(Context context) {
        Bundle zzT = zzT(context);
        return TextUtils.isEmpty(zzU(zzT)) && !TextUtils.isEmpty(zzT.getString("com.google.android.gms.ads.INTEGRATION_MANAGER"));
    }

    public static final boolean zzE(Context context) {
        Window window;
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null && window.getDecorView() != null) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (rect.bottom != 0 && rect2.bottom != 0 && rect.top == rect2.top) {
                return true;
            }
        }
        return false;
    }

    public static final void zzF(View view, int i2, MotionEvent motionEvent) {
        String str;
        int i3;
        int i4;
        int i5;
        String str2;
        zzfbg zzF;
        zzfbj zzR;
        View view2 = view;
        int[] iArr = new int[2];
        Rect rect = new Rect();
        try {
            String packageName = view.getContext().getPackageName();
            if (view2 instanceof zzdtr) {
                view2 = ((zzdtr) view2).getChildAt(0);
            }
            if ((view2 instanceof com.google.android.gms.ads.formats.zzg) || (view2 instanceof NativeAdView)) {
                str = "NATIVE";
                i3 = 1;
            } else {
                str = "UNKNOWN";
                i3 = 0;
            }
            if (view2.getLocalVisibleRect(rect)) {
                i5 = rect.width();
                i4 = rect.height();
            } else {
                i4 = 0;
                i5 = 0;
            }
            com.google.android.gms.ads.internal.zzt.zzp();
            long zzt = zzt(view2);
            view2.getLocationOnScreen(iArr);
            int i6 = iArr[0];
            int i7 = iArr[1];
            String str3 = "none";
            if (!(view2 instanceof zzcmf) || (zzR = ((zzcmf) view2).zzR()) == null) {
                str2 = "none";
            } else {
                str2 = zzR.zzb;
                int hashCode = view2.hashCode();
                view2.setContentDescription(str2 + ":" + hashCode);
            }
            if ((view2 instanceof zzckz) && (zzF = ((zzckz) view2).zzF()) != null) {
                str = zzfbg.zza(zzF.zzb);
                i3 = zzF.zzf;
                str3 = zzF.zzF;
            }
            zzcfi.zzi(String.format(Locale.US, "<Ad hashCode=%d, package=%s, adNetCls=%s, gwsQueryId=%s, format=%s, impType=%d, class=%s, x=%d, y=%d, width=%d, height=%d, vWidth=%d, vHeight=%d, alpha=%d, state=%s>", Integer.valueOf(view2.hashCode()), packageName, str3, str2, str, Integer.valueOf(i3), view2.getClass().getName(), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(view2.getWidth()), Integer.valueOf(view2.getHeight()), Integer.valueOf(i5), Integer.valueOf(i4), Long.valueOf(zzt), Integer.toString(i2, 2)));
        } catch (Exception e2) {
            zzcfi.zzh("Failure getting view location.", e2);
        }
    }

    public static final void zzG(Context context, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            new zzby(context, str, (String) it.next()).zzb();
        }
    }

    public static final void zzH(Context context, Throwable th) {
        if (context != null) {
            try {
                if (((Boolean) zzbjw.zzb.zze()).booleanValue()) {
                    CrashUtils.addDynamiteErrorToDropBox(context, th);
                }
            } catch (IllegalStateException unused) {
            }
        }
    }

    public static final void zzI(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Throwable unused) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    public static final int zzJ(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e2) {
            zzcfi.zzj("Could not parse value:".concat(e2.toString()));
            return 0;
        }
    }

    public static final Map zzK(Uri uri) {
        if (uri == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str : uri.getQueryParameterNames()) {
            if (!TextUtils.isEmpty(str)) {
                hashMap.put(str, uri.getQueryParameter(str));
            }
        }
        return hashMap;
    }

    public static final WebResourceResponse zzL(HttpURLConnection httpURLConnection) {
        com.google.android.gms.ads.internal.zzt.zzp();
        String contentType = httpURLConnection.getContentType();
        String str = "";
        String trim = TextUtils.isEmpty(contentType) ? "" : contentType.split(";")[0].trim();
        com.google.android.gms.ads.internal.zzt.zzp();
        String contentType2 = httpURLConnection.getContentType();
        if (!TextUtils.isEmpty(contentType2)) {
            String[] split = contentType2.split(";");
            if (split.length != 1) {
                int i2 = 1;
                while (true) {
                    if (i2 >= split.length) {
                        break;
                    }
                    if (split[i2].trim().startsWith("charset")) {
                        String[] split2 = split[i2].trim().split("=");
                        if (split2.length > 1) {
                            str = split2[1].trim();
                            break;
                        }
                    }
                    i2++;
                }
            }
        }
        String str2 = str;
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        HashMap hashMap = new HashMap(headerFields.size());
        for (Map.Entry<String, List<String>> entry : headerFields.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null && entry.getValue().size() > 0) {
                hashMap.put(entry.getKey(), entry.getValue().get(0));
            }
        }
        return com.google.android.gms.ads.internal.zzt.zzq().zzc(trim, str2, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), hashMap, httpURLConnection.getInputStream());
    }

    public static final int[] zzM(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        return (window == null || (findViewById = window.findViewById(16908290)) == null) ? zzs() : new int[]{findViewById.getWidth(), findViewById.getHeight()};
    }

    public static final int[] zzN(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        int[] zzs = (window == null || (findViewById = window.findViewById(16908290)) == null) ? zzs() : new int[]{findViewById.getTop(), findViewById.getBottom()};
        return new int[]{com.google.android.gms.ads.internal.client.zzaw.zzb().zzb(activity, zzs[0]), com.google.android.gms.ads.internal.client.zzaw.zzb().zzb(activity, zzs[1])};
    }

    public static final boolean zzO(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z = com.google.android.gms.ads.internal.zzt.zzp().zzd || keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode() || zzl(view);
        long zzt = zzt(view);
        if (view.getVisibility() == 0 && view.isShown() && ((powerManager == null || powerManager.isScreenOn()) && z)) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzbe)).booleanValue() || view.getLocalVisibleRect(new Rect()) || view.getGlobalVisibleRect(new Rect())) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzhW)).booleanValue()) {
                    return true;
                }
                if (zzt >= ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzhY)).intValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void zzP(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            zzm(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            String uri2 = uri.toString();
            zzcfi.zze("Opening " + uri2 + " in a new browser.");
        } catch (ActivityNotFoundException e2) {
            zzcfi.zzh("No browser is found.", e2);
        }
    }

    public static final int[] zzQ(Activity activity) {
        int[] zzM = zzM(activity);
        return new int[]{com.google.android.gms.ads.internal.client.zzaw.zzb().zzb(activity, zzM[0]), com.google.android.gms.ads.internal.client.zzaw.zzb().zzb(activity, zzM[1])};
    }

    public static final boolean zzR(View view, Context context) {
        Context applicationContext = context.getApplicationContext();
        return zzO(view, applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null, zzS(context));
    }

    private static KeyguardManager zzS(Context context) {
        Object systemService = context.getSystemService("keyguard");
        if (systemService == null || !(systemService instanceof KeyguardManager)) {
            return null;
        }
        return (KeyguardManager) systemService;
    }

    private static Bundle zzT(Context context) {
        try {
            return Wrappers.packageManager(context).getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e2) {
            zze.zzb("Error getting metadata", e2);
            return null;
        }
    }

    private static String zzU(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        String string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
        return TextUtils.isEmpty(string) ? "" : (string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || string.matches("^/\\d+~.+$")) ? string : "";
    }

    private static boolean zzV(String str, AtomicReference atomicReference, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Pattern pattern = (Pattern) atomicReference.get();
            if (pattern == null || !str2.equals(pattern.pattern())) {
                pattern = Pattern.compile(str2);
                atomicReference.set(pattern);
            }
            return pattern.matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    public static int zza(int i2) {
        if (i2 >= 5000) {
            return i2;
        }
        if (i2 > 0) {
            zzcfi.zzj("HTTP timeout too low: " + i2 + " milliseconds. Reverting to default timeout: 60000 milliseconds.");
            return 60000;
        }
        return 60000;
    }

    public static void zzf(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            runnable.run();
        } else {
            zzcfv.zza.execute(runnable);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0016 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean zzl(android.view.View r2) {
        /*
            android.view.View r2 = r2.getRootView()
            r0 = 0
            if (r2 != 0) goto L9
        L7:
            r2 = r0
            goto L13
        L9:
            android.content.Context r2 = r2.getContext()
            boolean r1 = r2 instanceof android.app.Activity
            if (r1 == 0) goto L7
            android.app.Activity r2 = (android.app.Activity) r2
        L13:
            r1 = 0
            if (r2 != 0) goto L17
            return r1
        L17:
            android.view.Window r2 = r2.getWindow()
            if (r2 != 0) goto L1e
            goto L22
        L1e:
            android.view.WindowManager$LayoutParams r0 = r2.getAttributes()
        L22:
            if (r0 == 0) goto L2d
            int r2 = r0.flags
            r0 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L2d
            r2 = 1
            return r2
        L2d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzs.zzl(android.view.View):boolean");
    }

    public static final void zzm(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
        extras.putBinder("android.support.customtabs.extra.SESSION", null);
        extras.putString("com.android.browser.application_id", context.getPackageName());
        intent.putExtras(extras);
    }

    public static final ViewGroup.LayoutParams zzn() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    public static final String zzo(Context context) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        return zzU(zzT(context));
    }

    public static final String zzp() {
        StringBuilder sb = new StringBuilder(256);
        sb.append("Mozilla/5.0 (Linux; U; Android");
        String str = Build.VERSION.RELEASE;
        if (str != null) {
            sb.append(" ");
            sb.append(str);
        }
        sb.append("; ");
        sb.append(Locale.getDefault());
        String str2 = Build.DEVICE;
        if (str2 != null) {
            sb.append("; ");
            sb.append(str2);
            String str3 = Build.DISPLAY;
            if (str3 != null) {
                sb.append(" Build/");
                sb.append(str3);
            }
        }
        sb.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb.toString();
    }

    public static final String zzq() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        return str2.startsWith(str) ? str2 : a.q(str, " ", str2);
    }

    public static final DisplayMetrics zzr(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static final int[] zzs() {
        return new int[]{0, 0};
    }

    public static final long zzt(View view) {
        int i2;
        float f2 = Float.MAX_VALUE;
        ViewParent viewParent = view;
        do {
            if (!(viewParent instanceof View)) {
                break;
            }
            View view2 = viewParent;
            f2 = Math.min(f2, view2.getAlpha());
            i2 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
            viewParent = view2.getParent();
        } while (i2 > 0);
        return Math.round((f2 >= 0.0f ? f2 : 0.0f) * 100.0f);
    }

    public static final WebResourceResponse zzu(Context context, String str, String str2) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put(DefaultSettingsSpiCall.HEADER_USER_AGENT, com.google.android.gms.ads.internal.zzt.zzp().zzc(context, str));
            hashMap.put("Cache-Control", "max-stale=3600");
            String str3 = (String) new zzbo(context).zzb(0, str2, hashMap, null).get(60L, TimeUnit.SECONDS);
            if (str3 != null) {
                return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str3.getBytes("UTF-8")));
            }
        } catch (IOException | InterruptedException | ExecutionException | TimeoutException e2) {
            zzcfi.zzk("Could not fetch MRAID JS.", e2);
        }
        return null;
    }

    public static final String zzv() {
        Resources zzd = com.google.android.gms.ads.internal.zzt.zzo().zzd();
        return zzd != null ? zzd.getString(R.string.s7) : "Test Ad";
    }

    public static final zzbr zzw(Context context) {
        try {
            Object newInstance = context.getClassLoader().loadClass("com.google.android.gms.ads.internal.util.WorkManagerUtil").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (!(newInstance instanceof IBinder)) {
                zzcfi.zzg("Instantiated WorkManagerUtil not instance of IBinder.");
                return null;
            }
            IBinder iBinder = (IBinder) newInstance;
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
            return queryLocalInterface instanceof zzbr ? (zzbr) queryLocalInterface : new zzbp(iBinder);
        } catch (Exception e2) {
            com.google.android.gms.ads.internal.zzt.zzo().zzt(e2, "Failed to instantiate WorkManagerUtil");
            return null;
        }
    }

    public static final boolean zzx(Context context, String str) {
        Context zza2 = zzcai.zza(context);
        return Wrappers.packageManager(zza2).checkPermission(str, zza2.getPackageName()) == 0;
    }

    public static final boolean zzy(String str) {
        if (zzcfh.zzl()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzdW)).booleanValue()) {
                String str2 = (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzdY);
                if (!str2.isEmpty()) {
                    for (String str3 : str2.split(";")) {
                        if (str3.equals(str)) {
                            return false;
                        }
                    }
                }
                String str4 = (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzdX);
                if (str4.isEmpty()) {
                    return true;
                }
                for (String str5 : str4.split(";")) {
                    if (str5.equals(str)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static final boolean zzz(Context context) {
        KeyguardManager zzS;
        return (context == null || (zzS = zzS(context)) == null || !zzS.isKeyguardLocked()) ? false : true;
    }

    public final zzfvj zzb(final Uri uri) {
        return zzfva.zzk(new Callable() { // from class: com.google.android.gms.ads.internal.util.zzl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Uri uri2 = uri;
                zzfnu zzfnuVar = zzs.zza;
                com.google.android.gms.ads.internal.zzt.zzp();
                return zzs.zzK(uri2);
            }
        }, this.zzi);
    }

    public final String zzc(final Context context, String str) {
        String str2;
        synchronized (this.zze) {
            String str3 = this.zzf;
            if (str3 != null) {
                return str3;
            }
            if (str == null) {
                return zzp();
            }
            try {
                zzce zza2 = zzce.zza();
                if (TextUtils.isEmpty(zza2.zza)) {
                    if (ClientLibraryUtils.isPackageSide()) {
                        str2 = (String) zzcb.zza(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.zzcc
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                Context context2 = context;
                                SharedPreferences sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
                                String string = sharedPreferences.getString("user_agent", "");
                                if (TextUtils.isEmpty(string)) {
                                    zze.zza("User agent is not initialized on Google Play Services. Initializing.");
                                    String defaultUserAgent = WebSettings.getDefaultUserAgent(context2);
                                    SharedPreferencesUtils.publishWorldReadableSharedPreferences(context2, sharedPreferences.edit().putString("user_agent", defaultUserAgent), "admob_user_agent");
                                    return defaultUserAgent;
                                }
                                zze.zza("User agent is already initialized on Google Play Services.");
                                return string;
                            }
                        });
                    } else {
                        final Context remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context);
                        str2 = (String) zzcb.zza(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.zzcd
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                SharedPreferences sharedPreferences;
                                Context context2 = remoteContext;
                                Context context3 = context;
                                boolean z = false;
                                if (context2 != null) {
                                    zze.zza("Attempting to read user agent from Google Play Services.");
                                    sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
                                } else {
                                    zze.zza("Attempting to read user agent from local cache.");
                                    sharedPreferences = context3.getSharedPreferences("admob_user_agent", 0);
                                    z = true;
                                }
                                String string = sharedPreferences.getString("user_agent", "");
                                if (TextUtils.isEmpty(string)) {
                                    zze.zza("Reading user agent from WebSettings");
                                    string = WebSettings.getDefaultUserAgent(context3);
                                    if (z) {
                                        sharedPreferences.edit().putString("user_agent", string).apply();
                                        zze.zza("Persisting user agent.");
                                    }
                                }
                                return string;
                            }
                        });
                    }
                    zza2.zza = str2;
                }
                this.zzf = zza2.zza;
            } catch (Exception unused) {
            }
            if (TextUtils.isEmpty(this.zzf)) {
                this.zzf = WebSettings.getDefaultUserAgent(context);
            }
            if (TextUtils.isEmpty(this.zzf)) {
                this.zzf = zzp();
            }
            this.zzf = this.zzf + " (Mobile; " + str;
            try {
                if (Wrappers.packageManager(context).isCallerInstantApp()) {
                    this.zzf = this.zzf + ";aia";
                }
            } catch (Exception e2) {
                com.google.android.gms.ads.internal.zzt.zzo().zzt(e2, "AdUtil.getUserAgent");
            }
            String str4 = this.zzf + ")";
            this.zzf = str4;
            return str4;
        }
    }

    public final void zze(Context context, String str, boolean z, HttpURLConnection httpURLConnection, boolean z2, int i2) {
        int zza2 = zza(i2);
        zzcfi.zzi("HTTP timeout: " + zza2 + " milliseconds.");
        httpURLConnection.setConnectTimeout(zza2);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(zza2);
        httpURLConnection.setRequestProperty(DefaultSettingsSpiCall.HEADER_USER_AGENT, zzc(context, str));
        httpURLConnection.setUseCaches(false);
    }

    public final boolean zzg(String str) {
        return zzV(str, this.zzb, (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzZ));
    }

    public final boolean zzh(String str) {
        return zzV(str, this.zzc, (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzaa));
    }

    public final boolean zzi(Context context) {
        if (this.zzh) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        context.getApplicationContext().registerReceiver(new zzp(this, null), intentFilter);
        this.zzh = true;
        return true;
    }

    public final boolean zzj(Context context) {
        if (this.zzg) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        context.getApplicationContext().registerReceiver(new zzr(this, null), intentFilter);
        this.zzg = true;
        return true;
    }

    public final int zzk(Context context, Uri uri) {
        int i2;
        if (context == null) {
            zze.zza("Trying to open chrome custom tab on a null context");
            return 3;
        }
        if (context instanceof Activity) {
            i2 = 0;
        } else {
            zze.zza("Chrome Custom Tabs can only work with Activity context.");
            i2 = 2;
        }
        zzbhq zzbhqVar = zzbhy.zzdC;
        zzbhq zzbhqVar2 = zzbhy.zzdD;
        if (true == ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhqVar)).equals(com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhqVar2))) {
            i2 = 9;
        }
        if (i2 != 0) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            intent.addFlags(268435456);
            context.startActivity(intent);
            return i2;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhqVar)).booleanValue()) {
            zzbiw zzbiwVar = new zzbiw();
            zzbiwVar.zze(new zzn(this, zzbiwVar, context, uri));
            zzbiwVar.zzb((Activity) context);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhqVar2)).booleanValue()) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            Bundle bundle = new Bundle();
            BundleCompat.putBinder(bundle, "android.support.customtabs.extra.SESSION", null);
            intent2.putExtras(bundle);
            intent2.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
            c cVar = new c(intent2, null);
            cVar.a.setPackage(zzgqi.zza(context));
            cVar.a.setData(uri);
            e.i.c.a.startActivity(context, cVar.a, null);
            return 5;
        }
        return 5;
    }
}
