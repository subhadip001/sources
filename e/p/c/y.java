package e.p.c;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: FragmentLifecycleCallbacksDispatcher.java */
/* loaded from: classes.dex */
public class y {
    public final CopyOnWriteArrayList<a> a = new CopyOnWriteArrayList<>();
    public final FragmentManager b;

    /* compiled from: FragmentLifecycleCallbacksDispatcher.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final FragmentManager.k a;
        public final boolean b;

        public a(FragmentManager.k kVar, boolean z) {
            this.a = kVar;
            this.b = z;
        }
    }

    public y(FragmentManager fragmentManager) {
        this.b = fragmentManager;
    }

    public void a(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.b.s;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().n.a(fragment, bundle, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                Objects.requireNonNull(next.a);
            }
        }
    }

    public void b(Fragment fragment, boolean z) {
        FragmentManager fragmentManager = this.b;
        Context context = fragmentManager.q.f2800g;
        Fragment fragment2 = fragmentManager.s;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().n.b(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                Objects.requireNonNull(next.a);
            }
        }
    }

    public void c(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.b.s;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().n.c(fragment, bundle, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                Objects.requireNonNull(next.a);
            }
        }
    }

    public void d(Fragment fragment, boolean z) {
        Fragment fragment2 = this.b.s;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().n.d(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                Objects.requireNonNull(next.a);
            }
        }
    }

    public void e(Fragment fragment, boolean z) {
        Fragment fragment2 = this.b.s;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().n.e(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                Objects.requireNonNull(next.a);
            }
        }
    }

    public void f(Fragment fragment, boolean z) {
        Fragment fragment2 = this.b.s;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().n.f(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                Objects.requireNonNull(next.a);
            }
        }
    }

    public void g(Fragment fragment, boolean z) {
        FragmentManager fragmentManager = this.b;
        Context context = fragmentManager.q.f2800g;
        Fragment fragment2 = fragmentManager.s;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().n.g(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                Objects.requireNonNull(next.a);
            }
        }
    }

    public void h(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.b.s;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().n.h(fragment, bundle, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                Objects.requireNonNull(next.a);
            }
        }
    }

    public void i(Fragment fragment, boolean z) {
        Fragment fragment2 = this.b.s;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().n.i(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                Objects.requireNonNull(next.a);
            }
        }
    }

    public void j(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.b.s;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().n.j(fragment, bundle, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                Objects.requireNonNull(next.a);
            }
        }
    }

    public void k(Fragment fragment, boolean z) {
        Fragment fragment2 = this.b.s;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().n.k(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                Objects.requireNonNull(next.a);
            }
        }
    }

    public void l(Fragment fragment, boolean z) {
        Fragment fragment2 = this.b.s;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().n.l(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                Objects.requireNonNull(next.a);
            }
        }
    }

    public void m(Fragment fragment, View view, Bundle bundle, boolean z) {
        Fragment fragment2 = this.b.s;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().n.m(fragment, view, bundle, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                FragmentManager.k kVar = next.a;
                FragmentManager fragmentManager = this.b;
                e.f0.b.b bVar = (e.f0.b.b) kVar;
                if (fragment == bVar.a) {
                    y yVar = fragmentManager.n;
                    synchronized (yVar.a) {
                        int i2 = 0;
                        int size = yVar.a.size();
                        while (true) {
                            if (i2 >= size) {
                                break;
                            } else if (yVar.a.get(i2).a == bVar) {
                                yVar.a.remove(i2);
                                break;
                            } else {
                                i2++;
                            }
                        }
                    }
                    bVar.c.n(view, bVar.b);
                } else {
                    continue;
                }
            }
        }
    }

    public void n(Fragment fragment, boolean z) {
        Fragment fragment2 = this.b.s;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().n.n(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                Objects.requireNonNull(next.a);
            }
        }
    }
}
