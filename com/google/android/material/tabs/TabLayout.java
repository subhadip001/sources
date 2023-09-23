package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.StateSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.gms.common.api.Api;
import com.google.logging.type.LogSeverity;
import com.video_converter.video_compressor.R;
import e.i.j.h0.d;
import e.i.j.u;
import e.i.j.z;
import f.h.b.c.s.r;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

@ViewPager.b
/* loaded from: classes.dex */
public class TabLayout extends HorizontalScrollView {
    public static final e.i.i.c<g> V = new e.i.i.e(16);
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public boolean J;
    public f.h.b.c.a0.c K;
    public c L;
    public final ArrayList<c> M;
    public c N;
    public ValueAnimator O;
    public ViewPager P;
    public DataSetObserver Q;
    public h R;
    public b S;
    public boolean T;
    public final e.i.i.c<i> U;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList<g> f1193f;

    /* renamed from: g  reason: collision with root package name */
    public g f1194g;

    /* renamed from: h  reason: collision with root package name */
    public final f f1195h;

    /* renamed from: i  reason: collision with root package name */
    public int f1196i;

    /* renamed from: j  reason: collision with root package name */
    public int f1197j;

    /* renamed from: k  reason: collision with root package name */
    public int f1198k;

    /* renamed from: l  reason: collision with root package name */
    public int f1199l;

    /* renamed from: m  reason: collision with root package name */
    public int f1200m;
    public ColorStateList n;
    public ColorStateList o;
    public ColorStateList p;
    public Drawable q;
    public int r;
    public PorterDuff.Mode s;
    public float t;
    public float u;
    public final int v;
    public int w;
    public final int x;
    public final int y;
    public final int z;

    /* loaded from: classes.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    /* loaded from: classes.dex */
    public class b implements ViewPager.e {
        public boolean a;

