package f.n.a.v.p;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.widget.Toast;
import com.video_converter.video_compressor.R;
import com.video_converter.video_compressor.adControllers.AdLoader;
import com.video_converter.video_compressor.screens.splashScreen.SplashScreenActivity;
import com.video_converter.video_compressor.screens.videoCompressorScreen.spinnerListItem.Item;
import e.p.c.n;
import f.n.a.n.f;
import f.n.a.v.o.b;
import java.util.Locale;

/* compiled from: SettingController.java */
/* loaded from: classes2.dex */
public class c implements f.n.a.v.p.a, b.a {
    public d a;
    public n b;
    public AdLoader c;

    /* renamed from: d  reason: collision with root package name */
    public Handler f7374d = new Handler(Looper.getMainLooper());

    /* compiled from: SettingController.java */
    /* loaded from: classes2.dex */
    public class a implements f.c {
        public a() {
        }

        @Override // f.n.a.n.f.c
        public void a() {
            c.this.h();
        }
    }

    public c(n nVar) {
        this.b = nVar;
    }

    @Override // f.n.a.v.p.a
    public void a() {
        try {
            Intent intent = new Intent("android.intent.action.SENDTO");
            intent.setData(Uri.parse("mailto:support@inverseai.com?subject=Feedback For Video Compressor | Version code : 265&body="));
            this.b.startActivity(intent);
        } catch (Exception unused) {
            Toast.makeText(this.b, "No Email Client found", 0).show();
        }
    }

    @Override // f.n.a.v.o.b.a
    public void b() {
    }

    @Override // f.n.a.v.p.a
    public void c() {
        n nVar = this.b;
        new f.n.a.e.a(nVar).b(nVar, null, null);
    }

    @Override // f.n.a.v.p.a
    public void d() {
        try {
            Intent intent = new Intent("android.intent.action.SENDTO");
            intent.setData(Uri.parse("mailto:support@inverseai.com?subject=Translation contribution For Video Compressor | Version code : 265&body= Hello I want to contribute in translating your application to my language.(" + Locale.getDefault() + ")"));
            this.b.startActivity(intent);
        } catch (Exception unused) {
            Toast.makeText(this.b, "No Email Client found", 0).show();
        }
    }

    @Override // f.n.a.v.p.a
    public void e(boolean z) {
        f.l.b.c.j(this.b, Integer.class, "theme_status", Integer.valueOf(z ? 2 : 1));
        h();
    }

    @Override // f.n.a.v.p.a
    public void f() {
        this.b.finish();
    }

    @Override // f.n.a.v.p.a
    public void g() {
        f.c(this.b, new a());
    }

    public final void h() {
        this.b.startActivity(new Intent(this.b.getApplicationContext(), SplashScreenActivity.class));
        this.b.finishAffinity();
    }

    public final void i(boolean z) {
        Log.d("settingC", "updateEnabler: " + z);
        this.a.f7377j.setEnabled(z);
        this.a.f7377j.setText(this.b.getResources().getString(z ? R.string.enable : R.string.enabled));
        if (!z) {
            this.a.f7377j.getBackground().setColorFilter(e.i.c.a.getColor(this.b, R.color.white), PorterDuff.Mode.MULTIPLY);
            this.a.f7377j.setTextColor(-16776961);
            return;
        }
        this.a.f7377j.getBackground().setColorFilter(e.i.c.a.getColor(this.b, R.color.colorAccent), PorterDuff.Mode.MULTIPLY);
        this.a.f7377j.setTextColor(-1);
    }

    @Override // f.n.a.v.o.b.a
    public void k(Item item, String str) {
    }
}
