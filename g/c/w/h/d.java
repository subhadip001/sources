package g.c.w.h;

import f.n.a.n.i;
import g.c.g;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: StrictSubscriber.java */
/* loaded from: classes2.dex */
public class d<T> extends AtomicInteger implements g<T>, m.c.c {

    /* renamed from: f  reason: collision with root package name */
    public final m.c.b<? super T> f8566f;

    /* renamed from: g  reason: collision with root package name */
    public final g.c.w.j.b f8567g = new g.c.w.j.b();

    /* renamed from: h  reason: collision with root package name */
    public final AtomicLong f8568h = new AtomicLong();

    /* renamed from: i  reason: collision with root package name */
    public final AtomicReference<m.c.c> f8569i = new AtomicReference<>();

    /* renamed from: j  reason: collision with root package name */
    public final AtomicBoolean f8570j = new AtomicBoolean();

    /* renamed from: k  reason: collision with root package name */
    public volatile boolean f8571k;

    public d(m.c.b<? super T> bVar) {
        this.f8566f = bVar;
    }

    @Override // m.c.c
    public void cancel() {
        if (this.f8571k) {
            return;
        }
        SubscriptionHelper.cancel(this.f8569i);
    }

    @Override // m.c.b
    public void onComplete() {
        this.f8571k = true;
        m.c.b<? super T> bVar = this.f8566f;
        g.c.w.j.b bVar2 = this.f8567g;
        if (getAndIncrement() == 0) {
            Throwable b = g.c.w.j.d.b(bVar2);
            if (b != null) {
                bVar.onError(b);
            } else {
                bVar.onComplete();
            }
        }
    }

    @Override // m.c.b
    public void onError(Throwable th) {
        this.f8571k = true;
        m.c.b<? super T> bVar = this.f8566f;
        g.c.w.j.b bVar2 = this.f8567g;
        if (g.c.w.j.d.a(bVar2, th)) {
            if (getAndIncrement() == 0) {
                bVar.onError(g.c.w.j.d.b(bVar2));
                return;
            }
            return;
        }
        i.L(th);
    }

    @Override // m.c.b
    public void onNext(T t) {
        m.c.b<? super T> bVar = this.f8566f;
        g.c.w.j.b bVar2 = this.f8567g;
        if (get() == 0 && compareAndSet(0, 1)) {
            bVar.onNext(t);
            if (decrementAndGet() != 0) {
                Throwable b = g.c.w.j.d.b(bVar2);
                if (b != null) {
                    bVar.onError(b);
                } else {
                    bVar.onComplete();
                }
            }
        }
    }

    @Override // g.c.g, m.c.b
    public void onSubscribe(m.c.c cVar) {
        if (this.f8570j.compareAndSet(false, true)) {
            this.f8566f.onSubscribe(this);
            SubscriptionHelper.deferredSetOnce(this.f8569i, this.f8568h, cVar);
            return;
        }
        cVar.cancel();
        cancel();
        onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
    }

    @Override // m.c.c
    public void request(long j2) {
        if (j2 <= 0) {
            cancel();
            onError(new IllegalArgumentException(f.a.b.a.a.l("§3.9 violated: positive request amount required but it was ", j2)));
            return;
        }
        SubscriptionHelper.deferredRequest(this.f8569i, this.f8568h, j2);
    }
}
