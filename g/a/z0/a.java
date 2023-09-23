package g.a.z0;

import f.h.c.a.i;
import g.a.a;
import g.a.c0;
import g.a.l;
import g.a.r;
import io.grpc.ConnectivityState;
import io.grpc.Status;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: RoundRobinLoadBalancer.java */
/* loaded from: classes2.dex */
public final class a extends c0 {

    /* renamed from: g  reason: collision with root package name */
    public static final a.c<d<l>> f8123g = new a.c<>("state-info");

    /* renamed from: h  reason: collision with root package name */
    public static final Status f8124h = Status.f8685f.h("no subchannels ready");
    public final c0.d b;

    /* renamed from: d  reason: collision with root package name */
    public final Random f8125d;

    /* renamed from: e  reason: collision with root package name */
    public ConnectivityState f8126e;
    public final Map<r, c0.h> c = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    public e f8127f = new b(f8124h);

    /* compiled from: RoundRobinLoadBalancer.java */
    /* renamed from: g.a.z0.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0203a implements c0.j {
        public final /* synthetic */ c0.h a;

        public C0203a(c0.h hVar) {
            this.a = hVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // g.a.c0.j
        public void a(l lVar) {
            a aVar = a.this;
            c0.h hVar = this.a;
            Map<r, c0.h> map = aVar.c;
            List<r> a = hVar.a();
            f.h.b.c.a.D(a.size() == 1, "%s does not have exactly one group", a);
            if (map.get(new r(a.get(0).a, g.a.a.c)) != hVar) {
                return;
            }
            ConnectivityState connectivityState = lVar.a;
            ConnectivityState connectivityState2 = ConnectivityState.IDLE;
            if (connectivityState == connectivityState2) {
                hVar.d();
            }
            d<l> d2 = a.d(hVar);
            if (d2.a.a.equals(ConnectivityState.TRANSIENT_FAILURE) && (lVar.a.equals(ConnectivityState.CONNECTING) || lVar.a.equals(connectivityState2))) {
                return;
            }
            d2.a = lVar;
            aVar.f();
        }
    }

    /* compiled from: RoundRobinLoadBalancer.java */
    /* loaded from: classes2.dex */
    public static final class b extends e {
        public final Status a;

        public b(Status status) {
            super(null);
            f.h.b.c.a.x(status, "status");
            this.a = status;
        }

        @Override // g.a.c0.i
        public c0.e a(c0.f fVar) {
            if (this.a.f()) {
                return c0.e.f7533e;
            }
            return c0.e.a(this.a);
        }

        @Override // g.a.z0.a.e
        public boolean b(e eVar) {
            if (eVar instanceof b) {
                b bVar = (b) eVar;
                if (f.h.b.c.a.i0(this.a, bVar.a) || (this.a.f() && bVar.a.f())) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            i iVar = new i(b.class.getSimpleName(), null);
            iVar.c("status", this.a);
            return iVar.toString();
        }
    }

    /* compiled from: RoundRobinLoadBalancer.java */
    /* loaded from: classes2.dex */
    public static final class c extends e {
        public static final AtomicIntegerFieldUpdater<c> c = AtomicIntegerFieldUpdater.newUpdater(c.class, "b");
        public final List<c0.h> a;
        private volatile int b;

        public c(List<c0.h> list, int i2) {
            super(null);
            f.h.b.c.a.m(!list.isEmpty(), "empty list");
            this.a = list;
            this.b = i2 - 1;
        }

        @Override // g.a.c0.i
        public c0.e a(c0.f fVar) {
            int size = this.a.size();
            AtomicIntegerFieldUpdater<c> atomicIntegerFieldUpdater = c;
            int incrementAndGet = atomicIntegerFieldUpdater.incrementAndGet(this);
            if (incrementAndGet >= size) {
                int i2 = incrementAndGet % size;
                atomicIntegerFieldUpdater.compareAndSet(this, incrementAndGet, i2);
                incrementAndGet = i2;
            }
            return c0.e.b(this.a.get(incrementAndGet));
        }

        @Override // g.a.z0.a.e
        public boolean b(e eVar) {
            if (eVar instanceof c) {
                c cVar = (c) eVar;
                return cVar == this || (this.a.size() == cVar.a.size() && new HashSet(this.a).containsAll(cVar.a));
            }
            return false;
        }

        public String toString() {
            i iVar = new i(c.class.getSimpleName(), null);
            iVar.c("list", this.a);
            return iVar.toString();
        }
    }

    /* compiled from: RoundRobinLoadBalancer.java */
    /* loaded from: classes2.dex */
    public static final class d<T> {
        public T a;

