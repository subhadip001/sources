package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import e.i.j.z;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.c<View> {
    public int a;

    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ View f1253f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ int f1254g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ f.h.b.c.q.a f1255h;

        public a(View view, int i2, f.h.b.c.q.a aVar) {
            this.f1253f = view;
            this.f1254g = i2;
            this.f1255h = aVar;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f1253f.getViewTreeObserver().removeOnPreDrawListener(this);
            ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
            if (expandableBehavior.a == this.f1254g) {
                f.h.b.c.q.a aVar = this.f1255h;
                expandableBehavior.C((View) aVar, this.f1253f, aVar.a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.a = 0;
    }

    public final boolean B(boolean z) {
        if (!z) {
            return this.a == 1;
        }
        int i2 = this.a;
        return i2 == 0 || i2 == 2;
    }

    public abstract boolean C(View view, View view2, boolean z, boolean z2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean g(CoordinatorLayout coordinatorLayout, View view, View view2) {
        f.h.b.c.q.a aVar = (f.h.b.c.q.a) view2;
        if (B(aVar.a())) {
            this.a = aVar.a() ? 1 : 2;
            return C((View) aVar, view, aVar.a(), true);
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, View view, int i2) {
        f.h.b.c.q.a aVar;
        AtomicInteger atomicInteger = z.a;
        if (!z.g.c(view)) {
            List<View> e2 = coordinatorLayout.e(view);
            int size = e2.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    aVar = null;
                    break;
                }
                View view2 = e2.get(i3);
                if (d(coordinatorLayout, view, view2)) {
                    aVar = (f.h.b.c.q.a) view2;
                    break;
                }
                i3++;
            }
            if (aVar != null && B(aVar.a())) {
                int i4 = aVar.a() ? 1 : 2;
                this.a = i4;
                view.getViewTreeObserver().addOnPreDrawListener(new a(view, i4, aVar));
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
    }
}
