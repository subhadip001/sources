package g.c.w.e.b;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.NoSuchElementException;

/* compiled from: FlowableElementAt.java */
/* loaded from: classes2.dex */
public final class e<T> extends g.c.w.e.b.a<T, T> {

    /* renamed from: h  reason: collision with root package name */
    public final long f8212h;

    /* renamed from: i  reason: collision with root package name */
    public final T f8213i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f8214j;

    /* compiled from: FlowableElementAt.java */
    /* loaded from: classes2.dex */
    public static final class a<T> extends g.c.w.i.c<T> implements g.c.g<T> {

        /* renamed from: h  reason: collision with root package name */
        public final long f8215h;

        /* renamed from: i  reason: collision with root package name */
        public final T f8216i;

        /* renamed from: j  reason: collision with root package name */
        public final boolean f8217j;

        /* renamed from: k  reason: collision with root package name */
        public m.c.c f8218k;

        /* renamed from: l  reason: collision with root package name */
        public long f8219l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f8220m;

        public a(m.c.b<? super T> bVar, long j2, T t, boolean z) {
            super(bVar);
            this.f8215h = j2;
            this.f8216i = t;
            this.f8217j = z;
        }

        @Override // g.c.w.i.c, m.c.c
        public void cancel() {
            super.cancel();
            this.f8218k.cancel();
        }

        @Override // m.c.b
        public void onComplete() {
            if (this.f8220m) {
                return;
            }
            this.f8220m = true;
            T t = this.f8216i;
            if (t == null) {
                if (this.f8217j) {
                    this.f8572f.onError(new NoSuchElementException());
                    return;
                } else {
                    this.f8572f.onComplete();
                    return;
                }
            }
            b(t);
        }

        @Override // m.c.b
        public void onError(Throwable th) {
            if (this.f8220m) {
                f.n.a.n.i.L(th);
                return;
            }
            this.f8220m = true;
            this.f8572f.onError(th);
        }

        @Override // m.c.b
        public void onNext(T t) {
            if (this.f8220m) {
                return;
            }
            long j2 = this.f8219l;
            if (j2 == this.f8215h) {
                this.f8220m = true;
                this.f8218k.cancel();
                b(t);
                return;
            }
            this.f8219l = j2 + 1;
        }

        @Override // g.c.g, m.c.b
        public void onSubscribe(m.c.c cVar) {
            if (SubscriptionHelper.validate(this.f8218k, cVar)) {
                this.f8218k = cVar;
                this.f8572f.onSubscribe(this);
                cVar.request(Long.MAX_VALUE);
            }
        }
    }

    public e(g.c.d<T> dVar, long j2, T t, boolean z) {
        super(dVar);
        this.f8212h = j2;
        this.f8213i = null;
        this.f8214j = z;
    }

    @Override // g.c.d
    public void e(m.c.b<? super T> bVar) {
        this.f8174g.d(new a(bVar, this.f8212h, this.f8213i, this.f8214j));
    }
}