        public b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public void a(ViewPager viewPager, e.e0.a.a aVar, e.e0.a.a aVar2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.P == viewPager) {
                tabLayout.l(aVar2, this.a);
            }
        }
    }

    @Deprecated
    /* loaded from: classes.dex */
    public interface c<T extends g> {
        void a(T t);

        void b(T t);

        void c(T t);
    }

    /* loaded from: classes.dex */
    public interface d extends c<g> {
    }

    /* loaded from: classes.dex */
    public class e extends DataSetObserver {
        public e() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            TabLayout.this.j();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            TabLayout.this.j();
        }
    }

    /* loaded from: classes.dex */
    public class f extends LinearLayout {

        /* renamed from: k  reason: collision with root package name */
        public static final /* synthetic */ int f1201k = 0;

        /* renamed from: f  reason: collision with root package name */
        public ValueAnimator f1202f;

        /* renamed from: g  reason: collision with root package name */
        public int f1203g;

        /* renamed from: h  reason: collision with root package name */
        public float f1204h;

        /* renamed from: i  reason: collision with root package name */
        public int f1205i;

        /* loaded from: classes.dex */
        public class a implements ValueAnimator.AnimatorUpdateListener {
            public final /* synthetic */ View a;
            public final /* synthetic */ View b;

            public a(View view, View view2) {
                this.a = view;
                this.b = view2;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                f.this.c(this.a, this.b, valueAnimator.getAnimatedFraction());
            }
        }

        /* loaded from: classes.dex */
        public class b extends AnimatorListenerAdapter {
            public final /* synthetic */ int a;

            public b(int i2) {
                this.a = i2;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                f.this.f1203g = this.a;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                f.this.f1203g = this.a;
            }
        }

        public f(Context context) {
            super(context);
            this.f1203g = -1;
            this.f1205i = -1;
            setWillNotDraw(false);
        }

        public final void a() {
            View childAt = getChildAt(this.f1203g);
            TabLayout tabLayout = TabLayout.this;
            f.h.b.c.a0.c cVar = tabLayout.K;
            Drawable drawable = tabLayout.q;
            Objects.requireNonNull(cVar);
            RectF a2 = f.h.b.c.a0.c.a(tabLayout, childAt);
            drawable.setBounds((int) a2.left, drawable.getBounds().top, (int) a2.right, drawable.getBounds().bottom);
        }

        public void b(int i2) {
            Rect bounds = TabLayout.this.q.getBounds();
            TabLayout.this.q.setBounds(bounds.left, 0, bounds.right, i2);
            requestLayout();
        }

        public final void c(View view, View view2, float f2) {
            if (view != null && view.getWidth() > 0) {
                TabLayout tabLayout = TabLayout.this;
                tabLayout.K.b(tabLayout, view, view2, f2, tabLayout.q);
            } else {
                Drawable drawable = TabLayout.this.q;
                drawable.setBounds(-1, drawable.getBounds().top, -1, TabLayout.this.q.getBounds().bottom);
            }
            AtomicInteger atomicInteger = z.a;
            z.d.k(this);
        }

        public final void d(boolean z, int i2, int i3) {
            View childAt = getChildAt(this.f1203g);
            View childAt2 = getChildAt(i2);
            if (childAt2 == null) {
                a();
                return;
            }
            a aVar = new a(childAt, childAt2);
            if (z) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.f1202f = valueAnimator;
                valueAnimator.setInterpolator(f.h.b.c.c.a.b);
                valueAnimator.setDuration(i3);
                valueAnimator.setFloatValues(0.0f, 1.0f);
                valueAnimator.addUpdateListener(aVar);
                valueAnimator.addListener(new b(i2));
                valueAnimator.start();
                return;
            }
            this.f1202f.removeAllUpdateListeners();
            this.f1202f.addUpdateListener(aVar);
        }

        @Override // android.view.View
        public void draw(Canvas canvas) {
            int height = TabLayout.this.q.getBounds().height();
            if (height < 0) {
                height = TabLayout.this.q.getIntrinsicHeight();
            }
            int i2 = TabLayout.this.D;
            int i3 = 0;
            if (i2 == 0) {
                i3 = getHeight() - height;
                height = getHeight();
            } else if (i2 == 1) {
                i3 = (getHeight() - height) / 2;
                height = (getHeight() + height) / 2;
            } else if (i2 != 2) {
                height = i2 != 3 ? 0 : getHeight();
            }
            if (TabLayout.this.q.getBounds().width() > 0) {
                Rect bounds = TabLayout.this.q.getBounds();
                TabLayout.this.q.setBounds(bounds.left, i3, bounds.right, height);
                TabLayout tabLayout = TabLayout.this;
                Drawable drawable = tabLayout.q;
                if (tabLayout.r != 0) {
                    drawable = e.i.a.l0(drawable);
                    if (Build.VERSION.SDK_INT == 21) {
                        drawable.setColorFilter(TabLayout.this.r, PorterDuff.Mode.SRC_IN);
                    } else {
                        drawable.setTint(TabLayout.this.r);
                    }
                } else if (Build.VERSION.SDK_INT == 21) {
                    drawable.setColorFilter(null);
                } else {
                    drawable.setTintList(null);
                }
                drawable.draw(canvas);
            }
            super.draw(canvas);
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
            super.onLayout(z, i2, i3, i4, i5);
            ValueAnimator valueAnimator = this.f1202f;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                d(false, this.f1203g, -1);
            } else {
                a();
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i2, int i3) {
            super.onMeasure(i2, i3);
            if (View.MeasureSpec.getMode(i2) != 1073741824) {
                return;
            }
            TabLayout tabLayout = TabLayout.this;
            boolean z = true;
            if (tabLayout.B == 1 || tabLayout.E == 2) {
                int childCount = getChildCount();
                int i4 = 0;
                for (int i5 = 0; i5 < childCount; i5++) {
                    View childAt = getChildAt(i5);
                    if (childAt.getVisibility() == 0) {
                        i4 = Math.max(i4, childAt.getMeasuredWidth());
                    }
                }
                if (i4 <= 0) {
                    return;
                }
                if (i4 * childCount <= getMeasuredWidth() - (((int) f.h.b.c.a.h0(getContext(), 16)) * 2)) {
                    boolean z2 = false;
                    for (int i6 = 0; i6 < childCount; i6++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i6).getLayoutParams();
                        if (layoutParams.width != i4 || layoutParams.weight != 0.0f) {
                            layoutParams.width = i4;
                            layoutParams.weight = 0.0f;
                            z2 = true;
                        }
                    }
                    z = z2;
                } else {
                    TabLayout tabLayout2 = TabLayout.this;
                    tabLayout2.B = 0;
                    tabLayout2.q(false);
                }
                if (z) {
                    super.onMeasure(i2, i3);
                }
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onRtlPropertiesChanged(int i2) {
            super.onRtlPropertiesChanged(i2);
            if (Build.VERSION.SDK_INT >= 23 || this.f1205i == i2) {
                return;
            }
            requestLayout();
            this.f1205i = i2;
        }
    }

    /* loaded from: classes.dex */
    public static class g {
        public Drawable a;
        public CharSequence b;
        public CharSequence c;

        /* renamed from: e  reason: collision with root package name */
        public View f1208e;

        /* renamed from: f  reason: collision with root package name */
        public TabLayout f1209f;

        /* renamed from: g  reason: collision with root package name */
        public i f1210g;

        /* renamed from: d  reason: collision with root package name */
        public int f1207d = -1;

        /* renamed from: h  reason: collision with root package name */
        public int f1211h = -1;

        public g a(int i2) {
            TabLayout tabLayout = this.f1209f;
            if (tabLayout != null) {
                b(e.b.a.b(tabLayout.getContext(), i2));
                return this;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        public g b(Drawable drawable) {
            this.a = drawable;
            TabLayout tabLayout = this.f1209f;
            if (tabLayout.B == 1 || tabLayout.E == 2) {
                tabLayout.q(true);
            }
            d();
            return this;
        }

        public g c(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.c) && !TextUtils.isEmpty(charSequence)) {
                this.f1210g.setContentDescription(charSequence);
            }
            this.b = charSequence;
            d();
            return this;
        }

        public void d() {
            i iVar = this.f1210g;
            if (iVar != null) {
                iVar.f();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class h implements ViewPager.f {
        public final WeakReference<TabLayout> a;
        public int b;
        public int c;

        public h(TabLayout tabLayout) {
            this.a = new WeakReference<>(tabLayout);
        }

        @Override // androidx.viewpager.widget.ViewPager.f
        public void a(int i2) {
            this.b = this.c;
            this.c = i2;
        }
    }

    /* loaded from: classes.dex */
    public final class i extends LinearLayout {
        public static final /* synthetic */ int q = 0;

        /* renamed from: f  reason: collision with root package name */
        public g f1212f;

        /* renamed from: g  reason: collision with root package name */
        public TextView f1213g;

        /* renamed from: h  reason: collision with root package name */
        public ImageView f1214h;

        /* renamed from: i  reason: collision with root package name */
        public View f1215i;

        /* renamed from: j  reason: collision with root package name */
        public f.h.b.c.e.a f1216j;

        /* renamed from: k  reason: collision with root package name */
        public View f1217k;

        /* renamed from: l  reason: collision with root package name */
        public TextView f1218l;

        /* renamed from: m  reason: collision with root package name */
        public ImageView f1219m;
        public Drawable n;
        public int o;

        public i(Context context) {
            super(context);
            u uVar;
            this.o = 2;
            g(context);
            int i2 = TabLayout.this.f1196i;
            int i3 = TabLayout.this.f1197j;
            int i4 = TabLayout.this.f1198k;
            int i5 = TabLayout.this.f1199l;
            AtomicInteger atomicInteger = z.a;
            z.e.k(this, i2, i3, i4, i5);
            setGravity(17);
            setOrientation(!TabLayout.this.F ? 1 : 0);
            setClickable(true);
            Context context2 = getContext();
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 24) {
                uVar = new u(PointerIcon.getSystemIcon(context2, 1002));
            } else {
                uVar = new u(null);
            }
            if (i6 >= 24) {
                z.k.d(this, (PointerIcon) uVar.a);
            }
        }

        private f.h.b.c.e.a getBadge() {
            return this.f1216j;
        }

        private f.h.b.c.e.a getOrCreateBadge() {
            if (this.f1216j == null) {
                this.f1216j = new f.h.b.c.e.a(getContext(), 0, R.attr.badgeStyle, com.arthenica.ffmpegkit.R.style.Widget_MaterialComponents_Badge, null);
            }
            d();
            f.h.b.c.e.a aVar = this.f1216j;
            if (aVar != null) {
                return aVar;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        public final boolean a() {
            return this.f1216j != null;
        }

        public final void b(View view) {
            if (a() && view != null) {
                setClipChildren(false);
                setClipToPadding(false);
                ViewGroup viewGroup = (ViewGroup) getParent();
                if (viewGroup != null) {
                    viewGroup.setClipChildren(false);
                    viewGroup.setClipToPadding(false);
                }
                f.h.b.c.e.a aVar = this.f1216j;
                Rect rect = new Rect();
                view.getDrawingRect(rect);
                aVar.setBounds(rect);
                aVar.f(view, null);
                if (aVar.c() != null) {
                    aVar.c().setForeground(aVar);
                } else {
                    view.getOverlay().add(aVar);
                }
                this.f1215i = view;
            }
        }

        public final void c() {
            if (a()) {
                setClipChildren(true);
                setClipToPadding(true);
                ViewGroup viewGroup = (ViewGroup) getParent();
                if (viewGroup != null) {
                    viewGroup.setClipChildren(true);
                    viewGroup.setClipToPadding(true);
                }
                View view = this.f1215i;
                if (view != null) {
                    f.h.b.c.e.a aVar = this.f1216j;
                    if (aVar != null) {
                        if (aVar.c() != null) {
                            aVar.c().setForeground(null);
                        } else {
                            view.getOverlay().remove(aVar);
                        }
                    }
                    this.f1215i = null;
                }
            }
        }

        public final void d() {
            g gVar;
            g gVar2;
            if (a()) {
                if (this.f1217k != null) {
                    c();
                    return;
                }
                ImageView imageView = this.f1214h;
                if (imageView != null && (gVar2 = this.f1212f) != null && gVar2.a != null) {
                    if (this.f1215i != imageView) {
                        c();
                        b(this.f1214h);
                        return;
                    }
                    e(imageView);
                } else if (this.f1213g != null && (gVar = this.f1212f) != null) {
                    Objects.requireNonNull(gVar);
                    View view = this.f1215i;
                    TextView textView = this.f1213g;
                    if (view != textView) {
                        c();
                        b(this.f1213g);
                        return;
                    }
                    e(textView);
                } else {
                    c();
                }
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.n;
            boolean z = false;
            if (drawable != null && drawable.isStateful()) {
                z = false | this.n.setState(drawableState);
            }
            if (z) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        public final void e(View view) {
            if (a() && view == this.f1215i) {
                f.h.b.c.e.a aVar = this.f1216j;
                Rect rect = new Rect();
                view.getDrawingRect(rect);
                aVar.setBounds(rect);
                aVar.f(view, null);
            }
        }

        public final void f() {
            g gVar = this.f1212f;
            View view = gVar != null ? gVar.f1208e : null;
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(view);
                    }
                    addView(view);
                }
                this.f1217k = view;
                TextView textView = this.f1213g;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f1214h;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f1214h.setImageDrawable(null);
                }
                TextView textView2 = (TextView) view.findViewById(16908308);
                this.f1218l = textView2;
                if (textView2 != null) {
                    this.o = textView2.getMaxLines();
                }
                this.f1219m = (ImageView) view.findViewById(16908294);
            } else {
                View view2 = this.f1217k;
                if (view2 != null) {
                    removeView(view2);
                    this.f1217k = null;
                }
                this.f1218l = null;
                this.f1219m = null;
            }
            boolean z = false;
            if (this.f1217k == null) {
                if (this.f1214h == null) {
                    ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_icon, (ViewGroup) this, false);
                    this.f1214h = imageView2;
                    addView(imageView2, 0);
                }
                if (this.f1213g == null) {
                    TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_text, (ViewGroup) this, false);
                    this.f1213g = textView3;
                    addView(textView3);
                    this.o = this.f1213g.getMaxLines();
                }
                e.i.a.b0(this.f1213g, TabLayout.this.f1200m);
                ColorStateList colorStateList = TabLayout.this.n;
                if (colorStateList != null) {
                    this.f1213g.setTextColor(colorStateList);
                }
                h(this.f1213g, this.f1214h);
                d();
                ImageView imageView3 = this.f1214h;
                if (imageView3 != null) {
                    imageView3.addOnLayoutChangeListener(new f.h.b.c.a0.e(this, imageView3));
                }
                TextView textView4 = this.f1213g;
                if (textView4 != null) {
                    textView4.addOnLayoutChangeListener(new f.h.b.c.a0.e(this, textView4));
                }
            } else {
                TextView textView5 = this.f1218l;
                if (textView5 != null || this.f1219m != null) {
                    h(textView5, this.f1219m);
                }
            }
            if (gVar != null && !TextUtils.isEmpty(gVar.c)) {
                setContentDescription(gVar.c);
            }
            if (gVar != null) {
                TabLayout tabLayout = gVar.f1209f;
                if (tabLayout != null) {
                    int selectedTabPosition = tabLayout.getSelectedTabPosition();
                    if (selectedTabPosition != -1 && selectedTabPosition == gVar.f1207d) {
                        z = true;
                    }
                } else {
                    throw new IllegalArgumentException("Tab not attached to a TabLayout");
                }
            }
            setSelected(z);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v5, types: [android.graphics.drawable.RippleDrawable] */
        public final void g(Context context) {
            int i2 = TabLayout.this.v;
            if (i2 != 0) {
                Drawable b = e.b.a.b(context, i2);
                this.n = b;
                if (b != null && b.isStateful()) {
                    this.n.setState(getDrawableState());
                }
            } else {
                this.n = null;
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(0);
            if (TabLayout.this.p != null) {
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setCornerRadius(1.0E-5f);
                gradientDrawable2.setColor(-1);
                ColorStateList colorStateList = TabLayout.this.p;
                ColorStateList colorStateList2 = new ColorStateList(new int[][]{f.h.b.c.w.b.f5468i, StateSet.NOTHING}, new int[]{f.h.b.c.w.b.a(colorStateList, f.h.b.c.w.b.f5464e), f.h.b.c.w.b.a(colorStateList, f.h.b.c.w.b.a)});
                boolean z = TabLayout.this.J;
                if (z) {
                    gradientDrawable = null;
                }
                gradientDrawable = new RippleDrawable(colorStateList2, gradientDrawable, z ? null : gradientDrawable2);
            }
            AtomicInteger atomicInteger = z.a;
            z.d.q(this, gradientDrawable);
            TabLayout.this.invalidate();
        }

        public int getContentHeight() {
            View[] viewArr = {this.f1213g, this.f1214h, this.f1217k};
            int i2 = 0;
            int i3 = 0;
            boolean z = false;
            for (int i4 = 0; i4 < 3; i4++) {
                View view = viewArr[i4];
                if (view != null && view.getVisibility() == 0) {
                    i3 = z ? Math.min(i3, view.getTop()) : view.getTop();
                    i2 = z ? Math.max(i2, view.getBottom()) : view.getBottom();
                    z = true;
                }
            }
            return i2 - i3;
        }

        public int getContentWidth() {
            View[] viewArr = {this.f1213g, this.f1214h, this.f1217k};
            int i2 = 0;
            int i3 = 0;
            boolean z = false;
            for (int i4 = 0; i4 < 3; i4++) {
                View view = viewArr[i4];
                if (view != null && view.getVisibility() == 0) {
                    i3 = z ? Math.min(i3, view.getLeft()) : view.getLeft();
                    i2 = z ? Math.max(i2, view.getRight()) : view.getRight();
                    z = true;
                }
            }
            return i2 - i3;
        }

        public g getTab() {
            return this.f1212f;
        }

        public final void h(TextView textView, ImageView imageView) {
            Drawable drawable;
            g gVar = this.f1212f;
            Drawable mutate = (gVar == null || (drawable = gVar.a) == null) ? null : e.i.a.l0(drawable).mutate();
            if (mutate != null) {
                mutate.setTintList(TabLayout.this.o);
                PorterDuff.Mode mode = TabLayout.this.s;
                if (mode != null) {
                    mutate.setTintMode(mode);
                }
            }
            g gVar2 = this.f1212f;
            CharSequence charSequence = gVar2 != null ? gVar2.b : null;
            if (imageView != null) {
                if (mutate != null) {
                    imageView.setImageDrawable(mutate);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(charSequence);
            if (textView != null) {
                if (z) {
                    textView.setText(charSequence);
                    Objects.requireNonNull(this.f1212f);
                    textView.setVisibility(0);
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText((CharSequence) null);
                }
            }
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int h0 = (z && imageView.getVisibility() == 0) ? (int) f.h.b.c.a.h0(getContext(), 8) : 0;
                if (TabLayout.this.F) {
                    if (h0 != marginLayoutParams.getMarginEnd()) {
                        marginLayoutParams.setMarginEnd(h0);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (h0 != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = h0;
                    marginLayoutParams.setMarginEnd(0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            g gVar3 = this.f1212f;
            CharSequence charSequence2 = gVar3 != null ? gVar3.c : null;
            if (Build.VERSION.SDK_INT > 23) {
                if (!z) {
                    charSequence = charSequence2;
                }
                e.b.a.d(this, charSequence);
            }
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            Context context;
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            f.h.b.c.e.a aVar = this.f1216j;
            if (aVar != null && aVar.isVisible()) {
                CharSequence contentDescription = getContentDescription();
                StringBuilder sb = new StringBuilder();
                sb.append((Object) contentDescription);
                sb.append(", ");
                f.h.b.c.e.a aVar2 = this.f1216j;
                Object obj = null;
                if (aVar2.isVisible()) {
                    if (aVar2.e()) {
                        if (aVar2.f5252j.b.n != 0 && (context = aVar2.f5248f.get()) != null) {
                            int d2 = aVar2.d();
                            int i2 = aVar2.f5255m;
                            if (d2 <= i2) {
                                obj = context.getResources().getQuantityString(aVar2.f5252j.b.n, aVar2.d(), Integer.valueOf(aVar2.d()));
                            } else {
                                obj = context.getString(aVar2.f5252j.b.o, Integer.valueOf(i2));
                            }
                        }
                    } else {
                        obj = aVar2.f5252j.b.f1070m;
                    }
                }
                sb.append(obj);
                accessibilityNodeInfo.setContentDescription(sb.toString());
            }
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) d.c.a(0, 1, this.f1212f.f1207d, 1, false, isSelected()).a);
            if (isSelected()) {
                accessibilityNodeInfo.setClickable(false);
                accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) d.a.f2534g.a);
            }
            accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(R.string.item_view_role_description));
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x0094, code lost:
            if (((r0 / r2.getPaint().getTextSize()) * r2.getLineWidth(0)) > ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) goto L28;
         */
        @Override // android.widget.LinearLayout, android.view.View
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onMeasure(int r8, int r9) {
            /*
                r7 = this;
                int r0 = android.view.View.MeasureSpec.getSize(r8)
                int r1 = android.view.View.MeasureSpec.getMode(r8)
                com.google.android.material.tabs.TabLayout r2 = com.google.android.material.tabs.TabLayout.this
                int r2 = r2.getTabMaxWidth()
                if (r2 <= 0) goto L1e
                if (r1 == 0) goto L14
                if (r0 <= r2) goto L1e
            L14:
                com.google.android.material.tabs.TabLayout r8 = com.google.android.material.tabs.TabLayout.this
                int r8 = r8.w
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r0)
            L1e:
                super.onMeasure(r8, r9)
                android.widget.TextView r0 = r7.f1213g
                if (r0 == 0) goto La6
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                float r0 = r0.t
                int r1 = r7.o
                android.widget.ImageView r2 = r7.f1214h
                r3 = 1
                if (r2 == 0) goto L38
                int r2 = r2.getVisibility()
                if (r2 != 0) goto L38
                r1 = 1
                goto L46
            L38:
                android.widget.TextView r2 = r7.f1213g
                if (r2 == 0) goto L46
                int r2 = r2.getLineCount()
                if (r2 <= r3) goto L46
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                float r0 = r0.u
            L46:
                android.widget.TextView r2 = r7.f1213g
                float r2 = r2.getTextSize()
                android.widget.TextView r4 = r7.f1213g
                int r4 = r4.getLineCount()
                android.widget.TextView r5 = r7.f1213g
                int r5 = r5.getMaxLines()
                int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r2 != 0) goto L60
                if (r5 < 0) goto La6
                if (r1 == r5) goto La6
            L60:
                com.google.android.material.tabs.TabLayout r5 = com.google.android.material.tabs.TabLayout.this
                int r5 = r5.E
                r6 = 0
                if (r5 != r3) goto L97
                if (r2 <= 0) goto L97
                if (r4 != r3) goto L97
                android.widget.TextView r2 = r7.f1213g
                android.text.Layout r2 = r2.getLayout()
                if (r2 == 0) goto L96
                float r4 = r2.getLineWidth(r6)
                android.text.TextPaint r2 = r2.getPaint()
                float r2 = r2.getTextSize()
                float r2 = r0 / r2
                float r2 = r2 * r4
                int r4 = r7.getMeasuredWidth()
                int r5 = r7.getPaddingLeft()
                int r4 = r4 - r5
                int r5 = r7.getPaddingRight()
                int r4 = r4 - r5
                float r4 = (float) r4
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 <= 0) goto L97
            L96:
                r3 = 0
            L97:
                if (r3 == 0) goto La6
                android.widget.TextView r2 = r7.f1213g
                r2.setTextSize(r6, r0)
                android.widget.TextView r0 = r7.f1213g
                r0.setMaxLines(r1)
                super.onMeasure(r8, r9)
            La6:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.i.onMeasure(int, int):void");
        }

        @Override // android.view.View
        public boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f1212f != null) {
                if (!performClick) {
                    playSoundEffect(0);
                }
                g gVar = this.f1212f;
                TabLayout tabLayout = gVar.f1209f;
                if (tabLayout != null) {
                    tabLayout.k(gVar, true);
                    return true;
                }
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            return performClick;
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            if (isSelected() != z) {
            }
            super.setSelected(z);
            TextView textView = this.f1213g;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.f1214h;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.f1217k;
            if (view != null) {
                view.setSelected(z);
            }
        }

        public void setTab(g gVar) {
            if (gVar != this.f1212f) {
                this.f1212f = gVar;
                f();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class j implements d {
        public final ViewPager a;

        public j(ViewPager viewPager) {
            this.a = viewPager;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(g gVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(g gVar) {
            this.a.setCurrentItem(gVar.f1207d);
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(g gVar) {
        }
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        super(f.h.b.c.c0.a.a.a(context, attributeSet, R.attr.tabStyle, com.arthenica.ffmpegkit.R.style.Widget_Design_TabLayout), attributeSet, R.attr.tabStyle);
        this.f1193f = new ArrayList<>();
        this.q = new GradientDrawable();
        this.r = 0;
        this.w = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.H = -1;
        this.M = new ArrayList<>();
        this.U = new e.i.i.d(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        f fVar = new f(context2);
        this.f1195h = fVar;
        super.addView(fVar, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray d2 = r.d(context2, attributeSet, f.h.b.c.b.G, R.attr.tabStyle, com.arthenica.ffmpegkit.R.style.Widget_Design_TabLayout, 23);
        if (getBackground() instanceof ColorDrawable) {
            f.h.b.c.y.g gVar = new f.h.b.c.y.g();
            gVar.r(ColorStateList.valueOf(((ColorDrawable) getBackground()).getColor()));
            gVar.f5480f.b = new f.h.b.c.p.a(context2);
            gVar.z();
            AtomicInteger atomicInteger = z.a;
            gVar.q(z.i.i(this));
            z.d.q(this, gVar);
        }
        setSelectedTabIndicator(f.h.b.c.a.q0(context2, d2, 5));
        setSelectedTabIndicatorColor(d2.getColor(8, 0));
        fVar.b(d2.getDimensionPixelSize(11, -1));
        setSelectedTabIndicatorGravity(d2.getInt(10, 0));
        setTabIndicatorAnimationMode(d2.getInt(7, 0));
        setTabIndicatorFullWidth(d2.getBoolean(9, true));
        int dimensionPixelSize = d2.getDimensionPixelSize(16, 0);
        this.f1199l = dimensionPixelSize;
        this.f1198k = dimensionPixelSize;
        this.f1197j = dimensionPixelSize;
        this.f1196i = dimensionPixelSize;
        this.f1196i = d2.getDimensionPixelSize(19, dimensionPixelSize);
        this.f1197j = d2.getDimensionPixelSize(20, this.f1197j);
        this.f1198k = d2.getDimensionPixelSize(18, this.f1198k);
        this.f1199l = d2.getDimensionPixelSize(17, this.f1199l);
        int resourceId = d2.getResourceId(23, com.arthenica.ffmpegkit.R.style.TextAppearance_Design_Tab);
        this.f1200m = resourceId;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(resourceId, e.b.b.y);
        try {
            this.t = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.n = f.h.b.c.a.n0(context2, obtainStyledAttributes, 3);
            obtainStyledAttributes.recycle();
            if (d2.hasValue(24)) {
                this.n = f.h.b.c.a.n0(context2, d2, 24);
            }
            if (d2.hasValue(22)) {
                this.n = new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{d2.getColor(22, 0), this.n.getDefaultColor()});
            }
            this.o = f.h.b.c.a.n0(context2, d2, 3);
            this.s = f.h.b.c.a.J0(d2.getInt(4, -1), null);
            this.p = f.h.b.c.a.n0(context2, d2, 21);
            this.C = d2.getInt(6, LogSeverity.NOTICE_VALUE);
            this.x = d2.getDimensionPixelSize(14, -1);
            this.y = d2.getDimensionPixelSize(13, -1);
            this.v = d2.getResourceId(0, 0);
            this.A = d2.getDimensionPixelSize(1, 0);
            this.E = d2.getInt(15, 1);
            this.B = d2.getInt(2, 0);
            this.F = d2.getBoolean(12, false);
            this.J = d2.getBoolean(25, false);
            d2.recycle();
            Resources resources = getResources();
            this.u = resources.getDimensionPixelSize(R.dimen.design_tab_text_size_2line);
            this.z = resources.getDimensionPixelSize(R.dimen.design_tab_scrollable_min_width);
            d();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private int getDefaultHeight() {
        int size = this.f1193f.size();
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                g gVar = this.f1193f.get(i2);
                if (gVar != null && gVar.a != null && !TextUtils.isEmpty(gVar.b)) {
                    z = true;
                    break;
                }
                i2++;
            } else {
                break;
            }
        }
        return (!z || this.F) ? 48 : 72;
    }

    private int getTabMinWidth() {
        int i2 = this.x;
        if (i2 != -1) {
            return i2;
        }
        int i3 = this.E;
        if (i3 == 0 || i3 == 2) {
            return this.z;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f1195h.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i2) {
        int childCount = this.f1195h.getChildCount();
        if (i2 < childCount) {
            int i3 = 0;
            while (i3 < childCount) {
                View childAt = this.f1195h.getChildAt(i3);
                boolean z = true;
                childAt.setSelected(i3 == i2);
                if (i3 != i2) {
                    z = false;
                }
                childAt.setActivated(z);
                i3++;
            }
        }
    }

    public void a(g gVar, boolean z) {
        int size = this.f1193f.size();
        if (gVar.f1209f == this) {
            gVar.f1207d = size;
            this.f1193f.add(size, gVar);
            int size2 = this.f1193f.size();
            while (true) {
                size++;
                if (size >= size2) {
                    break;
                }
                this.f1193f.get(size).f1207d = size;
            }
            i iVar = gVar.f1210g;
            iVar.setSelected(false);
            iVar.setActivated(false);
            f fVar = this.f1195h;
            int i2 = gVar.f1207d;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            p(layoutParams);
            fVar.addView(iVar, i2, layoutParams);
            if (z) {
                TabLayout tabLayout = gVar.f1209f;
                if (tabLayout != null) {
                    tabLayout.k(gVar, true);
                    return;
                }
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        b(view);
    }

    public final void b(View view) {
        if (view instanceof f.h.b.c.a0.d) {
            f.h.b.c.a0.d dVar = (f.h.b.c.a0.d) view;
            g i2 = i();
            Objects.requireNonNull(dVar);
            if (!TextUtils.isEmpty(dVar.getContentDescription())) {
                i2.c = dVar.getContentDescription();
                i2.d();
            }
            a(i2, this.f1193f.isEmpty());
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public final void c(int i2) {
        boolean z;
        if (i2 == -1) {
            return;
        }
        if (getWindowToken() != null) {
            AtomicInteger atomicInteger = z.a;
            if (z.g.c(this)) {
                f fVar = this.f1195h;
                int childCount = fVar.getChildCount();
                int i3 = 0;
                while (true) {
                    if (i3 >= childCount) {
                        z = false;
                        break;
                    } else if (fVar.getChildAt(i3).getWidth() <= 0) {
                        z = true;
                        break;
                    } else {
                        i3++;
                    }
                }
                if (!z) {
                    int scrollX = getScrollX();
                    int e2 = e(i2, 0.0f);
                    if (scrollX != e2) {
                        f();
                        this.O.setIntValues(scrollX, e2);
                        this.O.start();
                    }
                    f fVar2 = this.f1195h;
                    int i4 = this.C;
                    ValueAnimator valueAnimator = fVar2.f1202f;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        fVar2.f1202f.cancel();
                    }
                    fVar2.d(true, i2, i4);
                    return;
                }
            }
        }
        m(i2, 0.0f, true, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
        if (r0 != 2) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() {
        /*
            r5 = this;
            int r0 = r5.E
            r1 = 2
            r2 = 0
            if (r0 == 0) goto Lb
            if (r0 != r1) goto L9
            goto Lb
        L9:
            r0 = 0
            goto L14
        Lb:
            int r0 = r5.A
            int r3 = r5.f1196i
            int r0 = r0 - r3
            int r0 = java.lang.Math.max(r2, r0)
        L14:
            com.google.android.material.tabs.TabLayout$f r3 = r5.f1195h
            java.util.concurrent.atomic.AtomicInteger r4 = e.i.j.z.a
            e.i.j.z.e.k(r3, r0, r2, r2, r2)
            int r0 = r5.E
            java.lang.String r2 = "TabLayout"
            r3 = 1
            if (r0 == 0) goto L36
            if (r0 == r3) goto L27
            if (r0 == r1) goto L27
            goto L52
        L27:
            int r0 = r5.B
            if (r0 != r1) goto L30
            java.lang.String r0 = "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead"
            android.util.Log.w(r2, r0)
        L30:
            com.google.android.material.tabs.TabLayout$f r0 = r5.f1195h
            r0.setGravity(r3)
            goto L52
        L36:
            int r0 = r5.B
            if (r0 == 0) goto L45
            if (r0 == r3) goto L3f
            if (r0 == r1) goto L4a
            goto L52
        L3f:
            com.google.android.material.tabs.TabLayout$f r0 = r5.f1195h
            r0.setGravity(r3)
            goto L52
        L45:
            java.lang.String r0 = "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead"
            android.util.Log.w(r2, r0)
        L4a:
            com.google.android.material.tabs.TabLayout$f r0 = r5.f1195h
            r1 = 8388611(0x800003, float:1.1754948E-38)
            r0.setGravity(r1)
        L52:
            r5.q(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.d():void");
    }

    public final int e(int i2, float f2) {
        View childAt;
        int i3 = this.E;
        if ((i3 == 0 || i3 == 2) && (childAt = this.f1195h.getChildAt(i2)) != null) {
            int i4 = i2 + 1;
            View childAt2 = i4 < this.f1195h.getChildCount() ? this.f1195h.getChildAt(i4) : null;
            int width = childAt.getWidth();
            int width2 = childAt2 != null ? childAt2.getWidth() : 0;
            int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
            int i5 = (int) ((width + width2) * 0.5f * f2);
            AtomicInteger atomicInteger = z.a;
            return z.e.d(this) == 0 ? left + i5 : left - i5;
        }
        return 0;
    }

    public final void f() {
        if (this.O == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.O = valueAnimator;
            valueAnimator.setInterpolator(f.h.b.c.c.a.b);
            this.O.setDuration(this.C);
            this.O.addUpdateListener(new a());
        }
    }

    public g g(int i2) {
        if (i2 < 0 || i2 >= getTabCount()) {
            return null;
        }
        return this.f1193f.get(i2);
    }

    public int getSelectedTabPosition() {
        g gVar = this.f1194g;
        if (gVar != null) {
            return gVar.f1207d;
        }
        return -1;
    }

    public int getTabCount() {
        return this.f1193f.size();
    }

    public int getTabGravity() {
        return this.B;
    }

    public ColorStateList getTabIconTint() {
        return this.o;
    }

    public int getTabIndicatorAnimationMode() {
        return this.I;
    }

    public int getTabIndicatorGravity() {
        return this.D;
    }

    public int getTabMaxWidth() {
        return this.w;
    }

    public int getTabMode() {
        return this.E;
    }

    public ColorStateList getTabRippleColor() {
        return this.p;
    }

    public Drawable getTabSelectedIndicator() {
        return this.q;
    }

    public ColorStateList getTabTextColors() {
        return this.n;
    }

    public final boolean h() {
        return getTabMode() == 0 || getTabMode() == 2;
    }

    public g i() {
        g b2 = V.b();
        if (b2 == null) {
            b2 = new g();
        }
        b2.f1209f = this;
        e.i.i.c<i> cVar = this.U;
        i b3 = cVar != null ? cVar.b() : null;
        if (b3 == null) {
            b3 = new i(getContext());
        }
        b3.setTab(b2);
        b3.setFocusable(true);
        b3.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(b2.c)) {
            b3.setContentDescription(b2.b);
        } else {
            b3.setContentDescription(b2.c);
        }
        b2.f1210g = b3;
        int i2 = b2.f1211h;
        if (i2 != -1) {
            b3.setId(i2);
        }
        return b2;
    }

    public void j() {
        int childCount = this.f1195h.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            i iVar = (i) this.f1195h.getChildAt(childCount);
            this.f1195h.removeViewAt(childCount);
            if (iVar != null) {
                iVar.setTab(null);
                iVar.setSelected(false);
                this.U.a(iVar);
            }
            requestLayout();
        }
        Iterator<g> it = this.f1193f.iterator();
        while (it.hasNext()) {
            g next = it.next();
            it.remove();
            next.f1209f = null;
            next.f1210g = null;
            next.a = null;
            next.f1211h = -1;
            next.b = null;
            next.c = null;
            next.f1207d = -1;
            next.f1208e = null;
            V.a(next);
        }
        this.f1194g = null;
    }

    public void k(g gVar, boolean z) {
        g gVar2 = this.f1194g;
        if (gVar2 == gVar) {
            if (gVar2 != null) {
                for (int size = this.M.size() - 1; size >= 0; size--) {
                    this.M.get(size).a(gVar);
                }
                c(gVar.f1207d);
                return;
            }
            return;
        }
        int i2 = gVar != null ? gVar.f1207d : -1;
        if (z) {
            if ((gVar2 == null || gVar2.f1207d == -1) && i2 != -1) {
                m(i2, 0.0f, true, true);
            } else {
                c(i2);
            }
            if (i2 != -1) {
                setSelectedTabView(i2);
            }
        }
        this.f1194g = gVar;
        if (gVar2 != null) {
            for (int size2 = this.M.size() - 1; size2 >= 0; size2--) {
                this.M.get(size2).c(gVar2);
            }
        }
        if (gVar != null) {
            for (int size3 = this.M.size() - 1; size3 >= 0; size3--) {
                this.M.get(size3).b(gVar);
            }
        }
    }

    public void l(e.e0.a.a aVar, boolean z) {
        if (z && aVar != null) {
            if (this.Q == null) {
                this.Q = new e();
            }
            throw null;
        }
        j();
    }

    public void m(int i2, float f2, boolean z, boolean z2) {
        int round = Math.round(i2 + f2);
        if (round < 0 || round >= this.f1195h.getChildCount()) {
            return;
        }
        if (z2) {
            f fVar = this.f1195h;
            ValueAnimator valueAnimator = fVar.f1202f;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                fVar.f1202f.cancel();
            }
            fVar.f1203g = i2;
            fVar.f1204h = f2;
            fVar.c(fVar.getChildAt(i2), fVar.getChildAt(fVar.f1203g + 1), fVar.f1204h);
        }
        ValueAnimator valueAnimator2 = this.O;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            this.O.cancel();
        }
        scrollTo(i2 < 0 ? 0 : e(i2, f2), 0);
        if (z) {
            setSelectedTabView(round);
        }
    }

    public final void n(ViewPager viewPager, boolean z, boolean z2) {
        List<ViewPager.e> list;
        List<ViewPager.f> list2;
        ViewPager viewPager2 = this.P;
        if (viewPager2 != null) {
            h hVar = this.R;
            if (hVar != null && (list2 = viewPager2.C) != null) {
                list2.remove(hVar);
            }
            b bVar = this.S;
            if (bVar != null && (list = this.P.E) != null) {
                list.remove(bVar);
            }
        }
        c cVar = this.N;
        if (cVar != null) {
            this.M.remove(cVar);
            this.N = null;
        }
        if (viewPager != null) {
            this.P = viewPager;
            if (this.R == null) {
                this.R = new h(this);
            }
            h hVar2 = this.R;
            hVar2.c = 0;
            hVar2.b = 0;
            if (viewPager.C == null) {
                viewPager.C = new ArrayList();
            }
            viewPager.C.add(hVar2);
            j jVar = new j(viewPager);
            this.N = jVar;
            if (!this.M.contains(jVar)) {
                this.M.add(jVar);
            }
            e.e0.a.a adapter = viewPager.getAdapter();
            if (adapter != null) {
                l(adapter, z);
            }
            if (this.S == null) {
                this.S = new b();
            }
            b bVar2 = this.S;
            bVar2.a = z;
            if (viewPager.E == null) {
                viewPager.E = new ArrayList();
            }
            viewPager.E.add(bVar2);
            m(viewPager.getCurrentItem(), 0.0f, true, true);
        } else {
            this.P = null;
            l(null, false);
        }
        this.T = z2;
    }

    public final void o() {
        int size = this.f1193f.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f1193f.get(i2).d();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof f.h.b.c.y.g) {
            f.h.b.c.a.V0(this, (f.h.b.c.y.g) background);
        }
        if (this.P == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                n((ViewPager) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.T) {
            setupWithViewPager(null);
            this.T = false;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        i iVar;
        Drawable drawable;
        for (int i2 = 0; i2 < this.f1195h.getChildCount(); i2++) {
            View childAt = this.f1195h.getChildAt(i2);
            if ((childAt instanceof i) && (drawable = (iVar = (i) childAt).n) != null) {
                drawable.setBounds(iVar.getLeft(), iVar.getTop(), iVar.getRight(), iVar.getBottom());
                iVar.n.draw(canvas);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) d.b.a(1, getTabCount(), false, 1).a);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return h() && super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
        if (r0 != 2) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007e, code lost:
        if (r7.getMeasuredWidth() != getMeasuredWidth()) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0080, code lost:
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008a, code lost:
        if (r7.getMeasuredWidth() < getMeasuredWidth()) goto L25;
     */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.getContext()
            int r1 = r6.getDefaultHeight()
            float r0 = f.h.b.c.a.h0(r0, r1)
            int r0 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = 0
            r5 = 1
            if (r1 == r2) goto L2e
            if (r1 == 0) goto L1f
            goto L41
        L1f:
            int r8 = r6.getPaddingTop()
            int r8 = r8 + r0
            int r0 = r6.getPaddingBottom()
            int r0 = r0 + r8
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            goto L41
        L2e:
            int r1 = r6.getChildCount()
            if (r1 != r5) goto L41
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            if (r1 < r0) goto L41
            android.view.View r1 = r6.getChildAt(r4)
            r1.setMinimumHeight(r0)
        L41:
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            if (r1 == 0) goto L5f
            int r1 = r6.y
            if (r1 <= 0) goto L50
            goto L5d
        L50:
            float r0 = (float) r0
            android.content.Context r1 = r6.getContext()
            r2 = 56
            float r1 = f.h.b.c.a.h0(r1, r2)
            float r0 = r0 - r1
            int r1 = (int) r0
        L5d:
            r6.w = r1
        L5f:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r5) goto Lad
            android.view.View r7 = r6.getChildAt(r4)
            int r0 = r6.E
            if (r0 == 0) goto L82
            if (r0 == r5) goto L76
            r1 = 2
            if (r0 == r1) goto L82
            goto L8d
        L76:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 == r1) goto L8d
        L80:
            r4 = 1
            goto L8d
        L82:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 >= r1) goto L8d
            goto L80
        L8d:
            if (r4 == 0) goto Lad
            int r0 = r6.getPaddingTop()
            int r1 = r6.getPaddingBottom()
            int r1 = r1 + r0
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            int r0 = r0.height
            int r8 = android.widget.HorizontalScrollView.getChildMeasureSpec(r8, r1, r0)
            int r0 = r6.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            r7.measure(r0, r8)
        Lad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || h()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public final void p(LinearLayout.LayoutParams layoutParams) {
        if (this.E == 1 && this.B == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
            return;
        }
        layoutParams.width = -2;
        layoutParams.weight = 0.0f;
    }

    public void q(boolean z) {
        for (int i2 = 0; i2 < this.f1195h.getChildCount(); i2++) {
            View childAt = this.f1195h.getChildAt(i2);
            childAt.setMinimumWidth(getTabMinWidth());
            p((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        f.h.b.c.a.T0(this, f2);
    }

    public void setInlineLabel(boolean z) {
        if (this.F != z) {
            this.F = z;
            for (int i2 = 0; i2 < this.f1195h.getChildCount(); i2++) {
                View childAt = this.f1195h.getChildAt(i2);
                if (childAt instanceof i) {
                    i iVar = (i) childAt;
                    iVar.setOrientation(!TabLayout.this.F ? 1 : 0);
                    TextView textView = iVar.f1218l;
                    if (textView == null && iVar.f1219m == null) {
                        iVar.h(iVar.f1213g, iVar.f1214h);
                    } else {
                        iVar.h(textView, iVar.f1219m);
                    }
                }
            }
            d();
        }
    }

    public void setInlineLabelResource(int i2) {
        setInlineLabel(getResources().getBoolean(i2));
    }

    @Deprecated
    public void setOnTabSelectedListener(d dVar) {
        setOnTabSelectedListener((c) dVar);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        f();
        this.O.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (this.q != drawable) {
            if (drawable == null) {
                drawable = new GradientDrawable();
            }
            this.q = drawable;
            int i2 = this.H;
            if (i2 == -1) {
                i2 = drawable.getIntrinsicHeight();
            }
            this.f1195h.b(i2);
        }
    }

    public void setSelectedTabIndicatorColor(int i2) {
        this.r = i2;
        q(false);
    }

    public void setSelectedTabIndicatorGravity(int i2) {
        if (this.D != i2) {
            this.D = i2;
            f fVar = this.f1195h;
            AtomicInteger atomicInteger = z.a;
            z.d.k(fVar);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i2) {
        this.H = i2;
        this.f1195h.b(i2);
    }

    public void setTabGravity(int i2) {
        if (this.B != i2) {
            this.B = i2;
            d();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.o != colorStateList) {
            this.o = colorStateList;
            o();
        }
    }

    public void setTabIconTintResource(int i2) {
        setTabIconTint(e.i.c.a.getColorStateList(getContext(), i2));
    }

    public void setTabIndicatorAnimationMode(int i2) {
        this.I = i2;
        if (i2 == 0) {
            this.K = new f.h.b.c.a0.c();
        } else if (i2 == 1) {
            this.K = new f.h.b.c.a0.a();
        } else if (i2 == 2) {
            this.K = new f.h.b.c.a0.b();
        } else {
            throw new IllegalArgumentException(i2 + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.G = z;
        f fVar = this.f1195h;
        int i2 = f.f1201k;
        fVar.a();
        f fVar2 = this.f1195h;
        AtomicInteger atomicInteger = z.a;
        z.d.k(fVar2);
    }

    public void setTabMode(int i2) {
        if (i2 != this.E) {
            this.E = i2;
            d();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.p != colorStateList) {
            this.p = colorStateList;
            for (int i2 = 0; i2 < this.f1195h.getChildCount(); i2++) {
                View childAt = this.f1195h.getChildAt(i2);
                if (childAt instanceof i) {
                    Context context = getContext();
                    int i3 = i.q;
                    ((i) childAt).g(context);
                }
            }
        }
    }

    public void setTabRippleColorResource(int i2) {
        setTabRippleColor(e.i.c.a.getColorStateList(getContext(), i2));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.n != colorStateList) {
            this.n = colorStateList;
            o();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(e.e0.a.a aVar) {
        l(aVar, false);
    }

    public void setUnboundedRipple(boolean z) {
        if (this.J != z) {
            this.J = z;
            for (int i2 = 0; i2 < this.f1195h.getChildCount(); i2++) {
                View childAt = this.f1195h.getChildAt(i2);
                if (childAt instanceof i) {
                    Context context = getContext();
                    int i3 = i.q;
                    ((i) childAt).g(context);
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i2) {
        setUnboundedRipple(getResources().getBoolean(i2));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        n(viewPager, true, false);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i2) {
        b(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(c cVar) {
        c cVar2 = this.L;
        if (cVar2 != null) {
            this.M.remove(cVar2);
        }
        this.L = cVar;
        if (cVar == null || this.M.contains(cVar)) {
            return;
        }
        this.M.add(cVar);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        b(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        b(view);
    }

    public void setSelectedTabIndicator(int i2) {
        if (i2 != 0) {
            setSelectedTabIndicator(e.b.a.b(getContext(), i2));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}
