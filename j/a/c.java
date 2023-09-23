package j.a;

import java.util.concurrent.locks.LockSupport;

/* compiled from: Builders.kt */
/* loaded from: classes2.dex */
public final class c<T> extends a<T> {

    /* renamed from: h  reason: collision with root package name */
    public final Thread f8735h;

    /* renamed from: i  reason: collision with root package name */
    public final p0 f8736i;

    public c(i.j.f fVar, Thread thread, p0 p0Var) {
        super(fVar, true, true);
        this.f8735h = thread;
        this.f8736i = p0Var;
    }

    @Override // j.a.g1
    public boolean E() {
        return true;
    }

    @Override // j.a.g1
    public void c(Object obj) {
        if (i.l.b.i.a(Thread.currentThread(), this.f8735h)) {
            return;
        }
        LockSupport.unpark(this.f8735h);
    }
}
