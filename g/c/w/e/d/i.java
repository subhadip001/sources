package g.c.w.e.d;

import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: ObservableFromIterable.java */
/* loaded from: classes2.dex */
public final class i<T> extends g.c.l<T> {

    /* renamed from: f  reason: collision with root package name */
    public final Iterable<? extends T> f8459f;

    /* compiled from: ObservableFromIterable.java */
    /* loaded from: classes2.dex */
    public static final class a<T> extends g.c.w.d.c<T> {

        /* renamed from: f  reason: collision with root package name */
        public final g.c.n<? super T> f8460f;

        /* renamed from: g  reason: collision with root package name */
        public final Iterator<? extends T> f8461g;

        /* renamed from: h  reason: collision with root package name */
        public volatile boolean f8462h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f8463i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f8464j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f8465k;

        public a(g.c.n<? super T> nVar, Iterator<? extends T> it) {
            this.f8460f = nVar;
            this.f8461g = it;
        }

        @Override // g.c.w.c.j
        public void clear() {
            this.f8464j = true;
        }

        @Override // g.c.t.b
        public void dispose() {
            this.f8462h = true;
        }

        @Override // g.c.w.c.j
        public boolean isEmpty() {
            return this.f8464j;
        }

        @Override // g.c.w.c.j
        public T poll() {
            if (this.f8464j) {
                return null;
            }
            if (this.f8465k) {
                if (!this.f8461g.hasNext()) {
                    this.f8464j = true;
                    return null;
                }
            } else {
                this.f8465k = true;
            }
            T next = this.f8461g.next();
            Objects.requireNonNull(next, "The iterator returned a null value");
            return next;
        }

        @Override // g.c.w.c.f
        public int requestFusion(int i2) {
            if ((i2 & 1) != 0) {
                this.f8463i = true;
                return 1;
            }
            return 0;
        }
    }

    public i(Iterable<? extends T> iterable) {
        this.f8459f = iterable;
    }

    @Override // g.c.l
    public void b(g.c.n<? super T> nVar) {
        try {
            Iterator<? extends T> it = this.f8459f.iterator();
            try {
                if (!it.hasNext()) {
                    EmptyDisposable.complete(nVar);
                    return;
                }
                a aVar = new a(nVar, it);
                nVar.onSubscribe(aVar);
                if (aVar.f8463i) {
                    return;
                }
                while (!aVar.f8462h) {
                    try {
                        T next = aVar.f8461g.next();
                        Objects.requireNonNull(next, "The iterator returned a null value");
                        aVar.f8460f.onNext(next);
                        if (aVar.f8462h) {
                            return;
                        }
                        try {
                            if (!aVar.f8461g.hasNext()) {
                                if (aVar.f8462h) {
                                    return;
                                }
                                aVar.f8460f.onComplete();
                                return;
                            }
                        } catch (Throwable th) {
                            f.n.a.n.i.d0(th);
                            aVar.f8460f.onError(th);
                            return;
                        }
                    } catch (Throwable th2) {
                        f.n.a.n.i.d0(th2);
                        aVar.f8460f.onError(th2);
                        return;
                    }
                }
            } catch (Throwable th3) {
                f.n.a.n.i.d0(th3);
                EmptyDisposable.error(th3, nVar);
            }
        } catch (Throwable th4) {
            f.n.a.n.i.d0(th4);
            EmptyDisposable.error(th4, nVar);
        }
    }
}
