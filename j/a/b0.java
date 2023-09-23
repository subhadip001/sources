package j.a;

import java.lang.Thread;
import java.util.List;

/* compiled from: CoroutineExceptionHandlerImpl.kt */
/* loaded from: classes2.dex */
public final class b0 {
    public static final List<a0> a = f.n.a.n.i.f0(f.n.a.n.i.f(defpackage.a.a()));

    public static final void a(i.j.f fVar, Throwable th) {
        Throwable runtimeException;
        for (a0 a0Var : a) {
            try {
                a0Var.handleException(fVar, th);
            } catch (Throwable th2) {
                Thread currentThread = Thread.currentThread();
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = currentThread.getUncaughtExceptionHandler();
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    f.n.a.n.i.d(runtimeException, th);
                }
                uncaughtExceptionHandler.uncaughtException(currentThread, runtimeException);
            }
        }
        Thread currentThread2 = Thread.currentThread();
        try {
            f.n.a.n.i.d(th, new i0(fVar));
        } catch (Throwable th3) {
            f.n.a.n.i.p(th3);
        }
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }
}
