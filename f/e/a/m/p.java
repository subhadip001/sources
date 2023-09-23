package f.e.a.m;

import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* compiled from: RequestManagerFragment.java */
@Deprecated
/* loaded from: classes.dex */
public class p extends Fragment {

    /* renamed from: f  reason: collision with root package name */
    public final f.e.a.m.a f3526f;

    /* renamed from: g  reason: collision with root package name */
    public final r f3527g;

    /* renamed from: h  reason: collision with root package name */
    public final Set<p> f3528h;

    /* renamed from: i  reason: collision with root package name */
    public f.e.a.h f3529i;

    /* renamed from: j  reason: collision with root package name */
    public p f3530j;

    /* renamed from: k  reason: collision with root package name */
    public Fragment f3531k;

    /* compiled from: RequestManagerFragment.java */
    /* loaded from: classes.dex */
    public class a implements r {
        public a() {
        }

        public String toString() {
            return super.toString() + "{fragment=" + p.this + "}";
        }
    }

    public p() {
        f.e.a.m.a aVar = new f.e.a.m.a();
        this.f3527g = new a();
        this.f3528h = new HashSet();
        this.f3526f = aVar;
    }

    public final void a(Activity activity) {
        b();
        q qVar = f.e.a.b.b(activity).f3157j;
        Objects.requireNonNull(qVar);
        p h2 = qVar.h(activity.getFragmentManager(), null);
        this.f3530j = h2;
        if (equals(h2)) {
            return;
        }
        this.f3530j.f3528h.add(this);
    }

    public final void b() {
        p pVar = this.f3530j;
        if (pVar != null) {
            pVar.f3528h.remove(this);
            this.f3530j = null;
        }
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            a(activity);
        } catch (IllegalStateException e2) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e2);
            }
        }
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f3526f.a();
        b();
    }

    @Override // android.app.Fragment
    public void onDetach() {
        super.onDetach();
        b();
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.f3526f.b();
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        this.f3526f.d();
    }

    @Override // android.app.Fragment
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{parent=");
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = this.f3531k;
        }
        sb.append(parentFragment);
        sb.append("}");
        return sb.toString();
    }
}
