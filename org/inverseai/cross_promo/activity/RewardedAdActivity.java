package org.inverseai.cross_promo.activity;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;
import com.video_converter.video_compressor.R;
import e.b.c.k;
import e.i.c.a;
import e.i.c.d.j;
import e.s.n;
import f.n.a.n.i;
import i.m.c;
import java.util.ArrayList;
import java.util.List;
import m.b.a.g.d;
import m.b.a.j.e;
import m.b.a.j.f;
import org.inverseai.cross_promo.activity.RewardedAdActivity;
import org.inverseai.cross_promo.event.RewardEvent;
import org.inverseai.cross_promo.model.CrossPromoProduct;
import org.inverseai.cross_promo.model.CrossPromoRewardedAd;

/* compiled from: RewardedAdActivity.kt */
/* loaded from: classes2.dex */
public final class RewardedAdActivity extends k implements e.a, m.b.a.g.e {
    public static final /* synthetic */ int I = 0;
    public CountDownTimer A;
    public int G;
    public boolean H;
    public ImageView u;
    public ImageView v;
    public ImageButton w;
    public TextView x;
    public ViewPager2 y;
    public LinearLayout z;
    public final List<Integer> t = i.F(Integer.valueOf((int) R.layout.cross_interstitial_ad_1));
    public final Handler B = new Handler(Looper.getMainLooper());
    public int C = 3;
    public int D = 10;
    public int E = -1;
    public int F = 3 * 10;

