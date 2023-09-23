package f.h.c.b;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: RegularImmutableMap.java */
/* loaded from: classes.dex */
public final class n0<K, V> extends s<K, V> {

    /* renamed from: l  reason: collision with root package name */
    public static final s<Object, Object> f5958l = new n0(null, new Object[0], 0);

    /* renamed from: i  reason: collision with root package name */
    public final transient Object f5959i;

    /* renamed from: j  reason: collision with root package name */
    public final transient Object[] f5960j;

    /* renamed from: k  reason: collision with root package name */
    public final transient int f5961k;

    /* compiled from: RegularImmutableMap.java */
    /* loaded from: classes.dex */
    public static class a<K, V> extends v<Map.Entry<K, V>> {

        /* renamed from: i  reason: collision with root package name */
        public final transient s<K, V> f5962i;

        /* renamed from: j  reason: collision with root package name */
        public final transient Object[] f5963j;

        /* renamed from: k  reason: collision with root package name */
        public final transient int f5964k;

        /* renamed from: l  reason: collision with root package name */
        public final transient int f5965l;

        /* compiled from: RegularImmutableMap.java */
        /* renamed from: f.h.c.b.n0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0135a extends q<Map.Entry<K, V>> {
            public C0135a() {
            }

            @Override // java.util.List
            public Object get(int i2) {
                f.h.b.c.a.t(i2, a.this.f5965l);
                a aVar = a.this;
                int i3 = i2 * 2;
                Object obj = aVar.f5963j[aVar.f5964k + i3];
                Objects.requireNonNull(obj);
                a aVar2 = a.this;
                Object obj2 = aVar2.f5963j[i3 + (aVar2.f5964k ^ 1)];
                Objects.requireNonNull(obj2);
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }

            @Override // f.h.c.b.o
            public boolean h() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return a.this.f5965l;
            }
        }

        public a(s<K, V> sVar, Object[] objArr, int i2, int i3) {
            this.f5962i = sVar;
            this.f5963j = objArr;
            this.f5964k = i2;
            this.f5965l = i3;
        }

        @Override // f.h.c.b.o
        public int b(Object[] objArr, int i2) {
            return a().b(objArr, i2);
        }

        @Override // f.h.c.b.o, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                return value != null && value.equals(this.f5962i.get(key));
            }
            return false;
        }

        @Override // f.h.c.b.o
        public boolean h() {
            return true;
        }

        @Override // f.h.c.b.v, f.h.c.b.o, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: i */
        public u0<Map.Entry<K, V>> iterator() {
            return a().listIterator();
        }

        @Override // f.h.c.b.v
        public q<Map.Entry<K, V>> m() {
            return new C0135a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f5965l;
        }
    }

    /* compiled from: RegularImmutableMap.java */
    /* loaded from: classes.dex */
    public static final class b<K> extends v<K> {

        /* renamed from: i  reason: collision with root package name */
        public final transient s<K, ?> f5967i;

        /* renamed from: j  reason: collision with root package name */
        public final transient q<K> f5968j;

        public b(s<K, ?> sVar, q<K> qVar) {
            this.f5967i = sVar;
            this.f5968j = qVar;
        }

        @Override // f.h.c.b.v, f.h.c.b.o
        public q<K> a() {
            return this.f5968j;
        }

        @Override // f.h.c.b.o
        public int b(Object[] objArr, int i2) {
            return this.f5968j.b(objArr, i2);
        }

        @Override // f.h.c.b.o, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f5967i.get(obj) != null;
        }

        @Override // f.h.c.b.o
        public boolean h() {
            return true;
        }

