package m.a.a;

import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.logging.Level;
import m.a.a.g;
import org.greenrobot.eventbus.EventBusException;

/* compiled from: EventBus.java */
/* loaded from: classes2.dex */
public class c {
    public static volatile c q;
    public static final d r = new d();
    public static final Map<Class<?>, List<Class<?>>> s = new HashMap();
    public final Map<Class<?>, CopyOnWriteArrayList<p>> a;
    public final Map<Object, List<Class<?>>> b;
    public final Map<Class<?>, Object> c;

    /* renamed from: d  reason: collision with root package name */
    public final ThreadLocal<b> f9272d;

    /* renamed from: e  reason: collision with root package name */
    public final g f9273e;

    /* renamed from: f  reason: collision with root package name */
    public final k f9274f;

    /* renamed from: g  reason: collision with root package name */
    public final m.a.a.b f9275g;

    /* renamed from: h  reason: collision with root package name */
    public final m.a.a.a f9276h;

    /* renamed from: i  reason: collision with root package name */
    public final o f9277i;

    /* renamed from: j  reason: collision with root package name */
    public final ExecutorService f9278j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f9279k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f9280l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f9281m;
    public final boolean n;
    public final boolean o;
    public final f p;

    /* compiled from: EventBus.java */
    /* loaded from: classes2.dex */
    public class a extends ThreadLocal<b> {
        public a(c cVar) {
        }

        @Override // java.lang.ThreadLocal
        public b initialValue() {
            return new b();
        }
    }

    /* compiled from: EventBus.java */
    /* loaded from: classes2.dex */
    public static final class b {
        public final List<Object> a = new ArrayList();
        public boolean b;
        public boolean c;

