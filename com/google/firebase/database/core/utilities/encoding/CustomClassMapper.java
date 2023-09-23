package com.google.firebase.database.core.utilities.encoding;

import android.util.Log;
import com.google.firebase.database.DatabaseException;
import com.google.firebase.database.Exclude;
import com.google.firebase.database.GenericTypeIndicator;
import com.google.firebase.database.IgnoreExtraProperties;
import com.google.firebase.database.PropertyName;
import com.google.firebase.database.ThrowOnExtraProperties;
import com.google.firebase.database.core.utilities.Utilities;
import f.a.b.a.a;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes2.dex */
public class CustomClassMapper {
    private static final String LOG_TAG = "ClassMapper";
    private static final ConcurrentMap<Class<?>, BeanMapper<?>> mappers = new ConcurrentHashMap();

    /* loaded from: classes2.dex */
    public static class BeanMapper<T> {
        private final Class<T> clazz;
        private final Constructor<T> constructor;
        private final boolean throwOnUnknownProperties;
        private final boolean warnOnUnknownProperties;
        private final Map<String, String> properties = new HashMap();
        private final Map<String, Method> setters = new HashMap();
        private final Map<String, Method> getters = new HashMap();
        private final Map<String, Field> fields = new HashMap();

        public BeanMapper(Class<T> cls) {
            Constructor<T> constructor;
            Method[] methods;
            Field[] fields;
            Method[] declaredMethods;
            Field[] declaredFields;
            this.clazz = cls;
            this.throwOnUnknownProperties = cls.isAnnotationPresent(ThrowOnExtraProperties.class);
            this.warnOnUnknownProperties = !cls.isAnnotationPresent(IgnoreExtraProperties.class);
            try {
                constructor = cls.getDeclaredConstructor(new Class[0]);
                constructor.setAccessible(true);
            } catch (NoSuchMethodException unused) {
                constructor = null;
            }
            this.constructor = constructor;
            for (Method method : cls.getMethods()) {
                if (shouldIncludeGetter(method)) {
                    String propertyName = propertyName(method);
                    addProperty(propertyName);
                    method.setAccessible(true);
                    if (!this.getters.containsKey(propertyName)) {
                        this.getters.put(propertyName, method);
                    } else {
                        StringBuilder A = a.A("Found conflicting getters for name: ");
                        A.append(method.getName());
                        throw new DatabaseException(A.toString());
                    }
                }
            }
            for (Field field : cls.getFields()) {
                if (shouldIncludeField(field)) {
                    addProperty(propertyName(field));
                }
            }
            Class<T> cls2 = cls;
            do {
                for (Method method2 : cls2.getDeclaredMethods()) {
                    if (shouldIncludeSetter(method2)) {
                        String propertyName2 = propertyName(method2);
                        String str = this.properties.get(propertyName2.toLowerCase(Locale.US));
                        if (str == null) {
                            continue;
                        } else if (str.equals(propertyName2)) {
                            Method method3 = this.setters.get(propertyName2);
                            if (method3 == null) {
                                method2.setAccessible(true);
                                this.setters.put(propertyName2, method2);
                            } else if (!isSetterOverride(method2, method3)) {
                                StringBuilder A2 = a.A("Found a conflicting setters with name: ");
                                A2.append(method2.getName());
                                A2.append(" (conflicts with ");
                                A2.append(method3.getName());
                                A2.append(" defined on ");
                                A2.append(method3.getDeclaringClass().getName());
                                A2.append(")");
                                throw new DatabaseException(A2.toString());
                            }
                        } else {
                            StringBuilder A3 = a.A("Found setter with invalid case-sensitive name: ");
                            A3.append(method2.getName());
                            throw new DatabaseException(A3.toString());
                        }
                    }
                }
                for (Field field2 : cls2.getDeclaredFields()) {
                    String propertyName3 = propertyName(field2);
                    if (this.properties.containsKey(propertyName3.toLowerCase(Locale.US)) && !this.fields.containsKey(propertyName3)) {
                        field2.setAccessible(true);
                        this.fields.put(propertyName3, field2);
                    }
                }
                cls2 = cls2.getSuperclass();
                if (cls2 == null) {
                    break;
                }
            } while (!cls2.equals(Object.class));
            if (this.properties.isEmpty()) {
                StringBuilder A4 = a.A("No properties to serialize found on class ");
                A4.append(cls.getName());
                throw new DatabaseException(A4.toString());
            }
        }

