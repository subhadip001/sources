package com.google.android.material.textfield;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.internal.CheckableImageButton;
import com.video_converter.video_compressor.R;
import e.a0.l;
import e.b.h.e0;
import e.b.h.i;
import e.b.h.z0;
import e.i.j.z;
import f.h.b.c.b0.h;
import f.h.b.c.b0.m;
import f.h.b.c.b0.n;
import f.h.b.c.b0.o;
import f.h.b.c.b0.s;
import f.h.b.c.b0.t;
import f.h.b.c.s.r;
import f.h.b.c.y.j;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout {
    public int A;
    public ColorStateList A0;
    public e.a0.c B;
    public int B0;
    public e.a0.c C;
    public int C0;
    public ColorStateList D;
    public int D0;
    public ColorStateList E;
    public int E0;
    public CharSequence F;
    public int F0;
    public final TextView G;
    public boolean G0;
    public boolean H;
    public final f.h.b.c.s.e H0;
    public CharSequence I;
    public boolean I0;
    public boolean J;
    public boolean J0;
    public f.h.b.c.y.g K;
    public ValueAnimator K0;
    public f.h.b.c.y.g L;
    public boolean L0;
    public f.h.b.c.y.g M;
    public boolean M0;
    public j N;
    public boolean O;
    public final int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public final Rect a0;
    public final Rect b0;
    public final RectF c0;
    public Typeface d0;
    public Drawable e0;

    /* renamed from: f  reason: collision with root package name */
    public final FrameLayout f1222f;
    public int f0;

    /* renamed from: g  reason: collision with root package name */
    public final t f1223g;
    public final LinkedHashSet<f> g0;

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f1224h;
    public int h0;

    /* renamed from: i  reason: collision with root package name */
    public final FrameLayout f1225i;
    public final SparseArray<m> i0;

    /* renamed from: j  reason: collision with root package name */
    public EditText f1226j;
    public final CheckableImageButton j0;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f1227k;
    public final LinkedHashSet<g> k0;

    /* renamed from: l  reason: collision with root package name */
    public int f1228l;
    public ColorStateList l0;

    /* renamed from: m  reason: collision with root package name */
    public int f1229m;
    public PorterDuff.Mode m0;
    public int n;
    public Drawable n0;
    public int o;
    public int o0;
    public final n p;
    public Drawable p0;
    public boolean q;
    public View.OnLongClickListener q0;
    public int r;
    public View.OnLongClickListener r0;
    public boolean s;
    public final CheckableImageButton s0;
    public TextView t;
    public ColorStateList t0;
    public int u;
    public PorterDuff.Mode u0;
    public int v;
    public ColorStateList v0;
    public CharSequence w;
    public ColorStateList w0;
    public boolean x;
    public int x0;
    public TextView y;
    public int y0;
    public ColorStateList z;
    public int z0;

    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: h  reason: collision with root package name */
        public CharSequence f1230h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f1231i;

        /* renamed from: j  reason: collision with root package name */
        public CharSequence f1232j;

        /* renamed from: k  reason: collision with root package name */
        public CharSequence f1233k;

        /* renamed from: l  reason: collision with root package name */
        public CharSequence f1234l;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i2) {
                return new SavedState[i2];
            }

            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder A = f.a.b.a.a.A("TextInputLayout.SavedState{");
            A.append(Integer.toHexString(System.identityHashCode(this)));
            A.append(" error=");
            A.append((Object) this.f1230h);
            A.append(" hint=");
            A.append((Object) this.f1232j);
            A.append(" helperText=");
            A.append((Object) this.f1233k);
            A.append(" placeholderText=");
            A.append((Object) this.f1234l);
            A.append("}");
            return A.toString();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeParcelable(this.f348f, i2);
            TextUtils.writeToParcel(this.f1230h, parcel, i2);
            parcel.writeInt(this.f1231i ? 1 : 0);
            TextUtils.writeToParcel(this.f1232j, parcel, i2);
            TextUtils.writeToParcel(this.f1233k, parcel, i2);
            TextUtils.writeToParcel(this.f1234l, parcel, i2);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1230h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f1231i = parcel.readInt() == 1;
            this.f1232j = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f1233k = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f1234l = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        }
    }

    /* loaded from: classes.dex */
    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.z(!textInputLayout.M0, false);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.q) {
                textInputLayout2.s(editable.length());
            }
            TextInputLayout textInputLayout3 = TextInputLayout.this;
            if (textInputLayout3.x) {
                textInputLayout3.A(editable.length());
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.j0.performClick();
            TextInputLayout.this.j0.jumpDrawablesToCurrentState();
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f1226j.requestLayout();
        }
    }

    /* loaded from: classes.dex */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.H0.p(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* loaded from: classes.dex */
    public static class e extends e.i.j.c {

        /* renamed from: d  reason: collision with root package name */
        public final TextInputLayout f1238d;

        public e(TextInputLayout textInputLayout) {
            this.f1238d = textInputLayout;
        }

        @Override // e.i.j.c
        public void d(View view, e.i.j.h0.d dVar) {
            this.a.onInitializeAccessibilityNodeInfo(view, dVar.a);
            EditText editText = this.f1238d.getEditText();
            Editable text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f1238d.getHint();
            CharSequence error = this.f1238d.getError();
            CharSequence placeholderText = this.f1238d.getPlaceholderText();
            int counterMaxLength = this.f1238d.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f1238d.getCounterOverflowDescription();
            boolean z = !TextUtils.isEmpty(text);
            boolean z2 = !TextUtils.isEmpty(hint);
            boolean z3 = !this.f1238d.G0;
            boolean z4 = !TextUtils.isEmpty(error);
            boolean z5 = z4 || !TextUtils.isEmpty(counterOverflowDescription);
            String charSequence = z2 ? hint.toString() : "";
            t tVar = this.f1238d.f1223g;
            if (tVar.f5216g.getVisibility() == 0) {
                dVar.a.setLabelFor(tVar.f5216g);
                dVar.q(tVar.f5216g);
            } else {
                dVar.q(tVar.f5218i);
            }
            if (z) {
                dVar.a.setText(text);
            } else if (!TextUtils.isEmpty(charSequence)) {
                dVar.a.setText(charSequence);
                if (z3 && placeholderText != null) {
                    dVar.a.setText(charSequence + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                dVar.a.setText(placeholderText);
            }
            if (!TextUtils.isEmpty(charSequence)) {
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 26) {
                    dVar.o(charSequence);
                } else {
                    if (z) {
                        charSequence = ((Object) text) + ", " + charSequence;
                    }
                    dVar.a.setText(charSequence);
                }
                boolean z6 = !z;
                if (i2 >= 26) {
                    dVar.a.setShowingHintText(z6);
                } else {
                    dVar.l(4, z6);
                }
            }
            dVar.a.setMaxTextLength((text == null || text.length() != counterMaxLength) ? -1 : -1);
            if (z5) {
                if (!z4) {
                    error = counterOverflowDescription;
                }
                dVar.a.setError(error);
            }
            TextView textView = this.f1238d.p.r;
            if (textView != null) {
                dVar.a.setLabelFor(textView);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        void a(TextInputLayout textInputLayout);
    }

    /* loaded from: classes.dex */
    public interface g {
        void a(TextInputLayout textInputLayout, int i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v63 */
    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(f.h.b.c.c0.a.a.a(context, attributeSet, R.attr.textInputStyle, com.arthenica.ffmpegkit.R.style.Widget_Design_TextInputLayout), attributeSet, R.attr.textInputStyle);
        ?? r6;
        View view;
        int i2;
        this.f1228l = -1;
        this.f1229m = -1;
        this.n = -1;
        this.o = -1;
        this.p = new n(this);
        this.a0 = new Rect();
        this.b0 = new Rect();
        this.c0 = new RectF();
        this.g0 = new LinkedHashSet<>();
        this.h0 = 0;
        SparseArray<m> sparseArray = new SparseArray<>();
        this.i0 = sparseArray;
        this.k0 = new LinkedHashSet<>();
        f.h.b.c.s.e eVar = new f.h.b.c.s.e(this);
        this.H0 = eVar;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f1222f = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.f1225i = frameLayout2;
        LinearLayout linearLayout = new LinearLayout(context2);
        this.f1224h = linearLayout;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context2, null);
        this.G = appCompatTextView;
        linearLayout.setVisibility(8);
        frameLayout2.setVisibility(8);
        appCompatTextView.setVisibility(8);
        LayoutInflater from = LayoutInflater.from(context2);
        CheckableImageButton checkableImageButton = (CheckableImageButton) from.inflate(R.layout.design_text_input_end_icon, (ViewGroup) linearLayout, false);
        this.s0 = checkableImageButton;
        CheckableImageButton checkableImageButton2 = (CheckableImageButton) from.inflate(R.layout.design_text_input_end_icon, (ViewGroup) frameLayout2, false);
        this.j0 = checkableImageButton2;
        frameLayout.setAddStatesFromChildren(true);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        TimeInterpolator timeInterpolator = f.h.b.c.c.a.a;
        eVar.Q = timeInterpolator;
        eVar.k(false);
        eVar.P = timeInterpolator;
        eVar.k(false);
        eVar.n(8388659);
        int[] iArr = f.h.b.c.b.J;
        r.a(context2, attributeSet, R.attr.textInputStyle, com.arthenica.ffmpegkit.R.style.Widget_Design_TextInputLayout);
        r.b(context2, attributeSet, iArr, R.attr.textInputStyle, com.arthenica.ffmpegkit.R.style.Widget_Design_TextInputLayout, 22, 20, 35, 40, 44);
        z0 z0Var = new z0(context2, context2.obtainStyledAttributes(attributeSet, iArr, R.attr.textInputStyle, com.arthenica.ffmpegkit.R.style.Widget_Design_TextInputLayout));
        t tVar = new t(this, z0Var);
        this.f1223g = tVar;
        this.H = z0Var.a(43, true);
        setHint(z0Var.n(4));
        this.J0 = z0Var.a(42, true);
        this.I0 = z0Var.a(37, true);
        if (z0Var.o(6)) {
            setMinEms(z0Var.j(6, -1));
        } else if (z0Var.o(3)) {
            setMinWidth(z0Var.f(3, -1));
        }
        if (z0Var.o(5)) {
            setMaxEms(z0Var.j(5, -1));
        } else if (z0Var.o(2)) {
            setMaxWidth(z0Var.f(2, -1));
        }
        this.N = j.b(context2, attributeSet, R.attr.textInputStyle, com.arthenica.ffmpegkit.R.style.Widget_Design_TextInputLayout, new f.h.b.c.y.a(0)).a();
        this.P = context2.getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.R = z0Var.e(9, 0);
        this.T = z0Var.f(16, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_default));
        this.U = z0Var.f(17, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.S = this.T;
        float d2 = z0Var.d(13, -1.0f);
        float d3 = z0Var.d(12, -1.0f);
        float d4 = z0Var.d(10, -1.0f);
        float d5 = z0Var.d(11, -1.0f);
        j jVar = this.N;
        Objects.requireNonNull(jVar);
        j.b bVar = new j.b(jVar);
        if (d2 >= 0.0f) {
            bVar.f(d2);
        }
        if (d3 >= 0.0f) {
            bVar.g(d3);
        }
        if (d4 >= 0.0f) {
            bVar.e(d4);
        }
        if (d5 >= 0.0f) {
            bVar.d(d5);
        }
        this.N = bVar.a();
        ColorStateList o0 = f.h.b.c.a.o0(context2, z0Var, 7);
        if (o0 != null) {
            int defaultColor = o0.getDefaultColor();
            this.B0 = defaultColor;
            this.W = defaultColor;
            if (o0.isStateful()) {
                this.C0 = o0.getColorForState(new int[]{-16842910}, -1);
                this.D0 = o0.getColorForState(new int[]{16842908, 16842910}, -1);
                this.E0 = o0.getColorForState(new int[]{16843623, 16842910}, -1);
            } else {
                this.D0 = this.B0;
                ColorStateList colorStateList = e.i.c.a.getColorStateList(context2, R.color.mtrl_filled_background_color);
                this.C0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
                this.E0 = colorStateList.getColorForState(new int[]{16843623}, -1);
            }
        } else {
            this.W = 0;
            this.B0 = 0;
            this.C0 = 0;
            this.D0 = 0;
            this.E0 = 0;
        }
        if (z0Var.o(1)) {
            ColorStateList c2 = z0Var.c(1);
            this.w0 = c2;
            this.v0 = c2;
        }
        ColorStateList o02 = f.h.b.c.a.o0(context2, z0Var, 14);
        this.z0 = z0Var.b(14, 0);
        this.x0 = e.i.c.a.getColor(context2, R.color.mtrl_textinput_default_box_stroke_color);
        this.F0 = e.i.c.a.getColor(context2, R.color.mtrl_textinput_disabled_color);
        this.y0 = e.i.c.a.getColor(context2, R.color.mtrl_textinput_hovered_box_stroke_color);
        if (o02 != null) {
            setBoxStrokeColorStateList(o02);
        }
        if (z0Var.o(15)) {
            setBoxStrokeErrorColor(f.h.b.c.a.o0(context2, z0Var, 15));
        }
        if (z0Var.l(44, -1) != -1) {
            r6 = 0;
            setHintTextAppearance(z0Var.l(44, 0));
        } else {
            r6 = 0;
        }
        int l2 = z0Var.l(35, r6);
        CharSequence n = z0Var.n(30);
        boolean a2 = z0Var.a(31, r6);
        checkableImageButton.setId(R.id.text_input_error_icon);
        if (f.h.b.c.a.w0(context2)) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(r6);
        }
        if (z0Var.o(33)) {
            this.t0 = f.h.b.c.a.o0(context2, z0Var, 33);
        }
        if (z0Var.o(34)) {
            this.u0 = f.h.b.c.a.J0(z0Var.j(34, -1), null);
        }
        if (z0Var.o(32)) {
            setErrorIconDrawable(z0Var.g(32));
        }
        checkableImageButton.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        AtomicInteger atomicInteger = z.a;
        z.d.s(checkableImageButton, 2);
        checkableImageButton.setClickable(false);
        checkableImageButton.setPressable(false);
        checkableImageButton.setFocusable(false);
        int l3 = z0Var.l(40, 0);
        boolean a3 = z0Var.a(39, false);
        CharSequence n2 = z0Var.n(38);
        int l4 = z0Var.l(52, 0);
        CharSequence n3 = z0Var.n(51);
        int l5 = z0Var.l(65, 0);
        CharSequence n4 = z0Var.n(64);
        boolean a4 = z0Var.a(18, false);
        setCounterMaxLength(z0Var.j(19, -1));
        this.v = z0Var.l(22, 0);
        this.u = z0Var.l(20, 0);
        setBoxBackgroundMode(z0Var.j(8, 0));
        if (f.h.b.c.a.w0(context2)) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton2.getLayoutParams()).setMarginStart(0);
        }
        int l6 = z0Var.l(26, 0);
        sparseArray.append(-1, new f.h.b.c.b0.f(this, l6));
        sparseArray.append(0, new f.h.b.c.b0.r(this));
        if (l6 == 0) {
            view = tVar;
            i2 = z0Var.l(47, 0);
        } else {
            view = tVar;
            i2 = l6;
        }
        sparseArray.append(1, new s(this, i2));
        sparseArray.append(2, new f.h.b.c.b0.a(this, l6));
        sparseArray.append(3, new h(this, l6));
        if (!z0Var.o(48)) {
            if (z0Var.o(28)) {
                this.l0 = f.h.b.c.a.o0(context2, z0Var, 28);
            }
            if (z0Var.o(29)) {
                this.m0 = f.h.b.c.a.J0(z0Var.j(29, -1), null);
            }
        }
        if (z0Var.o(27)) {
            setEndIconMode(z0Var.j(27, 0));
            if (z0Var.o(25)) {
                setEndIconContentDescription(z0Var.n(25));
            }
            setEndIconCheckable(z0Var.a(24, true));
        } else if (z0Var.o(48)) {
            if (z0Var.o(49)) {
                this.l0 = f.h.b.c.a.o0(context2, z0Var, 49);
            }
            if (z0Var.o(50)) {
                this.m0 = f.h.b.c.a.J0(z0Var.j(50, -1), null);
            }
            setEndIconMode(z0Var.a(48, false) ? 1 : 0);
            setEndIconContentDescription(z0Var.n(46));
        }
        appCompatTextView.setId(R.id.textinput_suffix_text);
        appCompatTextView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 80));
        z.g.f(appCompatTextView, 1);
        setErrorContentDescription(n);
        setCounterOverflowTextAppearance(this.u);
        setHelperTextTextAppearance(l3);
        setErrorTextAppearance(l2);
        setCounterTextAppearance(this.v);
        setPlaceholderText(n3);
        setPlaceholderTextAppearance(l4);
        setSuffixTextAppearance(l5);
        if (z0Var.o(36)) {
            setErrorTextColor(z0Var.c(36));
        }
        if (z0Var.o(41)) {
            setHelperTextColor(z0Var.c(41));
        }
        if (z0Var.o(45)) {
            setHintTextColor(z0Var.c(45));
        }
        if (z0Var.o(23)) {
            setCounterTextColor(z0Var.c(23));
        }
        if (z0Var.o(21)) {
            setCounterOverflowTextColor(z0Var.c(21));
        }
        if (z0Var.o(53)) {
            setPlaceholderTextColor(z0Var.c(53));
        }
        if (z0Var.o(66)) {
            setSuffixTextColor(z0Var.c(66));
        }
        setEnabled(z0Var.a(0, true));
        z0Var.b.recycle();
        z.d.s(this, 2);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26 && i3 >= 26) {
            z.l.l(this, 1);
        }
        frameLayout2.addView(checkableImageButton2);
        linearLayout.addView(appCompatTextView);
        linearLayout.addView(checkableImageButton);
        linearLayout.addView(frameLayout2);
        frameLayout.addView(view);
        frameLayout.addView(linearLayout);
        addView(frameLayout);
        setHelperTextEnabled(a3);
        setErrorEnabled(a2);
        setCounterEnabled(a4);
        setHelperText(n2);
        setSuffixText(n4);
    }

    private m getEndIconDelegate() {
        m mVar = this.i0.get(this.h0);
        return mVar != null ? mVar : this.i0.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.s0.getVisibility() == 0) {
            return this.s0;
        }
        if (h() && j()) {
            return this.j0;
        }
        return null;
    }

    public static void n(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                n((ViewGroup) childAt, z);
            }
        }
    }

    public static void p(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        AtomicInteger atomicInteger = z.a;
        boolean a2 = z.c.a(checkableImageButton);
        boolean z = false;
        boolean z2 = onLongClickListener != null;
        z = (a2 || z2) ? true : true;
        checkableImageButton.setFocusable(z);
        checkableImageButton.setClickable(a2);
        checkableImageButton.setPressable(a2);
        checkableImageButton.setLongClickable(z2);
        z.d.s(checkableImageButton, z ? 1 : 2);
    }

    private void setEditText(EditText editText) {
        if (this.f1226j == null) {
            if (this.h0 != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.f1226j = editText;
            int i2 = this.f1228l;
            if (i2 != -1) {
                setMinEms(i2);
            } else {
                setMinWidth(this.n);
            }
            int i3 = this.f1229m;
            if (i3 != -1) {
                setMaxEms(i3);
            } else {
                setMaxWidth(this.o);
            }
            l();
            setTextInputAccessibilityDelegate(new e(this));
            this.H0.r(this.f1226j.getTypeface());
            f.h.b.c.s.e eVar = this.H0;
            float textSize = this.f1226j.getTextSize();
            if (eVar.f5405j != textSize) {
                eVar.f5405j = textSize;
                eVar.k(false);
            }
            f.h.b.c.s.e eVar2 = this.H0;
            float letterSpacing = this.f1226j.getLetterSpacing();
            if (eVar2.W != letterSpacing) {
                eVar2.W = letterSpacing;
                eVar2.k(false);
            }
            int gravity = this.f1226j.getGravity();
            this.H0.n((gravity & (-113)) | 48);
            f.h.b.c.s.e eVar3 = this.H0;
            if (eVar3.f5403h != gravity) {
                eVar3.f5403h = gravity;
                eVar3.k(false);
            }
            this.f1226j.addTextChangedListener(new a());
            if (this.v0 == null) {
                this.v0 = this.f1226j.getHintTextColors();
            }
            if (this.H) {
                if (TextUtils.isEmpty(this.I)) {
                    CharSequence hint = this.f1226j.getHint();
                    this.f1227k = hint;
                    setHint(hint);
                    this.f1226j.setHint((CharSequence) null);
                }
                this.J = true;
            }
            if (this.t != null) {
                s(this.f1226j.getText().length());
            }
            v();
            this.p.b();
            this.f1223g.bringToFront();
            this.f1224h.bringToFront();
            this.f1225i.bringToFront();
            this.s0.bringToFront();
            Iterator<f> it = this.g0.iterator();
            while (it.hasNext()) {
                it.next().a(this);
            }
            C();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            z(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.I)) {
            return;
        }
        this.I = charSequence;
        f.h.b.c.s.e eVar = this.H0;
        if (charSequence == null || !TextUtils.equals(eVar.B, charSequence)) {
            eVar.B = charSequence;
            eVar.C = null;
            Bitmap bitmap = eVar.E;
            if (bitmap != null) {
                bitmap.recycle();
                eVar.E = null;
            }
            eVar.k(false);
        }
        if (this.G0) {
            return;
        }
        m();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.x == z) {
            return;
        }
        if (z) {
            TextView textView = this.y;
            if (textView != null) {
                this.f1222f.addView(textView);
                this.y.setVisibility(0);
            }
        } else {
            TextView textView2 = this.y;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            this.y = null;
        }
        this.x = z;
    }

    public final void A(int i2) {
        if (i2 == 0 && !this.G0) {
            if (this.y == null || !this.x || TextUtils.isEmpty(this.w)) {
                return;
            }
            this.y.setText(this.w);
            l.a(this.f1222f, this.B);
            this.y.setVisibility(0);
            this.y.bringToFront();
            announceForAccessibility(this.w);
            return;
        }
        i();
    }

    public final void B(boolean z, boolean z2) {
        int defaultColor = this.A0.getDefaultColor();
        int colorForState = this.A0.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.A0.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z) {
            this.V = colorForState2;
        } else if (z2) {
            this.V = colorForState;
        } else {
            this.V = defaultColor;
        }
    }

    public final void C() {
        int i2;
        if (this.f1226j == null) {
            return;
        }
        if (j() || k()) {
            i2 = 0;
        } else {
            EditText editText = this.f1226j;
            AtomicInteger atomicInteger = z.a;
            i2 = z.e.e(editText);
        }
        TextView textView = this.G;
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = this.f1226j.getPaddingTop();
        int paddingBottom = this.f1226j.getPaddingBottom();
        AtomicInteger atomicInteger2 = z.a;
        z.e.k(textView, dimensionPixelSize, paddingTop, i2, paddingBottom);
    }

    public final void D() {
        int visibility = this.G.getVisibility();
        int i2 = (this.F == null || this.G0) ? 8 : 0;
        if (visibility != i2) {
            getEndIconDelegate().c(i2 == 0);
        }
        w();
        this.G.setVisibility(i2);
        u();
    }

    public void E() {
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.K == null || this.Q == 0) {
            return;
        }
        boolean z = false;
        boolean z2 = isFocused() || ((editText2 = this.f1226j) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f1226j) != null && editText.isHovered())) {
            z = true;
        }
        if (!isEnabled()) {
            this.V = this.F0;
        } else if (this.p.e()) {
            if (this.A0 != null) {
                B(z2, z);
            } else {
                this.V = this.p.g();
            }
        } else if (!this.s || (textView = this.t) == null) {
            if (z2) {
                this.V = this.z0;
            } else if (z) {
                this.V = this.y0;
            } else {
                this.V = this.x0;
            }
        } else if (this.A0 != null) {
            B(z2, z);
        } else {
            this.V = textView.getCurrentTextColor();
        }
        x();
        f.h.b.c.a.N0(this, this.s0, this.t0);
        t tVar = this.f1223g;
        f.h.b.c.a.N0(tVar.f5215f, tVar.f5218i, tVar.f5219j);
        o();
        if (getEndIconDelegate().d()) {
            if (this.p.e() && getEndIconDrawable() != null) {
                Drawable mutate = e.i.a.l0(getEndIconDrawable()).mutate();
                mutate.setTint(this.p.g());
                this.j0.setImageDrawable(mutate);
            } else {
                f.h.b.c.a.h(this, this.j0, this.l0, this.m0);
            }
        }
        if (this.Q == 2) {
            int i2 = this.S;
            if (z2 && isEnabled()) {
                this.S = this.U;
            } else {
                this.S = this.T;
            }
            if (this.S != i2 && e() && !this.G0) {
                if (e()) {
                    ((f.h.b.c.b0.g) this.K).A(0.0f, 0.0f, 0.0f, 0.0f);
                }
                m();
            }
        }
        if (this.Q == 1) {
            if (!isEnabled()) {
                this.W = this.C0;
            } else if (z && !z2) {
                this.W = this.E0;
            } else if (z2) {
                this.W = this.D0;
            } else {
                this.W = this.B0;
            }
        }
        c();
    }

    public void a(f fVar) {
        this.g0.add(fVar);
        if (this.f1226j != null) {
            fVar.a(this);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
            this.f1222f.addView(view, layoutParams2);
            this.f1222f.setLayoutParams(layoutParams);
            y();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i2, layoutParams);
    }

    public void b(float f2) {
        if (this.H0.c == f2) {
            return;
        }
        if (this.K0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.K0 = valueAnimator;
            valueAnimator.setInterpolator(f.h.b.c.c.a.b);
            this.K0.setDuration(167L);
            this.K0.addUpdateListener(new d());
        }
        this.K0.setFloatValues(this.H0.c, f2);
        this.K0.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c() {
        /*
            r7 = this;
            f.h.b.c.y.g r0 = r7.K
            if (r0 != 0) goto L5
            return
        L5:
            f.h.b.c.y.g$b r1 = r0.f5480f
            f.h.b.c.y.j r1 = r1.a
            f.h.b.c.y.j r2 = r7.N
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            if (r1 == r2) goto L4a
            r0.setShapeAppearanceModel(r2)
            int r0 = r7.h0
            if (r0 != r3) goto L4a
            int r0 = r7.Q
            if (r0 != r4) goto L4a
            android.util.SparseArray<f.h.b.c.b0.m> r0 = r7.i0
            java.lang.Object r0 = r0.get(r3)
            f.h.b.c.b0.h r0 = (f.h.b.c.b0.h) r0
            android.widget.EditText r1 = r7.f1226j
            android.widget.AutoCompleteTextView r1 = (android.widget.AutoCompleteTextView) r1
            java.util.Objects.requireNonNull(r0)
            android.text.method.KeyListener r2 = r1.getKeyListener()
            if (r2 == 0) goto L33
            r2 = 1
            goto L34
        L33:
            r2 = 0
        L34:
            if (r2 != 0) goto L4a
            com.google.android.material.textfield.TextInputLayout r2 = r0.a
            int r2 = r2.getBoxBackgroundMode()
            if (r2 != r4) goto L4a
            android.graphics.drawable.Drawable r2 = r1.getBackground()
            boolean r2 = r2 instanceof android.graphics.drawable.LayerDrawable
            if (r2 != 0) goto L47
            goto L4a
        L47:
            r0.j(r1)
        L4a:
            int r0 = r7.Q
            r1 = -1
            if (r0 != r4) goto L5e
            int r0 = r7.S
            if (r0 <= r1) goto L59
            int r0 = r7.V
            if (r0 == 0) goto L59
            r0 = 1
            goto L5a
        L59:
            r0 = 0
        L5a:
            if (r0 == 0) goto L5e
            r0 = 1
            goto L5f
        L5e:
            r0 = 0
        L5f:
            if (r0 == 0) goto L6b
            f.h.b.c.y.g r0 = r7.K
            int r2 = r7.S
            float r2 = (float) r2
            int r4 = r7.V
            r0.u(r2, r4)
        L6b:
            int r0 = r7.W
            int r2 = r7.Q
            if (r2 != r6) goto L82
            r0 = 2130968840(0x7f040108, float:1.7546345E38)
            android.content.Context r2 = r7.getContext()
            int r0 = f.h.b.c.a.l0(r2, r0, r5)
            int r2 = r7.W
            int r0 = e.i.d.a.b(r2, r0)
        L82:
            r7.W = r0
            f.h.b.c.y.g r2 = r7.K
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r2.r(r0)
            int r0 = r7.h0
            if (r0 != r3) goto L9a
            android.widget.EditText r0 = r7.f1226j
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            r0.invalidateSelf()
        L9a:
            f.h.b.c.y.g r0 = r7.L
            if (r0 == 0) goto Ld4
            f.h.b.c.y.g r2 = r7.M
            if (r2 != 0) goto La3
            goto Ld4
        La3:
            int r2 = r7.S
            if (r2 <= r1) goto Lac
            int r1 = r7.V
            if (r1 == 0) goto Lac
            r5 = 1
        Lac:
            if (r5 == 0) goto Ld1
            android.widget.EditText r1 = r7.f1226j
            boolean r1 = r1.isFocused()
            if (r1 == 0) goto Lbd
            int r1 = r7.x0
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            goto Lc3
        Lbd:
            int r1 = r7.V
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
        Lc3:
            r0.r(r1)
            f.h.b.c.y.g r0 = r7.M
            int r1 = r7.V
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.r(r1)
        Ld1:
            r7.invalidate()
        Ld4:
            r7.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.c():void");
    }

    public final int d() {
        float e2;
        if (this.H) {
            int i2 = this.Q;
            if (i2 == 0) {
                e2 = this.H0.e();
            } else if (i2 != 2) {
                return 0;
            } else {
                e2 = this.H0.e() / 2.0f;
            }
            return (int) e2;
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i2) {
        EditText editText = this.f1226j;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i2);
            return;
        }
        if (this.f1227k != null) {
            boolean z = this.J;
            this.J = false;
            CharSequence hint = editText.getHint();
            this.f1226j.setHint(this.f1227k);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i2);
                return;
            } finally {
                this.f1226j.setHint(hint);
                this.J = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i2);
        onProvideAutofillVirtualStructure(viewStructure, i2);
        viewStructure.setChildCount(this.f1222f.getChildCount());
        for (int i3 = 0; i3 < this.f1222f.getChildCount(); i3++) {
            View childAt = this.f1222f.getChildAt(i3);
            ViewStructure newChild = viewStructure.newChild(i3);
            childAt.dispatchProvideAutofillStructure(newChild, i2);
            if (childAt == this.f1226j) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.M0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.M0 = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        f.h.b.c.y.g gVar;
        super.draw(canvas);
        if (this.H) {
            f.h.b.c.s.e eVar = this.H0;
            Objects.requireNonNull(eVar);
            int save = canvas.save();
            if (eVar.C != null && eVar.b) {
                eVar.N.setTextSize(eVar.G);
                float f2 = eVar.r;
                float f3 = eVar.s;
                float f4 = eVar.F;
                if (f4 != 1.0f) {
                    canvas.scale(f4, f4, f2, f3);
                }
                if (eVar.s()) {
                    float lineStart = eVar.r - eVar.Y.getLineStart(0);
                    int alpha = eVar.N.getAlpha();
                    canvas.translate(lineStart, f3);
                    float f5 = alpha;
                    eVar.N.setAlpha((int) (eVar.b0 * f5));
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 31) {
                        TextPaint textPaint = eVar.N;
                        float f6 = eVar.H;
                        float f7 = eVar.I;
                        float f8 = eVar.J;
                        int i3 = eVar.K;
                        textPaint.setShadowLayer(f6, f7, f8, e.i.d.a.e(i3, (Color.alpha(i3) * textPaint.getAlpha()) / 255));
                    }
                    eVar.Y.draw(canvas);
                    eVar.N.setAlpha((int) (eVar.a0 * f5));
                    if (i2 >= 31) {
                        TextPaint textPaint2 = eVar.N;
                        float f9 = eVar.H;
                        float f10 = eVar.I;
                        float f11 = eVar.J;
                        int i4 = eVar.K;
                        textPaint2.setShadowLayer(f9, f10, f11, e.i.d.a.e(i4, (Color.alpha(i4) * textPaint2.getAlpha()) / 255));
                    }
                    int lineBaseline = eVar.Y.getLineBaseline(0);
                    CharSequence charSequence = eVar.c0;
                    float f12 = lineBaseline;
                    canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f12, eVar.N);
                    if (i2 >= 31) {
                        eVar.N.setShadowLayer(eVar.H, eVar.I, eVar.J, eVar.K);
                    }
                    String trim = eVar.c0.toString().trim();
                    if (trim.endsWith("…")) {
                        trim = trim.substring(0, trim.length() - 1);
                    }
                    String str = trim;
                    eVar.N.setAlpha(alpha);
                    canvas.drawText(str, 0, Math.min(eVar.Y.getLineEnd(0), str.length()), 0.0f, f12, (Paint) eVar.N);
                } else {
                    canvas.translate(f2, f3);
                    eVar.Y.draw(canvas);
                }
                canvas.restoreToCount(save);
            }
        }
        if (this.M == null || (gVar = this.L) == null) {
            return;
        }
        gVar.draw(canvas);
        if (this.f1226j.isFocused()) {
            Rect bounds = this.M.getBounds();
            Rect bounds2 = this.L.getBounds();
            float f13 = this.H0.c;
            int centerX = bounds2.centerX();
            bounds.left = f.h.b.c.c.a.c(centerX, bounds2.left, f13);
            bounds.right = f.h.b.c.c.a.c(centerX, bounds2.right, f13);
            this.M.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        boolean z;
        ColorStateList colorStateList;
        boolean z2;
        if (this.L0) {
            return;
        }
        boolean z3 = true;
        this.L0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        f.h.b.c.s.e eVar = this.H0;
        if (eVar != null) {
            eVar.L = drawableState;
            ColorStateList colorStateList2 = eVar.f5408m;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = eVar.f5407l) != null && colorStateList.isStateful())) {
                eVar.k(false);
                z2 = true;
            } else {
                z2 = false;
            }
            z = z2 | false;
        } else {
            z = false;
        }
        if (this.f1226j != null) {
            AtomicInteger atomicInteger = z.a;
            z((z.g.c(this) && isEnabled()) ? false : false, false);
        }
        v();
        E();
        if (z) {
            invalidate();
        }
        this.L0 = false;
    }

    public final boolean e() {
        return this.H && !TextUtils.isEmpty(this.I) && (this.K instanceof f.h.b.c.b0.g);
    }

    public final int f(int i2, boolean z) {
        int compoundPaddingLeft = this.f1226j.getCompoundPaddingLeft() + i2;
        return (getPrefixText() == null || z) ? compoundPaddingLeft : (compoundPaddingLeft - getPrefixTextView().getMeasuredWidth()) + getPrefixTextView().getPaddingLeft();
    }

    public final int g(int i2, boolean z) {
        int compoundPaddingRight = i2 - this.f1226j.getCompoundPaddingRight();
        return (getPrefixText() == null || !z) ? compoundPaddingRight : compoundPaddingRight + (getPrefixTextView().getMeasuredWidth() - getPrefixTextView().getPaddingRight());
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f1226j;
        if (editText != null) {
            return d() + getPaddingTop() + editText.getBaseline();
        }
        return super.getBaseline();
    }

    public f.h.b.c.y.g getBoxBackground() {
        int i2 = this.Q;
        if (i2 != 1 && i2 != 2) {
            throw new IllegalStateException();
        }
        return this.K;
    }

    public int getBoxBackgroundColor() {
        return this.W;
    }

    public int getBoxBackgroundMode() {
        return this.Q;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.R;
    }

    public float getBoxCornerRadiusBottomEnd() {
        if (f.h.b.c.a.y0(this)) {
            return this.N.f5503h.a(this.c0);
        }
        return this.N.f5502g.a(this.c0);
    }

    public float getBoxCornerRadiusBottomStart() {
        if (f.h.b.c.a.y0(this)) {
            return this.N.f5502g.a(this.c0);
        }
        return this.N.f5503h.a(this.c0);
    }

    public float getBoxCornerRadiusTopEnd() {
        if (f.h.b.c.a.y0(this)) {
            return this.N.f5500e.a(this.c0);
        }
        return this.N.f5501f.a(this.c0);
    }

    public float getBoxCornerRadiusTopStart() {
        if (f.h.b.c.a.y0(this)) {
            return this.N.f5501f.a(this.c0);
        }
        return this.N.f5500e.a(this.c0);
    }

    public int getBoxStrokeColor() {
        return this.z0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.A0;
    }

    public int getBoxStrokeWidth() {
        return this.T;
    }

    public int getBoxStrokeWidthFocused() {
        return this.U;
    }

    public int getCounterMaxLength() {
        return this.r;
    }

    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.q && this.s && (textView = this.t) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.D;
    }

    public ColorStateList getCounterTextColor() {
        return this.D;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.v0;
    }

    public EditText getEditText() {
        return this.f1226j;
    }

    public CharSequence getEndIconContentDescription() {
        return this.j0.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.j0.getDrawable();
    }

    public int getEndIconMode() {
        return this.h0;
    }

    public CheckableImageButton getEndIconView() {
        return this.j0;
    }

    public CharSequence getError() {
        n nVar = this.p;
        if (nVar.f5198k) {
            return nVar.f5197j;
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.p.f5200m;
    }

    public int getErrorCurrentTextColors() {
        return this.p.g();
    }

    public Drawable getErrorIconDrawable() {
        return this.s0.getDrawable();
    }

    public final int getErrorTextCurrentColor() {
        return this.p.g();
    }

    public CharSequence getHelperText() {
        n nVar = this.p;
        if (nVar.q) {
            return nVar.p;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        TextView textView = this.p.r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.H) {
            return this.I;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.H0.e();
    }

    public final int getHintCurrentCollapsedTextColor() {
        return this.H0.f();
    }

    public ColorStateList getHintTextColor() {
        return this.w0;
    }

    public int getMaxEms() {
        return this.f1229m;
    }

    public int getMaxWidth() {
        return this.o;
    }

    public int getMinEms() {
        return this.f1228l;
    }

    public int getMinWidth() {
        return this.n;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.j0.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.j0.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.x) {
            return this.w;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.A;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.z;
    }

    public CharSequence getPrefixText() {
        return this.f1223g.f5217h;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f1223g.f5216g.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f1223g.f5216g;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f1223g.f5218i.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f1223g.f5218i.getDrawable();
    }

    public CharSequence getSuffixText() {
        return this.F;
    }

    public ColorStateList getSuffixTextColor() {
        return this.G.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.G;
    }

    public Typeface getTypeface() {
        return this.d0;
    }

    public final boolean h() {
        return this.h0 != 0;
    }

    public final void i() {
        TextView textView = this.y;
        if (textView == null || !this.x) {
            return;
        }
        textView.setText((CharSequence) null);
        l.a(this.f1222f, this.C);
        this.y.setVisibility(4);
    }

    public boolean j() {
        return this.f1225i.getVisibility() == 0 && this.j0.getVisibility() == 0;
    }

    public final boolean k() {
        return this.s0.getVisibility() == 0;
    }

    public final void l() {
        int i2 = this.Q;
        if (i2 == 0) {
            this.K = null;
            this.L = null;
            this.M = null;
        } else if (i2 == 1) {
            this.K = new f.h.b.c.y.g(this.N);
            this.L = new f.h.b.c.y.g();
            this.M = new f.h.b.c.y.g();
        } else if (i2 == 2) {
            if (this.H && !(this.K instanceof f.h.b.c.b0.g)) {
                this.K = new f.h.b.c.b0.g(this.N);
            } else {
                this.K = new f.h.b.c.y.g(this.N);
            }
            this.L = null;
            this.M = null;
        } else {
            throw new IllegalArgumentException(f.a.b.a.a.t(new StringBuilder(), this.Q, " is illegal; only @BoxBackgroundMode constants are supported."));
        }
        EditText editText = this.f1226j;
        if ((editText == null || this.K == null || editText.getBackground() != null || this.Q == 0) ? false : true) {
            EditText editText2 = this.f1226j;
            f.h.b.c.y.g gVar = this.K;
            AtomicInteger atomicInteger = z.a;
            z.d.q(editText2, gVar);
        }
        E();
        if (this.Q == 1) {
            if (f.h.b.c.a.x0(getContext())) {
                this.R = getResources().getDimensionPixelSize(R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (f.h.b.c.a.w0(getContext())) {
                this.R = getResources().getDimensionPixelSize(R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.f1226j != null && this.Q == 1) {
            if (f.h.b.c.a.x0(getContext())) {
                EditText editText3 = this.f1226j;
                AtomicInteger atomicInteger2 = z.a;
                z.e.k(editText3, z.e.f(editText3), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_top), z.e.e(this.f1226j), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (f.h.b.c.a.w0(getContext())) {
                EditText editText4 = this.f1226j;
                AtomicInteger atomicInteger3 = z.a;
                z.e.k(editText4, z.e.f(editText4), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_top), z.e.e(this.f1226j), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.Q != 0) {
            y();
        }
    }

    public final void m() {
        float f2;
        float f3;
        float f4;
        float f5;
        int i2;
        int i3;
        if (e()) {
            RectF rectF = this.c0;
            f.h.b.c.s.e eVar = this.H0;
            int width = this.f1226j.getWidth();
            int gravity = this.f1226j.getGravity();
            boolean b2 = eVar.b(eVar.B);
            eVar.D = b2;
            if (gravity == 17 || (gravity & 7) == 1) {
                f2 = width / 2.0f;
                f3 = eVar.Z / 2.0f;
            } else {
                if ((gravity & 8388613) != 8388613 && (gravity & 5) != 5) {
                    Rect rect = eVar.f5401f;
                    if (b2) {
                        f2 = rect.right;
                        f3 = eVar.Z;
                    } else {
                        i3 = rect.left;
                        f4 = i3;
                    }
                } else {
                    Rect rect2 = eVar.f5401f;
                    if (b2) {
                        i3 = rect2.left;
                        f4 = i3;
                    } else {
                        f2 = rect2.right;
                        f3 = eVar.Z;
                    }
                }
                rectF.left = f4;
                Rect rect3 = eVar.f5401f;
                float f6 = rect3.top;
                rectF.top = f6;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f5 = (width / 2.0f) + (eVar.Z / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (b2) {
                        f5 = eVar.Z + f4;
                    } else {
                        i2 = rect3.right;
                        f5 = i2;
                    }
                } else if (b2) {
                    i2 = rect3.right;
                    f5 = i2;
                } else {
                    f5 = eVar.Z + f4;
                }
                rectF.right = f5;
                rectF.bottom = eVar.e() + f6;
                float f7 = rectF.left;
                float f8 = this.P;
                rectF.left = f7 - f8;
                rectF.right += f8;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.S);
                f.h.b.c.b0.g gVar = (f.h.b.c.b0.g) this.K;
                Objects.requireNonNull(gVar);
                gVar.A(rectF.left, rectF.top, rectF.right, rectF.bottom);
            }
            f4 = f2 - f3;
            rectF.left = f4;
            Rect rect32 = eVar.f5401f;
            float f62 = rect32.top;
            rectF.top = f62;
            if (gravity != 17) {
            }
            f5 = (width / 2.0f) + (eVar.Z / 2.0f);
            rectF.right = f5;
            rectF.bottom = eVar.e() + f62;
            float f72 = rectF.left;
            float f82 = this.P;
            rectF.left = f72 - f82;
            rectF.right += f82;
            rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.S);
            f.h.b.c.b0.g gVar2 = (f.h.b.c.b0.g) this.K;
            Objects.requireNonNull(gVar2);
            gVar2.A(rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
    }

    public void o() {
        f.h.b.c.a.N0(this, this.j0, this.l0);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.H0.i(configuration);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int compoundPaddingTop;
        int compoundPaddingBottom;
        super.onLayout(z, i2, i3, i4, i5);
        EditText editText = this.f1226j;
        if (editText != null) {
            Rect rect = this.a0;
            f.h.b.c.s.f.a(this, editText, rect);
            f.h.b.c.y.g gVar = this.L;
            if (gVar != null) {
                int i6 = rect.bottom;
                gVar.setBounds(rect.left, i6 - this.T, rect.right, i6);
            }
            f.h.b.c.y.g gVar2 = this.M;
            if (gVar2 != null) {
                int i7 = rect.bottom;
                gVar2.setBounds(rect.left, i7 - this.U, rect.right, i7);
            }
            if (this.H) {
                f.h.b.c.s.e eVar = this.H0;
                float textSize = this.f1226j.getTextSize();
                if (eVar.f5405j != textSize) {
                    eVar.f5405j = textSize;
                    eVar.k(false);
                }
                int gravity = this.f1226j.getGravity();
                this.H0.n((gravity & (-113)) | 48);
                f.h.b.c.s.e eVar2 = this.H0;
                if (eVar2.f5403h != gravity) {
                    eVar2.f5403h = gravity;
                    eVar2.k(false);
                }
                f.h.b.c.s.e eVar3 = this.H0;
                if (this.f1226j != null) {
                    Rect rect2 = this.b0;
                    boolean y0 = f.h.b.c.a.y0(this);
                    rect2.bottom = rect.bottom;
                    int i8 = this.Q;
                    if (i8 == 1) {
                        rect2.left = f(rect.left, y0);
                        rect2.top = rect.top + this.R;
                        rect2.right = g(rect.right, y0);
                    } else if (i8 != 2) {
                        rect2.left = f(rect.left, y0);
                        rect2.top = getPaddingTop();
                        rect2.right = g(rect.right, y0);
                    } else {
                        rect2.left = this.f1226j.getPaddingLeft() + rect.left;
                        rect2.top = rect.top - d();
                        rect2.right = rect.right - this.f1226j.getPaddingRight();
                    }
                    Objects.requireNonNull(eVar3);
                    int i9 = rect2.left;
                    int i10 = rect2.top;
                    int i11 = rect2.right;
                    int i12 = rect2.bottom;
                    if (!f.h.b.c.s.e.l(eVar3.f5401f, i9, i10, i11, i12)) {
                        eVar3.f5401f.set(i9, i10, i11, i12);
                        eVar3.M = true;
                        eVar3.j();
                    }
                    f.h.b.c.s.e eVar4 = this.H0;
                    if (this.f1226j != null) {
                        Rect rect3 = this.b0;
                        TextPaint textPaint = eVar4.O;
                        textPaint.setTextSize(eVar4.f5405j);
                        textPaint.setTypeface(eVar4.w);
                        textPaint.setLetterSpacing(eVar4.W);
                        float f2 = -eVar4.O.ascent();
                        rect3.left = this.f1226j.getCompoundPaddingLeft() + rect.left;
                        if (this.Q == 1 && this.f1226j.getMinLines() <= 1) {
                            compoundPaddingTop = (int) (rect.centerY() - (f2 / 2.0f));
                        } else {
                            compoundPaddingTop = rect.top + this.f1226j.getCompoundPaddingTop();
                        }
                        rect3.top = compoundPaddingTop;
                        rect3.right = rect.right - this.f1226j.getCompoundPaddingRight();
                        if (this.Q == 1 && this.f1226j.getMinLines() <= 1) {
                            compoundPaddingBottom = (int) (rect3.top + f2);
                        } else {
                            compoundPaddingBottom = rect.bottom - this.f1226j.getCompoundPaddingBottom();
                        }
                        rect3.bottom = compoundPaddingBottom;
                        int i13 = rect3.left;
                        int i14 = rect3.top;
                        int i15 = rect3.right;
                        if (!f.h.b.c.s.e.l(eVar4.f5400e, i13, i14, i15, compoundPaddingBottom)) {
                            eVar4.f5400e.set(i13, i14, i15, compoundPaddingBottom);
                            eVar4.M = true;
                            eVar4.j();
                        }
                        this.H0.k(false);
                        if (!e() || this.G0) {
                            return;
                        }
                        m();
                        return;
                    }
                    throw new IllegalStateException();
                }
                throw new IllegalStateException();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        EditText editText;
        int max;
        super.onMeasure(i2, i3);
        boolean z = false;
        if (this.f1226j != null && this.f1226j.getMeasuredHeight() < (max = Math.max(this.f1224h.getMeasuredHeight(), this.f1223g.getMeasuredHeight()))) {
            this.f1226j.setMinimumHeight(max);
            z = true;
        }
        boolean u = u();
        if (z || u) {
            this.f1226j.post(new c());
        }
        if (this.y != null && (editText = this.f1226j) != null) {
            this.y.setGravity(editText.getGravity());
            this.y.setPadding(this.f1226j.getCompoundPaddingLeft(), this.f1226j.getCompoundPaddingTop(), this.f1226j.getCompoundPaddingRight(), this.f1226j.getCompoundPaddingBottom());
        }
        C();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f348f);
        setError(savedState.f1230h);
        if (savedState.f1231i) {
            this.j0.post(new b());
        }
        setHint(savedState.f1232j);
        setHelperText(savedState.f1233k);
        setPlaceholderText(savedState.f1234l);
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        boolean z = false;
        boolean z2 = i2 == 1;
        boolean z3 = this.O;
        if (z2 != z3) {
            if (z2 && !z3) {
                z = true;
            }
            float a2 = this.N.f5500e.a(this.c0);
            float a3 = this.N.f5501f.a(this.c0);
            float a4 = this.N.f5503h.a(this.c0);
            float a5 = this.N.f5502g.a(this.c0);
            float f2 = z ? a2 : a3;
            if (z) {
                a2 = a3;
            }
            float f3 = z ? a4 : a5;
            if (z) {
                a4 = a5;
            }
            boolean y0 = f.h.b.c.a.y0(this);
            this.O = y0;
            float f4 = y0 ? a2 : f2;
            if (!y0) {
                f2 = a2;
            }
            float f5 = y0 ? a4 : f3;
            if (!y0) {
                f3 = a4;
            }
            f.h.b.c.y.g gVar = this.K;
            if (gVar != null && gVar.m() == f4) {
                f.h.b.c.y.g gVar2 = this.K;
                if (gVar2.f5480f.a.f5501f.a(gVar2.i()) == f2) {
                    f.h.b.c.y.g gVar3 = this.K;
                    if (gVar3.f5480f.a.f5503h.a(gVar3.i()) == f5) {
                        f.h.b.c.y.g gVar4 = this.K;
                        if (gVar4.f5480f.a.f5502g.a(gVar4.i()) == f3) {
                            return;
                        }
                    }
                }
            }
            j jVar = this.N;
            Objects.requireNonNull(jVar);
            j.b bVar = new j.b(jVar);
            bVar.f(f4);
            bVar.g(f2);
            bVar.d(f5);
            bVar.e(f3);
            this.N = bVar.a();
            c();
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (this.p.e()) {
            savedState.f1230h = getError();
        }
        savedState.f1231i = h() && this.j0.isChecked();
        savedState.f1232j = getHint();
        savedState.f1233k = getHelperText();
        savedState.f1234l = getPlaceholderText();
        return savedState;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
        if (r3.getTextColors().getDefaultColor() == (-65281)) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void q(android.widget.TextView r3, int r4) {
        /*
            r2 = this;
            r0 = 1
            e.i.a.b0(r3, r4)     // Catch: java.lang.Exception -> L1b
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L1b
            r1 = 23
            if (r4 < r1) goto L18
            android.content.res.ColorStateList r4 = r3.getTextColors()     // Catch: java.lang.Exception -> L1b
            int r4 = r4.getDefaultColor()     // Catch: java.lang.Exception -> L1b
            r1 = -65281(0xffffffffffff00ff, float:NaN)
            if (r4 != r1) goto L18
            goto L1c
        L18:
            r4 = 0
            r0 = 0
            goto L1c
        L1b:
        L1c:
            if (r0 == 0) goto L32
            r4 = 2131952083(0x7f1301d3, float:1.9540599E38)
            e.i.a.b0(r3, r4)
            android.content.Context r4 = r2.getContext()
            r0 = 2131099769(0x7f060079, float:1.78119E38)
            int r4 = e.i.c.a.getColor(r4, r0)
            r3.setTextColor(r4)
        L32:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.q(android.widget.TextView, int):void");
    }

    public final void r() {
        if (this.t != null) {
            EditText editText = this.f1226j;
            s(editText == null ? 0 : editText.getText().length());
        }
    }

    public void s(int i2) {
        boolean z = this.s;
        int i3 = this.r;
        if (i3 == -1) {
            this.t.setText(String.valueOf(i2));
            this.t.setContentDescription(null);
            this.s = false;
        } else {
            this.s = i2 > i3;
            Context context = getContext();
            this.t.setContentDescription(context.getString(this.s ? R.string.character_counter_overflowed_content_description : R.string.character_counter_content_description, Integer.valueOf(i2), Integer.valueOf(this.r)));
            if (z != this.s) {
                t();
            }
            e.i.h.a c2 = e.i.h.a.c();
            TextView textView = this.t;
            String string = getContext().getString(R.string.character_counter_pattern, Integer.valueOf(i2), Integer.valueOf(this.r));
            textView.setText(string != null ? c2.e(string, c2.c, true).toString() : null);
        }
        if (this.f1226j == null || z == this.s) {
            return;
        }
        z(false, false);
        E();
        v();
    }

    public void setBoxBackgroundColor(int i2) {
        if (this.W != i2) {
            this.W = i2;
            this.B0 = i2;
            this.D0 = i2;
            this.E0 = i2;
            c();
        }
    }

    public void setBoxBackgroundColorResource(int i2) {
        setBoxBackgroundColor(e.i.c.a.getColor(getContext(), i2));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.B0 = defaultColor;
        this.W = defaultColor;
        this.C0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.D0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.E0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        c();
    }

    public void setBoxBackgroundMode(int i2) {
        if (i2 == this.Q) {
            return;
        }
        this.Q = i2;
        if (this.f1226j != null) {
            l();
        }
    }

    public void setBoxCollapsedPaddingTop(int i2) {
        this.R = i2;
    }

    public void setBoxStrokeColor(int i2) {
        if (this.z0 != i2) {
            this.z0 = i2;
            E();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.x0 = colorStateList.getDefaultColor();
            this.F0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.y0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            this.z0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else if (this.z0 != colorStateList.getDefaultColor()) {
            this.z0 = colorStateList.getDefaultColor();
        }
        E();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.A0 != colorStateList) {
            this.A0 = colorStateList;
            E();
        }
    }

    public void setBoxStrokeWidth(int i2) {
        this.T = i2;
        E();
    }

    public void setBoxStrokeWidthFocused(int i2) {
        this.U = i2;
        E();
    }

    public void setBoxStrokeWidthFocusedResource(int i2) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i2));
    }

    public void setBoxStrokeWidthResource(int i2) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i2));
    }

    public void setCounterEnabled(boolean z) {
        if (this.q != z) {
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
                this.t = appCompatTextView;
                appCompatTextView.setId(R.id.textinput_counter);
                Typeface typeface = this.d0;
                if (typeface != null) {
                    this.t.setTypeface(typeface);
                }
                this.t.setMaxLines(1);
                this.p.a(this.t, 2);
                ((ViewGroup.MarginLayoutParams) this.t.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_counter_margin_start));
                t();
                r();
            } else {
                this.p.j(this.t, 2);
                this.t = null;
            }
            this.q = z;
        }
    }

    public void setCounterMaxLength(int i2) {
        if (this.r != i2) {
            if (i2 > 0) {
                this.r = i2;
            } else {
                this.r = -1;
            }
            if (this.q) {
                r();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i2) {
        if (this.u != i2) {
            this.u = i2;
            t();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.E != colorStateList) {
            this.E = colorStateList;
            t();
        }
    }

    public void setCounterTextAppearance(int i2) {
        if (this.v != i2) {
            this.v = i2;
            t();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.D != colorStateList) {
            this.D = colorStateList;
            t();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.v0 = colorStateList;
        this.w0 = colorStateList;
        if (this.f1226j != null) {
            z(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        n(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.j0.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.j0.setCheckable(z);
    }

    public void setEndIconContentDescription(int i2) {
        setEndIconContentDescription(i2 != 0 ? getResources().getText(i2) : null);
    }

    public void setEndIconDrawable(int i2) {
        setEndIconDrawable(i2 != 0 ? e.b.a.b(getContext(), i2) : null);
    }

    public void setEndIconMode(int i2) {
        int i3 = this.h0;
        if (i3 == i2) {
            return;
        }
        this.h0 = i2;
        Iterator<g> it = this.k0.iterator();
        while (it.hasNext()) {
            it.next().a(this, i3);
        }
        setEndIconVisible(i2 != 0);
        if (getEndIconDelegate().b(this.Q)) {
            getEndIconDelegate().a();
            f.h.b.c.a.h(this, this.j0, this.l0, this.m0);
            return;
        }
        StringBuilder A = f.a.b.a.a.A("The current box background mode ");
        A.append(this.Q);
        A.append(" is not supported by the end icon mode ");
        A.append(i2);
        throw new IllegalStateException(A.toString());
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.j0;
        View.OnLongClickListener onLongClickListener = this.q0;
        checkableImageButton.setOnClickListener(onClickListener);
        p(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.q0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.j0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        p(checkableImageButton, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.l0 != colorStateList) {
            this.l0 = colorStateList;
            f.h.b.c.a.h(this, this.j0, colorStateList, this.m0);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.m0 != mode) {
            this.m0 = mode;
            f.h.b.c.a.h(this, this.j0, this.l0, mode);
        }
    }

    public void setEndIconVisible(boolean z) {
        if (j() != z) {
            this.j0.setVisibility(z ? 0 : 8);
            w();
            C();
            u();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.p.f5198k) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            setErrorEnabled(true);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            n nVar = this.p;
            nVar.c();
            nVar.f5197j = charSequence;
            nVar.f5199l.setText(charSequence);
            int i2 = nVar.f5195h;
            if (i2 != 1) {
                nVar.f5196i = 1;
            }
            nVar.l(i2, nVar.f5196i, nVar.k(nVar.f5199l, charSequence));
            return;
        }
        this.p.i();
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        n nVar = this.p;
        nVar.f5200m = charSequence;
        TextView textView = nVar.f5199l;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        n nVar = this.p;
        if (nVar.f5198k == z) {
            return;
        }
        nVar.c();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(nVar.a, null);
            nVar.f5199l = appCompatTextView;
            appCompatTextView.setId(R.id.textinput_error);
            nVar.f5199l.setTextAlignment(5);
            Typeface typeface = nVar.u;
            if (typeface != null) {
                nVar.f5199l.setTypeface(typeface);
            }
            int i2 = nVar.n;
            nVar.n = i2;
            TextView textView = nVar.f5199l;
            if (textView != null) {
                nVar.b.q(textView, i2);
            }
            ColorStateList colorStateList = nVar.o;
            nVar.o = colorStateList;
            TextView textView2 = nVar.f5199l;
            if (textView2 != null && colorStateList != null) {
                textView2.setTextColor(colorStateList);
            }
            CharSequence charSequence = nVar.f5200m;
            nVar.f5200m = charSequence;
            TextView textView3 = nVar.f5199l;
            if (textView3 != null) {
                textView3.setContentDescription(charSequence);
            }
            nVar.f5199l.setVisibility(4);
            TextView textView4 = nVar.f5199l;
            AtomicInteger atomicInteger = z.a;
            z.g.f(textView4, 1);
            nVar.a(nVar.f5199l, 0);
        } else {
            nVar.i();
            nVar.j(nVar.f5199l, 0);
            nVar.f5199l = null;
            nVar.b.v();
            nVar.b.E();
        }
        nVar.f5198k = z;
    }

    public void setErrorIconDrawable(int i2) {
        setErrorIconDrawable(i2 != 0 ? e.b.a.b(getContext(), i2) : null);
        f.h.b.c.a.N0(this, this.s0, this.t0);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.s0;
        View.OnLongClickListener onLongClickListener = this.r0;
        checkableImageButton.setOnClickListener(onClickListener);
        p(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.r0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.s0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        p(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        if (this.t0 != colorStateList) {
            this.t0 = colorStateList;
            f.h.b.c.a.h(this, this.s0, colorStateList, this.u0);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        if (this.u0 != mode) {
            this.u0 = mode;
            f.h.b.c.a.h(this, this.s0, this.t0, mode);
        }
    }

    public void setErrorTextAppearance(int i2) {
        n nVar = this.p;
        nVar.n = i2;
        TextView textView = nVar.f5199l;
        if (textView != null) {
            nVar.b.q(textView, i2);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        n nVar = this.p;
        nVar.o = colorStateList;
        TextView textView = nVar.f5199l;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.I0 != z) {
            this.I0 = z;
            z(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (this.p.q) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!this.p.q) {
            setHelperTextEnabled(true);
        }
        n nVar = this.p;
        nVar.c();
        nVar.p = charSequence;
        nVar.r.setText(charSequence);
        int i2 = nVar.f5195h;
        if (i2 != 2) {
            nVar.f5196i = 2;
        }
        nVar.l(i2, nVar.f5196i, nVar.k(nVar.r, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        n nVar = this.p;
        nVar.t = colorStateList;
        TextView textView = nVar.r;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        n nVar = this.p;
        if (nVar.q == z) {
            return;
        }
        nVar.c();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(nVar.a, null);
            nVar.r = appCompatTextView;
            appCompatTextView.setId(R.id.textinput_helper_text);
            nVar.r.setTextAlignment(5);
            Typeface typeface = nVar.u;
            if (typeface != null) {
                nVar.r.setTypeface(typeface);
            }
            nVar.r.setVisibility(4);
            TextView textView = nVar.r;
            AtomicInteger atomicInteger = z.a;
            z.g.f(textView, 1);
            int i2 = nVar.s;
            nVar.s = i2;
            TextView textView2 = nVar.r;
            if (textView2 != null) {
                e.i.a.b0(textView2, i2);
            }
            ColorStateList colorStateList = nVar.t;
            nVar.t = colorStateList;
            TextView textView3 = nVar.r;
            if (textView3 != null && colorStateList != null) {
                textView3.setTextColor(colorStateList);
            }
            nVar.a(nVar.r, 1);
            nVar.r.setAccessibilityDelegate(new o(nVar));
        } else {
            nVar.c();
            int i3 = nVar.f5195h;
            if (i3 == 2) {
                nVar.f5196i = 0;
            }
            nVar.l(i3, nVar.f5196i, nVar.k(nVar.r, ""));
            nVar.j(nVar.r, 1);
            nVar.r = null;
            nVar.b.v();
            nVar.b.E();
        }
        nVar.q = z;
    }

    public void setHelperTextTextAppearance(int i2) {
        n nVar = this.p;
        nVar.s = i2;
        TextView textView = nVar.r;
        if (textView != null) {
            e.i.a.b0(textView, i2);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.H) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(RecyclerView.a0.FLAG_MOVED);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.J0 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.H) {
            this.H = z;
            if (!z) {
                this.J = false;
                if (!TextUtils.isEmpty(this.I) && TextUtils.isEmpty(this.f1226j.getHint())) {
                    this.f1226j.setHint(this.I);
                }
                setHintInternal(null);
            } else {
                CharSequence hint = this.f1226j.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.I)) {
                        setHint(hint);
                    }
                    this.f1226j.setHint((CharSequence) null);
                }
                this.J = true;
            }
            if (this.f1226j != null) {
                y();
            }
        }
    }

    public void setHintTextAppearance(int i2) {
        f.h.b.c.s.e eVar = this.H0;
        f.h.b.c.v.b bVar = new f.h.b.c.v.b(eVar.a.getContext(), i2);
        ColorStateList colorStateList = bVar.f5457j;
        if (colorStateList != null) {
            eVar.f5408m = colorStateList;
        }
        float f2 = bVar.f5458k;
        if (f2 != 0.0f) {
            eVar.f5406k = f2;
        }
        ColorStateList colorStateList2 = bVar.a;
        if (colorStateList2 != null) {
            eVar.U = colorStateList2;
        }
        eVar.S = bVar.f5452e;
        eVar.T = bVar.f5453f;
        eVar.R = bVar.f5454g;
        eVar.V = bVar.f5456i;
        f.h.b.c.v.a aVar = eVar.A;
        if (aVar != null) {
            aVar.c = true;
        }
        f.h.b.c.s.d dVar = new f.h.b.c.s.d(eVar);
        bVar.a();
        eVar.A = new f.h.b.c.v.a(dVar, bVar.n);
        bVar.c(eVar.a.getContext(), eVar.A);
        eVar.k(false);
        this.w0 = this.H0.f5408m;
        if (this.f1226j != null) {
            z(false, false);
            y();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.w0 != colorStateList) {
            if (this.v0 == null) {
                f.h.b.c.s.e eVar = this.H0;
                if (eVar.f5408m != colorStateList) {
                    eVar.f5408m = colorStateList;
                    eVar.k(false);
                }
            }
            this.w0 = colorStateList;
            if (this.f1226j != null) {
                z(false, false);
            }
        }
    }

    public void setMaxEms(int i2) {
        this.f1229m = i2;
        EditText editText = this.f1226j;
        if (editText == null || i2 == -1) {
            return;
        }
        editText.setMaxEms(i2);
    }

    public void setMaxWidth(int i2) {
        this.o = i2;
        EditText editText = this.f1226j;
        if (editText == null || i2 == -1) {
            return;
        }
        editText.setMaxWidth(i2);
    }

    public void setMaxWidthResource(int i2) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i2));
    }

    public void setMinEms(int i2) {
        this.f1228l = i2;
        EditText editText = this.f1226j;
        if (editText == null || i2 == -1) {
            return;
        }
        editText.setMinEms(i2);
    }

    public void setMinWidth(int i2) {
        this.n = i2;
        EditText editText = this.f1226j;
        if (editText == null || i2 == -1) {
            return;
        }
        editText.setMinWidth(i2);
    }

    public void setMinWidthResource(int i2) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i2));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i2) {
        setPasswordVisibilityToggleContentDescription(i2 != 0 ? getResources().getText(i2) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i2) {
        setPasswordVisibilityToggleDrawable(i2 != 0 ? e.b.a.b(getContext(), i2) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (z && this.h0 != 1) {
            setEndIconMode(1);
        } else if (z) {
        } else {
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.l0 = colorStateList;
        f.h.b.c.a.h(this, this.j0, colorStateList, this.m0);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.m0 = mode;
        f.h.b.c.a.h(this, this.j0, this.l0, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.y == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
            this.y = appCompatTextView;
            appCompatTextView.setId(R.id.textinput_placeholder);
            TextView textView = this.y;
            AtomicInteger atomicInteger = z.a;
            z.d.s(textView, 2);
            e.a0.c cVar = new e.a0.c();
            cVar.f1435h = 87L;
            TimeInterpolator timeInterpolator = f.h.b.c.c.a.a;
            cVar.f1436i = timeInterpolator;
            this.B = cVar;
            cVar.f1434g = 67L;
            e.a0.c cVar2 = new e.a0.c();
            cVar2.f1435h = 87L;
            cVar2.f1436i = timeInterpolator;
            this.C = cVar2;
            setPlaceholderTextAppearance(this.A);
            setPlaceholderTextColor(this.z);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.x) {
                setPlaceholderTextEnabled(true);
            }
            this.w = charSequence;
        }
        EditText editText = this.f1226j;
        A(editText != null ? editText.getText().length() : 0);
    }

    public void setPlaceholderTextAppearance(int i2) {
        this.A = i2;
        TextView textView = this.y;
        if (textView != null) {
            e.i.a.b0(textView, i2);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.z != colorStateList) {
            this.z = colorStateList;
            TextView textView = this.y;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.f1223g.a(charSequence);
    }

    public void setPrefixTextAppearance(int i2) {
        e.i.a.b0(this.f1223g.f5216g, i2);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f1223g.f5216g.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z) {
        this.f1223g.f5218i.setCheckable(z);
    }

    public void setStartIconContentDescription(int i2) {
        setStartIconContentDescription(i2 != 0 ? getResources().getText(i2) : null);
    }

    public void setStartIconDrawable(int i2) {
        setStartIconDrawable(i2 != 0 ? e.b.a.b(getContext(), i2) : null);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        t tVar = this.f1223g;
        CheckableImageButton checkableImageButton = tVar.f5218i;
        View.OnLongClickListener onLongClickListener = tVar.f5221l;
        checkableImageButton.setOnClickListener(onClickListener);
        f.h.b.c.a.U0(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        t tVar = this.f1223g;
        tVar.f5221l = onLongClickListener;
        CheckableImageButton checkableImageButton = tVar.f5218i;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        f.h.b.c.a.U0(checkableImageButton, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        t tVar = this.f1223g;
        if (tVar.f5219j != colorStateList) {
            tVar.f5219j = colorStateList;
            f.h.b.c.a.h(tVar.f5215f, tVar.f5218i, colorStateList, tVar.f5220k);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        t tVar = this.f1223g;
        if (tVar.f5220k != mode) {
            tVar.f5220k = mode;
            f.h.b.c.a.h(tVar.f5215f, tVar.f5218i, tVar.f5219j, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        this.f1223g.f(z);
    }

    public void setSuffixText(CharSequence charSequence) {
        this.F = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.G.setText(charSequence);
        D();
    }

    public void setSuffixTextAppearance(int i2) {
        e.i.a.b0(this.G, i2);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.G.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(e eVar) {
        EditText editText = this.f1226j;
        if (editText != null) {
            z.w(editText, eVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.d0) {
            this.d0 = typeface;
            this.H0.r(typeface);
            n nVar = this.p;
            if (typeface != nVar.u) {
                nVar.u = typeface;
                TextView textView = nVar.f5199l;
                if (textView != null) {
                    textView.setTypeface(typeface);
                }
                TextView textView2 = nVar.r;
                if (textView2 != null) {
                    textView2.setTypeface(typeface);
                }
            }
            TextView textView3 = this.t;
            if (textView3 != null) {
                textView3.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.t;
        if (textView != null) {
            q(textView, this.s ? this.u : this.v);
            if (!this.s && (colorStateList2 = this.D) != null) {
                this.t.setTextColor(colorStateList2);
            }
            if (!this.s || (colorStateList = this.E) == null) {
                return;
            }
            this.t.setTextColor(colorStateList);
        }
    }

    public boolean u() {
        boolean z;
        if (this.f1226j == null) {
            return false;
        }
        boolean z2 = true;
        if ((getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.f1223g.getMeasuredWidth() > 0) {
            int measuredWidth = this.f1223g.getMeasuredWidth() - this.f1226j.getPaddingLeft();
            if (this.e0 == null || this.f0 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.e0 = colorDrawable;
                this.f0 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] compoundDrawablesRelative = this.f1226j.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative[0];
            Drawable drawable2 = this.e0;
            if (drawable != drawable2) {
                this.f1226j.setCompoundDrawablesRelative(drawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                z = true;
            }
            z = false;
        } else {
            if (this.e0 != null) {
                Drawable[] compoundDrawablesRelative2 = this.f1226j.getCompoundDrawablesRelative();
                this.f1226j.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                this.e0 = null;
                z = true;
            }
            z = false;
        }
        if ((this.s0.getVisibility() == 0 || ((h() && j()) || this.F != null)) && this.f1224h.getMeasuredWidth() > 0) {
            int measuredWidth2 = this.G.getMeasuredWidth() - this.f1226j.getPaddingRight();
            CheckableImageButton endIconToUpdateDummyDrawable = getEndIconToUpdateDummyDrawable();
            if (endIconToUpdateDummyDrawable != null) {
                measuredWidth2 = ((ViewGroup.MarginLayoutParams) endIconToUpdateDummyDrawable.getLayoutParams()).getMarginStart() + endIconToUpdateDummyDrawable.getMeasuredWidth() + measuredWidth2;
            }
            Drawable[] compoundDrawablesRelative3 = this.f1226j.getCompoundDrawablesRelative();
            Drawable drawable3 = this.n0;
            if (drawable3 != null && this.o0 != measuredWidth2) {
                this.o0 = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                this.f1226j.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.n0, compoundDrawablesRelative3[3]);
            } else {
                if (drawable3 == null) {
                    ColorDrawable colorDrawable2 = new ColorDrawable();
                    this.n0 = colorDrawable2;
                    this.o0 = measuredWidth2;
                    colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable4 = compoundDrawablesRelative3[2];
                Drawable drawable5 = this.n0;
                if (drawable4 != drawable5) {
                    this.p0 = compoundDrawablesRelative3[2];
                    this.f1226j.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], drawable5, compoundDrawablesRelative3[3]);
                } else {
                    z2 = z;
                }
            }
        } else if (this.n0 == null) {
            return z;
        } else {
            Drawable[] compoundDrawablesRelative4 = this.f1226j.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative4[2] == this.n0) {
                this.f1226j.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.p0, compoundDrawablesRelative4[3]);
            } else {
                z2 = z;
            }
            this.n0 = null;
        }
        return z2;
    }

    public void v() {
        Drawable background;
        TextView textView;
        EditText editText = this.f1226j;
        if (editText == null || this.Q != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (e0.a(background)) {
            background = background.mutate();
        }
        if (this.p.e()) {
            background.setColorFilter(i.c(this.p.g(), PorterDuff.Mode.SRC_IN));
        } else if (this.s && (textView = this.t) != null) {
            background.setColorFilter(i.c(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            e.i.a.m(background);
            this.f1226j.refreshDrawableState();
        }
    }

    public final void w() {
        this.f1225i.setVisibility((this.j0.getVisibility() != 0 || k()) ? 8 : 0);
        this.f1224h.setVisibility(j() || k() || ((this.F == null || this.G0) ? '\b' : (char) 0) == 0 ? 0 : 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x() {
        /*
            r3 = this;
            android.graphics.drawable.Drawable r0 = r3.getErrorIconDrawable()
            r1 = 0
            if (r0 == 0) goto L15
            f.h.b.c.b0.n r0 = r3.p
            boolean r2 = r0.f5198k
            if (r2 == 0) goto L15
            boolean r0 = r0.e()
            if (r0 == 0) goto L15
            r0 = 1
            goto L16
        L15:
            r0 = 0
        L16:
            com.google.android.material.internal.CheckableImageButton r2 = r3.s0
            if (r0 == 0) goto L1b
            goto L1d
        L1b:
            r1 = 8
        L1d:
            r2.setVisibility(r1)
            r3.w()
            r3.C()
            boolean r0 = r3.h()
            if (r0 != 0) goto L2f
            r3.u()
        L2f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.x():void");
    }

    public final void y() {
        if (this.Q != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f1222f.getLayoutParams();
            int d2 = d();
            if (d2 != layoutParams.topMargin) {
                layoutParams.topMargin = d2;
                this.f1222f.requestLayout();
            }
        }
    }

    public final void z(boolean z, boolean z2) {
        ColorStateList colorStateList;
        TextView textView;
        int i2;
        boolean isEnabled = isEnabled();
        EditText editText = this.f1226j;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f1226j;
        boolean z4 = editText2 != null && editText2.hasFocus();
        boolean e2 = this.p.e();
        ColorStateList colorStateList2 = this.v0;
        if (colorStateList2 != null) {
            f.h.b.c.s.e eVar = this.H0;
            if (eVar.f5408m != colorStateList2) {
                eVar.f5408m = colorStateList2;
                eVar.k(false);
            }
            f.h.b.c.s.e eVar2 = this.H0;
            ColorStateList colorStateList3 = this.v0;
            if (eVar2.f5407l != colorStateList3) {
                eVar2.f5407l = colorStateList3;
                eVar2.k(false);
            }
        }
        if (!isEnabled) {
            ColorStateList colorStateList4 = this.v0;
            if (colorStateList4 != null) {
                i2 = colorStateList4.getColorForState(new int[]{-16842910}, this.F0);
            } else {
                i2 = this.F0;
            }
            this.H0.m(ColorStateList.valueOf(i2));
            f.h.b.c.s.e eVar3 = this.H0;
            ColorStateList valueOf = ColorStateList.valueOf(i2);
            if (eVar3.f5407l != valueOf) {
                eVar3.f5407l = valueOf;
                eVar3.k(false);
            }
        } else if (e2) {
            f.h.b.c.s.e eVar4 = this.H0;
            TextView textView2 = this.p.f5199l;
            eVar4.m(textView2 != null ? textView2.getTextColors() : null);
        } else if (this.s && (textView = this.t) != null) {
            this.H0.m(textView.getTextColors());
        } else if (z4 && (colorStateList = this.w0) != null) {
            f.h.b.c.s.e eVar5 = this.H0;
            if (eVar5.f5408m != colorStateList) {
                eVar5.f5408m = colorStateList;
                eVar5.k(false);
            }
        }
        if (!z3 && this.I0 && (!isEnabled() || !z4)) {
            if (z2 || !this.G0) {
                ValueAnimator valueAnimator = this.K0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.K0.cancel();
                }
                if (z && this.J0) {
                    b(0.0f);
                } else {
                    this.H0.p(0.0f);
                }
                if (e() && (!((f.h.b.c.b0.g) this.K).F.isEmpty()) && e()) {
                    ((f.h.b.c.b0.g) this.K).A(0.0f, 0.0f, 0.0f, 0.0f);
                }
                this.G0 = true;
                i();
                t tVar = this.f1223g;
                tVar.f5222m = true;
                tVar.h();
                D();
            }
        } else if (z2 || this.G0) {
            ValueAnimator valueAnimator2 = this.K0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.K0.cancel();
            }
            if (z && this.J0) {
                b(1.0f);
            } else {
                this.H0.p(1.0f);
            }
            this.G0 = false;
            if (e()) {
                m();
            }
            EditText editText3 = this.f1226j;
            A(editText3 == null ? 0 : editText3.getText().length());
            t tVar2 = this.f1223g;
            tVar2.f5222m = false;
            tVar2.h();
            D();
        }
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.j0.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.j0.setImageDrawable(drawable);
        if (drawable != null) {
            f.h.b.c.a.h(this, this.j0, this.l0, this.m0);
            o();
        }
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        t tVar = this.f1223g;
        if (tVar.f5218i.getContentDescription() != charSequence) {
            tVar.f5218i.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f1223g.c(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.s0.setImageDrawable(drawable);
        x();
        f.h.b.c.a.h(this, this.s0, this.t0, this.u0);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.j0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.j0.setImageDrawable(drawable);
    }

    public void setHint(int i2) {
        setHint(i2 != 0 ? getResources().getText(i2) : null);
    }
}
