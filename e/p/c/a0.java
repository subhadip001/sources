package e.p.c;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: FragmentManagerViewModel.java */
/* loaded from: classes.dex */
public final class a0 extends e.s.b0 {

    /* renamed from: i  reason: collision with root package name */
    public static final e.s.e0 f2672i = new a();

    /* renamed from: f  reason: collision with root package name */
    public final boolean f2675f;
    public final HashMap<String, Fragment> c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    public final HashMap<String, a0> f2673d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    public final HashMap<String, e.s.i0> f2674e = new HashMap<>();

    /* renamed from: g  reason: collision with root package name */
    public boolean f2676g = false;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2677h = false;

    /* compiled from: FragmentManagerViewModel.java */
    /* loaded from: classes.dex */
    public class a implements e.s.e0 {
        @Override // e.s.e0
        public <T extends e.s.b0> T a(Class<T> cls) {
            return new a0(true);
        }
    }

    public a0(boolean z) {
        this.f2675f = z;
    }

    @Override // e.s.b0
    public void b() {
        if (FragmentManager.P(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f2676g = true;
    }

    public void d(Fragment fragment) {
        if (this.f2677h) {
            if (FragmentManager.P(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else if (this.c.containsKey(fragment.mWho)) {
        } else {
            this.c.put(fragment.mWho, fragment);
            if (FragmentManager.P(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
            }
        }
    }

    public void e(Fragment fragment) {
        if (this.f2677h) {
            if (FragmentManager.P(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        if ((this.c.remove(fragment.mWho) != null) && FragmentManager.P(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a0.class != obj.getClass()) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.c.equals(a0Var.c) && this.f2673d.equals(a0Var.f2673d) && this.f2674e.equals(a0Var.f2674e);
    }

    public boolean f(Fragment fragment) {
        if (this.c.containsKey(fragment.mWho) && this.f2675f) {
            return this.f2676g;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = this.f2673d.hashCode();
        return this.f2674e.hashCode() + ((hashCode + (this.c.hashCode() * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.c.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f2673d.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f2674e.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
