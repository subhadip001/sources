package g.c.w.d;

import g.c.q;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ResumeSingleObserver.java */
/* loaded from: classes2.dex */
public final class f<T> implements q<T> {

    /* renamed from: f  reason: collision with root package name */
    public final AtomicReference<g.c.t.b> f8155f;

    /* renamed from: g  reason: collision with root package name */
    public final q<? super T> f8156g;

    public f(AtomicReference<g.c.t.b> atomicReference, q<? super T> qVar) {
        this.f8155f = atomicReference;
        this.f8156g = qVar;
    }

    @Override // g.c.q
    public void onError(Throwable th) {
        this.f8156g.onError(th);
    }

    @Override // g.c.q
    public void onSubscribe(g.c.t.b bVar) {
        DisposableHelper.replace(this.f8155f, bVar);
    }

    @Override // g.c.q
    public void onSuccess(T t) {
        this.f8156g.onSuccess(t);
    }
}
