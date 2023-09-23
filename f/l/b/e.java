package f.l.b;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.video_converter.video_compressor.R;
import e.p.c.n;
import f.n.a.v.a.j;
import java.util.Locale;

/* compiled from: RatingDialog.java */
/* loaded from: classes2.dex */
public class e extends Dialog {

    /* renamed from: f  reason: collision with root package name */
    public ImageButton[] f6796f;

    /* renamed from: g  reason: collision with root package name */
    public int f6797g;

    /* renamed from: h  reason: collision with root package name */
    public int[] f6798h;

    /* renamed from: i  reason: collision with root package name */
    public TextView f6799i;

    /* renamed from: j  reason: collision with root package name */
    public TextView f6800j;

    /* renamed from: k  reason: collision with root package name */
    public Button f6801k;

    /* renamed from: l  reason: collision with root package name */
    public int f6802l;

    /* renamed from: m  reason: collision with root package name */
    public ImageView f6803m;
    public ImageView n;
    public d o;
    public View p;
    public Handler q;

    /* compiled from: RatingDialog.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            e eVar = e.this;
            int i2 = eVar.f6802l;
            if (i2 <= 0) {
                eVar.p.setVisibility(0);
                if (eVar.q == null) {
                    eVar.q = new Handler();
                }
                eVar.q.postDelayed(new f(eVar), 1500L);
                Toast.makeText(e.this.getContext(), "Please update rating", 0).show();
                return;
            }
            if (i2 < eVar.f6797g) {
                f.l.b.a aVar = new f.l.b.a(e.this.getContext());
                e eVar2 = e.this;
                aVar.f6793k = eVar2.f6802l;
                aVar.f6792j = eVar2.o;
                aVar.show();
                e.this.dismiss();
            } else {
                d dVar = eVar.o;
                if (dVar != null) {
                    j.e eVar3 = (j.e) dVar;
                    if (!((Boolean) c.b(eVar3.a, Boolean.class, "is_rated")).booleanValue()) {
                        c.j(eVar3.a, Boolean.class, "is_rated", Boolean.TRUE);
                        f.a.b.a.a.M(FirebaseAnalytics.getInstance(eVar3.a), "star_5");
                        n nVar = eVar3.a;
                        j.t(nVar, nVar.getApplicationContext().getPackageName(), true);
                    }
                }
            }
            e.this.dismiss();
        }
    }

    public e(Context context) {
        super(context, R.style.rating_dialog);
        this.f6796f = new ImageButton[]{null, null, null, null, null, null};
        this.f6797g = 5;
        this.f6798h = new int[]{R.drawable.ic_mood_4, R.drawable.ic_mood_1, R.drawable.ic_mood_1, R.drawable.ic_mood_4, R.drawable.ic_mood_4, R.drawable.ic_in_love};
        this.f6802l = 0;
    }

    public final void a(int i2) {
        this.f6802l = i2;
        for (int i3 = 1; i3 <= 5; i3++) {
            if (i3 <= i2) {
                this.f6796f[i3].setImageResource(R.drawable.ic_star_fill);
            } else {
                this.f6796f[i3].setImageResource(R.drawable.ic_star_empty);
            }
        }
        if (i2 < 1) {
            this.f6799i.setText(R.string.no_star_title);
            this.f6800j.setText(R.string.no_star_message);
        } else if (i2 < this.f6797g) {
            this.f6799i.setText(R.string.unsatisfied_title);
            this.f6800j.setText(R.string.unsatisfied_message);
        } else {
            this.f6799i.setText(R.string.satisfied_title);
            this.f6800j.setText(R.string.satisfied_message);
        }
        if (this.f6802l < this.f6797g) {
            this.f6801k.setText(R.string.feedback_action_title);
        } else {
            this.f6801k.setText(R.string.rating_action_title);
        }
        if (i2 < 0 || i2 >= 6) {
            return;
        }
        this.f6803m.setImageResource(this.f6798h[i2]);
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.rating_dialog);
        this.f6796f[1] = (ImageButton) findViewById(R.id.star1);
        this.f6796f[2] = (ImageButton) findViewById(R.id.star2);
        this.f6796f[3] = (ImageButton) findViewById(R.id.star3);
        this.f6796f[4] = (ImageButton) findViewById(R.id.star4);
        this.f6796f[5] = (ImageButton) findViewById(R.id.star5);
        this.f6799i = (TextView) findViewById(R.id.dialog_title);
        this.f6800j = (TextView) findViewById(R.id.give_five_star);
        this.f6801k = (Button) findViewById(R.id.ratingBtn);
        this.p = findViewById(R.id.starSelectHint);
        this.f6803m = (ImageView) findViewById(R.id.icon);
        this.n = (ImageView) findViewById(R.id.arrow);
        for (int i2 = 1; i2 <= 5; i2++) {
            this.f6796f[i2].setOnClickListener(new g(this, i2));
        }
        a(0);
        this.f6801k.setOnClickListener(new a());
        try {
            Locale locale = Locale.getDefault();
            Locale locale2 = e.i.h.e.a;
            if (TextUtils.getLayoutDirectionFromLocale(locale) == 0) {
                this.n.setRotation(105.0f);
            } else {
                this.n.setRotation(-105.0f);
            }
        } catch (Exception unused) {
        }
    }
}
