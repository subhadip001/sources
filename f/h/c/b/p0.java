package f.h.c.b;

import java.io.Serializable;
import java.util.Objects;

/* compiled from: ReverseNaturalOrdering.java */
/* loaded from: classes.dex */
public final class p0 extends l0<Comparable<?>> implements Serializable {

    /* renamed from: f  reason: collision with root package name */
    public static final p0 f5980f = new p0();

    @Override // f.h.c.b.l0
    public <S extends Comparable<?>> l0<S> b() {
        return k0.f5951f;
    }

    @Override // f.h.c.b.l0, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        Objects.requireNonNull(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }
}
