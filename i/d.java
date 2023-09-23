package i;

import i.l.b.i;
import java.io.Serializable;

/* compiled from: Tuples.kt */
/* loaded from: classes2.dex */
public final class d<A, B> implements Serializable {

    /* renamed from: f  reason: collision with root package name */
    public final A f8606f;

    /* renamed from: g  reason: collision with root package name */
    public final B f8607g;

    public d(A a, B b) {
        this.f8606f = a;
        this.f8607g = b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            return i.a(this.f8606f, dVar.f8606f) && i.a(this.f8607g, dVar.f8607g);
        }
        return false;
    }

    public int hashCode() {
        A a = this.f8606f;
        int hashCode = (a == null ? 0 : a.hashCode()) * 31;
        B b = this.f8607g;
        return hashCode + (b != null ? b.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.f8606f + ", " + this.f8607g + ')';
    }
}
