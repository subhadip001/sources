package f.h.b.b;

import android.os.Handler;
import android.util.Pair;
import f.h.b.b.b2.a0;
import f.h.b.b.b2.i0;
import f.h.b.b.b2.u;
import f.h.b.b.b2.z;
import f.h.b.b.x1.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.Set;

/* compiled from: MediaSourceList.java */
/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: d  reason: collision with root package name */
    public final d f3773d;

    /* renamed from: e  reason: collision with root package name */
    public final a0.a f3774e;

    /* renamed from: f  reason: collision with root package name */
    public final a.C0110a f3775f;

    /* renamed from: g  reason: collision with root package name */
    public final HashMap<c, b> f3776g;

    /* renamed from: h  reason: collision with root package name */
    public final Set<c> f3777h;

    /* renamed from: j  reason: collision with root package name */
    public boolean f3779j;

    /* renamed from: k  reason: collision with root package name */
    public f.h.b.b.f2.t f3780k;

    /* renamed from: i  reason: collision with root package name */
    public f.h.b.b.b2.i0 f3778i = new i0.a(0, new Random());
    public final IdentityHashMap<f.h.b.b.b2.w, c> b = new IdentityHashMap<>();
    public final Map<Object, c> c = new HashMap();
    public final List<c> a = new ArrayList();

    /* compiled from: MediaSourceList.java */
    /* loaded from: classes.dex */
    public final class a implements f.h.b.b.b2.a0, f.h.b.b.x1.a {

        /* renamed from: f  reason: collision with root package name */
        public final c f3781f;

        /* renamed from: g  reason: collision with root package name */
        public a0.a f3782g;

        /* renamed from: h  reason: collision with root package name */
        public a.C0110a f3783h;

        public a(c cVar) {
            this.f3782g = a1.this.f3774e;
            this.f3783h = a1.this.f3775f;
            this.f3781f = cVar;
        }

        @Override // f.h.b.b.b2.a0
        public void H(int i2, z.a aVar, f.h.b.b.b2.s sVar, f.h.b.b.b2.v vVar) {
            if (a(i2, aVar)) {
                this.f3782g.f(sVar, vVar);
            }
        }

        @Override // f.h.b.b.b2.a0
        public void M(int i2, z.a aVar, f.h.b.b.b2.s sVar, f.h.b.b.b2.v vVar, IOException iOException, boolean z) {
            if (a(i2, aVar)) {
                this.f3782g.h(sVar, vVar, iOException, z);
            }
        }

        public final boolean a(int i2, z.a aVar) {
            z.a aVar2 = null;
            if (aVar != null) {
                c cVar = this.f3781f;
                int i3 = 0;
                while (true) {
                    if (i3 >= cVar.c.size()) {
                        break;
                    } else if (cVar.c.get(i3).f3914d == aVar.f3914d) {
                        aVar2 = aVar.b(Pair.create(cVar.b, aVar.a));
                        break;
                    } else {
                        i3++;
                    }
                }
                if (aVar2 == null) {
                    return false;
                }
            }
            int i4 = i2 + this.f3781f.f3785d;
            a0.a aVar3 = this.f3782g;
            if (aVar3.a != i4 || !f.h.b.b.g2.b0.a(aVar3.b, aVar2)) {
                this.f3782g = a1.this.f3774e.k(i4, aVar2, 0L);
            }
            a.C0110a c0110a = this.f3783h;
            if (c0110a.a == i4 && f.h.b.b.g2.b0.a(c0110a.b, aVar2)) {
                return true;
            }
            this.f3783h = a1.this.f3775f.a(i4, aVar2);
            return true;
        }

        @Override // f.h.b.b.b2.a0
        public void k(int i2, z.a aVar, f.h.b.b.b2.v vVar) {
            if (a(i2, aVar)) {
                this.f3782g.b(vVar);
            }
        }

        @Override // f.h.b.b.b2.a0
        public void l(int i2, z.a aVar, f.h.b.b.b2.s sVar, f.h.b.b.b2.v vVar) {
            if (a(i2, aVar)) {
                this.f3782g.d(sVar, vVar);
            }
        }

        @Override // f.h.b.b.b2.a0
        public void o(int i2, z.a aVar, f.h.b.b.b2.s sVar, f.h.b.b.b2.v vVar) {
            if (a(i2, aVar)) {
                this.f3782g.j(sVar, vVar);
            }
        }
    }

    /* compiled from: MediaSourceList.java */
    /* loaded from: classes.dex */
    public static final class b {
        public final f.h.b.b.b2.z a;
        public final z.b b;
        public final f.h.b.b.b2.a0 c;

        public b(f.h.b.b.b2.z zVar, z.b bVar, f.h.b.b.b2.a0 a0Var) {
            this.a = zVar;
            this.b = bVar;
            this.c = a0Var;
        }
    }

    /* compiled from: MediaSourceList.java */
    /* loaded from: classes.dex */
    public static final class c implements z0 {
        public final f.h.b.b.b2.u a;

        /* renamed from: d  reason: collision with root package name */
        public int f3785d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f3786e;
        public final List<z.a> c = new ArrayList();
        public final Object b = new Object();

        public c(f.h.b.b.b2.z zVar, boolean z) {
            this.a = new f.h.b.b.b2.u(zVar, z);
        }

        @Override // f.h.b.b.z0
        public q1 a() {
            return this.a.n;
        }

        @Override // f.h.b.b.z0
        public Object getUid() {
            return this.b;
        }
    }

    /* compiled from: MediaSourceList.java */
    /* loaded from: classes.dex */
    public interface d {
    }

    public a1(d dVar, f.h.b.b.t1.w0 w0Var, Handler handler) {
        this.f3773d = dVar;
        a0.a aVar = new a0.a();
        this.f3774e = aVar;
        a.C0110a c0110a = new a.C0110a();
        this.f3775f = c0110a;
        this.f3776g = new HashMap<>();
        this.f3777h = new HashSet();
        if (w0Var != null) {
            aVar.c.add(new a0.a.C0101a(handler, w0Var));
            c0110a.c.add(new a.C0110a.C0111a(handler, w0Var));
        }
    }

    public q1 a(int i2, List<c> list, f.h.b.b.b2.i0 i0Var) {
        if (!list.isEmpty()) {
            this.f3778i = i0Var;
            for (int i3 = i2; i3 < list.size() + i2; i3++) {
                c cVar = list.get(i3 - i2);
                if (i3 > 0) {
                    c cVar2 = this.a.get(i3 - 1);
                    u.a aVar = cVar2.a.n;
                    cVar.f3785d = aVar.p() + cVar2.f3785d;
                    cVar.f3786e = false;
                    cVar.c.clear();
                } else {
                    cVar.f3785d = 0;
                    cVar.f3786e = false;
                    cVar.c.clear();
                }
                b(i3, cVar.a.n.p());
                this.a.add(i3, cVar);
                this.c.put(cVar.b, cVar);
                if (this.f3779j) {
                    g(cVar);
                    if (this.b.isEmpty()) {
                        this.f3777h.add(cVar);
                    } else {
                        b bVar = this.f3776g.get(cVar);
                        if (bVar != null) {
                            bVar.a.d(bVar.b);
                        }
                    }
                }
            }
        }
        return c();
    }

    public final void b(int i2, int i3) {
        while (i2 < this.a.size()) {
            this.a.get(i2).f3785d += i3;
            i2++;
        }
    }

    public q1 c() {
        if (this.a.isEmpty()) {
            return q1.a;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a.size(); i3++) {
            c cVar = this.a.get(i3);
            cVar.f3785d = i2;
            i2 += cVar.a.n.p();
        }
        return new h1(this.a, this.f3778i);
    }

    public final void d() {
        Iterator<c> it = this.f3777h.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next.c.isEmpty()) {
                b bVar = this.f3776g.get(next);
                if (bVar != null) {
                    bVar.a.d(bVar.b);
                }
                it.remove();
            }
        }
    }

    public int e() {
        return this.a.size();
    }

    public final void f(c cVar) {
        if (cVar.f3786e && cVar.c.isEmpty()) {
            b remove = this.f3776g.remove(cVar);
            Objects.requireNonNull(remove);
            remove.a.a(remove.b);
            remove.a.c(remove.c);
            this.f3777h.remove(cVar);
        }
    }

    public final void g(c cVar) {
        f.h.b.b.b2.u uVar = cVar.a;
        z.b bVar = new z.b() { // from class: f.h.b.b.z
            @Override // f.h.b.b.b2.z.b
            public final void a(f.h.b.b.b2.z zVar, q1 q1Var) {
                ((q0) a1.this.f3773d).f4451l.d(22);
            }
        };
        a aVar = new a(cVar);
        this.f3776g.put(cVar, new b(uVar, bVar, aVar));
        Handler handler = new Handler(f.h.b.b.g2.b0.n(), null);
        Objects.requireNonNull(uVar);
        a0.a aVar2 = uVar.c;
        Objects.requireNonNull(aVar2);
        aVar2.c.add(new a0.a.C0101a(handler, aVar));
        Handler handler2 = new Handler(f.h.b.b.g2.b0.n(), null);
        a.C0110a c0110a = uVar.f3868d;
        Objects.requireNonNull(c0110a);
        c0110a.c.add(new a.C0110a.C0111a(handler2, aVar));
        uVar.k(bVar, this.f3780k);
    }

    public void h(f.h.b.b.b2.w wVar) {
        c remove = this.b.remove(wVar);
        Objects.requireNonNull(remove);
        remove.a.i(wVar);
        remove.c.remove(((f.h.b.b.b2.t) wVar).f3897f);
        if (!this.b.isEmpty()) {
            d();
        }
        f(remove);
    }

    public final void i(int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            c remove = this.a.remove(i4);
            this.c.remove(remove.b);
            b(i4, -remove.a.n.p());
            remove.f3786e = true;
            if (this.f3779j) {
                f(remove);
            }
        }
    }
}
