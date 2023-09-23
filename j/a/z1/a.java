package j.a.z1;

import j.a.u0;
import j.a.y1.t;
import j.a.z;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: Dispatcher.kt */
/* loaded from: classes2.dex */
public final class a extends u0 implements Executor {

    /* renamed from: g  reason: collision with root package name */
    public static final a f8828g = new a();

    /* renamed from: h  reason: collision with root package name */
    public static final z f8829h;

    static {
        l lVar = l.f8843g;
        int i2 = t.a;
        int b0 = f.n.a.n.i.b0("kotlinx.coroutines.io.parallelism", 64 < i2 ? i2 : 64, 0, 0, 12, null);
        Objects.requireNonNull(lVar);
        if (b0 >= 1) {
            f8829h = new j.a.y1.g(lVar, b0);
            return;
        }
        throw new IllegalArgumentException(f.a.b.a.a.i("Expected positive parallelism level, but got ", b0).toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // j.a.z
    public void d0(i.j.f fVar, Runnable runnable) {
        f8829h.d0(fVar, runnable);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        f8829h.d0(i.j.h.f8623f, runnable);
    }

    @Override // j.a.z
    public String toString() {
        return "Dispatchers.IO";
    }
}
