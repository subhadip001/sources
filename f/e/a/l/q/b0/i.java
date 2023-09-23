package f.e.a.l.q.b0;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Objects;
import java.util.TreeMap;

/* compiled from: LruArrayPool.java */
/* loaded from: classes.dex */
public final class i implements f.e.a.l.q.b0.b {
    public final g<a, Object> a = new g<>();
    public final b b = new b();
    public final Map<Class<?>, NavigableMap<Integer, Integer>> c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final Map<Class<?>, f.e.a.l.q.b0.a<?>> f3277d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final int f3278e;

    /* renamed from: f  reason: collision with root package name */
    public int f3279f;

    /* compiled from: LruArrayPool.java */
    /* loaded from: classes.dex */
    public static final class a implements l {
        public final b a;
        public int b;
        public Class<?> c;

        public a(b bVar) {
            this.a = bVar;
        }

        @Override // f.e.a.l.q.b0.l
        public void a() {
            this.a.c(this);
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.b == aVar.b && this.c == aVar.c;
            }
            return false;
        }

        public int hashCode() {
            int i2 = this.b * 31;
            Class<?> cls = this.c;
            return i2 + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            StringBuilder A = f.a.b.a.a.A("Key{size=");
            A.append(this.b);
            A.append("array=");
            A.append(this.c);
            A.append('}');
            return A.toString();
        }
    }

    /* compiled from: LruArrayPool.java */
    /* loaded from: classes.dex */
    public static final class b extends c<a> {
        @Override // f.e.a.l.q.b0.c
        public a a() {
            return new a(this);
        }

        public a d(int i2, Class<?> cls) {
            a b = b();
            b.b = i2;
            b.c = cls;
            return b;
        }
    }

    public i(int i2) {
        this.f3278e = i2;
    }

    @Override // f.e.a.l.q.b0.b
    public synchronized void a(int i2) {
        if (i2 >= 40) {
            synchronized (this) {
                g(0);
            }
        } else if (i2 >= 20 || i2 == 15) {
            g(this.f3278e / 2);
        }
    }

    @Override // f.e.a.l.q.b0.b
    public synchronized void b() {
        g(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f.e.a.l.q.b0.b
    public synchronized <T> T c(int i2, Class<T> cls) {
        a b2;
        b2 = this.b.b();
        b2.b = i2;
        b2.c = cls;
        return (T) i(b2, cls);
    }

    @Override // f.e.a.l.q.b0.b
    public synchronized <T> void d(T t) {
        Class<?> cls = t.getClass();
        f.e.a.l.q.b0.a<T> h2 = h(cls);
        int c = h2.c(t);
        int b2 = h2.b() * c;
        int i2 = 1;
        if (b2 <= this.f3278e / 2) {
            a d2 = this.b.d(c, cls);
            this.a.b(d2, t);
            NavigableMap<Integer, Integer> j2 = j(cls);
            Integer num = (Integer) j2.get(Integer.valueOf(d2.b));
            Integer valueOf = Integer.valueOf(d2.b);
            if (num != null) {
                i2 = 1 + num.intValue();
            }
            j2.put(valueOf, Integer.valueOf(i2));
            this.f3279f += b2;
            g(this.f3278e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0023 A[Catch: all -> 0x004d, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0013, B:7:0x0017, B:13:0x0023, B:18:0x002f, B:20:0x0047, B:19:0x003a), top: B:26:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f A[Catch: all -> 0x004d, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0013, B:7:0x0017, B:13:0x0023, B:18:0x002f, B:20:0x0047, B:19:0x003a), top: B:26:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a A[Catch: all -> 0x004d, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0013, B:7:0x0017, B:13:0x0023, B:18:0x002f, B:20:0x0047, B:19:0x003a), top: B:26:0x0001 }] */
    @Override // f.e.a.l.q.b0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized <T> T e(int r6, java.lang.Class<T> r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.util.NavigableMap r0 = r5.j(r7)     // Catch: java.lang.Throwable -> L4d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r0 = r0.ceilingKey(r1)     // Catch: java.lang.Throwable -> L4d
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L4d
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L2c
            int r3 = r5.f3279f     // Catch: java.lang.Throwable -> L4d
            if (r3 == 0) goto L20
            int r4 = r5.f3278e     // Catch: java.lang.Throwable -> L4d
            int r4 = r4 / r3
            r3 = 2
            if (r4 < r3) goto L1e
            goto L20
        L1e:
            r3 = 0
            goto L21
        L20:
            r3 = 1
        L21:
            if (r3 != 0) goto L2d
            int r3 = r0.intValue()     // Catch: java.lang.Throwable -> L4d
            int r4 = r6 * 8
            if (r3 > r4) goto L2c
            goto L2d
        L2c:
            r1 = 0
        L2d:
            if (r1 == 0) goto L3a
            f.e.a.l.q.b0.i$b r6 = r5.b     // Catch: java.lang.Throwable -> L4d
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L4d
            f.e.a.l.q.b0.i$a r6 = r6.d(r0, r7)     // Catch: java.lang.Throwable -> L4d
            goto L47
        L3a:
            f.e.a.l.q.b0.i$b r0 = r5.b     // Catch: java.lang.Throwable -> L4d
            f.e.a.l.q.b0.l r0 = r0.b()     // Catch: java.lang.Throwable -> L4d
            f.e.a.l.q.b0.i$a r0 = (f.e.a.l.q.b0.i.a) r0     // Catch: java.lang.Throwable -> L4d
            r0.b = r6     // Catch: java.lang.Throwable -> L4d
            r0.c = r7     // Catch: java.lang.Throwable -> L4d
            r6 = r0
        L47:
            java.lang.Object r6 = r5.i(r6, r7)     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r5)
            return r6
        L4d:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: f.e.a.l.q.b0.i.e(int, java.lang.Class):java.lang.Object");
    }

    public final void f(int i2, Class<?> cls) {
        NavigableMap<Integer, Integer> j2 = j(cls);
        Integer num = (Integer) j2.get(Integer.valueOf(i2));
        if (num != null) {
            if (num.intValue() == 1) {
                j2.remove(Integer.valueOf(i2));
                return;
            } else {
                j2.put(Integer.valueOf(i2), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i2 + ", this: " + this);
    }

    public final void g(int i2) {
        while (this.f3279f > i2) {
            Object c = this.a.c();
            Objects.requireNonNull(c, "Argument must not be null");
            f.e.a.l.q.b0.a h2 = h(c.getClass());
            this.f3279f -= h2.b() * h2.c(c);
            f(h2.c(c), c.getClass());
            if (Log.isLoggable(h2.a(), 2)) {
                String a2 = h2.a();
                StringBuilder A = f.a.b.a.a.A("evicted: ");
                A.append(h2.c(c));
                Log.v(a2, A.toString());
            }
        }
    }

    public final <T> f.e.a.l.q.b0.a<T> h(Class<T> cls) {
        h hVar = (f.e.a.l.q.b0.a<T>) this.f3277d.get(cls);
        if (hVar == null) {
            if (cls.equals(int[].class)) {
                hVar = new h();
            } else if (cls.equals(byte[].class)) {
                hVar = new f();
            } else {
                StringBuilder A = f.a.b.a.a.A("No array pool found for: ");
                A.append(cls.getSimpleName());
                throw new IllegalArgumentException(A.toString());
            }
            this.f3277d.put(cls, hVar);
        }
        return hVar;
    }

    public final <T> T i(a aVar, Class<T> cls) {
        f.e.a.l.q.b0.a<T> h2 = h(cls);
        T t = (T) this.a.a(aVar);
        if (t != null) {
            this.f3279f -= h2.b() * h2.c(t);
            f(h2.c(t), cls);
        }
        if (t == null) {
            if (Log.isLoggable(h2.a(), 2)) {
                String a2 = h2.a();
                StringBuilder A = f.a.b.a.a.A("Allocated ");
                A.append(aVar.b);
                A.append(" bytes");
                Log.v(a2, A.toString());
            }
            return h2.newArray(aVar.b);
        }
        return t;
    }

    public final NavigableMap<Integer, Integer> j(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.c.get(cls);
        if (navigableMap == null) {
            TreeMap treeMap = new TreeMap();
            this.c.put(cls, treeMap);
            return treeMap;
        }
        return navigableMap;
    }
}
