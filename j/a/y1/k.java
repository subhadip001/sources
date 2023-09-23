package j.a.y1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: LockFreeTaskQueue.kt */
/* loaded from: classes2.dex */
public class k<E> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_cur");
    private volatile /* synthetic */ Object _cur;

    public k(boolean z) {
        this._cur = new l(8, z);
    }

    public final boolean a(E e2) {
        while (true) {
            l lVar = (l) this._cur;
            int a2 = lVar.a(e2);
            if (a2 == 0) {
                return true;
            }
            if (a2 == 1) {
                a.compareAndSet(this, lVar, lVar.e());
            } else if (a2 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            l lVar = (l) this._cur;
            if (lVar.b()) {
                return;
            }
            a.compareAndSet(this, lVar, lVar.e());
        }
    }

    public final int c() {
        return ((l) this._cur).c();
    }

    public final E d() {
        while (true) {
            l lVar = (l) this._cur;
            E e2 = (E) lVar.f();
            if (e2 != l.f8819h) {
                return e2;
            }
            a.compareAndSet(this, lVar, lVar.e());
        }
    }
}
