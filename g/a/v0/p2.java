package g.a.v0;

import g.a.v0.n2;

/* compiled from: SharedResourcePool.java */
/* loaded from: classes2.dex */
public final class p2<T> implements y1<T> {
    public final n2.c<T> a;

    public p2(n2.c<T> cVar) {
        this.a = cVar;
    }

    @Override // g.a.v0.y1
    public T a() {
        return (T) n2.a(this.a);
    }

    @Override // g.a.v0.y1
    public T b(Object obj) {
        n2.b(this.a, obj);
        return null;
    }
}
