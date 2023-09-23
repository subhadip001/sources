package g.c.w.h;

import f.n.a.n.i;
import g.c.w.c.g;
import io.reactivex.internal.subscriptions.SubscriptionHelper;

/* compiled from: BasicFuseableConditionalSubscriber.java */
/* loaded from: classes2.dex */
public abstract class a<T, R> implements g.c.w.c.a<T>, g<R> {

    /* renamed from: f  reason: collision with root package name */
    public final g.c.w.c.a<? super R> f8552f;

    /* renamed from: g  reason: collision with root package name */
    public m.c.c f8553g;

    /* renamed from: h  reason: collision with root package name */
    public g<T> f8554h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f8555i;

    /* renamed from: j  reason: collision with root package name */
    public int f8556j;

    public a(g.c.w.c.a<? super R> aVar) {
        this.f8552f = aVar;
    }

    public final void b(Throwable th) {
        i.d0(th);
        this.f8553g.cancel();
        onError(th);
    }

    public final int c(int i2) {
        g<T> gVar = this.f8554h;
        if (gVar == null || (i2 & 4) != 0) {
            return 0;
        }
        int requestFusion = gVar.requestFusion(i2);
        if (requestFusion != 0) {
            this.f8556j = requestFusion;
        }
        return requestFusion;
    }

    @Override // m.c.c
    public void cancel() {
        this.f8553g.cancel();
    }

    @Override // g.c.w.c.j
    public void clear() {
        this.f8554h.clear();
    }

    @Override // g.c.w.c.j
    public boolean isEmpty() {
        return this.f8554h.isEmpty();
    }

    @Override // g.c.w.c.j
    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // m.c.b
    public void onComplete() {
        if (this.f8555i) {
            return;
        }
        this.f8555i = true;
        this.f8552f.onComplete();
    }

    @Override // m.c.b
    public void onError(Throwable th) {
        if (this.f8555i) {
            i.L(th);
            return;
        }
        this.f8555i = true;
        this.f8552f.onError(th);
    }

    @Override // g.c.g, m.c.b
    public final void onSubscribe(m.c.c cVar) {
        if (SubscriptionHelper.validate(this.f8553g, cVar)) {
            this.f8553g = cVar;
            if (cVar instanceof g) {
                this.f8554h = (g) cVar;
            }
            this.f8552f.onSubscribe(this);
        }
    }

    @Override // m.c.c
    public void request(long j2) {
        this.f8553g.request(j2);
    }
}
