package f.h.b.c.b0;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.video_converter.video_compressor.R;
import e.i.j.z;
import f.h.b.c.y.g;
import f.h.b.c.y.j;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: DropdownMenuEndIconDelegate.java */
/* loaded from: classes.dex */
public class h extends m {

    /* renamed from: e  reason: collision with root package name */
    public final TextWatcher f5171e;

    /* renamed from: f  reason: collision with root package name */
    public final View.OnFocusChangeListener f5172f;

    /* renamed from: g  reason: collision with root package name */
    public final TextInputLayout.e f5173g;

    /* renamed from: h  reason: collision with root package name */
    public final TextInputLayout.f f5174h;

    /* renamed from: i  reason: collision with root package name */
    public final TextInputLayout.g f5175i;

    /* renamed from: j  reason: collision with root package name */
    public final View.OnAttachStateChangeListener f5176j;

    /* renamed from: k  reason: collision with root package name */
    public final e.i.j.h0.b f5177k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f5178l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f5179m;
    public long n;
    public StateListDrawable o;
    public f.h.b.c.y.g p;
    public AccessibilityManager q;
    public ValueAnimator r;
    public ValueAnimator s;

    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* loaded from: classes.dex */
    public class a extends f.h.b.c.s.q {

        /* compiled from: DropdownMenuEndIconDelegate.java */
        /* renamed from: f.h.b.c.b0.h$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0118a implements Runnable {

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ AutoCompleteTextView f5181f;

            public RunnableC0118a(AutoCompleteTextView autoCompleteTextView) {
                this.f5181f = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean isPopupShowing = this.f5181f.isPopupShowing();
                h.g(h.this, isPopupShowing);
                h.this.f5178l = isPopupShowing;
            }
        }

        public a() {
        }

        @Override // f.h.b.c.s.q, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            AutoCompleteTextView e2 = h.e(h.this.a.getEditText());
            if (h.this.q.isTouchExplorationEnabled() && h.f(e2) && !h.this.c.hasFocus()) {
                e2.dismissDropDown();
            }
            e2.post(new RunnableC0118a(e2));
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* loaded from: classes.dex */
    public class b implements View.OnFocusChangeListener {
        public b() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            h.this.a.setEndIconActivated(z);
            if (z) {
                return;
            }
            h.g(h.this, false);
            h.this.f5178l = false;
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* loaded from: classes.dex */
    public class c extends TextInputLayout.e {
        public c(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        @Override // com.google.android.material.textfield.TextInputLayout.e, e.i.j.c
        public void d(View view, e.i.j.h0.d dVar) {
            boolean z;
            super.d(view, dVar);
            if (!h.f(h.this.a.getEditText())) {
                dVar.a.setClassName(Spinner.class.getName());
            }
            if (Build.VERSION.SDK_INT >= 26) {
                z = dVar.a.isShowingHintText();
            } else {
                Bundle h2 = dVar.h();
                z = h2 != null && (h2.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & 4) == 4;
            }
            if (z) {
                dVar.o(null);
            }
        }

        @Override // e.i.j.c
        public void e(View view, AccessibilityEvent accessibilityEvent) {
            this.a.onPopulateAccessibilityEvent(view, accessibilityEvent);
            AutoCompleteTextView e2 = h.e(h.this.a.getEditText());
            if (accessibilityEvent.getEventType() == 1 && h.this.q.isEnabled() && !h.f(h.this.a.getEditText())) {
                h.h(h.this, e2);
                h.i(h.this);
            }
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* loaded from: classes.dex */
    public class d implements TextInputLayout.f {
        public d() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            AutoCompleteTextView e2 = h.e(textInputLayout.getEditText());
            h hVar = h.this;
            int boxBackgroundMode = hVar.a.getBoxBackgroundMode();
            if (boxBackgroundMode == 2) {
                e2.setDropDownBackgroundDrawable(hVar.p);
            } else if (boxBackgroundMode == 1) {
                e2.setDropDownBackgroundDrawable(hVar.o);
            }
            h.this.j(e2);
            h hVar2 = h.this;
            Objects.requireNonNull(hVar2);
            e2.setOnTouchListener(new l(hVar2, e2));
            e2.setOnFocusChangeListener(hVar2.f5172f);
            e2.setOnDismissListener(new i(hVar2));
            e2.setThreshold(0);
            e2.removeTextChangedListener(h.this.f5171e);
            e2.addTextChangedListener(h.this.f5171e);
            textInputLayout.setEndIconCheckable(true);
            textInputLayout.setErrorIconDrawable((Drawable) null);
            if (!(e2.getKeyListener() != null) && h.this.q.isTouchExplorationEnabled()) {
                CheckableImageButton checkableImageButton = h.this.c;
                AtomicInteger atomicInteger = z.a;
                z.d.s(checkableImageButton, 2);
            }
            textInputLayout.setTextInputAccessibilityDelegate(h.this.f5173g);
            textInputLayout.setEndIconVisible(true);
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* loaded from: classes.dex */
    public class e implements TextInputLayout.g {

        /* compiled from: DropdownMenuEndIconDelegate.java */
        /* loaded from: classes.dex */
        public class a implements Runnable {

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ AutoCompleteTextView f5184f;

            public a(AutoCompleteTextView autoCompleteTextView) {
                this.f5184f = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f5184f.removeTextChangedListener(h.this.f5171e);
            }
        }

        public e() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(TextInputLayout textInputLayout, int i2) {
            e.i.j.h0.b bVar;
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText();
            if (autoCompleteTextView != null && i2 == 3) {
                autoCompleteTextView.post(new a(autoCompleteTextView));
                if (autoCompleteTextView.getOnFocusChangeListener() == h.this.f5172f) {
                    autoCompleteTextView.setOnFocusChangeListener(null);
                }
                autoCompleteTextView.setOnTouchListener(null);
                autoCompleteTextView.setOnDismissListener(null);
            }
            if (i2 == 3) {
                textInputLayout.removeOnAttachStateChangeListener(h.this.f5176j);
                h hVar = h.this;
                AccessibilityManager accessibilityManager = hVar.q;
                if (accessibilityManager == null || (bVar = hVar.f5177k) == null) {
                    return;
                }
                accessibilityManager.removeTouchExplorationStateChangeListener(new e.i.j.h0.c(bVar));
            }
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* loaded from: classes.dex */
    public class f implements View.OnAttachStateChangeListener {
        public f() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            h.this.k();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            e.i.j.h0.b bVar;
            h hVar = h.this;
            AccessibilityManager accessibilityManager = hVar.q;
            if (accessibilityManager == null || (bVar = hVar.f5177k) == null) {
                return;
            }
            accessibilityManager.removeTouchExplorationStateChangeListener(new e.i.j.h0.c(bVar));
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* loaded from: classes.dex */
    public class g implements e.i.j.h0.b {
        public g() {
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* renamed from: f.h.b.c.b0.h$h  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC0119h implements View.OnClickListener {
        public View$OnClickListenerC0119h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            h.h(h.this, (AutoCompleteTextView) h.this.a.getEditText());
        }
    }

    public h(TextInputLayout textInputLayout, int i2) {
        super(textInputLayout, i2);
        this.f5171e = new a();
        this.f5172f = new b();
        this.f5173g = new c(this.a);
        this.f5174h = new d();
        this.f5175i = new e();
        this.f5176j = new f();
        this.f5177k = new g();
        this.f5178l = false;
        this.f5179m = false;
        this.n = Long.MAX_VALUE;
    }

    public static AutoCompleteTextView e(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    public static boolean f(EditText editText) {
        return editText.getKeyListener() != null;
    }

    public static void g(h hVar, boolean z) {
        if (hVar.f5179m != z) {
            hVar.f5179m = z;
            hVar.s.cancel();
            hVar.r.start();
        }
    }

    public static void h(h hVar, AutoCompleteTextView autoCompleteTextView) {
        Objects.requireNonNull(hVar);
        if (autoCompleteTextView == null) {
            return;
        }
        if (hVar.m()) {
            hVar.f5178l = false;
        }
        if (!hVar.f5178l) {
            boolean z = hVar.f5179m;
            boolean z2 = !z;
            if (z != z2) {
                hVar.f5179m = z2;
                hVar.s.cancel();
                hVar.r.start();
            }
            if (hVar.f5179m) {
                autoCompleteTextView.requestFocus();
                autoCompleteTextView.showDropDown();
                return;
            }
            autoCompleteTextView.dismissDropDown();
            return;
        }
        hVar.f5178l = false;
    }

    public static void i(h hVar) {
        hVar.f5178l = true;
        hVar.n = System.currentTimeMillis();
    }

    @Override // f.h.b.c.b0.m
    public void a() {
        float dimensionPixelOffset = this.b.getResources().getDimensionPixelOffset(R.dimen.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = this.b.getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = this.b.getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        f.h.b.c.y.g l2 = l(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        f.h.b.c.y.g l3 = l(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.p = l2;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.o = stateListDrawable;
        stateListDrawable.addState(new int[]{16842922}, l2);
        this.o.addState(new int[0], l3);
        int i2 = this.f5190d;
        if (i2 == 0) {
            i2 = R.drawable.mtrl_dropdown_arrow;
        }
        this.a.setEndIconDrawable(i2);
        TextInputLayout textInputLayout = this.a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R.string.exposed_dropdown_menu_content_description));
        this.a.setEndIconOnClickListener(new View$OnClickListenerC0119h());
        this.a.a(this.f5174h);
        this.a.k0.add(this.f5175i);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = f.h.b.c.c.a.a;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(67);
        ofFloat.addUpdateListener(new k(this));
        this.s = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(50);
        ofFloat2.addUpdateListener(new k(this));
        this.r = ofFloat2;
        ofFloat2.addListener(new j(this));
        this.q = (AccessibilityManager) this.b.getSystemService("accessibility");
        this.a.addOnAttachStateChangeListener(this.f5176j);
        k();
    }

    @Override // f.h.b.c.b0.m
    public boolean b(int i2) {
        return i2 != 0;
    }

    @Override // f.h.b.c.b0.m
    public boolean d() {
        return true;
    }

    public final void j(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView.getKeyListener() != null) {
            return;
        }
        int boxBackgroundMode = this.a.getBoxBackgroundMode();
        f.h.b.c.y.g boxBackground = this.a.getBoxBackground();
        int m0 = f.h.b.c.a.m0(autoCompleteTextView, R.attr.colorControlHighlight);
        int[][] iArr = {new int[]{16842919}, new int[0]};
        if (boxBackgroundMode != 2) {
            if (boxBackgroundMode == 1) {
                int boxBackgroundColor = this.a.getBoxBackgroundColor();
                RippleDrawable rippleDrawable = new RippleDrawable(new ColorStateList(iArr, new int[]{f.h.b.c.a.D0(m0, boxBackgroundColor, 0.1f), boxBackgroundColor}), boxBackground, boxBackground);
                AtomicInteger atomicInteger = z.a;
                z.d.q(autoCompleteTextView, rippleDrawable);
                return;
            }
            return;
        }
        int m02 = f.h.b.c.a.m0(autoCompleteTextView, R.attr.colorSurface);
        f.h.b.c.y.g gVar = new f.h.b.c.y.g(boxBackground.f5480f.a);
        int D0 = f.h.b.c.a.D0(m0, m02, 0.1f);
        gVar.r(new ColorStateList(iArr, new int[]{D0, 0}));
        gVar.setTint(m02);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{D0, m02});
        f.h.b.c.y.g gVar2 = new f.h.b.c.y.g(boxBackground.f5480f.a);
        gVar2.setTint(-1);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar, gVar2), boxBackground});
        AtomicInteger atomicInteger2 = z.a;
        z.d.q(autoCompleteTextView, layerDrawable);
    }

    public final void k() {
        TextInputLayout textInputLayout;
        if (this.q == null || (textInputLayout = this.a) == null) {
            return;
        }
        AtomicInteger atomicInteger = z.a;
        if (z.g.b(textInputLayout)) {
            AccessibilityManager accessibilityManager = this.q;
            e.i.j.h0.b bVar = this.f5177k;
            if (bVar == null) {
                return;
            }
            accessibilityManager.addTouchExplorationStateChangeListener(new e.i.j.h0.c(bVar));
        }
    }

    public final f.h.b.c.y.g l(float f2, float f3, float f4, int i2) {
        j.b bVar = new j.b();
        bVar.f5509e = new f.h.b.c.y.a(f2);
        bVar.f5510f = new f.h.b.c.y.a(f2);
        bVar.f5512h = new f.h.b.c.y.a(f3);
        bVar.f5511g = new f.h.b.c.y.a(f3);
        f.h.b.c.y.j a2 = bVar.a();
        Context context = this.b;
        String str = f.h.b.c.y.g.C;
        int R0 = f.h.b.c.a.R0(context, R.attr.colorSurface, f.h.b.c.y.g.class.getSimpleName());
        f.h.b.c.y.g gVar = new f.h.b.c.y.g();
        gVar.f5480f.b = new f.h.b.c.p.a(context);
        gVar.z();
        gVar.r(ColorStateList.valueOf(R0));
        g.b bVar2 = gVar.f5480f;
        if (bVar2.o != f4) {
            bVar2.o = f4;
            gVar.z();
        }
        gVar.f5480f.a = a2;
        gVar.invalidateSelf();
        g.b bVar3 = gVar.f5480f;
        if (bVar3.f5493i == null) {
            bVar3.f5493i = new Rect();
        }
        gVar.f5480f.f5493i.set(0, i2, 0, i2);
        gVar.invalidateSelf();
        return gVar;
    }

    public final boolean m() {
        long currentTimeMillis = System.currentTimeMillis() - this.n;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }
}
