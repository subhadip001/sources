package f.e.a.m;

import android.content.Context;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.HashSet;
import java.util.Set;

/* compiled from: SupportRequestManagerFragment.java */
/* loaded from: classes.dex */
public class x extends Fragment {

    /* renamed from: f  reason: collision with root package name */
    public final f.e.a.m.a f3553f;

    /* renamed from: g  reason: collision with root package name */
    public final r f3554g;

    /* renamed from: h  reason: collision with root package name */
    public final Set<x> f3555h;

    /* renamed from: i  reason: collision with root package name */
    public x f3556i;

    /* renamed from: j  reason: collision with root package name */
    public f.e.a.h f3557j;

    /* renamed from: k  reason: collision with root package name */
    public Fragment f3558k;

    /* compiled from: SupportRequestManagerFragment.java */
    /* loaded from: classes.dex */
    public class a implements r {
        public a() {
        }

        public String toString() {
            return super.toString() + "{fragment=" + x.this + "}";
        }
    }

    public x() {
        f.e.a.m.a aVar = new f.e.a.m.a();
        this.f3554g = new a();
        this.f3555h = new HashSet();
        this.f3553f = aVar;
    }

    public final Fragment i() {
        Fragment parentFragment = getParentFragment();
        return parentFragment != null ? parentFragment : this.f3558k;
    }

    public final void k(Context context, FragmentManager fragmentManager) {
        l();
        x i2 = f.e.a.b.b(context).f3157j.i(fragmentManager, null);
        this.f3556i = i2;
        if (equals(i2)) {
            return;
        }
        this.f3556i.f3555h.add(this);
    }

    public final void l() {
        x xVar = this.f3556i;
        if (xVar != null) {
            xVar.f3555h.remove(this);
            this.f3556i = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        Fragment fragment = this;
        while (fragment.getParentFragment() != null) {
            fragment = fragment.getParentFragment();
        }
        FragmentManager fragmentManager = fragment.getFragmentManager();
        if (fragmentManager == null) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root, ancestor detached");
                return;
            }
            return;
        }
        try {
            k(getContext(), fragmentManager);
        } catch (IllegalStateException e2) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root", e2);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f3553f.a();
        l();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.f3558k = null;
        l();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.f3553f.b();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.f3553f.d();
    }

    @Override // androidx.fragment.app.Fragment
    public String toString() {
        return super.toString() + "{parent=" + i() + "}";
    }
}
