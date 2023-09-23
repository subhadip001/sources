package e.s;

import androidx.lifecycle.CompositeGeneratedAdaptersObserver;
import androidx.lifecycle.FullLifecycleObserverAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ReflectiveGenericLifecycleObserver;
import androidx.lifecycle.SingleGeneratedAdapterObserver;
import e.c.a.b.b;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: LifecycleRegistry.java */
/* loaded from: classes.dex */
public class n extends Lifecycle {
    public final WeakReference<m> c;
    public e.c.a.b.a<l, a> a = new e.c.a.b.a<>();

    /* renamed from: d  reason: collision with root package name */
    public int f2814d = 0;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2815e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2816f = false;

    /* renamed from: g  reason: collision with root package name */
    public ArrayList<Lifecycle.State> f2817g = new ArrayList<>();
    public Lifecycle.State b = Lifecycle.State.INITIALIZED;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f2818h = true;

    /* compiled from: LifecycleRegistry.java */
    /* loaded from: classes.dex */
    public static class a {
        public Lifecycle.State a;
        public k b;

        public a(l lVar, Lifecycle.State state) {
            k reflectiveGenericLifecycleObserver;
            Map<Class<?>, Integer> map = q.a;
            boolean z = lVar instanceof k;
            boolean z2 = lVar instanceof g;
            if (z && z2) {
                reflectiveGenericLifecycleObserver = new FullLifecycleObserverAdapter((g) lVar, (k) lVar);
            } else if (z2) {
                reflectiveGenericLifecycleObserver = new FullLifecycleObserverAdapter((g) lVar, null);
            } else if (z) {
                reflectiveGenericLifecycleObserver = (k) lVar;
            } else {
                Class<?> cls = lVar.getClass();
                if (q.c(cls) == 2) {
                    List<Constructor<? extends h>> list = q.b.get(cls);
                    if (list.size() == 1) {
                        reflectiveGenericLifecycleObserver = new SingleGeneratedAdapterObserver(q.a(list.get(0), lVar));
                    } else {
                        h[] hVarArr = new h[list.size()];
                        for (int i2 = 0; i2 < list.size(); i2++) {
                            hVarArr[i2] = q.a(list.get(i2), lVar);
                        }
                        reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(hVarArr);
                    }
                } else {
                    reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(lVar);
                }
            }
            this.b = reflectiveGenericLifecycleObserver;
            this.a = state;
        }

        public void a(m mVar, Lifecycle.Event event) {
            Lifecycle.State targetState = event.getTargetState();
            this.a = n.f(this.a, targetState);
            this.b.d(mVar, event);
            this.a = targetState;
        }
    }

    public n(m mVar) {
        this.c = new WeakReference<>(mVar);
    }

    public static Lifecycle.State f(Lifecycle.State state, Lifecycle.State state2) {
        return (state2 == null || state2.compareTo(state) >= 0) ? state : state2;
    }

    @Override // androidx.lifecycle.Lifecycle
    public void a(l lVar) {
        m mVar;
        d("addObserver");
        Lifecycle.State state = this.b;
        Lifecycle.State state2 = Lifecycle.State.DESTROYED;
        if (state != state2) {
            state2 = Lifecycle.State.INITIALIZED;
        }
        a aVar = new a(lVar, state2);
        if (this.a.d(lVar, aVar) == null && (mVar = this.c.get()) != null) {
            boolean z = this.f2814d != 0 || this.f2815e;
            Lifecycle.State c = c(lVar);
            this.f2814d++;
            while (aVar.a.compareTo(c) < 0 && this.a.f1936j.containsKey(lVar)) {
                this.f2817g.add(aVar.a);
                Lifecycle.Event upFrom = Lifecycle.Event.upFrom(aVar.a);
                if (upFrom != null) {
                    aVar.a(mVar, upFrom);
                    h();
                    c = c(lVar);
                } else {
                    StringBuilder A = f.a.b.a.a.A("no event up from ");
                    A.append(aVar.a);
                    throw new IllegalStateException(A.toString());
                }
            }
            if (!z) {
                j();
            }
            this.f2814d--;
        }
    }

    @Override // androidx.lifecycle.Lifecycle
    public void b(l lVar) {
        d("removeObserver");
        this.a.e(lVar);
    }

