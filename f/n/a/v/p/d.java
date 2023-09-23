package f.n.a.v.p;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.video_converter.video_compressor.R;
import com.video_converter.video_compressor.screens.common.SettingEvent;

/* compiled from: SettingView.java */
/* loaded from: classes2.dex */
public class d extends f.n.a.v.c.d.a<f.n.a.v.p.a> {

    /* renamed from: h  reason: collision with root package name */
    public TextView f7375h;

    /* renamed from: i  reason: collision with root package name */
    public ImageView f7376i;

    /* renamed from: j  reason: collision with root package name */
    public Button f7377j;

    /* renamed from: k  reason: collision with root package name */
    public Button f7378k;

    /* renamed from: l  reason: collision with root package name */
    public SwitchCompat f7379l;

    /* renamed from: m  reason: collision with root package name */
    public ViewGroup f7380m;
    public View n;

    /* compiled from: SettingView.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ SettingEvent f7381f;

        public a(SettingEvent settingEvent) {
            this.f7381f = settingEvent;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            for (f.n.a.v.p.a aVar : d.this.c()) {
                int ordinal = this.f7381f.ordinal();
                if (ordinal == 0) {
                    aVar.g();
                } else if (ordinal == 1) {
                    aVar.f();
                } else if (ordinal == 2) {
                    aVar.c();
                } else if (ordinal == 3) {
                    aVar.a();
                } else if (ordinal == 4) {
                    aVar.e(d.this.f7379l.isChecked());
                } else if (ordinal == 5) {
                    aVar.d();
                }
            }
        }
    }

    public d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f7131f = layoutInflater.inflate(R.layout.layout_settin_screen, viewGroup, false);
        this.f7375h = (TextView) a(R.id.languageTv);
        this.f7376i = (ImageView) a(R.id.backBtn);
        this.f7377j = (Button) a(R.id.enableBgBtn);
        this.f7378k = (Button) a(R.id.emailUsButton);
        this.f7379l = (SwitchCompat) a(R.id.themeSwitch);
        this.f7380m = (ViewGroup) a(R.id.mainLayout);
        this.n = a(R.id.translateBtn);
        this.f7379l.setChecked((b().getResources().getConfiguration().uiMode & 48) == 32);
        d(this.f7375h, SettingEvent.CHANGE_LANGUAGE_CLICK);
        d(this.f7376i, SettingEvent.BACK_BUTTON_CLICKED);
        d(this.f7377j, SettingEvent.ENABLE_BG_PROCESS);
        d(this.f7378k, SettingEvent.EMAIL_US_CLICKED);
        d(this.f7379l, SettingEvent.ON_THEME_SWITCH_CLICKED);
        d(this.n, SettingEvent.ON_TRANSLATE_BTN_CLICKED);
    }

    public final void d(View view, SettingEvent settingEvent) {
        view.setOnClickListener(new a(settingEvent));
    }
}
