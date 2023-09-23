package f.e.a.l.q;

import com.bumptech.glide.Priority;
import com.bumptech.glide.Registry;
import f.e.a.l.q.i;
import f.e.a.l.q.l;
import f.e.a.l.r.n;
import f.e.a.l.s.h.f;
import f.e.a.o.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: DecodeHelper.java */
/* loaded from: classes.dex */
public final class h<Transcode> {
    public final List<n.a<?>> a = new ArrayList();
    public final List<f.e.a.l.j> b = new ArrayList();
    public f.e.a.d c;

    /* renamed from: d  reason: collision with root package name */
    public Object f3318d;

    /* renamed from: e  reason: collision with root package name */
    public int f3319e;

    /* renamed from: f  reason: collision with root package name */
    public int f3320f;

    /* renamed from: g  reason: collision with root package name */
    public Class<?> f3321g;

    /* renamed from: h  reason: collision with root package name */
    public i.d f3322h;

    /* renamed from: i  reason: collision with root package name */
    public f.e.a.l.l f3323i;

    /* renamed from: j  reason: collision with root package name */
    public Map<Class<?>, f.e.a.l.o<?>> f3324j;

    /* renamed from: k  reason: collision with root package name */
    public Class<Transcode> f3325k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f3326l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f3327m;
    public f.e.a.l.j n;
    public Priority o;
    public k p;
    public boolean q;
    public boolean r;

    public List<f.e.a.l.j> a() {
        if (!this.f3327m) {
            this.f3327m = true;
            this.b.clear();
            List<n.a<?>> c = c();
            int size = c.size();
            for (int i2 = 0; i2 < size; i2++) {
                n.a<?> aVar = c.get(i2);
                if (!this.b.contains(aVar.a)) {
                    this.b.add(aVar.a);
                }
                for (int i3 = 0; i3 < aVar.b.size(); i3++) {
                    if (!this.b.contains(aVar.b.get(i3))) {
                        this.b.add(aVar.b.get(i3));
                    }
                }
            }
        }
        return this.b;
    }

    public f.e.a.l.q.c0.a b() {
        return ((l.c) this.f3322h).a();
    }

