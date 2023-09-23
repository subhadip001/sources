package f.h.c.a;

import java.io.Serializable;

/* compiled from: Equivalence.java */
/* loaded from: classes.dex */
public abstract class e<T> {

    /* compiled from: Equivalence.java */
    /* loaded from: classes.dex */
    public static final class a extends e<Object> implements Serializable {

        /* renamed from: f  reason: collision with root package name */
        public static final a f5841f = new a();

        @Override // f.h.c.a.e
        public boolean a(Object obj, Object obj2) {
            return obj.equals(obj2);
        }

        @Override // f.h.c.a.e
        public int b(Object obj) {
            return obj.hashCode();
        }
    }

    /* compiled from: Equivalence.java */
    /* loaded from: classes.dex */
    public static final class b extends e<Object> implements Serializable {

        /* renamed from: f  reason: collision with root package name */
        public static final b f5842f = new b();

        @Override // f.h.c.a.e
        public boolean a(Object obj, Object obj2) {
            return false;
        }

        @Override // f.h.c.a.e
        public int b(Object obj) {
            return System.identityHashCode(obj);
        }
    }

    public abstract boolean a(T t, T t2);

    public abstract int b(T t);

    public final boolean c(T t, T t2) {
        if (t == t2) {
            return true;
        }
        if (t == null || t2 == null) {
            return false;
        }
        return a(t, t2);
    }
}
