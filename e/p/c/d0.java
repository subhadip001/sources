package e.p.c;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: FragmentStore.java */
/* loaded from: classes.dex */
public class d0 {
    public final ArrayList<Fragment> a = new ArrayList<>();
    public final HashMap<String, c0> b = new HashMap<>();
    public a0 c;

    public void a(Fragment fragment) {
        if (!this.a.contains(fragment)) {
            synchronized (this.a) {
                this.a.add(fragment);
            }
            fragment.mAdded = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fragment);
    }

    public void b() {
        this.b.values().removeAll(Collections.singleton(null));
    }

    public boolean c(String str) {
        return this.b.get(str) != null;
    }

    public Fragment d(String str) {
        c0 c0Var = this.b.get(str);
        if (c0Var != null) {
            return c0Var.c;
        }
        return null;
    }

    public Fragment e(String str) {
        Fragment findFragmentByWho;
        for (c0 c0Var : this.b.values()) {
            if (c0Var != null && (findFragmentByWho = c0Var.c.findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    public List<c0> f() {
        ArrayList arrayList = new ArrayList();
        for (c0 c0Var : this.b.values()) {
            if (c0Var != null) {
                arrayList.add(c0Var);
            }
        }
        return arrayList;
    }

    public List<Fragment> g() {
        ArrayList arrayList = new ArrayList();
        for (c0 c0Var : this.b.values()) {
            if (c0Var != null) {
                arrayList.add(c0Var.c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public c0 h(String str) {
        return this.b.get(str);
    }

    public List<Fragment> i() {
        ArrayList arrayList;
        if (this.a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.a) {
            arrayList = new ArrayList(this.a);
        }
        return arrayList;
    }

    public void j(c0 c0Var) {
        Fragment fragment = c0Var.c;
        if (c(fragment.mWho)) {
            return;
        }
        this.b.put(fragment.mWho, c0Var);
        if (fragment.mRetainInstanceChangedWhileDetached) {
            if (fragment.mRetainInstance) {
                this.c.d(fragment);
            } else {
                this.c.e(fragment);
            }
            fragment.mRetainInstanceChangedWhileDetached = false;
        }
        if (FragmentManager.P(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + fragment);
        }
    }

    public void k(c0 c0Var) {
        Fragment fragment = c0Var.c;
        if (fragment.mRetainInstance) {
            this.c.e(fragment);
        }
        if (this.b.put(fragment.mWho, null) != null && FragmentManager.P(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + fragment);
        }
    }

    public void l(Fragment fragment) {
        synchronized (this.a) {
            this.a.remove(fragment);
        }
        fragment.mAdded = false;
    }
}
