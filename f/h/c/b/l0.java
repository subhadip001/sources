package f.h.c.b;

import java.util.Comparator;

/* compiled from: Ordering.java */
/* loaded from: classes.dex */
public abstract class l0<T> implements Comparator<T> {
    public static <T> l0<T> a(Comparator<T> comparator) {
        if (comparator instanceof l0) {
            return (l0) comparator;
        }
        return new l(comparator);
    }

    public <S extends T> l0<S> b() {
        return new q0(this);
    }

    @Override // java.util.Comparator
    public abstract int compare(T t, T t2);
}
