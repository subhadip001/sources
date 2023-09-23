package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.api.Api;
import com.video_converter.video_compressor.R;
import e.b.b;
import e.b.h.c;
import e.b.h.s0;
import e.i.j.z;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: f  reason: collision with root package name */
    public boolean f121f;

    /* renamed from: g  reason: collision with root package name */
    public View f122g;

    /* renamed from: h  reason: collision with root package name */
    public View f123h;

    /* renamed from: i  reason: collision with root package name */
    public View f124i;

    /* renamed from: j  reason: collision with root package name */
    public Drawable f125j;

    /* renamed from: k  reason: collision with root package name */
    public Drawable f126k;

    /* renamed from: l  reason: collision with root package name */
    public Drawable f127l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f128m;
    public boolean n;
    public int o;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c cVar = new c(this);
        AtomicInteger atomicInteger = z.a;
        z.d.q(this, cVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.a);
        boolean z = false;
        this.f125j = obtainStyledAttributes.getDrawable(0);
        this.f126k = obtainStyledAttributes.getDrawable(2);
        this.o = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f128m = true;
            this.f127l = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f128m ? !(this.f125j != null || this.f126k != null) : this.f127l == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    public final int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public final boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f125j;
        if (drawable != null && drawable.isStateful()) {
            this.f125j.setState(getDrawableState());
        }
        Drawable drawable2 = this.f126k;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f126k.setState(getDrawableState());
        }
        Drawable drawable3 = this.f127l;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f127l.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f122g;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f125j;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f126k;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f127l;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f123h = findViewById(R.id.action_bar);
        this.f124i = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f121f || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        Drawable drawable;
        super.onLayout(z, i2, i3, i4, i5);
        View view = this.f122g;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = (view == null || view.getVisibility() == 8) ? false : true;
        if (view != null && view.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            int i6 = ((FrameLayout.LayoutParams) view.getLayoutParams()).bottomMargin;
            view.layout(i2, (measuredHeight - view.getMeasuredHeight()) - i6, i4, measuredHeight - i6);
        }
        if (this.f128m) {
            Drawable drawable2 = this.f127l;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.f125j != null) {
                if (this.f123h.getVisibility() == 0) {
                    this.f125j.setBounds(this.f123h.getLeft(), this.f123h.getTop(), this.f123h.getRight(), this.f123h.getBottom());
                } else {
                    View view2 = this.f124i;
                    if (view2 != null && view2.getVisibility() == 0) {
                        this.f125j.setBounds(this.f124i.getLeft(), this.f124i.getTop(), this.f124i.getRight(), this.f124i.getBottom());
                    } else {
                        this.f125j.setBounds(0, 0, 0, 0);
                    }
                }
                z3 = true;
            }
            this.n = z4;
            if (!z4 || (drawable = this.f126k) == null) {
                z2 = z3;
            } else {
                drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
        }
        if (z2) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        int a;
        int i4;
        if (this.f123h == null && View.MeasureSpec.getMode(i3) == Integer.MIN_VALUE && (i4 = this.o) >= 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(Math.min(i4, View.MeasureSpec.getSize(i3)), Integer.MIN_VALUE);
        }
        super.onMeasure(i2, i3);
        if (this.f123h == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i3);
        View view = this.f122g;
        if (view == null || view.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        if (!b(this.f123h)) {
            a = a(this.f123h);
        } else {
            a = !b(this.f124i) ? a(this.f124i) : 0;
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min(a(this.f122g) + a, mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i3) : Api.BaseClientBuilder.API_PRIORITY_OTHER));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f125j;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f125j);
        }
        this.f125j = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f123h;
            if (view != null) {
                this.f125j.setBounds(view.getLeft(), this.f123h.getTop(), this.f123h.getRight(), this.f123h.getBottom());
            }
        }
        boolean z = true;
        if (!this.f128m ? this.f125j != null || this.f126k != null : this.f127l != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f127l;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f127l);
        }
        this.f127l = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f128m && (drawable2 = this.f127l) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f128m ? !(this.f125j != null || this.f126k != null) : this.f127l == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f126k;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f126k);
        }
        this.f126k = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.n && (drawable2 = this.f126k) != null) {
                drawable2.setBounds(this.f122g.getLeft(), this.f122g.getTop(), this.f122g.getRight(), this.f122g.getBottom());
            }
        }
        boolean z = true;
        if (!this.f128m ? this.f125j != null || this.f126k != null : this.f127l != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(s0 s0Var) {
        View view = this.f122g;
        if (view != null) {
            removeView(view);
        }
        this.f122g = s0Var;
        if (s0Var != null) {
            addView(s0Var);
            ViewGroup.LayoutParams layoutParams = s0Var.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            s0Var.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.f121f = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z = i2 == 0;
        Drawable drawable = this.f125j;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f126k;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f127l;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i2) {
        if (i2 != 0) {
            return super.startActionModeForChild(view, callback, i2);
        }
        return null;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f125j && !this.f128m) || (drawable == this.f126k && this.n) || ((drawable == this.f127l && this.f128m) || super.verifyDrawable(drawable));
    }
}