    public List<n.a<?>> c() {
        if (!this.f3326l) {
            this.f3326l = true;
            this.a.clear();
            List f2 = this.c.a().f(this.f3318d);
            int size = f2.size();
            for (int i2 = 0; i2 < size; i2++) {
                n.a<?> b = ((f.e.a.l.r.n) f2.get(i2)).b(this.f3318d, this.f3319e, this.f3320f, this.f3323i);
                if (b != null) {
                    this.a.add(b);
                }
            }
        }
        return this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <Data> t<Data, ?, Transcode> d(Class<Data> cls) {
        t<Data, ?, Transcode> tVar;
        ArrayList arrayList;
        f.e.a.l.s.h.e eVar;
        Registry a = this.c.a();
        Class<?> cls2 = this.f3321g;
        Class cls3 = (Class<Transcode>) this.f3325k;
        f.e.a.o.c cVar = a.f680i;
        f.e.a.r.k andSet = cVar.b.getAndSet(null);
        if (andSet == null) {
            andSet = new f.e.a.r.k();
        }
        andSet.a = cls;
        andSet.b = cls2;
        andSet.c = cls3;
        synchronized (cVar.a) {
            tVar = (t<Data, ?, Transcode>) cVar.a.getOrDefault(andSet, null);
        }
        cVar.b.set(andSet);
        Objects.requireNonNull(a.f680i);
        if (f.e.a.o.c.c.equals(tVar)) {
            return null;
        }
        if (tVar == null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = ((ArrayList) a.c.b(cls, cls2)).iterator();
            while (it.hasNext()) {
                Class<?> cls4 = (Class) it.next();
                Iterator it2 = ((ArrayList) a.f677f.a(cls4, cls3)).iterator();
                while (it2.hasNext()) {
                    Class<?> cls5 = (Class) it2.next();
                    f.e.a.o.e eVar2 = a.c;
                    synchronized (eVar2) {
                        arrayList = new ArrayList();
                        for (String str : eVar2.a) {
                            List<e.a<?, ?>> list = eVar2.b.get(str);
                            if (list != null) {
                                for (e.a<?, ?> aVar : list) {
                                    if (aVar.a(cls, cls4)) {
                                        arrayList.add(aVar.c);
                                    }
                                }
                            }
                        }
                    }
                    f.e.a.l.s.h.f fVar = a.f677f;
                    synchronized (fVar) {
                        if (cls5.isAssignableFrom(cls4)) {
                            eVar = f.e.a.l.s.h.g.a;
                        } else {
                            for (f.a<?, ?> aVar2 : fVar.a) {
                                if (aVar2.a(cls4, cls5)) {
                                    eVar = aVar2.c;
                                }
                            }
                            throw new IllegalArgumentException("No transcoder registered to transcode from " + cls4 + " to " + cls5);
                        }
                    }
                    arrayList2.add(new j(cls, cls4, cls5, arrayList, eVar, a.f681j));
                }
            }
            t<Data, ?, Transcode> tVar2 = arrayList2.isEmpty() ? null : new t<>(cls, cls2, cls3, arrayList2, a.f681j);
            f.e.a.o.c cVar2 = a.f680i;
            synchronized (cVar2.a) {
                cVar2.a.put(new f.e.a.r.k(cls, cls2, cls3), tVar2 != null ? tVar2 : f.e.a.o.c.c);
            }
            return tVar2;
        }
        return tVar;
    }

    public List<Class<?>> e() {
        List<Class<?>> orDefault;
        List<Class<?>> d2;
        Registry a = this.c.a();
        Class<?> cls = this.f3318d.getClass();
        Class<?> cls2 = this.f3321g;
        Class cls3 = (Class<Transcode>) this.f3325k;
        f.e.a.o.d dVar = a.f679h;
        f.e.a.r.k andSet = dVar.a.getAndSet(null);
        if (andSet == null) {
            andSet = new f.e.a.r.k(cls, cls2, cls3);
        } else {
            andSet.a = cls;
            andSet.b = cls2;
            andSet.c = cls3;
        }
        synchronized (dVar.b) {
            orDefault = dVar.b.getOrDefault(andSet, null);
        }
        dVar.a.set(andSet);
        ArrayList arrayList = orDefault;
        if (orDefault == null) {
            ArrayList arrayList2 = new ArrayList();
            f.e.a.l.r.p pVar = a.a;
            synchronized (pVar) {
                d2 = pVar.a.d(cls);
            }
            Iterator it = ((ArrayList) d2).iterator();
            while (it.hasNext()) {
                Iterator it2 = ((ArrayList) a.c.b((Class) it.next(), cls2)).iterator();
                while (it2.hasNext()) {
                    Class cls4 = (Class) it2.next();
                    if (!((ArrayList) a.f677f.a(cls4, cls3)).isEmpty() && !arrayList2.contains(cls4)) {
                        arrayList2.add(cls4);
                    }
                }
            }
            f.e.a.o.d dVar2 = a.f679h;
            List<Class<?>> unmodifiableList = Collections.unmodifiableList(arrayList2);
            synchronized (dVar2.b) {
                dVar2.b.put(new f.e.a.r.k(cls, cls2, cls3), unmodifiableList);
            }
            arrayList = arrayList2;
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
        r1 = (f.e.a.l.a<X>) r3.b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <X> f.e.a.l.a<X> f(X r6) {
        /*
            r5 = this;
            f.e.a.d r0 = r5.c
            com.bumptech.glide.Registry r0 = r0.a()
            f.e.a.o.a r0 = r0.b
            java.lang.Class r1 = r6.getClass()
            monitor-enter(r0)
            java.util.List<f.e.a.o.a$a<?>> r2 = r0.a     // Catch: java.lang.Throwable -> L3a
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L3a
        L13:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L3a
            if (r3 == 0) goto L2b
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L3a
            f.e.a.o.a$a r3 = (f.e.a.o.a.C0089a) r3     // Catch: java.lang.Throwable -> L3a
            java.lang.Class<T> r4 = r3.a     // Catch: java.lang.Throwable -> L3a
            boolean r4 = r4.isAssignableFrom(r1)     // Catch: java.lang.Throwable -> L3a
            if (r4 == 0) goto L13
            f.e.a.l.a<T> r1 = r3.b     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r0)
            goto L2d
        L2b:
            r1 = 0
            monitor-exit(r0)
        L2d:
            if (r1 == 0) goto L30
            return r1
        L30:
            com.bumptech.glide.Registry$NoSourceEncoderAvailableException r0 = new com.bumptech.glide.Registry$NoSourceEncoderAvailableException
            java.lang.Class r6 = r6.getClass()
            r0.<init>(r6)
            throw r0
        L3a:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: f.e.a.l.q.h.f(java.lang.Object):f.e.a.l.a");
    }

    public <Z> f.e.a.l.o<Z> g(Class<Z> cls) {
        f.e.a.l.o<Z> oVar = (f.e.a.l.o<Z>) this.f3324j.get(cls);
        if (oVar == null) {
            Iterator<Map.Entry<Class<?>, f.e.a.l.o<?>>> it = this.f3324j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Class<?>, f.e.a.l.o<?>> next = it.next();
                if (next.getKey().isAssignableFrom(cls)) {
                    oVar = (f.e.a.l.o<Z>) next.getValue();
                    break;
                }
            }
        }
        if (oVar == null) {
            if (this.f3324j.isEmpty() && this.q) {
                throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
            }
            return (f.e.a.l.s.b) f.e.a.l.s.b.b;
        }
        return oVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean h(Class<?> cls) {
        return d(cls) != null;
    }
}
