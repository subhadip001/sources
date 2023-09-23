package f.e.a.r;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: LruCache.java */
/* loaded from: classes.dex */
public class i<T, Y> {
    public final Map<T, a<Y>> a = new LinkedHashMap(100, 0.75f, true);
    public long b;
    public long c;

    /* compiled from: LruCache.java */
    /* loaded from: classes.dex */
    public static final class a<Y> {
        public final Y a;
        public final int b;

        public a(Y y, int i2) {
            this.a = y;
            this.b = i2;
        }
    }

    public i(long j2) {
        this.b = j2;
    }

    public synchronized Y a(T t) {
        a<Y> aVar;
        aVar = this.a.get(t);
        return aVar != null ? aVar.a : null;
    }

    public int b(Y y) {
        return 1;
    }

    public void c(T t, Y y) {
    }

    public synchronized Y d(T t, Y y) {
        int b = b(y);
        long j2 = b;
        if (j2 >= this.b) {
            c(t, y);
            return null;
        }
        if (y != null) {
            this.c += j2;
        }
        a<Y> put = this.a.put(t, y == null ? null : new a<>(y, b));
        if (put != null) {
            this.c -= put.b;
            if (!put.a.equals(y)) {
                c(t, put.a);
            }
        }
        e(this.b);
        return put != null ? put.a : null;
    }

    public synchronized void e(long j2) {
        while (this.c > j2) {
            Iterator<Map.Entry<T, a<Y>>> it = this.a.entrySet().iterator();
            Map.Entry<T, a<Y>> next = it.next();
            a<Y> value = next.getValue();
            this.c -= value.b;
            T key = next.getKey();
            it.remove();
            c(key, value.a);
        }
    }
}
