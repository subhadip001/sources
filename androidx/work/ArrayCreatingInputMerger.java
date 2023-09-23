package androidx.work;

import e.g0.e;
import e.g0.h;
import java.lang.reflect.Array;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class ArrayCreatingInputMerger extends h {
    @Override // e.g0.h
    public e a(List<e> list) {
        Object newInstance;
        e.a aVar = new e.a();
        HashMap hashMap = new HashMap();
        for (e eVar : list) {
            for (Map.Entry entry : Collections.unmodifiableMap(eVar.a).entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                Class<?> cls = value.getClass();
                Object obj = hashMap.get(str);
                if (obj == null) {
                    if (!cls.isArray()) {
                        newInstance = Array.newInstance(value.getClass(), 1);
                        Array.set(newInstance, 0, value);
                        value = newInstance;
                        hashMap.put(str, value);
                    } else {
                        hashMap.put(str, value);
                    }
                } else {
                    Class<?> cls2 = obj.getClass();
                    if (cls2.equals(cls)) {
                        if (cls2.isArray()) {
                            int length = Array.getLength(obj);
                            int length2 = Array.getLength(value);
                            Object newInstance2 = Array.newInstance(obj.getClass().getComponentType(), length + length2);
                            System.arraycopy(obj, 0, newInstance2, 0, length);
                            System.arraycopy(value, 0, newInstance2, length, length2);
                            value = newInstance2;
                        } else {
                            newInstance = Array.newInstance(obj.getClass(), 2);
                            Array.set(newInstance, 0, obj);
                            Array.set(newInstance, 1, value);
                            value = newInstance;
                        }
                    } else if (cls2.isArray() && cls2.getComponentType().equals(cls)) {
                        value = b(obj, value);
                    } else if (cls.isArray() && cls.getComponentType().equals(cls2)) {
                        value = b(value, obj);
                    } else {
                        throw new IllegalArgumentException();
                    }
                    hashMap.put(str, value);
                }
            }
        }
        aVar.b(hashMap);
        return aVar.a();
    }

    public final Object b(Object obj, Object obj2) {
        int length = Array.getLength(obj);
        Object newInstance = Array.newInstance(obj2.getClass(), length + 1);
        System.arraycopy(obj, 0, newInstance, 0, length);
        Array.set(newInstance, length, obj2);
        return newInstance;
    }
}
