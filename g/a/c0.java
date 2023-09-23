package g.a;

import g.a.a;
import g.a.h;
import io.grpc.ChannelLogger;
import io.grpc.ConnectivityState;
import io.grpc.Status;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: LoadBalancer.java */
/* loaded from: classes2.dex */
public abstract class c0 {
    public static final a.c<Map<String, ?>> a = new a.c<>("internal:health-checking-config");

    /* compiled from: LoadBalancer.java */
    /* loaded from: classes2.dex */
    public static final class b {
        public final List<r> a;
        public final g.a.a b;
        public final Object[][] c;

        /* compiled from: LoadBalancer.java */
        /* loaded from: classes2.dex */
        public static final class a {
            public List<r> a;
            public g.a.a b = g.a.a.c;
            public Object[][] c = (Object[][]) Array.newInstance(Object.class, 0, 2);
        }

        public b(List list, g.a.a aVar, Object[][] objArr, a aVar2) {
            f.h.b.c.a.x(list, "addresses are not set");
            this.a = list;
            f.h.b.c.a.x(aVar, "attrs");
            this.b = aVar;
            f.h.b.c.a.x(objArr, "customOptions");
            this.c = objArr;
        }

        public String toString() {
            f.h.c.a.i c1 = f.h.b.c.a.c1(this);
            c1.c("addrs", this.a);
            c1.c("attrs", this.b);
            c1.c("customOptions", Arrays.deepToString(this.c));
            return c1.toString();
        }
    }

    /* compiled from: LoadBalancer.java */
    /* loaded from: classes2.dex */
    public static abstract class c {
        public abstract c0 a(d dVar);
    }

    /* compiled from: LoadBalancer.java */
    /* loaded from: classes2.dex */
    public static abstract class d {
        public h a(b bVar) {
            throw new UnsupportedOperationException();
        }

        public ChannelLogger b() {
            throw new UnsupportedOperationException();
        }

        public t0 c() {
            throw new UnsupportedOperationException();
        }

        public abstract void d(ConnectivityState connectivityState, i iVar);
    }

    /* compiled from: LoadBalancer.java */
    /* loaded from: classes2.dex */
    public static final class e {

        /* renamed from: e  reason: collision with root package name */
        public static final e f7533e = new e(null, null, Status.f8685f, false);
        public final h a;
        public final h.a b;
        public final Status c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f7534d;

        public e(h hVar, h.a aVar, Status status, boolean z) {
            this.a = hVar;
            this.b = aVar;
            f.h.b.c.a.x(status, "status");
            this.c = status;
            this.f7534d = z;
        }

        public static e a(Status status) {
            f.h.b.c.a.m(!status.f(), "error status shouldn't be OK");
            return new e(null, null, status, false);
        }

        public static e b(h hVar) {
            f.h.b.c.a.x(hVar, "subchannel");
            return new e(hVar, null, Status.f8685f, false);
        }

        public boolean equals(Object obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                return f.h.b.c.a.i0(this.a, eVar.a) && f.h.b.c.a.i0(this.c, eVar.c) && f.h.b.c.a.i0(this.b, eVar.b) && this.f7534d == eVar.f7534d;
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{this.a, this.c, this.b, Boolean.valueOf(this.f7534d)});
        }

        public String toString() {
            f.h.c.a.i c1 = f.h.b.c.a.c1(this);
            c1.c("subchannel", this.a);
            c1.c("streamTracerFactory", this.b);
            c1.c("status", this.c);
            c1.d("drop", this.f7534d);
            return c1.toString();
        }
    }

    /* compiled from: LoadBalancer.java */
    /* loaded from: classes2.dex */
    public static abstract class f {
    }

    /* compiled from: LoadBalancer.java */
    /* loaded from: classes2.dex */
    public static final class g {
        public final List<r> a;
        public final g.a.a b;
        public final Object c;

        public g(List list, g.a.a aVar, Object obj, a aVar2) {
            f.h.b.c.a.x(list, "addresses");
            this.a = Collections.unmodifiableList(new ArrayList(list));
            f.h.b.c.a.x(aVar, "attributes");
            this.b = aVar;
            this.c = obj;
        }

        public boolean equals(Object obj) {
            if (obj instanceof g) {
                g gVar = (g) obj;
                return f.h.b.c.a.i0(this.a, gVar.a) && f.h.b.c.a.i0(this.b, gVar.b) && f.h.b.c.a.i0(this.c, gVar.c);
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
        }

        public String toString() {
            f.h.c.a.i c1 = f.h.b.c.a.c1(this);
            c1.c("addresses", this.a);
            c1.c("attributes", this.b);
            c1.c("loadBalancingPolicyConfig", this.c);
            return c1.toString();
        }
    }

    /* compiled from: LoadBalancer.java */
    /* loaded from: classes2.dex */
    public static abstract class h {
        public List<r> a() {
            throw new UnsupportedOperationException();
        }

        public abstract g.a.a b();

        public Object c() {
            throw new UnsupportedOperationException();
        }

        public abstract void d();

        public abstract void e();

        public void f(j jVar) {
            throw new UnsupportedOperationException("Not implemented");
        }

        public void g(List<r> list) {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: LoadBalancer.java */
    /* loaded from: classes2.dex */
    public static abstract class i {
        public abstract e a(f fVar);
    }

    /* compiled from: LoadBalancer.java */
    /* loaded from: classes2.dex */
    public interface j {
        void a(l lVar);
    }

    public abstract void a(Status status);

    public abstract void b(g gVar);

    public abstract void c();
}
