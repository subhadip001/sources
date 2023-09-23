package f.n.a.c;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.inverseai.adhelper.util.AdType;
import java.util.Map;
import java.util.Objects;

/* compiled from: AdUtils.kt */
/* loaded from: classes2.dex */
public final class e {
    public static boolean a;
    public static SharedPreferences b;

    public static final void a() {
        try {
            InitializationStatus initializationStatus = MobileAds.getInitializationStatus();
            if (initializationStatus == null) {
                return;
            }
            a = true;
            Map<String, AdapterStatus> adapterStatusMap = initializationStatus.getAdapterStatusMap();
            i.l.b.i.d(adapterStatusMap, "initializationStatus.adapterStatusMap");
            for (Map.Entry<String, AdapterStatus> entry : adapterStatusMap.entrySet()) {
                a = a && i.l.b.i.a("READY", entry.getValue().getInitializationState().name());
            }
        } catch (IllegalStateException unused) {
        }
    }

    public static final boolean b(Context context, AdType adType) {
        i.l.b.i.e(context, "context");
        i.l.b.i.e(adType, "adType");
        i.l.b.i.e(context, "context");
        if (m.b.a.j.f.c(context) && c(adType) != -1) {
            if (d(context).getInt(adType.name(), c(adType)) == 0) {
                return true;
            }
        }
        return false;
    }

    public static final int c(AdType adType) {
        long j2;
        int ordinal = adType.ordinal();
        int i2 = 5;
        if (ordinal == 0) {
            FirebaseRemoteConfig firebaseRemoteConfig = f.n.a.u.a.e().a;
            if (firebaseRemoteConfig != null) {
                j2 = firebaseRemoteConfig.getLong("force_show_cross_banner_frequency");
                i2 = (int) j2;
            }
            return i2;
        } else if (ordinal == 1) {
            FirebaseRemoteConfig firebaseRemoteConfig2 = f.n.a.u.a.e().a;
            if (firebaseRemoteConfig2 != null) {
                j2 = firebaseRemoteConfig2.getLong("force_show_cross_interstitial_frequency");
                i2 = (int) j2;
            }
            return i2;
        } else if (ordinal != 2) {
            return 10;
        } else {
            FirebaseRemoteConfig firebaseRemoteConfig3 = f.n.a.u.a.e().a;
            if (firebaseRemoteConfig3 != null) {
                j2 = firebaseRemoteConfig3.getLong("force_show_cross_native_frequency");
                i2 = (int) j2;
            }
            return i2;
        }
    }

    public static final SharedPreferences d(Context context) {
        if (b == null) {
            b = context.getSharedPreferences("ad_settings", 0);
        }
        SharedPreferences sharedPreferences = b;
        i.l.b.i.b(sharedPreferences);
        return sharedPreferences;
    }

    public static final boolean e(Context context) {
        i.l.b.i.e(context, "context");
        Object systemService = context.getSystemService("connectivity");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    public static final void f(Context context, AdType adType) {
        i.l.b.i.e(context, "context");
        i.l.b.i.e(adType, "adType");
        SharedPreferences d2 = d(context);
        int i2 = d2.getInt(adType.name(), c(adType)) - 1;
        if (i2 < 0) {
            i2 = 0;
        }
        d2.edit().putInt(adType.name(), i2).apply();
    }

    public static final void g(Context context, AdType adType) {
        i.l.b.i.e(context, "context");
        i.l.b.i.e(adType, "adType");
        d(context).edit().putInt(adType.name(), c(adType)).apply();
    }
}