    public final Lifecycle.State c(l lVar) {
        e.c.a.b.a<l, a> aVar = this.a;
        Lifecycle.State state = null;
        b.c<l, a> cVar = aVar.f1936j.containsKey(lVar) ? aVar.f1936j.get(lVar).f1944i : null;
        Lifecycle.State state2 = cVar != null ? cVar.f1942g.a : null;
        if (!this.f2817g.isEmpty()) {
            ArrayList<Lifecycle.State> arrayList = this.f2817g;
            state = arrayList.get(arrayList.size() - 1);
        }
        return f(f(this.b, state2), state);
    }

    public final void d(String str) {
        if (this.f2818h && !e.c.a.a.a.d().b()) {
            throw new IllegalStateException(f.a.b.a.a.q("Method ", str, " must be called on the main thread"));
        }
    }

    public void e(Lifecycle.Event event) {
        d("handleLifecycleEvent");
        g(event.getTargetState());
    }

    public final void g(Lifecycle.State state) {
        Lifecycle.State state2 = this.b;
        if (state2 == state) {
            return;
        }
        if (state2 == Lifecycle.State.INITIALIZED && state == Lifecycle.State.DESTROYED) {
            StringBuilder A = f.a.b.a.a.A("no event down from ");
            A.append(this.b);
            throw new IllegalStateException(A.toString());
        }
        this.b = state;
        if (!this.f2815e && this.f2814d == 0) {
            this.f2815e = true;
            j();
            this.f2815e = false;
            if (this.b == Lifecycle.State.DESTROYED) {
                this.a = new e.c.a.b.a<>();
                return;
            }
            return;
        }
        this.f2816f = true;
    }

    public final void h() {
        ArrayList<Lifecycle.State> arrayList = this.f2817g;
        arrayList.remove(arrayList.size() - 1);
    }

    public void i(Lifecycle.State state) {
        d("setCurrentState");
        g(state);
    }

    public final void j() {
        m mVar = this.c.get();
        if (mVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            e.c.a.b.a<l, a> aVar = this.a;
            boolean z = true;
            if (aVar.f1940i != 0) {
                Lifecycle.State state = aVar.f1937f.f1942g.a;
                Lifecycle.State state2 = aVar.f1938g.f1942g.a;
                if (state != state2 || this.b != state2) {
                    z = false;
                }
            }
            if (!z) {
                this.f2816f = false;
                if (this.b.compareTo(aVar.f1937f.f1942g.a) < 0) {
                    e.c.a.b.a<l, a> aVar2 = this.a;
                    b.C0031b c0031b = new b.C0031b(aVar2.f1938g, aVar2.f1937f);
                    aVar2.f1939h.put(c0031b, Boolean.FALSE);
                    while (c0031b.hasNext() && !this.f2816f) {
                        Map.Entry entry = (Map.Entry) c0031b.next();
                        a aVar3 = (a) entry.getValue();
                        while (aVar3.a.compareTo(this.b) > 0 && !this.f2816f && this.a.contains((l) entry.getKey())) {
                            Lifecycle.Event downFrom = Lifecycle.Event.downFrom(aVar3.a);
                            if (downFrom != null) {
                                this.f2817g.add(downFrom.getTargetState());
                                aVar3.a(mVar, downFrom);
                                h();
                            } else {
                                StringBuilder A = f.a.b.a.a.A("no event down from ");
                                A.append(aVar3.a);
                                throw new IllegalStateException(A.toString());
                            }
                        }
                    }
                }
                b.c<l, a> cVar = this.a.f1938g;
                if (!this.f2816f && cVar != null && this.b.compareTo(cVar.f1942g.a) > 0) {
                    e.c.a.b.b<l, a>.d b = this.a.b();
                    while (b.hasNext() && !this.f2816f) {
                        Map.Entry entry2 = (Map.Entry) b.next();
                        a aVar4 = (a) entry2.getValue();
                        while (aVar4.a.compareTo(this.b) < 0 && !this.f2816f && this.a.contains((l) entry2.getKey())) {
                            this.f2817g.add(aVar4.a);
                            Lifecycle.Event upFrom = Lifecycle.Event.upFrom(aVar4.a);
                            if (upFrom != null) {
                                aVar4.a(mVar, upFrom);
                                h();
                            } else {
                                StringBuilder A2 = f.a.b.a.a.A("no event up from ");
                                A2.append(aVar4.a);
                                throw new IllegalStateException(A2.toString());
                            }
                        }
                    }
                }
            } else {
                this.f2816f = false;
                return;
            }
        }
    }
}
