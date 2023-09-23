package com.bumptech.glide.manager;

import androidx.lifecycle.Lifecycle;
import e.s.n;
import e.s.u;
import f.e.a.m.l;
import f.e.a.m.m;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class LifecycleLifecycle implements l, e.s.l {

    /* renamed from: f  reason: collision with root package name */
    public final Set<m> f694f = new HashSet();

    /* renamed from: g  reason: collision with root package name */
    public final Lifecycle f695g;

    public LifecycleLifecycle(Lifecycle lifecycle) {
        this.f695g = lifecycle;
        lifecycle.a(this);
    }

    @Override // f.e.a.m.l
    public void c(m mVar) {
        this.f694f.add(mVar);
        Lifecycle lifecycle = this.f695g;
        if (((n) lifecycle).b == Lifecycle.State.DESTROYED) {
            mVar.onDestroy();
        } else if (((n) lifecycle).b.isAtLeast(Lifecycle.State.STARTED)) {
            mVar.onStart();
        } else {
            mVar.onStop();
        }
    }

    @Override // f.e.a.m.l
    public void f(m mVar) {
        this.f694f.remove(mVar);
    }

    @u(Lifecycle.Event.ON_DESTROY)
    public void onDestroy(e.s.m mVar) {
        Iterator it = ((ArrayList) f.e.a.r.l.e(this.f694f)).iterator();
        while (it.hasNext()) {
            ((m) it.next()).onDestroy();
        }
        n nVar = (n) mVar.getLifecycle();
        nVar.d("removeObserver");
        nVar.a.e(this);
    }

    @u(Lifecycle.Event.ON_START)
    public void onStart(e.s.m mVar) {
        Iterator it = ((ArrayList) f.e.a.r.l.e(this.f694f)).iterator();
        while (it.hasNext()) {
            ((m) it.next()).onStart();
        }
    }

    @u(Lifecycle.Event.ON_STOP)
    public void onStop(e.s.m mVar) {
        Iterator it = ((ArrayList) f.e.a.r.l.e(this.f694f)).iterator();
        while (it.hasNext()) {
            ((m) it.next()).onStop();
        }
    }
}
