package f.n.a.u;

import android.app.Activity;
import android.os.Handler;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import f.f.a.f;
import f.h.f.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: RemoteConfigRetriever.java */
/* loaded from: classes2.dex */
public class a {
    public static a c;

    /* renamed from: d  reason: collision with root package name */
    public static HashMap<String, Object> f7080d;

    /* renamed from: e  reason: collision with root package name */
    public static HashMap<Integer, String> f7081e;

    /* renamed from: f  reason: collision with root package name */
    public static Activity f7082f;
    public FirebaseRemoteConfig a;
    public boolean b = false;

    /* compiled from: RemoteConfigRetriever.java */
    /* renamed from: f.n.a.u.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class RunnableC0182a implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ String f7083f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ Handler f7084g;

        /* compiled from: RemoteConfigRetriever.java */
        /* renamed from: f.n.a.u.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class C0183a implements OnCompleteListener<Boolean> {
            public final /* synthetic */ Runnable a;

            public C0183a(Runnable runnable) {
                this.a = runnable;
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public void onComplete(Task<Boolean> task) {
                if (task.isSuccessful()) {
                    RunnableC0182a runnableC0182a = RunnableC0182a.this;
                    if (!a.this.l(runnableC0182a.f7083f)) {
                        FirebaseRemoteConfig firebaseRemoteConfig = a.this.a;
                        if (firebaseRemoteConfig == null ? false : firebaseRemoteConfig.getBoolean("exit_invalid_user")) {
                            a.f7082f.finishAffinity();
                            return;
                        }
                        return;
                    }
                    a.this.a.getBoolean("ad_mediation_enabled");
                } else if (task.isSuccessful()) {
                } else {
                    RunnableC0182a.this.f7084g.postDelayed(this.a, 3000L);
                }
            }
        }