        @Override // f.h.c.b.v, f.h.c.b.o, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: i */
        public u0<K> iterator() {
            return this.f5968j.listIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f5967i.size();
        }
    }

    /* compiled from: RegularImmutableMap.java */
    /* loaded from: classes.dex */
    public static final class c extends q<Object> {

        /* renamed from: h  reason: collision with root package name */
        public final transient Object[] f5969h;

        /* renamed from: i  reason: collision with root package name */
        public final transient int f5970i;

        /* renamed from: j  reason: collision with root package name */
        public final transient int f5971j;

        public c(Object[] objArr, int i2, int i3) {
            this.f5969h = objArr;
            this.f5970i = i2;
            this.f5971j = i3;
        }

        @Override // java.util.List
        public Object get(int i2) {
            f.h.b.c.a.t(i2, this.f5971j);
            Object obj = this.f5969h[(i2 * 2) + this.f5970i];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // f.h.c.b.o
        public boolean h() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f5971j;
        }
    }

    public n0(Object obj, Object[] objArr, int i2) {
        this.f5959i = obj;
        this.f5960j = objArr;
        this.f5961k = i2;
    }

    @Override // f.h.c.b.s
    public v<Map.Entry<K, V>> b() {
        return new a(this, this.f5960j, 0, this.f5961k);
    }

    @Override // f.h.c.b.s
    public v<K> c() {
        return new b(this, new c(this.f5960j, 0, this.f5961k));
    }

    @Override // f.h.c.b.s
    public o<V> d() {
        return new c(this.f5960j, 1, this.f5961k);
    }

    @Override // f.h.c.b.s
    public boolean e() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009f A[RETURN] */
    @Override // f.h.c.b.s, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public V get(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f5959i
            java.lang.Object[] r1 = r9.f5960j
            int r2 = r9.f5961k
            r3 = 0
            if (r10 != 0) goto La
            goto L20
        La:
            r4 = 1
            if (r2 != r4) goto L23
            r0 = 0
            r0 = r1[r0]
            java.util.Objects.requireNonNull(r0)
            boolean r10 = r0.equals(r10)
            if (r10 == 0) goto L20
            r10 = r1[r4]
            java.util.Objects.requireNonNull(r10)
            goto L9c
        L20:
            r10 = r3
            goto L9c
        L23:
            if (r0 != 0) goto L26
            goto L20
        L26:
            boolean r2 = r0 instanceof byte[]
            r5 = -1
            if (r2 == 0) goto L52
            r2 = r0
            byte[] r2 = (byte[]) r2
            int r0 = r2.length
            int r6 = r0 + (-1)
            int r0 = r10.hashCode()
            int r0 = f.h.b.c.a.X0(r0)
        L39:
            r0 = r0 & r6
            r5 = r2[r0]
            r7 = 255(0xff, float:3.57E-43)
            r5 = r5 & r7
            if (r5 != r7) goto L42
            goto L20
        L42:
            r7 = r1[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L4f
            r10 = r5 ^ 1
            r10 = r1[r10]
            goto L9c
        L4f:
            int r0 = r0 + 1
            goto L39
        L52:
            boolean r2 = r0 instanceof short[]
            if (r2 == 0) goto L7e
            r2 = r0
            short[] r2 = (short[]) r2
            int r0 = r2.length
            int r6 = r0 + (-1)
            int r0 = r10.hashCode()
            int r0 = f.h.b.c.a.X0(r0)
        L64:
            r0 = r0 & r6
            short r5 = r2[r0]
            r7 = 65535(0xffff, float:9.1834E-41)
            r5 = r5 & r7
            if (r5 != r7) goto L6e
            goto L20
        L6e:
            r7 = r1[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L7b
            r10 = r5 ^ 1
            r10 = r1[r10]
            goto L9c
        L7b:
            int r0 = r0 + 1
            goto L64
        L7e:
            int[] r0 = (int[]) r0
            int r2 = r0.length
            int r2 = r2 - r4
            int r6 = r10.hashCode()
            int r6 = f.h.b.c.a.X0(r6)
        L8a:
            r6 = r6 & r2
            r7 = r0[r6]
            if (r7 != r5) goto L90
            goto L20
        L90:
            r8 = r1[r7]
            boolean r8 = r10.equals(r8)
            if (r8 == 0) goto La0
            r10 = r7 ^ 1
            r10 = r1[r10]
        L9c:
            if (r10 != 0) goto L9f
            return r3
        L9f:
            return r10
        La0:
            int r6 = r6 + 1
            goto L8a
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.c.b.n0.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public int size() {
        return this.f5961k;
    }
}
