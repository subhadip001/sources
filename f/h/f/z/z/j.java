package f.h.f.z.z;

import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonToken;
import f.h.f.w;
import f.h.f.x;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

/* compiled from: ReflectiveTypeAdapterFactory.java */
/* loaded from: classes2.dex */
public final class j implements x {

    /* renamed from: f  reason: collision with root package name */
    public final f.h.f.z.g f6286f;

    /* renamed from: g  reason: collision with root package name */
    public final f.h.f.d f6287g;

    /* renamed from: h  reason: collision with root package name */
    public final f.h.f.z.o f6288h;

    /* renamed from: i  reason: collision with root package name */
    public final d f6289i;

    /* renamed from: j  reason: collision with root package name */
    public final f.h.f.z.a0.b f6290j = f.h.f.z.a0.b.a;

    /* compiled from: ReflectiveTypeAdapterFactory.java */
    /* loaded from: classes2.dex */
    public static final class a<T> extends w<T> {
        public final f.h.f.z.t<T> a;
        public final Map<String, b> b;

        public a(f.h.f.z.t<T> tVar, Map<String, b> map) {
            this.a = tVar;
            this.b = map;
        }

        @Override // f.h.f.w
        public T a(f.h.f.b0.a aVar) {
            if (aVar.s0() == JsonToken.NULL) {
                aVar.i0();
                return null;
            }
            T a = this.a.a();
            try {
                aVar.f();
                while (aVar.F()) {
                    b bVar = this.b.get(aVar.d0());
                    if (bVar != null && bVar.c) {
                        bVar.a(aVar, a);
                    }
                    aVar.x0();
                }
                aVar.q();
                return a;
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (IllegalStateException e3) {
                throw new JsonSyntaxException(e3);
            }
        }

        @Override // f.h.f.w
        public void b(f.h.f.b0.b bVar, T t) {
            if (t == null) {
                bVar.F();
                return;
            }
            bVar.g();
            try {
                for (b bVar2 : this.b.values()) {
                    if (bVar2.c(t)) {
                        bVar.v(bVar2.a);
                        bVar2.b(bVar, t);
                    }
                }
                bVar.q();
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    /* compiled from: ReflectiveTypeAdapterFactory.java */
    /* loaded from: classes2.dex */
    public static abstract class b {
        public final String a;
        public final boolean b;
        public final boolean c;

        public b(String str, boolean z, boolean z2) {
            this.a = str;
            this.b = z;
            this.c = z2;
        }

        public abstract void a(f.h.f.b0.a aVar, Object obj);

        public abstract void b(f.h.f.b0.b bVar, Object obj);

        public abstract boolean c(Object obj);
    }

    public j(f.h.f.z.g gVar, f.h.f.d dVar, f.h.f.z.o oVar, d dVar2) {
        this.f6286f = gVar;
        this.f6287g = dVar;
        this.f6288h = oVar;
        this.f6289i = dVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x019e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0184 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.List] */
    @Override // f.h.f.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <T> f.h.f.w<T> a(f.h.f.j r35, f.h.f.a0.a<T> r36) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.f.z.z.j.a(f.h.f.j, f.h.f.a0.a):f.h.f.w");
    }

    public boolean b(Field field, boolean z) {
        boolean z2;
        f.h.f.z.o oVar = this.f6288h;
        Class<?> type = field.getType();
        if (!(oVar.c(type) || oVar.b(type, z))) {
            if ((field.getModifiers() & 136) != 0 || field.isSynthetic() || oVar.c(field.getType())) {
                z2 = true;
                break;
            }
            List<f.h.f.b> list = z ? oVar.f6247f : oVar.f6248g;
            if (!list.isEmpty()) {
                f.h.f.c cVar = new f.h.f.c(field);
                for (f.h.f.b bVar : list) {
                    if (bVar.a(cVar)) {
                        z2 = true;
                        break;
                    }
                }
            }
            z2 = false;
            if (!z2) {
                return true;
            }
        }
        return false;
    }
}
