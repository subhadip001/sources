package f.h.b.c.d;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import e.i.j.f0;
import e.i.j.z;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: HeaderScrollingViewBehavior.java */
/* loaded from: classes.dex */
public abstract class g extends h<View> {
    public final Rect c;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f5238d;

    /* renamed from: e  reason: collision with root package name */
    public int f5239e;

    /* renamed from: f  reason: collision with root package name */
    public int f5240f;

    public g() {
        this.c = new Rect();
        this.f5238d = new Rect();
        this.f5239e = 0;
    }

    @Override // f.h.b.c.d.h
    public void C(CoordinatorLayout coordinatorLayout, View view, int i2) {
        AppBarLayout F = ((AppBarLayout.ScrollingViewBehavior) this).F(coordinatorLayout.e(view));
        if (F != null) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
            Rect rect = this.c;
            rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, F.getBottom() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, ((F.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
            f0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null) {
                AtomicInteger atomicInteger = z.a;
                if (z.d.b(coordinatorLayout) && !z.d.b(view)) {
                    rect.left = lastWindowInsets.d() + rect.left;
                    rect.right -= lastWindowInsets.e();
                }
            }
            Rect rect2 = this.f5238d;
            int i3 = fVar.c;
            Gravity.apply(i3 == 0 ? 8388659 : i3, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i2);
            int E = E(F);
            view.layout(rect2.left, rect2.top - E, rect2.right, rect2.bottom - E);
            this.f5239e = rect2.top - F.getBottom();
            return;
        }
        coordinatorLayout.s(view, i2);
        this.f5239e = 0;
    }

    public final int E(View view) {
        int i2;
        if (this.f5240f == 0) {
            return 0;
        }
        float f2 = 0.0f;
        if (view instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int totalScrollRange = appBarLayout.getTotalScrollRange();
            int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
            CoordinatorLayout.c cVar = ((CoordinatorLayout.f) appBarLayout.getLayoutParams()).a;
            int E = cVar instanceof AppBarLayout.BaseBehavior ? ((AppBarLayout.BaseBehavior) cVar).E() : 0;
            if ((downNestedPreScrollRange == 0 || totalScrollRange + E > downNestedPreScrollRange) && (i2 = totalScrollRange - downNestedPreScrollRange) != 0) {
                f2 = 1.0f + (E / i2);
            }
        }
        int i3 = this.f5240f;
        return e.i.a.l((int) (f2 * i3), 0, i3);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4, int i5) {
        f0 lastWindowInsets;
        int i6 = view.getLayoutParams().height;
        if (i6 == -1 || i6 == -2) {
            AppBarLayout F = ((AppBarLayout.ScrollingViewBehavior) this).F(coordinatorLayout.e(view));
            if (F != null) {
                int size = View.MeasureSpec.getSize(i4);
                if (size > 0) {
                    AtomicInteger atomicInteger = z.a;
                    if (z.d.b(F) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                        size += lastWindowInsets.c() + lastWindowInsets.f();
                    }
                } else {
                    size = coordinatorLayout.getHeight();
                }
                coordinatorLayout.t(view, i2, i3, View.MeasureSpec.makeMeasureSpec((size + F.getTotalScrollRange()) - F.getMeasuredHeight(), i6 == -1 ? CommonUtils.BYTES_IN_A_GIGABYTE : Integer.MIN_VALUE), i5);
                return true;
            }
            return false;
        }
        return false;
    }

    public g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new Rect();
        this.f5238d = new Rect();
        this.f5239e = 0;
    }
}
