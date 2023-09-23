package f.e.a.m;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: ActivityFragmentLifecycle.java */
/* loaded from: classes.dex */
public class a implements l {

    /* renamed from: f  reason: collision with root package name */
    public final Set<m> f3519f = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: g  reason: collision with root package name */
    public boolean f3520g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f3521h;

    public void a() {
        this.f3521h = true;
        Iterator it = ((ArrayList) f.e.a.r.l.e(this.f3519f)).iterator();
        while (it.hasNext()) {
            ((m) it.next()).onDestroy();
        }
    }

    public void b() {
        this.f3520g = true;
        Iterator it = ((ArrayList) f.e.a.r.l.e(this.f3519f)).iterator();
        while (it.hasNext()) {
            ((m) it.next()).onStart();
        }
    }

    @Override // f.e.a.m.l
    public void c(m mVar) {
        this.f3519f.add(mVar);
        if (this.f3521h) {
            mVar.onDestroy();
        } else if (this.f3520g) {
            mVar.onStart();
        } else {
            mVar.onStop();
        }
    }

    public void d() {
        this.f3520g = false;
        Iterator it = ((ArrayList) f.e.a.r.l.e(this.f3519f)).iterator();
        while (it.hasNext()) {
            ((m) it.next()).onStop();
        }
    }

    @Override // f.e.a.m.l
    public void f(m mVar) {
        this.f3519f.remove(mVar);
    }
}