        public RunnableC0182a(String str, Handler handler) {
            this.f7083f = str;
            this.f7084g = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.a.fetchAndActivate().addOnCompleteListener(new C0183a(this));
        }
    }

    /* compiled from: RemoteConfigRetriever.java */
    /* loaded from: classes2.dex */
    public class b extends f.h.c.f.b<List<f>> {
        public b(a aVar) {
        }
    }

    /* compiled from: RemoteConfigRetriever.java */
    /* loaded from: classes2.dex */
    public class c extends f.h.c.f.b<ArrayList<f>> {
        public c(a aVar) {
        }
    }

    public static a e() {
        if (c == null) {
            c = new a();
        }
        return c;
    }

    public boolean a() {
        FirebaseRemoteConfig firebaseRemoteConfig = this.a;
        if (firebaseRemoteConfig == null) {
            return true;
        }
        return firebaseRemoteConfig.getBoolean("can_init_ads");
    }

    public boolean b() {
        FirebaseRemoteConfig firebaseRemoteConfig = this.a;
        if (firebaseRemoteConfig == null) {
            return true;
        }
        return firebaseRemoteConfig.getBoolean("can_show_ad");
    }

    public boolean c() {
        FirebaseRemoteConfig firebaseRemoteConfig = this.a;
        if (firebaseRemoteConfig == null) {
            return false;
        }
        return firebaseRemoteConfig.getBoolean("show_inapp_review");
    }

    public String d(int i2) {
        String str;
        switch (i2) {
            case 222:
                str = "app_id";
                break;
            case 223:
                str = "banner_id";
                break;
            case 224:
                str = "interstitial_id";
                break;
            case 225:
                str = "rewarded_video_id";
                break;
            case 226:
                str = "native_id";
                break;
            default:
                str = "";
                break;
        }
        HashMap<Integer, String> hashMap = f7081e;
        if (hashMap == null) {
            HashMap<Integer, String> hashMap2 = new HashMap<>();
            f7081e = hashMap2;
            hashMap2.put(222, "ca-app-pub-2755363671319607~4351027912");
            f7081e.put(223, "ca-app-pub-2755363671319607/2949675704");
            f7081e.put(224, "ca-app-pub-2755363671319607/5931062261");
            f7081e.put(225, "ca-app-pub-2755363671319607/2379470691");
            f7081e.put(226, "ca-app-pub-2755363671319607/3309408984");
            hashMap = f7081e;
        }
        String str2 = hashMap.get(Integer.valueOf(i2));
        FirebaseRemoteConfig firebaseRemoteConfig = this.a;
        return firebaseRemoteConfig == null ? str2 : firebaseRemoteConfig.getString(str);
    }

    public boolean f() {
        FirebaseRemoteConfig firebaseRemoteConfig = this.a;
        if (firebaseRemoteConfig == null) {
            return false;
        }
        return firebaseRemoteConfig.getBoolean("is_lifetime_offer_active");
    }

    public List<f> g() {
        try {
            FirebaseRemoteConfig firebaseRemoteConfig = this.a;
            String string = firebaseRemoteConfig == null ? "[\n    {\n    \"package_name\": \"com.inverse.photoeditor\",\n    \"title\": \"Photo Editor\",\n    \"icon\": \"https://play-lh.googleusercontent.com/DtlSRroS04F0C5s7POl1ItqKx06hbUdcvKf-BtpfnyDZ4ObDl_UZb1sUw8Fekp1rrgE=s180-rw\",\n    \"priority\": 1,\n    \"download\": \"150k\",\n    \"rating\": \"4.9\"\n   },\n   {\n    \"package_name\": \"com.inverseai.noice_reducer\",\n    \"title\": \"Noise Reducer\",\n    \"icon\": \"https://play-lh.googleusercontent.com/gqkqboofdu63ZOg1HChL0mAq2sspWhECZQQRzqIdHsvj0I-UguI0cQ_2azjvXQCA1TM=w240-h480-rw\",\n    \"priority\": 2,\n    \"download\": \"3M\"\n   },\n   {\n    \"package_name\": \"com.inverseai.audio_video_noise_reducer\",\n    \"title\": \"Noise Reducer V2\",\n    \"icon\": \"https://play-lh.googleusercontent.com/ZuJb09aZ332NEmkeiG2aP6H1K5nhqLZiNteX6SwY6aPS8xyCXFpqPv9FYgiFj08g_3k=w240-h480-rw\",\n    \"priority\": 3,\n    \"download\": \"10K\",\n    \"rating\": \"4.6\"\n    },\n    {\n    \"package_name\": \"com.inverseai.video_converter\",\n    \"title\": \"Video Converter\",\n    \"icon\": \"https://play-lh.googleusercontent.com/vf3Q9vGCFPmdNGA0mPqjoSlXOyzKRPp622-OPG6bAwnv6SWC1UtTFSVovuGaLlqpLTM=s180-rw\",\n    \"priority\": 2,\n    \"download\": \"10M\",\n    \"rating\": \"4.8\"\n  },\n  {\n    \"package_name\": \"com.inverseai.video_editor\",\n    \"title\": \"Video Editor\",\n    \"icon\": \"android_asset/icon_video_editor.webp\",\n    \"priority\": 5,\n    \"rating\": \"4.9\",\n    \"download\":\"100k\"\n  },\n  {\n    \"package_name\": \"com.video_joiner.video_merger\",\n    \"title\": \"Video Merger\",\n    \"icon\": \"android_asset/icon_merger.webp\",\n    \"priority\": 6,\n    \"rating\": \"4.5\",\n    \"download\":\"500k\"\n  },\n  {\n    \"package_name\": \"com.inverseai.image_compressor\",\n    \"title\": \"Compress Image\",\n    \"icon\": \"android_asset/icon_photo_compressor.webp\",\n    \"priority\": 4,\n    \"rating\": \"4.6\",\n    \"download\":\"100k\"\n  }\n]" : firebaseRemoteConfig.getString("promo_apps_list");
            Log.d("RemoteConfig", "getPromoAppsList: show " + string);
            List<f> list = (List) new j().d(string, new b(this).f6010f);
            Log.d("RemoteConfig", "getPromoAppsList: " + new j().h(list));
            return list;
        } catch (Exception e2) {
            StringBuilder A = f.a.b.a.a.A("getPromoAppsList: ");
            A.append(e2.getMessage());
            Log.d("RemoteConfig", A.toString());
            return (List) new j().d("[\n    {\n    \"package_name\": \"com.inverse.photoeditor\",\n    \"title\": \"Photo Editor\",\n    \"icon\": \"https://play-lh.googleusercontent.com/DtlSRroS04F0C5s7POl1ItqKx06hbUdcvKf-BtpfnyDZ4ObDl_UZb1sUw8Fekp1rrgE=s180-rw\",\n    \"priority\": 1,\n    \"download\": \"150k\",\n    \"rating\": \"4.9\"\n   },\n   {\n    \"package_name\": \"com.inverseai.noice_reducer\",\n    \"title\": \"Noise Reducer\",\n    \"icon\": \"https://play-lh.googleusercontent.com/gqkqboofdu63ZOg1HChL0mAq2sspWhECZQQRzqIdHsvj0I-UguI0cQ_2azjvXQCA1TM=w240-h480-rw\",\n    \"priority\": 2,\n    \"download\": \"3M\"\n   },\n   {\n    \"package_name\": \"com.inverseai.audio_video_noise_reducer\",\n    \"title\": \"Noise Reducer V2\",\n    \"icon\": \"https://play-lh.googleusercontent.com/ZuJb09aZ332NEmkeiG2aP6H1K5nhqLZiNteX6SwY6aPS8xyCXFpqPv9FYgiFj08g_3k=w240-h480-rw\",\n    \"priority\": 3,\n    \"download\": \"10K\",\n    \"rating\": \"4.6\"\n    },\n    {\n    \"package_name\": \"com.inverseai.video_converter\",\n    \"title\": \"Video Converter\",\n    \"icon\": \"https://play-lh.googleusercontent.com/vf3Q9vGCFPmdNGA0mPqjoSlXOyzKRPp622-OPG6bAwnv6SWC1UtTFSVovuGaLlqpLTM=s180-rw\",\n    \"priority\": 2,\n    \"download\": \"10M\",\n    \"rating\": \"4.8\"\n  },\n  {\n    \"package_name\": \"com.inverseai.video_editor\",\n    \"title\": \"Video Editor\",\n    \"icon\": \"android_asset/icon_video_editor.webp\",\n    \"priority\": 5,\n    \"rating\": \"4.9\",\n    \"download\":\"100k\"\n  },\n  {\n    \"package_name\": \"com.video_joiner.video_merger\",\n    \"title\": \"Video Merger\",\n    \"icon\": \"android_asset/icon_merger.webp\",\n    \"priority\": 6,\n    \"rating\": \"4.5\",\n    \"download\":\"500k\"\n  },\n  {\n    \"package_name\": \"com.inverseai.image_compressor\",\n    \"title\": \"Compress Image\",\n    \"icon\": \"android_asset/icon_photo_compressor.webp\",\n    \"priority\": 4,\n    \"rating\": \"4.6\",\n    \"download\":\"100k\"\n  }\n]", new c(this).f6010f);
        }
    }

    public boolean h() {
        FirebaseRemoteConfig firebaseRemoteConfig = this.a;
        if (firebaseRemoteConfig == null) {
            return true;
        }
        return firebaseRemoteConfig.getBoolean("show_save_percentage_for_lifetime");
    }

    public boolean i() {
        FirebaseRemoteConfig firebaseRemoteConfig = this.a;
        if (firebaseRemoteConfig == null) {
            return true;
        }
        return firebaseRemoteConfig.getBoolean("show_save_percentage_for_monthly");
    }

    public boolean j() {
        FirebaseRemoteConfig firebaseRemoteConfig = this.a;
        if (firebaseRemoteConfig == null) {
            return true;
        }
        return firebaseRemoteConfig.getBoolean("show_save_percentage_for_yearly");
    }

    public void k(Activity activity) {
        HashMap<String, Object> hashMap;
        f7082f = activity;
        String installerPackageName = activity.getPackageManager().getInstallerPackageName(activity.getPackageName());
        if (this.b) {
            Log.d("RemoteConfig", "initRemote config: Already Initialized exiting");
            FirebaseRemoteConfig firebaseRemoteConfig = this.a;
            if (firebaseRemoteConfig == null ? false : firebaseRemoteConfig.getBoolean("exit_invalid_user")) {
                f7082f.finishAffinity();
                return;
            }
            return;
        }
        Log.d("RemoteConfig", "initRemote config: Initializing remote Config");
        if (FirebaseApp.getApps(f7082f).isEmpty()) {
            FirebaseApp.initializeApp(f7082f);
        }
        this.a = FirebaseRemoteConfig.getInstance();
        this.a.setConfigSettingsAsync(new FirebaseRemoteConfigSettings.Builder().setMinimumFetchIntervalInSeconds(TimeUnit.HOURS.toSeconds(12L)).build());
        FirebaseRemoteConfig firebaseRemoteConfig2 = this.a;
        HashMap<String, Object> hashMap2 = f7080d;
        if (hashMap2 != null && hashMap2.size() > 0) {
            hashMap = f7080d;
        } else {
            HashMap<String, Object> hashMap3 = new HashMap<>();
            f7080d = hashMap3;
            Boolean bool = Boolean.TRUE;
            hashMap3.put("need_emergency_update", bool);
            f7080d.put("interstitial_ad_frequancy", 2);
            f7080d.put("minimum_allowed_version_code", 3);
            f7080d.put("rate_us_frequency", 3);
            f7080d.put("purchase_screen_frequency_new", 3);
            f7080d.put("max_allowed_free_merge", 3);
            f7080d.put("play_rating_enable_min", 5);
            f7080d.put("max_allowed_batch_process", 3);
            f7080d.put("play_store_vendor_name", "[]");
            HashMap<String, Object> hashMap4 = f7080d;
            Boolean bool2 = Boolean.FALSE;
            hashMap4.put("block_invalid_user", bool2);
            f7080d.put("show_inapp_review", bool2);
            f7080d.put("AUDIO_ENCODING_MODE", "INPUT");
            f7080d.put("exit_invalid_user", bool2);
            f7080d.put("ad_mediation_enabled", bool);
            f7080d.put("promo_apps_list", "[\n    {\n    \"package_name\": \"com.inverse.photoeditor\",\n    \"title\": \"Photo Editor\",\n    \"icon\": \"https://play-lh.googleusercontent.com/DtlSRroS04F0C5s7POl1ItqKx06hbUdcvKf-BtpfnyDZ4ObDl_UZb1sUw8Fekp1rrgE=s180-rw\",\n    \"priority\": 1,\n    \"download\": \"150k\",\n    \"rating\": \"4.9\"\n   },\n   {\n    \"package_name\": \"com.inverseai.noice_reducer\",\n    \"title\": \"Noise Reducer\",\n    \"icon\": \"https://play-lh.googleusercontent.com/gqkqboofdu63ZOg1HChL0mAq2sspWhECZQQRzqIdHsvj0I-UguI0cQ_2azjvXQCA1TM=w240-h480-rw\",\n    \"priority\": 2,\n    \"download\": \"3M\"\n   },\n   {\n    \"package_name\": \"com.inverseai.audio_video_noise_reducer\",\n    \"title\": \"Noise Reducer V2\",\n    \"icon\": \"https://play-lh.googleusercontent.com/ZuJb09aZ332NEmkeiG2aP6H1K5nhqLZiNteX6SwY6aPS8xyCXFpqPv9FYgiFj08g_3k=w240-h480-rw\",\n    \"priority\": 3,\n    \"download\": \"10K\",\n    \"rating\": \"4.6\"\n    },\n    {\n    \"package_name\": \"com.inverseai.video_converter\",\n    \"title\": \"Video Converter\",\n    \"icon\": \"https://play-lh.googleusercontent.com/vf3Q9vGCFPmdNGA0mPqjoSlXOyzKRPp622-OPG6bAwnv6SWC1UtTFSVovuGaLlqpLTM=s180-rw\",\n    \"priority\": 2,\n    \"download\": \"10M\",\n    \"rating\": \"4.8\"\n  },\n  {\n    \"package_name\": \"com.inverseai.video_editor\",\n    \"title\": \"Video Editor\",\n    \"icon\": \"android_asset/icon_video_editor.webp\",\n    \"priority\": 5,\n    \"rating\": \"4.9\",\n    \"download\":\"100k\"\n  },\n  {\n    \"package_name\": \"com.video_joiner.video_merger\",\n    \"title\": \"Video Merger\",\n    \"icon\": \"android_asset/icon_merger.webp\",\n    \"priority\": 6,\n    \"rating\": \"4.5\",\n    \"download\":\"500k\"\n  },\n  {\n    \"package_name\": \"com.inverseai.image_compressor\",\n    \"title\": \"Compress Image\",\n    \"icon\": \"android_asset/icon_photo_compressor.webp\",\n    \"priority\": 4,\n    \"rating\": \"4.6\",\n    \"download\":\"100k\"\n  }\n]");
            f7080d.put("show_purchase_screen_frequency", 3);
            f7080d.put("is_lifetime_offer_active", bool2);
            f7080d.put("batch_ad_interval_frequency", 180000);
            f7080d.put("sale_offer_duration", 30);
            f7080d.put("is_sale_offer_running", bool2);
            f7080d.put("show_next_offer_interval", 360);
            f7080d.put("sale_config_version", 1);
            f7080d.put("watch_ad_count_down", 15000);
            f7080d.put("initial_purchase_select_option", "lifetime_premium");
            f7080d.put("splash_screen_time_out", 3000);
            f7080d.put("show_app_open_ad", bool2);
            f7080d.put("show_ad_wait_dialog", bool);
            f7080d.put("show_ad_before_progress_initialized", bool2);
            f7080d.put("disable_banner_ad_in_MFPA", bool2);
            f7080d.put("show_save_percentage_for_lifetime", bool);
            f7080d.put("show_save_percentage_for_yearly", bool);
            f7080d.put("show_save_percentage_for_monthly", bool);
            f7080d.put("can_show_cross_rewarded_ad", bool);
            f7080d.put("can_show_ad", bool);
            f7080d.put("can_load_rewarded_ad", bool);
            f7080d.put("can_init_ads", bool);
            f7080d.put("can_show_rewarded_ad", bool);
            f7080d.put("can_show_banner_ad", bool);
            f7080d.put("can_show_cross_banner_ad", bool);
            f7080d.put("can_load_native_ad", bool);
            f7080d.put("can_show_cross_native_ad", bool);
            f7080d.put("can_show_native_ad", bool);
            f7080d.put("force_show_cross_banner_frequency", 5);
            f7080d.put("force_show_cross_interstitial_frequency", 5);
            f7080d.put("force_show_cross_native_frequency", 5);
            f7080d.put("can_load_interstitial_ad", bool);
            f7080d.put("can_show_interstitial_ad_for_long_process", bool);
            f7080d.put("can_show_cross_interstitial_ad", bool);
            f7080d.put("app_id", "ca-app-pub-2755363671319607~4351027912");
            f7080d.put("banner_id", "ca-app-pub-2755363671319607/2949675704");
            f7080d.put("interstitial_id", "ca-app-pub-2755363671319607/5931062261");
            f7080d.put("rewarded_video_id", "ca-app-pub-2755363671319607/2379470691");
            f7080d.put("native_id", "ca-app-pub-2755363671319607/3309408984");
            hashMap = f7080d;
        }
        firebaseRemoteConfig2.setDefaultsAsync(hashMap);
        this.b = true;
        Handler handler = new Handler();
        handler.post(new RunnableC0182a(installerPackageName, handler));
    }

    public boolean l(String str) {
        if (str == null) {
            return false;
        }
        FirebaseRemoteConfig firebaseRemoteConfig = this.a;
        String string = firebaseRemoteConfig == null ? "[]" : firebaseRemoteConfig.getString("play_store_vendor_name");
        if (string == null) {
            return true;
        }
        try {
            List<String> list = (List) new j().c(string, List.class);
            if (list != null && !list.isEmpty()) {
                for (String str2 : list) {
                    if (str2.toLowerCase().startsWith(str.toLowerCase())) {
                        return true;
                    }
                }
                return false;
            }
        } catch (Exception unused) {
        }
        return true;
    }
}