        private void addProperty(String str) {
            Map<String, String> map = this.properties;
            Locale locale = Locale.US;
            String put = map.put(str.toLowerCase(locale), str);
            if (put == null || str.equals(put)) {
                return;
            }
            StringBuilder A = a.A("Found two getters or fields with conflicting case sensitivity for property: ");
            A.append(str.toLowerCase(locale));
            throw new DatabaseException(A.toString());
        }

        private static String annotatedName(AccessibleObject accessibleObject) {
            if (accessibleObject.isAnnotationPresent(PropertyName.class)) {
                return ((PropertyName) accessibleObject.getAnnotation(PropertyName.class)).value();
            }
            return null;
        }

        private static boolean isSetterOverride(Method method, Method method2) {
            Utilities.hardAssert(method.getDeclaringClass().isAssignableFrom(method2.getDeclaringClass()), "Expected override from a base class");
            Utilities.hardAssert(method.getReturnType().equals(Void.TYPE), "Expected void return type");
            Utilities.hardAssert(method2.getReturnType().equals(Void.TYPE), "Expected void return type");
            Class<?>[] parameterTypes = method.getParameterTypes();
            Class<?>[] parameterTypes2 = method2.getParameterTypes();
            Utilities.hardAssert(parameterTypes.length == 1, "Expected exactly one parameter");
            Utilities.hardAssert(parameterTypes2.length == 1, "Expected exactly one parameter");
            return method.getName().equals(method2.getName()) && parameterTypes[0].equals(parameterTypes2[0]);
        }

        private static String propertyName(Field field) {
            String annotatedName = annotatedName(field);
            return annotatedName != null ? annotatedName : field.getName();
        }

        private Type resolveType(Type type, Map<TypeVariable<Class<T>>, Type> map) {
            if (type instanceof TypeVariable) {
                Type type2 = map.get(type);
                if (type2 != null) {
                    return type2;
                }
                throw new IllegalStateException("Could not resolve type " + type);
            }
            return type;
        }

        private static String serializedName(String str) {
            String[] strArr = {"get", "set", "is"};
            String str2 = null;
            for (int i2 = 0; i2 < 3; i2++) {
                String str3 = strArr[i2];
                if (str.startsWith(str3)) {
                    str2 = str3;
                }
            }
            if (str2 != null) {
                char[] charArray = str.substring(str2.length()).toCharArray();
                for (int i3 = 0; i3 < charArray.length && Character.isUpperCase(charArray[i3]); i3++) {
                    charArray[i3] = Character.toLowerCase(charArray[i3]);
                }
                return new String(charArray);
            }
            throw new IllegalArgumentException(a.p("Unknown Bean prefix for method: ", str));
        }

        private static boolean shouldIncludeField(Field field) {
            return (field.getDeclaringClass().equals(Object.class) || !Modifier.isPublic(field.getModifiers()) || Modifier.isStatic(field.getModifiers()) || Modifier.isTransient(field.getModifiers()) || field.isAnnotationPresent(Exclude.class)) ? false : true;
        }

        private static boolean shouldIncludeGetter(Method method) {
            return ((!method.getName().startsWith("get") && !method.getName().startsWith("is")) || method.getDeclaringClass().equals(Object.class) || !Modifier.isPublic(method.getModifiers()) || Modifier.isStatic(method.getModifiers()) || method.getReturnType().equals(Void.TYPE) || method.getParameterTypes().length != 0 || method.isAnnotationPresent(Exclude.class)) ? false : true;
        }

        private static boolean shouldIncludeSetter(Method method) {
            return method.getName().startsWith("set") && !method.getDeclaringClass().equals(Object.class) && !Modifier.isStatic(method.getModifiers()) && method.getReturnType().equals(Void.TYPE) && method.getParameterTypes().length == 1 && !method.isAnnotationPresent(Exclude.class);
        }

        public T deserialize(Map<String, Object> map) {
            return deserialize(map, Collections.emptyMap());
        }

