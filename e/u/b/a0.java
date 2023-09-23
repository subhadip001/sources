package e.u.b;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: RecyclerViewAccessibilityDelegate.java */
/* loaded from: classes.dex */
public class a0 extends e.i.j.c {

    /* renamed from: d  reason: collision with root package name */
    public final RecyclerView f2842d;

    /* renamed from: e  reason: collision with root package name */
    public final a f2843e;

    /* compiled from: RecyclerViewAccessibilityDelegate.java */
    /* loaded from: classes.dex */
    public static class a extends e.i.j.c {

        /* renamed from: d  reason: collision with root package name */
        public final a0 f2844d;

        /* renamed from: e  reason: collision with root package name */
        public Map<View, e.i.j.c> f2845e = new WeakHashMap();

        public a(a0 a0Var) {
            this.f2844d = a0Var;
        }

        @Override // e.i.j.c
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            e.i.j.c cVar = this.f2845e.get(view);
            if (cVar != null) {
                return cVar.a(view, accessibilityEvent);
            }
            return this.a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // e.i.j.c
        public e.i.j.h0.e b(View view) {
            e.i.j.c cVar = this.f2845e.get(view);
            if (cVar != null) {
                return cVar.b(view);
            }
            return super.b(view);
        }

        @Override // e.i.j.c
        public void c(View view, AccessibilityEvent accessibilityEvent) {
            e.i.j.c cVar = this.f2845e.get(view);
            if (cVar != null) {
                cVar.c(view, accessibilityEvent);
            } else {
                this.a.onInitializeAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // e.i.j.c
        public void d(View view, e.i.j.h0.d dVar) {
            if (!this.f2844d.j() && this.f2844d.f2842d.getLayoutManager() != null) {
                this.f2844d.f2842d.getLayoutManager().n0(view, dVar);
                e.i.j.c cVar = this.f2845e.get(view);
                if (cVar != null) {
                    cVar.d(view, dVar);
                    return;
                } else {
                    this.a.onInitializeAccessibilityNodeInfo(view, dVar.a);
                    return;
                }
            }
            this.a.onInitializeAccessibilityNodeInfo(view, dVar.a);
        }

        @Override // e.i.j.c
        public void e(View view, AccessibilityEvent accessibilityEvent) {
            e.i.j.c cVar = this.f2845e.get(view);
            if (cVar != null) {
                cVar.e(view, accessibilityEvent);
            } else {
                this.a.onPopulateAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // e.i.j.c
        public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            e.i.j.c cVar = this.f2845e.get(viewGroup);
            if (cVar != null) {
                return cVar.f(viewGroup, view, accessibilityEvent);
            }
            return this.a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // e.i.j.c
        public boolean g(View view, int i2, Bundle bundle) {
            if (!this.f2844d.j() && this.f2844d.f2842d.getLayoutManager() != null) {
                e.i.j.c cVar = this.f2845e.get(view);
                if (cVar != null) {
                    if (cVar.g(view, i2, bundle)) {
                        return true;
                    }
                } else if (super.g(view, i2, bundle)) {
                    return true;
                }
                RecyclerView.m layoutManager = this.f2844d.f2842d.getLayoutManager();
                RecyclerView.t tVar = layoutManager.b.f474g;
                return layoutManager.F0();
            }
            return super.g(view, i2, bundle);
        }

        @Override // e.i.j.c
        public void h(View view, int i2) {
            e.i.j.c cVar = this.f2845e.get(view);
            if (cVar != null) {
                cVar.h(view, i2);
            } else {
                this.a.sendAccessibilityEvent(view, i2);
            }
        }

        @Override // e.i.j.c
        public void i(View view, AccessibilityEvent accessibilityEvent) {
            e.i.j.c cVar = this.f2845e.get(view);
            if (cVar != null) {
                cVar.i(view, accessibilityEvent);
            } else {
                this.a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            }
        }
    }

    public a0(RecyclerView recyclerView) {
        this.f2842d = recyclerView;
        a aVar = this.f2843e;
        if (aVar != null) {
            this.f2843e = aVar;
        } else {
            this.f2843e = new a(this);
        }
    }

    @Override // e.i.j.c
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.a.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || j()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().k0(accessibilityEvent);
        }
    }

    @Override // e.i.j.c
    public void d(View view, e.i.j.h0.d dVar) {
        this.a.onInitializeAccessibilityNodeInfo(view, dVar.a);
        if (j() || this.f2842d.getLayoutManager() == null) {
            return;
        }
        RecyclerView.m layoutManager = this.f2842d.getLayoutManager();
        RecyclerView recyclerView = layoutManager.b;
        layoutManager.m0(recyclerView.f474g, recyclerView.m0, dVar);
    }

    @Override // e.i.j.c
    public boolean g(View view, int i2, Bundle bundle) {
        if (super.g(view, i2, bundle)) {
            return true;
        }
        if (j() || this.f2842d.getLayoutManager() == null) {
            return false;
        }
        RecyclerView.m layoutManager = this.f2842d.getLayoutManager();
        RecyclerView recyclerView = layoutManager.b;
        return layoutManager.E0(recyclerView.f474g, recyclerView.m0, i2, bundle);
    }

    public boolean j() {
        return this.f2842d.P();
    }
}
