package f.h.b.c.b0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.video_converter.video_compressor.R;
import e.i.j.z;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: IndicatorViewController.java */
/* loaded from: classes.dex */
public final class n {
    public final Context a;
    public final TextInputLayout b;
    public LinearLayout c;

    /* renamed from: d  reason: collision with root package name */
    public int f5191d;

    /* renamed from: e  reason: collision with root package name */
    public FrameLayout f5192e;

    /* renamed from: f  reason: collision with root package name */
    public Animator f5193f;

    /* renamed from: g  reason: collision with root package name */
    public final float f5194g;

    /* renamed from: h  reason: collision with root package name */
    public int f5195h;

    /* renamed from: i  reason: collision with root package name */
    public int f5196i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f5197j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f5198k;

    /* renamed from: l  reason: collision with root package name */
    public TextView f5199l;

    /* renamed from: m  reason: collision with root package name */
    public CharSequence f5200m;
    public int n;
    public ColorStateList o;
    public CharSequence p;
    public boolean q;
    public TextView r;
    public int s;
    public ColorStateList t;
    public Typeface u;

    /* compiled from: IndicatorViewController.java */
    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ int a;
        public final /* synthetic */ TextView b;
        public final /* synthetic */ int c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ TextView f5201d;

        public a(int i2, TextView textView, int i3, TextView textView2) {
            this.a = i2;
            this.b = textView;
            this.c = i3;
            this.f5201d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            TextView textView;
            n nVar = n.this;
            nVar.f5195h = this.a;
            nVar.f5193f = null;
            TextView textView2 = this.b;
            if (textView2 != null) {
                textView2.setVisibility(4);
                if (this.c == 1 && (textView = n.this.f5199l) != null) {
                    textView.setText((CharSequence) null);
                }
            }
            TextView textView3 = this.f5201d;
            if (textView3 != null) {
                textView3.setTranslationY(0.0f);
                this.f5201d.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.f5201d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    public n(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.a = context;
        this.b = textInputLayout;
        this.f5194g = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
    }

    public void a(TextView textView, int i2) {
        if (this.c == null && this.f5192e == null) {
            LinearLayout linearLayout = new LinearLayout(this.a);
            this.c = linearLayout;
            linearLayout.setOrientation(0);
            this.b.addView(this.c, -1, -2);
            this.f5192e = new FrameLayout(this.a);
            this.c.addView(this.f5192e, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.b.getEditText() != null) {
                b();
            }
        }
        if (i2 == 0 || i2 == 1) {
            this.f5192e.setVisibility(0);
            this.f5192e.addView(textView);
        } else {
            this.c.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.c.setVisibility(0);
        this.f5191d++;
    }

    public void b() {
        if ((this.c == null || this.b.getEditText() == null) ? false : true) {
            EditText editText = this.b.getEditText();
            boolean w0 = f.h.b.c.a.w0(this.a);
            LinearLayout linearLayout = this.c;
            AtomicInteger atomicInteger = z.a;
            z.e.k(linearLayout, h(w0, R.dimen.material_helper_text_font_1_3_padding_horizontal, z.e.f(editText)), h(w0, R.dimen.material_helper_text_font_1_3_padding_top, this.a.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top)), h(w0, R.dimen.material_helper_text_font_1_3_padding_horizontal, z.e.e(editText)), 0);
        }
    }

    public void c() {
        Animator animator = this.f5193f;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final void d(List<Animator> list, boolean z, TextView textView, int i2, int i3, int i4) {
        if (textView == null || !z) {
            return;
        }
        if (i2 == i4 || i2 == i3) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, i4 == i2 ? 1.0f : 0.0f);
            ofFloat.setDuration(167L);
            ofFloat.setInterpolator(f.h.b.c.c.a.a);
            list.add(ofFloat);
            if (i4 == i2) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, -this.f5194g, 0.0f);
                ofFloat2.setDuration(217L);
                ofFloat2.setInterpolator(f.h.b.c.c.a.f5223d);
                list.add(ofFloat2);
            }
        }
    }

    public boolean e() {
        return (this.f5196i != 1 || this.f5199l == null || TextUtils.isEmpty(this.f5197j)) ? false : true;
    }

    public final TextView f(int i2) {
        if (i2 != 1) {
            if (i2 != 2) {
                return null;
            }
            return this.r;
        }
        return this.f5199l;
    }

    public int g() {
        TextView textView = this.f5199l;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public final int h(boolean z, int i2, int i3) {
        return z ? this.a.getResources().getDimensionPixelSize(i2) : i3;
    }

    public void i() {
        this.f5197j = null;
        c();
        if (this.f5195h == 1) {
            if (this.q && !TextUtils.isEmpty(this.p)) {
                this.f5196i = 2;
            } else {
                this.f5196i = 0;
            }
        }
        l(this.f5195h, this.f5196i, k(this.f5199l, ""));
    }

    public void j(TextView textView, int i2) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.c;
        if (linearLayout == null) {
            return;
        }
        if ((i2 == 0 || i2 == 1) && (frameLayout = this.f5192e) != null) {
            frameLayout.removeView(textView);
        } else {
            linearLayout.removeView(textView);
        }
        int i3 = this.f5191d - 1;
        this.f5191d = i3;
        LinearLayout linearLayout2 = this.c;
        if (i3 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean k(TextView textView, CharSequence charSequence) {
        TextInputLayout textInputLayout = this.b;
        AtomicInteger atomicInteger = z.a;
        return z.g.c(textInputLayout) && this.b.isEnabled() && !(this.f5196i == this.f5195h && textView != null && TextUtils.equals(textView.getText(), charSequence));
    }

    public final void l(int i2, int i3, boolean z) {
        TextView f2;
        TextView f3;
        if (i2 == i3) {
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f5193f = animatorSet;
            ArrayList arrayList = new ArrayList();
            d(arrayList, this.q, this.r, 2, i2, i3);
            d(arrayList, this.f5198k, this.f5199l, 1, i2, i3);
            f.h.b.c.a.K0(animatorSet, arrayList);
            animatorSet.addListener(new a(i3, f(i2), i2, f(i3)));
            animatorSet.start();
        } else if (i2 != i3) {
            if (i3 != 0 && (f3 = f(i3)) != null) {
                f3.setVisibility(0);
                f3.setAlpha(1.0f);
            }
            if (i2 != 0 && (f2 = f(i2)) != null) {
                f2.setVisibility(4);
                if (i2 == 1) {
                    f2.setText((CharSequence) null);
                }
            }
            this.f5195h = i3;
        }
        this.b.v();
        this.b.z(z, false);
        this.b.E();
    }
}
