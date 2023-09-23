package f.h.f;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.LongSerializationPolicy;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* compiled from: Gson.java */
/* loaded from: classes2.dex */
public final class j {

    /* renamed from: m  reason: collision with root package name */
    public static final f.h.f.a0.a<?> f6222m = new f.h.f.a0.a<>(Object.class);
    public final ThreadLocal<Map<f.h.f.a0.a<?>, a<?>>> a;
    public final Map<f.h.f.a0.a<?>, w<?>> b;
    public final f.h.f.z.g c;

    /* renamed from: d  reason: collision with root package name */
    public final f.h.f.z.z.d f6223d;

    /* renamed from: e  reason: collision with root package name */
    public final List<x> f6224e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f6225f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f6226g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f6227h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f6228i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f6229j;

    /* renamed from: k  reason: collision with root package name */
    public final List<x> f6230k;

    /* renamed from: l  reason: collision with root package name */
    public final List<x> f6231l;

    /* compiled from: Gson.java */
    /* loaded from: classes2.dex */
    public static class a<T> extends w<T> {
        public w<T> a;

        @Override // f.h.f.w
        public T a(f.h.f.b0.a aVar) {
            w<T> wVar = this.a;
            if (wVar != null) {
                return wVar.a(aVar);
            }
            throw new IllegalStateException();
        }

