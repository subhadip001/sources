package f.h.c.b;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Objects;

/* compiled from: ComparatorOrdering.java */
/* loaded from: classes.dex */
public final class l<T> extends l0<T> implements Serializable {

    /* renamed from: f  reason: collision with root package name */
    public final Comparator<T> f5952f;

    public l(Comparator<T> comparator) {
        Objects.requireNonNull(comparator);
        this.f5952f = comparator;
    }

    @Override // f.h.c.b.l0, java.util.Comparator
    public int compare(T t, T t2) {
        return this.f5952f.compare(t, t2);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            return this.f5952f.equals(((l) obj).f5952f);
        }
        return false;
    }

    public int hashCode() {
        return this.f5952f.hashCode();
    }

    public String toString() {
        return this.f5952f.toString();
    }
}
