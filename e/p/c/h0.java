package e.p.c;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import e.p.c.l0;

/* compiled from: FragmentTransition.java */
/* loaded from: classes.dex */
public class h0 implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ l0.a f2717f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Fragment f2718g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ e.i.f.b f2719h;

    public h0(l0.a aVar, Fragment fragment, e.i.f.b bVar) {
        this.f2717f = aVar;
        this.f2718g = fragment;
        this.f2719h = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((FragmentManager.d) this.f2717f).a(this.f2718g, this.f2719h);
    }
}