        @Override // f.h.f.w
        public void b(f.h.f.b0.b bVar, T t) {
            w<T> wVar = this.a;
            if (wVar != null) {
                wVar.b(bVar, t);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public j() {
        this(f.h.f.z.o.f6246h, FieldNamingPolicy.IDENTITY, Collections.emptyMap(), false, false, false, true, false, false, false, LongSerializationPolicy.DEFAULT, null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
    }

    public static void a(double d2) {
        if (Double.isNaN(d2) || Double.isInfinite(d2)) {
            throw new IllegalArgumentException(d2 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public <T> T b(f.h.f.b0.a aVar, Type type) {
        boolean z = aVar.f6207g;
        boolean z2 = true;
        aVar.f6207g = true;
        try {
            try {
                try {
                    aVar.s0();
                    z2 = false;
                    T a2 = e(new f.h.f.a0.a<>(type)).a(aVar);
                    aVar.f6207g = z;
                    return a2;
                } catch (EOFException e2) {
                    if (z2) {
                        aVar.f6207g = z;
                        return null;
                    }
                    throw new JsonSyntaxException(e2);
                } catch (IllegalStateException e3) {
                    throw new JsonSyntaxException(e3);
                }
            } catch (IOException e4) {
                throw new JsonSyntaxException(e4);
            } catch (AssertionError e5) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.6): " + e5.getMessage());
                assertionError.initCause(e5);
                throw assertionError;
            }
        } catch (Throwable th) {
            aVar.f6207g = z;
            throw th;
        }
    }

    public <T> T c(String str, Class<T> cls) {
        Object d2 = d(str, cls);
        if (cls == Integer.TYPE) {
            cls = (Class<T>) Integer.class;
        } else if (cls == Float.TYPE) {
            cls = (Class<T>) Float.class;
        } else if (cls == Byte.TYPE) {
            cls = (Class<T>) Byte.class;
        } else if (cls == Double.TYPE) {
            cls = (Class<T>) Double.class;
        } else if (cls == Long.TYPE) {
            cls = (Class<T>) Long.class;
        } else if (cls == Character.TYPE) {
            cls = (Class<T>) Character.class;
        } else if (cls == Boolean.TYPE) {
            cls = (Class<T>) Boolean.class;
        } else if (cls == Short.TYPE) {
            cls = (Class<T>) Short.class;
        } else if (cls == Void.TYPE) {
            cls = (Class<T>) Void.class;
        }
        return cls.cast(d2);
    }

    public <T> T d(String str, Type type) {
        if (str == null) {
            return null;
        }
        f.h.f.b0.a aVar = new f.h.f.b0.a(new StringReader(str));
        aVar.f6207g = this.f6229j;
        T t = (T) b(aVar, type);
        if (t != null) {
            try {
                if (aVar.s0() != JsonToken.END_DOCUMENT) {
                    throw new JsonIOException("JSON document was not fully consumed.");
                }
            } catch (MalformedJsonException e2) {
                throw new JsonSyntaxException(e2);
            } catch (IOException e3) {
                throw new JsonIOException(e3);
            }
        }
        return t;
    }

    public <T> w<T> e(f.h.f.a0.a<T> aVar) {
        w<T> wVar = (w<T>) this.b.get(aVar);
        if (wVar != null) {
            return wVar;
        }
        Map<f.h.f.a0.a<?>, a<?>> map = this.a.get();
        boolean z = false;
        if (map == null) {
            map = new HashMap<>();
            this.a.set(map);
            z = true;
        }
        a<?> aVar2 = map.get(aVar);
        if (aVar2 != null) {
            return aVar2;
        }
        try {
            a<?> aVar3 = new a<>();
            map.put(aVar, aVar3);
            for (x xVar : this.f6224e) {
                w<T> a2 = xVar.a(this, aVar);
                if (a2 != null) {
                    if (aVar3.a == null) {
                        aVar3.a = a2;
                        this.b.put(aVar, a2);
                        return a2;
                    }
                    throw new AssertionError();
                }
            }
            throw new IllegalArgumentException("GSON (2.8.6) cannot handle " + aVar);
        } finally {
            map.remove(aVar);
            if (z) {
                this.a.remove();
            }
        }
    }

    public <T> w<T> f(x xVar, f.h.f.a0.a<T> aVar) {
        if (!this.f6224e.contains(xVar)) {
            xVar = this.f6223d;
        }
        boolean z = false;
        for (x xVar2 : this.f6224e) {
            if (z) {
                w<T> a2 = xVar2.a(this, aVar);
                if (a2 != null) {
                    return a2;
                }
            } else if (xVar2 == xVar) {
                z = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + aVar);
    }

    public f.h.f.b0.b g(Writer writer) {
        if (this.f6226g) {
            writer.write(")]}'\n");
        }
        f.h.f.b0.b bVar = new f.h.f.b0.b(writer);
        if (this.f6228i) {
            bVar.f6217i = "  ";
            bVar.f6218j = ": ";
        }
        bVar.n = this.f6225f;
        return bVar;
    }

    public String h(Object obj) {
        if (obj == null) {
            p pVar = q.a;
            StringWriter stringWriter = new StringWriter();
            try {
                i(pVar, g(stringWriter));
                return stringWriter.toString();
            } catch (IOException e2) {
                throw new JsonIOException(e2);
            }
        }
        Type type = obj.getClass();
        StringWriter stringWriter2 = new StringWriter();
        try {
            j(obj, type, g(stringWriter2));
            return stringWriter2.toString();
        } catch (IOException e3) {
            throw new JsonIOException(e3);
        }
    }

    public void i(p pVar, f.h.f.b0.b bVar) {
        boolean z = bVar.f6219k;
        bVar.f6219k = true;
        boolean z2 = bVar.f6220l;
        bVar.f6220l = this.f6227h;
        boolean z3 = bVar.n;
        bVar.n = this.f6225f;
        try {
            try {
                f.h.f.z.z.o.X.b(bVar, pVar);
            } catch (IOException e2) {
                throw new JsonIOException(e2);
            } catch (AssertionError e3) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.6): " + e3.getMessage());
                assertionError.initCause(e3);
                throw assertionError;
            }
        } finally {
            bVar.f6219k = z;
            bVar.f6220l = z2;
            bVar.n = z3;
        }
    }

    public void j(Object obj, Type type, f.h.f.b0.b bVar) {
        w e2 = e(new f.h.f.a0.a(type));
        boolean z = bVar.f6219k;
        bVar.f6219k = true;
        boolean z2 = bVar.f6220l;
        bVar.f6220l = this.f6227h;
        boolean z3 = bVar.n;
        bVar.n = this.f6225f;
        try {
            try {
                e2.b(bVar, obj);
            } catch (IOException e3) {
                throw new JsonIOException(e3);
            } catch (AssertionError e4) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.6): " + e4.getMessage());
                assertionError.initCause(e4);
                throw assertionError;
            }
        } finally {
            bVar.f6219k = z;
            bVar.f6220l = z2;
            bVar.n = z3;
        }
    }

    public String toString() {
        return "{serializeNulls:" + this.f6225f + ",factories:" + this.f6224e + ",instanceCreators:" + this.c + "}";
    }

    public j(f.h.f.z.o oVar, d dVar, Map<Type, l<?>> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, LongSerializationPolicy longSerializationPolicy, String str, int i2, int i3, List<x> list, List<x> list2, List<x> list3) {
        w gVar;
        w eVar;
        w fVar;
        this.a = new ThreadLocal<>();
        this.b = new ConcurrentHashMap();
        f.h.f.z.g gVar2 = new f.h.f.z.g(map);
        this.c = gVar2;
        this.f6225f = z;
        this.f6226g = z3;
        this.f6227h = z4;
        this.f6228i = z5;
        this.f6229j = z6;
        this.f6230k = list;
        this.f6231l = list2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(f.h.f.z.z.o.Y);
        arrayList.add(f.h.f.z.z.h.b);
        arrayList.add(oVar);
        arrayList.addAll(list3);
        arrayList.add(f.h.f.z.z.o.D);
        arrayList.add(f.h.f.z.z.o.f6309m);
        arrayList.add(f.h.f.z.z.o.f6303g);
        arrayList.add(f.h.f.z.z.o.f6305i);
        arrayList.add(f.h.f.z.z.o.f6307k);
        if (longSerializationPolicy == LongSerializationPolicy.DEFAULT) {
            gVar = f.h.f.z.z.o.t;
        } else {
            gVar = new g();
        }
        arrayList.add(new f.h.f.z.z.r(Long.TYPE, Long.class, gVar));
        Class cls = Double.TYPE;
        if (z7) {
            eVar = f.h.f.z.z.o.v;
        } else {
            eVar = new e(this);
        }
        arrayList.add(new f.h.f.z.z.r(cls, Double.class, eVar));
        Class cls2 = Float.TYPE;
        if (z7) {
            fVar = f.h.f.z.z.o.u;
        } else {
            fVar = new f(this);
        }
        arrayList.add(new f.h.f.z.z.r(cls2, Float.class, fVar));
        arrayList.add(f.h.f.z.z.o.x);
        arrayList.add(f.h.f.z.z.o.o);
        arrayList.add(f.h.f.z.z.o.q);
        arrayList.add(new f.h.f.z.z.q(AtomicLong.class, new v(new h(gVar))));
        arrayList.add(new f.h.f.z.z.q(AtomicLongArray.class, new v(new i(gVar))));
        arrayList.add(f.h.f.z.z.o.s);
        arrayList.add(f.h.f.z.z.o.z);
        arrayList.add(f.h.f.z.z.o.F);
        arrayList.add(f.h.f.z.z.o.H);
        arrayList.add(new f.h.f.z.z.q(BigDecimal.class, f.h.f.z.z.o.B));
        arrayList.add(new f.h.f.z.z.q(BigInteger.class, f.h.f.z.z.o.C));
        arrayList.add(f.h.f.z.z.o.J);
        arrayList.add(f.h.f.z.z.o.L);
        arrayList.add(f.h.f.z.z.o.P);
        arrayList.add(f.h.f.z.z.o.R);
        arrayList.add(f.h.f.z.z.o.W);
        arrayList.add(f.h.f.z.z.o.N);
        arrayList.add(f.h.f.z.z.o.f6300d);
        arrayList.add(f.h.f.z.z.c.b);
        arrayList.add(f.h.f.z.z.o.U);
        arrayList.add(f.h.f.z.z.l.b);
        arrayList.add(f.h.f.z.z.k.b);
        arrayList.add(f.h.f.z.z.o.S);
        arrayList.add(f.h.f.z.z.a.c);
        arrayList.add(f.h.f.z.z.o.b);
        arrayList.add(new f.h.f.z.z.b(gVar2));
        arrayList.add(new f.h.f.z.z.g(gVar2, z2));
        f.h.f.z.z.d dVar2 = new f.h.f.z.z.d(gVar2);
        this.f6223d = dVar2;
        arrayList.add(dVar2);
        arrayList.add(f.h.f.z.z.o.Z);
        arrayList.add(new f.h.f.z.z.j(gVar2, dVar, oVar, dVar2));
        this.f6224e = Collections.unmodifiableList(arrayList);
    }
}