        public d(T t) {
            this.a = t;
        }
    }

    /* compiled from: RoundRobinLoadBalancer.java */
    /* loaded from: classes2.dex */
    public static abstract class e extends c0.i {
        public e(C0203a c0203a) {
        }

        public abstract boolean b(e eVar);
    }

    public a(c0.d dVar) {
        f.h.b.c.a.x(dVar, "helper");
        this.b = dVar;
        this.f8125d = new Random();
    }

    public static d<l> d(c0.h hVar) {
        g.a.a b2 = hVar.b();
        Object obj = b2.a.get(f8123g);
        f.h.b.c.a.x(obj, "STATE_INFO");
        return (d) obj;
    }

    @Override // g.a.c0
    public void a(Status status) {
        ConnectivityState connectivityState = ConnectivityState.TRANSIENT_FAILURE;
        e eVar = this.f8127f;
        if (!(eVar instanceof c)) {
            eVar = new b(status);
        }
        g(connectivityState, eVar);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [T, g.a.l] */
    @Override // g.a.c0
    public void b(c0.g gVar) {
        List<r> list = gVar.a;
        Set<r> keySet = this.c.keySet();
        HashMap hashMap = new HashMap(list.size() * 2);
        for (r rVar : list) {
            hashMap.put(new r(rVar.a, g.a.a.c), rVar);
        }
        Set keySet2 = hashMap.keySet();
        HashSet hashSet = new HashSet(keySet);
        hashSet.removeAll(keySet2);
        for (Map.Entry entry : hashMap.entrySet()) {
            r rVar2 = (r) entry.getKey();
            r rVar3 = (r) entry.getValue();
            c0.h hVar = this.c.get(rVar2);
            if (hVar != null) {
                hVar.g(Collections.singletonList(rVar3));
            } else {
                g.a.a aVar = g.a.a.c;
                a.c<d<l>> cVar = f8123g;
                d dVar = new d(l.a(ConnectivityState.IDLE));
                IdentityHashMap identityHashMap = new IdentityHashMap(1);
                identityHashMap.put(cVar, dVar);
                c0.d dVar2 = this.b;
                c0.b.a aVar2 = new c0.b.a();
                aVar2.a = Collections.singletonList(rVar3);
                for (Map.Entry<a.c<?>, Object> entry2 : aVar.a.entrySet()) {
                    if (!identityHashMap.containsKey(entry2.getKey())) {
                        identityHashMap.put(entry2.getKey(), entry2.getValue());
                    }
                }
                g.a.a aVar3 = new g.a.a(identityHashMap, null);
                f.h.b.c.a.x(aVar3, "attrs");
                aVar2.b = aVar3;
                c0.h a = dVar2.a(new c0.b(aVar2.a, aVar3, aVar2.c, null));
                f.h.b.c.a.x(a, "subchannel");
                a.f(new C0203a(a));
                this.c.put(rVar2, a);
                a.d();
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(this.c.remove((r) it.next()));
        }
        f();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            c0.h hVar2 = (c0.h) it2.next();
            hVar2.e();
            d(hVar2).a = l.a(ConnectivityState.SHUTDOWN);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [T, g.a.l] */
    @Override // g.a.c0
    public void c() {
        for (c0.h hVar : e()) {
            hVar.e();
            d(hVar).a = l.a(ConnectivityState.SHUTDOWN);
        }
    }

    public Collection<c0.h> e() {
        return this.c.values();
    }

    public final void f() {
        boolean z;
        Collection<c0.h> e2 = e();
        ArrayList arrayList = new ArrayList(e2.size());
        Iterator<c0.h> it = e2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            c0.h next = it.next();
            if (d(next).a.a == ConnectivityState.READY) {
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            Status status = f8124h;
            for (c0.h hVar : e()) {
                l lVar = d(hVar).a;
                ConnectivityState connectivityState = lVar.a;
                z = (connectivityState == ConnectivityState.CONNECTING || connectivityState == ConnectivityState.IDLE) ? true : true;
                if (status == f8124h || !status.f()) {
                    status = lVar.b;
                }
            }
            g(z ? ConnectivityState.CONNECTING : ConnectivityState.TRANSIENT_FAILURE, new b(status));
            return;
        }
        g(ConnectivityState.READY, new c(arrayList, this.f8125d.nextInt(arrayList.size())));
    }

    public final void g(ConnectivityState connectivityState, e eVar) {
        if (connectivityState == this.f8126e && eVar.b(this.f8127f)) {
            return;
        }
        this.b.d(connectivityState, eVar);
        this.f8126e = connectivityState;
        this.f8127f = eVar;
    }
}
