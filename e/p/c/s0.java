package e.p.c;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.video_converter.video_compressor.R;
import e.i.f.b;
import e.i.j.z;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: SpecialEffectsController.java */
/* loaded from: classes.dex */
public abstract class s0 {
    public final ViewGroup a;
    public final ArrayList<d> b = new ArrayList<>();
    public final ArrayList<d> c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public boolean f2779d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2780e = false;

    /* compiled from: SpecialEffectsController.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ c f2781f;

        public a(c cVar) {
            this.f2781f = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (s0.this.b.contains(this.f2781f)) {
                c cVar = this.f2781f;
                cVar.a.a(cVar.c.mView);
            }
        }
    }

    /* compiled from: SpecialEffectsController.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ c f2783f;

        public b(c cVar) {
            this.f2783f = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            s0.this.b.remove(this.f2783f);
            s0.this.c.remove(this.f2783f);
        }
    }

    /* compiled from: SpecialEffectsController.java */
    /* loaded from: classes.dex */
    public static class c extends d {

        /* renamed from: h  reason: collision with root package name */
        public final c0 f2785h;

        public c(d.c cVar, d.b bVar, c0 c0Var, e.i.f.b bVar2) {
            super(cVar, bVar, c0Var.c, bVar2);
            this.f2785h = c0Var;
        }

        @Override // e.p.c.s0.d
        public void b() {
            super.b();
            this.f2785h.k();
        }

        @Override // e.p.c.s0.d
        public void d() {
            if (this.b == d.b.ADDING) {
                Fragment fragment = this.f2785h.c;
                View findFocus = fragment.mView.findFocus();
                if (findFocus != null) {
                    fragment.setFocusedView(findFocus);
                    if (FragmentManager.P(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + fragment);
                    }
                }
                View requireView = this.c.requireView();
                if (requireView.getParent() == null) {
                    this.f2785h.b();
                    requireView.setAlpha(0.0f);
                }
                if (requireView.getAlpha() == 0.0f && requireView.getVisibility() == 0) {
                    requireView.setVisibility(4);
                }
                requireView.setAlpha(fragment.getPostOnViewCreatedAlpha());
            }
        }
    }

    /* compiled from: SpecialEffectsController.java */
    /* loaded from: classes.dex */
    public static class d {
        public c a;
        public b b;
        public final Fragment c;

        /* renamed from: d  reason: collision with root package name */
        public final List<Runnable> f2786d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        public final HashSet<e.i.f.b> f2787e = new HashSet<>();

        /* renamed from: f  reason: collision with root package name */
        public boolean f2788f = false;

        /* renamed from: g  reason: collision with root package name */
        public boolean f2789g = false;

        /* compiled from: SpecialEffectsController.java */
        /* loaded from: classes.dex */
        public class a implements b.a {
            public a() {
            }

            @Override // e.i.f.b.a
            public void a() {
                d.this.a();
            }
        }

        /* compiled from: SpecialEffectsController.java */
        /* loaded from: classes.dex */
        public enum b {
            NONE,
            ADDING,
            REMOVING
        }

        /* compiled from: SpecialEffectsController.java */
        /* loaded from: classes.dex */
        public enum c {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            public static c d(int i2) {
                if (i2 != 0) {
                    if (i2 != 4) {
                        if (i2 == 8) {
                            return GONE;
                        }
                        throw new IllegalArgumentException(f.a.b.a.a.i("Unknown visibility ", i2));
                    }
                    return INVISIBLE;
                }
                return VISIBLE;
            }

            public static c f(View view) {
                if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
                    return INVISIBLE;
                }
                return d(view.getVisibility());
            }