        /* renamed from: d  reason: collision with root package name */
        public Object f9282d;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c() {
        /*
            r5 = this;
            m.a.a.d r0 = m.a.a.c.r
            r5.<init>()
            m.a.a.c$a r1 = new m.a.a.c$a
            r1.<init>(r5)
            r5.f9272d = r1
            java.util.Objects.requireNonNull(r0)
            boolean r1 = m.a.a.q.a.a
            r2 = 0
            if (r1 == 0) goto L24
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch: java.lang.RuntimeException -> L19
            goto L1a
        L19:
            r1 = r2
        L1a:
            if (r1 == 0) goto L24
            m.a.a.q.a r1 = new m.a.a.q.a
            java.lang.String r3 = "EventBus"
            r1.<init>(r3)
            goto L29
        L24:
            m.a.a.f$a r1 = new m.a.a.f$a
            r1.<init>()
        L29:
            r5.p = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r5.a = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r5.b = r1
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r1.<init>()
            r5.c = r1
            boolean r1 = m.a.a.q.a.a
            if (r1 == 0) goto L53
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch: java.lang.RuntimeException -> L49
            goto L4a
        L49:
            r1 = r2
        L4a:
            if (r1 != 0) goto L4d
            goto L53
        L4d:
            m.a.a.g$a r3 = new m.a.a.g$a
            r3.<init>(r1)
            goto L54
        L53:
            r3 = r2
        L54:
            r5.f9273e = r3
            if (r3 == 0) goto L62
            m.a.a.e r1 = new m.a.a.e
            android.os.Looper r3 = r3.a
            r4 = 10
            r1.<init>(r5, r3, r4)
            goto L63
        L62:
            r1 = r2
        L63:
            r5.f9274f = r1
            m.a.a.b r1 = new m.a.a.b
            r1.<init>(r5)
            r5.f9275g = r1
            m.a.a.a r1 = new m.a.a.a
            r1.<init>(r5)
            r5.f9276h = r1
            r1 = 0
            m.a.a.o r3 = new m.a.a.o
            r3.<init>(r2, r1, r1)
            r5.f9277i = r3
            r1 = 1
            r5.f9279k = r1
            r5.f9280l = r1
            r5.f9281m = r1
            r5.n = r1
            r5.o = r1
            java.util.concurrent.ExecutorService r0 = r0.a
            r5.f9278j = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m.a.a.c.<init>():void");
    }

    public static void a(List<Class<?>> list, Class<?>[] clsArr) {
        for (Class<?> cls : clsArr) {
            if (!list.contains(cls)) {
                list.add(cls);
                a(list, cls.getInterfaces());
            }
        }
    }

    public static c b() {
        c cVar = q;
        if (cVar == null) {
            synchronized (c.class) {
                cVar = q;
                if (cVar == null) {
                    cVar = new c();
                    q = cVar;
                }
            }
        }
        return cVar;
    }

    public void c(i iVar) {
        Object obj = iVar.a;
        p pVar = iVar.b;
        iVar.a = null;
        iVar.b = null;
        iVar.c = null;
        List<i> list = i.f9287d;
        synchronized (list) {
            if (list.size() < 10000) {
                list.add(iVar);
            }
        }
        if (pVar.c) {
            d(pVar, obj);
        }
    }

    public void d(p pVar, Object obj) {
        try {
            pVar.b.a.invoke(pVar.a, obj);
        } catch (IllegalAccessException e2) {
            throw new IllegalStateException("Unexpected exception", e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (obj instanceof m) {
                if (this.f9279k) {
                    f fVar = this.p;
                    Level level = Level.SEVERE;
                    StringBuilder A = f.a.b.a.a.A("SubscriberExceptionEvent subscriber ");
                    A.append(pVar.a.getClass());
                    A.append(" threw an exception");
                    fVar.b(level, A.toString(), cause);
                    m mVar = (m) obj;
                    f fVar2 = this.p;
                    StringBuilder A2 = f.a.b.a.a.A("Initial event ");
                    A2.append(mVar.b);
                    A2.append(" caused exception in ");
                    A2.append(mVar.c);
                    fVar2.b(level, A2.toString(), mVar.a);
                    return;
                }
                return;
            }
            if (this.f9279k) {
                f fVar3 = this.p;
                Level level2 = Level.SEVERE;
                StringBuilder A3 = f.a.b.a.a.A("Could not dispatch event: ");
                A3.append(obj.getClass());
                A3.append(" to subscribing class ");
                A3.append(pVar.a.getClass());
                fVar3.b(level2, A3.toString(), cause);
            }
            if (this.f9281m) {
                f(new m(this, cause, obj, pVar.a));
            }
        }
    }

    public final boolean e() {
        g gVar = this.f9273e;
        if (gVar != null) {
            if (!(((g.a) gVar).a == Looper.myLooper())) {
                return false;
            }
        }
        return true;
    }

    public void f(Object obj) {
        b bVar = this.f9272d.get();
        List<Object> list = bVar.a;
        list.add(obj);
        if (bVar.b) {
            return;
        }
        bVar.c = e();
        bVar.b = true;
        while (true) {
            try {
                if (list.isEmpty()) {
                    return;
                }
                g(list.remove(0), bVar);
            } finally {
                bVar.b = false;
                bVar.c = false;
            }
        }
    }

    public final void g(Object obj, b bVar) {
        boolean h2;
        ArrayList arrayList;
        Class<?> cls = obj.getClass();
        if (this.o) {
            Map<Class<?>, List<Class<?>>> map = s;
            synchronized (map) {
                List<Class<?>> list = map.get(cls);
                arrayList = list;
                if (list == null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Class<?> cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
                        arrayList2.add(cls2);
                        a(arrayList2, cls2.getInterfaces());
                    }
                    s.put(cls, arrayList2);
                    arrayList = arrayList2;
                }
            }
            int size = arrayList.size();
            h2 = false;
            for (int i2 = 0; i2 < size; i2++) {
                h2 |= h(obj, bVar, arrayList.get(i2));
            }
        } else {
            h2 = h(obj, bVar, cls);
        }
        if (h2) {
            return;
        }
        if (this.f9280l) {
            f fVar = this.p;
            Level level = Level.FINE;
            fVar.a(level, "No subscribers registered for event " + cls);
        }
        if (!this.n || cls == h.class || cls == m.class) {
            return;
        }
        f(new h(this, obj));
    }

    public final boolean h(Object obj, b bVar, Class<?> cls) {
        CopyOnWriteArrayList<p> copyOnWriteArrayList;
        synchronized (this) {
            copyOnWriteArrayList = this.a.get(cls);
        }
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        Iterator<p> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            p next = it.next();
            bVar.f9282d = obj;
            i(next, obj, bVar.c);
        }
        return true;
    }

    public final void i(p pVar, Object obj, boolean z) {
        int ordinal = pVar.b.b.ordinal();
        if (ordinal == 0) {
            d(pVar, obj);
        } else if (ordinal == 1) {
            if (z) {
                d(pVar, obj);
            } else {
                this.f9274f.a(pVar, obj);
            }
        } else if (ordinal == 2) {
            k kVar = this.f9274f;
            if (kVar != null) {
                kVar.a(pVar, obj);
            } else {
                d(pVar, obj);
            }
        } else if (ordinal == 3) {
            if (z) {
                this.f9275g.a(pVar, obj);
            } else {
                d(pVar, obj);
            }
        } else if (ordinal == 4) {
            this.f9276h.a(pVar, obj);
        } else {
            StringBuilder A = f.a.b.a.a.A("Unknown thread mode: ");
            A.append(pVar.b.b);
            throw new IllegalStateException(A.toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
        if (r2.f9292e == r5.c()) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void j(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Class r0 = r12.getClass()
            m.a.a.o r1 = r11.f9277i
            java.util.Objects.requireNonNull(r1)
            java.util.Map<java.lang.Class<?>, java.util.List<m.a.a.n>> r2 = m.a.a.o.a
            java.lang.Object r2 = r2.get(r0)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L14
            goto L77
        L14:
            m.a.a.o$a r2 = r1.c()
            r2.f9292e = r0
            r3 = 0
            r2.f9293f = r3
            r4 = 0
            r2.f9294g = r4
        L20:
            java.lang.Class<?> r5 = r2.f9292e
            if (r5 == 0) goto L65
            m.a.a.r.a r5 = r2.f9294g
            if (r5 == 0) goto L3d
            m.a.a.r.a r5 = r5.b()
            if (r5 == 0) goto L3d
            m.a.a.r.a r5 = r2.f9294g
            m.a.a.r.a r5 = r5.b()
            java.lang.Class<?> r6 = r2.f9292e
            java.lang.Class r7 = r5.c()
            if (r6 != r7) goto L3d
            goto L3e
        L3d:
            r5 = r4
        L3e:
            r2.f9294g = r5
            if (r5 == 0) goto L5e
            m.a.a.n[] r5 = r5.a()
            int r6 = r5.length
            r7 = 0
        L48:
            if (r7 >= r6) goto L61
            r8 = r5[r7]
            java.lang.reflect.Method r9 = r8.a
            java.lang.Class<?> r10 = r8.c
            boolean r9 = r2.a(r9, r10)
            if (r9 == 0) goto L5b
            java.util.List<m.a.a.n> r9 = r2.a
            r9.add(r8)
        L5b:
            int r7 = r7 + 1
            goto L48
        L5e:
            r1.a(r2)
        L61:
            r2.c()
            goto L20
        L65:
            java.util.List r2 = r1.b(r2)
            r1 = r2
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L91
            java.util.Map<java.lang.Class<?>, java.util.List<m.a.a.n>> r1 = m.a.a.o.a
            r1.put(r0, r2)
        L77:
            monitor-enter(r11)
            java.util.Iterator r0 = r2.iterator()     // Catch: java.lang.Throwable -> L8e
        L7c:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L8e
            if (r1 == 0) goto L8c
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L8e
            m.a.a.n r1 = (m.a.a.n) r1     // Catch: java.lang.Throwable -> L8e
            r11.k(r12, r1)     // Catch: java.lang.Throwable -> L8e
            goto L7c
        L8c:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L8e
            return
        L8e:
            r12 = move-exception
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L8e
            throw r12
        L91:
            org.greenrobot.eventbus.EventBusException r12 = new org.greenrobot.eventbus.EventBusException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Subscriber "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = " and its super classes have no public methods with the @Subscribe annotation"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r12.<init>(r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: m.a.a.c.j(java.lang.Object):void");
    }

    public final void k(Object obj, n nVar) {
        Object value;
        Class<?> cls = nVar.c;
        p pVar = new p(obj, nVar);
        CopyOnWriteArrayList<p> copyOnWriteArrayList = this.a.get(cls);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.a.put(cls, copyOnWriteArrayList);
        } else if (copyOnWriteArrayList.contains(pVar)) {
            StringBuilder A = f.a.b.a.a.A("Subscriber ");
            A.append(obj.getClass());
            A.append(" already registered to event ");
            A.append(cls);
            throw new EventBusException(A.toString());
        }
        int size = copyOnWriteArrayList.size();
        for (int i2 = 0; i2 <= size; i2++) {
            if (i2 == size || nVar.f9288d > copyOnWriteArrayList.get(i2).b.f9288d) {
                copyOnWriteArrayList.add(i2, pVar);
                break;
            }
        }
        List<Class<?>> list = this.b.get(obj);
        if (list == null) {
            list = new ArrayList<>();
            this.b.put(obj, list);
        }
        list.add(cls);
        if (nVar.f9289e) {
            if (this.o) {
                for (Map.Entry<Class<?>, Object> entry : this.c.entrySet()) {
                    if (cls.isAssignableFrom(entry.getKey()) && (value = entry.getValue()) != null) {
                        i(pVar, value, e());
                    }
                }
                return;
            }
            Object obj2 = this.c.get(cls);
            if (obj2 != null) {
                i(pVar, obj2, e());
            }
        }
    }

    public synchronized void l(Object obj) {
        List<Class<?>> list = this.b.get(obj);
        if (list != null) {
            for (Class<?> cls : list) {
                CopyOnWriteArrayList<p> copyOnWriteArrayList = this.a.get(cls);
                if (copyOnWriteArrayList != null) {
                    int size = copyOnWriteArrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        p pVar = copyOnWriteArrayList.get(i2);
                        if (pVar.a == obj) {
                            pVar.c = false;
                            copyOnWriteArrayList.remove(i2);
                            i2--;
                            size--;
                        }
                        i2++;
                    }
                }
            }
            this.b.remove(obj);
        } else {
            this.p.a(Level.WARNING, "Subscriber to unregister was not registered before: " + obj.getClass());
        }
    }

    public String toString() {
        StringBuilder B = f.a.b.a.a.B("EventBus[indexCount=", 0, ", eventInheritance=");
        B.append(this.o);
        B.append("]");
        return B.toString();
    }
}
