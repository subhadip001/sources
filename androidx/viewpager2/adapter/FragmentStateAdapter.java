package androidx.viewpager2.adapter;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import e.f.e;
import e.f0.b.c;
import e.f0.b.d;
import e.f0.b.f;
import e.f0.b.g;
import e.i.j.z;
import e.p.c.c0;
import e.p.c.y;
import e.s.k;
import e.s.m;
import e.s.n;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class FragmentStateAdapter extends RecyclerView.e<f> implements g {
    public final Lifecycle a;
    public final FragmentManager b;

    /* renamed from: f  reason: collision with root package name */
    public b f605f;
    public final e<Fragment> c = new e<>();

    /* renamed from: d  reason: collision with root package name */
    public final e<Fragment.SavedState> f603d = new e<>();

    /* renamed from: e  reason: collision with root package name */
    public final e<Integer> f604e = new e<>();

    /* renamed from: g  reason: collision with root package name */
    public boolean f606g = false;

    /* renamed from: h  reason: collision with root package name */
    public boolean f607h = false;

    /* loaded from: classes.dex */
    public static abstract class a extends RecyclerView.g {
        public a(e.f0.b.a aVar) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void b(int i2, int i3) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void c(int i2, int i3, Object obj) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void d(int i2, int i3) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void e(int i2, int i3, int i4) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void f(int i2, int i3) {
            a();
        }
    }

    /* loaded from: classes.dex */
    public class b {
        public ViewPager2.e a;
        public RecyclerView.g b;
        public k c;

        /* renamed from: d  reason: collision with root package name */
        public ViewPager2 f613d;

        /* renamed from: e  reason: collision with root package name */
        public long f614e = -1;

        public b() {
        }

        public final ViewPager2 a(RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                return (ViewPager2) parent;
            }
            throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
        }

        public void b(boolean z) {
            int currentItem;
            Fragment f2;
            if (FragmentStateAdapter.this.v() || this.f613d.getScrollState() != 0 || FragmentStateAdapter.this.c.h() || FragmentStateAdapter.this.getItemCount() == 0 || (currentItem = this.f613d.getCurrentItem()) >= FragmentStateAdapter.this.getItemCount()) {
                return;
            }
            Objects.requireNonNull(FragmentStateAdapter.this);
            long j2 = currentItem;
            if ((j2 != this.f614e || z) && (f2 = FragmentStateAdapter.this.c.f(j2)) != null && f2.isAdded()) {
                this.f614e = j2;
                e.p.c.a aVar = new e.p.c.a(FragmentStateAdapter.this.b);
                Fragment fragment = null;
                for (int i2 = 0; i2 < FragmentStateAdapter.this.c.l(); i2++) {
                    long i3 = FragmentStateAdapter.this.c.i(i2);
                    Fragment m2 = FragmentStateAdapter.this.c.m(i2);
                    if (m2.isAdded()) {
                        if (i3 != this.f614e) {
                            aVar.r(m2, Lifecycle.State.STARTED);
                        } else {
                            fragment = m2;
                        }
                        m2.setMenuVisibility(i3 == this.f614e);
                    }
                }
                if (fragment != null) {
                    aVar.r(fragment, Lifecycle.State.RESUMED);
                }
                if (aVar.a.isEmpty()) {
                    return;
                }
                aVar.f();
            }
        }
    }

    public FragmentStateAdapter(FragmentManager fragmentManager, Lifecycle lifecycle) {
        this.b = fragmentManager;
        this.a = lifecycle;
        super.setHasStableIds(true);
    }

    public static boolean r(String str, String str2) {
        return str.startsWith(str2) && str.length() > str2.length();
    }

    @Override // e.f0.b.g
    public final Parcelable b() {
        Bundle bundle = new Bundle(this.f603d.l() + this.c.l());
        for (int i2 = 0; i2 < this.c.l(); i2++) {
            long i3 = this.c.i(i2);
            Fragment f2 = this.c.f(i3);
            if (f2 != null && f2.isAdded()) {
                String l2 = f.a.b.a.a.l("f#", i3);
                FragmentManager fragmentManager = this.b;
                Objects.requireNonNull(fragmentManager);
                if (f2.mFragmentManager == fragmentManager) {
                    bundle.putString(l2, f2.mWho);
                } else {
                    fragmentManager.n0(new IllegalStateException(f.a.b.a.a.o("Fragment ", f2, " is not currently in the FragmentManager")));
                    throw null;
                }
            }
        }
        for (int i4 = 0; i4 < this.f603d.l(); i4++) {
            long i5 = this.f603d.i(i4);
            if (o(i5)) {
                bundle.putParcelable(f.a.b.a.a.l("s#", i5), this.f603d.f(i5));
            }
        }
        return bundle;
    }

    @Override // e.f0.b.g
    public final void f(Parcelable parcelable) {
        if (this.f603d.h() && this.c.h()) {
            Bundle bundle = (Bundle) parcelable;
            if (bundle.getClassLoader() == null) {
                bundle.setClassLoader(getClass().getClassLoader());
            }
            for (String str : bundle.keySet()) {
                if (r(str, "f#")) {
                    long parseLong = Long.parseLong(str.substring(2));
                    FragmentManager fragmentManager = this.b;
                    Objects.requireNonNull(fragmentManager);
                    String string = bundle.getString(str);
                    Fragment fragment = null;
                    if (string != null) {
                        Fragment d2 = fragmentManager.c.d(string);
                        if (d2 == null) {
                            fragmentManager.n0(new IllegalStateException(f.a.b.a.a.r("Fragment no longer exists for key ", str, ": unique id ", string)));
                            throw null;
                        }
                        fragment = d2;
                    }
                    this.c.j(parseLong, fragment);
                } else if (r(str, "s#")) {
                    long parseLong2 = Long.parseLong(str.substring(2));
                    Fragment.SavedState savedState = (Fragment.SavedState) bundle.getParcelable(str);
                    if (o(parseLong2)) {
                        this.f603d.j(parseLong2, savedState);
                    }
                } else {
                    throw new IllegalArgumentException(f.a.b.a.a.p("Unexpected key in savedState: ", str));
                }
            }
            if (this.c.h()) {
                return;
            }
            this.f607h = true;
            this.f606g = true;
            q();
            final Handler handler = new Handler(Looper.getMainLooper());
            final c cVar = new c(this);
            this.a.a(new k(this) { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.5
                @Override // e.s.k
                public void d(m mVar, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        handler.removeCallbacks(cVar);
                        n nVar = (n) mVar.getLifecycle();
                        nVar.d("removeObserver");
                        nVar.a.e(this);
                    }
                }
            });
            handler.postDelayed(cVar, 10000L);
            return;
        }
        throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public long getItemId(int i2) {
        return i2;
    }

    public void n(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() <= 1) {
            if (view.getParent() == frameLayout) {
                return;
            }
            if (frameLayout.getChildCount() > 0) {
                frameLayout.removeAllViews();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            frameLayout.addView(view);
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    public boolean o(long j2) {
        return j2 >= 0 && j2 < ((long) getItemCount());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        if (this.f605f == null) {
            final b bVar = new b();
            this.f605f = bVar;
            ViewPager2 a2 = bVar.a(recyclerView);
            bVar.f613d = a2;
            d dVar = new d(bVar);
            bVar.a = dVar;
            a2.f618h.a.add(dVar);
            e.f0.b.e eVar = new e.f0.b.e(bVar);
            bVar.b = eVar;
            FragmentStateAdapter.this.registerAdapterDataObserver(eVar);
            k kVar = new k() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3
                @Override // e.s.k
                public void d(m mVar, Lifecycle.Event event) {
                    FragmentStateAdapter.b.this.b(false);
                }
            };
            bVar.c = kVar;
            FragmentStateAdapter.this.a.a(kVar);
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void onBindViewHolder(f fVar, int i2) {
        f fVar2 = fVar;
        long itemId = fVar2.getItemId();
        int id = ((FrameLayout) fVar2.itemView).getId();
        Long s = s(id);
        if (s != null && s.longValue() != itemId) {
            u(s.longValue());
            this.f604e.k(s.longValue());
        }
        this.f604e.j(itemId, Integer.valueOf(id));
        long j2 = i2;
        if (!this.c.d(j2)) {
            Fragment p = p(i2);
            p.setInitialSavedState(this.f603d.f(j2));
            this.c.j(j2, p);
        }
        FrameLayout frameLayout = (FrameLayout) fVar2.itemView;
        AtomicInteger atomicInteger = z.a;
        if (z.g.b(frameLayout)) {
            if (frameLayout.getParent() == null) {
                frameLayout.addOnLayoutChangeListener(new e.f0.b.a(this, frameLayout, fVar2));
            } else {
                throw new IllegalStateException("Design assumption violated.");
            }
        }
        q();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public f onCreateViewHolder(ViewGroup viewGroup, int i2) {
        int i3 = f.a;
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        AtomicInteger atomicInteger = z.a;
        frameLayout.setId(z.e.a());
        frameLayout.setSaveEnabled(false);
        return new f(frameLayout);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        b bVar = this.f605f;
        ViewPager2 a2 = bVar.a(recyclerView);
        a2.f618h.a.remove(bVar.a);
        FragmentStateAdapter.this.unregisterAdapterDataObserver(bVar.b);
        FragmentStateAdapter.this.a.b(bVar.c);
        bVar.f613d = null;
        this.f605f = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public /* bridge */ /* synthetic */ boolean onFailedToRecycleView(f fVar) {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void onViewAttachedToWindow(f fVar) {
        t(fVar);
        q();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void onViewRecycled(f fVar) {
        Long s = s(((FrameLayout) fVar.itemView).getId());
        if (s != null) {
            u(s.longValue());
            this.f604e.k(s.longValue());
        }
    }

    public abstract Fragment p(int i2);

    public void q() {
        Fragment g2;
        View view;
        if (!this.f607h || v()) {
            return;
        }
        e.f.c cVar = new e.f.c(0);
        for (int i2 = 0; i2 < this.c.l(); i2++) {
            long i3 = this.c.i(i2);
            if (!o(i3)) {
                cVar.add(Long.valueOf(i3));
                this.f604e.k(i3);
            }
        }
        if (!this.f606g) {
            this.f607h = false;
            for (int i4 = 0; i4 < this.c.l(); i4++) {
                long i5 = this.c.i(i4);
                boolean z = true;
                if (!this.f604e.d(i5) && ((g2 = this.c.g(i5, null)) == null || (view = g2.getView()) == null || view.getParent() == null)) {
                    z = false;
                }
                if (!z) {
                    cVar.add(Long.valueOf(i5));
                }
            }
        }
        Iterator it = cVar.iterator();
        while (it.hasNext()) {
            u(((Long) it.next()).longValue());
        }
    }

    public final Long s(int i2) {
        Long l2 = null;
        for (int i3 = 0; i3 < this.f604e.l(); i3++) {
            if (this.f604e.m(i3).intValue() == i2) {
                if (l2 == null) {
                    l2 = Long.valueOf(this.f604e.i(i3));
                } else {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
            }
        }
        return l2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void setHasStableIds(boolean z) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }

    public void t(final f fVar) {
        Fragment f2 = this.c.f(fVar.getItemId());
        if (f2 != null) {
            FrameLayout frameLayout = (FrameLayout) fVar.itemView;
            View view = f2.getView();
            if (!f2.isAdded() && view != null) {
                throw new IllegalStateException("Design assumption violated.");
            }
            if (f2.isAdded() && view == null) {
                this.b.n.a.add(new y.a(new e.f0.b.b(this, f2, frameLayout), false));
                return;
            } else if (f2.isAdded() && view.getParent() != null) {
                if (view.getParent() != frameLayout) {
                    n(view, frameLayout);
                    return;
                }
                return;
            } else if (f2.isAdded()) {
                n(view, frameLayout);
                return;
            } else if (!v()) {
                this.b.n.a.add(new y.a(new e.f0.b.b(this, f2, frameLayout), false));
                e.p.c.a aVar = new e.p.c.a(this.b);
                StringBuilder A = f.a.b.a.a.A("f");
                A.append(fVar.getItemId());
                aVar.g(0, f2, A.toString(), 1);
                aVar.r(f2, Lifecycle.State.STARTED);
                aVar.f();
                this.f605f.b(false);
                return;
            } else if (this.b.D) {
                return;
            } else {
                this.a.a(new k() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.2
                    @Override // e.s.k
                    public void d(m mVar, Lifecycle.Event event) {
                        if (FragmentStateAdapter.this.v()) {
                            return;
                        }
                        n nVar = (n) mVar.getLifecycle();
                        nVar.d("removeObserver");
                        nVar.a.e(this);
                        AtomicInteger atomicInteger = z.a;
                        if (z.g.b((FrameLayout) fVar.itemView)) {
                            FragmentStateAdapter.this.t(fVar);
                        }
                    }
                });
                return;
            }
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    public final void u(long j2) {
        Bundle o;
        ViewParent parent;
        Fragment.SavedState savedState = null;
        Fragment g2 = this.c.g(j2, null);
        if (g2 == null) {
            return;
        }
        if (g2.getView() != null && (parent = g2.getView().getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        if (!o(j2)) {
            this.f603d.k(j2);
        }
        if (!g2.isAdded()) {
            this.c.k(j2);
        } else if (v()) {
            this.f607h = true;
        } else {
            if (g2.isAdded() && o(j2)) {
                e<Fragment.SavedState> eVar = this.f603d;
                FragmentManager fragmentManager = this.b;
                c0 h2 = fragmentManager.c.h(g2.mWho);
                if (h2 != null && h2.c.equals(g2)) {
                    if (h2.c.mState > -1 && (o = h2.o()) != null) {
                        savedState = new Fragment.SavedState(o);
                    }
                    eVar.j(j2, savedState);
                } else {
                    fragmentManager.n0(new IllegalStateException(f.a.b.a.a.o("Fragment ", g2, " is not currently in the FragmentManager")));
                    throw null;
                }
            }
            e.p.c.a aVar = new e.p.c.a(this.b);
            aVar.q(g2);
            aVar.f();
            this.c.k(j2);
        }
    }

    public boolean v() {
        return this.b.T();
    }
}
