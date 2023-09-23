package g.c.w.e.b;

import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.Collection;
import java.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: FlowableToList.java */
/* loaded from: classes2.dex */
public final class t<T, U extends Collection<? super T>> extends g.c.w.e.b.a<T, U> {

    /* renamed from: h  reason: collision with root package name */
    public final Callable<U> f8334h;

    /* compiled from: FlowableToList.java */
    /* loaded from: classes2.dex */
    public static final class a<T, U extends Collection<? super T>> extends g.c.w.i.c<U> implements g.c.g<T>, m.c.c {

        /* renamed from: h  reason: collision with root package name */
        public m.c.c f8335h;

        /* JADX WARN: Multi-variable type inference failed */
        public a(m.c.b<? super U> bVar, U u) {
            super(bVar);
            this.f8573g = u;
        }

        @Override // g.c.w.i.c, m.c.c
        public void cancel() {
            super.cancel();
            this.f8335h.cancel();
        }

        @Override // m.c.b
        public void onComplete() {
            b(this.f8573g);
        }

        @Override // m.c.b
        public void onError(Throwable th) {
            this.f8573g = null;
            this.f8572f.onError(th);
        }

        @Override // m.c.b
        public void onNext(T t) {
            Collection collection = (Collection) this.f8573g;
            if (collection != null) {
                collection.add(t);
            }
        }

        @Override // g.c.g, m.c.b
        public void onSubscribe(m.c.c cVar) {
            if (SubscriptionHelper.validate(this.f8335h, cVar)) {
                this.f8335h = cVar;
                this.f8572f.onSubscribe(this);
                cVar.request(Long.MAX_VALUE);
            }
        }
    }

    public t(g.c.d<T> dVar, Callable<U> callable) {
        super(dVar);
        this.f8334h = callable;
    }

    @Override // g.c.d
    public void e(m.c.b<? super U> bVar) {
        try {
            U call = this.f8334h.call();
            Objects.requireNonNull(call, "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
            this.f8174g.d(new a(bVar, call));
        } catch (Throwable th) {
            f.n.a.n.i.d0(th);
            EmptySubscription.error(th, bVar);
        }
    }
}
