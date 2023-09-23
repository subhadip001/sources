package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.video_converter.video_compressor.R;
import e.b.g.i.g;
import e.b.g.i.n;
import e.b.h.b;
import e.b.h.f1;
import e.i.j.z;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class ActionBarContextView extends b {
    public CharSequence n;
    public CharSequence o;
    public View p;
    public View q;
    public View r;
    public LinearLayout s;
    public TextView t;
    public TextView u;
    public int v;
    public int w;
    public boolean x;
    public int y;

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ e.b.g.a f129f;

        public a(ActionBarContextView actionBarContextView, e.b.g.a aVar) {
            this.f129f = aVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f129f.c();
        }
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        Drawable drawable;
        int resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.b.b.f1458d, R.attr.actionModeStyle, 0);
        if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
            drawable = e.b.a.b(context, resourceId);
        } else {
            drawable = obtainStyledAttributes.getDrawable(0);
        }
        AtomicInteger atomicInteger = z.a;
        z.d.q(this, drawable);
        this.v = obtainStyledAttributes.getResourceId(5, 0);
        this.w = obtainStyledAttributes.getResourceId(4, 0);
        this.f1717j = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.y = obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    public void f(e.b.g.a aVar) {
        View view = this.p;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.y, (ViewGroup) this, false);
            this.p = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.p);
        }
        View findViewById = this.p.findViewById(R.id.action_mode_close_button);
        this.q = findViewById;
        findViewById.setOnClickListener(new a(this, aVar));
        g gVar = (g) aVar.e();
        ActionMenuPresenter actionMenuPresenter = this.f1716i;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.a();
        }
        ActionMenuPresenter actionMenuPresenter2 = new ActionMenuPresenter(getContext());
        this.f1716i = actionMenuPresenter2;
        actionMenuPresenter2.r = true;
        actionMenuPresenter2.s = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        gVar.b(this.f1716i, this.f1714g);
        ActionMenuPresenter actionMenuPresenter3 = this.f1716i;
        n nVar = actionMenuPresenter3.f1622m;
        if (nVar == null) {
            n nVar2 = (n) actionMenuPresenter3.f1618i.inflate(actionMenuPresenter3.f1620k, (ViewGroup) this, false);
            actionMenuPresenter3.f1622m = nVar2;
            nVar2.b(actionMenuPresenter3.f1617h);
            actionMenuPresenter3.c(true);
        }
        n nVar3 = actionMenuPresenter3.f1622m;
        if (nVar != nVar3) {
            ((ActionMenuView) nVar3).setPresenter(actionMenuPresenter3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) nVar3;
        this.f1715h = actionMenuView;
        AtomicInteger atomicInteger = z.a;
        z.d.q(actionMenuView, null);
        addView(this.f1715h, layoutParams);
    }

    public final void g() {
        if (this.s == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.s = linearLayout;
            this.t = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.u = (TextView) this.s.findViewById(R.id.action_bar_subtitle);
            if (this.v != 0) {
                this.t.setTextAppearance(getContext(), this.v);
            }
            if (this.w != 0) {
                this.u.setTextAppearance(getContext(), this.w);
            }
        }
        this.t.setText(this.n);
        this.u.setText(this.o);
        boolean z = !TextUtils.isEmpty(this.n);
        boolean z2 = !TextUtils.isEmpty(this.o);
        int i2 = 0;
        this.u.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout2 = this.s;
        if (!z && !z2) {
            i2 = 8;
        }
        linearLayout2.setVisibility(i2);
        if (this.s.getParent() == null) {
            addView(this.s);
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // e.b.h.b
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // e.b.h.b
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.o;
    }

    public CharSequence getTitle() {
        return this.n;
    }

    public void h() {
        removeAllViews();
        this.r = null;
        this.f1715h = null;
        this.f1716i = null;
        View view = this.q;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.f1716i;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.k();
            this.f1716i.n();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        boolean b = f1.b(this);
        int paddingRight = b ? (i4 - i2) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
        View view = this.p;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.p.getLayoutParams();
            int i6 = b ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i7 = b ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i8 = b ? paddingRight - i6 : paddingRight + i6;
            int d2 = i8 + d(this.p, i8, paddingTop, paddingTop2, b);
            paddingRight = b ? d2 - i7 : d2 + i7;
        }
        int i9 = paddingRight;
        LinearLayout linearLayout = this.s;
        if (linearLayout != null && this.r == null && linearLayout.getVisibility() != 8) {
            i9 += d(this.s, i9, paddingTop, paddingTop2, b);
        }
        int i10 = i9;
        View view2 = this.r;
        if (view2 != null) {
            d(view2, i10, paddingTop, paddingTop2, b);
        }
        int paddingLeft = b ? getPaddingLeft() : (i4 - i2) - getPaddingRight();
        ActionMenuView actionMenuView = this.f1715h;
        if (actionMenuView != null) {
            d(actionMenuView, paddingLeft, paddingTop, paddingTop2, !b);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int i4 = CommonUtils.BYTES_IN_A_GIGABYTE;
        if (mode == 1073741824) {
            if (View.MeasureSpec.getMode(i3) != 0) {
                int size = View.MeasureSpec.getSize(i2);
                int i5 = this.f1717j;
                if (i5 <= 0) {
                    i5 = View.MeasureSpec.getSize(i3);
                }
                int paddingBottom = getPaddingBottom() + getPaddingTop();
                int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
                int i6 = i5 - paddingBottom;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE);
                View view = this.p;
                if (view != null) {
                    int c = c(view, paddingLeft, makeMeasureSpec, 0);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.p.getLayoutParams();
                    paddingLeft = c - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
                }
                ActionMenuView actionMenuView = this.f1715h;
                if (actionMenuView != null && actionMenuView.getParent() == this) {
                    paddingLeft = c(this.f1715h, paddingLeft, makeMeasureSpec, 0);
                }
                LinearLayout linearLayout = this.s;
                if (linearLayout != null && this.r == null) {
                    if (this.x) {
                        this.s.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                        int measuredWidth = this.s.getMeasuredWidth();
                        boolean z = measuredWidth <= paddingLeft;
                        if (z) {
                            paddingLeft -= measuredWidth;
                        }
                        this.s.setVisibility(z ? 0 : 8);
                    } else {
                        paddingLeft = c(linearLayout, paddingLeft, makeMeasureSpec, 0);
                    }
                }
                View view2 = this.r;
                if (view2 != null) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    int i7 = layoutParams.width;
                    int i8 = i7 != -2 ? CommonUtils.BYTES_IN_A_GIGABYTE : Integer.MIN_VALUE;
                    if (i7 >= 0) {
                        paddingLeft = Math.min(i7, paddingLeft);
                    }
                    int i9 = layoutParams.height;
                    if (i9 == -2) {
                        i4 = Integer.MIN_VALUE;
                    }
                    if (i9 >= 0) {
                        i6 = Math.min(i9, i6);
                    }
                    this.r.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i8), View.MeasureSpec.makeMeasureSpec(i6, i4));
                }
                if (this.f1717j <= 0) {
                    int childCount = getChildCount();
                    int i10 = 0;
                    for (int i11 = 0; i11 < childCount; i11++) {
                        int measuredHeight = getChildAt(i11).getMeasuredHeight() + paddingBottom;
                        if (measuredHeight > i10) {
                            i10 = measuredHeight;
                        }
                    }
                    setMeasuredDimension(size, i10);
                    return;
                }
                setMeasuredDimension(size, i5);
                return;
            }
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
    }

    @Override // e.b.h.b
    public void setContentHeight(int i2) {
        this.f1717j = i2;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.r;
        if (view2 != null) {
            removeView(view2);
        }
        this.r = view;
        if (view != null && (linearLayout = this.s) != null) {
            removeView(linearLayout);
            this.s = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.o = charSequence;
        g();
    }

    public void setTitle(CharSequence charSequence) {
        this.n = charSequence;
        g();
        z.x(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.x) {
            requestLayout();
        }
        this.x = z;
    }

    @Override // e.b.h.b, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i2) {
        super.setVisibility(i2);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