        public Map<String, Object> serialize(T t) {
            Object obj;
            if (this.clazz.isAssignableFrom(t.getClass())) {
                HashMap hashMap = new HashMap();
                for (String str : this.properties.values()) {
                    if (this.getters.containsKey(str)) {
                        try {
                            obj = this.getters.get(str).invoke(t, new Object[0]);
                        } catch (IllegalAccessException e2) {
                            throw new RuntimeException(e2);
                        } catch (InvocationTargetException e3) {
                            throw new RuntimeException(e3);
                        }
                    } else {
                        Field field = this.fields.get(str);
                        if (field != null) {
                            try {
                                obj = field.get(t);
                            } catch (IllegalAccessException e4) {
                                throw new RuntimeException(e4);
                            }
                        } else {
                            throw new IllegalStateException(a.p("Bean property without field or getter:", str));
                        }
                    }
                    hashMap.put(str, CustomClassMapper.serialize(obj));
                }
                return hashMap;
            }
            StringBuilder A = a.A("Can't serialize object of class ");
            A.append(t.getClass());
            A.append(" with BeanMapper for class ");
            A.append(this.clazz);
            throw new IllegalArgumentException(A.toString());
        }

        public T deserialize(Map<String, Object> map, Map<TypeVariable<Class<T>>, Type> map2) {
            Constructor<T> constructor = this.constructor;
            if (constructor != null) {
                try {
                    T newInstance = constructor.newInstance(new Object[0]);
                    for (Map.Entry<String, Object> entry : map.entrySet()) {
                        String key = entry.getKey();
                        if (this.setters.containsKey(key)) {
                            Method method = this.setters.get(key);
                            Type[] genericParameterTypes = method.getGenericParameterTypes();
                            if (genericParameterTypes.length == 1) {
                                try {
                                    method.invoke(newInstance, CustomClassMapper.deserializeToType(entry.getValue(), resolveType(genericParameterTypes[0], map2)));
                                } catch (IllegalAccessException e2) {
                                    throw new RuntimeException(e2);
                                } catch (InvocationTargetException e3) {
                                    throw new RuntimeException(e3);
                                }
                            } else {
                                throw new IllegalStateException("Setter does not have exactly one parameter");
                            }
                        } else if (this.fields.containsKey(key)) {
                            Field field = this.fields.get(key);
                            try {
                                field.set(newInstance, CustomClassMapper.deserializeToType(entry.getValue(), resolveType(field.getGenericType(), map2)));
                            } catch (IllegalAccessException e4) {
                                throw new RuntimeException(e4);
                            }
                        } else {
                            StringBuilder E = a.E("No setter/field for ", key, " found on class ");
                            E.append(this.clazz.getName());
                            String sb = E.toString();
                            if (this.properties.containsKey(key.toLowerCase(Locale.US))) {
                                sb = a.p(sb, " (fields/setters are case sensitive!)");
                            }
                            if (!this.throwOnUnknownProperties) {
                                if (this.warnOnUnknownProperties) {
                                    Log.w(CustomClassMapper.LOG_TAG, sb);
                                }
                            } else {
                                throw new DatabaseException(sb);
                            }
                        }
                    }
                    return newInstance;
                } catch (IllegalAccessException e5) {
                    throw new RuntimeException(e5);
                } catch (InstantiationException e6) {
                    throw new RuntimeException(e6);
                } catch (InvocationTargetException e7) {
                    throw new RuntimeException(e7);
                }
            }
            StringBuilder A = a.A("Class ");
            A.append(this.clazz.getName());
            A.append(" does not define a no-argument constructor. If you are using ProGuard, make sure these constructors are not stripped.");
            throw new DatabaseException(A.toString());
        }

        private static String propertyName(Method method) {
            String annotatedName = annotatedName(method);
            return annotatedName != null ? annotatedName : serializedName(method.getName());
        }
    }

    private static <T> T convertBean(Object obj, Class<T> cls) {
        BeanMapper loadOrCreateBeanMapperForClass = loadOrCreateBeanMapperForClass(cls);
        if (obj instanceof Map) {
            return (T) loadOrCreateBeanMapperForClass.deserialize(expectMap(obj));
        }
        StringBuilder A = a.A("Can't convert object of type ");
        A.append(obj.getClass().getName());
        A.append(" to type ");
        A.append(cls.getName());
        throw new DatabaseException(A.toString());
    }

