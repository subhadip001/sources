package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.video_converter.video_compressor.R;
import e.i.j.z;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {
    public static final Handler a = new Handler(Looper.getMainLooper(), new a());

    /* loaded from: classes.dex */
    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: i  reason: collision with root package name */
        public final b f1180i = new b(this);

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean B(View view) {
            Objects.requireNonNull(this.f1180i);
            return view instanceof c;
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            Objects.requireNonNull(this.f1180i);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    f.h.b.c.z.b a = f.h.b.c.z.b.a();
                    synchronized (a.a) {
                        a.b(null);
                    }
                }
            } else if (coordinatorLayout.q(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                f.h.b.c.z.b a2 = f.h.b.c.z.b.a();
                synchronized (a2.a) {
                    a2.b(null);
                }
            }
            return super.j(coordinatorLayout, view, motionEvent);
        }
    }

    /* loaded from: classes.dex */
    public class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 0) {
                Objects.requireNonNull((BaseTransientBottomBar) message.obj);
                throw null;
            } else if (i2 != 1) {
                return false;
            } else {
                Objects.requireNonNull((BaseTransientBottomBar) message.obj);
                throw null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public b(SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.f1074f = SwipeDismissBehavior.C(0.0f, 0.1f, 1.0f);
            swipeDismissBehavior.f1075g = SwipeDismissBehavior.C(0.0f, 0.6f, 1.0f);
            swipeDismissBehavior.f1072d = 0;
        }
    }

    /* loaded from: classes.dex */
    public static class c extends FrameLayout {
        public static final View.OnTouchListener p = new a();

        /* renamed from: f  reason: collision with root package name */
        public BaseTransientBottomBar<?> f1181f;

        /* renamed from: g  reason: collision with root package name */
        public int f1182g;

        /* renamed from: h  reason: collision with root package name */
        public final float f1183h;

        /* renamed from: i  reason: collision with root package name */
        public final float f1184i;

        /* renamed from: j  reason: collision with root package name */
        public final int f1185j;

        /* renamed from: k  reason: collision with root package name */
        public final int f1186k;

        /* renamed from: l  reason: collision with root package name */
        public ColorStateList f1187l;

        /* renamed from: m  reason: collision with root package name */
        public PorterDuff.Mode f1188m;
        public Rect n;
        public boolean o;

        /* loaded from: classes.dex */
        public class a implements View.OnTouchListener {
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        public c(Context context, AttributeSet attributeSet) {
            super(f.h.b.c.c0.a.a.a(context, attributeSet, 0, 0), attributeSet);
            Drawable l0;
            Context context2 = getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, f.h.b.c.b.F);
            if (obtainStyledAttributes.hasValue(6)) {
                AtomicInteger atomicInteger = z.a;
                z.i.s(this, obtainStyledAttributes.getDimensionPixelSize(6, 0));
            }
            this.f1182g = obtainStyledAttributes.getInt(2, 0);
            this.f1183h = obtainStyledAttributes.getFloat(3, 1.0f);
            setBackgroundTintList(f.h.b.c.a.n0(context2, obtainStyledAttributes, 4));
            setBackgroundTintMode(f.h.b.c.a.J0(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
            this.f1184i = obtainStyledAttributes.getFloat(1, 1.0f);
            this.f1185j = obtainStyledAttributes.getDimensionPixelSize(0, -1);
            this.f1186k = obtainStyledAttributes.getDimensionPixelSize(7, -1);
            obtainStyledAttributes.recycle();
            setOnTouchListener(p);
            setFocusable(true);
            if (getBackground() == null) {
                float dimension = getResources().getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(dimension);
                gradientDrawable.setColor(f.h.b.c.a.D0(f.h.b.c.a.m0(this, R.attr.colorSurface), f.h.b.c.a.m0(this, R.attr.colorOnSurface), getBackgroundOverlayColorAlpha()));
                if (this.f1187l != null) {
                    l0 = e.i.a.l0(gradientDrawable);
                    l0.setTintList(this.f1187l);
                } else {
                    l0 = e.i.a.l0(gradientDrawable);
                }
                AtomicInteger atomicInteger2 = z.a;
                z.d.q(this, l0);
            }
        }

        private void setBaseTransientBottomBar(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f1181f = baseTransientBottomBar;
        }

        public float getActionTextColorAlpha() {
            return this.f1184i;
        }

        public int getAnimationMode() {
            return this.f1182g;
        }

        public float getBackgroundOverlayColorAlpha() {
            return this.f1183h;
        }

        public int getMaxInlineActionWidth() {
            return this.f1186k;
        }

        public int getMaxWidth() {
            return this.f1185j;
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f1181f;
            if (baseTransientBottomBar != null) {
                Objects.requireNonNull(baseTransientBottomBar);
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
            }
            AtomicInteger atomicInteger = z.a;
            z.h.c(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f1181f;
            if (baseTransientBottomBar != null) {
                Objects.requireNonNull(baseTransientBottomBar);
                f.h.b.c.z.b a2 = f.h.b.c.z.b.a();
                synchronized (a2.a) {
                    a2.b(null);
                }
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
            super.onLayout(z, i2, i3, i4, i5);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f1181f;
        }

        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int i2, int i3) {
            super.onMeasure(i2, i3);
            if (this.f1185j > 0) {
                int measuredWidth = getMeasuredWidth();
                int i4 = this.f1185j;
                if (measuredWidth > i4) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i4, CommonUtils.BYTES_IN_A_GIGABYTE), i3);
                }
            }
        }

        public void setAnimationMode(int i2) {
            this.f1182g = i2;
        }

        @Override // android.view.View
        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null && this.f1187l != null) {
                drawable = e.i.a.l0(drawable.mutate());
                drawable.setTintList(this.f1187l);
                drawable.setTintMode(this.f1188m);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.f1187l = colorStateList;
            if (getBackground() != null) {
                Drawable l0 = e.i.a.l0(getBackground().mutate());
                l0.setTintList(colorStateList);
                l0.setTintMode(this.f1188m);
                if (l0 != getBackground()) {
                    super.setBackgroundDrawable(l0);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.f1188m = mode;
            if (getBackground() != null) {
                Drawable l0 = e.i.a.l0(getBackground().mutate());
                l0.setTintMode(mode);
                if (l0 != getBackground()) {
                    super.setBackgroundDrawable(l0);
                }
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (this.o || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            this.n = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f1181f;
            if (baseTransientBottomBar == null) {
                return;
            }
            Handler handler = BaseTransientBottomBar.a;
            Objects.requireNonNull(baseTransientBottomBar);
            throw null;
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : p);
            super.setOnClickListener(onClickListener);
        }
    }
}
