package f.e.a.m;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: TargetTracker.java */
/* loaded from: classes.dex */
public final class y implements m {

    /* renamed from: f  reason: collision with root package name */
    public final Set<f.e.a.p.j.h<?>> f3559f = Collections.newSetFromMap(new WeakHashMap());

    @Override // f.e.a.m.m
    public void onDestroy() {
        Iterator it = ((ArrayList) f.e.a.r.l.e(this.f3559f)).iterator();
        while (it.hasNext()) {
            ((f.e.a.p.j.h) it.next()).onDestroy();
        }
    }

    @Override // f.e.a.m.m
    public void onStart() {
        Iterator it = ((ArrayList) f.e.a.r.l.e(this.f3559f)).iterator();
        while (it.hasNext()) {
            ((f.e.a.p.j.h) it.next()).onStart();
        }
    }

    @Override // f.e.a.m.m
    public void onStop() {
        Iterator it = ((ArrayList) f.e.a.r.l.e(this.f3559f)).iterator();
        while (it.hasNext()) {
            ((f.e.a.p.j.h) it.next()).onStop();
        }
    }
}
