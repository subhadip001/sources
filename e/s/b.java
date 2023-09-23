package e.s;

import androidx.lifecycle.Lifecycle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: ClassesInfoCache.java */
@Deprecated
/* loaded from: classes.dex */
public final class b {
    public static b c = new b();
    public final Map<Class<?>, a> a = new HashMap();
    public final Map<Class<?>, Boolean> b = new HashMap();

    /* compiled from: ClassesInfoCache.java */
    @Deprecated
    /* loaded from: classes.dex */
    public static class a {
        public final Map<Lifecycle.Event, List<C0054b>> a = new HashMap();
        public final Map<C0054b, Lifecycle.Event> b;

        public a(Map<C0054b, Lifecycle.Event> map) {
            this.b = map;
            for (Map.Entry<C0054b, Lifecycle.Event> entry : map.entrySet()) {
                Lifecycle.Event value = entry.getValue();
                List<C0054b> list = this.a.get(value);
                if (list == null) {
                    list = new ArrayList<>();
                    this.a.put(value, list);
                }
                list.add(entry.getKey());
            }
        }

        public static void a(List<C0054b> list, m mVar, Lifecycle.Event event, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    C0054b c0054b = list.get(size);
                    Objects.requireNonNull(c0054b);
                    try {
                        int i2 = c0054b.a;
                        if (i2 == 0) {
                            c0054b.b.invoke(obj, new Object[0]);
                        } else if (i2 == 1) {
                            c0054b.b.invoke(obj, mVar);
                        } else if (i2 == 2) {
                            c0054b.b.invoke(obj, mVar, event);
                        }
                    } catch (IllegalAccessException e2) {
                        throw new RuntimeException(e2);
                    } catch (InvocationTargetException e3) {
                        throw new RuntimeException("Failed to call observer method", e3.getCause());
                    }
                }
            }
        }
    }

    /* compiled from: ClassesInfoCache.java */
    @Deprecated
    /* renamed from: e.s.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0054b {
        public final int a;
        public final Method b;

        public C0054b(int i2, Method method) {
            this.a = i2;
            this.b = method;
            method.setAccessible(true);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0054b) {
                C0054b c0054b = (C0054b) obj;
                return this.a == c0054b.a && this.b.getName().equals(c0054b.b.getName());
            }
            return false;
        }

        public int hashCode() {
            return this.b.getName().hashCode() + (this.a * 31);
        }
    }

    public final a a(Class<?> cls, Method[] methodArr) {
        int i2;
        a b;
        Class<?> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null && (b = b(superclass)) != null) {
            hashMap.putAll(b.b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<C0054b, Lifecycle.Event> entry : b(cls2).b.entrySet()) {
                c(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e2) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            u uVar = (u) method.getAnnotation(u.class);
            if (uVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i2 = 0;
                } else if (!parameterTypes[0].isAssignableFrom(m.class)) {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                } else {
                    i2 = 1;
                }
                Lifecycle.Event value = uVar.value();
                if (parameterTypes.length > 1) {
                    if (parameterTypes[1].isAssignableFrom(Lifecycle.Event.class)) {
                        if (value != Lifecycle.Event.ON_ANY) {
                            throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                        }
                        i2 = 2;
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                }
                if (parameterTypes.length <= 2) {
                    c(hashMap, new C0054b(i2, method), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        a aVar = new a(hashMap);
        this.a.put(cls, aVar);
        this.b.put(cls, Boolean.valueOf(z));
        return aVar;
    }

    public a b(Class<?> cls) {
        a aVar = this.a.get(cls);
        return aVar != null ? aVar : a(cls, null);
    }

    public final void c(Map<C0054b, Lifecycle.Event> map, C0054b c0054b, Lifecycle.Event event, Class<?> cls) {
        Lifecycle.Event event2 = map.get(c0054b);
        if (event2 == null || event == event2) {
            if (event2 == null) {
                map.put(c0054b, event);
                return;
            }
            return;
        }
        Method method = c0054b.b;
        StringBuilder A = f.a.b.a.a.A("Method ");
        A.append(method.getName());
        A.append(" in ");
        A.append(cls.getName());
        A.append(" already declared with different @OnLifecycleEvent value: previous value ");
        A.append(event2);
        A.append(", new value ");
        A.append(event);
        throw new IllegalArgumentException(A.toString());
    }
}
