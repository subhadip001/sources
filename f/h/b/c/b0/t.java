package f.h.b.c.b0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.video_converter.video_compressor.R;
import e.b.h.z0;
import e.i.j.z;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: StartCompoundLayout.java */
/* loaded from: classes.dex */
public class t extends LinearLayout {

    /* renamed from: f  reason: collision with root package name */
    public final TextInputLayout f5215f;

    /* renamed from: g  reason: collision with root package name */
    public final TextView f5216g;

    /* renamed from: h  reason: collision with root package name */
    public CharSequence f5217h;

    /* renamed from: i  reason: collision with root package name */
    public final CheckableImageButton f5218i;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f5219j;

    /* renamed from: k  reason: collision with root package name */
    public PorterDuff.Mode f5220k;

    /* renamed from: l  reason: collision with root package name */
    public View.OnLongClickListener f5221l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f5222m;

    public t(TextInputLayout textInputLayout, z0 z0Var) {
        super(textInputLayout.getContext());
        this.f5215f = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f5218i = checkableImageButton;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
        this.f5216g = appCompatTextView;
        if (f.h.b.c.a.w0(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        d(null);
        e(null);
        if (z0Var.o(62)) {
            this.f5219j = f.h.b.c.a.o0(getContext(), z0Var, 62);
        }
        if (z0Var.o(63)) {
            this.f5220k = f.h.b.c.a.J0(z0Var.j(63, -1), null);
        }
        if (z0Var.o(61)) {
            c(z0Var.g(61));
            if (z0Var.o(60)) {
                b(z0Var.n(60));
            }
            checkableImageButton.setCheckable(z0Var.a(59, true));
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(R.id.textinput_prefix_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        AtomicInteger atomicInteger = z.a;
        z.g.f(appCompatTextView, 1);
        e.i.a.b0(appCompatTextView, z0Var.l(55, 0));
        if (z0Var.o(56)) {
            appCompatTextView.setTextColor(z0Var.c(56));
        }
        a(z0Var.n(54));
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    public void a(CharSequence charSequence) {
        this.f5217h = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f5216g.setText(charSequence);
        h();
    }

    public void b(CharSequence charSequence) {
        if (this.f5218i.getContentDescription() != charSequence) {
            this.f5218i.setContentDescription(charSequence);
        }
    }

    public void c(Drawable drawable) {
        this.f5218i.setImageDrawable(drawable);
        if (drawable != null) {
            f.h.b.c.a.h(this.f5215f, this.f5218i, this.f5219j, this.f5220k);
            f(true);
            f.h.b.c.a.N0(this.f5215f, this.f5218i, this.f5219j);
            return;
        }
        f(false);
        d(null);
        e(null);
        b(null);
    }

    public void d(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.f5218i;
        View.OnLongClickListener onLongClickListener = this.f5221l;
        checkableImageButton.setOnClickListener(null);
        f.h.b.c.a.U0(checkableImageButton, onLongClickListener);
    }

    public void e(View.OnLongClickListener onLongClickListener) {
        this.f5221l = null;
        CheckableImageButton checkableImageButton = this.f5218i;
        checkableImageButton.setOnLongClickListener(null);
        f.h.b.c.a.U0(checkableImageButton, null);
    }

    public void f(boolean z) {
        if ((this.f5218i.getVisibility() == 0) != z) {
            this.f5218i.setVisibility(z ? 0 : 8);
            g();
            h();
        }
    }

    public void g() {
        EditText editText = this.f5215f.f1226j;
        if (editText == null) {
            return;
        }
        int i2 = 0;
        if (!(this.f5218i.getVisibility() == 0)) {
            AtomicInteger atomicInteger = z.a;
            i2 = z.e.f(editText);
        }
        TextView textView = this.f5216g;
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        AtomicInteger atomicInteger2 = z.a;
        z.e.k(textView, i2, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    public final void h() {
        int i2 = (this.f5217h == null || this.f5222m) ? 8 : 0;
        setVisibility(this.f5218i.getVisibility() == 0 || i2 == 0 ? 0 : 8);
        this.f5216g.setVisibility(i2);
        this.f5215f.u();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        g();
    }
}
