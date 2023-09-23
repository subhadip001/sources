package e.i.c;

import android.accounts.AccountManager;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.AppOpsManager;
import android.app.DownloadManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.app.SearchManager;
import android.app.UiModeManager;
import android.app.WallpaperManager;
import android.app.admin.DevicePolicyManager;
import android.app.job.JobScheduler;
import android.app.usage.UsageStatsManager;
import android.appwidget.AppWidgetManager;
import android.bluetooth.BluetoothManager;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.RestrictionsManager;
import android.content.pm.LauncherApps;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.hardware.ConsumerIrManager;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraManager;
import android.hardware.display.DisplayManager;
import android.hardware.input.InputManager;
import android.hardware.usb.UsbManager;
import android.location.LocationManager;
import android.media.AudioManager;
import android.media.MediaRouter;
import android.media.projection.MediaProjectionManager;
import android.media.session.MediaSessionManager;
import android.media.tv.TvInputManager;
import android.net.ConnectivityManager;
import android.net.nsd.NsdManager;
import android.net.wifi.WifiManager;
import android.net.wifi.p2p.WifiP2pManager;
import android.nfc.NfcManager;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Bundle;
import android.os.DropBoxManager;
import android.os.Handler;
import android.os.PowerManager;
import android.os.Process;
import android.os.UserManager;
import android.os.Vibrator;
import android.os.storage.StorageManager;
import android.print.PrintManager;
import android.telecom.TelecomManager;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.CaptioningManager;
import android.view.inputmethod.InputMethodManager;
import android.view.textservice.TextServicesManager;
import androidx.core.app.NotificationCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import e.i.c.d.j;
import java.io.File;
import java.util.HashMap;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* compiled from: ContextCompat.java */
/* loaded from: classes.dex */
public class a {
    private static final String TAG = "ContextCompat";
    private static final Object sLock = new Object();
    private static final Object sSync = new Object();
    private static TypedValue sTempValue;

    /* compiled from: ContextCompat.java */
    /* renamed from: e.i.c.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0042a {
        public static void a(Context context, Intent[] intentArr, Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }

        public static void b(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    /* compiled from: ContextCompat.java */
    /* loaded from: classes.dex */
    public static class b {
        public static File[] a(Context context) {
            return context.getExternalCacheDirs();
        }

        public static File[] b(Context context, String str) {
            return context.getExternalFilesDirs(str);
        }

        public static File[] c(Context context) {
            return context.getObbDirs();
        }
    }

    /* compiled from: ContextCompat.java */
    /* loaded from: classes.dex */
    public static class c {
        public static File a(Context context) {
            return context.getCodeCacheDir();
        }

        public static Drawable b(Context context, int i2) {
            return context.getDrawable(i2);
        }

        public static File c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    /* compiled from: ContextCompat.java */
    /* loaded from: classes.dex */
    public static class d {
        public static int a(Context context, int i2) {
            return context.getColor(i2);
        }

