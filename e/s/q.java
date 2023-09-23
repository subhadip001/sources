package e.s;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Lifecycling.java */
/* loaded from: classes.dex */
public class q {
    public static Map<Class<?>, Integer> a = new HashMap();
    public static Map<Class<?>, List<Constructor<? extends h>>> b = new HashMap();

    public static h a(Constructor<? extends h> constructor, Object obj) {
        try {
            return constructor.newInstance(obj);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException(e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    public static String b(String str) {
        return str.replace(".", "_") + "_LifecycleAdapter";
    }

    public static int c(Class<?> cls) {
        Constructor<?> constructor;
        boolean z;
        ArrayList arrayList;
        Integer num = a.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i2 = 1;
        if (cls.getCanonicalName() != null) {
            try {
                Package r4 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = r4 != null ? r4.getName() : "";
                if (!name.isEmpty()) {
                    canonicalName = canonicalName.substring(name.length() + 1);
                }
                String b2 = b(canonicalName);
                if (!name.isEmpty()) {
                    b2 = name + "." + b2;
                }
                constructor = Class.forName(b2).getDeclaredConstructor(cls);
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e2) {
                throw new RuntimeException(e2);
            }
            if (constructor != null) {
                b.put(cls, Collections.singletonList(constructor));
            } else {
                b bVar = b.c;
                Boolean bool = bVar.b.get(cls);
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 < length) {
                                if (((u) declaredMethods[i3].getAnnotation(u.class)) != null) {
                                    bVar.a(cls, declaredMethods);
                                    z = true;
                                    break;
                                }
                                i3++;
                            } else {
                                bVar.b.put(cls, Boolean.FALSE);
                                z = false;
                                break;
                            }
                        }
                    } catch (NoClassDefFoundError e3) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e3);
                    }
                }
                if (!z) {
                    Class<? super Object> superclass = cls.getSuperclass();
                    if (superclass != null && l.class.isAssignableFrom(superclass)) {
                        arrayList = c(superclass) != 1 ? new ArrayList(b.get(superclass)) : null;
                    }
                    Class<?>[] interfaces = cls.getInterfaces();
                    int length2 = interfaces.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 < length2) {
                            Class<?> cls2 = interfaces[i4];
                            if (cls2 != null && l.class.isAssignableFrom(cls2)) {
                                if (c(cls2) == 1) {
                                    break;
                                }
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                arrayList.addAll(b.get(cls2));
                            }
                            i4++;
                        } else if (arrayList != null) {
                            b.put(cls, arrayList);
                        }
                    }
                }
            }
            i2 = 2;
        }
        a.put(cls, Integer.valueOf(i2));
        return i2;
    }
}
