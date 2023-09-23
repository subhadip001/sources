package f.n.a.v.h;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Html;
import android.util.Log;
import android.widget.ImageButton;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.ariful.sale.banner.BannerTemplate;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.video_converter.video_compressor.R;
import com.video_converter.video_compressor.adControllers.AdLoader;
import com.video_converter.video_compressor.processorFactory.ProcessorType;
import com.video_converter.video_compressor.screens.common.AdEvent;
import com.video_converter.video_compressor.screens.homeScreen.HomeScreenActivity;
import com.video_converter.video_compressor.screens.newFilePicker.MediaPickerActivity;
import com.video_converter.video_compressor.screens.outputScreen.OutputsActivity;
import com.video_converter.video_compressor.screens.settings.SettingActivity;
import e.b.c.m;
import e.p.c.n;
import f.h.b.d.a.i.p;
import f.n.a.n.f;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Random;

/* compiled from: HomeScreenController.java */
/* loaded from: classes2.dex */
public class e implements f.n.a.v.h.d {
    public j a;
    public n b;
    public f.n.a.n.d c;

    /* renamed from: d  reason: collision with root package name */
    public f.n.a.v.g.d f7206d;

    /* renamed from: e  reason: collision with root package name */
    public f.n.a.v.g.b f7207e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f7208f;

    /* renamed from: g  reason: collision with root package name */
    public AlertDialog f7209g;

    /* renamed from: h  reason: collision with root package name */
    public f.n.a.k.a f7210h;

    /* renamed from: l  reason: collision with root package name */
    public AdLoader f7214l;

    /* renamed from: m  reason: collision with root package name */
    public f.n.a.n.c f7215m;

    /* renamed from: i  reason: collision with root package name */
    public boolean f7211i = true;

    /* renamed from: j  reason: collision with root package name */
    public boolean f7212j = false;

    /* renamed from: k  reason: collision with root package name */
    public Handler f7213k = new Handler(Looper.getMainLooper());
    public Random n = new Random();

