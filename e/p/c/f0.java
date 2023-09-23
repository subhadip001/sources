package e.p.c;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import e.p.c.l0;

/* compiled from: FragmentTransition.java */
/* loaded from: classes.dex */
public class f0 implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ l0.a f2706f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Fragment f2707g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ e.i.f.b f2708h;

    public f0(l0.a aVar, Fragment fragment, e.i.f.b bVar) {
        this.f2706f = aVar;
        this.f2707g = fragment;
        this.f2708h = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((FragmentManager.d) this.f2706f).a(this.f2707g, this.f2708h);
    }
}
