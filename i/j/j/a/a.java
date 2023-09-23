package i.j.j.a;

import i.j.j.a.f;
import i.l.b.i;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* compiled from: ContinuationImpl.kt */
/* loaded from: classes2.dex */
public abstract class a implements i.j.d<Object>, d, Serializable {

    /* renamed from: f  reason: collision with root package name */
    public final i.j.d<Object> f8634f;

    public a(i.j.d<Object> dVar) {
        this.f8634f = dVar;
    }

    public i.j.d<i.h> a(Object obj, i.j.d<?> dVar) {
        i.e(dVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    @Override // i.j.j.a.d
    public d e() {
        i.j.d<Object> dVar = this.f8634f;
        if (dVar instanceof d) {
            return (d) dVar;
        }
        return null;
    }

    public StackTraceElement g() {
        int i2;
        String str;
        i.e(this, "<this>");
        e eVar = (e) getClass().getAnnotation(e.class);
        String str2 = null;
        if (eVar == null) {
            return null;
        }
        int v = eVar.v();
        if (v <= 1) {
            try {
                Field declaredField = getClass().getDeclaredField("label");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(this);
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                i2 = (num != null ? num.intValue() : 0) - 1;
            } catch (Exception unused) {
                i2 = -1;
            }
            int i3 = i2 >= 0 ? eVar.l()[i2] : -1;
            i.e(this, "continuation");
            f.a aVar = f.c;
            if (aVar == null) {
                try {
                    f.a aVar2 = new f.a(Class.class.getDeclaredMethod("getModule", new Class[0]), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
                    f.c = aVar2;
                    aVar = aVar2;
                } catch (Exception unused2) {
                    aVar = f.b;
                    f.c = aVar;
                }
            }
            if (aVar != f.b) {
                Method method = aVar.a;
                Object invoke = method != null ? method.invoke(getClass(), new Object[0]) : null;
                if (invoke != null) {
                    Method method2 = aVar.b;
                    Object invoke2 = method2 != null ? method2.invoke(invoke, new Object[0]) : null;
                    if (invoke2 != null) {
                        Method method3 = aVar.c;
                        Object invoke3 = method3 != null ? method3.invoke(invoke2, new Object[0]) : null;
                        if (invoke3 instanceof String) {
                            str2 = invoke3;
                        }
                    }
                }
            }
            if (str2 == null) {
                str = eVar.c();
            } else {
                str = str2 + '/' + eVar.c();
            }
            return new StackTraceElement(str, eVar.m(), eVar.f(), i3);
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v + ". Please update the Kotlin standard library.").toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // i.j.d
    public final void h(Object obj) {
        i.j.d dVar = this;
        while (true) {
            i.e(dVar, "frame");
            a aVar = (a) dVar;
            i.j.d dVar2 = aVar.f8634f;
            i.b(dVar2);
            try {
                obj = aVar.l(obj);
                if (obj == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return;
                }
            } catch (Throwable th) {
                obj = f.n.a.n.i.p(th);
            }
            aVar.m();
            if (!(dVar2 instanceof a)) {
                dVar2.h(obj);
                return;
            }
            dVar = dVar2;
        }
    }

    public abstract Object l(Object obj);

    public void m() {
    }

    public String toString() {
        StringBuilder A = f.a.b.a.a.A("Continuation at ");
        Object g2 = g();
        if (g2 == null) {
            g2 = getClass().getName();
        }
        A.append(g2);
        return A.toString();
    }
}