            public void a(View view) {
                int ordinal = ordinal();
                if (ordinal == 0) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        if (FragmentManager.P(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                    }
                } else if (ordinal == 1) {
                    if (FragmentManager.P(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    view.setVisibility(0);
                } else if (ordinal == 2) {
                    if (FragmentManager.P(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                } else if (ordinal != 3) {
                } else {
                    if (FragmentManager.P(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                    }
                    view.setVisibility(4);
                }
            }
        }

        public d(c cVar, b bVar, Fragment fragment, e.i.f.b bVar2) {
            this.a = cVar;
            this.b = bVar;
            this.c = fragment;
            bVar2.b(new a());
        }

        public final void a() {
            if (this.f2788f) {
                return;
            }
            this.f2788f = true;
            if (this.f2787e.isEmpty()) {
                b();
                return;
            }
            Iterator it = new ArrayList(this.f2787e).iterator();
            while (it.hasNext()) {
                ((e.i.f.b) it.next()).a();
            }
        }

        public void b() {
            if (this.f2789g) {
                return;
            }
            if (FragmentManager.P(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f2789g = true;
            for (Runnable runnable : this.f2786d) {
                runnable.run();
            }
        }

        public final void c(c cVar, b bVar) {
            c cVar2 = c.REMOVED;
            int ordinal = bVar.ordinal();
            if (ordinal == 0) {
                if (this.a != cVar2) {
                    if (FragmentManager.P(2)) {
                        StringBuilder A = f.a.b.a.a.A("SpecialEffectsController: For fragment ");
                        A.append(this.c);
                        A.append(" mFinalState = ");
                        A.append(this.a);
                        A.append(" -> ");
                        A.append(cVar);
                        A.append(". ");
                        Log.v("FragmentManager", A.toString());
                    }
                    this.a = cVar;
                }
            } else if (ordinal == 1) {
                if (this.a == cVar2) {
                    if (FragmentManager.P(2)) {
                        StringBuilder A2 = f.a.b.a.a.A("SpecialEffectsController: For fragment ");
                        A2.append(this.c);
                        A2.append(" mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = ");
                        A2.append(this.b);
                        A2.append(" to ADDING.");
                        Log.v("FragmentManager", A2.toString());
                    }
                    this.a = c.VISIBLE;
                    this.b = b.ADDING;
                }
            } else if (ordinal != 2) {
            } else {
                if (FragmentManager.P(2)) {
                    StringBuilder A3 = f.a.b.a.a.A("SpecialEffectsController: For fragment ");
                    A3.append(this.c);
                    A3.append(" mFinalState = ");
                    A3.append(this.a);
                    A3.append(" -> REMOVED. mLifecycleImpact  = ");
                    A3.append(this.b);
                    A3.append(" to REMOVING.");
                    Log.v("FragmentManager", A3.toString());
                }
                this.a = cVar2;
                this.b = b.REMOVING;
            }
        }

        public void d() {
        }

        public String toString() {
            StringBuilder D = f.a.b.a.a.D("Operation ", "{");
            D.append(Integer.toHexString(System.identityHashCode(this)));
            D.append("} ");
            D.append("{");
            D.append("mFinalState = ");
            D.append(this.a);
            D.append("} ");
            D.append("{");
            D.append("mLifecycleImpact = ");
            D.append(this.b);
            D.append("} ");
            D.append("{");
            D.append("mFragment = ");
            D.append(this.c);
            D.append("}");
            return D.toString();
        }
    }

    public s0(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    public static s0 f(ViewGroup viewGroup, FragmentManager fragmentManager) {
        return g(viewGroup, fragmentManager.N());
    }

    public static s0 g(ViewGroup viewGroup, t0 t0Var) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof s0) {
            return (s0) tag;
        }
        Objects.requireNonNull((FragmentManager.f) t0Var);
        e.p.c.b bVar = new e.p.c.b(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, bVar);
        return bVar;
    }

    public final void a(d.c cVar, d.b bVar, c0 c0Var) {
        synchronized (this.b) {
            e.i.f.b bVar2 = new e.i.f.b();
            d d2 = d(c0Var.c);
            if (d2 != null) {
                d2.c(cVar, bVar);
                return;
            }
            c cVar2 = new c(cVar, bVar, c0Var, bVar2);
            this.b.add(cVar2);
            cVar2.f2786d.add(new a(cVar2));
            cVar2.f2786d.add(new b(cVar2));
        }
    }

    public abstract void b(List<d> list, boolean z);

    public void c() {
        if (this.f2780e) {
            return;
        }
        ViewGroup viewGroup = this.a;
        AtomicInteger atomicInteger = e.i.j.z.a;
        if (!z.g.b(viewGroup)) {
            e();
            this.f2779d = false;
            return;
        }
        synchronized (this.b) {
            if (!this.b.isEmpty()) {
                ArrayList arrayList = new ArrayList(this.c);
                this.c.clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    d dVar = (d) it.next();
                    if (FragmentManager.P(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + dVar);
                    }
                    dVar.a();
                    if (!dVar.f2789g) {
                        this.c.add(dVar);
                    }
                }
                i();
                ArrayList arrayList2 = new ArrayList(this.b);
                this.b.clear();
                this.c.addAll(arrayList2);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((d) it2.next()).d();
                }
                b(arrayList2, this.f2779d);
                this.f2779d = false;
            }
        }
    }

    public final d d(Fragment fragment) {
        Iterator<d> it = this.b.iterator();
        while (it.hasNext()) {
            d next = it.next();
            if (next.c.equals(fragment) && !next.f2788f) {
                return next;
            }
        }
        return null;
    }

    public void e() {
        String str;
        String str2;
        ViewGroup viewGroup = this.a;
        AtomicInteger atomicInteger = e.i.j.z.a;
        boolean b2 = z.g.b(viewGroup);
        synchronized (this.b) {
            i();
            Iterator<d> it = this.b.iterator();
            while (it.hasNext()) {
                it.next().d();
            }
            Iterator it2 = new ArrayList(this.c).iterator();
            while (it2.hasNext()) {
                d dVar = (d) it2.next();
                if (FragmentManager.P(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: ");
                    if (b2) {
                        str2 = "";
                    } else {
                        str2 = "Container " + this.a + " is not attached to window. ";
                    }
                    sb.append(str2);
                    sb.append("Cancelling running operation ");
                    sb.append(dVar);
                    Log.v("FragmentManager", sb.toString());
                }
                dVar.a();
            }
            Iterator it3 = new ArrayList(this.b).iterator();
            while (it3.hasNext()) {
                d dVar2 = (d) it3.next();
                if (FragmentManager.P(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    if (b2) {
                        str = "";
                    } else {
                        str = "Container " + this.a + " is not attached to window. ";
                    }
                    sb2.append(str);
                    sb2.append("Cancelling pending operation ");
                    sb2.append(dVar2);
                    Log.v("FragmentManager", sb2.toString());
                }
                dVar2.a();
            }
        }
    }

    public void h() {
        synchronized (this.b) {
            i();
            this.f2780e = false;
            int size = this.b.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                d dVar = this.b.get(size);
                d.c f2 = d.c.f(dVar.c.mView);
                d.c cVar = dVar.a;
                d.c cVar2 = d.c.VISIBLE;
                if (cVar == cVar2 && f2 != cVar2) {
                    this.f2780e = dVar.c.isPostponed();
                    break;
                }
                size--;
            }
        }
    }

    public final void i() {
        Iterator<d> it = this.b.iterator();
        while (it.hasNext()) {
            d next = it.next();
            if (next.b == d.b.ADDING) {
                next.c(d.c.d(next.c.requireView().getVisibility()), d.b.NONE);
            }
        }
    }
}
