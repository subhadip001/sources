package g.c.w.e.d;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.Objects;

/* compiled from: ObservableSwitchIfEmpty.java */
/* loaded from: classes2.dex */
public final class n<T> extends g.c.w.e.d.a<T, T> {

    /* renamed from: g  reason: collision with root package name */
    public final g.c.m<? extends T> f8473g;

    /* compiled from: ObservableSwitchIfEmpty.java */
    /* loaded from: classes2.dex */
    public static final class a<T> implements g.c.n<T> {

        /* renamed from: f  reason: collision with root package name */
        public final g.c.n<? super T> f8474f;

        /* renamed from: g  reason: collision with root package name */
        public final g.c.m<? extends T> f8475g;

        /* renamed from: i  reason: collision with root package name */
        public boolean f8477i = true;

        /* renamed from: h  reason: collision with root package name */
        public final g.c.w.a.c f8476h = new g.c.w.a.c();

        public a(g.c.n<? super T> nVar, g.c.m<? extends T> mVar) {
            this.f8474f = nVar;
            this.f8475g = mVar;
        }

        @Override // g.c.n
        public void onComplete() {
            if (this.f8477i) {
                this.f8477i = false;
                this.f8475g.a(this);
                return;
            }
            this.f8474f.onComplete();
        }

        @Override // g.c.n
        public void onError(Throwable th) {
            this.f8474f.onError(th);
        }

        @Override // g.c.n
        public void onNext(T t) {
            if (this.f8477i) {
                this.f8477i = false;
            }
            this.f8474f.onNext(t);
        }

        @Override // g.c.n
        public void onSubscribe(g.c.t.b bVar) {
            g.c.w.a.c cVar = this.f8476h;
            Objects.requireNonNull(cVar);
            DisposableHelper.set(cVar, bVar);
        }
    }

    public n(g.c.m<T> mVar, g.c.m<? extends T> mVar2) {
        super(mVar);
        this.f8473g = mVar2;
    }

    @Override // g.c.l
    public void b(g.c.n<? super T> nVar) {
        a aVar = new a(nVar, this.f8473g);
        nVar.onSubscribe(aVar.f8476h);
        this.f8411f.a(aVar);
    }
}
