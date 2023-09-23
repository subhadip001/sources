package i.l.b;

import i.l.a.r;
import i.l.a.s;
import i.l.a.t;
import i.l.a.u;
import i.l.a.v;
import i.l.a.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: ClassReference.kt */
/* loaded from: classes2.dex */
public final class c implements i.o.b<Object>, b {
    public static final Map<Class<? extends i.a<?>>, Integer> b;
    public static final HashMap<String, String> c;

    /* renamed from: d  reason: collision with root package name */
    public static final HashMap<String, String> f8646d;

    /* renamed from: e  reason: collision with root package name */
    public static final HashMap<String, String> f8647e;
    public final Class<?> a;

    static {
        Map<Class<? extends i.a<?>>, Integer> map;
        List c2 = i.i.b.c(i.l.a.a.class, i.l.a.l.class, i.l.a.p.class, i.l.a.q.class, r.class, s.class, t.class, u.class, v.class, w.class, i.l.a.b.class, i.l.a.c.class, i.l.a.d.class, i.l.a.e.class, i.l.a.f.class, i.l.a.g.class, i.l.a.h.class, i.l.a.i.class, i.l.a.j.class, i.l.a.k.class, i.l.a.m.class, i.l.a.n.class, i.l.a.o.class);
        ArrayList arrayList = new ArrayList(f.n.a.n.i.k(c2, 10));
        int i2 = 0;
        for (Object obj : c2) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                arrayList.add(new i.d((Class) obj, Integer.valueOf(i2)));
                i2 = i3;
            } else {
                throw new ArithmeticException("Index overflow has happened.");
            }
        }
        i.e(arrayList, "<this>");
        int size = arrayList.size();
        if (size == 0) {
            map = i.i.e.f8614f;
            i.c(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        } else if (size != 1) {
            map = new LinkedHashMap<>(f.n.a.n.i.H(arrayList.size()));
            i.i.b.i(arrayList, map);
        } else {
            i.d dVar = (i.d) arrayList.get(0);
            i.e(dVar, "pair");
            map = Collections.singletonMap(dVar.f8606f, dVar.f8607g);
            i.d(map, "singletonMap(pair.first, pair.second)");
        }
        b = map;
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        c = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        f8646d = hashMap2;
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        i.d(values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            i.d(str, "kotlinName");
            sb.append(i.q.e.k(str, '.', null, 2));
            sb.append("CompanionObject");
            String sb2 = sb.toString();
            hashMap3.put(sb2, str + ".Companion");
        }
        for (Map.Entry<Class<? extends i.a<?>>, Integer> entry : b.entrySet()) {
            int intValue = entry.getValue().intValue();
            String name = entry.getKey().getName();
            hashMap3.put(name, "kotlin.Function" + intValue);
        }
        f8647e = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(f.n.a.n.i.H(hashMap3.size()));
        Iterator<T> it = hashMap3.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            linkedHashMap.put(entry2.getKey(), i.q.e.k((String) entry2.getValue(), '.', null, 2));
        }
    }

    public c(Class<?> cls) {
        i.e(cls, "jClass");
        this.a = cls;
    }

    @Override // i.l.b.b
    public Class<?> a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof c) && i.a(f.n.a.n.i.v(this), f.n.a.n.i.v((i.o.b) obj));
    }

    public int hashCode() {
        return f.n.a.n.i.v(this).hashCode();
    }

    public String toString() {
        return this.a.toString() + " (Kotlin reflection is not available)";
    }
}
