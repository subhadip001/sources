package m.a.a;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.greenrobot.eventbus.EventBusException;

/* compiled from: SubscriberMethodFinder.java */
/* loaded from: classes2.dex */
public class o {
    public static final Map<Class<?>, List<n>> a = new ConcurrentHashMap();
    public static final a[] b = new a[4];

    /* compiled from: SubscriberMethodFinder.java */
    /* loaded from: classes2.dex */
    public static class a {
        public final List<n> a = new ArrayList();
        public final Map<Class, Object> b = new HashMap();
        public final Map<String, Class> c = new HashMap();

        /* renamed from: d  reason: collision with root package name */
        public final StringBuilder f9291d = new StringBuilder(128);

        /* renamed from: e  reason: collision with root package name */
        public Class<?> f9292e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f9293f;

        /* renamed from: g  reason: collision with root package name */
        public m.a.a.r.a f9294g;

        public boolean a(Method method, Class<?> cls) {
            Object put = this.b.put(cls, method);
            if (put == null) {
                return true;
            }
            if (put instanceof Method) {
                if (b((Method) put, cls)) {
                    this.b.put(cls, this);
                } else {
                    throw new IllegalStateException();
                }
            }
            return b(method, cls);
        }

        public final boolean b(Method method, Class<?> cls) {
            this.f9291d.setLength(0);
            this.f9291d.append(method.getName());
            StringBuilder sb = this.f9291d;
            sb.append('>');
            sb.append(cls.getName());
            String sb2 = this.f9291d.toString();
            Class<?> declaringClass = method.getDeclaringClass();
            Class put = this.c.put(sb2, declaringClass);
            if (put == null || put.isAssignableFrom(declaringClass)) {
                return true;
            }
            this.c.put(sb2, put);
            return false;
        }

        public void c() {
            if (this.f9293f) {
                this.f9292e = null;
                return;
            }
            Class<? super Object> superclass = this.f9292e.getSuperclass();
            this.f9292e = superclass;
            String name = superclass.getName();
            if (name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("android.") || name.startsWith("androidx.")) {
                this.f9292e = null;
            }
        }
    }

    public o(List<Object> list, boolean z, boolean z2) {
    }

    public final void a(a aVar) {
        Method[] methods;
        l lVar;
        try {
            try {
                methods = aVar.f9292e.getDeclaredMethods();
            } catch (Throwable unused) {
                methods = aVar.f9292e.getMethods();
                aVar.f9293f = true;
            }
            for (Method method : methods) {
                int modifiers = method.getModifiers();
                if ((modifiers & 1) != 0 && (modifiers & 5192) == 0) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    if (parameterTypes.length == 1 && (lVar = (l) method.getAnnotation(l.class)) != null) {
                        Class<?> cls = parameterTypes[0];
                        if (aVar.a(method, cls)) {
                            aVar.a.add(new n(method, cls, lVar.threadMode(), lVar.priority(), lVar.sticky()));
                        }
                    }
                }
            }
        } catch (LinkageError e2) {
            StringBuilder A = f.a.b.a.a.A("Could not inspect methods of ");
            A.append(aVar.f9292e.getName());
            throw new EventBusException(f.a.b.a.a.p(A.toString(), ". Please make this class visible to EventBus annotation processor to avoid reflection."), e2);
        }
    }

    public final List<n> b(a aVar) {
        ArrayList arrayList = new ArrayList(aVar.a);
        aVar.a.clear();
        aVar.b.clear();
        aVar.c.clear();
        int i2 = 0;
        aVar.f9291d.setLength(0);
        aVar.f9292e = null;
        aVar.f9293f = false;
        aVar.f9294g = null;
        synchronized (b) {
            while (true) {
                if (i2 >= 4) {
                    break;
                }
                a[] aVarArr = b;
                if (aVarArr[i2] == null) {
                    aVarArr[i2] = aVar;
                    break;
                }
                i2++;
            }
        }
        return arrayList;
    }

    public final a c() {
        synchronized (b) {
            for (int i2 = 0; i2 < 4; i2++) {
                a[] aVarArr = b;
                a aVar = aVarArr[i2];
                if (aVar != null) {
                    aVarArr[i2] = null;
                    return aVar;
                }
            }
            return new a();
        }
    }
}