    public final void P(int i2) {
        ImageView imageView;
        LinearLayout linearLayout = this.z;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        int i3 = this.C;
        ImageView[] imageViewArr = new ImageView[i3];
        if (i3 <= 0) {
            return;
        }
        int i4 = 0;
        while (true) {
            int i5 = i4 + 1;
            imageViewArr[i4] = new ImageView(this);
            if (i4 != i2 && (imageView = imageViewArr[i4]) != null) {
                imageView.setAlpha(0.5f);
            }
            ImageView imageView2 = imageViewArr[i4];
            if (imageView2 != null) {
                Resources resources = getResources();
                ThreadLocal<TypedValue> threadLocal = j.a;
                imageView2.setImageDrawable(resources.getDrawable(R.drawable.ic_rounded_circle_12, null));
            }
            ImageView imageView3 = imageViewArr[i4];
            if (imageView3 != null) {
                imageView3.setImageTintList(a.getColorStateList(this, R.color.btn_action_color));
            }
            float f2 = 12;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) (Resources.getSystem().getDisplayMetrics().density * f2), (int) (f2 * Resources.getSystem().getDisplayMetrics().density));
            layoutParams.setMargins(4, 0, 4, 0);
            LinearLayout linearLayout2 = this.z;
            if (linearLayout2 != null) {
                linearLayout2.addView(imageViewArr[i4], layoutParams);
            }
            if (i5 >= i3) {
                return;
            }
            i4 = i5;
        }
    }

    @Override // m.b.a.g.e
    public void d(d dVar) {
        i.l.b.i.e(dVar, "dialog");
        dVar.dismissAllowingStateLoss();
        m.b.a.d.d dVar2 = new m.b.a.d.d(this, this.F * 1000);
        this.A = dVar2;
        i.l.b.i.b(dVar2);
        dVar2.start();
    }

    @Override // m.b.a.j.e.a
    public void h() {
    }

    @Override // m.b.a.g.e
    public void k(d dVar) {
        i.l.b.i.e(dVar, "dialog");
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object] */
    @Override // e.p.c.n, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.layout_rewarded_ad_activity);
        Log.d("RewardedAdActivity", "onCreate: ");
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.C = extras.getInt("KEY_AD_CNT", 3);
            this.D = extras.getInt("KEY_AD_LENGTH", 10);
            this.E = extras.getInt("KEY_AD_CLOSE_THRESHOLD", -1);
        }
        this.F = this.C * this.D;
        if (bundle != null) {
            this.H = bundle.getBoolean("KEY_IS_REWARDED", false);
            this.F = bundle.getInt("KEY_REMAINING_TIME", this.C * this.D);
        }
        this.u = (ImageView) findViewById(R.id.iv_left_arrow);
        this.v = (ImageView) findViewById(R.id.iv_right_arrow);
        this.w = (ImageButton) findViewById(R.id.ib_close_ad);
        this.x = (TextView) findViewById(R.id.tv_ad_status);
        this.z = (LinearLayout) findViewById(R.id.slider_dots);
        ViewPager2 viewPager2 = (ViewPager2) findViewById(R.id.view_pager);
        this.y = viewPager2;
        if (viewPager2 != null) {
            FragmentManager H = H();
            i.l.b.i.d(H, "supportFragmentManager");
            n nVar = this.f40g;
            i.l.b.i.d(nVar, "lifecycle");
            m.b.a.e.a aVar = new m.b.a.e.a(H, nVar);
            Context applicationContext = getApplicationContext();
            i.l.b.i.d(applicationContext, "applicationContext");
            ArrayList<CrossPromoProduct> a = f.a(applicationContext);
            if (a.size() != 0) {
                ArrayList<CrossPromoRewardedAd> arrayList = new ArrayList<>();
                int i2 = this.C;
                if (i2 > 0) {
                    int i3 = 0;
                    while (true) {
                        i3++;
                        if (a.size() == 0) {
                            int size = arrayList.size();
                            this.C = size;
                            int i4 = this.F;
                            int i5 = size * this.D;
                            if (i4 > i5) {
                                i4 = i5;
                            }
                            this.F = i4;
                        } else {
                            c.a aVar2 = c.f8653f;
                            CrossPromoProduct crossPromoProduct = a.get(aVar2.b(a.size()));
                            i.l.b.i.d(crossPromoProduct, "availableProducts[index]");
                            CrossPromoProduct crossPromoProduct2 = crossPromoProduct;
                            arrayList.add(new CrossPromoRewardedAd(crossPromoProduct2, this.t.get(aVar2.b(this.t.size())).intValue()));
                            ArrayList<CrossPromoProduct> arrayList2 = new ArrayList<>();
                            for (?? r8 : a) {
                                if (!i.l.b.i.a(((CrossPromoProduct) r8).getPkg_name(), crossPromoProduct2.getPkg_name())) {
                                    arrayList2.add(r8);
                                }
                            }
                            if (i3 >= i2) {
                                break;
                            }
                            a = arrayList2;
                        }
                    }
                }
                aVar.f9299i = arrayList;
                viewPager2.setAdapter(aVar);
            } else {
                throw new IllegalStateException("No products found in assets");
            }
        }
        ViewPager2 viewPager22 = this.y;
        if (viewPager22 != null) {
            viewPager22.f618h.a.add(new m.b.a.d.c(this));
        }
        ViewPager2 viewPager23 = this.y;
        if (viewPager23 != null) {
            viewPager23.setPageTransformer(new m.b.a.k.a());
        }
        P(0);
        ImageButton imageButton = this.w;
        if (imageButton != null) {
            imageButton.setOnClickListener(new View.OnClickListener() { // from class: m.b.a.d.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RewardedAdActivity rewardedAdActivity = RewardedAdActivity.this;
                    int i6 = RewardedAdActivity.I;
                    i.l.b.i.e(rewardedAdActivity, "this$0");
                    CountDownTimer countDownTimer = rewardedAdActivity.A;
                    if (countDownTimer != null) {
                        countDownTimer.cancel();
                    }
                    if (rewardedAdActivity.H) {
                        rewardedAdActivity.finish();
                        return;
                    }
                    d.a aVar3 = m.b.a.g.d.f9303l;
                    String string = rewardedAdActivity.getString(R.string.confirm_close_rewarded_ad);
                    String string2 = rewardedAdActivity.getString(R.string.no);
                    m.b.a.g.d dVar = new m.b.a.g.d();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("title", null);
                    bundle2.putString("message", string);
                    bundle2.putString("positive", null);
                    bundle2.putString("negative", string2);
                    bundle2.putString("neutral", null);
                    dVar.setArguments(bundle2);
                    dVar.show(rewardedAdActivity.H(), "confirm_dialog");
                }
            });
        }
        if (this.E > 0) {
            ImageButton imageButton2 = this.w;
            if (imageButton2 != null) {
                imageButton2.setEnabled(false);
            }
            this.B.postDelayed(new Runnable() { // from class: m.b.a.d.b
                @Override // java.lang.Runnable
                public final void run() {
                    RewardedAdActivity rewardedAdActivity = RewardedAdActivity.this;
                    int i6 = RewardedAdActivity.I;
                    i.l.b.i.e(rewardedAdActivity, "this$0");
                    ImageButton imageButton3 = rewardedAdActivity.w;
                    if (imageButton3 == null) {
                        return;
                    }
                    imageButton3.setEnabled(true);
                }
            }, this.E * 1000);
        }
    }

    @Override // e.b.c.k, e.p.c.n, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m.a.a.c.b().f(RewardEvent.AD_CLOSED);
    }

    @Override // e.p.c.n, android.app.Activity
    public void onPause() {
        super.onPause();
        CountDownTimer countDownTimer = this.A;
        if (countDownTimer == null) {
            return;
        }
        countDownTimer.cancel();
    }

    @Override // e.p.c.n, android.app.Activity
    public void onResume() {
        super.onResume();
        m.b.a.d.d dVar = new m.b.a.d.d(this, this.F * 1000);
        this.A = dVar;
        i.l.b.i.b(dVar);
        dVar.start();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        i.l.b.i.e(bundle, "outState");
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("KEY_IS_REWARDED", this.H);
        bundle.putInt("KEY_REMAINING_TIME", this.F);
    }

    @Override // m.b.a.g.e
    public void s(d dVar) {
        i.l.b.i.e(dVar, "dialog");
        CountDownTimer countDownTimer = this.A;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        finish();
    }
}
