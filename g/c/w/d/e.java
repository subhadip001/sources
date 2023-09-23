package g.c.w.d;

import f.n.a.n.i;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: EmptyCompletableObserver.java */
/* loaded from: classes2.dex */
public final class e extends AtomicReference<g.c.t.b> implements g.c.b, g.c.t.b {
    @Override // g.c.t.b
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // g.c.b
    public void onComplete() {
        lazySet(DisposableHelper.DISPOSED);
    }

    @Override // g.c.b
    public void onError(Throwable th) {
        lazySet(DisposableHelper.DISPOSED);
        i.L(new OnErrorNotImplementedException(th));
    }

    @Override // g.c.b
    public void onSubscribe(g.c.t.b bVar) {
        DisposableHelper.setOnce(this, bVar);
    }
}
