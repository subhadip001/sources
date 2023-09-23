package g.c.w.a;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SequentialDisposable.java */
/* loaded from: classes2.dex */
public final class c extends AtomicReference<g.c.t.b> implements g.c.t.b {
    public boolean a() {
        return DisposableHelper.isDisposed(get());
    }

    @Override // g.c.t.b
    public void dispose() {
        DisposableHelper.dispose(this);
    }
}
