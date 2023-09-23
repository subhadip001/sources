package f.h.c.b;

import java.io.Serializable;

/* compiled from: ReverseOrdering.java */
/* loaded from: classes.dex */
public final class q0<T> extends l0<T> implements Serializable {

    /* renamed from: f  reason: collision with root package name */
    public final l0<? super T> f5986f;

    public q0(l0<? super T> l0Var) {
        this.f5986f = l0Var;
    }

    @Override // f.h.c.b.l0
    public <S extends T> l0<S> b() {
        return (l0<? super T>) this.f5986f;
    }

    @Override // f.h.c.b.l0, java.util.Comparator
    public int compare(T t, T t2) {
        return this.f5986f.compare(t2, t);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q0) {
            return this.f5986f.equals(((q0) obj).f5986f);
        }
        return false;
    }

    public int hashCode() {
        return -this.f5986f.hashCode();
    }

    public String toString() {
        String valueOf = String.valueOf(this.f5986f);
        StringBuilder sb = new StringBuilder(valueOf.length() + 10);
        sb.append(valueOf);
        sb.append(".reverse()");
        return sb.toString();
    }
}
