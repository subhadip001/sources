package i;

import i.l.b.i;
import java.io.Serializable;

/* compiled from: LazyJVM.kt */
/* loaded from: classes2.dex */
public final class f<T> implements c<T>, Serializable {

    /* renamed from: f  reason: collision with root package name */
    public i.l.a.a<? extends T> f8609f;

    /* renamed from: g  reason: collision with root package name */
    public volatile Object f8610g;

    /* renamed from: h  reason: collision with root package name */
    public final Object f8611h;

    public f(i.l.a.a aVar, Object obj, int i2) {
        int i3 = i2 & 2;
        i.e(aVar, "initializer");
        this.f8609f = aVar;
        this.f8610g = g.a;
        this.f8611h = this;
    }

    @Override // i.c
    public T getValue() {
        T t;
        T t2 = (T) this.f8610g;
        g gVar = g.a;
        if (t2 != gVar) {
            return t2;
        }
        synchronized (this.f8611h) {
            t = (T) this.f8610g;
            if (t == gVar) {
                i.l.a.a<? extends T> aVar = this.f8609f;
                i.b(aVar);
                t = aVar.c();
                this.f8610g = t;
                this.f8609f = null;
            }
        }
        return t;
    }

    public String toString() {
        return this.f8610g != g.a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
