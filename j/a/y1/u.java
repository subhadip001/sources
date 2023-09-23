package j.a.y1;

import i.j.f;
import j.a.r1;
import java.util.Objects;

/* compiled from: ThreadContext.kt */
/* loaded from: classes2.dex */
public final class u {
    public static final s a = new s("NO_THREAD_ELEMENTS");

    /* compiled from: ThreadContext.kt */
    /* loaded from: classes2.dex */
    public static final class a extends i.l.b.j implements i.l.a.p<Object, f.a, Object> {

        /* renamed from: g  reason: collision with root package name */
        public static final a f8822g = new a();

        public a() {
            super(2);
        }

        @Override // i.l.a.p
        public Object k(Object obj, f.a aVar) {
            f.a aVar2 = aVar;
            if (aVar2 instanceof r1) {
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue = num != null ? num.intValue() : 1;
                return intValue == 0 ? aVar2 : Integer.valueOf(intValue + 1);
            }
            return obj;
        }
    }

    /* compiled from: ThreadContext.kt */
    /* loaded from: classes2.dex */
    public static final class b extends i.l.b.j implements i.l.a.p<r1<?>, f.a, r1<?>> {

        /* renamed from: g  reason: collision with root package name */
        public static final b f8823g = new b();

        public b() {
            super(2);
        }

        @Override // i.l.a.p
        public r1<?> k(r1<?> r1Var, f.a aVar) {
            r1<?> r1Var2 = r1Var;
            f.a aVar2 = aVar;
            if (r1Var2 != null) {
                return r1Var2;
            }
            if (aVar2 instanceof r1) {
                return (r1) aVar2;
            }
            return null;
        }
    }

    /* compiled from: ThreadContext.kt */
    /* loaded from: classes2.dex */
    public static final class c extends i.l.b.j implements i.l.a.p<x, f.a, x> {

        /* renamed from: g  reason: collision with root package name */
        public static final c f8824g = new c();

        public c() {
            super(2);
        }

        @Override // i.l.a.p
        public x k(x xVar, f.a aVar) {
            x xVar2 = xVar;
            f.a aVar2 = aVar;
            if (aVar2 instanceof r1) {
                r1<Object> r1Var = (r1) aVar2;
                Object W = r1Var.W(xVar2.a);
                Object[] objArr = xVar2.b;
                int i2 = xVar2.f8825d;
                objArr[i2] = W;
                r1<Object>[] r1VarArr = xVar2.c;
                xVar2.f8825d = i2 + 1;
                r1VarArr[i2] = r1Var;
            }
            return xVar2;
        }
    }

    public static final void a(i.j.f fVar, Object obj) {
        if (obj == a) {
            return;
        }
        if (obj instanceof x) {
            x xVar = (x) obj;
            int length = xVar.c.length - 1;
            if (length < 0) {
                return;
            }
            while (true) {
                int i2 = length - 1;
                r1<Object> r1Var = xVar.c[length];
                i.l.b.i.b(r1Var);
                r1Var.M(fVar, xVar.b[length]);
                if (i2 < 0) {
                    return;
                }
                length = i2;
            }
        } else {
            Object fold = fVar.fold(null, b.f8823g);
            Objects.requireNonNull(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            ((r1) fold).M(fVar, obj);
        }
    }

    public static final Object b(i.j.f fVar, Object obj) {
        if (obj == null) {
            obj = fVar.fold(0, a.f8822g);
            i.l.b.i.b(obj);
        }
        if (obj == 0) {
            return a;
        }
        if (obj instanceof Integer) {
            return fVar.fold(new x(fVar, ((Number) obj).intValue()), c.f8824g);
        }
        return ((r1) obj).W(fVar);
    }
}
