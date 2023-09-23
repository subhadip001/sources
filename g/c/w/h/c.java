package g.c.w.h;

import f.n.a.n.i;
import g.c.g;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: LambdaSubscriber.java */
/* loaded from: classes2.dex */
public final class c<T> extends AtomicReference<m.c.c> implements g<T>, m.c.c, g.c.t.b {

    /* renamed from: f  reason: collision with root package name */
    public final g.c.v.c<? super T> f8562f;

    /* renamed from: g  reason: collision with root package name */
    public final g.c.v.c<? super Throwable> f8563g;

    /* renamed from: h  reason: collision with root package name */
    public final g.c.v.a f8564h;

    /* renamed from: i  reason: collision with root package name */
    public final g.c.v.c<? super m.c.c> f8565i;

    public c(g.c.v.c<? super T> cVar, g.c.v.c<? super Throwable> cVar2, g.c.v.a aVar, g.c.v.c<? super m.c.c> cVar3) {
        this.f8562f = cVar;
        this.f8563g = cVar2;
        this.f8564h = aVar;
        this.f8565i = cVar3;
    }

    public boolean b() {
        return get() == SubscriptionHelper.CANCELLED;
    }

    @Override // m.c.c
    public void cancel() {
        SubscriptionHelper.cancel(this);
    }

    @Override // g.c.t.b
    public void dispose() {
        SubscriptionHelper.cancel(this);
    }

    @Override // m.c.b
    public void onComplete() {
        m.c.c cVar = get();
        SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
        if (cVar != subscriptionHelper) {
            lazySet(subscriptionHelper);
            try {
                this.f8564h.run();
            } catch (Throwable th) {
                i.d0(th);
                i.L(th);
            }
        }
    }

    @Override // m.c.b
    public void onError(Throwable th) {
        m.c.c cVar = get();
        SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
        if (cVar != subscriptionHelper) {
            lazySet(subscriptionHelper);
            try {
                this.f8563g.accept(th);
                return;
            } catch (Throwable th2) {
                i.d0(th2);
                i.L(new CompositeException(th, th2));
                return;
            }
        }
        i.L(th);
    }

    @Override // m.c.b
    public void onNext(T t) {
        if (b()) {
            return;
        }
        try {
            this.f8562f.accept(t);
        } catch (Throwable th) {
            i.d0(th);
            get().cancel();
            onError(th);
        }
    }

    @Override // g.c.g, m.c.b
    public void onSubscribe(m.c.c cVar) {
        if (SubscriptionHelper.setOnce(this, cVar)) {
            try {
                this.f8565i.accept(this);
            } catch (Throwable th) {
                i.d0(th);
                cVar.cancel();
                onError(th);
            }
        }
    }

    @Override // m.c.c
    public void request(long j2) {
        get().request(j2);
    }
}
