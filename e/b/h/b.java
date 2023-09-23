package e.b.h;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.ActionMenuView;
import com.video_converter.video_compressor.R;

/* compiled from: AbsActionBarView.java */
/* loaded from: classes.dex */
public abstract class b extends ViewGroup {

    /* renamed from: f  reason: collision with root package name */
    public final a f1713f;

    /* renamed from: g  reason: collision with root package name */
    public final Context f1714g;

    /* renamed from: h  reason: collision with root package name */
    public ActionMenuView f1715h;

    /* renamed from: i  reason: collision with root package name */
    public ActionMenuPresenter f1716i;

    /* renamed from: j  reason: collision with root package name */
    public int f1717j;

    /* renamed from: k  reason: collision with root package name */
    public e.i.j.b0 f1718k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f1719l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1720m;

    /* compiled from: AbsActionBarView.java */
    /* loaded from: classes.dex */
    public class a implements e.i.j.c0 {
        public boolean a = false;
        public int b;

        public a() {
        }

        @Override // e.i.j.c0
        public void a(View view) {
            this.a = true;
        }

        @Override // e.i.j.c0
        public void b(View view) {
            if (this.a) {
                return;
            }
            b bVar = b.this;
            bVar.f1718k = null;
            b.super.setVisibility(this.b);
        }

        @Override // e.i.j.c0
        public void c(View view) {
            b.super.setVisibility(0);
            this.a = false;
        }
    }

    public b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public int c(View view, int i2, int i3, int i4) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE), i3);
        return Math.max(0, (i2 - view.getMeasuredWidth()) - i4);
    }

    public int d(View view, int i2, int i3, int i4, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i5 = ((i4 - measuredHeight) / 2) + i3;
        if (z) {
            view.layout(i2 - measuredWidth, i5, i2, measuredHeight + i5);
        } else {
            view.layout(i2, i5, i2 + measuredWidth, measuredHeight + i5);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public e.i.j.b0 e(int i2, long j2) {
        e.i.j.b0 b0Var = this.f1718k;
        if (b0Var != null) {
            b0Var.b();
        }
        if (i2 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            e.i.j.b0 b = e.i.j.z.b(this);
            b.a(1.0f);
            b.c(j2);
            a aVar = this.f1713f;
            b.this.f1718k = b;
            aVar.b = i2;
            View view = b.a.get();
            if (view != null) {
                b.e(view, aVar);
            }
            return b;
        }
        e.i.j.b0 b2 = e.i.j.z.b(this);
        b2.a(0.0f);
        b2.c(j2);
        a aVar2 = this.f1713f;
        b.this.f1718k = b2;
        aVar2.b = i2;
        View view2 = b2.a.get();
        if (view2 != null) {
            b2.e(view2, aVar2);
        }
        return b2;
    }

    public int getAnimatedVisibility() {
        if (this.f1718k != null) {
            return this.f1713f.b;
        }
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f1717j;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, e.b.b.a, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.f1716i;
        if (actionMenuPresenter != null) {
            Configuration configuration2 = actionMenuPresenter.f1616g.getResources().getConfiguration();
            int i2 = configuration2.screenWidthDp;
            int i3 = configuration2.screenHeightDp;
            actionMenuPresenter.v = (configuration2.smallestScreenWidthDp > 600 || i2 > 600 || (i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960)) ? 5 : (i2 >= 500 || (i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640)) ? 4 : i2 >= 360 ? 3 : 2;
            e.b.g.i.g gVar = actionMenuPresenter.f1617h;
            if (gVar != null) {
                gVar.q(true);
            }
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1720m = false;
        }
        if (!this.f1720m) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1720m = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1720m = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1719l = false;
        }
        if (!this.f1719l) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1719l = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1719l = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i2);

    @Override // android.view.View
    public void setVisibility(int i2) {
        if (i2 != getVisibility()) {
            e.i.j.b0 b0Var = this.f1718k;
            if (b0Var != null) {
                b0Var.b();
            }
            super.setVisibility(i2);
        }
    }

    public b(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f1713f = new a();
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            this.f1714g = new ContextThemeWrapper(context, typedValue.resourceId);
        } else {
            this.f1714g = context;
        }
    }
}