        public static <T> T b(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        public static String c(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    /* compiled from: ContextCompat.java */
    /* loaded from: classes.dex */
    public static class e {
        public static Context a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        public static File b(Context context) {
            return context.getDataDir();
        }

        public static boolean c(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    /* compiled from: ContextCompat.java */
    /* loaded from: classes.dex */
    public static class f {
        public static ComponentName a(Context context, Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    /* compiled from: ContextCompat.java */
    /* loaded from: classes.dex */
    public static class g {
        public static Executor a(Context context) {
            return context.getMainExecutor();
        }
    }

    /* compiled from: ContextCompat.java */
    /* loaded from: classes.dex */
    public static class h {
        public static String a(Context context) {
            return context.getAttributionTag();
        }
    }

    /* compiled from: ContextCompat.java */
    /* loaded from: classes.dex */
    public static final class i {
        public static final HashMap<Class<?>, String> a;

        static {
            HashMap<Class<?>, String> hashMap = new HashMap<>();
            a = hashMap;
            if (Build.VERSION.SDK_INT >= 22) {
                hashMap.put(SubscriptionManager.class, "telephony_subscription_service");
                hashMap.put(UsageStatsManager.class, "usagestats");
            }
            hashMap.put(AppWidgetManager.class, "appwidget");
            hashMap.put(BatteryManager.class, "batterymanager");
            hashMap.put(CameraManager.class, "camera");
            hashMap.put(JobScheduler.class, "jobscheduler");
            hashMap.put(LauncherApps.class, "launcherapps");
            hashMap.put(MediaProjectionManager.class, "media_projection");
            hashMap.put(MediaSessionManager.class, "media_session");
            hashMap.put(RestrictionsManager.class, "restrictions");
            hashMap.put(TelecomManager.class, "telecom");
            hashMap.put(TvInputManager.class, "tv_input");
            hashMap.put(AppOpsManager.class, "appops");
            hashMap.put(CaptioningManager.class, "captioning");
            hashMap.put(ConsumerIrManager.class, "consumer_ir");
            hashMap.put(PrintManager.class, "print");
            hashMap.put(BluetoothManager.class, "bluetooth");
            hashMap.put(DisplayManager.class, Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
            hashMap.put(UserManager.class, "user");
            hashMap.put(InputManager.class, "input");
            hashMap.put(MediaRouter.class, "media_router");
            hashMap.put(NsdManager.class, "servicediscovery");
            hashMap.put(AccessibilityManager.class, "accessibility");
            hashMap.put(AccountManager.class, "account");
            hashMap.put(ActivityManager.class, "activity");
            hashMap.put(AlarmManager.class, NotificationCompat.CATEGORY_ALARM);
            hashMap.put(AudioManager.class, "audio");
            hashMap.put(ClipboardManager.class, "clipboard");
            hashMap.put(ConnectivityManager.class, "connectivity");
            hashMap.put(DevicePolicyManager.class, "device_policy");
            hashMap.put(DownloadManager.class, "download");
            hashMap.put(DropBoxManager.class, "dropbox");
            hashMap.put(InputMethodManager.class, "input_method");
            hashMap.put(KeyguardManager.class, "keyguard");
            hashMap.put(LayoutInflater.class, "layout_inflater");
            hashMap.put(LocationManager.class, FirebaseAnalytics.Param.LOCATION);
            hashMap.put(NfcManager.class, "nfc");
            hashMap.put(NotificationManager.class, "notification");
            hashMap.put(PowerManager.class, "power");
            hashMap.put(SearchManager.class, FirebaseAnalytics.Event.SEARCH);
            hashMap.put(SensorManager.class, "sensor");
            hashMap.put(StorageManager.class, "storage");
            hashMap.put(TelephonyManager.class, "phone");
            hashMap.put(TextServicesManager.class, "textservices");
            hashMap.put(UiModeManager.class, "uimode");
            hashMap.put(UsbManager.class, "usb");
            hashMap.put(Vibrator.class, "vibrator");
            hashMap.put(WallpaperManager.class, "wallpaper");
            hashMap.put(WifiP2pManager.class, "wifip2p");
            hashMap.put(WifiManager.class, "wifi");
            hashMap.put(WindowManager.class, "window");
        }
    }

    public static int checkSelfPermission(Context context, String str) {
        Objects.requireNonNull(str, "permission must be non-null");
        return context.checkPermission(str, Process.myPid(), Process.myUid());
    }

    public static Context createDeviceProtectedStorageContext(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return e.a(context);
        }
        return null;
    }

    private static File createFilesDir(File file) {
        synchronized (sSync) {
            if (!file.exists()) {
                if (file.mkdirs()) {
                    return file;
                }
                Log.w(TAG, "Unable to create files subdir " + file.getPath());
            }
            return file;
        }
    }

    public static String getAttributionTag(Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return h.a(context);
        }
        return null;
    }

    public static File getCodeCacheDir(Context context) {
        return c.a(context);
    }

    public static int getColor(Context context, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return d.a(context, i2);
        }
        return context.getResources().getColor(i2);
    }

    public static ColorStateList getColorStateList(Context context, int i2) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        j.a aVar;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        j.b bVar = new j.b(resources, theme);
        synchronized (j.c) {
            SparseArray<j.a> sparseArray = j.b.get(bVar);
            colorStateList = null;
            if (sparseArray != null && sparseArray.size() > 0 && (aVar = sparseArray.get(i2)) != null) {
                if (aVar.b.equals(bVar.a.getConfiguration())) {
                    colorStateList2 = aVar.a;
                } else {
                    sparseArray.remove(i2);
                }
            }
            colorStateList2 = null;
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        ThreadLocal<TypedValue> threadLocal = j.a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        boolean z = true;
        resources.getValue(i2, typedValue, true);
        int i3 = typedValue.type;
        if (!((i3 < 28 || i3 > 31) ? false : false)) {
            try {
                colorStateList = e.i.c.d.c.a(resources, resources.getXml(i2), theme);
            } catch (Exception e2) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e2);
            }
        }
        if (colorStateList != null) {
            synchronized (j.c) {
                WeakHashMap<j.b, SparseArray<j.a>> weakHashMap = j.b;
                SparseArray<j.a> sparseArray2 = weakHashMap.get(bVar);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray<>();
                    weakHashMap.put(bVar, sparseArray2);
                }
                sparseArray2.append(i2, new j.a(colorStateList, bVar.a.getConfiguration()));
            }
            return colorStateList;
        } else if (Build.VERSION.SDK_INT >= 23) {
            return resources.getColorStateList(i2, theme);
        } else {
            return resources.getColorStateList(i2);
        }
    }

    public static File getDataDir(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return e.b(context);
        }
        String str = context.getApplicationInfo().dataDir;
        if (str != null) {
            return new File(str);
        }
        return null;
    }

    public static Drawable getDrawable(Context context, int i2) {
        return c.b(context, i2);
    }

    public static File[] getExternalCacheDirs(Context context) {
        return b.a(context);
    }

    public static File[] getExternalFilesDirs(Context context, String str) {
        return b.b(context, str);
    }

    public static Executor getMainExecutor(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return g.a(context);
        }
        return new e.i.f.c(new Handler(context.getMainLooper()));
    }

    public static File getNoBackupFilesDir(Context context) {
        return c.c(context);
    }

    public static File[] getObbDirs(Context context) {
        return b.c(context);
    }

    public static <T> T getSystemService(Context context, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 23) {
            return (T) d.b(context, cls);
        }
        String systemServiceName = getSystemServiceName(context, cls);
        if (systemServiceName != null) {
            return (T) context.getSystemService(systemServiceName);
        }
        return null;
    }

    public static String getSystemServiceName(Context context, Class<?> cls) {
        if (Build.VERSION.SDK_INT >= 23) {
            return d.c(context, cls);
        }
        return i.a.get(cls);
    }

    public static boolean isDeviceProtectedStorage(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return e.c(context);
        }
        return false;
    }

    public static boolean startActivities(Context context, Intent[] intentArr) {
        return startActivities(context, intentArr, null);
    }

    public static void startActivity(Context context, Intent intent, Bundle bundle) {
        C0042a.b(context, intent, bundle);
    }

    public static void startForegroundService(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            f.a(context, intent);
        } else {
            context.startService(intent);
        }
    }

    public static boolean startActivities(Context context, Intent[] intentArr, Bundle bundle) {
        C0042a.a(context, intentArr, bundle);
        return true;
    }
}
