package g.c.w.h;

import f.n.a.n.i;
import g.c.g;
import io.reactivex.internal.subscriptions.SubscriptionHelper;

/* compiled from: BasicFuseableSubscriber.java */
/* loaded from: classes2.dex */
public abstract class b<T, R> implements g<T>, g.c.w.c.g<R> {

    /* renamed from: f  reason: collision with root package name */
    public final m.c.b<? super R> f8557f;

    /* renamed from: g  reason: collision with root package name */
    public m.c.c f8558g;

    /* renamed from: h  reason: collision with root package name */
    public g.c.w.c.g<T> f8559h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f8560i;

    /* renamed from: j  reason: collision with root package name */
    public int f8561j;

    public b(m.c.b<? super R> bVar) {
        this.f8557f = bVar;
    }

    public final void b(Throwable th) {
        i.d0(th);
        this.f8558g.cancel();
        onError(th);
    }

    public final int c(int i2) {
        g.c.w.c.g<T> gVar = this.f8559h;
        if (gVar == null || (i2 & 4) != 0) {
            return 0;
        }
        int requestFusion = gVar.requestFusion(i2);
        if (requestFusion != 0) {
            this.f8561j = requestFusion;
        }
        return requestFusion;
    }

    @Override // m.c.c
    public void cancel() {
        this.f8558g.cancel();
    }

    @Override // g.c.w.c.j
    public void clear() {
        this.f8559h.clear();
    }

    @Override // g.c.w.c.j
    public boolean isEmpty() {
        return this.f8559h.isEmpty();
    }

    @Override // g.c.w.c.j
    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // m.c.b
    public void onComplete() {
        if (this.f8560i) {
            return;
        }
        this.f8560i = true;
        this.f8557f.onComplete();
    }

    @Override // m.c.b
    public void onError(Throwable th) {
        if (this.f8560i) {
            i.L(th);
            return;
        }
        this.f8560i = true;
        this.f8557f.onError(th);
    }

    @Override // g.c.g, m.c.b
    public final void onSubscribe(m.c.c cVar) {
        if (SubscriptionHelper.validate(this.f8558g, cVar)) {
            this.f8558g = cVar;
            if (cVar instanceof g.c.w.c.g) {
                this.f8559h = (g.c.w.c.g) cVar;
            }
            this.f8557f.onSubscribe(this);
        }
    }

    @Override // m.c.c
    public void request(long j2) {
        this.f8558g.request(j2);
    }
}
