package f.h.b.c.b0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import com.google.android.material.textfield.TextInputLayout;
import com.video_converter.video_compressor.R;
import e.b.h.j0;
import java.util.Locale;

/* compiled from: MaterialAutoCompleteTextView.java */
/* loaded from: classes.dex */
public class q extends e.b.h.d {

    /* renamed from: j  reason: collision with root package name */
    public final j0 f5204j;

    /* renamed from: k  reason: collision with root package name */
    public final AccessibilityManager f5205k;

    /* renamed from: l  reason: collision with root package name */
    public final Rect f5206l;

    /* renamed from: m  reason: collision with root package name */
    public final int f5207m;

    public q(Context context, AttributeSet attributeSet) {
        super(f.h.b.c.c0.a.a.a(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet, R.attr.autoCompleteTextViewStyle);
        this.f5206l = new Rect();
        Context context2 = getContext();
        TypedArray d2 = f.h.b.c.s.r.d(context2, attributeSet, f.h.b.c.b.o, R.attr.autoCompleteTextViewStyle, 2131952420, new int[0]);
        if (d2.hasValue(0) && d2.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.f5207m = d2.getResourceId(1, R.layout.mtrl_auto_complete_simple_item);
        this.f5205k = (AccessibilityManager) context2.getSystemService("accessibility");
        j0 j0Var = new j0(context2, null, R.attr.listPopupWindowStyle, 0);
        this.f5204j = j0Var;
        j0Var.s(true);
        j0Var.u = this;
        j0Var.E.setInputMethodMode(2);
        j0Var.p(getAdapter());
        j0Var.v = new p(this);
        if (d2.hasValue(2)) {
            setSimpleItems(d2.getResourceId(2, 0));
        }
        d2.recycle();
    }

    public static void a(q qVar, Object obj) {
        qVar.setText(qVar.convertSelectionToString(obj), false);
    }

    public final TextInputLayout b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout b = b();
        if (b != null && b.J) {
            return b.getHint();
        }
        return super.getHint();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout b = b();
        if (b != null && b.J && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint("");
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout b = b();
            int i4 = 0;
            if (adapter != null && b != null) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                j0 j0Var = this.f5204j;
                int min = Math.min(adapter.getCount(), Math.max(0, !j0Var.a() ? -1 : j0Var.f1799h.getSelectedItemPosition()) + 15);
                View view = null;
                int i5 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i4) {
                        view = null;
                        i4 = itemViewType;
                    }
                    view = adapter.getView(max, view, b);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i5 = Math.max(i5, view.getMeasuredWidth());
                }
                Drawable g2 = this.f5204j.g();
                if (g2 != null) {
                    g2.getPadding(this.f5206l);
                    Rect rect = this.f5206l;
                    i5 += rect.left + rect.right;
                }
                i4 = b.getEndIconView().getMeasuredWidth() + i5;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i4), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.f5204j.p(getAdapter());
    }

    public void setSimpleItems(int i2) {
        setSimpleItems(getResources().getStringArray(i2));
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        AccessibilityManager accessibilityManager = this.f5205k;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            this.f5204j.h();
        } else {
            super.showDropDown();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new ArrayAdapter(getContext(), this.f5207m, strArr));
    }
}
