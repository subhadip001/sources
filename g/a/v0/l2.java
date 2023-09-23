package g.a.v0;

import g.a.b;
import g.a.n;
import g.a.v0.i2;
import g.a.v0.t1;
import g.a.v0.u0;
import io.grpc.MethodDescriptor;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ServiceConfigInterceptor.java */
/* loaded from: classes2.dex */
public final class l2 implements g.a.e {

    /* renamed from: d  reason: collision with root package name */
    public static final b.a<i2.a> f7831d = b.a.a("internal-retry-policy");

    /* renamed from: e  reason: collision with root package name */
    public static final b.a<u0.a> f7832e = b.a.a("internal-hedging-policy");
    public final AtomicReference<t1> a = new AtomicReference<>();
    public final boolean b;
    public volatile boolean c;

    /* compiled from: ServiceConfigInterceptor.java */
    /* loaded from: classes2.dex */
    public final class a implements u0.a {
        public final /* synthetic */ MethodDescriptor a;

        public a(MethodDescriptor methodDescriptor) {
            this.a = methodDescriptor;
        }

        @Override // g.a.v0.u0.a
        public u0 get() {
            if (!l2.this.c) {
                return u0.f7936d;
            }
            t1.a b = l2.this.b(this.a);
            u0 u0Var = b == null ? u0.f7936d : b.f7932f;
            f.h.c.a.r.a(u0Var.equals(u0.f7936d) || l2.this.c(this.a).equals(i2.f7796f), "Can not apply both retry and hedging policy for the method '%s'", this.a);
            return u0Var;
        }
    }

    /* compiled from: ServiceConfigInterceptor.java */
    /* loaded from: classes2.dex */
    public final class b implements i2.a {
        public final /* synthetic */ MethodDescriptor a;

        public b(MethodDescriptor methodDescriptor) {
            this.a = methodDescriptor;
        }

        @Override // g.a.v0.i2.a
        public i2 get() {
            if (!l2.this.c) {
                return i2.f7796f;
            }
            return l2.this.c(this.a);
        }
    }

    /* compiled from: ServiceConfigInterceptor.java */
    /* loaded from: classes2.dex */
    public final class c implements u0.a {
        public final /* synthetic */ u0 a;

        public c(l2 l2Var, u0 u0Var) {
            this.a = u0Var;
        }

        @Override // g.a.v0.u0.a
        public u0 get() {
            return this.a;
        }
    }

    /* compiled from: ServiceConfigInterceptor.java */
    /* loaded from: classes2.dex */
    public final class d implements i2.a {
        public final /* synthetic */ i2 a;

        public d(l2 l2Var, i2 i2Var) {
            this.a = i2Var;
        }

        @Override // g.a.v0.i2.a
        public i2 get() {
            return this.a;
        }
    }

    public l2(boolean z) {
        this.b = z;
    }

    @Override // g.a.e
    public <ReqT, RespT> g.a.d<ReqT, RespT> a(MethodDescriptor<ReqT, RespT> methodDescriptor, g.a.b bVar, g.a.c cVar) {
        g.a.b bVar2;
        if (this.b) {
            if (this.c) {
                t1.a b2 = b(methodDescriptor);
                i2 i2Var = b2 == null ? i2.f7796f : b2.f7931e;
                t1.a b3 = b(methodDescriptor);
                u0 u0Var = b3 == null ? u0.f7936d : b3.f7932f;
                f.h.c.a.r.a(i2Var.equals(i2.f7796f) || u0Var.equals(u0.f7936d), "Can not apply both retry and hedging policy for the method '%s'", methodDescriptor);
                bVar = bVar.e(f7831d, new d(this, i2Var)).e(f7832e, new c(this, u0Var));
            } else {
                bVar = bVar.e(f7831d, new b(methodDescriptor)).e(f7832e, new a(methodDescriptor));
            }
        }
        t1.a b4 = b(methodDescriptor);
        if (b4 == null) {
            return cVar.h(methodDescriptor, bVar);
        }
        Long l2 = b4.a;
        if (l2 != null) {
            long longValue = l2.longValue();
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            n.b bVar3 = g.a.n.f7550i;
            Objects.requireNonNull(timeUnit, "units");
            g.a.n nVar = new g.a.n(bVar3, timeUnit.toNanos(longValue), true);
            g.a.n nVar2 = bVar.a;
            if (nVar2 == null || nVar.compareTo(nVar2) < 0) {
                g.a.b bVar4 = new g.a.b(bVar);
                bVar4.a = nVar;
                bVar = bVar4;
            }
        }
        Boolean bool = b4.b;
        if (bool != null) {
            if (bool.booleanValue()) {
                Objects.requireNonNull(bVar);
                bVar2 = new g.a.b(bVar);
                bVar2.f7530g = Boolean.TRUE;
            } else {
                Objects.requireNonNull(bVar);
                bVar2 = new g.a.b(bVar);
                bVar2.f7530g = Boolean.FALSE;
            }
            bVar = bVar2;
        }
        Integer num = b4.c;
        if (num != null) {
            Integer num2 = bVar.f7531h;
            if (num2 != null) {
                bVar = bVar.c(Math.min(num2.intValue(), b4.c.intValue()));
            } else {
                bVar = bVar.c(num.intValue());
            }
        }
        Integer num3 = b4.f7930d;
        if (num3 != null) {
            Integer num4 = bVar.f7532i;
            if (num4 != null) {
                bVar = bVar.d(Math.min(num4.intValue(), b4.f7930d.intValue()));
            } else {
                bVar = bVar.d(num3.intValue());
            }
        }
        return cVar.h(methodDescriptor, bVar);
    }

    public final t1.a b(MethodDescriptor<?, ?> methodDescriptor) {
        t1 t1Var = this.a.get();
        if (t1Var == null) {
            return null;
        }
        t1.a aVar = t1Var.b.get(methodDescriptor.b);
        if (aVar == null) {
            aVar = t1Var.c.get(methodDescriptor.c);
        }
        return aVar == null ? t1Var.a : aVar;
    }

    public i2 c(MethodDescriptor<?, ?> methodDescriptor) {
        t1.a b2 = b(methodDescriptor);
        return b2 == null ? i2.f7796f : b2.f7931e;
    }
}
