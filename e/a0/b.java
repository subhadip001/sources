package e.a0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import e.i.j.z;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ChangeBounds.java */
/* loaded from: classes.dex */
public class b extends e.a0.h {
    public static final String[] D = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final Property<Drawable, PointF> E = new a(PointF.class, "boundsOrigin");
    public static final Property<i, PointF> F = new C0019b(PointF.class, "topLeft");
    public static final Property<i, PointF> G = new c(PointF.class, "bottomRight");
    public static final Property<View, PointF> H = new d(PointF.class, "bottomRight");
    public static final Property<View, PointF> I = new e(PointF.class, "topLeft");
    public static final Property<View, PointF> J = new f(PointF.class, "position");
    public static e.a0.f K = new e.a0.f();
    public int[] C = new int[2];

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    public static class a extends Property<Drawable, PointF> {
        public Rect a;

        public a(Class cls, String str) {
            super(cls, str);
            this.a = new Rect();
        }

        @Override // android.util.Property
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.a);
            Rect rect = this.a;
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        public void set(Drawable drawable, PointF pointF) {
            Drawable drawable2 = drawable;
            PointF pointF2 = pointF;
            drawable2.copyBounds(this.a);
            this.a.offsetTo(Math.round(pointF2.x), Math.round(pointF2.y));
            drawable2.setBounds(this.a);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* renamed from: e.a0.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0019b extends Property<i, PointF> {
        public C0019b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        public void set(i iVar, PointF pointF) {
            i iVar2 = iVar;
            PointF pointF2 = pointF;
            Objects.requireNonNull(iVar2);
            iVar2.a = Math.round(pointF2.x);
            int round = Math.round(pointF2.y);
            iVar2.b = round;
            int i2 = iVar2.f1427f + 1;
            iVar2.f1427f = i2;
            if (i2 == iVar2.f1428g) {
                s.b(iVar2.f1426e, iVar2.a, round, iVar2.c, iVar2.f1425d);
                iVar2.f1427f = 0;
                iVar2.f1428g = 0;
            }
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    public static class c extends Property<i, PointF> {
        public c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        public void set(i iVar, PointF pointF) {
            i iVar2 = iVar;
            PointF pointF2 = pointF;
            Objects.requireNonNull(iVar2);
            iVar2.c = Math.round(pointF2.x);
            int round = Math.round(pointF2.y);
            iVar2.f1425d = round;
            int i2 = iVar2.f1428g + 1;
            iVar2.f1428g = i2;
            if (iVar2.f1427f == i2) {
                s.b(iVar2.f1426e, iVar2.a, iVar2.b, iVar2.c, round);
                iVar2.f1427f = 0;
                iVar2.f1428g = 0;
            }
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    public static class d extends Property<View, PointF> {
        public d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            s.b(view2, view2.getLeft(), view2.getTop(), Math.round(pointF2.x), Math.round(pointF2.y));
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    public static class e extends Property<View, PointF> {
        public e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            s.b(view2, Math.round(pointF2.x), Math.round(pointF2.y), view2.getRight(), view2.getBottom());
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    public static class f extends Property<View, PointF> {
        public f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            int round = Math.round(pointF2.x);
            int round2 = Math.round(pointF2.y);
            s.b(view2, round, round2, view2.getWidth() + round, view2.getHeight() + round2);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    public class g extends AnimatorListenerAdapter {
        public final /* synthetic */ i a;
        private i mViewBounds;

        public g(b bVar, i iVar) {
            this.a = iVar;
            this.mViewBounds = iVar;
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    public class h extends k {
        public boolean a = false;
        public final /* synthetic */ ViewGroup b;

        public h(b bVar, ViewGroup viewGroup) {
            this.b = viewGroup;
        }

        @Override // e.a0.k, e.a0.h.d
        public void b(e.a0.h hVar) {
            r.a(this.b, false);
        }

        @Override // e.a0.h.d
        public void c(e.a0.h hVar) {
            if (!this.a) {
                r.a(this.b, false);
            }
            hVar.v(this);
        }

        @Override // e.a0.k, e.a0.h.d
        public void d(e.a0.h hVar) {
            r.a(this.b, false);
            this.a = true;
        }

        @Override // e.a0.k, e.a0.h.d
        public void e(e.a0.h hVar) {
            r.a(this.b, true);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    public static class i {
        public int a;
        public int b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int f1425d;

        /* renamed from: e  reason: collision with root package name */
        public View f1426e;

        /* renamed from: f  reason: collision with root package name */
        public int f1427f;

        /* renamed from: g  reason: collision with root package name */
        public int f1428g;

        public i(View view) {
            this.f1426e = view;
        }
    }

    public final void H(p pVar) {
        View view = pVar.b;
        AtomicInteger atomicInteger = e.i.j.z.a;
        if (!z.g.c(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        pVar.a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        pVar.a.put("android:changeBounds:parent", pVar.b.getParent());
    }

    @Override // e.a0.h
    public void d(p pVar) {
        H(pVar);
    }

    @Override // e.a0.h
    public void g(p pVar) {
        H(pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e.a0.h
    public Animator k(ViewGroup viewGroup, p pVar, p pVar2) {
        int i2;
        b bVar;
        ObjectAnimator o;
        if (pVar == null || pVar2 == null) {
            return null;
        }
        Map<String, Object> map = pVar.a;
        Map<String, Object> map2 = pVar2.a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view = pVar2.b;
        Rect rect = (Rect) pVar.a.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) pVar2.a.get("android:changeBounds:bounds");
        int i3 = rect.left;
        int i4 = rect2.left;
        int i5 = rect.top;
        int i6 = rect2.top;
        int i7 = rect.right;
        int i8 = rect2.right;
        int i9 = rect.bottom;
        int i10 = rect2.bottom;
        int i11 = i7 - i3;
        int i12 = i9 - i5;
        int i13 = i8 - i4;
        int i14 = i10 - i6;
        Rect rect3 = (Rect) pVar.a.get("android:changeBounds:clip");
        Rect rect4 = (Rect) pVar2.a.get("android:changeBounds:clip");
        if ((i11 == 0 || i12 == 0) && (i13 == 0 || i14 == 0)) {
            i2 = 0;
        } else {
            i2 = (i3 == i4 && i5 == i6) ? 0 : 1;
            if (i7 != i8 || i9 != i10) {
                i2++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i2++;
        }
        int i15 = i2;
        if (i15 > 0) {
            s.b(view, i3, i5, i7, i9);
            if (i15 != 2) {
                bVar = this;
                if (i3 == i4 && i5 == i6) {
                    o = e.p.a.o(view, H, bVar.y.a(i7, i9, i8, i10));
                } else {
                    o = e.p.a.o(view, I, bVar.y.a(i3, i5, i4, i6));
                }
            } else if (i11 == i13 && i12 == i14) {
                bVar = this;
                o = e.p.a.o(view, J, bVar.y.a(i3, i5, i4, i6));
            } else {
                bVar = this;
                i iVar = new i(view);
                ObjectAnimator o2 = e.p.a.o(iVar, F, bVar.y.a(i3, i5, i4, i6));
                ObjectAnimator o3 = e.p.a.o(iVar, G, bVar.y.a(i7, i9, i8, i10));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(o2, o3);
                animatorSet.addListener(new g(bVar, iVar));
                o = animatorSet;
            }
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                r.a(viewGroup4, true);
                bVar.a(new h(bVar, viewGroup4));
            }
            return o;
        }
        return null;
    }

    @Override // e.a0.h
    public String[] p() {
        return D;
    }
}
