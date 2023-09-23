package j.a;

import i.j.e;
import i.j.f;

/* compiled from: CoroutineDispatcher.kt */
/* loaded from: classes2.dex */
public abstract class z extends i.j.a implements i.j.e {

    /* renamed from: f  reason: collision with root package name */
    public static final a f8826f = new a(null);

    /* compiled from: CoroutineDispatcher.kt */
    /* loaded from: classes2.dex */
    public static final class a extends i.j.b<i.j.e, z> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i.l.b.e eVar) {
            super(e.a.f8621f, y.f8801g);
            int i2 = i.j.e.c;
        }
    }

    public z() {
        super(e.a.f8621f);
    }

    public abstract void d0(i.j.f fVar, Runnable runnable);

    @Override // i.j.e
    public final void f(i.j.d<?> dVar) {
        ((j.a.y1.e) dVar).m();
    }

    @Override // i.j.e
    public final <T> i.j.d<T> g(i.j.d<? super T> dVar) {
        return new j.a.y1.e(this, dVar);
    }

    public boolean g0(i.j.f fVar) {
        return true;
    }

    @Override // i.j.a, i.j.f.a, i.j.f
    public <E extends f.a> E get(f.b<E> bVar) {
        i.l.b.i.e(bVar, "key");
        if (bVar instanceof i.j.b) {
            i.j.b bVar2 = (i.j.b) bVar;
            f.b<?> key = getKey();
            i.l.b.i.e(key, "key");
            if (key == bVar2 || bVar2.f8617g == key) {
                i.l.b.i.e(this, "element");
                E e2 = (E) bVar2.f8616f.b(this);
                if (e2 instanceof f.a) {
                    return e2;
                }
                return null;
            }
            return null;
        } else if (e.a.f8621f == bVar) {
            i.l.b.i.c(this, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
            return this;
        } else {
            return null;
        }
    }

    @Override // i.j.a, i.j.f
    public i.j.f minusKey(f.b<?> bVar) {
        i.l.b.i.e(bVar, "key");
        if (bVar instanceof i.j.b) {
            i.j.b bVar2 = (i.j.b) bVar;
            f.b<?> key = getKey();
            i.l.b.i.e(key, "key");
            if ((key == bVar2 || bVar2.f8617g == key) && bVar2.a(this) != null) {
                return i.j.h.f8623f;
            }
        } else if (e.a.f8621f == bVar) {
            return i.j.h.f8623f;
        }
        return this;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + e0.b(this);
    }
}
