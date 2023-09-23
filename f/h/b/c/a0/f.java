package f.h.b.c.a0;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* compiled from: TabLayoutMediator.java */
/* loaded from: classes.dex */
public final class f {
    public final TabLayout a;
    public final ViewPager2 b;
    public final b c;

    /* renamed from: d  reason: collision with root package name */
    public RecyclerView.e<?> f5146d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f5147e;

    /* renamed from: f  reason: collision with root package name */
    public c f5148f;

    /* renamed from: g  reason: collision with root package name */
    public TabLayout.d f5149g;

    /* renamed from: h  reason: collision with root package name */
    public RecyclerView.g f5150h;

    /* compiled from: TabLayoutMediator.java */
    /* loaded from: classes.dex */
    public class a extends RecyclerView.g {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void a() {
            f.this.b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void b(int i2, int i3) {
            f.this.b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void c(int i2, int i3, Object obj) {
            f.this.b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void d(int i2, int i3) {
            f.this.b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void e(int i2, int i3, int i4) {
            f.this.b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void f(int i2, int i3) {
            f.this.b();
        }
    }

    /* compiled from: TabLayoutMediator.java */
    /* loaded from: classes.dex */
    public interface b {
        void a(TabLayout.g gVar, int i2);
    }

    /* compiled from: TabLayoutMediator.java */
    /* loaded from: classes.dex */
    public static class c extends ViewPager2.e {
        public final WeakReference<TabLayout> a;
        public int c = 0;
        public int b = 0;

        public c(TabLayout tabLayout) {
            this.a = new WeakReference<>(tabLayout);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void a(int i2) {
            this.b = this.c;
            this.c = i2;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void b(int i2, float f2, int i3) {
            TabLayout tabLayout = this.a.get();
            if (tabLayout != null) {
                int i4 = this.c;
                boolean z = false;
                tabLayout.m(i2, f2, i4 != 2 || this.b == 1, (i4 == 2 && this.b == 0) ? true : true);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void c(int i2) {
            TabLayout tabLayout = this.a.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i2 || i2 >= tabLayout.getTabCount()) {
                return;
            }
            int i3 = this.c;
            tabLayout.k(tabLayout.g(i2), i3 == 0 || (i3 == 2 && this.b == 0));
        }
    }

    /* compiled from: TabLayoutMediator.java */
    /* loaded from: classes.dex */
    public static class d implements TabLayout.d {
        public final ViewPager2 a;
        public final boolean b;

        public d(ViewPager2 viewPager2, boolean z) {
            this.a = viewPager2;
            this.b = z;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(TabLayout.g gVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(TabLayout.g gVar) {
            this.a.c(gVar.f1207d, this.b);
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(TabLayout.g gVar) {
        }
    }

    public f(TabLayout tabLayout, ViewPager2 viewPager2, b bVar) {
        this.a = tabLayout;
        this.b = viewPager2;
        this.c = bVar;
    }

    public void a() {
        if (!this.f5147e) {
            RecyclerView.e<?> adapter = this.b.getAdapter();
            this.f5146d = adapter;
            if (adapter != null) {
                this.f5147e = true;
                c cVar = new c(this.a);
                this.f5148f = cVar;
                this.b.f618h.a.add(cVar);
                d dVar = new d(this.b, true);
                this.f5149g = dVar;
                TabLayout tabLayout = this.a;
                if (!tabLayout.M.contains(dVar)) {
                    tabLayout.M.add(dVar);
                }
                a aVar = new a();
                this.f5150h = aVar;
                this.f5146d.registerAdapterDataObserver(aVar);
                b();
                this.a.m(this.b.getCurrentItem(), 0.0f, true, true);
                return;
            }
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        throw new IllegalStateException("TabLayoutMediator is already attached");
    }

    public void b() {
        this.a.j();
        RecyclerView.e<?> eVar = this.f5146d;
        if (eVar != null) {
            int itemCount = eVar.getItemCount();
            for (int i2 = 0; i2 < itemCount; i2++) {
                TabLayout.g i3 = this.a.i();
                this.c.a(i3, i2);
                this.a.a(i3, false);
            }
            if (itemCount > 0) {
                int min = Math.min(this.b.getCurrentItem(), this.a.getTabCount() - 1);
                if (min != this.a.getSelectedTabPosition()) {
                    TabLayout tabLayout = this.a;
                    tabLayout.k(tabLayout.g(min), true);
                }
            }
        }
    }
}
