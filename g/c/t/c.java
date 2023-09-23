package g.c.t;

import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: Incorrect class signature, class is equals to this class: Lg/c/t/c<Ljava/lang/Runnable;>; */
/* compiled from: RunnableDisposable.java */
/* loaded from: classes2.dex */
public final class c extends AtomicReference implements b {
    public c(Runnable runnable) {
        super(runnable);
    }

    public final boolean a() {
        return get() == null;
    }

    @Override // g.c.t.b
    public final void dispose() {
        Object andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        ((Runnable) andSet).run();
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        StringBuilder A = f.a.b.a.a.A("RunnableDisposable(disposed=");
        A.append(a());
        A.append(", ");
        A.append(get());
        A.append(")");
        return A.toString();
    }
}