    /* compiled from: HomeScreenController.java */
    /* loaded from: classes2.dex */
    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            e.this.b.finish();
        }
    }

    /* compiled from: HomeScreenController.java */
    /* loaded from: classes2.dex */
    public class b implements f.c {
        public b() {
        }

        @Override // f.n.a.n.f.c
        public void a() {
            e.this.b.recreate();
        }
    }

    /* compiled from: HomeScreenController.java */
    /* loaded from: classes2.dex */
    public class c implements DialogInterface.OnClickListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            e.this.b.finish();
        }
    }

    /* compiled from: HomeScreenController.java */
    /* loaded from: classes2.dex */
    public class d implements DialogInterface.OnClickListener {
        public d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            n nVar = e.this.b;
            f.n.a.v.a.j.t(nVar, nVar.getPackageName(), true);
        }
    }

    /* compiled from: HomeScreenController.java */
    /* renamed from: f.n.a.v.h.e$e  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class DialogInterface$OnClickListenerC0189e implements DialogInterface.OnClickListener {

        /* compiled from: HomeScreenController.java */
        /* renamed from: f.n.a.v.h.e$e$a */
        /* loaded from: classes2.dex */
        public class a implements f.h.b.d.a.i.c<f.h.b.d.a.a.a> {
            public final /* synthetic */ DialogInterface a;
            public final /* synthetic */ f.h.b.d.a.a.b b;

            public a(DialogInterface dialogInterface, f.h.b.d.a.a.b bVar) {
                this.a = dialogInterface;
                this.b = bVar;
            }

            @Override // f.h.b.d.a.i.c
            public void onSuccess(f.h.b.d.a.a.a aVar) {
                f.h.b.d.a.a.a aVar2 = aVar;
                this.a.dismiss();
                Log.d("HomeScreenController", "onSuccess: updateAvailability " + aVar2.a);
                int i2 = aVar2.a;
                if (i2 == 2 && i2 != 3) {
                    e eVar = e.this;
                    eVar.f7211i = true;
                    try {
                        this.b.b(aVar2, 1, eVar.b, 112);
                        return;
                    } catch (IntentSender.SendIntentException e2) {
                        e2.printStackTrace();
                        return;
                    }
                }
                e.this.f7211i = false;
            }
        }

        public DialogInterface$OnClickListenerC0189e() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            f.h.b.d.a.a.d dVar;
            Context context = e.this.b;
            synchronized (f.h.b.c.a.class) {
                if (f.h.b.c.a.a == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    f.h.b.d.a.a.i iVar = new f.h.b.d.a.a.i(context);
                    f.h.b.c.a.n1(iVar, f.h.b.d.a.a.i.class);
                    f.h.b.c.a.a = new f.h.b.d.a.a.d(iVar);
                }
                dVar = f.h.b.c.a.a;
            }
            f.h.b.d.a.a.b bVar = (f.h.b.d.a.a.b) dVar.f5546f.zza();
            p<f.h.b.d.a.a.a> a2 = bVar.a();
            a aVar = new a(dialogInterface, bVar);
            Objects.requireNonNull(a2);
            a2.b(f.h.b.d.a.i.d.a, aVar);
        }
    }

    /* compiled from: HomeScreenController.java */
    /* loaded from: classes2.dex */
    public class f implements f.c.a.a.j {
        public final /* synthetic */ f.c.a.a.h a;

        public f(f.c.a.a.h hVar) {
            this.a = hVar;
        }

        @Override // f.c.a.a.j
        public void a(BannerTemplate bannerTemplate, f.c.a.a.h hVar) {
            FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(e.this.b);
            f.a.b.a.a.M(firebaseAnalytics, bannerTemplate.toString().toLowerCase(Locale.US) + "_" + this.a.f3111f);
        }

        @Override // f.c.a.a.j
        public void b(f.c.a.a.h hVar) {
            e.this.f7210h.i(hVar, "sale_banner");
            Log.d("HomeScreenController", "onBannerClicked: ");
        }

        @Override // f.c.a.a.j
        public void c(f.c.a.a.h hVar) {
            e eVar = e.this;
            Objects.requireNonNull(eVar);
            try {
                Fragment I = eVar.b.H().I("saleBanner");
                if (I != null) {
                    e.p.c.a aVar = new e.p.c.a(eVar.b.H());
                    aVar.q(I);
                    aVar.e();
                }
            } catch (Exception unused) {
            }
        }

        @Override // f.c.a.a.j
        public void d(f.c.a.a.h hVar, int i2) {
            f.l.b.c.j(e.this.b, Integer.class, hVar.f3111f, Integer.valueOf(i2));
        }
    }

    /* compiled from: HomeScreenController.java */
    /* loaded from: classes2.dex */
    public class g implements DialogInterface.OnClickListener {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ String f7220f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ String f7221g;

        public g(String str, String str2) {
            this.f7220f = str;
            this.f7221g = str2;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            HashMap hashMap = new HashMap();
            hashMap.put("installer", this.f7220f);
            hashMap.put("package", this.f7221g);
            try {
                FirebaseDatabase.getInstance().getReference("invalid_installer").setValue(hashMap);
            } catch (Exception unused) {
            }
            e eVar = e.this;
            String str = this.f7220f;
            String str2 = this.f7221g;
            Objects.requireNonNull(eVar);
            String q = f.a.b.a.a.q("InstallerName: " + str, "\n<br>PackageName: ", str2);
            n nVar = eVar.b;
            Intent intent = new Intent("android.intent.action.SENDTO");
            StringBuilder A = f.a.b.a.a.A("mailto:support@inverseai.com?subject=VideoCompressor Invalid User&body=");
            A.append(Uri.encode(q));
            intent.setData(Uri.parse(A.toString()));
            nVar.startActivity(intent);
        }
    }

    /* compiled from: HomeScreenController.java */
    /* loaded from: classes2.dex */
    public class h implements DialogInterface.OnClickListener {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ String f7223f;

        public h(String str) {
            this.f7223f = str;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            f.n.a.v.a.j.t(e.this.b, this.f7223f, true);
        }
    }

    public e(n nVar, Handler handler, f.n.a.v.c.c cVar, f.n.a.v.g.b bVar, f.n.a.n.d dVar) {
        this.b = nVar;
        this.f7206d = new f.n.a.v.g.d(cVar.a, null);
        this.f7207e = bVar;
        this.c = dVar;
    }

    @Override // f.n.a.v.h.d
    public void a() {
        try {
            Intent intent = new Intent("android.intent.action.SENDTO");
            intent.setData(Uri.parse("mailto:support@inverseai.com?subject=Feedback For Video Compressor | Version code : 265&body="));
            this.b.startActivity(intent);
        } catch (Exception unused) {
            Toast.makeText(this.b, "No Email Client found", 0).show();
        }
    }

    @Override // f.n.a.v.h.d
    public void b() {
        try {
            TextView textView = new TextView(this.b);
            textView.setText(Html.fromHtml(s()));
            textView.setPadding(40, 5, 40, 0);
            ScrollView scrollView = new ScrollView(this.b);
            scrollView.addView(textView);
            AlertDialog.Builder builder = new AlertDialog.Builder(this.b);
            builder.setView(scrollView);
            builder.setCancelable(true);
            builder.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: f.n.a.v.h.a
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    dialogInterface.dismiss();
                }
            });
            builder.show().requestWindowFeature(1);
        } catch (Exception unused) {
        }
    }

    @Override // f.n.a.v.h.d
    public void c() {
        f.n.a.v.a.j.q(this.b);
    }

    @Override // f.n.a.v.h.d
    public void d() {
        n nVar = this.b;
        new f.n.a.e.a(nVar).b(nVar, null, null);
    }

    @Override // f.n.a.v.h.d
    public void e() {
    }

    @Override // f.n.a.v.h.d
    public void f() {
        n nVar = this.b;
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse("market://search?q=pub:Inverse.AI"));
            nVar.startActivity(intent);
        } catch (Exception unused) {
            Toast.makeText(nVar, "No apps available now ", 0).show();
        }
    }

    @Override // f.n.a.v.h.d
    public void g() {
        try {
            Intent intent = new Intent("android.intent.action.SENDTO");
            intent.setData(Uri.parse("mailto:support@inverseai.com?subject=Translation contribution &body= Hello I want to contribute in translating your application to my language."));
            this.b.startActivity(intent);
        } catch (Exception unused) {
            Toast.makeText(this.b, "No Email Client found", 0).show();
        }
    }

    @Override // f.n.a.v.h.d
    public void h() {
        this.b.startActivity(new Intent(this.b, MediaPickerActivity.class).putExtra("REQUESTED_FOR", ProcessorType.VIDEO_COMPRESSOR));
    }

    @Override // f.n.a.v.h.d
    public void i() {
        if (f.n.a.u.a.e().f()) {
            this.c.b("click_gif_icon");
        } else {
            this.c.a("click_crown_icon");
        }
        Log.d("HomeScreenController", "onPremiumItemClicked: ");
        f.n.a.z.b.a().b = "purchase_button";
        f.n.a.v.a.j.k(this.b);
    }

    @Override // f.n.a.v.h.d
    public void j() {
        try {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.SUBJECT", "Video Compressor");
            String string = this.b.getString(R.string.share_app_message);
            intent.putExtra("android.intent.extra.TEXT", string + "https://play.google.com/store/apps/details?id=com.video_converter.video_compressor\n\n");
            this.b.startActivity(Intent.createChooser(intent, "Share via"));
        } catch (Exception unused) {
        }
    }

    @Override // f.n.a.v.h.d
    public void k() {
        this.b.startActivity(new Intent(this.b, OutputsActivity.class));
    }

    @Override // f.n.a.v.h.d
    public void l() {
        try {
            FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(this.b);
            firebaseAnalytics.logEvent("CE_ios_install_refer", new Bundle());
            this.b.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://apps.apple.com/us/app/video-compressor-converter/id1528281985")));
        } catch (Exception unused) {
            Toast.makeText(this.b, "Something went wrong", 0).show();
        }
    }

    @Override // f.n.a.v.h.d
    public void m(AdEvent adEvent) {
        int ordinal = adEvent.ordinal();
        try {
            if (ordinal == 0) {
                FirebaseAnalytics.getInstance(this.b).logEvent("refer_video_merger", new Bundle());
                f.n.a.v.a.j.t(this.b, "com.video_joiner.video_merger", false);
            } else if (ordinal != 1) {
                if (ordinal == 2) {
                    FirebaseAnalytics.getInstance(this.b).logEvent("refer_video_editor", new Bundle());
                    f.n.a.v.a.j.t(this.b, "com.inverseai.video_editor", false);
                }
            } else {
                FirebaseAnalytics.getInstance(this.b).logEvent("refer_photo_compressor", new Bundle());
                f.n.a.v.a.j.t(this.b, "com.inverseai.image_compressor", false);
            }
        } catch (Exception unused) {
        }
    }

    @Override // f.n.a.v.h.d
    public void n(ImageButton imageButton) {
        if ((this.b.getResources().getConfiguration().uiMode & 48) == 32) {
            imageButton.setSelected(true);
            m.z(1);
            f.l.b.c.j(this.b, Boolean.class, "dark_mode", Boolean.FALSE);
        } else {
            imageButton.setSelected(false);
            f.l.b.c.j(this.b, Boolean.class, "dark_mode", Boolean.TRUE);
            m.z(2);
        }
        this.b.startActivity(new Intent(this.b, HomeScreenActivity.class));
        this.b.finish();
        this.b.overridePendingTransition(0, 0);
    }

    @Override // f.n.a.v.h.d
    public void o() {
        this.b.startActivity(new Intent(this.b, SettingActivity.class));
    }

    @Override // f.n.a.v.h.d
    public void p() {
        try {
            f.n.a.n.f.c(this.b, new b());
        } catch (Exception unused) {
        }
    }

    public final void q() {
        long j2;
        String string;
        f.n.a.u.a e2 = f.n.a.u.a.e();
        String packageName = this.b.getApplicationContext().getPackageName();
        Objects.requireNonNull(e2);
        try {
            FirebaseRemoteConfig firebaseRemoteConfig = e2.a;
            string = firebaseRemoteConfig == null ? "" : firebaseRemoteConfig.getString("minimum_allowed_version_code");
        } catch (Exception unused) {
        }
        if (string != null) {
            Map map = (Map) new f.h.f.j().c(string, Map.class);
            if (map.containsKey(packageName)) {
                j2 = Integer.parseInt((String) map.get(packageName));
                if (j2 > 265 || !this.f7211i) {
                }
                new AlertDialog.Builder(this.b).setCancelable(false).setTitle(this.b.getResources().getString(R.string.warning)).setMessage(this.b.getResources().getString(R.string.emergency_update_notice)).setPositiveButton(this.b.getResources().getString(R.string.update), new DialogInterface$OnClickListenerC0189e()).setNegativeButton(this.b.getResources().getString(R.string.open_store), new d()).setNeutralButton(this.b.getResources().getString(R.string.exit), new c()).setIcon(17301543).show();
                return;
            }
        }
        j2 = 265;
        if (j2 > 265) {
        }
    }

    public final float r(f.j.b.c.a aVar) {
        try {
            return Float.parseFloat(aVar.f6583f.replace(",", "").split("\\s")[1]);
        } catch (Exception e2) {
            StringBuilder A = f.a.b.a.a.A("getPrice: ");
            A.append(aVar.f6583f);
            Log.e("HomeScreenController", A.toString(), e2);
            return 0.0f;
        }
    }

    public String s() {
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(this.b.getAssets().open("privacy_policy.html")));
                while (true) {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine == null) {
                            break;
                        }
                        sb.append(readLine);
                    } catch (IOException unused) {
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        return sb.toString();
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                }
                bufferedReader2.close();
            } catch (IOException unused3) {
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException unused4) {
        }
        return sb.toString();
    }

    public final void t(f.j.b.c.a aVar, long j2) {
        n nVar = this.b;
        StringBuilder A = f.a.b.a.a.A("first_shown_at");
        A.append(aVar.c);
        f.l.b.c.j(nVar, String.class, A.toString(), String.valueOf(j2));
    }

    public void u() {
        FirebaseRemoteConfig firebaseRemoteConfig = f.n.a.u.a.e().a;
        if (firebaseRemoteConfig == null ? true : firebaseRemoteConfig.getBoolean("block_invalid_user")) {
            String packageName = this.b.getPackageName();
            String installerPackageName = this.b.getPackageManager().getInstallerPackageName(packageName);
            AlertDialog.Builder builder = new AlertDialog.Builder(this.b);
            builder.setTitle(this.b.getResources().getString(R.string.error));
            builder.setMessage(this.b.getResources().getString(R.string.invalid_installer_msg)).setPositiveButton(this.b.getResources().getString(R.string.report_us), new g(installerPackageName, packageName));
            builder.setNegativeButton(this.b.getResources().getString(R.string.open_store), new h(packageName));
            builder.setNeutralButton(this.b.getResources().getString(R.string.exit), new a());
            builder.setCancelable(false);
            this.f7209g = builder.create();
            if (this.b.isFinishing()) {
                return;
            }
            this.f7209g.show();
        }
    }

    public final void v(f.c.a.a.h hVar) {
        BannerTemplate bannerTemplate;
        int nextInt = this.n.nextInt(3);
        f.a.b.a.a.N("getRandomTemplate: ", nextInt, "HomeScreenController");
        if (nextInt == 1) {
            bannerTemplate = BannerTemplate.TEMPLATE_3;
        } else if (nextInt == 2) {
            bannerTemplate = BannerTemplate.TEMPLATE_2;
        } else {
            bannerTemplate = BannerTemplate.TEMPLATE_1;
        }
        i.l.b.i.e(hVar, "payload");
        i.l.b.i.e(bannerTemplate, "templateType");
        Bundle bundle = new Bundle();
        bundle.putSerializable("key.payload", hVar);
        bundle.putInt("key.temp.type", bannerTemplate.ordinal());
        f.c.a.a.m mVar = new f.c.a.a.m();
        mVar.setArguments(bundle);
        mVar.f3123h = new f(hVar);
        e.p.c.a aVar = new e.p.c.a(this.b.H());
        aVar.h(R.id.sale_banner_container, mVar, "saleBanner");
        aVar.d();
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(this.b);
        StringBuilder A = f.a.b.a.a.A("sale_banner_shown_");
        A.append(hVar.f3111f);
        f.a.b.a.a.M(firebaseAnalytics, A.toString());
    }
}
