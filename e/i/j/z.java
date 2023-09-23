package e.i.j;

import android.content.ClipData;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.video_converter.video_compressor.R;
import e.i.j.c;
import e.i.j.e;
import e.i.j.f0;
import e.i.j.h0.d;
import e.i.j.z;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ViewCompat.java */
/* loaded from: classes.dex */
public class z {
    public static Field c;

    /* renamed from: e  reason: collision with root package name */
    public static ThreadLocal<Rect> f2549e;
    public static final AtomicInteger a = new AtomicInteger(1);
    public static WeakHashMap<View, b0> b = null;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f2548d = false;

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f2550f = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* renamed from: g  reason: collision with root package name */
    public static final e.i.j.s f2551g = new e.i.j.s() { // from class: e.i.j.a
        @Override // e.i.j.s
        public final e a(e eVar) {
            AtomicInteger atomicInteger = z.a;
            return eVar;
        }
    };

    /* renamed from: h  reason: collision with root package name */
    public static final a f2552h = new a();

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class a implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: f  reason: collision with root package name */
        public final WeakHashMap<View, Boolean> f2553f = new WeakHashMap<>();

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry<View, Boolean> entry : this.f2553f.entrySet()) {
                    View key = entry.getKey();
                    boolean booleanValue = entry.getValue().booleanValue();
                    boolean z = key.getVisibility() == 0;
                    if (booleanValue != z) {
                        z.n(key, z ? 16 : 32);
                        this.f2553f.put(key, Boolean.valueOf(z));
                    }
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class c {
        public static boolean a(View view) {
            return view.hasOnClickListeners();
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class d {
        public static AccessibilityNodeProvider a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        public static boolean b(View view) {
            return view.getFitsSystemWindows();
        }

        public static int c(View view) {
            return view.getImportantForAccessibility();
        }

        public static int d(View view) {
            return view.getMinimumHeight();
        }

        public static int e(View view) {
            return view.getMinimumWidth();
        }

        public static ViewParent f(View view) {
            return view.getParentForAccessibility();
        }

        public static int g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        public static boolean h(View view) {
            return view.hasOverlappingRendering();
        }

        public static boolean i(View view) {
            return view.hasTransientState();
        }

        public static boolean j(View view, int i2, Bundle bundle) {
            return view.performAccessibilityAction(i2, bundle);
        }

        public static void k(View view) {
            view.postInvalidateOnAnimation();
        }

        public static void l(View view, int i2, int i3, int i4, int i5) {
            view.postInvalidateOnAnimation(i2, i3, i4, i5);
        }

        public static void m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        public static void n(View view, Runnable runnable, long j2) {
            view.postOnAnimationDelayed(runnable, j2);
        }

        public static void o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        public static void p(View view) {
            view.requestFitSystemWindows();
        }

        public static void q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        public static void r(View view, boolean z) {
            view.setHasTransientState(z);
        }

        public static void s(View view, int i2) {
            view.setImportantForAccessibility(i2);
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class e {
        public static int a() {
            return View.generateViewId();
        }

        public static Display b(View view) {
            return view.getDisplay();
        }

        public static int c(View view) {
            return view.getLabelFor();
        }

        public static int d(View view) {
            return view.getLayoutDirection();
        }

        public static int e(View view) {
            return view.getPaddingEnd();
        }

        public static int f(View view) {
            return view.getPaddingStart();
        }

        public static boolean g(View view) {
            return view.isPaddingRelative();
        }

        public static void h(View view, int i2) {
            view.setLabelFor(i2);
        }

        public static void i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        public static void j(View view, int i2) {
            view.setLayoutDirection(i2);
        }

        public static void k(View view, int i2, int i3, int i4, int i5) {
            view.setPaddingRelative(i2, i3, i4, i5);
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class f {
        public static Rect a(View view) {
            return view.getClipBounds();
        }

        public static boolean b(View view) {
            return view.isInLayout();
        }

        public static void c(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class g {
        public static int a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        public static boolean b(View view) {
            return view.isAttachedToWindow();
        }

        public static boolean c(View view) {
            return view.isLaidOut();
        }

        public static boolean d(View view) {
            return view.isLayoutDirectionResolved();
        }

        public static void e(ViewParent viewParent, View view, View view2, int i2) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i2);
        }

        public static void f(View view, int i2) {
            view.setAccessibilityLiveRegion(i2);
        }

        public static void g(AccessibilityEvent accessibilityEvent, int i2) {
            accessibilityEvent.setContentChangeTypes(i2);
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class h {
        public static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        public static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        public static void c(View view) {
            view.requestApplyInsets();
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class i {

        /* compiled from: ViewCompat.java */
        /* loaded from: classes.dex */
        public class a implements View.OnApplyWindowInsetsListener {
            public f0 a = null;
            public final /* synthetic */ View b;
            public final /* synthetic */ e.i.j.q c;

            public a(View view, e.i.j.q qVar) {
                this.b = view;
                this.c = qVar;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                f0 k2 = f0.k(windowInsets, view);
                int i2 = Build.VERSION.SDK_INT;
                if (i2 < 30) {
                    i.a(windowInsets, this.b);
                    if (k2.equals(this.a)) {
                        return this.c.a(view, k2).i();
                    }
                }
                this.a = k2;
                f0 a = this.c.a(view, k2);
                if (i2 >= 30) {
                    return a.i();
                }
                AtomicInteger atomicInteger = z.a;
                h.c(view);
                return a.i();
            }
        }

        public static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        public static f0 b(View view, f0 f0Var, Rect rect) {
            WindowInsets i2 = f0Var.i();
            if (i2 != null) {
                return f0.k(view.computeSystemWindowInsets(i2, rect), view);
            }
            rect.setEmpty();
            return f0Var;
        }

        public static boolean c(View view, float f2, float f3, boolean z) {
            return view.dispatchNestedFling(f2, f3, z);
        }

        public static boolean d(View view, float f2, float f3) {
            return view.dispatchNestedPreFling(f2, f3);
        }

        public static boolean e(View view, int i2, int i3, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i2, i3, iArr, iArr2);
        }

        public static boolean f(View view, int i2, int i3, int i4, int i5, int[] iArr) {
            return view.dispatchNestedScroll(i2, i3, i4, i5, iArr);
        }

        public static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        public static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        public static float i(View view) {
            return view.getElevation();
        }

        public static f0 j(View view) {
            f0.e bVar;
            if (f0.a.f2513d && view.isAttachedToWindow()) {
                try {
                    Object obj = f0.a.a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f0.a.b.get(obj);
                        Rect rect2 = (Rect) f0.a.c.get(obj);
                        if (rect == null || rect2 == null) {
                            return null;
                        }
                        int i2 = Build.VERSION.SDK_INT;
                        if (i2 >= 30) {
                            bVar = new f0.d();
                        } else if (i2 >= 29) {
                            bVar = new f0.c();
                        } else {
                            bVar = new f0.b();
                        }
                        bVar.b(e.i.d.b.b(rect.left, rect.top, rect.right, rect.bottom));
                        bVar.c(e.i.d.b.b(rect2.left, rect2.top, rect2.right, rect2.bottom));
                        f0 a2 = bVar.a();
                        a2.a.p(a2);
                        a2.a.d(view.getRootView());
                        return a2;
                    }
                    return null;
                } catch (IllegalAccessException e2) {
                    StringBuilder A = f.a.b.a.a.A("Failed to get insets from AttachInfo. ");
                    A.append(e2.getMessage());
                    Log.w("WindowInsetsCompat", A.toString(), e2);
                    return null;
                }
            }
            return null;
        }

        public static String k(View view) {
            return view.getTransitionName();
        }

        public static float l(View view) {
            return view.getTranslationZ();
        }

        public static float m(View view) {
            return view.getZ();
        }

        public static boolean n(View view) {
            return view.hasNestedScrollingParent();
        }

        public static boolean o(View view) {
            return view.isImportantForAccessibility();
        }

        public static boolean p(View view) {
            return view.isNestedScrollingEnabled();
        }

        public static void q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        public static void r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        public static void s(View view, float f2) {
            view.setElevation(f2);
        }

        public static void t(View view, boolean z) {
            view.setNestedScrollingEnabled(z);
        }

        public static void u(View view, e.i.j.q qVar) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(R.id.tag_on_apply_window_listener, qVar);
            }
            if (qVar == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, qVar));
            }
        }

        public static void v(View view, String str) {
            view.setTransitionName(str);
        }

        public static void w(View view, float f2) {
            view.setTranslationZ(f2);
        }

        public static void x(View view, float f2) {
            view.setZ(f2);
        }

        public static boolean y(View view, int i2) {
            return view.startNestedScroll(i2);
        }

        public static void z(View view) {
            view.stopNestedScroll();
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class j {
        public static int a(View view) {
            return view.getScrollIndicators();
        }

        public static void b(View view, int i2) {
            view.setScrollIndicators(i2);
        }

        public static void c(View view, int i2, int i3) {
            view.setScrollIndicators(i2, i3);
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class k {
        public static void a(View view) {
            view.cancelDragAndDrop();
        }

        public static void b(View view) {
            view.dispatchFinishTemporaryDetach();
        }

        public static void c(View view) {
            view.dispatchStartTemporaryDetach();
        }

        public static void d(View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }

        public static boolean e(View view, ClipData clipData, View.DragShadowBuilder dragShadowBuilder, Object obj, int i2) {
            return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i2);
        }

        public static void f(View view, View.DragShadowBuilder dragShadowBuilder) {
            view.updateDragShadow(dragShadowBuilder);
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class l {
        public static void a(View view, Collection<View> collection, int i2) {
            view.addKeyboardNavigationClusters(collection, i2);
        }

        public static int b(View view) {
            return view.getImportantForAutofill();
        }

        public static int c(View view) {
            return view.getNextClusterForwardId();
        }

        public static boolean d(View view) {
            return view.hasExplicitFocusable();
        }

        public static boolean e(View view) {
            return view.isFocusedByDefault();
        }

        public static boolean f(View view) {
            return view.isImportantForAutofill();
        }

        public static boolean g(View view) {
            return view.isKeyboardNavigationCluster();
        }

        public static View h(View view, View view2, int i2) {
            return view.keyboardNavigationClusterSearch(view2, i2);
        }

        public static boolean i(View view) {
            return view.restoreDefaultFocus();
        }

        public static void j(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        public static void k(View view, boolean z) {
            view.setFocusedByDefault(z);
        }

        public static void l(View view, int i2) {
            view.setImportantForAutofill(i2);
        }

        public static void m(View view, boolean z) {
            view.setKeyboardNavigationCluster(z);
        }

        public static void n(View view, int i2) {
            view.setNextClusterForwardId(i2);
        }

        public static void o(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class m {
        public static void a(View view, final r rVar) {
            e.f.h hVar = (e.f.h) view.getTag(R.id.tag_unhandled_key_listeners);
            if (hVar == null) {
                hVar = new e.f.h();
                view.setTag(R.id.tag_unhandled_key_listeners, hVar);
            }
            Objects.requireNonNull(rVar);
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener() { // from class: e.i.j.b
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    return z.r.this.onUnhandledKeyEvent(view2, keyEvent);
                }
            };
            hVar.put(rVar, onUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        public static CharSequence b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        public static boolean c(View view) {
            return view.isAccessibilityHeading();
        }

        public static boolean d(View view) {
            return view.isScreenReaderFocusable();
        }

        public static void e(View view, r rVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            e.f.h hVar = (e.f.h) view.getTag(R.id.tag_unhandled_key_listeners);
            if (hVar == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) hVar.getOrDefault(rVar, null)) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        public static <T> T f(View view, int i2) {
            return (T) view.requireViewById(i2);
        }

        public static void g(View view, boolean z) {
            view.setAccessibilityHeading(z);
        }

        public static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        public static void i(View view, boolean z) {
            view.setScreenReaderFocusable(z);
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class n {
        public static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        public static List<Rect> b(View view) {
            return view.getSystemGestureExclusionRects();
        }

        public static void c(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2, int i3) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i2, i3);
        }

        public static void d(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class o {
        public static CharSequence a(View view) {
            return view.getStateDescription();
        }

        public static void b(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static final class p {
        public static String[] a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static e.i.j.e b(View view, e.i.j.e eVar) {
            ContentInfo c = eVar.a.c();
            ContentInfo performReceiveContent = view.performReceiveContent(c);
            if (performReceiveContent == null) {
                return null;
            }
            return performReceiveContent == c ? eVar : new e.i.j.e(new e.d(performReceiveContent));
        }

        public static void c(View view, String[] strArr, e.i.j.r rVar) {
            if (rVar == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new q(rVar));
            }
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static final class q implements OnReceiveContentListener {
        public final e.i.j.r a;

        public q(e.i.j.r rVar) {
            this.a = rVar;
        }

        @Override // android.view.OnReceiveContentListener
        public ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            e.i.j.e eVar = new e.i.j.e(new e.d(contentInfo));
            e.i.j.e a = this.a.a(view, eVar);
            if (a == null) {
                return null;
            }
            return a == eVar ? contentInfo : a.a.c();
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public interface r {
        boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent);
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class s {

        /* renamed from: d  reason: collision with root package name */
        public static final ArrayList<WeakReference<View>> f2555d = new ArrayList<>();
        public WeakHashMap<View, Boolean> a = null;
        public SparseArray<WeakReference<View>> b = null;
        public WeakReference<KeyEvent> c = null;

        public final View a(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View a = a(viewGroup.getChildAt(childCount), keyEvent);
                        if (a != null) {
                            return a;
                        }
                    }
                }
                if (b(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        public final boolean b(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (((r) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
    }

    public static void a(View view, d.a aVar) {
        e.i.j.c g2 = g(view);
        if (g2 == null) {
            g2 = new e.i.j.c();
        }
        w(view, g2);
        t(aVar.a(), view);
        j(view).add(aVar);
        n(view, 0);
    }

    public static b0 b(View view) {
        if (b == null) {
            b = new WeakHashMap<>();
        }
        b0 b0Var = b.get(view);
        if (b0Var == null) {
            b0 b0Var2 = new b0(view);
            b.put(view, b0Var2);
            return b0Var2;
        }
        return b0Var;
    }

    public static void c(View view, int i2) {
        view.offsetLeftAndRight(i2);
        if (view.getVisibility() == 0) {
            float translationY = view.getTranslationY();
            view.setTranslationY(1.0f + translationY);
            view.setTranslationY(translationY);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                z((View) parent);
            }
        }
    }

    public static void d(View view, int i2) {
        view.offsetTopAndBottom(i2);
        if (view.getVisibility() == 0) {
            float translationY = view.getTranslationY();
            view.setTranslationY(1.0f + translationY);
            view.setTranslationY(translationY);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                z((View) parent);
            }
        }
    }

    public static f0 e(View view, f0 f0Var) {
        WindowInsets i2 = f0Var.i();
        if (i2 != null) {
            WindowInsets a2 = h.a(view, i2);
            if (!a2.equals(i2)) {
                return f0.k(a2, view);
            }
        }
        return f0Var;
    }

    public static boolean f(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList<WeakReference<View>> arrayList = s.f2555d;
        s sVar = (s) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (sVar == null) {
            sVar = new s();
            view.setTag(R.id.tag_unhandled_key_event_manager, sVar);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap<View, Boolean> weakHashMap = sVar.a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList2 = s.f2555d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    if (sVar.a == null) {
                        sVar.a = new WeakHashMap<>();
                    }
                    int size = arrayList2.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        ArrayList<WeakReference<View>> arrayList3 = s.f2555d;
                        View view2 = arrayList3.get(size).get();
                        if (view2 == null) {
                            arrayList3.remove(size);
                        } else {
                            sVar.a.put(view2, Boolean.TRUE);
                            for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                sVar.a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
        View a2 = sVar.a(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a2 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (sVar.b == null) {
                    sVar.b = new SparseArray<>();
                }
                sVar.b.put(keyCode, new WeakReference<>(a2));
            }
        }
        return a2 != null;
    }

    public static e.i.j.c g(View view) {
        View.AccessibilityDelegate h2 = h(view);
        if (h2 == null) {
            return null;
        }
        if (h2 instanceof c.a) {
            return ((c.a) h2).a;
        }
        return new e.i.j.c(h2);
    }

    public static View.AccessibilityDelegate h(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return n.a(view);
        }
        if (f2548d) {
            return null;
        }
        if (c == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                c = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f2548d = true;
                return null;
            }
        }
        try {
            Object obj = c.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f2548d = true;
            return null;
        }
    }

    public static CharSequence i(View view) {
        return new w(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28).d(view);
    }

    public static List<d.a> j(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            view.setTag(R.id.tag_accessibility_actions, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public static Rect k() {
        if (f2549e == null) {
            f2549e = new ThreadLocal<>();
        }
        Rect rect = f2549e.get();
        if (rect == null) {
            rect = new Rect();
            f2549e.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static String[] l(View view) {
        if (Build.VERSION.SDK_INT >= 31) {
            return p.a(view);
        }
        return (String[]) view.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static f0 m(View view) {
        if (Build.VERSION.SDK_INT >= 23) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            f0 j2 = f0.j(rootWindowInsets);
            j2.a.p(j2);
            j2.a.d(view.getRootView());
            return j2;
        }
        return i.j(view);
    }

    public static void n(View view, int i2) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = i(view) != null && view.getVisibility() == 0;
            if (g.a(view) != 0 || z) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z ? 32 : RecyclerView.a0.FLAG_MOVED);
                g.g(obtain, i2);
                if (z) {
                    obtain.getText().add(i(view));
                    if (d.c(view) == 0) {
                        d.s(view, 1);
                    }
                    ViewParent parent = view.getParent();
                    while (true) {
                        if (!(parent instanceof View)) {
                            break;
                        } else if (d.c((View) parent) == 4) {
                            d.s(view, 2);
                            break;
                        } else {
                            parent = parent.getParent();
                        }
                    }
                }
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (i2 == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                g.g(obtain2, i2);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(i(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
            } else if (view.getParent() != null) {
                try {
                    g.e(view.getParent(), view, view, i2);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e2);
                }
            }
        }
    }

    public static void o(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetLeftAndRight(i2);
            return;
        }
        Rect k2 = k();
        boolean z = false;
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            k2.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !k2.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        c(view, i2);
        if (z && k2.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(k2);
        }
    }

    public static void p(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetTopAndBottom(i2);
            return;
        }
        Rect k2 = k();
        boolean z = false;
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            k2.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !k2.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        d(view, i2);
        if (z && k2.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(k2);
        }
    }

    public static f0 q(View view, f0 f0Var) {
        WindowInsets i2 = f0Var.i();
        if (i2 != null) {
            WindowInsets b2 = h.b(view, i2);
            if (!b2.equals(i2)) {
                return f0.k(b2, view);
            }
        }
        return f0Var;
    }

    public static e.i.j.e r(View view, e.i.j.e eVar) {
        e.i.j.s sVar;
        e.i.j.s sVar2;
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + eVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return p.b(view, eVar);
        }
        e.i.j.r rVar = (e.i.j.r) view.getTag(R.id.tag_on_receive_content_listener);
        if (rVar != null) {
            e.i.j.e a2 = rVar.a(view, eVar);
            if (a2 == null) {
                return null;
            }
            if (view instanceof e.i.j.s) {
                sVar2 = (e.i.j.s) view;
            } else {
                sVar2 = f2551g;
            }
            return sVar2.a(a2);
        }
        if (view instanceof e.i.j.s) {
            sVar = (e.i.j.s) view;
        } else {
            sVar = f2551g;
        }
        return sVar.a(eVar);
    }

    public static void s(View view, int i2) {
        t(i2, view);
        n(view, 0);
    }

    public static void t(int i2, View view) {
        List<d.a> j2 = j(view);
        for (int i3 = 0; i3 < j2.size(); i3++) {
            if (j2.get(i3).a() == i2) {
                j2.remove(i3);
                return;
            }
        }
    }

    public static void u(View view, d.a aVar, CharSequence charSequence, e.i.j.h0.f fVar) {
        if (fVar == null) {
            t(aVar.a(), view);
            n(view, 0);
            return;
        }
        a(view, new d.a(null, aVar.b, null, fVar, aVar.c));
    }

    public static void v(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 29) {
            n.c(view, context, iArr, attributeSet, typedArray, i2, i3);
        }
    }

    public static void w(View view, e.i.j.c cVar) {
        if (cVar == null && (h(view) instanceof c.a)) {
            cVar = new e.i.j.c();
        }
        view.setAccessibilityDelegate(cVar == null ? null : cVar.b);
    }

    public static void x(View view, CharSequence charSequence) {
        new w(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28).e(view, charSequence);
        if (charSequence != null) {
            a aVar = f2552h;
            aVar.f2553f.put(view, Boolean.valueOf(view.getVisibility() == 0));
            view.addOnAttachStateChangeListener(aVar);
            if (g.b(view)) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(aVar);
                return;
            }
            return;
        }
        a aVar2 = f2552h;
        aVar2.f2553f.remove(view);
        view.removeOnAttachStateChangeListener(aVar2);
        d.o(view.getViewTreeObserver(), aVar2);
    }

    public static void y(View view, ColorStateList colorStateList) {
        int i2 = Build.VERSION.SDK_INT;
        i.q(view, colorStateList);
        if (i2 == 21) {
            Drawable background = view.getBackground();
            boolean z = (i.g(view) == null && i.h(view) == null) ? false : true;
            if (background == null || !z) {
                return;
            }
            if (background.isStateful()) {
                background.setState(view.getDrawableState());
            }
            d.q(view, background);
        }
    }

    public static void z(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static abstract class b<T> {
        public final int a;
        public final Class<T> b;
        public final int c;

        /* renamed from: d  reason: collision with root package name */
        public final int f2554d;

        public b(int i2, Class<T> cls, int i3) {
            this.a = i2;
            this.b = cls;
            this.f2554d = 0;
            this.c = i3;
        }

        public boolean a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        public abstract T b(View view);

        public abstract void c(View view, T t);

        public T d(View view) {
            if (Build.VERSION.SDK_INT >= this.c) {
                return b(view);
            }
            T t = (T) view.getTag(this.a);
            if (this.b.isInstance(t)) {
                return t;
            }
            return null;
        }

        public void e(View view, T t) {
            if (Build.VERSION.SDK_INT >= this.c) {
                c(view, t);
            } else if (f(d(view), t)) {
                e.i.j.c g2 = z.g(view);
                if (g2 == null) {
                    g2 = new e.i.j.c();
                }
                z.w(view, g2);
                view.setTag(this.a, t);
                z.n(view, this.f2554d);
            }
        }

        public abstract boolean f(T t, T t2);

        public b(int i2, Class<T> cls, int i3, int i4) {
            this.a = i2;
            this.b = cls;
            this.f2554d = i3;
            this.c = i4;
        }
    }
}
