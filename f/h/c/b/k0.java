package f.h.c.b;

import java.io.Serializable;
import java.util.Objects;

/* compiled from: NaturalOrdering.java */
/* loaded from: classes.dex */
public final class k0 extends l0<Comparable<?>> implements Serializable {

    /* renamed from: f  reason: collision with root package name */
    public static final k0 f5951f = new k0();

    @Override // f.h.c.b.l0
    public <S extends Comparable<?>> l0<S> b() {
        return p0.f5980f;
    }

    @Override // f.h.c.b.l0, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        Objects.requireNonNull(comparable);
        Objects.requireNonNull(comparable2);
        return comparable.compareTo(comparable2);
    }

    public String toString() {
        return "Ordering.natural()";
    }
}