    private static Boolean convertBoolean(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        StringBuilder A = a.A("Failed to convert value of type ");
        A.append(obj.getClass().getName());
        A.append(" to boolean");
        throw new DatabaseException(A.toString());
    }

    private static Double convertDouble(Object obj) {
        if (obj instanceof Integer) {
            return Double.valueOf(((Integer) obj).doubleValue());
        }
        if (obj instanceof Long) {
            Long l2 = (Long) obj;
            Double valueOf = Double.valueOf(l2.doubleValue());
            if (valueOf.longValue() == l2.longValue()) {
                return valueOf;
            }
            throw new DatabaseException("Loss of precision while converting number to double: " + obj + ". Did you mean to use a 64-bit long instead?");
        } else if (obj instanceof Double) {
            return (Double) obj;
        } else {
            StringBuilder A = a.A("Failed to convert a value of type ");
            A.append(obj.getClass().getName());
            A.append(" to double");
            throw new DatabaseException(A.toString());
        }
    }

    private static Integer convertInteger(Object obj) {
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (!(obj instanceof Long) && !(obj instanceof Double)) {
            StringBuilder A = a.A("Failed to convert a value of type ");
            A.append(obj.getClass().getName());
            A.append(" to int");
            throw new DatabaseException(A.toString());
        }
        Number number = (Number) obj;
        double doubleValue = number.doubleValue();
        if (doubleValue >= -2.147483648E9d && doubleValue <= 2.147483647E9d) {
            return Integer.valueOf(number.intValue());
        }
        throw new DatabaseException("Numeric value out of 32-bit integer range: " + doubleValue + ". Did you mean to use a long or double instead of an int?");
    }

