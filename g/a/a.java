package g.a;

import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Map;

/* compiled from: Attributes.java */
/* loaded from: classes2.dex */
public final class a {
    public static final IdentityHashMap<c<?>, Object> b;
    public static final a c;
    public final IdentityHashMap<c<?>, Object> a;

    /* compiled from: Attributes.java */
    /* loaded from: classes2.dex */
    public static final class b {
        public a a;
        public IdentityHashMap<c<?>, Object> b;

        public b(a aVar, C0193a c0193a) {
            this.a = aVar;
        }

        public a a() {
            if (this.b != null) {
                for (Map.Entry<c<?>, Object> entry : this.a.a.entrySet()) {
                    if (!this.b.containsKey(entry.getKey())) {
                        this.b.put(entry.getKey(), entry.getValue());
                    }
                }
                this.a = new a(this.b, null);
                this.b = null;
            }
            return this.a;
        }

        public <T> b b(c<T> cVar, T t) {
            if (this.b == null) {
                this.b = new IdentityHashMap<>(1);
            }
            this.b.put(cVar, t);
            return this;
        }
    }

    /* compiled from: Attributes.java */
    /* loaded from: classes2.dex */
    public static final class c<T> {
        public final String a;

        public c(String str) {
            this.a = str;
        }

        public String toString() {
            return this.a;
        }
    }

    static {
        IdentityHashMap<c<?>, Object> identityHashMap = new IdentityHashMap<>();
        b = identityHashMap;
        c = new a(identityHashMap);
    }

    public a(IdentityHashMap<c<?>, Object> identityHashMap) {
        this.a = identityHashMap;
    }

    public <T> T a(c<T> cVar) {
        return (T) this.a.get(cVar);
    }

    public b b() {
        return new b(this, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            r1 = 0
            if (r7 == 0) goto L5a
            java.lang.Class<g.a.a> r2 = g.a.a.class
            java.lang.Class r3 = r7.getClass()
            if (r2 == r3) goto L10
            goto L5a
        L10:
            g.a.a r7 = (g.a.a) r7
            java.util.IdentityHashMap<g.a.a$c<?>, java.lang.Object> r2 = r6.a
            int r2 = r2.size()
            java.util.IdentityHashMap<g.a.a$c<?>, java.lang.Object> r3 = r7.a
            int r3 = r3.size()
            if (r2 == r3) goto L21
            return r1
        L21:
            java.util.IdentityHashMap<g.a.a$c<?>, java.lang.Object> r2 = r6.a
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L2b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L59
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.util.IdentityHashMap<g.a.a$c<?>, java.lang.Object> r4 = r7.a
            java.lang.Object r5 = r3.getKey()
            boolean r4 = r4.containsKey(r5)
            if (r4 != 0) goto L44
            return r1
        L44:
            java.lang.Object r4 = r3.getValue()
            java.util.IdentityHashMap<g.a.a$c<?>, java.lang.Object> r5 = r7.a
            java.lang.Object r3 = r3.getKey()
            java.lang.Object r3 = r5.get(r3)
            boolean r3 = f.h.b.c.a.i0(r4, r3)
            if (r3 != 0) goto L2b
            return r1
        L59:
            return r0
        L5a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g.a.a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i2 = 0;
        for (Map.Entry<c<?>, Object> entry : this.a.entrySet()) {
            i2 += Arrays.hashCode(new Object[]{entry.getKey(), entry.getValue()});
        }
        return i2;
    }

    public String toString() {
        return this.a.toString();
    }

    public a(IdentityHashMap identityHashMap, C0193a c0193a) {
        this.a = identityHashMap;
    }
}
