package j.a;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* compiled from: Builders.common.kt */
/* loaded from: classes2.dex */
public final class j0<T> extends j.a.y1.r<T> {

    /* renamed from: i  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8762i = AtomicIntegerFieldUpdater.newUpdater(j0.class, "_decision");
    private volatile /* synthetic */ int _decision;

    public j0(i.j.f fVar, i.j.d<? super T> dVar) {
        super(fVar, dVar);
        this._decision = 0;
    }

    @Override // j.a.y1.r, j.a.a
    public void Z(Object obj) {
        boolean z;
        while (true) {
            int i2 = this._decision;
            z = false;
            if (i2 == 0) {
                if (f8762i.compareAndSet(this, 0, 2)) {
                    z = true;
                    break;
                }
            } else if (i2 != 1) {
                throw new IllegalStateException("Already resumed".toString());
            }
        }
        if (z) {
            return;
        }
        j.a.y1.f.b(f.n.a.n.i.A(this.f8821h), f.n.a.n.i.P(obj, this.f8821h), null, 2);
    }

    @Override // j.a.y1.r, j.a.g1
    public void c(Object obj) {
        Z(obj);
    }

    public final Object c0() {
        boolean z;
        while (true) {
            int i2 = this._decision;
            z = false;
            if (i2 == 0) {
                if (f8762i.compareAndSet(this, 0, 1)) {
                    z = true;
                    break;
                }
            } else if (i2 != 2) {
                throw new IllegalStateException("Already suspended".toString());
            }
        }
        if (z) {
            return CoroutineSingletons.COROUTINE_SUSPENDED;
        }
        Object a = h1.a(z());
        if (a instanceof r) {
            throw ((r) a).a;
        }
        return a;
    }
}