    private static Long convertLong(Object obj) {
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).longValue());
        }
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof Double) {
            Double d2 = (Double) obj;
            if (d2.doubleValue() >= -9.223372036854776E18d && d2.doubleValue() <= 9.223372036854776E18d) {
                return Long.valueOf(d2.longValue());
            }
            throw new DatabaseException("Numeric value out of 64-bit long range: " + d2 + ". Did you mean to use a double instead of a long?");
        }
        StringBuilder A = a.A("Failed to convert a value of type ");
        A.append(obj.getClass().getName());
        A.append(" to long");
        throw new DatabaseException(A.toString());
    }

    private static String convertString(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        StringBuilder A = a.A("Failed to convert value of type ");
        A.append(obj.getClass().getName());
        A.append(" to String");
        throw new DatabaseException(A.toString());
    }

    public static <T> T convertToCustomClass(Object obj, Class<T> cls) {
        return (T) deserializeToClass(obj, cls);
    }

    public static Object convertToPlainJavaTypes(Object obj) {
        return serialize(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> T deserializeToClass(Object obj, Class<T> cls) {
        if (obj == 0) {
            return null;
        }
        if (!cls.isPrimitive() && !Number.class.isAssignableFrom(cls) && !Boolean.class.isAssignableFrom(cls) && !Character.class.isAssignableFrom(cls)) {
            if (String.class.isAssignableFrom(cls)) {
                return (T) convertString(obj);
            }
            if (!cls.isArray()) {
                if (cls.getTypeParameters().length <= 0) {
                    if (cls.equals(Object.class)) {
                        return obj;
                    }
                    if (cls.isEnum()) {
                        return (T) deserializeToEnum(obj, cls);
                    }
                    return (T) convertBean(obj, cls);
                }
                StringBuilder A = a.A("Class ");
                A.append(cls.getName());
                A.append(" has generic type parameters, please use GenericTypeIndicator instead");
                throw new DatabaseException(A.toString());
            }
            throw new DatabaseException("Converting to Arrays is not supported, please use Listsinstead");
        }
        return (T) deserializeToPrimitive(obj, cls);
    }

    private static <T> T deserializeToEnum(Object obj, Class<T> cls) {
        if (obj instanceof String) {
            String str = (String) obj;
            try {
                return (T) Enum.valueOf(cls, str);
            } catch (IllegalArgumentException unused) {
                StringBuilder A = a.A("Could not find enum value of ");
                A.append(cls.getName());
                A.append(" for value \"");
                A.append(str);
                A.append("\"");
                throw new DatabaseException(A.toString());
            }
        }
        throw new DatabaseException("Expected a String while deserializing to enum " + cls + " but got a " + obj.getClass());
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [T, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r0v9, types: [T, java.util.ArrayList] */
    private static <T> T deserializeToParameterizedType(Object obj, ParameterizedType parameterizedType) {
        Class cls = (Class) parameterizedType.getRawType();
        if (List.class.isAssignableFrom(cls)) {
            Type type = parameterizedType.getActualTypeArguments()[0];
            if (obj instanceof List) {
                List<Object> list = (List) obj;
                ?? r0 = (T) new ArrayList(list.size());
                for (Object obj2 : list) {
                    r0.add(deserializeToType(obj2, type));
                }
                return r0;
            }
            StringBuilder A = a.A("Expected a List while deserializing, but got a ");
            A.append(obj.getClass());
            throw new DatabaseException(A.toString());
        } else if (Map.class.isAssignableFrom(cls)) {
            Type type2 = parameterizedType.getActualTypeArguments()[0];
            Type type3 = parameterizedType.getActualTypeArguments()[1];
            if (type2.equals(String.class)) {
                Map<String, Object> expectMap = expectMap(obj);
                ?? r02 = (T) new HashMap();
                for (Map.Entry<String, Object> entry : expectMap.entrySet()) {
                    r02.put(entry.getKey(), deserializeToType(entry.getValue(), type3));
                }
                return r02;
            }
            throw new DatabaseException("Only Maps with string keys are supported, but found Map with key type " + type2);
        } else if (!Collection.class.isAssignableFrom(cls)) {
            Map<String, Object> expectMap2 = expectMap(obj);
            BeanMapper loadOrCreateBeanMapperForClass = loadOrCreateBeanMapperForClass(cls);
            HashMap hashMap = new HashMap();
            TypeVariable<Class<T>>[] typeParameters = loadOrCreateBeanMapperForClass.clazz.getTypeParameters();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            if (actualTypeArguments.length == typeParameters.length) {
                for (int i2 = 0; i2 < typeParameters.length; i2++) {
                    hashMap.put(typeParameters[i2], actualTypeArguments[i2]);
                }
                return (T) loadOrCreateBeanMapperForClass.deserialize(expectMap2, hashMap);
            }
            throw new IllegalStateException("Mismatched lengths for type variables and actual types");
        } else {
            throw new DatabaseException("Collections are not supported, please use Lists instead");
        }
    }

    private static <T> T deserializeToPrimitive(Object obj, Class<T> cls) {
        if (!Integer.class.isAssignableFrom(cls) && !Integer.TYPE.isAssignableFrom(cls)) {
            if (!Boolean.class.isAssignableFrom(cls) && !Boolean.TYPE.isAssignableFrom(cls)) {
                if (!Double.class.isAssignableFrom(cls) && !Double.TYPE.isAssignableFrom(cls)) {
                    if (!Long.class.isAssignableFrom(cls) && !Long.TYPE.isAssignableFrom(cls)) {
                        if (!Float.class.isAssignableFrom(cls) && !Float.TYPE.isAssignableFrom(cls)) {
                            throw new DatabaseException(String.format("Deserializing values to %s is not supported", cls.getSimpleName()));
                        }
                        return (T) Float.valueOf(convertDouble(obj).floatValue());
                    }
                    return (T) convertLong(obj);
                }
                return (T) convertDouble(obj);
            }
            return (T) convertBoolean(obj);
        }
        return (T) convertInteger(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> T deserializeToType(Object obj, Type type) {
        boolean z;
        if (obj == null) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return (T) deserializeToParameterizedType(obj, (ParameterizedType) type);
        }
        if (type instanceof Class) {
            return (T) deserializeToClass(obj, (Class) type);
        }
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type;
            if (wildcardType.getLowerBounds().length <= 0) {
                Type[] upperBounds = wildcardType.getUpperBounds();
                z = upperBounds.length > 0;
                Utilities.hardAssert(z, "Wildcard type " + type + " is not upper bounded.");
                return (T) deserializeToType(obj, upperBounds[0]);
            }
            throw new DatabaseException("Generic lower-bounded wildcard types are not supported");
        } else if (type instanceof TypeVariable) {
            Type[] bounds = ((TypeVariable) type).getBounds();
            z = bounds.length > 0;
            Utilities.hardAssert(z, "Wildcard type " + type + " is not upper bounded.");
            return (T) deserializeToType(obj, bounds[0]);
        } else if (type instanceof GenericArrayType) {
            throw new DatabaseException("Generic Arrays are not supported, please use Lists instead");
        } else {
            throw new IllegalStateException("Unknown type encountered: " + type);
        }
    }

    private static Map<String, Object> expectMap(Object obj) {
        if (obj instanceof Map) {
            return (Map) obj;
        }
        StringBuilder A = a.A("Expected a Map while deserializing, but got a ");
        A.append(obj.getClass());
        throw new DatabaseException(A.toString());
    }

    private static <T> BeanMapper<T> loadOrCreateBeanMapperForClass(Class<T> cls) {
        ConcurrentMap<Class<?>, BeanMapper<?>> concurrentMap = mappers;
        BeanMapper<?> beanMapper = concurrentMap.get(cls);
        if (beanMapper == null) {
            BeanMapper<T> beanMapper2 = new BeanMapper<>(cls);
            concurrentMap.put(cls, beanMapper2);
            return beanMapper2;
        }
        return beanMapper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> Object serialize(T t) {
        if (t == null) {
            return null;
        }
        if (t instanceof Number) {
            if (!(t instanceof Float) && !(t instanceof Double)) {
                if ((t instanceof Long) || (t instanceof Integer)) {
                    return t;
                }
                throw new DatabaseException(String.format("Numbers of type %s are not supported, please use an int, long, float or double", t.getClass().getSimpleName()));
            }
            Number number = (Number) t;
            double doubleValue = number.doubleValue();
            if (doubleValue <= 9.223372036854776E18d && doubleValue >= -9.223372036854776E18d && Math.floor(doubleValue) == doubleValue) {
                return Long.valueOf(number.longValue());
            }
            return Double.valueOf(doubleValue);
        } else if ((t instanceof String) || (t instanceof Boolean)) {
            return t;
        } else {
            if (!(t instanceof Character)) {
                if (t instanceof Map) {
                    HashMap hashMap = new HashMap();
                    for (Map.Entry entry : ((Map) t).entrySet()) {
                        Object key = entry.getKey();
                        if (key instanceof String) {
                            hashMap.put((String) key, serialize(entry.getValue()));
                        } else {
                            throw new DatabaseException("Maps with non-string keys are not supported");
                        }
                    }
                    return hashMap;
                } else if (t instanceof Collection) {
                    if (t instanceof List) {
                        List<Object> list = (List) t;
                        ArrayList arrayList = new ArrayList(list.size());
                        for (Object obj : list) {
                            arrayList.add(serialize(obj));
                        }
                        return arrayList;
                    }
                    throw new DatabaseException("Serializing Collections is not supported, please use Lists instead");
                } else if (!t.getClass().isArray()) {
                    if (t instanceof Enum) {
                        return ((Enum) t).name();
                    }
                    return loadOrCreateBeanMapperForClass(t.getClass()).serialize(t);
                } else {
                    throw new DatabaseException("Serializing Arrays is not supported, please use Lists instead");
                }
            }
            throw new DatabaseException("Characters are not supported, please use Strings");
        }
    }

    public static <T> T convertToCustomClass(Object obj, GenericTypeIndicator<T> genericTypeIndicator) {
        Type genericSuperclass = genericTypeIndicator.getClass().getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            if (parameterizedType.getRawType().equals(GenericTypeIndicator.class)) {
                return (T) deserializeToType(obj, parameterizedType.getActualTypeArguments()[0]);
            }
            throw new DatabaseException("Not a direct subclass of GenericTypeIndicator: " + genericSuperclass);
        }
        throw new DatabaseException("Not a direct subclass of GenericTypeIndicator: " + genericSuperclass);
    }

    public static Map<String, Object> convertToPlainJavaTypes(Map<String, Object> map) {
        Object serialize = serialize(map);
        Utilities.hardAssert(serialize instanceof Map);
        return (Map) serialize;
    }
}
