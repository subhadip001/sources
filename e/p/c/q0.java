package e.p.c;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;

/* compiled from: FragmentViewLifecycleOwner.java */
/* loaded from: classes.dex */
public class q0 implements e.w.c, e.s.j0 {

    /* renamed from: f  reason: collision with root package name */
    public final e.s.i0 f2769f;

    /* renamed from: g  reason: collision with root package name */
    public e.s.n f2770g = null;

    /* renamed from: h  reason: collision with root package name */
    public e.w.b f2771h = null;

    public q0(Fragment fragment, e.s.i0 i0Var) {
        this.f2769f = i0Var;
    }

    public void a(Lifecycle.Event event) {
        e.s.n nVar = this.f2770g;
        nVar.d("handleLifecycleEvent");
        nVar.g(event.getTargetState());
    }

    public void c() {
        if (this.f2770g == null) {
            this.f2770g = new e.s.n(this);
            this.f2771h = new e.w.b(this);
        }
    }

    @Override // e.s.m
    public Lifecycle getLifecycle() {
        c();
        return this.f2770g;
    }

    @Override // e.w.c
    public e.w.a getSavedStateRegistry() {
        c();
        return this.f2771h.b;
    }

    @Override // e.s.j0
    public e.s.i0 getViewModelStore() {
        c();
        return this.f2769f;
    }
}
