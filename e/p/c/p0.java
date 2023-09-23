package e.p.c;

import android.view.View;
import e.i.j.z;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: FragmentTransitionImpl.java */
/* loaded from: classes.dex */
public class p0 implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ArrayList f2765f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Map f2766g;

    public p0(n0 n0Var, ArrayList arrayList, Map map) {
        this.f2765f = arrayList;
        this.f2766g = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        int size = this.f2765f.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = (View) this.f2765f.get(i2);
            AtomicInteger atomicInteger = e.i.j.z.a;
            z.i.v(view, (String) this.f2766g.get(z.i.k(view)));
        }
    }
}
