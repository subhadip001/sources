package f.n.a.v.h;

import android.app.Activity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.drawerlayout.widget.DrawerLayout;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.google.android.material.navigation.NavigationView;
import com.video_converter.video_compressor.R;
import com.video_converter.video_compressor.screens.common.AdEvent;
import com.video_converter.video_compressor.screens.common.Event;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

/* compiled from: HomeScreenView.java */
/* loaded from: classes2.dex */
public class j extends f.n.a.v.c.d.a<d> {

    /* renamed from: h  reason: collision with root package name */
    public LinearLayout f7227h;

    /* renamed from: i  reason: collision with root package name */
    public LinearLayout f7228i;

    /* renamed from: j  reason: collision with root package name */
    public LinearLayout f7229j;

    /* renamed from: k  reason: collision with root package name */
    public ImageView f7230k;

    /* renamed from: l  reason: collision with root package name */
    public ImageView f7231l;

    /* renamed from: m  reason: collision with root package name */
    public ImageView f7232m;
    public LinearLayout n;
    public DrawerLayout o;
    public e.b.c.b p;
    public TextView q;
    public ImageButton r;
    public int s;

    /* compiled from: HomeScreenView.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Event f7233f;

        public a(Event event) {
            this.f7233f = event;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            j jVar = j.this;
            Event event = this.f7233f;
            for (d dVar : jVar.c()) {
                int ordinal = event.ordinal();
                if (ordinal != 49) {
                    if (ordinal == 60) {
                        dVar.n(jVar.r);
                    } else if (ordinal != 61) {
                        switch (ordinal) {
                            case 0:
                                dVar.h();
                                continue;
                            case 1:
                                dVar.k();
                                continue;
                            case 2:
                                dVar.e();
                                continue;
                            case 3:
                                dVar.m(AdEvent.MERGER_AD_BUTTON_CLICKED);
                                continue;
                            case 4:
                                dVar.m(AdEvent.PHOTO_COMPRESSOR_AD_BUTTON_CLICKED);
                                continue;
                            case 5:
                                dVar.m(AdEvent.VIDEO_EDITOR_AD_BUTTON_CLICKED);
                                continue;
                            case 6:
                                dVar.f();
                                continue;
                            case 7:
                                dVar.i();
                                continue;
                        }
                    } else {
                        dVar.p();
                    }
                } else if (jVar.o.m(8388611)) {
                    jVar.o.c(false);
                } else {
                    jVar.o.r(8388611);
                }
            }
        }
    }

    public j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f7131f = layoutInflater.inflate(R.layout.layout_home_screen, viewGroup, false);
        this.f7227h = (LinearLayout) a(R.id.card_video_compressor);
        this.f7228i = (LinearLayout) a(R.id.card_outputs);
        this.f7230k = (ImageView) a(R.id.img_premium);
        LinearLayout linearLayout = (LinearLayout) a(R.id.card_video_merger_ad);
        LinearLayout linearLayout2 = (LinearLayout) a(R.id.card_photo_compressor_ad);
        LinearLayout linearLayout3 = (LinearLayout) a(R.id.card_video_editor_ad);
        LinearLayout linearLayout4 = (LinearLayout) a(R.id.adLoadinView);
        LinearLayout linearLayout5 = (LinearLayout) a(R.id.adFrameLayoutHolder);
        this.f7229j = (LinearLayout) a(new Random().nextInt(10) < 5 ? R.id.ad_holder_top : R.id.ad_holder);
        this.n = (LinearLayout) a(R.id.fab_btn_container);
        this.o = (DrawerLayout) a(R.id.drawerLayout);
        this.f7232m = (ImageView) a(R.id.homeBtn);
        this.r = (ImageButton) a(R.id.themeSwitch);
        this.f7231l = (ImageView) a(R.id.languageSwitch);
        e.b.c.b bVar = new e.b.c.b((Activity) b(), this.o, R.string.ok, R.string.cancel);
        this.p = bVar;
        DrawerLayout drawerLayout = this.o;
        Objects.requireNonNull(drawerLayout);
        if (drawerLayout.y == null) {
            drawerLayout.y = new ArrayList();
        }
        drawerLayout.y.add(bVar);
        e.b.c.b bVar2 = this.p;
        if (bVar2.b.m(8388611)) {
            bVar2.e(1.0f);
        } else {
            bVar2.e(0.0f);
        }
        e.b.d.a.d dVar = bVar2.c;
        int i2 = bVar2.b.m(8388611) ? bVar2.f1469e : bVar2.f1468d;
        if (!bVar2.f1470f && !bVar2.a.a()) {
            Log.w("ActionBarDrawerToggle", "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);");
            bVar2.f1470f = true;
        }
        bVar2.a.c(dVar, i2);
        ((NavigationView) a(R.id.navView)).setNavigationItemSelectedListener(new i(this));
        try {
            this.q = (TextView) ((NavigationView) a(R.id.navView)).f1177l.f5414g.getChildAt(0).findViewById(R.id.versionName);
            this.q.setText(String.format(b().getResources().getString(R.string.version_string), "6.0.0", 265));
        } catch (Exception e2) {
            StringBuilder A = f.a.b.a.a.A("updateVersionText: ");
            A.append(e2.getMessage());
            Log.d("debugTest", A.toString());
        }
        d(this.f7227h, Event.VIDEO_COMPRESSOR_ITEM_CLICKED);
        d(this.f7228i, Event.OUTPUTS_ITEM_CLICKED);
        d(this.f7231l, Event.LANGUAGE_SWITCH_BTN);
        d(this.f7230k, Event.ON_PREMIUM_ITEM_CLICKED);
        d(this.f7232m, Event.HOME_BUTTON_CLICKED);
        d(this.r, Event.THEME_TOGGLE);
        this.r.setSelected((b().getResources().getConfiguration().uiMode & 48) == 32);
        this.s++;
        if (f.n.a.u.a.e().f()) {
            f.e.a.b.d(b()).a().z("file:///android_asset/gift_box.gif").a(new f.e.a.p.f().h(100, 100)).a(new f.e.a.p.f().p(DownsampleStrategy.c, new f.e.a.l.s.c.i())).y(this.f7230k);
        }
    }

    public final void d(View view, Event event) {
        view.setOnClickListener(new a(event));
    }
}
