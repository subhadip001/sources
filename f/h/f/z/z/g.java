package f.h.f.z.z;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonToken;
import f.h.f.b0.a;
import f.h.f.w;
import f.h.f.x;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

/* compiled from: MapTypeAdapterFactory.java */
/* loaded from: classes2.dex */
public final class g implements x {

    /* renamed from: f  reason: collision with root package name */
    public final f.h.f.z.g f6277f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f6278g;

    /* compiled from: MapTypeAdapterFactory.java */
    /* loaded from: classes2.dex */
    public final class a<K, V> extends w<Map<K, V>> {
        public final w<K> a;
        public final w<V> b;
        public final f.h.f.z.t<? extends Map<K, V>> c;

        public a(f.h.f.j jVar, Type type, w<K> wVar, Type type2, w<V> wVar2, f.h.f.z.t<? extends Map<K, V>> tVar) {
            this.a = new n(jVar, wVar, type);
            this.b = new n(jVar, wVar2, type2);
            this.c = tVar;
        }

        @Override // f.h.f.w
        public Object a(f.h.f.b0.a aVar) {
            JsonToken s0 = aVar.s0();
            if (s0 == JsonToken.NULL) {
                aVar.i0();
                return null;
            }
            Map<K, V> a = this.c.a();
            if (s0 == JsonToken.BEGIN_ARRAY) {
                aVar.a();
                while (aVar.F()) {
                    aVar.a();
                    K a2 = this.a.a(aVar);
                    if (a.put(a2, this.b.a(aVar)) == null) {
                        aVar.p();
                    } else {
                        throw new JsonSyntaxException("duplicate key: " + a2);
                    }
                }
                aVar.p();
            } else {
                aVar.f();
                while (aVar.F()) {
                    Objects.requireNonNull((a.C0142a) f.h.f.z.q.a);
                    if (aVar instanceof e) {
                        e eVar = (e) aVar;
                        eVar.z0(JsonToken.NAME);
                        Map.Entry entry = (Map.Entry) ((Iterator) eVar.A0()).next();
                        eVar.C0(entry.getValue());
                        eVar.C0(new f.h.f.s((String) entry.getKey()));
                    } else {
                        int i2 = aVar.f6213m;
                        if (i2 == 0) {
                            i2 = aVar.l();
                        }
                        if (i2 == 13) {
                            aVar.f6213m = 9;
                        } else if (i2 == 12) {
                            aVar.f6213m = 8;
                        } else if (i2 == 14) {
                            aVar.f6213m = 10;
                        } else {
                            StringBuilder A = f.a.b.a.a.A("Expected a name but was ");
                            A.append(aVar.s0());
                            A.append(aVar.N());
                            throw new IllegalStateException(A.toString());
                        }
                    }
                    K a3 = this.a.a(aVar);
                    if (a.put(a3, this.b.a(aVar)) != null) {
                        throw new JsonSyntaxException("duplicate key: " + a3);
                    }
                }
                aVar.q();
            }
            return a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // f.h.f.w
        public void b(f.h.f.b0.b bVar, Object obj) {
            String str;
            Map map = (Map) obj;
            if (map == null) {
                bVar.F();
            } else if (!g.this.f6278g) {
                bVar.g();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    bVar.v(String.valueOf(entry.getKey()));
                    this.b.b(bVar, entry.getValue());
                }
                bVar.q();
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i2 = 0;
                boolean z = false;
                for (Map.Entry<K, V> entry2 : map.entrySet()) {
                    w<K> wVar = this.a;
                    K key = entry2.getKey();
                    Objects.requireNonNull(wVar);
                    try {
                        f fVar = new f();
                        wVar.b(fVar, key);
                        f.h.f.p q0 = fVar.q0();
                        arrayList.add(q0);
                        arrayList2.add(entry2.getValue());
                        Objects.requireNonNull(q0);
                        z |= (q0 instanceof f.h.f.m) || (q0 instanceof f.h.f.r);
                    } catch (IOException e2) {
                        throw new JsonIOException(e2);
                    }
                }
                if (z) {
                    bVar.f();
                    int size = arrayList.size();
                    while (i2 < size) {
                        bVar.f();
                        o.X.b(bVar, (f.h.f.p) arrayList.get(i2));
                        this.b.b(bVar, arrayList2.get(i2));
                        bVar.p();
                        i2++;
                    }
                    bVar.p();
                    return;
                }
                bVar.g();
                int size2 = arrayList.size();
                while (i2 < size2) {
                    f.h.f.p pVar = (f.h.f.p) arrayList.get(i2);
                    Objects.requireNonNull(pVar);
                    if (pVar instanceof f.h.f.s) {
                        f.h.f.s b = pVar.b();
                        Object obj2 = b.a;
                        if (obj2 instanceof Number) {
                            str = String.valueOf(b.e());
                        } else if (obj2 instanceof Boolean) {
                            str = Boolean.toString(b.d());
                        } else if (obj2 instanceof String) {
                            str = b.c();
                        } else {
                            throw new AssertionError();
                        }
                    } else if (!(pVar instanceof f.h.f.q)) {
                        throw new AssertionError();
                    } else {
                        str = "null";
                    }
                    bVar.v(str);
                    this.b.b(bVar, arrayList2.get(i2));
                    i2++;
                }
                bVar.q();
            }
        }
    }

    public g(f.h.f.z.g gVar, boolean z) {
        this.f6277f = gVar;
        this.f6278g = z;
    }

    @Override // f.h.f.x
    public <T> w<T> a(f.h.f.j jVar, f.h.f.a0.a<T> aVar) {
        Type[] actualTypeArguments;
        w<Boolean> wVar;
        Type type = aVar.b;
        if (Map.class.isAssignableFrom(aVar.a)) {
            Class<?> e2 = f.h.f.z.a.e(type);
            if (type == Properties.class) {
                actualTypeArguments = new Type[]{String.class, String.class};
            } else {
                Type f2 = f.h.f.z.a.f(type, e2, Map.class);
                actualTypeArguments = f2 instanceof ParameterizedType ? ((ParameterizedType) f2).getActualTypeArguments() : new Type[]{Object.class, Object.class};
            }
            Type type2 = actualTypeArguments[0];
            if (type2 != Boolean.TYPE && type2 != Boolean.class) {
                wVar = jVar.e(new f.h.f.a0.a<>(type2));
            } else {
                wVar = o.f6302f;
            }
            return new a(jVar, actualTypeArguments[0], wVar, actualTypeArguments[1], jVar.e(new f.h.f.a0.a<>(actualTypeArguments[1])), this.f6277f.a(aVar));
        }
        return null;
    }
}
