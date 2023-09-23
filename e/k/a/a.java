package e.k.a;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.gms.common.api.Api;
import com.google.android.material.chip.Chip;
import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import e.f.i;
import e.i.j.z;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ExploreByTouchHelper.java */
/* loaded from: classes.dex */
public abstract class a extends e.i.j.c {
    public static final Rect n = new Rect(Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public static final e.k.a.b<e.i.j.h0.d> o = new C0048a();
    public static final e.k.a.c<i<e.i.j.h0.d>, e.i.j.h0.d> p = new b();

    /* renamed from: h  reason: collision with root package name */
    public final AccessibilityManager f2588h;

    /* renamed from: i  reason: collision with root package name */
    public final View f2589i;

    /* renamed from: j  reason: collision with root package name */
    public c f2590j;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f2584d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    public final Rect f2585e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    public final Rect f2586f = new Rect();

    /* renamed from: g  reason: collision with root package name */
    public final int[] f2587g = new int[2];

    /* renamed from: k  reason: collision with root package name */
    public int f2591k = Integer.MIN_VALUE;

    /* renamed from: l  reason: collision with root package name */
    public int f2592l = Integer.MIN_VALUE;

    /* renamed from: m  reason: collision with root package name */
    public int f2593m = Integer.MIN_VALUE;

    /* compiled from: ExploreByTouchHelper.java */
    /* renamed from: e.k.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0048a implements e.k.a.b<e.i.j.h0.d> {
        public void a(Object obj, Rect rect) {
            ((e.i.j.h0.d) obj).a.getBoundsInParent(rect);
        }
    }

    /* compiled from: ExploreByTouchHelper.java */
    /* loaded from: classes.dex */
    public class b implements e.k.a.c<i<e.i.j.h0.d>, e.i.j.h0.d> {
    }

    /* compiled from: ExploreByTouchHelper.java */
    /* loaded from: classes.dex */
    public class c extends e.i.j.h0.e {
        public c() {
        }

        @Override // e.i.j.h0.e
        public e.i.j.h0.d a(int i2) {
            return new e.i.j.h0.d(AccessibilityNodeInfo.obtain(a.this.o(i2).a));
        }

        @Override // e.i.j.h0.e
        public e.i.j.h0.d b(int i2) {
            int i3 = i2 == 2 ? a.this.f2591k : a.this.f2592l;
            if (i3 == Integer.MIN_VALUE) {
                return null;
            }
            return new e.i.j.h0.d(AccessibilityNodeInfo.obtain(a.this.o(i3).a));
        }

        @Override // e.i.j.h0.e
        public boolean c(int i2, int i3, Bundle bundle) {
            int i4;
            a aVar = a.this;
            if (i2 == -1) {
                View view = aVar.f2589i;
                AtomicInteger atomicInteger = z.a;
                return z.d.j(view, i3, bundle);
            }
            boolean z = true;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 64) {
                        if (i3 != 128) {
                            return aVar.p(i2, i3, bundle);
                        }
                        return aVar.j(i2);
                    }
                    if (aVar.f2588h.isEnabled() && aVar.f2588h.isTouchExplorationEnabled() && (i4 = aVar.f2591k) != i2) {
                        if (i4 != Integer.MIN_VALUE) {
                            aVar.j(i4);
                        }
                        aVar.f2591k = i2;
                        aVar.f2589i.invalidate();
                        aVar.s(i2, 32768);
                    } else {
                        z = false;
                    }
                    return z;
                }
                return aVar.k(i2);
            }
            return aVar.r(i2);
        }
    }

    public a(View view) {
        if (view != null) {
            this.f2589i = view;
            this.f2588h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            AtomicInteger atomicInteger = z.a;
            if (z.d.c(view) == 0) {
                z.d.s(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    @Override // e.i.j.c
    public e.i.j.h0.e b(View view) {
        if (this.f2590j == null) {
            this.f2590j = new c();
        }
        return this.f2590j;
    }

    @Override // e.i.j.c
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // e.i.j.c
    public void d(View view, e.i.j.h0.d dVar) {
        this.a.onInitializeAccessibilityNodeInfo(view, dVar.a);
        Chip.b bVar = (Chip.b) this;
        dVar.a.setCheckable(Chip.this.f());
        dVar.a.setClickable(Chip.this.isClickable());
        dVar.a.setClassName(Chip.this.getAccessibilityClassName());
        CharSequence text = Chip.this.getText();
        if (Build.VERSION.SDK_INT >= 23) {
            dVar.a.setText(text);
        } else {
            dVar.a.setContentDescription(text);
        }
    }

    public final boolean j(int i2) {
        if (this.f2591k == i2) {
            this.f2591k = Integer.MIN_VALUE;
            this.f2589i.invalidate();
            s(i2, LogFileManager.MAX_LOG_SIZE);
            return true;
        }
        return false;
    }

    public final boolean k(int i2) {
        if (this.f2592l != i2) {
            return false;
        }
        this.f2592l = Integer.MIN_VALUE;
        Chip.b bVar = (Chip.b) this;
        if (i2 == 1) {
            Chip chip = Chip.this;
            chip.s = false;
            chip.refreshDrawableState();
        }
        s(i2, 8);
        return true;
    }

    public final e.i.j.h0.d l(int i2) {
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        e.i.j.h0.d dVar = new e.i.j.h0.d(obtain);
        obtain.setEnabled(true);
        dVar.a.setFocusable(true);
        dVar.a.setClassName("android.view.View");
        Rect rect = n;
        dVar.a.setBoundsInParent(rect);
        dVar.a.setBoundsInScreen(rect);
        dVar.p(this.f2589i);
        q(i2, dVar);
        if (dVar.i() == null && dVar.g() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        dVar.a.getBoundsInParent(this.f2585e);
        if (!this.f2585e.equals(rect)) {
            int d2 = dVar.d();
            if ((d2 & 64) == 0) {
                if ((d2 & 128) == 0) {
                    dVar.a.setPackageName(this.f2589i.getContext().getPackageName());
                    View view = this.f2589i;
                    dVar.c = i2;
                    dVar.a.setSource(view, i2);
                    boolean z = false;
                    if (this.f2591k == i2) {
                        dVar.a.setAccessibilityFocused(true);
                        dVar.a.addAction(128);
                    } else {
                        dVar.a.setAccessibilityFocused(false);
                        dVar.a.addAction(64);
                    }
                    boolean z2 = this.f2592l == i2;
                    if (z2) {
                        dVar.a.addAction(2);
                    } else if (dVar.a.isFocusable()) {
                        dVar.a.addAction(1);
                    }
                    dVar.a.setFocused(z2);
                    this.f2589i.getLocationOnScreen(this.f2587g);
                    dVar.a.getBoundsInScreen(this.f2584d);
                    if (this.f2584d.equals(rect)) {
                        dVar.a.getBoundsInParent(this.f2584d);
                        if (dVar.b != -1) {
                            e.i.j.h0.d dVar2 = new e.i.j.h0.d(AccessibilityNodeInfo.obtain());
                            for (int i3 = dVar.b; i3 != -1; i3 = dVar2.b) {
                                View view2 = this.f2589i;
                                dVar2.b = -1;
                                dVar2.a.setParent(view2, -1);
                                dVar2.a.setBoundsInParent(n);
                                q(i3, dVar2);
                                dVar2.a.getBoundsInParent(this.f2585e);
                                Rect rect2 = this.f2584d;
                                Rect rect3 = this.f2585e;
                                rect2.offset(rect3.left, rect3.top);
                            }
                            dVar2.a.recycle();
                        }
                        this.f2584d.offset(this.f2587g[0] - this.f2589i.getScrollX(), this.f2587g[1] - this.f2589i.getScrollY());
                    }
                    if (this.f2589i.getLocalVisibleRect(this.f2586f)) {
                        this.f2586f.offset(this.f2587g[0] - this.f2589i.getScrollX(), this.f2587g[1] - this.f2589i.getScrollY());
                        if (this.f2584d.intersect(this.f2586f)) {
                            dVar.a.setBoundsInScreen(this.f2584d);
                            Rect rect4 = this.f2584d;
                            if (rect4 != null && !rect4.isEmpty() && this.f2589i.getWindowVisibility() == 0) {
                                ViewParent parent = this.f2589i.getParent();
                                while (true) {
                                    if (parent instanceof View) {
                                        View view3 = (View) parent;
                                        if (view3.getAlpha() <= 0.0f || view3.getVisibility() != 0) {
                                            break;
                                        }
                                        parent = view3.getParent();
                                    } else if (parent != null) {
                                        z = true;
                                    }
                                }
                            }
                            if (z) {
                                dVar.a.setVisibleToUser(true);
                            }
                        }
                    }
                    return dVar;
                }
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
    }

    public abstract void m(List<Integer> list);

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0143, code lost:
        if (r13 < ((r17 * r17) + ((r12 * 13) * r12))) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x014f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean n(int r20, android.graphics.Rect r21) {
        /*
            Method dump skipped, instructions count: 479
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.k.a.a.n(int, android.graphics.Rect):boolean");
    }

    public e.i.j.h0.d o(int i2) {
        if (i2 == -1) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(this.f2589i);
            e.i.j.h0.d dVar = new e.i.j.h0.d(obtain);
            View view = this.f2589i;
            AtomicInteger atomicInteger = z.a;
            view.onInitializeAccessibilityNodeInfo(obtain);
            ArrayList arrayList = new ArrayList();
            m(arrayList);
            if (dVar.a.getChildCount() > 0 && arrayList.size() > 0) {
                throw new RuntimeException("Views cannot have both real and virtual children");
            }
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                dVar.a.addChild(this.f2589i, ((Integer) arrayList.get(i3)).intValue());
            }
            return dVar;
        }
        return l(i2);
    }

    public abstract boolean p(int i2, int i3, Bundle bundle);

    public abstract void q(int i2, e.i.j.h0.d dVar);

    public final boolean r(int i2) {
        int i3;
        if ((this.f2589i.isFocused() || this.f2589i.requestFocus()) && (i3 = this.f2592l) != i2) {
            if (i3 != Integer.MIN_VALUE) {
                k(i3);
            }
            if (i2 == Integer.MIN_VALUE) {
                return false;
            }
            this.f2592l = i2;
            Chip.b bVar = (Chip.b) this;
            if (i2 == 1) {
                Chip chip = Chip.this;
                chip.s = true;
                chip.refreshDrawableState();
            }
            s(i2, 8);
            return true;
        }
        return false;
    }

    public final boolean s(int i2, int i3) {
        ViewParent parent;
        AccessibilityEvent obtain;
        if (i2 == Integer.MIN_VALUE || !this.f2588h.isEnabled() || (parent = this.f2589i.getParent()) == null) {
            return false;
        }
        if (i2 != -1) {
            obtain = AccessibilityEvent.obtain(i3);
            e.i.j.h0.d o2 = o(i2);
            obtain.getText().add(o2.i());
            obtain.setContentDescription(o2.g());
            obtain.setScrollable(o2.a.isScrollable());
            obtain.setPassword(o2.a.isPassword());
            obtain.setEnabled(o2.j());
            obtain.setChecked(o2.a.isChecked());
            if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            obtain.setClassName(o2.e());
            obtain.setSource(this.f2589i, i2);
            obtain.setPackageName(this.f2589i.getContext().getPackageName());
        } else {
            obtain = AccessibilityEvent.obtain(i3);
            this.f2589i.onInitializeAccessibilityEvent(obtain);
        }
        return parent.requestSendAccessibilityEvent(this.f2589i, obtain);
    }
}
