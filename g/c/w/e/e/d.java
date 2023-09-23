package g.c.w.e.e;

import f.n.a.n.i;
import g.c.p;
import g.c.q;
import g.c.r;
import g.c.w.d.f;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SingleResumeNext.java */
/* loaded from: classes2.dex */
public final class d<T> extends p<T> {
    public final r<? extends T> a;
    public final g.c.v.d<? super Throwable, ? extends r<? extends T>> b;

    /* compiled from: SingleResumeNext.java */
    /* loaded from: classes2.dex */
    public static final class a<T> extends AtomicReference<g.c.t.b> implements q<T>, g.c.t.b {

        /* renamed from: f  reason: collision with root package name */
        public final q<? super T> f8482f;

        /* renamed from: g  reason: collision with root package name */
        public final g.c.v.d<? super Throwable, ? extends r<? extends T>> f8483g;

        public a(q<? super T> qVar, g.c.v.d<? super Throwable, ? extends r<? extends T>> dVar) {
            this.f8482f = qVar;
            this.f8483g = dVar;
        }

        @Override // g.c.t.b
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // g.c.q
        public void onError(Throwable th) {
            try {
                r<? extends T> apply = this.f8483g.apply(th);
                Objects.requireNonNull(apply, "The nextFunction returned a null SingleSource.");
                apply.b(new f(this, this.f8482f));
            } catch (Throwable th2) {
                i.d0(th2);
                this.f8482f.onError(new CompositeException(th, th2));
            }
        }

        @Override // g.c.q
        public void onSubscribe(g.c.t.b bVar) {
            if (DisposableHelper.setOnce(this, bVar)) {
                this.f8482f.onSubscribe(this);
            }
        }

        @Override // g.c.q
        public void onSuccess(T t) {
            this.f8482f.onSuccess(t);
        }
    }

    public d(r<? extends T> rVar, g.c.v.d<? super Throwable, ? extends r<? extends T>> dVar) {
        this.a = rVar;
        this.b = dVar;
    }

    @Override // g.c.p
    public void d(q<? super T> qVar) {
        this.a.b(new a(qVar, this.b));
    }
}
